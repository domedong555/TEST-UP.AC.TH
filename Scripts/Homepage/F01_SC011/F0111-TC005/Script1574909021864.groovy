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

'แสดงหน้า "หน้าจอหลัก"'
WebUI.navigateToUrl('https://www.up.ac.th/th/')

WebUI.maximizeWindow()

WebUI.delay(3)

'แสดงแถบเมนูู\r\n-ข้อมูลเชิงสถิติการให้บริการ\r\n-รายงานผลสำรวจความพึงพอใจการให้บริการ\r\n-คู่มือด้านผลิตบัณฑิต'
WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC001/บุคลากร'))

WebUI.delay(1)

WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC005 to F0203-TC007/การให้บริการ'))

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC005 to F0203-TC007/ข้อมูลเชิงสถิติการให้บริการตามภารกิจของมหาวิทยาลัยพะเยา'), 
    20)

WebUI.verifyElementText(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC005 to F0203-TC007/ข้อมูลเชิงสถิติการให้บริการตามภารกิจของมหาวิทยาลัยพะเยา'), 
    'ข้อมูลเชิงสถิติการให้บริการ')

WebUI.verifyElementClickable(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC005 to F0203-TC007/ข้อมูลเชิงสถิติการให้บริการตามภารกิจของมหาวิทยาลัยพะเยา'))

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC005 to F0203-TC007/รายงานความพึงพอใจ'), 20)

WebUI.verifyElementText(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC005 to F0203-TC007/รายงานความพึงพอใจ'), 'รายงานผลสำรวจความพึงพอใจการให้บริการ')

WebUI.verifyElementClickable(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC005 to F0203-TC007/รายงานความพึงพอใจ'))

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC005 to F0203-TC007/คู่มือด้านผลิตบัณฑิต'), 20)

WebUI.verifyElementText(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC005 to F0203-TC007/คู่มือด้านผลิตบัณฑิต'), 'คู่มือด้านผลิตบัณฑิต')

WebUI.verifyElementClickable(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC005 to F0203-TC007/คู่มือด้านผลิตบัณฑิต'))

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

