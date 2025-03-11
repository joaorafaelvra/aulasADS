public class MediaPonderada {

    public static void main(String[] args) {
      double notaA1 = 7.5;
      double notaA2 = 8.0;
      double notaA3 = 9.2;
      int pesoA1 = 3;
      int pesoA2 = 3;
      int pesoA3 = 4;
      
      
     double notaVsPeso = notaA1 * pesoA1 + notaA2 * pesoA2 + notaA3 * pesoA3;
     double somaPesos = pesoA1 + pesoA2 + pesoA3;
     double mediaP = notaVsPeso / somaPesos;
    
     if (mediaP >= 7) {
      System.out.println("Parabéns, você foi aprovacom com média: " + mediaP);
     } else {
      System.out.println("Infelizmente você foi reprovado, sua média é: " + mediaP);
     }
    }
}