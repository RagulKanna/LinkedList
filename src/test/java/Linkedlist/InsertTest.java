package Linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class InsertTest {
    @Test
    public void insert() {
        int newnode=40,nextnode=30;
        int result=Operations.inserttest(nextnode,newnode);
        Assert.assertEquals(3,result);
    }
}
