public record Moedas(String base_code, String target_code, String conversion_rate, String conversion_result, String valor_digitado) {
    @Override
    public String toString() {
        return "O valor " + valor_digitado + " [" + base_code + "]"
                + " convertido para " + "[" + target_code + "] é: " + conversion_result +  ".";
    }
}
