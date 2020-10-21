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
//Click on Kanvas Logo
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/kanvaslogo'))

WebUI.delay(5)
//alerts handling
CustomKeywords.'com.BB.genralFunctions.alertHandling'()
WebUI.delay(5)

//Reset all filters in My Selection
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ResetAllFlts'()
WebUI.delay(5)

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

//Set text Tags 
CustomKeywords.'com.BB.genralFunctions.setTextTag'(TextTag)


//Select attributes and measure for show data
CustomKeywords.'com.BB.genralFunctions.doShowData'(showDataAttrName, nSep)
WebUI.delay(5)

//Apply Sort and stats on measures and Select measures and set  sort order
CustomKeywords.'com.BB.genralFunctions.doSort'(sortAttrName,  sortStatus, nSep,vSep )
WebUI.delay(10)

//Select measure for enable stats
CustomKeywords.'com.BB.genralFunctions.doStats'(statsAttrName, nSep)

//Click on done in Sort and Stats control
CustomKeywords.'com.BB.genralFunctions.sortDone'(sortAttrName,statsAttrName)

//Group by attributes and tags and Click on Result Control Menu

//Group by attributes
CustomKeywords.'com.BB.genralFunctions.clickGrpAttrs'(groupByAttrName, TextTag, nSep)

//Set Item limit
CustomKeywords.'com.BB.genralFunctions.setItemLimit'(limit)

//Apply filters
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()
WebUI.delay(10)

//Compare Itemcount
CustomKeywords.'com.BB.genralFunctions.CompareItemCnt'(expectedItemCnt)

//Click on Kanvas Logo
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/kanvaslogo'))
WebUI.delay(5)
/*

//Navigate to layout
CustomKeywords.'com.BB.genralFunctions.loadTemplate'(tempName)

//Export template
CustomKeywords.'com.BB.genralFunctions.exportFormat'(formatType)

*/


