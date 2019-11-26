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

'ตรวจสอบการแสดง รางวัลและความภาคภูมิใจ\r\n-รูปรางวัลและความภาคภูมิใจจำนวน 4 รูป\r\n-วันที่\r\n-จำนวนผู้ชม\r\n-ด้านต่างๆที่แสดง #'
WebUI.verifyElementPresent(findTestObject('Show Homepage/Reward/imgrewart1'), 
    20)

'ตรวจสอบการแสดง รางวัลและความภาคภูมิใจ\r\n-รูปรางวัลและความภาคภูมิใจจำนวน 4 รูป\r\n-วันที่\r\n-จำนวนผู้ชม\r\n-ด้านต่างๆที่แสดง #'
WebUI.verifyElementPresent(findTestObject('Show Homepage/Reward/titlerewart1'), 
    20)

'ตรวจสอบการแสดง รางวัลและความภาคภูมิใจ\r\n-รูปรางวัลและความภาคภูมิใจจำนวน 4 รูป\r\n-วันที่\r\n-จำนวนผู้ชม\r\n-ด้านต่างๆที่แสดง #'
WebUI.verifyElementPresent(findTestObject('Show Homepage/Reward/detailrewart1'), 
    20)

WebUI.delay(3)

'ตรวจสอบการแสดง รางวัลและความภาคภูมิใจ\r\n-รูปรางวัลและความภาคภูมิใจจำนวน 4 รูป\r\n-วันที่\r\n-จำนวนผู้ชม\r\n-ด้านต่างๆที่แสดง #'
WebUI.verifyElementPresent(findTestObject('Show Homepage/Reward/imgrewart2'), 
    20)

'ตรวจสอบการแสดง รางวัลและความภาคภูมิใจ\r\n-รูปรางวัลและความภาคภูมิใจจำนวน 4 รูป\r\n-วันที่\r\n-จำนวนผู้ชม\r\n-ด้านต่างๆที่แสดง #'
WebUI.verifyElementPresent(findTestObject('Show Homepage/Reward/titlerewart2'), 
    20)

'ตรวจสอบการแสดง รางวัลและความภาคภูมิใจ\r\n-รูปรางวัลและความภาคภูมิใจจำนวน 4 รูป\r\n-วันที่\r\n-จำนวนผู้ชม\r\n-ด้านต่างๆที่แสดง #'
WebUI.verifyElementPresent(findTestObject('Show Homepage/Reward/detailrewart2'), 
    20)

WebUI.delay(3)

'ตรวจสอบการแสดง รางวัลและความภาคภูมิใจ\r\n-รูปรางวัลและความภาคภูมิใจจำนวน 4 รูป\r\n-วันที่\r\n-จำนวนผู้ชม\r\n-ด้านต่างๆที่แสดง #'
WebUI.verifyElementPresent(findTestObject('Show Homepage/Reward/imgrewart3'), 
    20)

'ตรวจสอบการแสดง รางวัลและความภาคภูมิใจ\r\n-รูปรางวัลและความภาคภูมิใจจำนวน 4 รูป\r\n-วันที่\r\n-จำนวนผู้ชม\r\n-ด้านต่างๆที่แสดง #'
WebUI.verifyElementPresent(findTestObject('Show Homepage/Reward/titlerewart3'), 
    20)

'ตรวจสอบการแสดง รางวัลและความภาคภูมิใจ\r\n-รูปรางวัลและความภาคภูมิใจจำนวน 4 รูป\r\n-วันที่\r\n-จำนวนผู้ชม\r\n-ด้านต่างๆที่แสดง #'
WebUI.verifyElementPresent(findTestObject('Show Homepage/Reward/detailrewart3'), 
    20)

WebUI.delay(3)

'ตรวจสอบการแสดง รางวัลและความภาคภูมิใจ\r\n-รูปรางวัลและความภาคภูมิใจจำนวน 4 รูป\r\n-วันที่\r\n-จำนวนผู้ชม\r\n-ด้านต่างๆที่แสดง #'
WebUI.verifyElementPresent(findTestObject('Show Homepage/Reward/imgrewart4'), 
    20)

'ตรวจสอบการแสดง รางวัลและความภาคภูมิใจ\r\n-รูปรางวัลและความภาคภูมิใจจำนวน 4 รูป\r\n-วันที่\r\n-จำนวนผู้ชม\r\n-ด้านต่างๆที่แสดง #'
WebUI.verifyElementPresent(findTestObject('Show Homepage/Reward/titlerewart4'), 
    20)

'ตรวจสอบการแสดง รางวัลและความภาคภูมิใจ\r\n-รูปรางวัลและความภาคภูมิใจจำนวน 4 รูป\r\n-วันที่\r\n-จำนวนผู้ชม\r\n-ด้านต่างๆที่แสดง #'
WebUI.verifyElementPresent(findTestObject('Show Homepage/Reward/detailrewart4'), 
    20)

WebUI.delay(3)

'ตรวจสอบการแสดง รางวัลและความภาคภูมิใจ\r\n-มีปุ่ม ข่าวทั้งหมด'
WebUI.verifyElementClickable(findTestObject('Show Homepage/Reward/AllNews_Rewart'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

