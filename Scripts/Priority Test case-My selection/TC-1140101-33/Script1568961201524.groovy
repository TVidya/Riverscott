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
CustomKeywords.'com.test.demo.KanvasLoginCID008CustomFunctions.KLogin'()

//Navigate to My Selection from dashboard
CustomKeywords.'com.test.demo.DashboardCustomFunctions.NavMySelection'()

WebUI.delay(10)

//Reset all filters in My Selection
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ResetAllFlts'()

WebUI.delay(10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Tags/tagstab'), 
    5)

WebUI.delay(10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Tags/label_Show tags from other use'), 
    10)

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Tags/div_leathers_icon'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Tags/li_leathers_icon-tag-li'))

WebUI.delay(5)

//WebUI.click(findTestObject('Object Repository/Tags/texttag'))
//WebUI.click(findTestObject('Object Repository/Tags/tagstab'))
//WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/button_Apply'))
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/MainButns/button_Apply'), 
    10)

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/MainButns/a_Attributes-Switch'), 
    5)

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.HierarchyBtn'()

WebUI.delay(5)

//scroll and click on attribute using keyword
//CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ScrollTo'(findTestObject('Object Repository/Final Objects/MySelection/AttributesNdHierarchies/div_GD'), 10)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Hierarchys/div_size'), 
    10)

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Hierarchys/li_35'), 
    10)

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Hierarchys/li_36'), 
    10)

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Hierarchys/li_37'), 
    10)

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.HierarchySave'()

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()

WebUI.delay(10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/div_brand'), 
    5)

WebUI.delay(10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/li_AMERICAN TOURISTER'), 
    10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/li_ANGEL'), 
    10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/li_ANNE KLIEN'), 
    10)

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()

WebUI.delay(10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Measures/div_calmsrat'), 
    5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.SetMsrVal'(findTestObject('Final Objects/MySelection/Measures/MIN_Calmsrat'), 
    findTestObject('Final Objects/MySelection/Measures/div_calmsrat'), 10, '7.62')

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.SetMsrVal'(findTestObject('Final Objects/MySelection/Measures/MAX_Calmsrat'), 
    findTestObject('Final Objects/MySelection/Measures/div_calmsrat'), 10, '14.74')

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Measures/div_calmsrat'))

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()

WebUI.delay(10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/MainButns/li_Attributes_statSortBtns'), 
    5)

WebUI.delay(10)

Descend = WebUI.verifyElementPresent(findTestObject('Final Objects/MySelection/sort/4weeksros_descending'), 10, FailureHandling.OPTIONAL)

Ascend = WebUI.verifyElementPresent(findTestObject('Final Objects/MySelection/sort/4weeksros_Ascending'), 10, FailureHandling.OPTIONAL)

Disable = WebUI.verifyElementPresent(findTestObject('Final Objects/MySelection/sort/4weeksros_Disable'), 10, FailureHandling.OPTIONAL)

//To do Ascend
if (Ascend == true) {
    FailureHandling.CONTINUE_ON_FAILURE({ 
            CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/MainButns/button_Done'), 
                10)
        })
} else if (Descend == true) {
    FailureHandling.CONTINUE_ON_FAILURE({ 
            CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/sort/4weeksros_descending'))

            CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/sort/4weeksros_Disable'))

            CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/MainButns/button_Done'), 
                10)
        })
} else {
    WebUI.click(findTestObject('Final Objects/MySelection/sort/4weeksros_Disable'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Final Objects/MySelection/MainButns/button_Done'))
}

WebUI.delay(10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()

WebUI.delay(10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/MainButns/li_Attributes_statSortBtns'), 
    5)

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Stats Summary/Stats_8weeks ros'), 
    5)

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/MainButns/button_Done'))

WebUI.delay(3)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()

WebUI.delay(10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/MainButns/ResultControlMenu'), 
    5)

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/MySelection/MainButns/i_set-limit'))

WebUI.delay(10)

WebUI.setText(findTestObject('Final Objects/MySelection/MainButns/input_first-n'), '5')

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/MainButns/Page_SLICeR Kanvas - My Selection/Page_SLICeR Kanvas - My Selection/ResultControl_button_Apply'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/MainButns/Page_SLICeR Kanvas - My Selection/Page_SLICeR Kanvas - My Selection/ResultControl_button_Apply'))

WebUI.delay(10)

//Verify tooltip info present  and click on tooltip info
WebUI.verifyElementPresent(findTestObject('Object Repository/Final Objects/MySelection/MainButns/TooltipInfo'), 10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ClickInfoBtn'()

WebUI.delay(10)

//Assign item count to variable and compare
expected = WebUI.verifyElementPresent(findTestObject('Final Objects/Validation Objects/Expected/TC-1140101-33 EIC'), 10, 
    FailureHandling.CONTINUE_ON_FAILURE)

actual = WebUI.getText(findTestObject('Final Objects/Validation Objects/Actual/ActualItemCnt'))

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.CompareItemCnt'(expected, actual)

//Assign tooltip info to variable and compare
tiexpected = WebUI.verifyElementPresent(findTestObject('Final Objects/Validation Objects/Expected/TC-1140101-33 EFI'), 10, 
    FailureHandling.CONTINUE_ON_FAILURE)

tiactual = WebUI.getText(findTestObject('Final Objects/Validation Objects/Actual/ActualFilterInfo'))

log.logInfo(tiactual)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.CompareTooltipInfo'(tiexpected, tiactual)

WebUI.closeBrowser()

