package hello.advanced.trace.strategy.code.template;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.security.auth.callback.Callback;

@Slf4j
public class TemplateCallbackTest {

    /**
     * 템플릿 콜백 패턴 -- 익명 내부 클래스
     */
    @Test
    void callbackV1(){
        //given
        TimeLogTemplate template1 = new TimeLogTemplate();
        template1.execute(new CallBack() {
            @Override
            public void call() {
                log.info("비즈니스 로직 1 실행");
            }
        });

        TimeLogTemplate template2 = new TimeLogTemplate();
        template2.execute(new CallBack() {
            @Override
            public void call() {
                log.info("비즈니스 로직 2 실행");
            }
        });
        //when

        //then
    }

    /**
     * 템플릿 콜백 패턴 -- 익명 내부 클래스 람다
     */
    @Test
    void callbackV2(){
        //given
        TimeLogTemplate template1 = new TimeLogTemplate();
        template1.execute(() -> log.info("비즈니스 로직 1 실행"));

        TimeLogTemplate template2 = new TimeLogTemplate();
        template2.execute(() -> log.info("비즈니스 로직 2 실행"));
        //when

        //then
    }
}


