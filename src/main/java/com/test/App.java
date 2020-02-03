package com.test;

import com.test.entity.TestEntity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TestEntity testEntity = new TestEntity("initialValue");
        TestEntity testEntity2 = new TestEntity("initialValue2");
        TestEntity testEntity3 = new TestEntity("initialValue3");

        testEntity.setField("something");
        System.out.println("value of entity1 field: " + testEntity.getField());

        testEntity2.setField(null);
        System.out.println("value of entity2 field: " + testEntity2.getField());

        testEntity3.setField("");
        System.out.println("value of entity3 field: " + testEntity3.getField());
    }
}
