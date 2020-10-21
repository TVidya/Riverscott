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

WebUI.click(findTestObject('Final Objects/MySelection/MainButns/a_Standard'))

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ResetAllFlts'()

WebUI.delay(10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.HierarchyBtn'()

WebUI.delay(5)

//scroll and click on attribute using keyword
//CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ScrollTo'(findTestObject('Object Repository/Final Objects/MySelection/AttributesNdHierarchies/div_GD'), 10)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Hierarchys/div_climates'), 
    10)

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Hierarchys/li_COLD1234'), 
    10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.HierarchySave'()

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/div_brand'), 
    10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/li_ANGEL'), 
    10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/li_ANNE KLIEN'), 
    10)

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/div_week'), 
    10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/li_WEEK1'), 
    10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/li_WEEK4'), 
    10)

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/div_best grade'), 
    10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/li_POOR'), 
    10)

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/MySelection/Tags/tagstab'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Tags/label_Show tags from other use'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/MySelection/Tags/div_Color-Basic'))

WebUI.delay(5)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Tags/Green_forest_color_tag'), 
    10)

WebUI.delay(5)

//WebUI.click(findTestObject('Object Repository/Tags/texttag'))
//WebUI.click(findTestObject('Object Repository/Tags/tagstab'))
//WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/button_Apply'))
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/MainButns/button_Apply'), 
    10)

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/Layout/Main Buttons/navlayout'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Objects/Layout/Template/img_Use Blank_templateDP template'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/Layout/Main Buttons/a_Export'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/Layout/Main Buttons/a_Current Template'))

WebUI.delay(5)

WebUI.setText(findTestObject('Final Objects/Layout/Main Buttons/exportfilename'), '1146416-945')

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/Layout/Main Buttons/button_PDF'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Objects/Layout/Main Buttons/button_OK'))

WebUI.closeBrowser()

