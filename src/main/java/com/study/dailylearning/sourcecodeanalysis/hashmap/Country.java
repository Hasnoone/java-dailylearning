package com.study.dailylearning.sourcecodeanalysis.hashmap;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Country {
    String name;
    long population;


    @Override
    public int hashCode() {
        if (this.name.length() % 2 == 0) {
            return 31;
        } else {
            return 95;
        }
    }

    @Override
    public boolean equals(Object obj) {
        Country copy = (Country) obj;
        if (copy.name.equalsIgnoreCase(this.name)) {
            return true;
        } else {
            return false;
        }
    }
}
