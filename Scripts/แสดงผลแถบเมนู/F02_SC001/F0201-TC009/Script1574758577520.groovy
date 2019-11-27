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
WebUI.openBrowser(GlobalVariable.G_Intro_policyurl)
WebUI.maximizeWindow()
WebUI.delay(1)

'แสดงปุ่มต่อจากแถบเมนู "เกี่ยวกับเรา"'
WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC001/F0201-TC004/เกี่ยวกับเรา'))
WebUI.delay(1)
///Check  Menu Intro_About2
WebUI.verifyTextPresent(GlobalVariable.G_Intro_policyIntro_About2, false)
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC001/F0201-TC009/ปรัชญา ปณิธาน พันธกิจ วิสัยทัศน์'))
WebUI.delay(1)

///Check Show Intro_About2 page
WebUI.verifyTextPresent("เกี่ยวกับเรา > ปรัชญา / ปณิธาน / วิสัยทัศน์ / พันธกิจ", false)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC001/F0201-TC009/1'))
WebUI.delay(1)
///Check text in Intro_About2 page
WebUI.verifyTextPresent("ปรัชญา และปณิธาน มหาวิทยาลัยพะเยา", false)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC001/F0201-TC009/2'))
WebUI.delay(1)
///Check text in Intro_About2 page
WebUI.verifyTextPresent("วิสัยทัศน์", false)
WebUI.delay(1)

WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC001/F0201-TC009/3'))
WebUI.delay(1)
///Check text in Intro_About2 page
WebUI.verifyTextPresent("พันธกิจ (Mission)", false)
WebUI.delay(1)
WebUI.closeBrowser()
