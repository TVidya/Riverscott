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

WebUI.click(findTestObject('Final Objects/Upload/button_External Link'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Objects/Upload/URL_INPUT'), 'ftp://180.179.52.197/GBCD.zip')

WebUI.delay(2)

WebUI.click(findTestObject('Final Objects/Upload/input_Enter User Name_username'))

WebUI.delay(10)

if (WebUI.verifyTextPresent('kanvasftp', true, FailureHandling.OPTIONAL)) {
    WebUI.setText(findTestObject('Final Objects/Upload/input_Username_encPass'), 'KanvasFiles')
} else {
    WebUI.setText(findTestObject('Final Objects/Upload/input_Enter User Name_username'), 'kanvasftp')

    WebUI.delay(2)

    WebUI.setText(findTestObject('Final Objects/Upload/input_Enter Password_password'), 'KanvasFiles')
}

WebUI.delay(2)

//WebUI.setText(findTestObject('upload/Page_SLICeR Kanvas - Upload Images and Data/input_Enter Password_password'), 'KanvasFiles')
WebUI.delay(2)

WebUI.click(findTestObject('Final Objects/Upload/button_Submit'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Objects/Upload/button_Yes Lets Proceed'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/Upload/button_OK'))

WebUI.delay(5)

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Final Objects/Upload/button_Local Drive'))

WebUI.delay(5)

cd()

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/Upload/button_Yes I have checked the files Lets Proceed'))

WebUI.delay(5)

WebUI.setText(findTestObject('Final Objects/Upload/Upload_input_texttag'), 'uploadzipimg')

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/Upload/savebtnindefaultimgwin'))

WebUI.delay(20)

WebUI.click(findTestObject('Final Objects/Upload/zipuploadokbtn'))

WebUI.delay(2)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Final Objects/Dashboard/span_glyphicon glyphicon-optio'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/a_MY SELECTION'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/i_Y Axis_reset-icon-lg-grey'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/Click_search'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/span_Search Global_outer'))

WebUI.delay(5)

WebUI.setText(findTestObject('Final Objects/MySelection/Search/input_Search In Result_search-box'), 'BBCD')

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/button_Search'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/CloseBtnSearchWindow'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/MySelection/Settings/span_Welcome kat64cid008.com_caret'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Settings/a_Settings'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Settings/a_Admin Settings'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Settings/a_System Configuration'))

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Settings/label_Overwrite'), 
    5)

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Settings/button_Update'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Settings/button_OK'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Final Objects/Dashboard/span_glyphicon glyphicon-optio'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/Upload/navigatetoupload'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Objects/Upload/button_External Link'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Objects/Upload/URL_INPUT'), 'ftp://180.179.52.197/DBCD-overwrite.zip')

WebUI.delay(2)

WebUI.click(findTestObject('Final Objects/Upload/input_Enter User Name_username'))

WebUI.delay(10)

if (WebUI.verifyTextPresent('kanvasftp', true, FailureHandling.OPTIONAL)) {
    WebUI.setText(findTestObject('Final Objects/Upload/input_Username_encPass'), 'KanvasFiles')
} else {
    WebUI.setText(findTestObject('Final Objects/Upload/input_Enter User Name_username'), 'kanvasftp')

    WebUI.delay(2)

    WebUI.setText(findTestObject('Final Objects/Upload/input_Enter Password_password'), 'KanvasFiles')
}

WebUI.delay(2)

//WebUI.setText(findTestObject('upload/Page_SLICeR Kanvas - Upload Images and Data/input_Enter Password_password'), 'KanvasFiles')
WebUI.delay(2)

WebUI.click(findTestObject('Final Objects/Upload/button_Submit'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Objects/Upload/button_Yes Lets Proceed'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/Upload/button_OK'))

WebUI.delay(5)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Final Objects/Dashboard/span_glyphicon glyphicon-optio'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/a_MY SELECTION'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/i_Y Axis_reset-icon-lg-grey'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/Click_search'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/span_Search Global_outer'))

WebUI.delay(5)

