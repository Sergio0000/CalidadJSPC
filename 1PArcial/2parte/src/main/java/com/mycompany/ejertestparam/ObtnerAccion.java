package com.mycompany.ejertestparam;

public class ObtnerAccion {

    public ObtnerAccion() {
    }

    public String obtenerAccion(String esObligatorio, Boolean esDocente, Boolean externo, String tipoPersonaDestino, String estadoRegistro) {
        if (esObligatorio.equals("si") && esDocente == true) {
            return "actualizar";
        } else if (esObligatorio.equals("no") && esDocente == true) {
            return "matricular";
        } else if (estadoRegistro.equals("porConfirmar") && externo == true) {
            return "actualizar";
        } else if (tipoPersonaDestino.equals("externo") && externo == true) {
            return "registrar";
        } else if (estadoRegistro.equals("Vigente") && externo == true) {
            return "matricular";
        }
        return "";
    }
}
