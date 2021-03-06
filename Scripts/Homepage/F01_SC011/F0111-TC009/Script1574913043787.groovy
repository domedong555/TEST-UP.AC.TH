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

WebUI.delay(3)

'แสดงแถบเมนู\r\n-ที่อยู่\r\n-คำถามที่พบบ่อย\r\n-เบอร์โทรภายใน\r\n-ช่องทางแจ้งเรื่องร้องเรียนการทุจริต\r\n-ข้อเสนอแนะเพื่อการพัฒนา\r\n-ชมเชย\r\n-ติดต่อสอบถาม'
WebUI.click(findTestObject('แสดงผลแถบเมนู/collegian/Intro_student/นิสิตปัจจุบัน'))

WebUI.delay(1)

WebUI.click(findTestObject('แสดงผลแถบเมนู/collegian/scholarship/ทุนการศึกษา'))

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/collegian/scholarship/กองกิจการนิสิต'), 20)

WebUI.verifyElementText(findTestObject('แสดงผลแถบเมนู/collegian/scholarship/กองกิจการนิสิต'), 'กองกิจการนิสิต')

WebUI.verifyElementClickable(findTestObject('แสดงผลแถบเมนู/collegian/scholarship/กองกิจการนิสิต'))

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/collegian/scholarship/กองบริการการศึกษา'), 20)

WebUI.verifyElementText(findTestObject('แสดงผลแถบเมนู/collegian/scholarship/กองบริการการศึกษา'), 'กองบริการการศึกษา')

WebUI.verifyElementClickable(findTestObject('แสดงผลแถบเมนู/collegian/scholarship/กองบริการการศึกษา'))

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

