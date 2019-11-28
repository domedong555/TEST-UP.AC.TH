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

'แสดงแถบเมนู\r\n-ที่อยู่\r\n-คำถามที่พบบ่อย\r\n-เบอร์โทรภายใน\r\n-ช่องทางแจ้งเรื่องร้องเรียนการทุจริต\r\n-ข้อเสนอแนะเพื่อการพัฒนา\r\n-ชมเชย\r\n-ติดต่อสอบถาม'
WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC008/F0208_TC001/contact'))

WebUI.verifyTextPresent(GlobalVariable.G_address, false)

WebUI.verifyTextPresent(GlobalVariable.G_question, false)

WebUI.verifyTextPresent(GlobalVariable.G_contactnumber, false)

WebUI.verifyTextPresent(GlobalVariable.G_currupt, false)

WebUI.verifyTextPresent(GlobalVariable.G_offer, false)

WebUI.verifyTextPresent(GlobalVariable.G_Compliment, false)

WebUI.verifyTextPresent(GlobalVariable.G_contact2, false)

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

