package banco;

class Diretor extends Funcionario implements Autenticavel {

    @Override
    public boolean autentica(int senha) {
        throw new UnsupportedOperationException("Not supported yet.");
    }    
  
}