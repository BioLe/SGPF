package Apresentacao.Tecnico;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import Apresentacao.Vista;

public class VistaAceitarCandidatura extends Vista {
	
	//Dados do projeto
	private short numeroProjeto;
	private Date data;
	private String tipoProjeto;
	private String descricao;
	private String nib;
	
	//Dados incentivo
	private float montanteSolicitado;
	private float custoElegivel;
	private Date prazo;
	
	//Dados bonificacao
	private float taxaBonificao;
	private float montanteMaximo;
	private Date periodoMaximo;
	
	//Dados do promotor
	private String nomePromotor;
	private String nifPromotor;
	private String nacionalidadePromotor;
	private String telefonePromotor;
	private String emailPromotor;
	
	//Dados do responsável pelos contactos
	private String nomeResponsavelContactos;
	private String telefoneResponsavelContactos;
	private String emailResponsavelContactos;

	public String obterCandidatura() {
		//TODO Perguntar eng. Como é que escolhemos o número de projeto? E se data assim faz sentido.
		
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String dataAux = formatter.format(new Date());
			data = formatter.parse(dataAux);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		escrever("Tipo de Projeto\n 1 - Incentivo\n 2 - Bonificação\n");
		tipoProjeto(ler());
		
		escrever("Descrição: ");
		descricao = ler();
		
		escrever("NIB: ");
		nib = ler();
		
		escrever("Dados do Promotor:\n Nome: ");
		nomePromotor = ler();
		escrever("NIF: ");
		nifPromotor = ler();
		escrever("Nacionalidade: ");
		nacionalidadePromotor = ler();
		escrever("Telefone: ");
		telefonePromotor = ler();
		escrever("Email: ");
		emailPromotor = ler();
		
		escrever("Dados do Responsável por contacto:\n Nome: ");
		nomeResponsavelContactos = ler();
		escrever("Telefone:");
		telefoneResponsavelContactos = ler();
		escrever("Email:");
		emailResponsavelContactos = ler();
		
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dataAux = formatter.format(getData());
		//escrever(getData());
		return "TODO";
		
	}
	
	private void tipoProjeto(String tipo) {
		switch(tipo) {
			case "1":
				tipoBonificacao();
				break;
			case "2":
				tipoIncentivo();
				break;
		}
	}
	
	private void tipoBonificacao() {
		//TODO Perguntar ao engenheiro. Quem escolhe a taxa de bonificacao e o montante maximo?
		//escrever("Taxa de bonificação: ");
		//taxaBonificao = Float.parseFloat(ler());
		//escrever("Montante máximo: ");
		//montanteMaximo = Float.parseFloat(ler());
		escrever("Período máximo (yyyy-MM-dd): ");
		try {
			periodoMaximo = new SimpleDateFormat("yyyy-MM-dd").parse(ler());
		} catch (ParseException e) {
			System.out.println("Error parsing introduced date.\n" + e.getMessage());
		}
	}
	
	private void tipoIncentivo() {
		//TODO Perg. eng. Onde se escolhe o custo elegivel?
		escrever("Montante solicitado: ");
		montanteSolicitado = Float.parseFloat(ler());
		//escrever("Custo elegível: ");
		//custoElegivel = Float.parseFloat(ler());
		escrever("Prazo: ");
		try {
			prazo = new SimpleDateFormat("dd/MM/yyyy").parse(ler());
		} catch (ParseException e) {
			System.out.println("Error parsing introduced date.\n" + e.getMessage());
		}
	}
	
	public short getNumeroProjeto() {return numeroProjeto;}
	public Date getData() {return data;}
	public String getTipoProjeto() {return tipoProjeto;}
	public String getDescricao() {return descricao;}
	public String getNIB() {return nib;}
	
	public float getMontanteSolicitado() {return montanteSolicitado;}
	public float getCustoElegivel() {return custoElegivel;}
	public Date getPrazo() {return prazo;}
	
	public float getTaxaBonificacao() {return taxaBonificao;}
	public float getMontanteMaximo() {return montanteMaximo;}
	public Date getPeriodoMaximo() {return periodoMaximo;}
	
	public String getNomePromotor() {return nomePromotor;}
	public String getNifPromotor() {return nifPromotor;}
	public String getNacionalidadePromotor() {return nacionalidadePromotor;}
	public String getTelefonePromotor() { return telefonePromotor; }
	public String getEmailPromotor() { return emailPromotor; }
	
	public String getNomeResponsavelContactos() {return nomeResponsavelContactos;}
	public String getTelefoneResponsavelContactos() {return telefoneResponsavelContactos;}
	public String getEmailResponsavelContactos() {return emailResponsavelContactos;}
	
}
