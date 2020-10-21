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
//WebUI.setViewPortSize(1200, 1500)
//WebUI.setViewPortSize(703, 347)
//Navigate to URL and login into kanvas
CustomKeywords.'com.test.demo.KanvasLoginCustomFunctions.KLoginSYSTST'()
//Click on Side Menu
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/sidebar-Menu button'))
WebUI.delay(5)
//Navigate to Layout
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/navtoLayout'))
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
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Exportformats/selectallattrschkbx'),10)
WebUI.delay(5)
//Include attachments
//Click on Include attachments
//CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/Layout/ExportData/attachment/Includeattachments'),10)
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/ExportData/attachment/Includeattachments'))
WebUI.delay(5)
/*
//Click on attachments format input box
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/Layout/ExportData/attachment/selAttachmentformat'),10)
WebUI.delay(5)
WebUI.setText(findTestObject('Object Repository/Final Objects/Layout/ExportData/attachment/selAttachmentformat'),'OFFICE DOCUMENT')
WebUI.sendKeys(findTestObject('Object Repository/Final Objects/Layout/ExportData/attachment/selAttachmentformat'),Keys.chord(Keys.ENTER))
WebUI.delay(5)
/*
//Enter data template name
WebUI.setText(findTestObject('Object Repository/Final Objects/Layout/ExportData/saveTempName'),"11513705-01-6")
//Click on Save button to save template
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/ExportData/SavedataTemp'))
WebUI.delay(5)
//Click on FTP export option
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/Layout/ExportData/sendviaFTP-Exportdata/clickonFTPoption'),10)
WebUI.delay(5)
//Set Export File name
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/ExportData/sendviaFTP-Exportdata/FTPexport-filename'))
WebUI.delay(5)
WebUI.setText(findTestObject('Object Repository/Final Objects/Layout/ExportData/sendviaFTP-Exportdata/FTPexport-filename'),'11513705-01-5')
WebUI.delay(5)
//Click on saved FTP dropdown
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/ExportData/sendviaFTP-Exportdata/clickonexportFTP-LoadTemp'))
WebUI.delay(5)
//Click on Saved FTP dropdown search input
//WebUI.click(findTestObject('Object Repository/Final Objects/Layout/ExportData/sendviaFTP-Exportdata/SearchInput-savedFTP'))
WebUI.setText(findTestObject('Object Repository/Final Objects/Layout/ExportData/sendviaFTP-Exportdata/clickonsearchinput-LoadTemp'),'ftp://180.179.52.197')
WebUI.sendKeys(findTestObject('Object Repository/Final Objects/Layout/ExportData/sendviaFTP-Exportdata/clickonsearchinput-LoadTemp'),Keys.chord(Keys.ENTER))
WebUI.delay(5)

//Click on proceed for data export
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Exportformats/ProceedtoExport'))
WebUI.delay(5)
//Click on 'OK' after data export scheduled
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Exportformats/OKbtnafterdtaexport'))
WebUI.delay(5)
//Close Browser
//WebUI.closeBrowser()
*/