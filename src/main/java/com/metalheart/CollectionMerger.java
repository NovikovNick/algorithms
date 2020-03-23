package com.metalheart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class CollectionMerger {

    private CollectionMerger() {
        throw new UnsupportedOperationException();
    }

    public static List<Integer> merge(List<Integer> aArr, List<Integer> bArr) {

        List<Integer> res = new ArrayList<>();

        final boolean isEmptyB = bArr == null || bArr.isEmpty();
        final boolean isEmptyA = aArr == null || aArr.isEmpty();

        if(isEmptyA) {
            if(isEmptyB) {
                return res;
            } else {
                return bArr;
            }
        }
        if(isEmptyB) {
            if(isEmptyA) {
                return res;
            } else {
                return aArr;
            }
        }

        res.addAll(aArr);
        res.addAll(bArr);
        Collections.sort(res);

        return res;
    }
}
