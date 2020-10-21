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
WebUI.setViewPortSize(1200, 1400)
//WebUI.setViewPortSize(703, 347)
//Navigate to URL and login into kanvas
CustomKeywords.'com.test.demo.KanvasLoginCustomFunctions.KLoginSYSTST'()
//Click on kanvaslogo
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/kanvaslogo'))
WebUI.delay(5)

//Reset all filters in My Selection
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ResetAllFlts'()
//Click on measure name
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Measures/div_4weeks ros'),
	5)
//Set Minimum msr value
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.SetMsrVal'(findTestObject('Final Objects/MySelection/Measures/MIN_4weeks ros'),
	findTestObject('Final Objects/MySelection/Measures/div_4weeks ros'), 10, '5965.77')
//Set Maximum msr value
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.SetMsrVal'(findTestObject('Final Objects/MySelection/Measures/MAX_4weeks ros'),
	findTestObject('Final Objects/MySelection/Measures/div_4weeks ros'), 10, '11362.69')
WebUI.delay(5)
//Click on msr to Collapse histogram
WebUI.click(findTestObject('Final Objects/MySelection/Measures/div_4weeks ros'))

//Filter by attributes
//Filter by brand
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/div_brand'),
	10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/li_BAGGIT'),
	10)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/Attributes/li_ANNE KLIEN'),
	10)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/div_brand'),
	10)
WebUI.delay(5)
//Filter by category
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/div_category'),
	10)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/li_BASIC'),
	10)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/Attributes/li_SPECIAL'),
	10)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Attributes/div_category'),
	10)
WebUI.delay(5)

//Click on Tags Tab
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Tags/tagstab'),10)
WebUI.delay(5)
//Filter by tags
WebUI.setText(findTestObject('Final Objects/MySelection/Tags/settexttag'), '11510305-13')
WebUI.sendKeys(findTestObject('Final Objects/MySelection/Tags/settexttag'), Keys.chord(Keys.ENTER))
//Filter by Dates
//Switch to attributes tab
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/MainButns/a_Attributes-Switch'),10)
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
//Click on 28th date of calendar
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/date28'))
WebUI.delay(5)
///Set date selection
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Dates/setdate'))
//Apply limits
//Click on Result Control Menu
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/MainButns/ResultControlMenu'),10)
//Click on Item Limit text box
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/MainButns/i_set-limit'),10)
WebUI.delay(5)
//Set Limit as 10
WebUI.setText(findTestObject('Final Objects/MySelection/MainButns/input_first-n'),'10')
WebUI.sendKeys(findTestObject('Final Objects/MySelection/MainButns/input_first-n'),Keys.chord(Keys.ENTER) )
//Group by attribute
//Click on attributes checkbox to group
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/MainButns/GroupbyBrand'),
   10)

//Result Control Apply
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/MainButns/Result control Apply Button'),10)
WebUI.delay(5)
//Search for few items
//Search item
//Click on search icon
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Search/Click_search'))
WebUI.delay(5)
//Click on search with in the results
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Search/label_Search In Result'))
WebUI.delay(5)
//Set keyword in the input box
WebUI.setText(findTestObject('Object Repository/Final Objects/MySelection/Search/input_Search In Result_search-box'), 'BG4574,BG4588')
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Search/button_Search'))
WebUI.delay(5)
//Click on search button
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Search/button_Search'))
WebUI.delay(5)
//Close search window
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/Search/CloseBtnSearchWindow'))
WebUI.delay(5)
//Navigate to layout
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/navtoLayout'),10)
WebUI.delay(5)
//Add display criteria
//load template
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Template/loadtemp'))
WebUI.delay(5)
//Click on 'Tools' Tab
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Tools'))
WebUI.delay(5)
//Click on 'Tools-Settings' Tab
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/tools-settingsbtn'))
WebUI.delay(5)
//Click on 'Display Criteria'
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/displaycriteria'))
//Click on 'Show' display criteria Tab
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/displaycriteria-showbtn'),10)
//Click on  'OK' button
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/displaycriteria-OKbtn'),10)
//Validate in preview
//Click on Preview
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/Layout/Template/previewtemp'),10)
WebUI.delay(5)
//Click on export Tab
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/exportbtn'))
WebUI.delay(5)
//Validate in output
//Export it as PDF
//click on current template
WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/a_Current Template'))
WebUI.delay(5)
//Set export file name
WebUI.setText(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Exportformats/outputfilename'),"PDF")
WebUI.delay(5)
//click on  PDF format
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Exportformats/PDF format'),10)
WebUI.delay(5)
//Click on output file export request popup OK button
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Exportformats/OutptreqconfirmButtonOK'),10)
WebUI.delay(5)
//Click on kanvas logo
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/kanvaslogo'))
WebUI.delay(5)
//Dismiss browser alert
WebUI.acceptAlert()
//Close browser
WebUI.closeBrowser()


