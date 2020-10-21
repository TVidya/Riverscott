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
//Select multiple hierarchy attributes
//Select City
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Hierarchys/div_CITYS'))
WebUI.delay(5)
//Select City values
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Hierarchys/li_CAN THO'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Hierarchys/li_CAPE TOWN'))
WebUI.delay(5)
//Collapse City
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Hierarchys/div_CITYS'))
WebUI.delay(5)
//Select Size
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Hierarchys/div_size'))
WebUI.delay(5)
//Select Size values values
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Hierarchys/li_35'))
WebUI.delay(5)
//Select hierarchy save
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/hierarchysave'))
WebUI.delay(5)
//Click on Result Control Menu
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/MainButns/ResultControlMenu'),10)
WebUI.delay(5)
//Click on Item Limit text box
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/MainButns/i_set-limit'),10)
WebUI.delay(5)
//Set Limit as 10
WebUI.setText(findTestObject('Final Objects/MySelection/MainButns/input_first-n'),'10')
WebUI.sendKeys(findTestObject('Final Objects/MySelection/MainButns/input_first-n'),Keys.chord(Keys.ENTER) )
//Click on hierarchy attributes checkbox to group
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/Hierarchys/Group_CITYS'),
   10)
WebUI.delay(5)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/Hierarchys/Group_size'),10)
WebUI.delay(5)
//Result Control apply
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/Result control Apply Button'))
WebUI.delay(5)
//Navigate to layout
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/navtoLayout'))
WebUI.delay(5)
//Click on export Tab
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/exportbtn'))
WebUI.delay(5)
//Click on data/Images
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Exportformats/DataOrImgsTab'))
WebUI.delay(5)
//Choose saved template
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Exportformats/chooseTemp'))
WebUI.delay(5)
//Search for data template
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/searchforTempname-notsavedtemp'))
WebUI.delay(5)
WebUI.setText(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/searchforTempname-notsavedtemp'),'1157801-96-dt15-1')
WebUI.sendKeys(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/searchforTempname-notsavedtemp'),Keys.chord(Keys.ENTER))
WebUI.delay(5)
//Click on 'Export with embedded images'
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/ExportData/Export-Embdimgswithdata'))
WebUI.delay(5)
//Click on proceed for data export
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Exportformats/ProceedtoExport'))
WebUI.delay(5)
//Click on 'OK' after data export scheduled
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Exportformats/OKbtnafterdtaexport'))
WebUI.delay(5)
//Click on kanvas logo
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/kanvaslogo'))
WebUI.delay(5)
//Dismiss browser alert
WebUI.acceptAlert()
//Close browser
WebUI.closeBrowser()









