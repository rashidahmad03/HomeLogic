package com.hero;

public class Bracket11 {

	public static void main(String[] args) {
	System.out.println(	mact("()"));
	}
	public static int mact(String a) {
	stack s=new stack();
	int d=0;
	for(int i=0;i<a.length();i++)
	{
		if(a.charAt(i)=='(')
			s.push(a.charAt(i));
		if(a.charAt(i)==')')
			{
			 if (s.isEmpty()) 
             { 
                 continue;
             }  
			 else
			 { s.pop();
			d++;
			}
			}
	}
	if(d>0)
		return d;
	else
		return -1;
	}
	static class stack  
    { 
        int top=-1; 
        char items[] = new char[100]; 
        void push(char x)  
        { 
            if (top == 99)  
            { 
                System.out.println("Stack full"); 
            }  
            else 
            { 
                items[++top] = x; 
            } 
        } 
        char pop()  
        { 
            if (top == -1)  
            { 
               
                return '\0'; 
            }  
            else 
            { 
                char element = items[top]; 
                top--; 
                return element; 
            } 
        } 
        boolean isEmpty()  
        { 
            return (top == -1) ? true : false; 
        } 
    } 

}
