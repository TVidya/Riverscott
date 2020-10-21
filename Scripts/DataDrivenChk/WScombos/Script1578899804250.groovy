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

/*
//Click on sideMenu bar
CustomKeywords.'com.BB.genralFunctions.sideMenuBar'()

//Click on Workspace Tab
CustomKeywords.'com.BB.genralFunctions.SwitchtoWorkspace'()

//Click on Shared Workspace Tab
CustomKeywords.'com.BB.genralFunctions.sharedWSTab'()

//Click on My Workspaces Tab
CustomKeywords.'com.BB.genralFunctions.myWSTab'()
*/
//Click on Workspace Name
CustomKeywords.'com.BB.genralFunctions.loadWorkspace'(workspaceName,nSep)

WebUI.delay(10)
//Switch to Tabular switchToTabular
CustomKeywords.'com.BB.genralFunctions.switchToTabular'()
WebUI.delay(5)
//Open Tab configuration slider
CustomKeywords.'com.BB.genralFunctions.openTabularConfig'()
WebUI.delay(5)
//config tabular
CustomKeywords.'com.BB.genralFunctions.configTabular'(rowFields, colFields, dataFields, nSep, to)
//Select attribute brand
//CustomKeywords.'com.BB.genralFunctions.rowFieldsDD'(rowFields,nSep,to)
WebUI.delay(5)
//Drop attribute

//CustomKeywords.'com.BB.genralFunctions.rowFieldsDD'(tAttrName,nSep)
WebUI.delay(20)
//Save Workspace
//CustomKeywords.'com.BB.genralFunctions.SaveWorkspace'(wsName)

//Share Workspace
//CustomKeywords.'com.BB.genralFunctions.doShareWS'(wsNameShare, shareStatus, shareUser, vSep, nSep)


