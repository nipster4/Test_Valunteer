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
WebUI.navigateToUrl('http://vivblind.play2pay.me/')
WebUI.click(findTestObject('register_Volunteer/regis/register_btn/register_btn'))
WebUI.delay(2)


Random ran = new Random();
int num = ran.nextInt(26) + (byte)'a';
System.out.println((char)num);
String randomString = (char)num;
String randomEmail = randomString + "@gmail.com";

WebUI.setText(findTestObject('branch/branch_info/input_branches_name'), randomString+'frde')
//int branch_name = 10
//Random rand = new Random()
//int index = rand.nextInt(branch_name + 1)
//
//WebUI.selectOptionByIndex(testObject, index)

//Random ran = new Random();
//int num = ran.nextInt(26) + (byte)'a';
//System.out.println((char)num);
//String randomString = (char)num;
//String randomEmail = randomString + "@gmail.com";


String randomNumber = "";
for (int i = 0; i < 14; i++) {
	int number = ran.nextInt(9);
	randomNumber += number;
}


WebUI.setText(findTestObject('Object Repository/register_Volunteer/input_email'),GlobalVariable.email)
WebUI.setText(findTestObject('Object Repository/register_Volunteer/input_password'),GlobalVariable.password)
WebUI.setText(findTestObject('Object Repository/register_Volunteer/input_confirm_password'),GlobalVariable.confirm_password)
WebUI.setText(findTestObject('Object Repository/register_Volunteer/input_first_name_th'),GlobalVariable.first_name_th)
WebUI.setText(findTestObject('Object Repository/register_Volunteer/input_last_name_th'),GlobalVariable.last_name_th)
WebUI.setText(findTestObject('Object Repository/register_Volunteer/input_first_name_en'),GlobalVariable.first_name_en)
WebUI.setText(findTestObject('Object Repository/register_Volunteer/input_last_name_en'),GlobalVariable.last_name_en)
WebUI.setText(findTestObject('Object Repository/register_Volunteer/input_BIRTH_DATE'),GlobalVariable.birth_day)
WebUI.selectOptionByLabel(findTestObject('Object Repository/register_Volunteer/input_RELIGION'), GlobalVariable.religion, false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/register_Volunteer/input_EDUCATIONAL'), GlobalVariable.education, false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/register_Volunteer/input_CAREER'), GlobalVariable.career, false)
WebUI.setText(findTestObject('Object Repository/register_Volunteer/input_ADDRESS_NO'),GlobalVariable.address_no)
WebUI.setText(findTestObject('Object Repository/register_Volunteer/input_ADDRESS_MOO'),GlobalVariable.address_moo)
WebUI.setText(findTestObject('Object Repository/register_Volunteer/input_ADDRESS_ROAD'),GlobalVariable.address_road)

WebUI.selectOptionByLabel(findTestObject('Object Repository/register_Volunteer/input_ADDRESS_PROVINCE'), GlobalVariable.address_province, false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/register_Volunteer/input_ADDRESS_DISTRICT'), GlobalVariable.address_district, false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/register_Volunteer/input_ADDRESS_SUBDISTRICT'), GlobalVariable.address_subdistrict, false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/register_Volunteer/input_ADDRESS_POSTCODE'),GlobalVariable.address_postcode)

WebUI.selectOptionByLabel(findTestObject('Object Repository/register_Volunteer/input_STATUS_EDU_WORK'),GlobalVariable.status_edu_work, false)
WebUI.setText(findTestObject('Object Repository/register_Volunteer/input_ADDRESS_ALL'),GlobalVariable.address_all)
WebUI.setText(findTestObject('Object Repository/register_Volunteer/input_PHONE'),GlobalVariable.phone)
WebUI.setText(findTestObject('Object Repository/register_Volunteer/input_CELL_PHONE'),GlobalVariable.cell_phone)
WebUI.setText(findTestObject('Object Repository/register_Volunteer/input_FAX'),GlobalVariable.fax)



WebUI.click(findTestObject('register_Volunteer/input_submit'))
WebUI.delay(2)

WebUI.verifyTextPresent('ขอบคุณสำหรับการลงทะเบียนโปรดตรวจสอบที่อีเมลของท่านเพื่อทำการระบุตัวตน', false)



//WebUI.closeBrowser()

