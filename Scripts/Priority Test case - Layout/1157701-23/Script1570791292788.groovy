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
//Click on username for dropdown menu
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/USeRdropdwnMenu'))
WebUI.delay(5)
//Click on 'Restore Workspace'
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/a_Restore Workspace'))
WebUI.delay(5)
//Click on recent loaded Workspace
WebUI.click(findTestObject('Object Repository/Final Objects/ListofWS/WS-1441001-15'))
WebUI.delay(5)
//Navigate to layout
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/navtoLayout'))
WebUI.delay(5)
//load template
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Template/loadtemp-PPTXtemp'))
WebUI.delay(5)
//Click on tools
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Tools'))
WebUI.delay(5)
//Click on attributes settings
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/attributesMenu'))
WebUI.delay(5)
//Remove attributes
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Tools-attrsettings/clearall btn'))
WebUI.delay(5)
//Click on Include Rank
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Tools-attrsettings/Include Rank'))
WebUI.delay(5)
//Click on Text Tags
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Tools-attrsettings/Include Text Tags'))
WebUI.delay(5)
//Click on Close button in attribute settings
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/closeBtn-attrsettings'))
WebUI.delay(5)
//Preview template
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Template/previewtemp'))
WebUI.delay(5)
//Click on export Tab
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/exportbtn'))
WebUI.delay(5)
//For PDF
//click on current template
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/a_Current Template'))
WebUI.delay(5)
//Set export file name
WebUI.setText(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Exportformats/outputfilename'),"PPTX")
WebUI.delay(5)
//click on  PPTX format
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Exportformats/PPTX format'),10)
WebUI.delay(5)
//Click on output file export request popup OK button
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Exportformats/OutptreqconfirmButtonOK'),10)
WebUI.delay(5)
//Need to compare screenshots of Load Template

//Click on kanvas logo
//WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/kanvaslogo'))
//WebUI.delay(5)
//Dismiss browser alert
//WebUI.acceptAlert()
//Close browser
//WebUI.closeBrowser()