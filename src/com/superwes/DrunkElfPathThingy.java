package com.superwes;

import java.util.HashSet;
import java.util.Set;

public class DrunkElfPathThingy {
    public int countVisits(String arg) {
        int x = 0, y = 0;
        Set<House> visitedHouses = new HashSet<>();
        visitedHouses.add(new House(x, y));
        for (char c : arg.toCharArray()) {
            switch (c) {
                case '>':
                    x += 1;
                    break;
                case '<':
                    x -= 1;
                    break;
                case '^':
                    y += 1;
                    break;
                case 'v':
                    y -= 1;
                    break;
            }
            visitedHouses.add(new House(x, y));
        }
        return visitedHouses.size();
    }

    private class House {
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            House house = (House) o;

            if (x != house.x) return false;
            return y == house.y;

        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }

        private final int x;
        private final int y;

        public House(int x, int y) {
            this.x = x;
            this.y = y;
        }


    }
}
