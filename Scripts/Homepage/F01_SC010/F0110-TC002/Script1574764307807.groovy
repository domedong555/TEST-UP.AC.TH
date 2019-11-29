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
WebUI.navigateToUrl(GlobalVariable.G_url)

WebUI.maximizeWindow()

'แสดงหน้า เมนูของ \r\nลิงค์เกี่ยวข้อง\r\n-QA Information System\r\n-ระบบสนับสนุนการตัดสินใจสำหรับผู้บริหาร\r\n-วารสารมหาวิทยาลัยพะเยา\r\n-Speexx\r\n-ระบบวาระการประชุมอิเล็กทรอนิกส์\r\n-หมวดวิชาศึกษาทั่วไป\r\n-ระบบแบบประเมินออนไลน์โดยบัณฑิตและผู้ใช้บัณฑิต\r\n-สัญลักษณ์ facebook\r\n-สัญลักษณ์ ig\r\n-สัญลักษณ์ youtube\r\n-สัญลักษณ์ line'
WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Footer/Other links/01chancellor'), 20)

WebUI.verifyElementPresent(findTestObject('Footer/Other links/02ministry'), 20)

WebUI.verifyElementPresent(findTestObject('Footer/Other links/03basiceducation'), 20)

WebUI.verifyElementPresent(findTestObject('Footer/Other links/04Medical'), 20)

WebUI.verifyElementPresent(findTestObject('Footer/Other links/05National test'), 20)

WebUI.verifyElementPresent(findTestObject('Footer/Other links/06knowledge'), 20)

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

