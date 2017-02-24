/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Developer
 */
public class usermodel {
    private String username,password,firstname,lastname,email,mobilenumber;
    private int userid;
    
    public void setuserid(int id)
    {
        userid = id;
    }
    
    public int getuserid()
    {
        return userid;
    }
    
    
    
    public void setname(String s)
    {
        username = s;
    }
    
    public String getname()
    {
        return username;
    }
   
    public void setfirstname(String fn)
    {
        firstname = fn;
    }
    
    public String getfirstname()
    {
        return firstname;
    }
    
    public void setemail(String ml)
    {
        email = ml;
    }
    
    public String getemail()
    {
        return email;
    }
    
    public void setmob (String mb)
    {
        mobilenumber = mb;
    }
    
    public String getmob()
    {
        return mobilenumber;
    }
    
    public void setlastname(String ln)
    {
        lastname = ln;
    }
    
    public String getlastname()
    {
        return lastname;
    }
        
    public void setpassword(String p)
    {
        password = p;
    }
    public String getpassword()
    {
        return password;
    }
}
