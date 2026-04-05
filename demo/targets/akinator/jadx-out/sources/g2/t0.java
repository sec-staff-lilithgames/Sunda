package g2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public static final t0 f56853e = new t0(1);

    @Override // kv.l
    public final n2.e invoke(Object it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        List list = (List) it;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            a1.m saver = q1.getSaver(n2.d.f75554b);
            n2.d dVar = null;
            if (!kotlin.jvm.internal.e0.areEqual(obj, Boolean.FALSE) && obj != null) {
                dVar = (n2.d) ((a1.p) saver).restore(obj);
            }
            kotlin.jvm.internal.e0.checkNotNull(dVar);
            arrayList.add(dVar);
        }
        return new n2.e(arrayList);
    }
}
