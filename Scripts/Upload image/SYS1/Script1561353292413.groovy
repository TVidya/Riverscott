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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.eclipse.jetty.client.ContinueProtocolHandler.ContinueListener as ContinueListener
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

KeywordLogger log = new KeywordLogger()

WebUI.openBrowser(null)

//Navigate to URL and login into kanvas
CustomKeywords.'com.test.demo.KanvasLoginCustomFunctions.KLogin'()

//Switch to My Selection
//WebUI.click(findTestObject('Object Repository/Final objects/MySelection/MainButns/i_maximize-myselection'))
WebUI.click(findTestObject('Object Repository/Final Objects/Dashboard/span_glyphicon glyphicon-optio'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/Upload/navigatetoupload'))

WebUI.delay(20)

WebUI.delay(20)

//WebUI.click(findTestObject('Object Repository/14-may/Upload/selectwindow'))
//Sel = WebUI.click(findTestObject('Object Repository/14-may/Upload/selectwindow'))
CustomKeywords.'com.test.demo.UploadCustomFunctions.uploadfile'(findTestObject('Final Objects/Upload/selectwindow'), 'C:\\PSH5171.jpg')

if (WebUI.waitForElementVisible(findTestObject('Object Repository/14-may/Upload/Saveinuploads'), 60) == true) {
    WebUI.click(findTestObject('Object Repository/14-may/Upload/Saveinuploads'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/14-may/Upload/upload-proceed') /*if(WebUI.verifyElementPresent(findTestObject('Object Repository/14-may/Upload/Dulicateimagechkbox'))
	{
	   WebUI.click(findTestObject('Object Repository/14-may/Upload/Dulicateimagechkbox'))
	}*/ )
} else {
    log.logInfo('not found save button')
}

