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

KeywordLogger log = new KeywordLogger()

WebUI.openBrowser(null)

//Navigate to URL and login into kanvas
//CustomKeywords.'com.test.demo.KanvasLoginCustomFunctions.KLogin'()
CustomKeywords.'com.test.demo.KanvasLoginCustomFunctions.KLoginSYSTST'()
//Switch to My Selection
WebUI.click(findTestObject('Final Objects/Dashboard/img'))
WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('Final Objects/MySelection/MainButns/Showmsrsbtn'), 10, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.click(findTestObject('Final Objects/MySelection/MainButns/Showmsrsbtn'))
WebUI.delay(10)


/*
//Enable Show data
Show = WebUI.verifyElementChecked(findTestObject('Object Repository/14-mar/showdata/Page_SLICeR Kanvas - My Selection/label_Show1'),10,FailureHandling.CONTINUE_ON_FAILURE)
if(Show == true)
{
	log.logInfo("checked")
}else
{
	WebUI.click(findTestObject('Object Repository/14-mar/showdata/Page_SLICeR Kanvas - My Selection/label_Show'))
}

//Enable Hide data
//Hide = WebUI.verifyElementChecked(findTestObject('Object Repository/14-mar/showdata/Page_SLICeR Kanvas - My Selection/label_Hide1'),10,FailureHandling.CONTINUE_ON_FAILURE)
if((WebUI.verifyElementChecked(findTestObject('Object Repository/14-mar/showdata/Page_SLICeR Kanvas - My Selection/label_Hide1'),10,FailureHandling.CONTINUE_ON_FAILURE)) == true)
{
	log.logInfo("checked")
	KeywordUtil.markPassed('SUCCESS:-------------HIDE data is already checked-------------')
}
else
{
	WebUI.click(findTestObject('Object Repository/14-mar/showdata/Page_SLICeR Kanvas - My Selection/label_Hide'))
	KeywordUtil.markPassed('SUCCESS:-------------Hide data is now checked-------------')
	}

//Check Measure
*/
//CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Show Data/SD-4weeks ros'), 
//    10)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/Show Data/budgetSD'),
	10)

//CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/13-mar/summarychk'),10)
WebUI.click(findTestObject('Final Objects/MySelection/MainButns/SaveNdApplyShowdata'))

WebUI.click(findTestObject('Final Objects/MySelection/MainButns/SD-SuccessOKbtn'))

