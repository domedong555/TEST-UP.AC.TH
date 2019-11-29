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
import org.openqa.selenium.Keys as Keys
import java.security.SecureRandom as SecureRandom


SecureRandom randomNumbers = new SecureRandom()

String randomValue = ((randomNumbers.nextInt(10000)) as String)

String randomValue2 = ((randomNumbers.nextInt(10000)) as String)

String mail = ('test' + randomValue) + '@gmail.com'

String K = ('test' + randomValue) + '#mail.qwe'

String name = 'test' + randomValue

WebUI.openBrowser(GlobalVariable.G_url)

WebUI.navigateToUrl(GlobalVariable.G_url)

WebUI.click(findTestObject('SentMessages/HOUP/a_Contact'))

WebUI.delay(1)

WebUI.click(findTestObject('SentMessages/HOUP/a__2'))

WebUI.setText(findTestObject('SentMessages/Function/input_name'), GlobalVariable.GS_name + randomValue)

WebUI.setText(findTestObject('SentMessages/Function/input_email'), (GlobalVariable.GS_name + randomValue) + GlobalVariable.GS_add)

WebUI.setText(findTestObject('SentMessages/Function/input_title'), GlobalVariable.GS_title)

WebUI.setText(findTestObject('SentMessages/Function/input_textarea'), GlobalVariable.GS_name+randomValue2+ GlobalVariable.GS_name2)

WebUI.click(findTestObject('SentMessages/Function/sent'))

WebUI.delay(1)

WebUI.closeBrowser()
