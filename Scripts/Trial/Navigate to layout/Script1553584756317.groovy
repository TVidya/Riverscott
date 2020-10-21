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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.eclipse.jetty.client.ContinueProtocolHandler.ContinueListener as ContinueListener
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
//Navigate to URL and login into kanvas
//Switch to My Selection
//Switch to layout
//Select template
//Switch to export
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

KeywordLogger log = new KeywordLogger()

WebUI.openBrowser(null)

CustomKeywords.'com.test.demo.KanvasLoginCustomFunctions.KLogin'()

WebUI.click(findTestObject('Final Objects/Dashboard/img'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/Layout/Main Buttons/navlayout'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/layout/Page_SLICeR Kanvas - Layout/img_demotemp (A4)_templateDP'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/Layout/Main Buttons/a_Export'))

WebUI.click(findTestObject('Object Repository/layout/Page_SLICeR Kanvas - Layout/a_Current Template'))

WebUI.delay(5)

WebUI.setText(findTestObject('Final Objects/Layout/Main Buttons/exportfilename'), 'katalon')

WebUI.click(findTestObject('Final Objects/Layout/Main Buttons/button_OK'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/Layout/Main Buttons/button_PDF'))

