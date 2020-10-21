import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kanvas-staging.slicerpl.com/')

WebUI.setText(findTestObject('Object Repository/recordedmsrflts/Page_Slicer Kanvas/input_Username_user'), 'vidya@cid008.com')

WebUI.setEncryptedText(findTestObject('Object Repository/recordedmsrflts/Page_Slicer Kanvas/input_Username_encPass'), 'YZuWIKlDlGRyTaAU3XgrqQ==')

WebUI.click(findTestObject('Object Repository/recordedmsrflts/Page_Slicer Kanvas/button_Lets Proceed'))

WebUI.click(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - Dashboard/i_My Selection Preview_maximiz'))

WebUI.click(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - My Selection/i_Y Axis_reset-icon-lg-grey'))

WebUI.click(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - My Selection/div_4weeks ros'))

WebUI.click(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - My Selection/div_sale date1_mCSB_dragger_ba'))

WebUI.setText(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - My Selection/input_MIN_minInput'), 
    '29000')

WebUI.setText(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - My Selection/input_to_maxInput'), '35000')

WebUI.click(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - My Selection/button_Apply'))

WebUI.click(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - My Selection/a_Welcome Vidya'))

WebUI.click(findTestObject('Object Repository/recordedmsrflts/Page_SLICeR Kanvas - My Selection/a_Logout'))

WebUI.closeBrowser()

