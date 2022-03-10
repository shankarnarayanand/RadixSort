package com.radixsort;

import java.util.ArrayList;
import java.util.List;

public class Radix {

    public List<Integer> sort(List<Integer> a){

        int len = a.size();
        if (len <= 1) return a;
        int mask = 255;
        int N = 256;

        for (int shift = 0; shift<= 24; shift+= 8)
        {
            List<Integer> count = new ArrayList<Integer>(N);
            int i = 0;
            while (i < len)
            {
                count.set((a.get(i) >> shift) & mask, 1);
                i += 1;
            }

            var index = new ArrayList<Integer>(N);

            int j = 0;
            while (j < N-1)
            {
                index.set(j + 1, index.get(j) + count.get(j));
                j += 1;
            }

            var temp = new ArrayList<Integer>(len);

            int k = 0;
            while (k < len)
            {
                int num = (a.get(k) >> shift) & mask;
                temp.set(index.get(num), a.get(k));
                index.set(num, 1);
                k += 1;
            }
            //List<Integer> copy = new ArrayList<>();
            a.addAll(temp);
            //Array.copy(temp, 0, a, 0, len)
        }
        return a;
    }
}

