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

//scroll and click on attribute using keyword
//CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ScrollTo'(findTestObject('Object Repository/Final Objects/MySelection/AttributesNdHierarchies/div_GD'), 10)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.HierarchyBtn'()

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Hierarchys/div_climates'),
	10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Hierarchys/li_COLD1234'),
	10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Hierarchys/li_HOT55'),
	10)

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.HierarchySave'()

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/div_category'),
	10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/li_BASIC'),
	10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/li_BUNDLED'),
	10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()

WebUI.delay(10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Measures/div_budget'),
	5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.SetMsrVal'(findTestObject('Final Objects/MySelection/Measures/MIN_Budget'),
	findTestObject('Final Objects/MySelection/Measures/div_budget'), 10, '94001.00')

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.SetMsrVal'(findTestObject('Final Objects/MySelection/Measures/MAX_Budget'),
	findTestObject('Final Objects/MySelection/Measures/div_budget'), 10, '748007.00')

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Measures/div_budget'))

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()

WebUI.delay(10)

WebUI.delay(10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Measures/div_calmsrat'),
	5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.SetMsrVal'(findTestObject('Final Objects/MySelection/Measures/MIN_Calmsrat'),
	findTestObject('Final Objects/MySelection/Measures/div_calmsrat'), 10, '9.11')

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.SetMsrVal'(findTestObject('Final Objects/MySelection/Measures/MAX_Calmsrat'),
	findTestObject('Final Objects/MySelection/Measures/div_calmsrat'), 10, '9.19')

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Measures/div_calmsrat'))

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()

WebUI.delay(8)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Tags/tagstab'),
	5)

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Tags/label_Show tags from other use'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Tags/div_leathers_icon'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Tags/li_leathers_icon-tag-li'))

WebUI.delay(10)

//WebUI.click(findTestObject('Object Repository/Tags/showothertags'))
//WebUI.selectOptionByLabel(findTestObject('Object Repository/Tags/settexttag'),'tagsforr13', false, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Final Objects/MySelection/Tags/settexttag'), '1141001-17')

WebUI.sendKeys(findTestObject('Final Objects/MySelection/Tags/settexttag'), Keys.chord(Keys.ENTER))

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Tags/div_Color-Basic'),
	5)

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Tags/Green_forest_color_tag'),
	10)

WebUI.delay(5)

//WebUI.click(findTestObject('Object Repository/Tags/texttag'))
//WebUI.click(findTestObject('Object Repository/Tags/tagstab'))
//WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/button_Apply'))
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/MainButns/button_Apply'),
	10)

WebUI.delay(10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.SaveWorkspace'('1141001-18')

WebUI.verifyElementPresent(findTestObject('Object Repository/Final Objects/MySelection/MainButns/TooltipInfo'), 10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ClickInfoBtn'()

WebUI.delay(10)

expected = WebUI.verifyElementPresent(findTestObject('Final Objects/Validation Objects/Expected/TC-1141001-18 EIC'), 10,
	FailureHandling.CONTINUE_ON_FAILURE)

actual = WebUI.getText(findTestObject('Final Objects/Validation Objects/Actual/ActualItemCnt'))

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.CompareItemCnt'(expected, actual)

tiexpected = WebUI.verifyElementPresent(findTestObject('Final Objects/Validation Objects/Expected/TC-1141001-18 EFI'), 10,
	FailureHandling.CONTINUE_ON_FAILURE)

tiactual = WebUI.getText(findTestObject('Final Objects/Validation Objects/Actual/ActualFilterInfo'))

log.logInfo(tiactual)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.CompareTooltipInfo'(tiexpected, tiactual)

WebUI.closeBrowser()


