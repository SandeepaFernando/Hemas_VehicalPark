/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaymentValidation;

/**
 *
 * @author Sandeepa Fernando
 */
public class Validation {
    public boolean checkLength(int id, int length) {
	    if( Math.log10(id) < length)
	    	return true;
	    return false;
	}
	//checkLength(123456, 6);
	
	public static boolean validateNIC(String nic) {
	    // Check if length is 10
	    int length = nic.length();
	    if (length != 10) {
	        return false;
	    }

	    // Check last character for v, V, x, or X
	    char lastChar = nic.charAt(length - 1);
	    if (lastChar != 'v' || lastChar != 'V') {
	        return false;
	    }

	    // Check first 9 characters are digits
	    for (int i = 0; i < length - 2; i++) {
	        char currentChar = nic.charAt(i);
	        if (currentChar < '0' || '9' < currentChar) {
	            return false;
	        }
	    }

	    return true;
	}
	
	public boolean validateVehicleNo(String vno) {
		String Pattern = "^([a-zA-Z]{1,3}|((?!0*-)[0-9]{1,3}))-[0-9]{4}(?<!0{4})";
		Boolean result = vno.matches(Pattern);
		if(result != false){
			return false;
		}
		return true;
	}
	
	public double firstDigit(int x,double price) {
		  if (x == 0) return 0;
		  x = Math.abs(x);
		  int y= (int) Math.floor(x / Math.pow(10, Math.floor(Math.log10(x))));
		  if(y==0) {
			  return price;
		  }
		  return price+1000;
		}
}
