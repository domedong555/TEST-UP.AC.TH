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

'แสดงหน้า หน้าจอหลัก'
WebUI.openBrowser(GlobalVariable.G_url)
WebUI.maximizeWindow()
WebUI.delay(1)

WebUI.click(findTestObject('Homepage menu/All news/รางวัลและความภาคภูมิใจ'))
WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Homepage menu/All news/รางวัลและความภาคภูมิใจ ทั้งหมด'),20)
WebUI.delay(1)

WebUI.click(findTestObject('Homepage menu/All news/รางวัลและความภาคภูมิใจ ทั้งหมด'))
WebUI.delay(1)

///check page 
WebUI.verifyElementPresent(findTestObject('Homepage menu/All news/ช่องค้นหาหน้า รางวัลและความภาคภูมิใจ'),20)
WebUI.delay(1)
WebUI.verifyTextPresent('รางวัลและความภาคภูมิใจ', false)
WebUI.delay(1)
WebUI.verifyTextPresent('ข่าวเด่น', false)
WebUI.delay(1)
WebUI.closeBrowser()