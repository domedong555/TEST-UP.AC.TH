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

'แสดงแถบเมนูู\r\n-นโยบายการบริหารทรัพยากรบุคคล\r\n-การดำเนินการตามนโยบายการบริหารทรัพยากรบุคคล\r\n-หลักเกณฑ์การบริหารและพัฒนาทรัพยากรบุคคล\r\n-รายงานผลการบริหารและพัฒนาทรัพยากรบุคคลประจำปี'
WebUI.click(findTestObject('แสดงผลแถบเมนู/personel/personal_intro/บุคลากร'))

WebUI.delay(1)

WebUI.click(findTestObject('แสดงผลแถบเมนู/personel/policy/นโยบายการบริหารทรัพยากรบุคคล'))

WebUI.verifyElementText(findTestObject('แสดงผลแถบเมนู/personel/policy/หน้านโยบายการบริหาร'), 'นโยบายการบริหารทรัพยากรบุคคล')

WebUI.verifyElementClickable(findTestObject('แสดงผลแถบเมนู/personel/policy/หน้านโยบายการบริหาร'))

WebUI.verifyElementText(findTestObject('แสดงผลแถบเมนู/personel/policy/การดำเนินการตามแผน'), 'การดำเนินการตามนโยบายการบริหารทรัพยากรบุคคล')

WebUI.verifyElementClickable(findTestObject('แสดงผลแถบเมนู/personel/policy/การดำเนินการตามแผน'))

WebUI.verifyElementText(findTestObject('แสดงผลแถบเมนู/personel/policy/หลักเกณฑ์การบริหารและพัฒนาทรัพยากรบุคคล'), 'หลักเกณฑ์การบริหารและพัฒนาทรัพยากรบุคคล')

WebUI.verifyElementClickable(findTestObject('แสดงผลแถบเมนู/personel/policy/หลักเกณฑ์การบริหารและพัฒนาทรัพยากรบุคคล'))

WebUI.verifyElementText(findTestObject('แสดงผลแถบเมนู/personel/policy/รายงานผลการบริหารและพัฒนาทรัพยากรบุคคลประจำปี'), 
    'รายงานผลการบริหารและพัฒนาทรัพยากรบุคคลประจำปี')

WebUI.verifyElementClickable(findTestObject('แสดงผลแถบเมนู/personel/policy/รายงานผลการบริหารและพัฒนาทรัพยากรบุคคลประจำปี'))

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

