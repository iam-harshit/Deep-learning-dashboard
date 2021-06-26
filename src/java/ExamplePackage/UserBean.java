package ExamplePackage;

public class UserBean {
	
      private String fullName;
      private String email;
      private String password;
      private String moneyPaid;
      private String paidBy;

      public boolean valid;
	
	
      public String getFullName() {
         return fullName;
	}

      public void setFullName(String newFullName) {
         fullName = newFullName;
	}

	
      public String getEmail() {
         return email;
			}

      public void setEmail(String newEmail) {
         email = newEmail;
			}
      
      public String getPassword() {
         return password;
			}

      public void setPassword(String newPassword) {
         password = newPassword;
			}
      
      public String getMoneyPaid() {
         return moneyPaid;
			}

      public void setMoneyPaid(String newAccountType) {
         moneyPaid = newAccountType;
			}
       public String getPaidBy() {
         return paidBy;
			}

      public void setPaidBy(String newPaidBy) {
         paidBy = newPaidBy;
			}
      
      public boolean isValid() {
         return valid;
      }

      public void setValid(boolean newValid) {
         valid = newValid;
	}	
}
