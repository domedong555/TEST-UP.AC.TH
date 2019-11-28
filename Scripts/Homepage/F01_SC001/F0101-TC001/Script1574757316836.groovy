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

WebUI.openBrowser('')

'แสดงหน้า "หน้าจอหลัก"'
WebUI.navigateToUrl('https://www.up.ac.th/th/')

WebUI.maximizeWindow()

'ตรวจสอบการแสดงเมนู\r\n-สัญลักษณ์มหาวิทยาลัยพะเยา\r\n-ปุ่มเว็บไซต์เวอร์ชั่นเดิม\r\n-ปุ่มเปลี่ยนภาษา\r\n-ปุ่มรูปบ้าน(หน้าหลัก)\r\n-เกี่ยวกับเรา\r\n-รางวัล\r\n-บุคลากร\r\n-นิสิติปัจจุบัน\r\n-คู่มือนิสิต\r\n-ศิษย์เก่า\r\n-E-service\r\n-ติดต่อเรา'
WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC001/F0201-TC001/เกี่ยวกับเรา'), 0)

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC002/F0202-TC001 to F0202-TC003/รางวัล'), 0)

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC001/บุคลากร'), 0)

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC004/F0204-TC001/นิสิตปัจจุบัน'), 0)

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC005/F0205-TC001/คู่มือนิสิต'), 0)

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC006/F0206-TC001/ศิษย์เก่า'), 0)

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC007/F0207-TC001/e-Service'), 0)

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC008/F0208_TC001/contact'), 0)

'ตรวจสอบการแสดงเมนู\r\n-สมัครเข้าศึกษา\r\n-คณะ/หน่วยงาน\r\n-ข่าว\r\n-วิจัย \r\n-e-Learning'
WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Show Homepage/navbar 2/admis'), 0)

WebUI.verifyElementPresent(findTestObject('Show Homepage/navbar 2/depm'), 0)

WebUI.verifyElementPresent(findTestObject('Show Homepage/navbar 2/news'), 0)

WebUI.verifyElementPresent(findTestObject('Show Homepage/navbar 2/research'), 0)

WebUI.verifyElementPresent(findTestObject('Show Homepage/navbar 2/e-Learning'), 0)

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

