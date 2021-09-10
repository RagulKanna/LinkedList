package Linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class DeleteTest {
    @Test
    public void delete() {
        int deletenode=40;
        int result=Operations.deletetest(deletenode);
        Assert.assertEquals(3,result);
    }
}
