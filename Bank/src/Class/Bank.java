package Class;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank(){
        this.accounts = new ArrayList<Account>();
    }

    /** 
     * Esse método é responsável por criar uma nova conta,
     * ou seja, adicionar uma nova conta a lista de contas
     * da classe Bank
     * 
     * @param newAccount
     */
    public void createNewAccount(Account newAccount) {
        this.accounts.add(newAccount);
    }

    /** 
     * Esse método é responsável por inativar a conta
     * que é passada no parâmetro.
     * 
     */
    public void inactivateAccount(int accountId) {}

    /** 
     * Esse método é responsável por buscar uma conta
     * no array de contas e retornar se ela existe ou não.
     * 
     * @return TRUE se a conta existir ou FALSE se a conta não
     * existir.
     */
    public boolean getAccountById(int accountId) {
        return true;
    }

    /** 
     * Esse método é responsável por realizar um Saque
     * de um valor na conta que é passada no parâmetro.
     * 
     * @param accountId
     * @param amount
     */
    public void withdraw(int accountId, double amount) {}

    /** 
     * Esse método é responsável por depositar um valor
     * na conta que é passada no parâmetro.
     * 
     * @param accountId
     * @param amount
     */
    public void deposit(int accountId, double amount) {}

    /** 
     * Esse método é responsável por gerar o extrato de Saldo
     * e extrato da conta passada no parâmetro.
     * 
     * @param accountId
     */
    public void issueBalanceAndStatement(int accountId) {}

    /** 
     * Esse método é responsável por receber o id de duas contas
     * e realiar a transferencia do valor da conta A para conta B.
     * 
     * @param fromAccountId
     * @param toAccountId
     */
    public void transfer(int fromAccountId, int toAccountId, double amount) {}

    /** 
     * Esse método é responsável por trazer todas as contas
     * que estão no Banco.
     * 
     */
    public void getAllAccounts() {}

    /** 
     * Reescrita do método toString, trazendo todas contas
     * Company ou LegalPerson.
     * 
     * @return uma string com dados de todas as contas.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Account account : this.accounts) {          
            sb.append(account + "\n");
        }

        return sb.toString();
    }
}
