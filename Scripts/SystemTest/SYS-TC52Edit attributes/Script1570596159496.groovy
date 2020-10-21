import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.stringtemplate.v4.compiler.STParser.ifstat_return as ifstat_return
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.keyword.builtin.VerifyMatchKeyword as VerifyMatchKeyword
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
//import com.kms.katalon.core.webui.key
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.eclipse.jetty.client.ContinueProtocolHandler.ContinueListener as ContinueListener
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

KeywordLogger log = new KeywordLogger()

WebUI.openBrowser(null)
WebUI.setViewPortSize(1200, 1400)
//Navigate to URL and login into kanvas
CustomKeywords.'com.test.demo.KanvasLoginCustomFunctions.KLoginSYSTST'()
//Click on Side Menu
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/sidebar-Menu button'))
WebUI.delay(5)
//Navigate to Workspaces
WebUI.click(findTestObject('Object Repository/Final Objects/LoadWSfromWSmodule/navigate to ws'))
WebUI.delay(5)
//Load Workspace
WebUI.click(findTestObject('Object Repository/Final Objects/LoadWSfromWSmodule/loadWS'))
WebUI.delay(10)
//Search item
//Click on search icon
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Search/Click_search'))
WebUI.delay(5)
//Click on search with in the results
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Search/label_Search In Result'))
WebUI.delay(5)
//Set keyword in the input box
WebUI.setText(findTestObject('Object Repository/Final Objects/MySelection/Search/input_Search In Result_search-box'), 'BG4601')
WebUI.delay(5)
//Click on search button
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Search/button_Search'))
WebUI.delay(5)
//Close search window
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Search/CloseBtnSearchWindow'))
WebUI.delay(5)
//Click on item id
WebUI.click(findTestObject('Object Repository/Final Objects/ItemWindow/openIWBG4601'))
WebUI.delay(5)
//Edit attribute
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Editattr/Editattrfeatures'))
WebUI.delay(5)
//Scroll to Brand attribute
WebUI.scrollToElement(findTestObject('Object Repository/Final Objects/MySelection/Editattr/attrdropdown'),10)
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Editattr/attrdropdown'))
WebUI.delay(5)
//Set 'AUDREY' value to brand
WebUI.setText(findTestObject('Object Repository/Final Objects/MySelection/Editattr/inputsearch'),'AUDREY')
WebUI.sendKeys(findTestObject('Object Repository/Final Objects/MySelection/Editattr/inputsearch'), Keys.chord(Keys.ENTER))
WebUI.delay(5)
//Save edited attribute values
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Editattr/saveeditattr'))
WebUI.delay(5)
//Condition to check save successful msg
if(WebUI.verifyElementPresent(findTestObject('Object Repository/Final Objects/MySelection/Editattr/successmsg'),10,FailureHandling.OPTIONAL))
{
	WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Editattr/confirmmsgOk'))
	
}
else
{
	WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Editattr/closeitemwindow'))
}

//Close browser
WebUI.closeBrowser()
