package hello.advanced.trace.template;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Slf4j
public class TemplateMethodTest {

    @Test
    void templateMethodV0(){
        //given
        logic1();
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
}