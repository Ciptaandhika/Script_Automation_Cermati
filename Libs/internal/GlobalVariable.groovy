package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile Production : Link untuk masuk Gabung Cermati</p>
     */
    public static Object urlGabungCermati
     
    /**
     * <p>Profile Production : set text nama email</p>
     */
    public static Object Email
     
    /**
     * <p>Profile Production : Password Gabung Cermati</p>
     */
    public static Object Password
     
    /**
     * <p>Profile Production : nama depan user</p>
     */
    public static Object Nama_Depan
     
    /**
     * <p>Profile Production : Nama belakang User</p>
     */
    public static Object Nama_Belakang
     
    /**
     * <p>Profile Production : Nomor Telephone User</p>
     */
    public static Object Nomor_telephone
     
    /**
     * <p>Profile Production : user pilih kota</p>
     */
    public static Object Kabupaten_Kota
     

    static {
        def allVariables = [:]        
        allVariables.put('default', [:])
        allVariables.put('Production', allVariables['default'] + ['urlGabungCermati' : 'https://www.cermati.com/gabung ', 'Email' : 'ciptaandhika21@gmail.com', 'Password' : 'Ciptaca7', 'Nama_Depan' : 'Cipta', 'Nama_Belakang' : 'Andhika', 'Nomor_telephone' : '081517097359', 'Kabupaten_Kota' : 'Depok'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        def selectedVariables = allVariables[profileName]
		
		for(object in selectedVariables){
			String overridingGlobalVariable = RunConfiguration.getOverridingGlobalVariable(object.key)
			if(overridingGlobalVariable != null){
				selectedVariables.put(object.key, overridingGlobalVariable)
			}
		}

        urlGabungCermati = selectedVariables["urlGabungCermati"]
        Email = selectedVariables["Email"]
        Password = selectedVariables["Password"]
        Nama_Depan = selectedVariables["Nama_Depan"]
        Nama_Belakang = selectedVariables["Nama_Belakang"]
        Nomor_telephone = selectedVariables["Nomor_telephone"]
        Kabupaten_Kota = selectedVariables["Kabupaten_Kota"]
        
    }
}
