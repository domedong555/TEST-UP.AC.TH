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

'แสดงแถบเมนู\r\n-ข่าวประชาสัมพันธ์\r\n-ข่าวประกวดราคา\r\n-ข่าวรับสมัครงาน\r\n-UP News\r\n-VDO Clips\r\n-ความเป็นสากล'
WebUI.click(findTestObject('Show Homepage/News Objects/News'))

WebUI.verifyElementText(findTestObject('Show Homepage/News Objects/Information_News'), 'ข่าวประชาสัมพันธ์')

WebUI.verifyElementText(findTestObject('Show Homepage/News Objects/Auction_News'), 'ข่าวประกวดราคา')

WebUI.verifyElementText(findTestObject('Show Homepage/News Objects/Apply_News'), 'ข่าวรับสมัครงาน')

WebUI.verifyElementText(findTestObject('Show Homepage/News Objects/UP News'), 'UP News')

WebUI.verifyElementText(findTestObject('Show Homepage/News Objects/VDO Clips'), 'VDO Clips')

WebUI.verifyElementText(findTestObject('Show Homepage/News Objects/Inter_News'), 'ความเป็นสากล')

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

