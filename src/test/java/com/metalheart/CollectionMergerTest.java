package com.metalheart;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;

public class CollectionMergerTest {

    @Test
    public void mergeTest() {
        final List<Integer> merged = CollectionMerger.merge(asList(3, 4, 5, 8), asList(6, 7));
        Assert.assertEquals(asList(3, 4, 5, 6, 7, 8), merged);
    }

    @Test
    public void mergeTestWithDuplicates() {
        final List<Integer> merged = CollectionMerger.merge(asList(1, 1, 1), asList(1, 1, 1, 1));
        Assert.assertEquals(asList(1, 1, 1, 1, 1, 1, 1), merged);
    }

    @Test
    public void mergeTestWithEmpty() {
        Assert.assertEquals(asList(1,2,3), CollectionMerger.merge(asList(), asList(1,2,3)));
        Assert.assertEquals(asList(1,2,3), CollectionMerger.merge(null, asList(1,2,3)));

        Assert.assertEquals(asList(1,2,3), CollectionMerger.merge(asList(1,2,3), asList()));
        Assert.assertEquals(asList(1,2,3), CollectionMerger.merge(asList(1,2,3), null));
    }
}
