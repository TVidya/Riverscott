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
import org.openqa.selenium.Keys as Keys
//import com.kms.katalon.core.webui.key
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
//import org.eclipse.jetty.client.ContinueProtocolHandler.ContinueListener as ContinueListener
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.keyword.excel.ExcelKeywords


KeywordLogger log = new KeywordLogger()


//Start fresh or continue
CustomKeywords.'generalFunc.AllgenralFunc.kanvasLogo'()
WebUI.delay(5)

//Switchto Standard
CustomKeywords.'com.BB.genralFunctions.switchToStandard'()

//Click on ResetAllfilters
CustomKeywords.'standardFunc.AllstandardFunc.ResetAllFlts'()

//Search attribute and then filter
CustomKeywords.'standardFunc.AllstandardFunc.selAttrNdVals'(attrNames, attrVals, nSep, vSep)

//Select hierarchy attribute and values
CustomKeywords.'com.BB.genralFunctions.selHAttrNdVals'( hAttrNames, hAttrVals,nSep,vSep)
WebUI.delay(5)
//SetText tag
CustomKeywords.'com.BB.genralFunctions.setTextTag'(TextTag,nSep)
WebUI.delay(5)
//Click on Measure Name
CustomKeywords.'com.BB.genralFunctions.SetMsrValbyFunc'(msrNames,minVal ,maxVal, nSep)
WebUI.delay(5)

//Select attributes/measure for show data
CustomKeywords.'com.BB.genralFunctions.doShowData'(showDataAttrName, nSep)
WebUI.delay(5)
//Apply Sort and stats on measures
//Click on Sort control Icon
//Select measures and set  sort order
CustomKeywords.'com.BB.genralFunctions.doSort'(sortAttrName,  sortStatus, nSep,vSep )
WebUI.delay(10)
//Select measure for enable stats
CustomKeywords.'com.BB.genralFunctions.doStats'(statsAttrName, nSep)
//Click on done in Sort and Stats control
CustomKeywords.'com.BB.genralFunctions.sortDone'(sortAttrName,statsAttrName)
//Group by attributes and tags
CustomKeywords.'com.BB.genralFunctions.clickGrpAttrs'(groupByAttrName,  nSep)
CustomKeywords.'com.BB.genralFunctions.clickGrpTags'(groupByTag)
//Set Item limit
CustomKeywords.'com.BB.genralFunctions.setItemLimit'(limit)



//Apply filters
CustomKeywords.'standardFunc.AllstandardFunc.FilterApplyBtn'()
WebUI.delay(5)

//Get tooltip Info
CustomKeywords.'standardFunc.AllstandardFunc.CompareTooltipInfo'(expectedToolTipInfo)










