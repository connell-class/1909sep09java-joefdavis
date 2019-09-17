package com.revature.eval.java.core;

public class PushWorks {
	//making sure push works
	public static void main(String[] args) {
		String string="five boxing wizards jump quickly at it";
		System.out.println(isPangram(string));
		
	
		
	
	}
	
	

	
	
		public static boolean isPangram(String string) {
			// TODO Write an implementation for this method declaration
			boolean a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z=false;
			a=z;
			a=b=c=d=e=f=g=h=i=j=k=l=m=n=o=p=q=r=s=t=u=v=w=x=y=z;
			char place;
			
			for(int index=0;index<string.length();index++) {
				place=string.charAt(index);
				if(place=='a') {
					a=true;
				}
				if(place=='b') {
					b=true;
				}
				if(place=='c') {
					c=true;
				}
				if(place=='d') {
					d=true;
				}
				if(place=='e') {
					e=true;
				}
				if(place=='f') {
					f=true;
				}
				if(place=='g') {
					g=true;
				}
				if(place=='h') {
					h=true;
				}
				if(place=='i') {
					i=true;
				}
				if(place=='j') {
					j=true;
				}
				if(place=='k') {
					k=true;
				}
				if(place=='l') {
					l=true;
				}
				if(place=='m') {
					m=true;
				}
				if(place=='n') {
					n=true;
				}
				if(place=='o') {
					o=true;
				}
				if(place=='p') {
					p=true;
				}
				if(place=='q') {
					q=true;
				}
				if(place=='r') {
					r=true;
				}
				if(place=='s') {
					s=true;
				}
				if(place=='t') {
					t=true;
				}
				if(place=='u') {
					u=true;
				}
				if(place=='v') {
					v=true;
				}
				if(place=='w') {
					w=true;
				}
				if(place=='x') {
					x=true;
				}
				if(place=='y') {
					y=true;
				}
				if(place=='z') {
					z=true;
				}
				
				
				
				
			}
			if(a && b && c && d && e && f && g && h && i && j && k && l && m && n && o && p && q && r && s && t && u && v && w && x && y && z) {
				return true;
			}
			
			
			return false;
			
		}
}

