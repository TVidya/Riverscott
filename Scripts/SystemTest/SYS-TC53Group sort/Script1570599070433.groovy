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
//Navigate to URL and login into kanvas
CustomKeywords.'com.test.demo.KanvasLoginCustomFunctions.KLoginSYSTST'()
//Click on Side Menu
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/sidebar-Menu button'))
WebUI.delay(5)
//Navigate to Workspaces
WebUI.click(findTestObject('Object Repository/Final Objects/LoadWSfromWSmodule/navigate to ws'))
WebUI.delay(5)
//Load Workspace
WebUI.click(findTestObject('Object Repository/Final Objects/LoadWSfromWSmodule/loadWS'))
WebUI.delay(10)
//Click on Sort controls
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/GroupSort/SortNdstatscontrolbtn'))
WebUI.delay(5)
//Click on summary check box
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/GroupSort/8weeksros-stats'),10)
WebUI.delay(5)
//Click on group sort tab
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/GroupSort/GroupSort'))
WebUI.delay(5)
//Click on sort on measure in group sort tab
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/GroupSort/sortascend-4wkros'),10)
//Select aggregation dropdown
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/GroupSort/grpsortaggdropdwn'))
WebUI.delay(5)
//Select aggregation as SUM
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/GroupSort/grpsortagg-SUM'))
WebUI.delay(5)
//Apply grpsort done
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/GroupSort/btndonegrpsort'))
WebUI.delay(5)
//Click on result control menu
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/ResultControlMenu'))
WebUI.delay(5)
//Group by brand
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/Attributes/Group_brand'),10)
WebUI.delay(5)
//Apply group from result control menu
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/Result control Apply Button'))
WebUI.delay(5)

//Compare expected and actual itemcount
expected = WebUI.verifyElementPresent(findTestObject('Final Objects/Validation Objects/Expected/SystemTest/SYS-TC53-EIC'), 10,
	FailureHandling.CONTINUE_ON_FAILURE)

actual = WebUI.getText(findTestObject('Final Objects/Validation Objects/Actual/ActualItemCnt'))

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.CompareItemCnt'(expected, actual)
//Verify tooltip info present  and click on tooltip info
WebUI.verifyElementPresent(findTestObject('Object Repository/Final Objects/MySelection/MainButns/TooltipInfo'), 10)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ClickInfoBtn'()
WebUI.delay(5)
//Compare expected and actual tooltip info
tiexpected = WebUI.verifyElementPresent(findTestObject('Object Repository/Final Objects/Validation Objects/Expected/SystemTest/SYS-TC53- EFI'), 10,
	FailureHandling.CONTINUE_ON_FAILURE)

tiactual = WebUI.getText(findTestObject('Final Objects/Validation Objects/Actual/ActualFilterInfo'))

log.logInfo(tiactual)

CustomKeywords.'com.test.demo.MySelectionCustomFunctions.CompareTooltipInfo'(tiexpected, tiactual)


//Close browser
//WebUI.closeBrowser()
