package assignment;

import java.util.regex.Pattern;

public class ValidInput
{
    public boolean phoneNumber(String number)
    {
        String pattern= "^[0-9+;,*#]+$";
        boolean matches = Pattern.matches(pattern,number);
        return matches;
    }

    public boolean EmailAddress(String mail)
    {
        String pattern="^[\\w\\d_][\\w\\d_.]*@[\\w\\d_.]+$";
        boolean matches=Pattern.matches(mail,pattern);
        return matches;
    }
}
