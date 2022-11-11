package bdsmessenger;
import org.apache.commons.mail.SimpleEmail;
import view.SplashView;

public class BDSmessenger {
    
    public static void main(String[] args) {
        
     String meuEmail = "bancodesangue.universitario@gmail.com";
     String minhaSenha = "fabrica123";
     
     SimpleEmail email = new SimpleEmail();
     email.setHostName("smtp.gmail.com");
     email.setSmtpPort(465);
     //email.setAuthenticator(new DefaultAuthenticator(meuEmail, minhaSenha));
     //em cima era como tava no vídeo, mas não funciona n sei pq
     //em baixo é como o netbeans sugeriu, não dá erro mas não funciona.
     email.setAuthentication(meuEmail, minhaSenha);
     email.setSSLOnConnect(true);
     
     try{
         email.setFrom(meuEmail);
         email.setSubject("O Banco de Sangue Universitário conta com a sua ajuda!");
         email.setMsg("Testando Testando Testando, será que vai funcionar?");
         email.addTo(meuEmail);
         email.send();
         System.out.println("Foi.");
         
     }catch (Exception e) {
         e.printStackTrace();
     }
     
     
        
     view.SplashView splash = new SplashView();
        splash.setVisible(true);
    
    }
    
}
  