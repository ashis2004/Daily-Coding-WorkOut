import java.math.BigInteger;
class Solution 
{
  public String addBinary(String a, String b) 
  {

    BigInteger b1 = new BigInteger(a, 2);
        
        // 2. Create a BigInteger from the binary string 'b' (radix 2)
        BigInteger b2 = new BigInteger(b, 2);
        
        // 3. Add them together
        BigInteger sum = b1.add(b2);
        
        // 4. Convert the result back to a binary string (radix 2)
        return sum.toString(2);
    // StringBuilder sb = new StringBuilder();
    // int carry = 0;
    // int i = a.length() - 1;
    // int j = b.length() - 1;

    // while (i >= 0 || j >= 0 || carry == 1) 
    // {
    //   if(i >= 0)
    //     carry += a.charAt(i--) - '0';
    //   if(j >= 0)
    //     carry += b.charAt(j--) - '0';
    //   sb.append(carry % 2);
    //   carry /= 2;
    // }
    // return sb.reverse().toString();
  }
}