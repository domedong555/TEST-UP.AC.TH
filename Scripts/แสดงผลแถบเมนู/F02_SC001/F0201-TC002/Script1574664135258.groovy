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
WebUI.delay(1)

///Check about menu
WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/About/History/เกี่ยวกับเรา'), 20)
WebUI.delay(1)

'แสดงปุ่มต่อจากแถบเมนู "เกี่ยวกับเรา"'
WebUI.click(findTestObject('แสดงผลแถบเมนู/About/Symbol/เกี่ยวกับเรา'))
WebUI.delay(1)
///check symbol menu
WebUI.verifyTextPresent(GlobalVariable.G_Symbol, false)
WebUI.delay(1)

'แสดงหน้า ประวัติความเป็นมา'
WebUI.click(findTestObject('แสดงผลแถบเมนู/About/Symbol/สัญลักษณ์ของมหาวิทยาลัย'))
WebUI.delay(1)
///check text
WebUI.verifyTextPresent("สัญลักษณ์ของมหาวิทยาลัย", false)
WebUI.delay(1)

WebUI.click(findTestObject('แสดงผลแถบเมนู/About/Symbol/พระพุทธภุชคารักษ์'))
WebUI.delay(1)
///check text
WebUI.verifyTextPresent("พระพุทธภุชคารักษ์", false)
WebUI.delay(1)

WebUI.click(findTestObject('แสดงผลแถบเมนู/About/Symbol/สมเด็จพระนเรศวรมหาราช'))
WebUI.delay(1)
///check text
WebUI.verifyTextPresent("สมเด็จพระนเรศวรมหาราช", false)
WebUI.delay(1)

WebUI.click(findTestObject('แสดงผลแถบเมนู/About/Symbol/สัญลักษณ์ประจำมหาวิทยาลัยพะเยา'))
WebUI.delay(1)
///check text
WebUI.verifyTextPresent("สัญลักษณ์ประจำมหาวิทยาลัยพะเยา", false)
WebUI.delay(1)

WebUI.click(findTestObject('แสดงผลแถบเมนู/About/Symbol/สีประจำมหาวิทยาลัย'))
WebUI.delay(1)
///check text
WebUI.verifyTextPresent("สีประจำมหาวิทยาลัย", false)
WebUI.delay(1)

WebUI.click(findTestObject('แสดงผลแถบเมนู/About/Symbol/เพลงประจำมหาวิทยาลัย'))
WebUI.delay(1)

WebUI.click(findTestObject('แสดงผลแถบเมนู/About/Symbol/ต้นไม้ประจำมหาวิทยาลัยพะเยา'))
WebUI.delay(1)
///check text
WebUI.verifyTextPresent("ต้นไม้ประจำมหาวิทยาลัยพะเยา", false)
WebUI.delay(1)

WebUI.click(findTestObject('แสดงผลแถบเมนู/About/Symbol/ชุดครุยแห่งความภูมิใจ'))
WebUI.delay(1)
///check text
WebUI.verifyTextPresent("ชุดครุยแห่งความภูมิใจ", false)
WebUI.delay(1)

WebUI.closeBrowser()

