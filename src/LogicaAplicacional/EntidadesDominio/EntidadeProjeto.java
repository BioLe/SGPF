package LogicaAplicacional.EntidadesDominio;

import maqest.MaquinaEstados;

public class EntidadeProjeto {
	
	private EntidadePromotor promotor;
	private EntidadeResponsavelContactos responsavelContactos;
	
	private String numProjeto;
	private String tipoProjeto;
	private String descricaoProjeto;
	private String nib;
	private MaquinaEstados maqEstados;
	
	//Incentivo???????????????
	private String montanteSolicitado;
	
	public EntidadeProjeto(EntidadePromotor promotor, EntidadeResponsavelContactos responsavelContactos) {
		this.promotor = promotor;
		this.responsavelContactos = responsavelContactos;
		this.maqEstados = new MaquinaEstados();
	}
	
	public EntidadePromotor getPromotor() { return promotor; }
	public void setPromotor(EntidadePromotor promotor) { this.promotor = promotor; }
	
	public EntidadeResponsavelContactos geEntidadeResponsavelContactos() { return responsavelContactos; }
	public EntidadeProjeto setResponsavelContactos(EntidadeResponsavelContactos responsavelContactos) { 
		this.responsavelContactos = responsavelContactos; 
		return this;
	}
	
	public String getNumProjeto() { return numProjeto; }
	public EntidadeProjeto setNumProjeto(String numProjeto) { 
		this.numProjeto = numProjeto; 
		return this;
	}
	
	public String getTipoProjeto() { return tipoProjeto; }
	public EntidadeProjeto setTipoProjeto(String tipoProjeto) { 
		this.tipoProjeto = tipoProjeto; 
		return this;
	}

	public String getDescricaoProjeto() { return numProjeto; }
	public EntidadeProjeto setDescricaoProjeto(String descricaoProjeto) { 
		this.descricaoProjeto = descricaoProjeto; 
		return this;
	}
	
	public String getNib() { return nib; }
	public EntidadeProjeto setNib(String nib) { 
		this.nib = nib; 
		return this;
	}
}
