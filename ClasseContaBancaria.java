public class ClasseContaBancaria {                //criar classe conta bancaria com atributo numero da conta e nome do titular sendo String e saldo double.
    private String numConta, nome;                // metodos depositar(doublevalor) adiciona uma valor a conta: - sacar (double valor); retira saldo da conta se houver saldo
    private double saldo;                           // getsaldo() retorna o saldo da conta
                                                    // imprimirInformações(): imprime todas informações da conta(numero da conta, nome do titular e saldo)
    public ClasseContaBancaria (String numConta, String nome, double saldo){
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = saldo;
    }
        public String getnumConta(){
            return numConta;
    }
        public void setNumConta (String numConta){
            this.numConta = numConta;
    }

        public String getNome(){
            return nome;
    }
        public void setNome (String nome){
            this.nome = nome;
    }

        public void depositar (double valor){
            this.saldo += valor;
        }

            public void sacar (double valor){
               if (saldo > valor){
               this.saldo -= valor;
               }
               else{
               System.out.println((" sem money "));
               }
        }
        public double getSaldo(){
            return saldo;
        }
        public void setSaldo (double saldo){
            this.saldo = saldo;

            System.out.println (" sua conta é " + numConta + nome + saldo);

        }
    }
        
        