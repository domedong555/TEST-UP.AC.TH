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

'แสดงหน้า จุลสารข่าว\r\n-รูปปกหนังสือ\r\n-ปุ่มจุลสารข่าวทั้งหมด\r\n--มีหัวข้อใต้ภาพ\r\n-ปุ่มคลิกเพื่ออ่าน'
WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Information/imginformation'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Information/detailinformation'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Information/btninformation'), 20)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Show Homepage/Information/Allinformation'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

