package Week_7.TaskDemo;

import Week_7.TaskDemo.service.impl.HttpServiceImpl;

import static Week_7.TaskDemo.commons.SimpleHttpServer.PORT;

public class MainClass {
    public static void main(String[] args) {
        HttpServiceImpl service = new HttpServiceImpl();

        service.start(PORT);
    }
}
