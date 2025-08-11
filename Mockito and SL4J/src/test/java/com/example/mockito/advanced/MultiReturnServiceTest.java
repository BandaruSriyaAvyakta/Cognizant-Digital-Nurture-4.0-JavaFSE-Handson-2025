
package com.example.mockito.advanced;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MultiReturnServiceTest {
    @Test
    void testMultipleReturns() {
        Repository mockRepo = mock(Repository.class);
        when(mockRepo.getData()).thenReturn("First Mock Data", "Second Mock Data");
        Service service = new Service(mockRepo);
        assertEquals("Processed First Mock Data", service.processData());
        assertEquals("Processed Second Mock Data", service.processData());
        verify(mockRepo, times(2)).getData();
    }
}
