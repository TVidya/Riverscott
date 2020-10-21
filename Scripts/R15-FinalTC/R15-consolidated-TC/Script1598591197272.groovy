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
CustomKeywords.'generalFunc.AllgenralFunc.startFresh'(startFresh)

//Filter with attributes
//Select allattribute  values
CustomKeywords.'standardFunc.AllstandardFunc.clickOnSelAllVals'(attrNameSelAllVals, nSep)
//(new generalFunc.AllgenralFunc()).shortDelay()

//Select multiple attributes and values by search attribute name
CustomKeywords.'standardFunc.AllstandardFunc.searchAttrNdFlt'(sAttrNM, attrVals,nSep,vSep)
//(new generalFunc.AllgenralFunc()).shortDelay()

//Select hierarchy attribute and values
CustomKeywords.'standardFunc.AllstandardFunc.selHAttrNdVals'( hAttrNames, hAttrVals,nSep,vSep)
//(new generalFunc.AllgenralFunc()).shortDelay()

//SetText tag
CustomKeywords.'standardFunc.AllstandardFunc.setTextTag'(TextTag,nSep)
//(new generalFunc.AllgenralFunc()).shortDelay()

//SetColour Tag
CustomKeywords.'standardFunc.AllstandardFunc.setColorTag'(clrGrpNM, ColorTag, nSep, vSep)
//(new generalFunc.AllgenralFunc()).shortDelay()


//Click on Measure Name
CustomKeywords.'standardFunc.AllstandardFunc.searchMsrNdFlt'(sMsrNM,minVal ,maxVal, nSep,vSep)
//(new generalFunc.AllgenralFunc()).shortDelay()

//Select attributes/measure for show data
CustomKeywords.'standardFunc.AllstandardFunc.doShowData'(showDataAttrName, nSep)
//(new generalFunc.AllgenralFunc()).shortDelay()


//Group by attributes
CustomKeywords.'standardFunc.AllstandardFunc.clickGrpAttrs'(groupByAttrName,  nSep)
//(new generalFunc.AllgenralFunc()).shortDelay()

//Group by Text Tags
CustomKeywords.'standardFunc.AllstandardFunc.clickGrpTextTags'(grpByTextTag)
//(new generalFunc.AllgenralFunc()).shortDelay()

//Group by Colour Tags
CustomKeywords.'standardFunc.AllstandardFunc.clickGrpClrTags'(grpByClrTag)
//(new generalFunc.AllgenralFunc()).shortDelay()

//Set Item limit
CustomKeywords.'standardFunc.AllstandardFunc.setItemLimit'(limit)
//(new generalFunc.AllgenralFunc()).shortDelay()

//Apply Filters
//Click on apply
CustomKeywords.'standardFunc.AllstandardFunc.FilterApplyBtn'()
//CustomKeywords.'generalFunc.AllgenralFunc.shortDelay'()

//Save as workspace
CustomKeywords.'standardFunc.AllstandardFunc.SaveWorkspace'(wsName,keepShareStngs)
//CustomKeywords.'generalFunc.AllgenralFunc.shortDelay'()


//Load workspace
CustomKeywords.'standardFunc.AllstandardFunc.loadWorkspace'(workspaceName, nSep)
//CustomKeywords.'generalFunc.AllgenralFunc.shortDelay'()

//Apply Sort and stats on measures
//Click on Sort control Icon
//Select measures and set  sort order
CustomKeywords.'standardFunc.AllstandardFunc.doSort'(sortAttrName,  sortStatus, nSep,vSep )
//WebUI.delay(10)

//Select measure for enable stats
CustomKeywords.'standardFunc.AllstandardFunc.doStats'(statsAttrName, nSep)
//(new generalFunc.AllgenralFunc()).shortDelay()

//Click on done in Sort and Stats control
CustomKeywords.'standardFunc.AllstandardFunc.sortDone'(sortAttrName,statsAttrName)
//(new generalFunc.AllgenralFunc()).shortDelay()


//Apply Filters
//Click on apply
CustomKeywords.'standardFunc.AllstandardFunc.FilterApplyBtn'()
//CustomKeywords.'generalFunc.AllgenralFunc.shortDelay'()


//Validate in Item Window
CustomKeywords.'standardFunc.AllstandardFunc.validateAttriw'(aiwitemID, attrNMiw, expattrVals, nSep, vSep)
CustomKeywords.'standardFunc.AllstandardFunc.validateMsriw'(miwitemID,msrNM, expmsrVals, nSep, vSep)


//Do Search Keyword
CustomKeywords.'standardFunc.AllstandardFunc.doSearch'(searchStatus, searchKeyword)
//(new generalFunc.AllgenralFunc()).shortDelay()


//compare item count
CustomKeywords.'standardFunc.AllstandardFunc.CompareItemCnt'(expectedItemCnt)
//(new generalFunc.AllgenralFunc()).shortDelay()

//CustomKeywords.'standardFunc.AllstandardFunc.CompareTooltipInfo'(expectedToolTipInfo)
//(new generalFunc.AllgenralFunc()).shortDelay()


//Switch to layout and load Template
CustomKeywords.'layoutFunc.AlllayoutFunc.loadTemplate'(tempName)
(new generalFunc.AllgenralFunc()).shortDelay()

//Export template
CustomKeywords.'layoutFunc.AlllayoutFunc.exportTemplateL'(tplExportFnm, tplExportFormat)
//CustomKeywords.'generalFunc.AllgenralFunc.longDelay'()





























