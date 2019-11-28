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

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC004/F0204-TC001/นิสิตปัจจุบัน'))

WebUI.delay(1)

WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC004/F0204-TC007 and F0204-TC008/ทุนการศึกษา'))

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC004/F0204-TC007 and F0204-TC008/กองกิจการนิสิต'), 20)

WebUI.verifyElementText(findTestObject('แสดงผลแถบเมนู/F02_SC004/F0204-TC007 and F0204-TC008/กองกิจการนิสิต'), 'กองกิจการนิสิต')

WebUI.verifyElementClickable(findTestObject('แสดงผลแถบเมนู/F02_SC004/F0204-TC007 and F0204-TC008/กองกิจการนิสิต'))

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC004/F0204-TC007 and F0204-TC008/กองบริการการศึกษา'), 20)

WebUI.verifyElementText(findTestObject('แสดงผลแถบเมนู/F02_SC004/F0204-TC007 and F0204-TC008/กองบริการการศึกษา'), 'กองบริการการศึกษา')

WebUI.verifyElementClickable(findTestObject('แสดงผลแถบเมนู/F02_SC004/F0204-TC007 and F0204-TC008/กองบริการการศึกษา'))

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

