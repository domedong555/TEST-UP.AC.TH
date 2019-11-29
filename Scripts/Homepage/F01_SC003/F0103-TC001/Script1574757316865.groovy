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

'แสดงหน้าปฏิทินกิจกรรม\r\n-มีรูปกิจกรรมในแต่ละช่วงจำนวน 8 รูป'
WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/Calen1'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/Calen2'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/Calen3'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/Calen4'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/Calen5'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/Calen6'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/Calen7'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/Calen8'), 20)

'แสดงหน้าปฏิทินกิจกรรม\r\n-มีการแสดงวันที่'
WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/Date1'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/Date2'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/Date3'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/Date4'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/Date5'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/Date6'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/Date7'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/Date8'), 20)

'แสดงหน้าปฏิทินกิจกรรม\r\n-มีการแสดงสถานที่'
WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/loca1'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/loca2'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/loca3'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/loca4'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/loca5'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/loca6'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/loca7'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/loca8'), 20)

'แสดงหน้าปฏิทินกิจกรรม\r\n-มีหัวข้อใต้ภาพ'
WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/head1'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/head2'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/head3'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/head4'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/head5'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/head6'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/head7'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Calendar/head8'), 20)

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

