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

'기본설정'
WebUI.click(findTestObject('base/menu_basic'))

WebUI.setText(findTestObject('base/basic info/input_mallNm'), '자동화')

WebUI.setText(findTestObject('base/basic info/input_mallNmEng'), 'Test Auto eng')

WebUI.setText(findTestObject('base/basic info/input_mallTitle'), '환타')

WebUI.setText(findTestObject('base/basic info/input_companyNm'), '회사 상호 자동화')

WebUI.setText(findTestObject('base/basic info/input_businessNo'), '519')

WebUI.setText(findTestObject('base/basic info/input_ceoNm'), '대표이름')

WebUI.setText(findTestObject('base/basic info/input_service'), '전자상거래')

WebUI.setText(findTestObject('base/basic info/input_item'), '의류')

WebUI.setText(findTestObject('base/basic info/input_email'), 'test')

WebUI.setText(findTestObject('base/basic info/input_email2'), 'godo.co.kr')

WebUI.setText(findTestObject('base/basic info/input_addressSub'), '코오롱빌란트 1차')

WebUI.click(findTestObject('base/basic info/input_returnFl( )'), FailureHandling.CONTINUE_ON_FAILURE //출고지 주소 : 사업장 주소와 동일 클릭
    )

WebUI.click(findTestObject('base/basic info/input_returnFl( ) (1)'), FailureHandling.CONTINUE_ON_FAILURE //반품/교환지 : 주소 출고지 주소와 동일 클릭
    )

for (def index : (0..3)) {
	WebUI.setText(findTestObject('base/basic info/input_phone'), '0200000000')
	
	WebUI.setText(findTestObject('base/basic info/input_fax'), '0200001111')
	
	WebUI.setText(findTestObject('base/basic info/input_onlineOrderSerial'), '2018')
}

WebUI.click(findTestObject('base/basic info/input_btn btn-red_save'))

WebUI.waitForElementPresent(findTestObject('base/basic info/x button'), 2)

WebUI.verifyEqual(WebUI.getUrl(), 'http://gdadmin.hwanta71.godomall.com/policy/base_info.php')

