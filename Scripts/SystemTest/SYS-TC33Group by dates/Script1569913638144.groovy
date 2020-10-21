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
//WebUI.setViewPortSize(1200, 1400)
//WebUI.setViewPortSize(703, 347)
//Navigate to URL and login into kanvas
CustomKeywords.'com.test.demo.KanvasLoginCustomFunctions.KLoginSYSTST'()
//Click on Side Menu
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/sidebar-Menu button'))
WebUI.delay(5)
//Navigate to Workspaces
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/navigate to ws'))
WebUI.delay(5)
//Load Workspace
WebUI.click(findTestObject('Object Repository/Final Objects/LoadWSfromWSmodule/loadWS'))
WebUI.delay(10)
//scrollto element
WebUI.scrollToElement(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/dateattr'),10)
//Click on date attribute
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/dateattr'))
//Open calendar
WebUI.scrollToElement(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/opencalendar'),10)
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/opencalendar'))
WebUI.delay(5)
//Click on 1st date of calendar
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/date1'))
//Click on 15th date of calendar
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/date15'))
WebUI.delay(5)
///Set date selection
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/setdate'))
//set one more date filters
WebUI.scrollToElement(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/opencalendar'),10)
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/opencalendar'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/date16'))
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/date28'))
//Set date selection
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/setdate'))
//Apply filters
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()
WebUI.delay(5)
//Click on Result controlmenu
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/MainButns/ResultControlMenu'),10)
WebUI.delay(5)
WebUI.verifyElementPresent(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/grpbydate'),10)
WebUI.delay(5)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/grpbydate'),10)
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/Result control Apply Button'))
//Compare expected and actual itemcount
 expected = WebUI.verifyElementPresent(findTestObject('Final Objects/Validation Objects/Expected/SystemTest/SYS-TC33-EIC'), 10,
	 FailureHandling.CONTINUE_ON_FAILURE)
 
 actual = WebUI.getText(findTestObject('Final Objects/Validation Objects/Actual/ActualItemCnt'))
 
 CustomKeywords.'com.test.demo.MySelectionCustomFunctions.CompareItemCnt'(expected, actual)
 //Verify tooltip info present  and click on tooltip info
 WebUI.verifyElementPresent(findTestObject('Object Repository/Final Objects/MySelection/MainButns/TooltipInfo'), 10)
 CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ClickInfoBtn'()
 WebUI.delay(5)
 //Compare expected and actual tooltip info
 tiexpected = WebUI.verifyElementPresent(findTestObject('Object Repository/Final Objects/Validation Objects/Expected/SystemTest/SYS-TC33- EFI'), 10,
	 FailureHandling.CONTINUE_ON_FAILURE)
 
 tiactual = WebUI.getText(findTestObject('Final Objects/Validation Objects/Actual/ActualFilterInfo'))
 
 log.logInfo(tiactual)
 
 CustomKeywords.'com.test.demo.MySelectionCustomFunctions.CompareTooltipInfo'(tiexpected, tiactual)
 
 //Close browser
//WebUI.closeBrowser()