package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.test.entity.TestEntity;

public class SetterAspectTest {

    @Test
    public void whenSetterParamIsNull_thenShouldNotCallTheSetter() {
        TestEntity testEntityEntity = TestEntity.builder()
            .field("something")
            .build();

        testEntityEntity.setField(null);

        assertEquals("something", testEntityEntity.getField());
    }

    @Test
    public void whenSetterParamIsNotEmpty_thenShouldCallTheSetter() {
        TestEntity testEntityEntity = TestEntity.builder()
            .field("something")
            .build();

        testEntityEntity.setField("something else");

        assertEquals("something else", testEntityEntity.getField());
    }

    @Test
    public void whenSetterParamIsEmpty_thenShouldNotCallTheSetter() {
        TestEntity testEntityEntity = TestEntity.builder()
            .field("something")
            .build();

        testEntityEntity.setField("");

        assertEquals("something", testEntityEntity.getField());
    }
}
