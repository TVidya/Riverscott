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
WebUI.click(findTestObject('Object Repository/Final Objects/LoadWSfromWSmodule/navigate to ws'))
WebUI.delay(5)
//Click on share workspace
WebUI.click(findTestObject('Object Repository/Final Objects/LoadWSfromWSmodule/SYS-TC41'))
WebUI.delay(5)
//Edit permissions
//WebUI.scrollToElement(findTestObject('Object Repository/Final Objects/LoadWSfromWSmodule/kat17-edit'), 10)
//CustomKeywords.'com.test.demo.KanvasLoginCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/LoadWSfromWSmodule/kat17-edit'),10)
WebUI.check(findTestObject('Object Repository/Final Objects/LoadWSfromWSmodule/annu-edit'))
WebUI.delay(5)
//View permissions
//WebUI.scrollToElement(findTestObject('Object Repository/Final Objects/LoadWSfromWSmodule/kat18-view'), 10)
WebUI.check(findTestObject('Object Repository/Final Objects/LoadWSfromWSmodule/ayush-view'))
WebUI.delay(5)
//Share workspaces
WebUI.click(findTestObject('Object Repository/Final Objects/LoadWSfromWSmodule/WSshareBtn'))
WebUI.delay(5)
//Ok btn on confirmMsg
WebUI.click(findTestObject('Object Repository/Final Objects/LoadWSfromWSmodule/shareconfirmBtn'))
WebUI.delay(5)
//Close browser
WebUI.closeBrowser()







