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
WebUI.setViewPortSize(1200, 1500)
//WebUI.setViewPortSize(703, 347)
//Navigate to URL and login into kanvas
CustomKeywords.'com.test.demo.KanvasLoginCustomFunctions.KLoginSYSTST'()
//Click on kanvas logo
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/kanvaslogo'))
WebUI.delay(5)
//Reset all Filters
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/i_reset-icon-lg-grey'))
WebUI.delay(5)
//scrollto element
WebUI.scrollToElement(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/dateattr'),10)
//Click on date attribute
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/dateattr'))
//Open calendar
WebUI.scrollToElement(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/opencalendar'),10)
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/opencalendar'))
WebUI.delay(5)
//Click on 1st date of calendar
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/date1'))
//Click on 15th date of calendar
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/date15'))
WebUI.delay(5)
///Set date selection
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/setdate'))
//set one more date filters
WebUI.scrollToElement(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/opencalendar'),10)
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/opencalendar'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/date16'))
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/date28'))
//Set date selection
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/setdate'))
//Apply filters
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()
WebUI.delay(5)
//Filter by measure
//Click on measure name
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Measures/div_ytd ros'),
	5)
//Set Minimum msr value
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.SetMsrVal'(findTestObject('Final Objects/MySelection/Measures/MIN_Ytd Ros'),
	findTestObject('Final Objects/MySelection/Measures/div_ytd ros'), 10, '10')
//Set Maximum msr value
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.SetMsrVal'(findTestObject('Final Objects/MySelection/Measures/MAX_Ytd Ros'),
	findTestObject('Final Objects/MySelection/Measures/div_ytd ros'), 10, '150')
WebUI.delay(5)
//Click on msr to Collapse histogram
WebUI.click(findTestObject('Final Objects/MySelection/Measures/div_ytd ros'))
//Filter by hierarchy levels
//Select hierarchy icon
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/MainButns/li_Attributes_hierarchyBtn'),10)
WebUI.delay(5)
//Select hierarchy attribute
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Hierarchys/div_CITYS'))
WebUI.delay(5)
//Select hierarchy values
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Hierarchys/li_CAN THO'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Hierarchys/li_CAPE TOWN'))
WebUI.delay(5)
//Select hierarchy save
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/hierarchysave'))
WebUI.delay(5)
//Filter by attributes
//Click on attributes and values using keyword
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/div_category'),
	10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/li_BASIC'),
	10)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/li_BUNDLED'),
	10)

WebUI.delay(5)
//Filter by tags
//Click on Tags Tab
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Tags/tagstab'),10)
//Click on input box and enter Text tag
WebUI.setText(findTestObject('Final Objects/MySelection/Tags/settexttag'), 'regression3')
WebUI.sendKeys(findTestObject('Final Objects/MySelection/Tags/settexttag'), Keys.chord(Keys.ENTER))
WebUI.delay(5)
//Click on 'Apply' button
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/MainButns/button_Apply'),
	10)
WebUI.delay(5)
//Navigate to layout
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/navtoLayout'),10)
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
//Enter data template name
WebUI.setText(findTestObject('Object Repository/Final Objects/Layout/ExportData/saveTempName'),"1157901-28-2")
//Click on Save button to save template
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/ExportData/SavedataTemp'))
WebUI.delay(5)
//Close Browser
WebUI.closeBrowser()









