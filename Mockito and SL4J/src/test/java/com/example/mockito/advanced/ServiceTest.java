
package com.example.mockito.advanced;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ServiceTest {
    @Test
    void testServiceWithMockRepository() {
        Repository mockRepo = mock(Repository.class);
        when(mockRepo.getData()).thenReturn("Mock Data");
        Service service = new Service(mockRepo);
        assertEquals("Processed Mock Data", service.processData());
        verify(mockRepo).getData();
    }
}
