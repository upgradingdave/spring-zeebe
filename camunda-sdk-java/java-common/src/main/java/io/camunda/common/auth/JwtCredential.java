package io.camunda.common.auth;

/** Contains credential for particular product. Used for JWT authentication. */
public class JwtCredential {

  public JwtCredential(
      String clientId, String clientSecret, String audience, String authUrl, String scope) {
    this.clientId = clientId;
    this.clientSecret = clientSecret;
    this.audience = audience;
    this.authUrl = authUrl;
    this.scope = scope;
  }

  private String clientId;
  private String clientSecret;
  private String audience;
  private String authUrl;
  private String scope;

  public String getClientId() {
    return clientId;
  }

  public String getClientSecret() {
    return clientSecret;
  }

  public String getAudience() {
    return audience;
  }

  public String getAuthUrl() {
    return authUrl;
  }

  public String getScope() {
    return scope;
  }
}
