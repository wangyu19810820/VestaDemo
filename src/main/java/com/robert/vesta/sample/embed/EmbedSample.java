package com.robert.vesta.sample.embed;

import com.robert.vesta.service.bean.Id;
import com.robert.vesta.service.intf.IdService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmbedSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext(
                "spring/vesta-service-sample.xml");
        IdService idService = (IdService) ac.getBean("idService");

        long id = idService.genId();
        Id ido = idService.expId(id);

        System.out.println(id + ":" + ido);


//        IdServiceFactoryBean fac = new IdServiceFactoryBean();
//        fac.setProviderType(IdServiceFactoryBean.Type.PROPERTY);
//        fac.setMachineId(1);
//        fac.init();
//        IdService idService = fac.getObject();
//        long id = idService.genId();
//        Id ido = idService.expId(id);
//
//        System.out.println(id + ":" + ido);
//
//        long id1 = idService.genId();
//        Id ido1 = idService.expId(id);
//
//        System.out.println(id1 + ":" + ido1);
    }
}
