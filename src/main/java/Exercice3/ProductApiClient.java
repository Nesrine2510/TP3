package Exercice3;

public interface ProductApiClient {
    Product getProduct(String productId) throws APIException , DateFormatException;
}

