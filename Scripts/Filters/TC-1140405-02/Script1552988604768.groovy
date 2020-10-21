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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.eclipse.jetty.client.ContinueProtocolHandler.ContinueListener as ContinueListener
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

KeywordLogger log = new KeywordLogger()

WebUI.openBrowser(null)

//Navigate to URL and login into kanvas
CustomKeywords.'com.test.demo.KanvasLoginCustomFunctions.KLogin'()

CustomKeywords.'com.test.demo.DashboardCustomFunctions.NavMySelection'()

WebUI.delay(10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ResetAllFlts'()

WebUI.delay(10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Measures/div_cost'), 
    10)

WebUI.delay(10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.SetMsrVal'(findTestObject('Final Objects/MySelection/Measures/MIN_Cost'), 
    findTestObject('Final Objects/MySelection/Measures/div_cost'), 10, '1855.00')

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.SetMsrVal'(findTestObject('Final Objects/MySelection/Measures/MAX_Cost'), 
    findTestObject('Final Objects/MySelection/Measures/div_cost'), 10, '10380.00')

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/MySelection/Measures/MIN_Cost'))

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()

WebUI.delay(10)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final objects/MySelection/MainButns/li_Attributes_hierarchyBtn'), 10)
//CustomKeywords.'com.test.demo.MySelectionCustomFunctions.HierarchyBtn'()

//scroll and click on attribute using keyword
//CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ScrollTo'(findTestObject('Object Repository/Final Objects/MySelection/AttributesNdHierarchies/div_GD'), 10)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Hierarchys/div_climates'), 
    5)

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Hierarchys/li_COLD1234'), 
    5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.HierarchySave'()

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/div_brand'), 
    5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/li_BAGGIT'), 
    5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()

WebUI.delay(5)

//Expected = WebUI.verifyElementVisible(findTestObject('Object Repository/Final Objects/Validation Objects/Expected/1140404-01-EIC'),FailureHandling.CONTINUE_ON_FAILURE)
Expected = WebUI.verifyElementPresent(findTestObject('Final Objects/Validation Objects/Expected/TC-1140405-02 EIC'), 10, 
    FailureHandling.CONTINUE_ON_FAILURE)

Actual = WebUI.getText(findTestObject('Object Repository/Final Objects/Validation Objects/Actual/ActualItemCnt'))

//CustomKeywords.'com.test.demo.MySelectionCustomFunctions.CompareItemCnt'(Expected)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.CompareItemCnt'(Expected, Actual)

WebUI.delay(10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ClickInfoBtn'()

WebUI.delay(20)

tiexpected = WebUI.verifyElementPresent(findTestObject('Final Objects/Validation Objects/Expected/TC-1140405-02 EFI'), 10, 
    FailureHandling.CONTINUE_ON_FAILURE)

tiactual = WebUI.getText(findTestObject('Object Repository/Final Objects/Validation Objects/Actual/ActualFilterInfo'))

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.CompareTooltipInfo'(tiexpected, tiactual)

WebUI.closeBrowser()

