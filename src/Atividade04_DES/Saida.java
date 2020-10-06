package Atividade04_DES;

public class Saida {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        Cliente cli = new Cliente();
        Funcionario fun = new Funcionario();
        
        pf.setCpf("111.222.333-04");
        pf.setNome("tralouG leafaR");
        pf.setTelefone("55 1197070-7070");
        pf.setEmail("email@gmail.com");
        pf.setDataNascimento("32/13/0001");
        
        cli.setClienteDesde("01/01/0002");
        
        fun.setRegistro("ABC000");
        fun.setCarteiraTrabalho("ABC000");
        fun.setPis("ABC000");
                
        System.out.println("Informações Pessoais");
        System.out.println("CPF: "+pf.getCpf()+
                "\nNome: "+pf.getNome()+
                "\nTelefone: "+pf.getTelefone()+
                "\nEmail: "+pf.getEmail()+
                "\nData de Nascimento: "+pf.getDataNascimento());
        
        System.out.println("\nInformações do Cliente");    
        System.out.println("Cliente desde: "+cli.getClienteDesde());
    
        System.out.println("\nInformações do Funcionário");
        System.out.println("Registro: "+fun.getRegistro()+
                "\nCarteira de trabalho: "+fun.getCarteiraTrabalho()+
                "\nPIS: "+fun.getPis());    
    }
}
//por Rafael Ferreira 
