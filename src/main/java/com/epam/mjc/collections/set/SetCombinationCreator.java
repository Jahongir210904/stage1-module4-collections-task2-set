package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> strings=new HashSet<>();
        for (String first : firstSet) {
            for (String second : secondSet) {
                if(first.equals(second)){
                    boolean state=false;
                    for (String third : thirdSet) {
                        if(third.equals(first)){
                            state=true;
                        }
                    }
                    if(!state){
                       strings.add(first);
                    }
                }
            }
        }
        for (String third : thirdSet) {
            boolean state=false;
            for (String first : firstSet) {
                if(third.equals(first)){
                    state=true;
                }
            }
            for (String second : secondSet) {
                if (third.equals(second)){
                    state=true;
                }
            }
            if(!state){
                strings.add(third);
            }
        }
        return strings;
    }
}
