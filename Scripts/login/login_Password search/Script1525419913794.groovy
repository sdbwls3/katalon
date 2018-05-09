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

WebUI.navigateToUrl('g5stdhwanta7.godomall.com')

WebUI.click(findTestObject('TOP/top_navi/header_login'))

'비밀번호 찾기'
WebUI.click(findTestObject('Page/login/Page login/button_password_search'))

'아이디 입력'
WebUI.setText(findTestObject('Page/login/search/Password search/input_memberId'), 'hwanta')

'다음버튼 클릭'
WebUI.click(findTestObject('Page/login/search/Password search/button_next'))

'이메일 인증 체크'
WebUI.click(findTestObject('Page/login/search/Password search/label_email auth'))

'다음버튼 클릭'
WebUI.click(findTestObject('Page/login/search/Password search/button_next'))

WebUI.delay(2)

alert = WebUI.getAlertText()

'alert 메일발송 메세지 확인'
WebUI.verifyMatch(alert, '메일이 발송되었습니다.', false)

WebUI.acceptAlert()

WebUI.click(findTestObject('Page/login/search/Password search/button_before'))

'sms 인증 체크'
WebUI.click(findTestObject('Page/login/search/Password search/label_SMS auth'))

'다음버튼 클릭'
WebUI.click(findTestObject('Page/login/search/Password search/button_next'))

WebUI.delay(2)

alert2 = WebUI.getAlertText()

'alert sms발송 메세지 확인'
WebUI.verifyMatch(alert2, 'SMS가 발송되었습니다.', false)

WebUI.acceptAlert()

