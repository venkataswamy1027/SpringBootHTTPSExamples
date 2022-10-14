# SpringBootHTTPSExamples
Setting up HTTPS for Spring Boot requires two steps: getting an SSL certificate and configuring SSL in Spring Boot.

# Setting up HTTPS for Spring Boot requires two steps:
Getting an SSL certificate;
Configuring SSL in Spring Boot.

To enable HTTPS, we'll provide a Spring Boot application with this keystore containing the SSL certificate.

The two most common formats used for keystores are JKS, a proprietary format specific for Java, and PKCS12, an industry-standard format. 
JKS used to be the default choice, but since Java 9 it's PKCS12 the recommended format. We're going to see how to use both.

# Generate an SSL certificate in a keystore
# JKS keystore:
keytool -genkeypair -alias springboot -keyalg RSA -keysize 4096 -storetype JKS -keystore springboot.jks -validity 3650 -storepass password

# PKCS12 keystore:
keytool -genkeypair -alias springboot -keyalg RSA -keysize 4096 -storetype PKCS12 -keystore springboot.p12 -validity 3650 -storepass password

# look at the command we just run:

(1) genkeypair: generates a key pair;
(2) alias: the alias name for the item we are generating;
(3) keyalg: the cryptographic algorithm to generate the key pair;
(4) keysize: the size of the key;
(5) storetype: the type of keystore;
(6) keystore: the name of the keystore;
(7) validity: validity number of days;
(8) storepass: a password for the keystore.

