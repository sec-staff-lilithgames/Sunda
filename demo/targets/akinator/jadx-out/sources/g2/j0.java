package g2;

import g2.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public static final j0 f56777e = new j0(1);

    @Override // kv.l
    public final List<b.C0570b> invoke(Object it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        List list = (List) it;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            a1.m mVar = q1.f56809c;
            b.C0570b c0570b = null;
            if (!kotlin.jvm.internal.e0.areEqual(obj, Boolean.FALSE) && obj != null) {
                c0570b = (b.C0570b) ((a1.p) mVar).restore(obj);
            }
            kotlin.jvm.internal.e0.checkNotNull(c0570b);
            arrayList.add(c0570b);
        }
        return arrayList;
    }
}
