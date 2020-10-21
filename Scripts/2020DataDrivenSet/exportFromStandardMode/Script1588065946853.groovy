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
import java.awt.Robot;
import java.awt.event.KeyEvent;
Robot r = new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);


KeywordLogger log = new KeywordLogger()

//Start fresh or continue
CustomKeywords.'generalFunc.AllgenralFunc.kanvasLogo'()
WebUI.delay(5)


/*
//Click on ResetAllfilters
CustomKeywords.'standardFunc.AllstandardFunc.ResetAllFlts'()
//Filter by attributes
CustomKeywords.'standardFunc.AllstandardFunc.selAttrNdVals'(attrNames, attrVals, nSep, vSep)
//Exportfrom Standard Mode
CustomKeywords.'standardFunc.AllstandardFunc.exportFrmSM'(ESMfileNM, ESMcmnts)
*/
//Export from Dashboard
CustomKeywords.'com.BB.genralFunctions.exportTabularFromDashboard'(exportFileName)
WebUI.delay(20)
/*
//Click on Download
TestObject PDFfile = CustomKeywords.'com.BB.genralFunctions.makeTestObject'('span', '', '', 'title', '', '', '')
WebUI.sendKeys(PDFfile, Keys.chord(Keys.CONTROL,'s'))

WebUI.delay(2)
WebUI.delay(10)


//Compare Tabular
//CustomKeywords.'tabularFunc.AlltabularFunc.compareTabularR15'(exportFileName,expectedPath,actualPath)


*/












