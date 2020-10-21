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

//Navigate to URL and login into kanvas
CustomKeywords.'com.test.demo.KanvasLoginCustomFunctions.KLogin'()

//Switch to My Selection
WebUI.click(findTestObject('Object Repository/Final objects/MySelection/MainButns/i_maximize-myselection'))

WebUI.delay(10)

//Reset All existing filters
WebUI.click(findTestObject('Object Repository/Final objects/MySelection/MainButns/i_reset-icon-lg-grey'))

WebUI.delay(10)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes old/div_brand'), 10)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes old/li_ANGEL'), 10)
WebUI.delay(10)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes old/div_category'), 10)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes old/li_Blank'), 10)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()
WebUI.delay(10)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/MainButns/ResultControlMenu'),10)
WebUI.delay(10)
//WebUI.check(findTestObject('Object Repository/Final Objects/MySelection/trial/div_brand_chk'),10)
//CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ScrollTo'(findTestObject('Final Objects/MySelection/Measures/trial/chkobject/Page_SLICeR Kanvas - My Selection/span_brand'),10)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/MainButns/GroupbyBrand'),10)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/MainButns/GroupByCategory'),10)
WebUI.delay(10)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/MainButns/Page_SLICeR Kanvas - My Selection/Page_SLICeR Kanvas - My Selection/ResultControl_button_Apply'),10)
WebUI.delay(10)
actual = WebUI.getText(findTestObject('Object Repository/Final Objects/Validation Objects/Actual/ActualItemCnt'))
log.logInfo(actual)



//Filter by measures

/*CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('null'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - My Selection/input_MIN_minInput'))
WebUI.click(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - My Selection/input_MIN_minInput'))
WebUiCommonHelper.findWebElement(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - My Selection/input_MIN_minInput'), 10).clear()
//CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - My Selection/input_MIN_minInput'))
WebUI.delay(10)
//WebUI.click(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - My Selection/input_MIN_minInput')).clear()
//WebUI.click(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - My Selection/input_MIN_minInput'))
//WebUI.sendKeys(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - My Selection/input_MIN_minInput'), Keys.chord(Keys.CONTROL, ‘a’))
//WebUI.sendKeys(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - My Selection/input_MIN_minInput'), Keys.chord(Keys.BACK_SPACE))
//WebUI.click(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - My Selection/input_MIN_minInput'))
//WebUI.sendKeys(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - My Selection/input_MIN_minInput'), Keys.chord(Keys.DELETE))
//WebUI.click(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - My Selection/input_MIN_minInput'))
//WebUI.setText(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - My Selection/input_MIN_minInput'), '22459')
//WebUI.setText(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - My Selection/input_to_maxInput'), '39000')
//CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()

//Expected = WebUI.verifyElementVisible(findTestObject('Object Repository/Final Objects/Validation Objects/Expected/1140404-01-EIC'),FailureHandling.CONTINUE_ON_FAILURE)
/*Expected = WebUI.verifyElementPresent(findTestObject('Object Repository/Final Objects/Validation Objects/Expected/1140404-01-EIC'),10,FailureHandling.CONTINUE_ON_FAILURE)
Actual = WebUI.getText(findTestObject('Object Repository/Final Objects/Validation Objects/Actual/ActualItemCnt'))
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.CompareItemCnt'(Expected,Actual)

*/