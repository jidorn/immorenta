package com.aquere.ws.dto;

import com.aquere.ws.enums.TypageEnum;

public abstract class Immobilier {

  private float prixAchat;
  private Localite adresse;
  private float surfaceTerrain;
  private TypageEnum type;

  /**
   * constructeur avec params.
   *
   * @param prixAchat      le prix d'achat.
   * @param adresse        l'adresse.
   * @param surfaceTerrain la surface du terrain.
   * @param type           le type.
   */
  public Immobilier(float prixAchat, Localite adresse, float surfaceTerrain, TypageEnum type) {
    this.prixAchat = prixAchat;
    this.adresse = adresse;
    this.surfaceTerrain = surfaceTerrain;
    this.type = type;
  }

  public Immobilier() {
  }

  @Override
  public String toString() {
    return String.format("Immobilier{prixAchat=%s, adresse=%s, surfaceTerrain=%s, type=%s}",
      prixAchat, adresse, surfaceTerrain, type);
  }

  public Localite getAdresse() {
    return adresse;
  }

  public void setAdresse(Localite adresse) {
    this.adresse = adresse;
  }

  public float getPrixAchat() {
    return prixAchat;
  }

  public void setPrixAchat(float prixAchat) {
    this.prixAchat = prixAchat;
  }

  public float getSurfaceTerrain() {
    return surfaceTerrain;
  }

  public void setSurfaceTerrain(float surfaceTerrain) {
    this.surfaceTerrain = surfaceTerrain;
  }

  public TypageEnum getType() {
    return type;
  }

  public void setType(TypageEnum type) {
    this.type = type;
  }

  public final int response(int param) {
    return param + 1;
  }
}
