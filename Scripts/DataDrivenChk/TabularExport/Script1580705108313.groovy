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
import com.kms.katalon.keyword.excel.ExcelKeywords

import com.kms.katalon.keyword.excel.ExcelKeywords


KeywordLogger log = new KeywordLogger()


//Click on Workspace Name
CustomKeywords.'com.BB.genralFunctions.loadWorkspace'(workspaceName,nSep)

//chk sort order
CustomKeywords.'com.BB.genralFunctions.tdoSort'(tsortAttrName,tattrStatus,nSep,vSep)

//chk sort order for row fields
//chk sort order
CustomKeywords.'com.BB.genralFunctions.trowdoSort'(tsortRAttrName,tattrRStatus,nSep,vSep)

//Tabular apply

CustomKeywords.'com.BB.genralFunctions.TabularApply'()

/*
//Click on Kanvas Logo
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/kanvaslogo'))



//alerts handling
CustomKeywords.'com.BB.genralFunctions.alertHandling'()


//Switch To Standard Mode
CustomKeywords.'com.BB.genralFunctions.switchToStandard'()


//Reset all filters in My Selection
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ResetAllFlts'()


//Filter with attributes
//Select multiple attributes and values
CustomKeywords.'com.BB.genralFunctions.selAttrNdVals'( attrNames, attrVals,nSep,vSep)


//Apply Filters
//Click on apply
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.FilterApplyBtn'()
CustomKeywords.'com.BB.genralFunctions.longDelay'()

//config tabular
CustomKeywords.'com.BB.genralFunctions.configTabular'(rowFields, colFields, dataFields, nSep, to,msrNameT,aggrType,rowSubTotal,preview,colSubTotal,grandTotal,itemCount,tableName,exportFileName,expectedPath,actualPath)
//Filters with in the tabular
//CustomKeywords.'com.BB.genralFunctions.tblselAttrNdVals'(tattrNames, tattrVals, nSep, vSep)

//Apply Tabular
CustomKeywords.'com.BB.genralFunctions.TabularApply'()

//Reset Attributes or measures
//CustomKeywords.'com.BB.genralFunctions.resetAttrOrMsr'(resetAttrOrMsrnm, nSep)

//Copy Pivot
//CustomKeywords.'com.BB.genralFunctions.copyPivotTbl'(copyPivot)

//Save Tabular
//CustomKeywords.'com.BB.genralFunctions.SaveWorkspace'(workspaceNameS)
*/

/*

//Switch to Tabular switchToTabular
CustomKeywords.'com.BB.genralFunctions.switchToTabular'()


//Open Tab configuration slider
CustomKeywords.'com.BB.genralFunctions.openTabularConfig'()


//config tabular
CustomKeywords.'com.BB.genralFunctions.configTabular'(rowFields, colFields, dataFields, nSep, to)

//set aggregation for measure
CustomKeywords.'com.BB.genralFunctions.setAggrForMsr'(msrNameT,aggrType,nSep)

//Set Row subtotal
CustomKeywords.'com.BB.genralFunctions.rowSubTotalStatus'(rowSubTotal)

//Set Preview
CustomKeywords.'com.BB.genralFunctions.previewStatus'(preview)

//Set Col subtotal
CustomKeywords.'com.BB.genralFunctions.colSubTotalStatus'(colSubTotal)

//Set GrandTotal
CustomKeywords.'com.BB.genralFunctions.grandTotalStatus'(grandTotal)

//Set ItemCount   
CustomKeywords.'com.BB.genralFunctions.itemCountStatus'(itemCount)

//Set TableName
CustomKeywords.'com.BB.genralFunctions.setTableName'(tableName)

//Apply Tabular
//CustomKeywords.'com.BB.genralFunctions.TabularApply'()

//Click on Attribute name
CustomKeywords.'com.BB.genralFunctions.tblselAttrNdVals'(tattrNames, tattrVals, nSep, vSep)
*/

/*
//Export Tabular
CustomKeywords.'com.BB.genralFunctions.exportAllTabular'(exportFileName)
WebUI.delay(20)

//Compare Tabular
CustomKeywords.'com.BB.genralFunctions.compareTabular'(expectedPath,actualPath)



*/



/*
//Click on Layout Icon
CustomKeywords.'com.BB.genralFunctions.switchToLayoutFromTabular'()

//Click on Export Button
CustomKeywords.'com.BB.genralFunctions.clickOnExportBtnL'()

//Click on scheudle button
CustomKeywords.'com.BB.genralFunctions.switchToScheduleL'()

//Set Export Mode 
CustomKeywords.'com.BB.genralFunctions.selectExportMode'()
*/

