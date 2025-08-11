
package com.example.mockito.basic;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {
    @Test
    void testExternalApiMocking() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");
        MyService service = new MyService(mockApi);
        assertEquals("Mock Data", service.fetchData());
        verify(mockApi).getData();
    }
}
