import java.util.*;
class IpAddress
{
	public static ArrayList<String>
		restoreIpAddress(String A)
	{
		if(A.length()<3||A.length()>12)
			return new ArrayList<>();
		return convert(A);
	}
	private static ArrayList<String>
		convert(String s)
	{
		ArrayList<String>l=new ArrayList<>();
		int size =s.length();
		String snew=s;
		for(int i=1;i<size-2;i++)
		{
			for(int j=i+1;j<size-1;j++)
			{
				for(int k=j+1;k<size;k++)
				{
					snew=snew.substring(0,k)+"."+snew.substring(k);
					snew=snew.substring(0,j)+"."+snew.substring(j);
					snew=snew.substring(0,i)+"."+snew.substring(i);
					if(isValid(snew))
					{
						l.add(snew);
					}
					snew=s;
				}
			}
		}
		Collections.sort(l,new Comparator<String>()
		{
			public int Compare(String o1,String o2)
			{
				String a1[]=o1.split("[.]");
				String a2[]=o2.split("[.]");
				int result=-1;
				for(int i=0;i<4&&result!=0;i++)
				{
					result=a1[i].CompareTo(a2[i]);
				}
				return result;
			}
		});
		return l;
	}
	private static boolean isValid(String ip)
	{
		String a[]=ip.split("[.]");
		for(String s:a)
		{
			int i=Integer.parseInt(s);
			if(s.length()>3||i<0||i>255)
			{
				return false;
			}
			if(s.length()>1&&i==0)
			return false;
			if(s.length()>1&&i!=0&&s.charAt(0)=='0')
				return false;
		}
		return false;
	}
	public static void main(String[] args)
	{
		System.out.println(restoreIpAddress("257833193").toString());
	}
		
}

