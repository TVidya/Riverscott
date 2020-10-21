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
//import org.eclipse.jetty.client.ContinueProtocolHandler.ContinueListener as ContinueListener
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

KeywordLogger log = new KeywordLogger()

//Open browser
//WebUI.openBrowser(null)
//Navigate to URL and login into kanvasCID008
//CustomKeywords.'com.test.demo.KanvasLoginCustomFunctions.KLoginSYSTST'()
//Click on kanvaslogo
//WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/kanvaslogo'))
//WebUI.delay(5)
//Reset all filters in My Selection
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.ResetAllFlts'()
//Click on attributes and values using inputdata files
//click on attrName
//TestObject attrN = CustomKeywords.'com.BB.genralFunctions.makeTestObject'('div', attrName, 'wrap-attr-name', '', '', '')
//WebUI.click(attrN)
//WebUI.delay(5)
//click on attrVals
//CustomKeywords.'com.BB.genralFunctions.clickAttrVals'(attrVals)
CustomKeywords.'com.BB.genralFunctions.selAttrNdVals'( attrNames, attrVals,nSep,vSep,'wrap-attr-name')
//Stats
//Click on Sort control
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/MainButns/li_Attributes_statSortBtns'),
	5)
WebUI.delay(5)
//WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/GroupSort/GroupSort'))
//stats
CustomKeywords.'com.BB.genralFunctions.doStats'(groupSortAttrName, nSep)

CustomKeywords.'com.BB.genralFunctions.sortDone'()
//TestObject statAttr = CustomKeywords.'com.BB.genralFunctions.makeTestObject'('', '', '', '', '', '', '',statsAttrName)
//WebUI.delay(5)
//CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(statAttr,10)

/*show data
WebUI.verifyElementPresent(findTestObject('Final Objects/MySelection/MainButns/Showmsrsbtn'), 10, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.click(findTestObject('Final Objects/MySelection/MainButns/Showmsrsbtn'))
WebUI.delay(5)
CustomKeywords.'com.BB.genralFunctions.enableShowData'()

/*
//showdata make object

TestObject sdAttr = CustomKeywords.'com.BB.genralFunctions.makeTestObject'('', '', '', '', '', '', showDataAttrName)
WebUI.delay(5)
if((WebUI.verifyElementNotChecked(sdAttr, 5,FailureHandling.OPTIONAL )) == true)
{
	CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(sdAttr,10)
	WebUI.delay(5)
	WebUI.click(findTestObject('Final Objects/MySelection/MainButns/SaveNdApplyShowdata'))
	WebUI.click(findTestObject('Final Objects/MySelection/MainButns/SD-SuccessOKbtn'))
} else
{
	TestObject closeShowdata = CustomKeywords.'com.BB.genralFunctions.makeTestObject'('button', '', 'close-icon-lg-blue', '', '', '', '')
	WebUI.delay(5)
	WebUI.click(closeShowdata)
	
}

//WebUI.delay(10)
 * 
 */
/*
//Select hierarchy icon
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/li_Attributes_hierarchyBtn'))
WebUI.delay(5)
//click on hierarchy attribute name
//TestObject hattrN = CustomKeywords.'com.BB.genralFunctions.makeTestObject'('div', hAttrName
//, 'wrap-hattr-name', '', '', '')
CustomKeywords.'com.BB.genralFunctions.selAttrNdVals'( hAttrNames, hAttrVals,nSep,vSep,'wrap-hattr-name')
//WebUI.click(hattrN)
//WebUI.delay(5)
//click on hierarchyvalues
//CustomKeywords.'com.BB.genralFunctions.clickAttrVals'(hAttrval)
//WebUI.delay(5)
//Click on Hsave button
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/hierarchysave'))
WebUI.delay(5)
//Click on Tags Tab
WebUI.click(findTestObject('Final Objects/MySelection/Tags/tagstab'))
//Click on input box and enter Text tag
WebUI.setText(findTestObject('Final Objects/MySelection/Tags/settexttag'), 'ktest1')
WebUI.sendKeys(findTestObject('Final Objects/MySelection/Tags/settexttag'), Keys.chord(Keys.ENTER))
//Switch to attributes
WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/a_Attributes-Switch'))
//Group by attributes and tags
//Click on Result Control Menu
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/MainButns/ResultControlMenu'),10)
WebUI.delay(5)
//Group by attribute and tags
//TestObject grpAttr = CustomKeywords.'com.BB.genralFunctions.makeTestObject'('label','' , 'lbl_cls','' , 'for', groupByAttrName)
//TestObject grpAttr = CustomKeywords.'com.BB.genralFunctions.makeTestObject'('input','' , 'grp-check','' , 'data-grp', groupByAttrName)
CustomKeywords.'com.BB.genralFunctions.clickGrpAttrs'(groupByAttrName,nSep)
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Object Repository/Final Objects/MySelection/Tags/Group_Texts_tag'),10)
WebUI.delay(5)
//Click on Result Control Apply
//WebUI.click(findTestObject('Object Repository/Final Objects/MySelection/MainButns/Result control Apply Button'))
//WebUI.delay(5)
//Click on Sort control
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/MainButns/li_Attributes_statSortBtns'),
	5)
WebUI.delay(5)
*/
//click on sort icon
//TestObject sortAttr = CustomKeywords.'com.BB.genralFunctions.makeTestObject'('span', '', 'sort-icon-sm-darkgrey', '', 'data-sort', sortAttrName)
//WebUI.click(sortAttr)
//WebUI.delay(5)87oiuytfdsryuiop[

//WebUI.click(findTestObject('Final Objects/MySelection/MainButns/button_Done'))
/*
//Click on Sort control
CustomKeywords.'com.test.demo.MySelectionCustomFunctions.clickUsingJS'(findTestObject('Final Objects/MySelection/MainButns/li_Attributes_statSortBtns'),
	5)
WebUI.delay(5)
//CustomKeywords.'com.BB.genralFunctions.doSort'(sortAttrName,  sortStatus, nSep,vSep )
//CustomKeywords.'com.BB.genralFunctions.sortDone'()
 
//showdata make object
TestObject sortAttr = CustomKeywords.'com.BB.genralFunctions.makeTestObject'('', '', '', '', '', '', statsAttrName)
WebUI.click(sortAttr)
WebUI.delay(5)
CustomKeywords.'com.BB.genralFunctions.sortDone'()
*/
