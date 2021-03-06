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
WebUI.navigateToUrl(GlobalVariable.G_url)

WebUI.maximizeWindow()

'ตรวจสอบการแสดงเมนู\r\n-สัญลักษณ์มหาวิทยาลัยพะเยา\r\n-ปุ่มเว็บไซต์เวอร์ชั่นเดิม\r\n-ปุ่มเปลี่ยนภาษา\r\n-ปุ่มรูปบ้าน(หน้าหลัก)\r\n-เกี่ยวกับเรา\r\n-รางวัล\r\n-บุคลากร\r\n-นิสิติปัจจุบัน\r\n-คู่มือนิสิต\r\n-ศิษย์เก่า\r\n-E-service\r\n-ติดต่อเรา'
WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/About/History/เกี่ยวกับเรา'), 0)

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/NewsTopAwardAll/Award/รางวัล'), 0)

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/personel/personal_intro/บุคลากร'), 0)

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/collegian/Intro_student/นิสิตปัจจุบัน'), 0)

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/Student_manual/คู่มือนิสิต'), 0)

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/alumni/ศิษย์เก่า'), 0)

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/E_Service/e-Service'), 0)

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/contact/address/contact'), 0)

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

