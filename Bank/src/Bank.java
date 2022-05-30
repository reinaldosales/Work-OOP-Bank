import java.util.ArrayList;

public class Bank{
    ArrayList<Account> accountList;
    
    public Bank(){
        accountList = new ArrayList<Account>();
    }

    public void accountAdd(Account account){
        if(account == null){
            System.out.println("Não adicionado.");
        }else{
            accountList.add(account);
        }
        
    }


    public void accountSearch(String name, int code){
        for (var i = 0; i < accountList.length; i++) {
            if(nome != accountList.get(var).getNome || code != accountList.get(var).getCode){
                System.out.println("Conta não encontrada.");
            }else{
                System.out.println(accountList.get(var));
            }
        }
        
    }
}