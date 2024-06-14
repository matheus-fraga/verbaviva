package com.verbaviva.projeto.dto;

public class UsuarioLoginResponse {
    
  private boolean isAuthenticated;

  public boolean isAuthenticated() {
    return isAuthenticated;
  }

  public void setAuthenticated(boolean isAuthenticated) {
    this.isAuthenticated = isAuthenticated;
  }

}
