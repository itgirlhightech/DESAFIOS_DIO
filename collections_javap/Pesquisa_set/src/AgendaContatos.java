import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContatos(String nome, int numero ) {
        contatoSet.add(new Contato(nome, numero));

    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }
  public Set<Contato> pesquisaPorNome(String nome) {
     Set<Contato> contatoPorNome = new HashSet<>();
      for(Contato c : contatoSet){
          if(c.getNome().startsWith(nome)) {
              contatoPorNome.add(c);
          }
      }
      return contatoPorNome;
  }

  public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
           if(c.getNome().equalsIgnoreCase(nome)) {
              c.setNumero(novoNumero);
              contatoAtualizado = c;
              break;
           }

        }
        return contatoAtualizado;
  }
  public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContatos("Bianca<3", 9946372);
        agendaContatos.adicionarContatos("thami<3", 94727432);
        agendaContatos.adicionarContatos("evilyn", 957269422);
        agendaContatos.adicionarContatos("stuart", 94588437);
        agendaContatos.adicionarContatos("Bianca<3", 948392498);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisaPorNome("Bianca<3"));
        System.out.println("Contato atualizado:  " + agendaContatos.atualizarNumeroContato("Bianca<3", 86573592));

        agendaContatos.exibirContatos();
  }
}


