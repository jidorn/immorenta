package com.aquere.ws.dto;

public class Localite {

  private String ville;
  private String rue;
  private int codePostal;

  @Override
  public String toString() {
    return String.format("Localite{ville='%s', rue='%s', codePostal=%d}",
      ville, rue, codePostal);
  }

  /**
   * constructeur avec params.
   *
   * @param ville      la ville.
   * @param rue        la rue et son numéro.
   * @param codePostal le code postal.
   */
  public Localite(String ville, String rue, int codePostal) {
    this.ville = ville;
    this.rue = rue;
    this.codePostal = codePostal;
  }

  public Localite() {
  }

  public String getRue() {
    return rue;
  }

  public void setRue(String rue) {
    this.rue = rue;
  }

  public int getCodePostal() {
    return codePostal;
  }

  public void setCodePostal(int codePostal) {
    this.codePostal = codePostal;
  }

  public String getVille() {
    return ville;
  }

  public void setVille(String ville) {
    this.ville = ville;
  }
}
