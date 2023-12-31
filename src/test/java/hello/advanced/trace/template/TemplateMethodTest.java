package hello.advanced.trace.template;

import hello.advanced.trace.template.core.AbstractTemplate;
import hello.advanced.trace.template.core.SubClassLogic1;
import hello.advanced.trace.template.core.SubClassLogic2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Slf4j
public class TemplateMethodTest {

    @Test
    void templateMethodV0(){
        //given
        logic1();
        logic2();
        //when

        //then
    }

    private void logic1() {
        long startTime = System.currentTimeMillis();
        //비지니스 로직 실행
        log.info("비즈니스 로직1 실행");
        //비지니스 로직 종료
        long endTime = System.currentTimeMillis();
        long resultTime = endTime -startTime;
        log.info("resultTime={}",resultTime);
    }

    private void logic2() {
        long startTime = System.currentTimeMillis();
        //비지니스 로직 실행
        log.info("비즈니스 로직2 실행");
        //비지니스 로직 종료
        long endTime = System.currentTimeMillis();
        long resultTime = endTime -startTime;
        log.info("resultTime={}",resultTime);
    }

    /**
     * 템플릿 메서드 패턴 적용
     */
    @Test
    void templateMethodV1(){
        //given
        AbstractTemplate template1 = new SubClassLogic1();
        template1.execute();
        //when
        AbstractTemplate template2 = new SubClassLogic2();
        template2.execute();
        //then
    }

    @Test
    void templateMethodV2(){
        //given
        AbstractTemplate template1 = new AbstractTemplate() {
            @Override
            protected void call() {
                log.info("비즈니스 로직1 실행");
            }
        };
        template1.execute();

        AbstractTemplate template2 = new AbstractTemplate() {
            @Override
            protected void call() {
                log.info("비즈니스 로직2 실행");
            }
        };
        template2.execute();
        //when

        //then
    }
}
