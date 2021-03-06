import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')
// invalid email
WebUI.navigateToUrl('http://vivblind.play2pay.me/')
WebUI.setText(findTestObject('Login/input_EMAIL'), 'mocopw@gmail.com')
WebUI.setText(findTestObject('Login/input_password'), '11111')
WebUI.click(findTestObject('Login/button_'))
WebUI.delay(2)

WebUI.verifyTextPresent('กรุณากรอก รหัสสมาชิก หรือ รหัสผ่านให้ถูกต้อง', false)
WebUI.delay(2)

//invalid password
WebUI.navigateToUrl('http://vivblind.play2pay.me/')
WebUI.setText(findTestObject('Login/input_EMAIL'), 'mocomocopw@gmail.com')
WebUI.setText(findTestObject('Login/input_password'), '111')
WebUI.click(findTestObject('Login/button_'))
WebUI.delay(2)

WebUI.verifyTextPresent('กรุณากรอก รหัสสมาชิก หรือ รหัสผ่านให้ถูกต้อง', false)

WebUI.closeBrowser()