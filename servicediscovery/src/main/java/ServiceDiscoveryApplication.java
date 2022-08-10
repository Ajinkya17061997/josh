import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaServer
@ComponentScan("com.*")
@SpringBootApplication
public class ServiceDiscoveryApplication {

    public void myFile(){
        System.out.println("Doint delbrate changes");
        Object o = null;
        System.out.println(o.toString());
    }

    public static void main(String[] args){
        SpringApplication.run(ServiceDiscoveryApplication.class);
    }
}
