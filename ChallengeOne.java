


public class ChallengeOne {
		 private integer var1;
		 private String var2;
		 private Account myAccount = new Account();
		
		public void setVar1() {
				var1 = 8;
		}
		
		public void setVar2() {
				var2 = 'hello world';
		}
			public integer getVar1() {
					
			system.debug(var1);   
			return var1;
		}
		
		public string getVar2() {
			system.debug(var2);  
			 return var2; 
		}
		
			public void setAccountName() {
			 myAccount.name = 'John Smith';
					
					system.debug(myAccount.name);
		}
		
		public string getAccountName() {
			system.debug(myAccount.name);  
			 return myAccount.name; 
		}
		
}


