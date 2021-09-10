package Linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class Search {
    @Test
    public void search() {
        int value=30;
        int result=Operations.searchtest(value);
        Assert.assertEquals(30,result);
    }
}
