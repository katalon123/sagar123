import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.axisbank.com/')

WebUI.navigateToUrl('https://clctab.axisbank.co.in/DigitalChannel/WebForm/?index6&_ga=2.17106237.586592390.1642480016-1098874808.1642480016')

WebUI.click(findTestObject('Object Repository/Page_Axis Bank/a_Yes'))

WebUI.setText(findTestObject('Object Repository/Page_Axis Bank/input__mobileinfo_Mob'), '7276470085')

WebUI.setText(findTestObject('Object Repository/Page_Axis Bank/input_Date of Birth_mobileinfo_Dob'), '01/06/1997')

WebUI.click(findTestObject('Object Repository/Page_Axis Bank/a_1'))

WebUI.click(findTestObject('Object Repository/Page_Axis Bank/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Axis Bank/input__otp_Number'))

WebUI.click(findTestObject('Object Repository/Page_Axis Bank/label_I agree to terms and conditions of OTP'))

WebUI.click(findTestObject('Object Repository/Page_Axis Bank/button_I agree'))

WebUI.click(findTestObject('Page_Axis Bank/button_Submit'))

WebUI.verifyTextPresent('This field is mandatory.', false)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

