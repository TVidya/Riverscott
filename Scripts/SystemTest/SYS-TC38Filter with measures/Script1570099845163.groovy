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
//Click on kanvaslogo
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/kanvaslogo'))
WebUI.delay(5)
//Reset all filters in My Selection
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ResetAllFlts'()
//Click on measure name
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Measures/div_4weeks ros'), 
    5)
//Set Minimum msr value
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.SetMsrVal'(findTestObject('Final Objects/MySelection/Measures/MIN_4weeks ros'), 
    findTestObject('Final Objects/MySelection/Measures/div_4weeks ros'), 10, '5965.77')
//Set Maximum msr value
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.SetMsrVal'(findTestObject('Final Objects/MySelection/Measures/MAX_4weeks ros'), 
    findTestObject('Final Objects/MySelection/Measures/div_4weeks ros'), 10, '11362.69')
WebUI.delay(5)
//Click on msr to Collapse histogram 
WebUI.click(findTestObject('Final Objects/MySelection/Measures/div_4weeks ros'))

//Click on apply button
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()
WebUI.delay(5)
//Compare expected and actual itemcount
 expected = WebUI.verifyElementPresent(findTestObject('Final Objects/Validation Objects/Expected/SystemTest/SYS-TC38-EIC'), 10,
	 FailureHandling.CONTINUE_ON_FAILURE)
 
 actual = WebUI.getText(findTestObject('Final Objects/Validation Objects/Actual/ActualItemCnt'))
 
 CustomKeywords.'com.test.demo.MySelectionCustomFunctions.CompareItemCnt'(expected, actual)
 //Verify tooltip info present  and click on tooltip info
 WebUI.verifyElementPresent(findTestObject('Object Repository/Final Objects/MySelection/MainButns/TooltipInfo'), 10)
 CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ClickInfoBtn'()
 WebUI.delay(5)
 //Compare expected and actual tooltip info
 tiexpected = WebUI.verifyElementPresent(findTestObject('Object Repository/Final Objects/Validation Objects/Expected/SystemTest/SYS-TC38- EFI'), 10,
	 FailureHandling.CONTINUE_ON_FAILURE)
 
 tiactual = WebUI.getText(findTestObject('Final Objects/Validation Objects/Actual/ActualFilterInfo'))
 
 log.logInfo(tiactual)
 
 CustomKeywords.'com.test.demo.MySelectionCustomFunctions.CompareTooltipInfo'(tiexpected, tiactual)
 //Close browser
WebUI.closeBrowser()
