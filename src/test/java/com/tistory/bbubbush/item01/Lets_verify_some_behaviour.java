package com.tistory.bbubbush.item01;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.mockito.Mockito.*;

/**
 * Name: 행동을 검증해보자.
 * Date: 2020/11/03
 * Info:
 *  객체는 상태와 행동을 갖습니다. 그 중 행동을 검증하는 방법을 학습하겠습니다.
 *  예제에서는 사람들이 인터페이스에 익숙하기 때문에 java.util.List 인터페이스를 사용했습니다.
 *  하지만 실제 테스트 코드를 작성하실 때에는 List 클래스 대신 실제 인스턴스를 사용하기 바랍니다.
 */
public class Lets_verify_some_behaviour {
    @Test
    public void sample_01() {
        // Mock 객체 생성
        List mockedList = mock(List.class);

        // Mock 객체가 가진 메서드를 사용
        mockedList.add("one");
        mockedList.clear();

        // Mock 객체의 기능이 사용되었는지 검증
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }
}
