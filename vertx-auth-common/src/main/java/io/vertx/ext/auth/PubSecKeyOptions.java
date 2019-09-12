package io.vertx.ext.auth;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

/**
 * Options describing how a Cryptographic Key.
 *
 * @author <a href="mailto:plopes@redhat.com">Paulo Lopes</a>
 */
@DataObject(generateConverter = true)
public class PubSecKeyOptions {

  private KeyType keyType;
  private String algorithm;
  private boolean certificate;
  private boolean symmetric;
  private String publicKey;
  private String secretKey;

  /**
   * Default constructor
   */
  public PubSecKeyOptions() {
  }

  /**
   * Copy constructor
   *
   * @param other the options to copy
   */
  public PubSecKeyOptions(PubSecKeyOptions other) {
    keyType = other.getKeyType();
    algorithm = other.getAlgorithm();
    publicKey = other.getPublicKey();
    secretKey = other.getSecretKey();
    symmetric = other.isSymmetric();
    certificate = other.isCertificate();
  }

  /**
   * Constructor to create an options from JSON
   *
   * @param json the JSON
   */
  public PubSecKeyOptions(JsonObject json) {
    PubSecKeyOptionsConverter.fromJson(json, this);
  }

  public KeyType getKeyType() {
    return keyType;
  }

  public PubSecKeyOptions setKeyType(KeyType keyType) {
    this.keyType = keyType;
    return this;
  }

  public String getAlgorithm() {
    return algorithm;
  }

  public PubSecKeyOptions setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

  public String getPublicKey() {
    return publicKey;
  }

  public PubSecKeyOptions setPublicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

  public String getSecretKey() {
    return secretKey;
  }

  public PubSecKeyOptions setSecretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

  @Deprecated
  public boolean isSymmetric() {
    return symmetric;
  }

  @Deprecated
  public PubSecKeyOptions setSymmetric(boolean symmetric) {
    this.symmetric = symmetric;
    this.keyType = KeyType.SYMMETRIC;
    return this;
  }

  @Deprecated
  public boolean isCertificate() {
    return certificate;
  }

  @Deprecated
  public PubSecKeyOptions setCertificate(boolean certificate) {
    this.certificate = certificate;
    this.keyType = KeyType.CERTIFICATE;
    return this;
  }
}
