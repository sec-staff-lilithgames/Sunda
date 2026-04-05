package nh;

import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum yg extends bh {
    public yg() {
        super("FIRST_PRESENT", 2);
    }

    @Override // nh.bh
    public final int resultIndex(Comparator comparator, Object obj, List list, int i10) {
        int i11 = 0;
        while (i11 < i10) {
            int i12 = (i11 + i10) >>> 1;
            if (comparator.compare(list.get(i12), obj) < 0) {
                i11 = i12 + 1;
            } else {
                i10 = i12;
            }
        }
        return i11;
    }
}
