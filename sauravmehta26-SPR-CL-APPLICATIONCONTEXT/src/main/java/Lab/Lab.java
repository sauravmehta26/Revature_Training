package Lab;

import Lab.Beans.ElectricEngine;
import Lab.Beans.GasEngine;
import Lab.Beans.NuclearEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Lab {

    @Autowired
    private ApplicationContext applicationContext;

    public ElectricEngine getElectricPoweredBean(){
        return applicationContext.getBean(ElectricEngine.class);
    }

    public GasEngine getGasPoweredBean(){
        return applicationContext.getBean(GasEngine.class);
    }

    public NuclearEngine getNuclearPoweredBean(){
        return applicationContext.getBean(NuclearEngine.class);
    }
}