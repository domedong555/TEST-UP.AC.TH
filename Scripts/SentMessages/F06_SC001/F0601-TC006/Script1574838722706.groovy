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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.up.ac.th/th/')

WebUI.click(findTestObject('SentMessages/HOUP/a_Contact'))

WebUI.delay(1)

WebUI.click(findTestObject('SentMessages/HOUP/a__1'))

WebUI.setText(findTestObject('SentMessages/Function/input_name'), 'Naphatsakorn S.')

WebUI.setText(findTestObject('SentMessages/Function/input_email'), 'james.11350@gmail.com')

WebUI.setText(findTestObject('SentMessages/Function/input_title'), 'Test')

WebUI.setText(findTestObject('SentMessages/Function/input_textarea'), 'Test Test!@#$%^')

WebUI.click(findTestObject('SentMessages/Function/sent'))

WebUI.delay(1)

WebUI.closeBrowser()

