



package com.example;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.example.VulnerableApp;




import java.io.IOException;


/**
 * Fuzzer generado para la clase VulnerableApp.
 * Objetivo: método main en la línea 6.
 */
public class VulnerableAppMainFuzzer {

    public static void fuzzerTestOneInput(FuzzedDataProvider dataProvider) {
        
        // === CREACIÓN DE LA INSTANCIA ===

        // === GENERACIÓN DE PARÁMETROS ===
java.lang.String[] args = new String[]{dataProvider.consumeString(100), dataProvider.consumeString(100)};

        // === LLAMADA AL MÉTODO O CONSTRUCTOR OBJETIVO ===
        try {
            VulnerableApp.main(args);
        } catch (Exception e) {
            // Ignorar excepciones esperadas
        }
    }
}