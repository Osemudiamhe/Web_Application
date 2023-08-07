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

WebUI.navigateToUrl('https://www.hopepsbank.com/digitalbanking')

WebUI.click(findTestObject('Object Repository/Login and Statement Generation (HopePSB)/button_Login to Continue'))

WebUI.setText(findTestObject('Object Repository/Login and Statement Generation (HopePSB)/input_Back_username-input'), '08079644224')

WebUI.setEncryptedText(findTestObject('Object Repository/Login and Statement Generation (HopePSB)/input_Back_username-input_1'), 
    'wf1WyMFXOdjubV6dh7MdAQ==')

WebUI.click(findTestObject('Object Repository/Login and Statement Generation (HopePSB)/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Login and Statement Generation (HopePSB)/button_Generate Statement'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Login and Statement Generation (HopePSB)/select_Select Account 201 - 2010069089  211_d8a885'), 
    '2010069089', true)

WebUI.click(findTestObject('Object Repository/Login and Statement Generation (HopePSB)/input_Date From_date'))

WebUI.click(findTestObject('Object Repository/Login and Statement Generation (HopePSB)/i_2,000.00_mx-icon-left'))

WebUI.click(findTestObject('Object Repository/Login and Statement Generation (HopePSB)/div_1'))

WebUI.click(findTestObject('Object Repository/Login and Statement Generation (HopePSB)/input_Date From_date'))

WebUI.click(findTestObject('Object Repository/Login and Statement Generation (HopePSB)/div_14'))

WebUI.setText(findTestObject('Object Repository/Login and Statement Generation (HopePSB)/input_Email Address_input-amount'), 
    'preciousighodalo@gmail.com')

WebUI.click(findTestObject('Object Repository/Login and Statement Generation (HopePSB)/button_Send'))

WebUI.closeBrowser()

