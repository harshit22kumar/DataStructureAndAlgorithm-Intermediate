//diffrence between date.
#include<iostream>
using namespace std;
int main()
{
	int dd1,mm1,yy1,dd2,mm2,yy2,numofdays=0;
	char ignore;
	cout<<"enter your first date"<<endl;
	cin>>dd1>>ignore>>mm1>>ignore>>yy1;
	cout<<"enter your second date"<<endl;
	cin>>dd2>>ignore>>mm2>>ignore>>yy2;
	cout<<dd1<<mm1<<yy1<<dd2<<mm2<<yy2<<endl;
	if(mm1<=2)
	 {
		if(mm1<2)
	 	{
			numofdays=31-dd1;
			if((yy1%4==0&&yy1%100!=0)||(yy1%400==0))
				{
					
					numofdays=numofdays+29;
					numofdays=numofdays+307;
				}
			else
			   {
			   		numofdays=numofdays+28;
			   		numofdays=numofdays+306;
			   }	
		}
		else
			{
			if((yy1%100!=0&&yy1%4==0)||(yy1%400==0))
				{ 
					numofdays=29-dd1;
					numofdays=numofdays+307;
				}
			else
			   {
			   		numofdays=28-dd1;
			   		numofdays=numofdays+306;
			   }			
			}
	}
	else
	{    
	   	if((mm1<=7)&&(mm1%2!=0))
	      	 numofdays=31-dd1;
	    else if((mm1>7)&&(mm1%2!=0))
	      	 numofdays=30-dd1;
	    else if((mm1<=7)&&(mm1%2==0))
			  numofdays=30-dd1;
		else if((mm1>7)&&(mm1%2==0))  
			 numofdays=31-dd1;
			 mm1++;
	     while(mm1<=7)
	      {
	      	if(mm1%2!=0)
	      	 numofdays=numofdays+31;
	      	 else
	      	 numofdays=numofdays+30;
	      	 mm1++;
		  }
		  while(mm1<=12)
	      {
	      	if(mm1%2==0)
	      	 numofdays=numofdays+31;
	      	 else
	      	 numofdays=numofdays+30;
	      	 mm1++;
		  }
	}
 numofyear=yy2-yy1-2;
 numofleap=numofyear/4;
 numofnonleap=numofyear-numofleap;
 numofdays=numofdays+(numofleap*366)+(numofnonleap*365);
 if(mm2<=2)
    {
    	if(m2<2)
    	{
    		numofdays=numofdays+dd2;
		}
		else
		 {
		 	numofdays=numofdays+31+dd2;
		 }
	}
  else
    {
    	if((yy2%100!=0&&yy2%4==0)||(yy2%400==0))
				{ 
					numofdays=numofdays+29+31;
				}
		else
			   {
			   		numofdays=numofdays+31+28
			   }
	  int i=3;
	  while(i<=7&&i<=mm2)
	      {
	      	if(i%2!=0)
	      	 numofdays=numofdays+31;
	      	 else
	      	 numofdays=numofdays+30;
	      	 i++;
		  }
		  while(i<=mm2)
	      {
	      	if(i%2==0)
	      	 numofdays=numofdays+31;
	      	 else
	      	 numofdays=numofdays+30;
	      	 i++;
		  }	
	}
 cout<<numofdays<<endl;
}
