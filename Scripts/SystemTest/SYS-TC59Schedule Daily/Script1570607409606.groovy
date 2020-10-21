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
//Click on export Tab
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/exportbtn'))
WebUI.delay(5)
//Click on Schedule Tab
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Exportformats/navToscheduleTab'))
WebUI.delay(5)
//Click on Workspace dropdown
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/selectWS'))
WebUI.delay(5)
//Search for WS
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/searchWSname'))
WebUI.setText(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/searchWSname'), '1441001-15')
WebUI.sendKeys(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/searchWSname'), Keys.chord(Keys.ENTER))
//Click on Template dropdown
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/selectTemp'))
WebUI.delay(5)
//Search for template
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/searchTempname'))
WebUI.setText(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/searchTempname'), 'temp-prv')
WebUI.sendKeys(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/searchTempname'), Keys.chord(Keys.ENTER))
//Click on format dropdown
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/selectFormat'))
WebUI.delay(5)
//Search for format
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/searchFormat'))
WebUI.setText(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/searchFormat'), 'PNG')
WebUI.sendKeys(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/searchFormat'), Keys.chord(Keys.ENTER))
//Send To EmailId
WebUI.setText(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/sendTo'), 'shiva@slicerpl.com')
WebUI.delay(5)
//Enter Message
WebUI.setText(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/sendMessage'), 'from katalon schedule Daily test')
WebUI.delay(5)
//Click on schedule Daily
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/Daily'))
WebUI.delay(5)
//click on Time
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/Once-spanTime'))
WebUI.delay(5)
//Enter time in search input
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/enterInputinsearch'))
WebUI.setText(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/enterInputinsearch'), '17:00')
WebUI.sendKeys(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/enterInputinsearch'), Keys.chord(Keys.ENTER))
WebUI.delay(5)
//Save schedule
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/saveschedule'))
WebUI.delay(5)
//Schedule name confirmation
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/scheduleSaveNameConfirm'))
WebUI.delay(5)
//Schedule confirm OK button
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Schedule/ScheduleConfirmd-OKbtn'))
WebUI.delay(5)
//Click on kanvas logo
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/kanvaslogo'))
WebUI.delay(5)
//Close browser
WebUI.closeBrowser()
