package hello.proxy.pureproxy.decorator;

import hello.proxy.pureproxy.decorator.code.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class DecoratorPatternTest {

    @Test
    void noDecorator() {
        RealComponent realComponent = new RealComponent();
        DecoratorPatternClient decoratorPatternClient = new DecoratorPatternClient(realComponent);

        decoratorPatternClient.execute();
    }

    @Test
    void decoratorTest1() {
        Component realComponent = new RealComponent();
        Component MessageComponent = new MessageDecorator(realComponent);
        DecoratorPatternClient client = new DecoratorPatternClient(MessageComponent);

        client.execute();
    }

    @Test
    void decoratorTest2() {
        Component realComponent = new RealComponent();
        Component MessageComponent = new MessageDecorator(realComponent);
        Component TimeDecorator = new TimeDecorator(MessageComponent);
        DecoratorPatternClient client = new DecoratorPatternClient(TimeDecorator);

        client.execute();
    }
}
