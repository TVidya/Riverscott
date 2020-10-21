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
CustomKeywords.'com.test.demo.KanvasLoginCID010CustomFunctions.KLogin'()

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Final Objects/Dashboard/span_glyphicon glyphicon-optio'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/a_MY SELECTION'))

WebUI.delay(10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ResetAllFlts'()

WebUI.delay(10)

//scroll and click on attribute using keyword
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/div_brand'), 
    10)

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/li_ANNE KLIEN'), 
    10)

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/Click_search'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/label_Search In Result'))

WebUI.delay(5)

WebUI.setText(findTestObject('Final Objects/MySelection/Search/input_Search In Result_search-box'), 'BG4551')

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/button_Search'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/CloseBtnSearchWindow'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/MySelection/Search/CID010-BG4551'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/MySelection/Search/span_Text'))

WebUI.delay(10)

//WebUI.verifyElementPresent(findTestObject('22 july/Page_SLICeR Kanvas - My Selection/div_2. brandANNE KLIEN'), 5)
WebUI.verifyTextPresent('ANNE KLIEN', false)

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/MySelection/Search/i_Apply_close close-icon-lg-blue'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Final Objects/Dashboard/span_glyphicon glyphicon-optio'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/Upload/navigatetoupload'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/Upload/Manual_upload_button'))

ed()

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

WebUI.delay(300)

WebUI.click(findTestObject('Object Repository/Final Objects/Dashboard/span_glyphicon glyphicon-optio'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/a_MY SELECTION'))

WebUI.delay(10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ResetAllFlts'()

WebUI.delay(10)

//scroll and click on attribute using keyword
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/div_brand'), 
    10)

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/li_ADIDAS'), 
    10)

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/Click_search'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/label_Search In Result'))

WebUI.delay(5)

WebUI.setText(findTestObject('Final Objects/MySelection/Search/input_Search In Result_search-box'), 'BG4551')

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/button_Search'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Search/CloseBtnSearchWindow'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/MySelection/Search/CID010-BG4551'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/MySelection/Search/span_Text'))

WebUI.delay(10)

//WebUI.verifyElementPresent(findTestObject('22 july/Page_SLICeR Kanvas - My Selection/div_2. brandANNE KLIEN'), 5)
WebUI.verifyTextPresent('ADIDAS', false)

WebUI.delay(10)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

def ed() {
    Runtime runtime = Runtime.getRuntime()

    Process process = runtime.exec('D:\\Updatemaster.exe')

    Thread.sleep(10000)
}

