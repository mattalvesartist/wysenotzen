package modelo;

import java.security.SecureRandom;
import java.math.BigInteger;
import java.sql.Date;


public class Flashcard {
	protected String nomeFlashcard, categoriaFlashcard, frenteFlashcard, trasFlashcard, imageFlashcard, codigoFlashcard,
			srcFlashcard, codigoUsuario, autorFlashcard;
	protected double precoFlashcard;
	private SecureRandom random = new SecureRandom();
	Date dataCriacao;

	public String getNomeFlashcard() {
		return nomeFlashcard;
	}

	public void setNomeFlashcard(String nomeFlashcard) {
		this.nomeFlashcard = nomeFlashcard;
	}

	public String getCategoriaFlashcard() {
		return categoriaFlashcard;
	}

	public void setCategoriaFlashcard(String categoriaFlashcard) {
		this.categoriaFlashcard = categoriaFlashcard;
	}

	public String getFrenteFlashcard() {
		return frenteFlashcard;
	}

	public void setFrenteFlashcard(String frenteFlashcard) {
		this.frenteFlashcard = frenteFlashcard;
	}

	public String getTrasFlashcard() {
		return trasFlashcard;
	}

	public void setTrasFlashcard(String trasFlashcard) {
		this.trasFlashcard = trasFlashcard;
	}

	public String getImageFlashcard() {
		return imageFlashcard;
	}

	public void setImageFlashcard(String imageFlashcard) {
		this.imageFlashcard = imageFlashcard;
	}

	public double getPrecoFlashcard() {
		return precoFlashcard;
	}

	public void setPrecoFlashcard(double precoFlashcard) {
		this.precoFlashcard = precoFlashcard;
	}

	public String getCodigoFlashcard() {
		return codigoFlashcard;
	}

	public void setCodigoFlashcard(String codigoFlashcard) {
		this.codigoFlashcard = codigoFlashcard;
	}

	public String getSrcFlashcard() {
		return srcFlashcard;
	}

	public void setSrcFlashcard(String srcFlashcard) {
		this.srcFlashcard = srcFlashcard;
	}

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public void generatorCodeFC() {
		codigoFlashcard = new BigInteger(130, random).toString(32);
	}
	
	public void editNome(String novoNomeFlashcard){
		this.nomeFlashcard = novoNomeFlashcard;
	}

	public String getAutorFlashcard() {
		return autorFlashcard;
	}

	public void setAutorFlashcard(String autorFlashcard) {
		this.autorFlashcard = autorFlashcard;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
}