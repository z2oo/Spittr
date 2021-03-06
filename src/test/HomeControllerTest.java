package test;

import org.junit.Test;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.web.servlet.MockMvc;
import spittr.web.HomeController;

import static junit.framework.TestCase.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by Asus on 2018/1/15.
 */
public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception{
        HomeController controller=new HomeController();
        MockMvc mockMvc=standaloneSetup(controller).build();
        mockMvc.perform(get("/"))
                .andExpect(view().name("home"));
    }
}
