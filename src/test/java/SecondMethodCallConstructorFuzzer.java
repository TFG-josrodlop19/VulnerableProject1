



package com.example;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.example.SecondMethodCall;





import com.example.User;
import com.example.Data;

import java.io.IOException;


/**
 * Fuzzer generado para la clase SecondMethodCall.
 * Objetivo: constructor en la línea 8.
 */
public class SecondMethodCallConstructorFuzzer {

    public static void fuzzerTestOneInput(FuzzedDataProvider dataProvider) {
        
        // === CREACIÓN DE LA INSTANCIA ===

        // === GENERACIÓN DE PARÁMETROS ===
int jsonString_id = dataProvider.consumeInt();

    
        java.lang.String jsonString_name = dataProvider.consumeString(1000);

    
        
    
        java.lang.Integer jsonString_data_data = dataProvider.consumeInt();

        
        com.example.Data jsonString_data = new com.example.Data(
            jsonString_data_data        );

        
        com.example.User jsonString = new com.example.User(
            jsonString_id,            jsonString_name,            jsonString_data        );

        // === LLAMADA AL MÉTODO O CONSTRUCTOR OBJETIVO ===
        try {
            new SecondMethodCall(jsonString);
        } catch (Exception e) {
            // Ignorar excepciones esperadas
        }
    }
}