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

'ตวรจสอบการแสดงเรื่องเด่น\r\n-รูปเกี่ยวกับเรื่องเด่นจำนวน 3 รูป\r\n-#ด้านต่างๆที่แสดง\r\n--มีหัวข้อใต้ภาพ\r\n-วันที่\r\n-จำนวนผู้เข้าชม\r\n-ปุุ่มเรื่องเด่นทั้งหมด'
WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Show Homepage/GoodNews/img1'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/GoodNews/title1'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/GoodNews/Detail1'), 20)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Show Homepage/GoodNews/img2'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/GoodNews/title2'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/GoodNews/Deatail3'), 20)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Show Homepage/GoodNews/title3'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/GoodNews/img3'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/GoodNews/Deatail3'), 20)

WebUI.delay(3)

WebUI.navigateToUrl('https://www.up.ac.th/th/UP_News.aspx')

WebUI.delay(3)

WebUI.click(findTestObject('Homepage menu/News Active select page/img__nextbtn'))

WebUI.delay(3)

WebUI.click(findTestObject('Homepage menu/News Active select page/img__prevbtn'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Homepage menu/News Active select page/Search Result/img_prev'), 
    20)

WebUI.verifyElementPresent(findTestObject('Homepage menu/News Active select page/Search Result/a_prev'), 
    20)

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

