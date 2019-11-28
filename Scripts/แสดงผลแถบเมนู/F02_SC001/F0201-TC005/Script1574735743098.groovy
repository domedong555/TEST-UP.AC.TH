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

'แสดงปุ่มต่อจากแถบเมนู "เกี่ยวกับเรา"'
WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC001/F0201-TC004/เกี่ยวกับเรา'))
WebUI.delay(1)
///Check  Menu Administrator
WebUI.verifyTextPresent(GlobalVariable.G_Administrator, false)
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC001/F0201-TC005/ผู้บริหารมหาวิทยาลัยพะเยา'))
WebUI.delay(1)
///Check menu President
WebUI.verifyTextPresent("ประวัติอธิการบดี", false)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC001/F0201-TC005/ประวัติอธิการบดี'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC001/F0201-TC005/ประวัติและรูปภาพ'))
WebUI.delay(1)
///check picture
WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC001/F0201-TC005/ประวัติและรูปภาพ'), 20)
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC001/F0201-TC005/คุณวุฒิการศึกษา'))
WebUI.delay(1)
///check show text
WebUI.verifyTextPresent("ประวัติอธิการบดีมหาวิทยาลัยพะเยา", false)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC001/F0201-TC005/ประสบการณ์ด้านการสอน ในสถาบันการศึกษาระดับอุดมศึกษา'))
WebUI.delay(1)
///check show text
WebUI.verifyTextPresent("ประสบการณ์ด้านการสอน ในสถาบันการศึกษาระดับอุดมศึกษา", false)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC001/F0201-TC005/ประสบการณ์ด้านการบริหารในสถาบันการศึกษาระดับอุดมศึกษา'))
WebUI.delay(1)
///check show text
WebUI.verifyTextPresent("ประสบการณ์ด้านการบริหารในสถาบันการศึกษาระดับอุดมศึกษา", false)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC001/F0201-TC005/ประสบการณ์ด้านอื่นๆ'))
WebUI.delay(1)
///check show text
WebUI.verifyTextPresent("ประสบการณ์ด้านอื่นๆ", false)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC001/F0201-TC005/เครื่องราชอิสริยาภรณ์ชั้นสูงสุดที่ได้รับ'))
WebUI.delay(1)
///check show text
WebUI.verifyTextPresent("เครื่องราชอิสริยาภรณ์ชั้นสูงสุดที่ได้รับ", false)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC001/F0201-TC005/เกียรติประวัติ'))
WebUI.delay(1)
///check show text
WebUI.verifyTextPresent("เกียรติประวัติ", false)
WebUI.delay(1)
WebUI.closeBrowser()



