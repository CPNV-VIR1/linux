package ch.cpnves.payroll.Repositories;

import ch.cpnves.payroll.Entities.Bottle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(BottleRepository repository){
        return args->{
            log.info("Preloading " + repository.save(new Bottle("Evian")));
            log.info("Preloading " + repository.save(new Bottle("")));
        };
    }
}
