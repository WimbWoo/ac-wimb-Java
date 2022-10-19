package com.wimb.MockTest;

import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockDemoTest {

    @Test
    public void test() {
        List<Integer> mockList = mock(List.class);
        when(mockList.get(0)).thenReturn(new Integer("1"));
    }
}
