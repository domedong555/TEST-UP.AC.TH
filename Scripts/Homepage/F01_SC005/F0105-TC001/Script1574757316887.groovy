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

'ตรวจสอบการแสดง ข่าวสาร ความเคลื่อนไหว\r\n- มีการแสดงรูปข่าวสารความเคลื่อไหว 4 รูป\r\n- หัวข้อใต้รูป\r\n- เลื่อน preview รูปอัตโนมัติ\r\n- แสดงวันที่\r\n- แสดงจำนวนคนดู\r\n- แสดงประเภท #\r\n- แสดงสถานะว่าเป็นข่าวใหม่'
WebUI.verifyElementPresent(findTestObject('Show Homepage/Active/All_activeNews'), 
    60)

'ตรวจสอบการแสดง ข่าวสาร ความเคลื่อนไหว\r\n- สามารถกดดู "ข่าวทั้งหมด" ด้านข้างหัวข้อได้'
WebUI.verifyElementClickable(findTestObject('Show Homepage/Active/ShowAll_activeNews'))

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

