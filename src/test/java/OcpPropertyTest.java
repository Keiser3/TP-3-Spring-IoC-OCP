import com.example.Metier.IMetier;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.Presentation.Presentation2;
import com.example.Config.PropertyDrivenConfig;

import static org.junit.Assert.assertEquals;

public class OcpPropertyTest {

    @Test
    public void property_choisitDaoApi() {
        // Définir la propriété avant le contexte
        System.setProperty("dao.target", "daoApi");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Presentation2.class);
        ctx.register(PropertyDrivenConfig.class);
        ctx.refresh();

        IMetier m = ctx.getBean(IMetier.class);

        // Vérifie que la bonne implémentation est injectée
        assertEquals(150.0, m.calcul(), 1e-6); // adapte la valeur selon DaoApi

        ctx.close();
    }
}
