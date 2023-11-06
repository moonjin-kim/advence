package hello.advanced.trace.hellotrace;

import hello.advanced.trace.TraceStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HelloTraceV2Test {

    @DisplayName("쿼리의 시작과 끝을 로그로 출력할 수 있다.")
    @Test
    void begin_end(){
        //given
        HelloTraceV2 trace = new HelloTraceV2();
        TraceStatus status1 = trace.begin("hello");
        TraceStatus status2 = trace.beginSync(status1.getTraceId(), "hello2");
        trace.end(status2);
        trace.end(status1);

        //when

        //then
    }

    @DisplayName("예외가 발생했을때 로그로 예외를 알 수 있다.")
    @Test
    void begin_exception(){
        //given
        HelloTraceV2 trace = new HelloTraceV2();
        TraceStatus status1 = trace.begin("hello");
        TraceStatus status2 = trace.beginSync(status1.getTraceId(),"hello");
        trace.exception(status2, new IllegalStateException());
        trace.exception(status1, new IllegalStateException());
        //when

        //then
    }
}