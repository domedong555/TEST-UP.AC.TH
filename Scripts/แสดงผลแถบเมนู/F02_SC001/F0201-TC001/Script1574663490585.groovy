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

'แสดงหน้า หน้าจอหลัก'
WebUI.openBrowser(GlobalVariable.G_url)

WebUI.maximizeWindow()

'แสดงปุ่มต่อจากแถบเมนู "เกี่ยวกับเรา"'
WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC001/F0201-TC001/เกี่ยวกับเรา'))

// check infomation menu
WebUI.verifyTextPresent(GlobalVariable.G_history, false)


WebUI.delay(1)

'แสดงหน้า ประวัติความเป็นมา'
WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC001/F0201-TC001/ประวัติความเป็นมา'))

WebUI.delay(1)


'แสดงการจัดการศึกษา ตารางจำนวนคณะ'
WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC001/F0201-TC001/การจัดการศึกษา'))

WebUI.delay(1)

'แสดงการบริหารงาน รูปแบบตาราง'
WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC001/F0201-TC001/การบริหารงาน'))

WebUI.delay(1)

'แสดงรูปภาพมหาวิทยาลัย'
WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC001/F0201-TC001/รูปมหาวิทยาลัยพะเยา'))

WebUI.delay(1)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

