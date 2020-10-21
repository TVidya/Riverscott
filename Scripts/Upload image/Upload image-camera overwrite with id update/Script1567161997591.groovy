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
WebUI.click(findTestObject('Object Repository/Final Objects/Dashboard/span_glyphicon glyphicon-optio'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/Upload/navigatetoupload'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/Upload/uploadcamera'))

WebUI.delay(5)

ed()

WebUI.delay(10)

//WebUI.click(findTestObject('21-may/selectsupcode'))
//WebUI.delay(5)
//WebUI.click(findTestObject('21-may/Page_SLICeR Kanvas - Upload Images and Data/div_AJB KA1'))
//WebUI.delay(5)
WebUI.click(findTestObject('Final Objects/Upload/uploadbtnincamerawin'))

WebUI.delay(10)

if (WebUI.waitForElementVisible(findTestObject('Final Objects/Upload/Saveinuploads'), 60) == true) {
    WebUI.click(findTestObject('Final Objects/Upload/Saveinuploads'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Final Objects/Upload/upload-proceed' /*if(WebUI.verifyElementPresent(findTestObject('Object Repository/14-may/Upload/Dulicateimagechkbox'))
	{
	   WebUI.click(findTestObject('Object Repository/14-may/Upload/Dulicateimagechkbox'))
	}*/ ))
} else {
    log.logInfo('not found save button')
}

/*WebUI.delay(10)

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.click(findTestObject('21-may/uploadcamera'))

WebUI.delay(5)

sd()

WebUI.delay(10)

//WebUI.click(findTestObject('21-may/selectsupcode'))
//WebUI.delay(5)
//WebUI.click(findTestObject('21-may/Page_SLICeR Kanvas - Upload Images and Data/div_AJB KA1'))
//WebUI.delay(5)
WebUI.click(findTestObject('21-may/uploadbtnincamerawin'))

WebUI.delay(10)

if (WebUI.waitForElementVisible(findTestObject('Object Repository/14-may/Upload/Saveinuploads'), 60) == true) {
    WebUI.click(findTestObject('Object Repository/14-may/Upload/Saveinuploads'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/14-may/Upload/upload-proceed'))
} else {
    log.logInfo('not found save button')
}*/
WebUI.delay(10)

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/Upload/uploadcamera'))

fd()

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Final Objects/Upload/itemidcamera'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Final Objects/Upload/itemidcamera'), Keys.chord(Keys.BACK_SPACE))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Final Objects/Upload/itemidcamera'), 'BLG123')

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/Upload/uploadbtnincamerawin'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/Upload/label_concat(Choose what to do with duplicates and let  s get them loaded in)_lbl_cls'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/Upload/btn-overwrite'))

WebUI.delay(10)

if (WebUI.waitForElementVisible(findTestObject('Final Objects/Upload/Saveinuploads'), 60) == true) {
    WebUI.click(findTestObject('Final Objects/Upload/Saveinuploads'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Final Objects/Upload/upload-proceed' /*if(WebUI.verifyElementPresent(findTestObject('Object Repository/14-may/Upload/Dulicateimagechkbox'))
	{
	   WebUI.click(findTestObject('Object Repository/14-may/Upload/Dulicateimagechkbox'))
	}*/ ))
} else {
    log.logInfo('not found save button')
}

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Final Objects/Dashboard/span_glyphicon glyphicon-optio'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/a_MY SELECTION'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/i_Y Axis_reset-icon-lg-grey'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/Click_search'))

WebUI.delay(5)

WebUI.click(findTestObject('My selection/search/span_Search Global_outer'))

WebUI.delay(5)

WebUI.setText(findTestObject('Final Objects/MySelection/Search/input_Search In Result_search-box'), 'BLG123')

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/button_Search'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/Page_SLICeR Kanvas - My Selection/button_Search In Result_closeSearch close close-icon-lg-blue'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

def ed() {
    Runtime runtime = Runtime.getRuntime()

    Process process = runtime.exec('D:\\cameraupload-Idupdate-initial.exe')

    Thread.sleep(10000)
}

def sd() {
    Runtime runtime = Runtime.getRuntime()

    Process process = runtime.exec('D:\\cameraupload-Idupdate-next id.exe')

    Thread.sleep(10000)
}

def fd() {
    Runtime runtime = Runtime.getRuntime()

    Process process = runtime.exec('D:\\cameraupload-Idupdate-update id.exe')

    Thread.sleep(10000)
}