WebUI.setText(findTestObject('Final Objects/MySelection/Search/input_Search In Result_search-box'), 'CHF1')

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/button_Search'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/CloseBtnSearchWindow'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Final Objects/Dashboard/span_glyphicon glyphicon-optio'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/Upload/navigatetoupload'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Objects/Upload/button_Local Drive'))

WebUI.delay(5)

dd()

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/Upload/button_Yes I have checked the files Lets Proceed'))

WebUI.delay(5)

WebUI.setText(findTestObject('Final Objects/Upload/Upload_input_texttag'), 'uploadzipimg')

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/Upload/savebtnindefaultimgwin'))

WebUI.delay(20)

WebUI.click(findTestObject('Final Objects/Upload/zipuploadokbtn'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Objects/MySelection/Settings/span_Welcome kat64cid008.com_caret'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Settings/a_Settings'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Settings/a_Admin Settings'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Settings/a_System Configuration'))

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('My selection/Settings/Page_SLICeR Kanvas - Settings/label_Skip'), 
    5)

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Settings/button_Update'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Settings/button_OK'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Final Objects/Dashboard/span_glyphicon glyphicon-optio'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/Upload/navigatetoupload'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Objects/Upload/button_External Link'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Objects/Upload/URL_INPUT'), 'ftp://180.179.52.197/GBCD-SKIP.zip')

WebUI.delay(2)

WebUI.click(findTestObject('Final Objects/Upload/input_Enter User Name_username'))

WebUI.delay(10)

if (WebUI.verifyTextPresent('kanvasftp', true, FailureHandling.OPTIONAL)) {
    WebUI.setText(findTestObject('Final Objects/Upload/input_Username_encPass'), 'KanvasFiles')
} else {
    WebUI.setText(findTestObject('Final Objects/Upload/input_Enter User Name_username'), 'kanvasftp')

    WebUI.delay(2)

    WebUI.setText(findTestObject('Final Objects/Upload/input_Enter Password_password'), 'KanvasFiles')
}

WebUI.delay(2)

//WebUI.setText(findTestObject('upload/Page_SLICeR Kanvas - Upload Images and Data/input_Enter Password_password'), 'KanvasFiles')
WebUI.delay(2)

WebUI.click(findTestObject('Final Objects/Upload/button_Submit'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Objects/Upload/button_Yes Lets Proceed'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/Upload/button_OK'))

WebUI.delay(5)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Final Objects/Dashboard/span_glyphicon glyphicon-optio'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/a_MY SELECTION'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/i_Y Axis_reset-icon-lg-grey'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/Click_search'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/span_Search Global_outer'))

WebUI.delay(5)

WebUI.setText(findTestObject('Final Objects/MySelection/Search/input_Search In Result_search-box'), 'CHF1')

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/button_Search'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/CloseBtnSearchWindow'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Final Objects/Dashboard/span_glyphicon glyphicon-optio'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/Upload/navigatetoupload'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Objects/Upload/button_Local Drive'))

WebUI.delay(5)

ed()

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/Upload/button_Yes I have checked the files Lets Proceed'))

WebUI.delay(5)

WebUI.setText(findTestObject('Final Objects/Upload/Upload_input_texttag'), 'uploadzipimg')

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/Upload/savebtnindefaultimgwin'))

WebUI.delay(20)

WebUI.click(findTestObject('Final Objects/Upload/zipuploadokbtn'))

WebUI.delay(2)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Final Objects/Dashboard/span_glyphicon glyphicon-optio'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/a_MY SELECTION'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/i_Y Axis_reset-icon-lg-grey'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/Click_search'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/span_Search Global_outer'))

WebUI.delay(5)

WebUI.setText(findTestObject('Final Objects/MySelection/Search/input_Search In Result_search-box'), 'BBCD')

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/button_Search'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/CloseBtnSearchWindow'))

WebUI.delay(10)

WebUI.delay(2)

