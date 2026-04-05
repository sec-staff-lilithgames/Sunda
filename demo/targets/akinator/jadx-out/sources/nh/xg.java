package nh;

import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum xg extends bh {
    public xg() {
        super("LAST_PRESENT", 1);
    }

    @Override // nh.bh
    public final int resultIndex(Comparator comparator, Object obj, List list, int i10) {
        int size = list.size() - 1;
        while (i10 < size) {
            int i11 = ((i10 + size) + 1) >>> 1;
            if (comparator.compare(list.get(i11), obj) > 0) {
                size = i11 - 1;
            } else {
                i10 = i11;
            }
        }
        return i10;
    }
}
