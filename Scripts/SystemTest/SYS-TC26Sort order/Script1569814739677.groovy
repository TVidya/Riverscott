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
import com.kms.katalon.core.configuration.RunConfiguration

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
WebUI.click(findTestObject('Object Repository/Final Objects/LoadWSfromWSmodule/navigate to ws'))
WebUI.delay(5)
//click on workpsace
WebUI.scrollToElement(findTestObject('Object Repository/Final Objects/ListofWS/WS-1157802-66'), 10)
WebUI.click(findTestObject('Object Repository/Final Objects/ListofWS/WS-1157802-66'))

/*
//Click on kanvaslogo
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/kanvaslogo'))
WebUI.delay(5)
//Click on username for dropdown menu
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/USeRdropdwnMenu'))
WebUI.delay(5)
//Click on 'Restore Workspace'
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/a_Restore Workspace'))
WebUI.delay(5)
//Click on recent loaded Workspace
WebUI.click(findTestObject('Object Repository/Final Objects/ListofWS/WS-1441001-15'))
WebUI.delay(5)
*/
//Click on Sort control
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/MainButns/li_Attributes_statSortBtns'),
	5)
WebUI.delay(10)
//Apply Ascending order on measure 8weekscheck
msrDes = findTestObject('Object Repository/Final Objects/MySelection/Measures/SortOrders/8weeksCheckDescend')
msrAsc = findTestObject('Object Repository/Final Objects/MySelection/Measures/SortOrders/8weeksCheck-Ascend')
msrDis = findTestObject('Object Repository/Final Objects/MySelection/Measures/SortOrders/8weeksCheck-disable')
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.SortOrderAscend'(msrDes,msrAsc,msrDis)
//Click on main apply button
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()
WebUI.delay(5)
//Close browser
WebUI.closeBrowser()
