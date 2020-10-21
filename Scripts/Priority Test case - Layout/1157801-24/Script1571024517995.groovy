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
//Select hierarchy icon
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/li_Attributes_hierarchyBtn'))
WebUI.delay(5)
//Select hierarchy attribute
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Hierarchys/div_size'))
WebUI.delay(5)
//Select hierarchy values
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Hierarchys/li_35'))
WebUI.delay(5)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/Hierarchys/li_39'),10)
WebUI.delay(5)
//Select hierarchy save
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/hierarchysave'))
WebUI.delay(5)
//Click on apply button
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()
WebUI.delay(10)
//Navigate to layout
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/navtoLayout'))
WebUI.delay(5)
//Click on export Tab
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/exportbtn'))
WebUI.delay(5)
//Click on data/Images
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Exportformats/DataOrImgsTab'))
WebUI.delay(5)
//Click on + symbol to create new template
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/ExportData/CreateNewdataTemp'))
WebUI.delay(10)
//Click on 'select all' check box
//CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Exportformats/selectallattrschkbx'),10)
//Select brand and 4wkros to the template
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/Layout/ExportData/selBrandattr'),10)
WebUI.delay(5)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/Layout/ExportData/sel4wkros'),10)
WebUI.delay(5)
//Enter data template name
WebUI.setText(findTestObject('Object Repository/Final Objects/Layout/ExportData/saveTempName'),"1157801-24")
//Click on Save button to save template
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/ExportData/SavedataTemp'))
WebUI.delay(5)
//Click on ProceedExport
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/ExportData/ProceedtoExport'))
WebUI.delay(5)
//Click on 'OK' after data export scheduled
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/ExportData/OKbtnafterdtaexport'))
WebUI.delay(5)
