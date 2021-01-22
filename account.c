#include <stdio.h>
 
struct bankAccount
{
	char accName[30];
	int  accNumber;
	float balance;     
};
 
void createAccount(struct bankAccount *);
void deposit(struct bankAccount *, float amount);
void withdraw(struct bankAccount *, float amount);
void show(struct bankAccount);
 
int main()
{
	struct bankAccount customer;
	createAccount(&customer);
	deposit(&customer, 1000);
	withdraw(&customer, 500);
	show(customer);    
    return 0;
}
 
void createAccount(struct bankAccount * accHolder)
{
   fflush(stdin);     
   printf("Enter the account name: ");
   scanf("%s", accHolder->accName);
   printf("Enter the account number: ");
   scanf("%d", &accHolder->accNumber);
   printf("Enter initial balance: ");
   scanf("%f", &accHolder->balance);
}
 
void show(struct bankAccount accHolder)
{
	printf("Account name: %s \n", accHolder.accName);
	printf("Account number: %d \n", accHolder.accNumber);
	printf("Available balance: %.2f \n", accHolder.balance);
}
 
void deposit(struct bankAccount * acc, float amount)
{
	acc->balance += amount;
}
 
void withdraw(struct bankAccount * acc, float amount)
{
	acc->balance -= amount;
}
