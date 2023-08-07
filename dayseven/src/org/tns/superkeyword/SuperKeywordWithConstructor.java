package org.tns.superkeyword;

class Google
{
	String ceo;

	public Google(String ceo) 
	{
		System.out.println(ceo);
	}
}

class Gmail extends Google
{
	String userid;
	public Gmail(String ceo,String userid)
	{
		super(ceo);
		this.userid = userid;
		System.out.println(userid);
	}
	

public class SuperKeywordWithConstructor {

	public void main(String[] args) {
		Gmail g = new Gmail(userid, userid);
		System.out.println(g);
	}

}
}
