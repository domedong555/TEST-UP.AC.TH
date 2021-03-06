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

'ตรวจสอบการแสดง Up Clip\r\n-ปุ่ม Up clipทั้งหมด\r\n-รูปที่แสดง 4 รูป\r\n--มีหัวข้อใต้ภาพ'
WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Clip/imgClip1'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Clip/detailClip1'), 20)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Clip/imgClip2'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Clip/detailClip2'), 20)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Clip/imgClip3'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Clip/detailClip3'), 20)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Clip/imgClip4'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Clip/detailClip4'), 20)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Show Homepage/Clip/AllClip'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

