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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
//import org.eclipse.jetty.client.ContinueProtocolHandler.ContinueListener as ContinueListener
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.verifyElementInViewport
KeywordLogger log = new KeywordLogger()

//alerts handling
CustomKeywords.'com.BB.genralFunctions.alertHandling'()
WebUI.delay(5)
//Reset all filters in My Selection
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ResetAllFlts'()
//Select multiple attributes and values
CustomKeywords.'com.BB.genralFunctions.selAttrNdVals'( attrNames, attrVals,nSep,vSep,'wrap-attr-name')

//Select hierarchy icon
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/li_Attributes_hierarchyBtn'))
WebUI.delay(5)
//Select hierarchy attribute and values
CustomKeywords.'com.BB.genralFunctions.selAttrNdVals'( hAttrNames, hAttrVals,nSep,vSep,'wrap-hattr-name')
//Click on Hsave button
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/hierarchysave'))
WebUI.delay(5)
CustomKeywords.'com.BB.genralFunctions.setTextTag'(TextTag)
////Click on Tags Tab
////WebUI.click(findTestObject('Final Objects/MySelection/Tags/tagstab'))
//CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Tags/tagstab'),10)
//WebUI.delay(5)
////Click on input box and enter Text tag
//WebUI.setText(findTestObject('Final Objects/MySelection/Tags/settexttag'), TextTag)
//WebUI.sendKeys(findTestObject('Final Objects/MySelection/Tags/settexttag'), Keys.chord(Keys.ENTER))
//Switch to attributes
//WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/a_Attributes-Switch'))
//CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/MainButns/a_Attributes-Switch'),10)
////Showdata
//TestObject showData = CustomKeywords.'com.BB.genralFunctions.makeTestObject'('li', '', 'showmeasure-icon-xl-grey', 'showMeasrBtn', '', '','')
//WebUI.click(showData)
////Enable showdata
//CustomKeywords.'com.BB.genralFunctions.enableShowData'()
//Select attributes/measure for show data
CustomKeywords.'com.BB.genralFunctions.doShowData'(showDataAttrName, nSep)
WebUI.delay(5)
//Apply Sort and stats on measures
//Click on Sort control Icon
//CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/MainButns/li_Attributes_statSortBtns'),
//	5)
//WebUI.delay(5)
//Select measures and set  sort order
CustomKeywords.'com.BB.genralFunctions.doSort'(sortAttrName,  sortStatus, nSep,vSep )
WebUI.delay(10)
//Select measure for enable stats
CustomKeywords.'com.BB.genralFunctions.doStats'(statsAttrName, nSep)
//Click on done in Sort and Stats control
CustomKeywords.'com.BB.genralFunctions.sortDone'(sortAttrName,statsAttrName)
//Group by attributes and tags
//Click on Result Control Menu
//CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/MainButns/ResultControlMenu'),10)
//WebUI.delay(5)
//Group by attributes
CustomKeywords.'com.BB.genralFunctions.clickGrpAttrs'(groupByAttrName, TextTag, nSep)
//CustomKeywords.'com.BB.genralFunctions.clickGrpTags'(TextTag)
//CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/Tags/Group_Texts_tag'),10)
//WebUI.delay(5)
//Set Item limit
CustomKeywords.'com.BB.genralFunctions.setItemLimit'(limit)
//Apply filters
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()
WebUI.delay(10)
//Compare Itemcount
//def actualItemcnt = WebUI.getText(findTestObject('Final Objects/Validation Objects/Actual/ActualItemCnt'))
//def actCnt = actualItemcnt.split(/\s/)
////println (actICnt)
////String actCntStr = actCnt[0] + ',' + actCnt[2]
//String actCntStr = actCnt[0]
//log.logInfo (actCntStr)
//compare item count
CustomKeywords.'com.BB.genralFunctions.CompareItemCnt'(expectedItemCnt)
//Click on Kanvas Logo
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/kanvaslogo'))
WebUI.delay(5)
////Navigate to layout
//WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/navtoLayout'))
//WebUI.delay(5)
//LoadTemplate
CustomKeywords.'com.BB.genralFunctions.loadTemplate'(tempName)
////Click on export Tab
//WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/exportbtn'))
//WebUI.delay(5)
////For PNG
////click on current template
//WebUI.click(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/a_Current Template'))
//WebUI.delay(5)
////Set export file name
//WebUI.setText(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Exportformats/outputfilename'), 'PNG')
//WebUI.delay(5)
//click on  png format
//CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/Layout/Main Buttons/Exportformats/PNG format'),10)
CustomKeywords.'com.BB.genralFunctions.exportFormat'(formatType)

