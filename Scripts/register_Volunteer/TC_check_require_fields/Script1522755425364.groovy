import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')
WebUI.navigateToUrl('http://vivblind.play2pay.me/')
WebUI.delay(2)

WebUI.click(findTestObject('register_Volunteer/regis/register_btn/register_btn'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/register_Volunteer/input_FAX'),GlobalVariable.fax)
WebUI.delay(1)
WebUI.click(findTestObject('register_Volunteer/input_submit'))
WebUI.delay(2)

WebUI.verifyTextPresent('กรุณากรอกอีเมลที่ใช้งานจริงเพื่อให้ทางมูลนิธิติดต่อกลับได้', false)
WebUI.verifyTextPresent('กรุณากรอกรหัสสมาชิก', false)
WebUI.verifyTextPresent('กรุณากรอกรหัสผ่าน', false)
WebUI.verifyTextPresent('กรุณายืนยันรหัสผ่านของท่าน', false)
WebUI.verifyTextPresent('กรุณากรอกชื่อ', false)
WebUI.verifyTextPresent('กรุณากรอกนามสกุล', false)
WebUI.verifyTextPresent('กรุณากรอกชื่อภาษาอังกฤษ', false)
WebUI.verifyTextPresent('กรุณากรอกนามสกุลภาษาอังกฤษ', false)
WebUI.verifyTextPresent('กรุณาเลือกระดับการศึกษา', false)
WebUI.verifyTextPresent('กรุณาเลือกอาชีพ', false)
WebUI.verifyTextPresent('กรุณากรอกเลขที่', false)
WebUI.verifyTextPresent('กรุณาเลือกจังหวัด', false)
WebUI.verifyTextPresent('กรุณาเลือกอำเภอ', false)
WebUI.verifyTextPresent('กรุณาเลือกตำบล', false)
WebUI.verifyTextPresent('กรุณากรอกรหัสไปรษณีย์', false)
WebUI.verifyTextPresent('กรุณาเลือกสถานะ การศึกษา,ทำงาน', false)
WebUI.verifyTextPresent('กรุณากรอกเบอร์มือถือ', false)

WebUI.closeBrowser()

