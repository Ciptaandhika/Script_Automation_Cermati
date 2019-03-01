import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl GlobalVariable.urlGabungCermati

WebUI.delay(1)

WebUI.setText (findTestObject('Object Repository/Gabung_Cermati/Email_Field_Cermati'),GlobalVariable.Email)

WebUI.delay(1)

WebUI.setText(findTestObject('Gabung_Cermati/Password_Gabung_Cermati'), GlobalVariable.Password)

WebUI.delay(1)

WebUI.setText(findTestObject('Gabung_Cermati/Nama_Depan'), GlobalVariable.Nama_Depan)

WebUI.delay(1)

WebUI.setText(findTestObject('Gabung_Cermati/Nama_Belakang'), GlobalVariable.Nama_Belakang)

WebUI.delay(1)

WebUI.setText(findTestObject('Gabung_Cermati/Nomor_telephone'), GlobalVariable.Nomor_telephone)

WebUI.delay(1)

WebUI.setText(findTestObject('Gabung_Cermati/Kabupaten_Kota'), GlobalVariable.Kabupaten_Kota)

WebUI.delay(1)

WebUI.click(findTestObject('Gabung_Cermati/Click_DaftarAkun'))

//WebUI.verifyElementClickable('Gabung_Cermati/Click_DaftarAkun', 20)