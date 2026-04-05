package g2;

import g2.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class p {
    public static final List access$getLocalPlaceholders(List list, int i10, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            b.C0570b c0570b = (b.C0570b) obj;
            if (g.intersect(i10, i11, c0570b.getStart(), c0570b.getEnd())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            b.C0570b c0570b2 = (b.C0570b) arrayList.get(i13);
            if (i10 > c0570b2.getStart() || c0570b2.getEnd() > i11) {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
            }
            arrayList2.add(new b.C0570b(c0570b2.getItem(), c0570b2.getStart() - i10, c0570b2.getEnd() - i10));
        }
        return arrayList2;
    }
}
