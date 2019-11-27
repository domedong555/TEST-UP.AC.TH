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

'ตรวจสอบการแสดง ที่อยู่\r\n-มหาวิทยาลัยพะเยา\r\n19 หมู่ 2 ตำบลแม่กา อำเภอเมืองพะเยา\r\nจังหวัดพะเยา 56000\r\nโทร. 0 5446 6666\r\nโทรสาร 0 5446 6690\r\nอีเมล์. uppr@up.ac.th\r\n-ปุ่มกดสัญลักษณ์ มหาวิทยาลัย\r\n-จำนวนผู้เข้าชม\r\n-icon hitstats\r\n-icon IPv4\r\n-icon IPv6'
WebUI.delay(3)

WebUI.verifyTextPresent('มหาวิทยาลัยพะเยา', false)

WebUI.verifyElementVisible(findTestObject('Show Homepage/Footer location/imgUP'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Footer location/statusViews'), 20)

WebUI.verifyElementVisible(findTestObject('Show Homepage/Footer location/imgip4'))

WebUI.verifyElementVisible(findTestObject('Show Homepage/Footer location/imgip6'))

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

