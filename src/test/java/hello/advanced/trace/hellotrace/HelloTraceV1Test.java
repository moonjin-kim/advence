package hello.advanced.trace.hellotrace;

import hello.advanced.trace.TraceStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTraceV1Test {

    @DisplayName("쿼리의 시작과 끝을 로그로 출력할 수 있다.")
    @Test
    void begin_end(){
        //given
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus status = trace.begin("hello");
        trace.end(status);

        //when

        //then
    }

    @DisplayName("예외가 발생했을때 로그로 예외를 알 수 있다.")
    @Test
    void begin_exception(){
        //given
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus status = trace.begin("hello");
        trace.exception(status, new IllegalStateException());
        //when

        //then
    }
}