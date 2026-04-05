package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class t4 {
    public static int a(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i11 <= i10) {
            return i10;
        }
        int iHighestOneBit = i10 + (i10 >> 1) + 1;
        if (iHighestOneBit < i11) {
            iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public abstract t4 add(Object obj);

    public t4 add(Object... objArr) {
        for (Object obj : objArr) {
            add(obj);
        }
        return this;
    }

    public t4 addAll(Iterable<Object> iterable) {
        Iterator<Object> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
        return this;
    }

    public abstract u4 build();

    public t4 addAll(Iterator<Object> it) {
        while (it.hasNext()) {
            add(it.next());
        }
        return this;
    }
}
