package com.example;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;

/**
 * Fuzzer generado para la clase SecondMethodCall. Objetivo: método secondVulnerableMethodCall en la
 * línea 20.
 */
public class SecondMethodCallSecondvulnerablemethodcallFuzzer {

  public static void fuzzerTestOneInput(FuzzedDataProvider dataProvider) {

    // === GENERACIÓN DE PARÁMETROS PARA MÉTODOS ===
    java.lang.String arg = dataProvider.consumeString(1000);

    // === CREACIÓN DE LA INSTANCIA ===
    int constructor_jsonString_id = dataProvider.consumeInt();

    java.lang.String constructor_jsonString_name = dataProvider.consumeString(1000);

    java.lang.Integer constructor_jsonString_data_data = dataProvider.consumeInt();

    com.example.Data constructor_jsonString_data =
        new com.example.Data(constructor_jsonString_data_data);

    com.example.User constructor_jsonString =
        new com.example.User(
            constructor_jsonString_id, constructor_jsonString_name, constructor_jsonString_data);

    SecondMethodCall secondmethodcall = new SecondMethodCall(constructor_jsonString);

    // === LLAMADA AL MÉTODO O CONSTRUCTOR OBJETIVO ===
    try {
      secondmethodcall.secondVulnerableMethodCall(arg);
    } catch (Exception e) {
      // Ignorar excepciones esperadas
    }
  }
}