WebUI.click(findTestObject('Final Objects/MySelection/Settings/span_Welcome kat64cid008.com_caret'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Settings/a_Settings'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Settings/a_Admin Settings'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Settings/a_System Configuration'))

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Settings/label_Append'), 
    5)

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Settings/button_Update'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Settings/button_OK'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Final Objects/Dashboard/span_glyphicon glyphicon-optio'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/Upload/navigatetoupload'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Objects/Upload/button_External Link'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Objects/Upload/URL_INPUT'), 'ftp://180.179.52.197/GBCD-append.zip')

WebUI.delay(2)

WebUI.click(findTestObject('Final Objects/Upload/input_Enter User Name_username'))

WebUI.delay(10)

if (WebUI.verifyTextPresent('kanvasftp', true, FailureHandling.OPTIONAL)) {
    WebUI.setText(findTestObject('Final Objects/Upload/input_Username_encPass'), 'KanvasFiles')
} else {
    WebUI.setText(findTestObject('Final Objects/Upload/input_Enter User Name_username'), 'kanvasftp')

    WebUI.delay(2)

    WebUI.setText(findTestObject('Final Objects/Upload/input_Enter Password_password'), 'KanvasFiles')
}

WebUI.delay(2)

//WebUI.setText(findTestObject('upload/Page_SLICeR Kanvas - Upload Images and Data/input_Enter Password_password'), 'KanvasFiles')
WebUI.delay(2)

WebUI.click(findTestObject('Final Objects/Upload/button_Submit'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Objects/Upload/button_Yes Lets Proceed'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/Upload/button_OK'))

WebUI.delay(5)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Final Objects/Dashboard/span_glyphicon glyphicon-optio'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/a_MY SELECTION'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/i_Y Axis_reset-icon-lg-grey'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/Click_search'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/span_Search Global_outer'))

WebUI.delay(5)

WebUI.setText(findTestObject('Final Objects/MySelection/Search/input_Search In Result_search-box'), 'CHF1')

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/button_Search'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/CloseBtnSearchWindow'))

WebUI.delay(10)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Final Objects/Dashboard/span_glyphicon glyphicon-optio'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/Upload/navigatetoupload'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Objects/Upload/button_Local Drive'))

WebUI.delay(5)

fd()

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/Upload/button_Yes I have checked the files Lets Proceed'))

WebUI.delay(5)

WebUI.setText(findTestObject('Final Objects/MySelection/Tags/Upload_input_texttag'), 'uploadzipimg')

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/Upload/savebtnindefaultimgwin1'))

WebUI.delay(20)

WebUI.click(findTestObject('Final Objects/Upload/zipuploadokbtn'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Final Objects/Dashboard/span_glyphicon glyphicon-optio'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/a_MY SELECTION'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/i_Y Axis_reset-icon-lg-grey'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/Click_search'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/span_Search Global_outer'))

WebUI.delay(5)

WebUI.setText(findTestObject('Final Objects/MySelection/Search/input_Search In Result_search-box'), 'BBCD')

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/button_Search'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/CloseBtnSearchWindow'))

WebUI.delay(20)

WebUI.click(findTestObject('Final Objects/MySelection/Search/i_Y Axis_reset-icon-lg-grey'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/Click_search'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/span_Search Global_outer'))

WebUI.delay(5)

WebUI.setText(findTestObject('Final Objects/MySelection/Search/input_Search In Result_search-box'), 'CHF1')

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/button_Search'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/CloseBtnSearchWindow'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

def fd() {
    Runtime runtime = Runtime.getRuntime()

    Process process = runtime.exec('D:\\zip-Append.exe')

    Thread.sleep(5000)
}

def dd() {
    Runtime runtime = Runtime.getRuntime()

    Process process = runtime.exec('D:\\zip-Overwrite.exe')

    Thread.sleep(5000)
}

def ed() {
    Runtime runtime = Runtime.getRuntime()

    Process process = runtime.exec('D:\\zip-Skip.exe')

    Thread.sleep(5000)
}

def cd() {
    Runtime runtime = Runtime.getRuntime()

    Process process = runtime.exec('D:\\Initial-Zip2.exe')

    Thread.sleep(10000)
}

