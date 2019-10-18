package org.bonn.se.ws19.uebung2.test;

import org.bonn.se.ws19.uebung2.control.*;
import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ContainerTest {
    Container container;
    CloneableMember member1;
    Member member2;
    Member member3;
    Member member1Clone;


    @Before
    public void setUp(){
        container = new Container();
        member1 = new CloneableMember();
        member2 = new ConcreteMember();
        member3 = new ConcreteMember();
        member1Clone = member1.clone();

    }

    @Test
    public void addSizeTest(){
        try {
            container.addMember(member1);
            container.addMember(member2);
            container.addMember(member3);
        }catch (ContainerException e){
            fail();
        }
        assertEquals(3, container.size());
    }

    @Test(expected = ContainerException.class)
    public void addContainerExceptionThrowTest() throws ContainerException{
        container.addMember(member1);
        container.addMember(member2);
        container.addMember(member1Clone);
    }

    @Test
    public void addContainerExceptionMessageTest(){
        try {
            container.addMember(member1);
            container.addMember(member2);
            container.addMember(member1Clone);
        }catch (ContainerException e){
            assertEquals("Das ConcreteMember-Objekt mit der ID " + member1.getId() + " ist bereits vorhanden!", e.toString());
        }
        fail();

    }

    @Test
    public void addContainerExceptionSizeTest(){
        try {
            container.addMember(member1);
            container.addMember(member2);
            container.addMember(member1Clone);
        }catch (ContainerException e){}
        assertEquals(2, container.size());
    }

    @Test
    public void deleteSizeTest(){
        try {
            container.addMember(member1);
            container.addMember(member2);
            container.addMember(member3);
        }catch (ContainerException e){
            fail();
        }
        container.deleteMember(member3.getId());
        assertEquals(2, container.size());
    }

    @Test
    public void deleteErrorMessageTest(){
        try {
            container.addMember(member1);
            container.addMember(member2);
            container.addMember(member3);
        }catch (ContainerException e){
            fail();
        }
        Member notContainedMember = new ConcreteMember();
        String message = container.deleteMember(notContainedMember.getId());
        Assert.assertEquals("Kein ConcreteMember-Objekt mit der ID " + notContainedMember.getId() + " gefunden", message);
    }

    @Test
    public void deleteErrorSizeTest(){
        try {
            container.addMember(member1);
            container.addMember(member2);
            container.addMember(member3);
        }catch (ContainerException e){
            fail();
        }
        Member notContainedMember = new ConcreteMember();
        container.deleteMember(notContainedMember.getId());
        Assert.assertEquals(3, container.size());
    }



}
