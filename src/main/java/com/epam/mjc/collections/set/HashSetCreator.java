package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> expectedHashSet = new HashSet<>();
        int count=0;
        for (int i = 0; i < sourceList.size(); i++) {
            if (sourceList.get(i) % 2 == 0) {
                count++;
                if (count==0){
                    expectedHashSet.add(sourceList.get(i));
                }
                int number=sourceList.get(i);
                for (int j = 0; j < count; j++) {
                    expectedHashSet.add(number / 2);
                }
                --i;
            } else {
                expectedHashSet.add(sourceList.get(i));
                expectedHashSet.add(sourceList.get(i) * 2);
            }
        }
        return expectedHashSet;
    }
}
