package g2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public static final s0 f56848e = new s0(2);

    @Override // kv.p
    public final Object invoke(a1.r Saver, n2.e it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(Saver, "$this$Saver");
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        List<n2.d> localeList = it.getLocaleList();
        ArrayList arrayList = new ArrayList(localeList.size());
        int size = localeList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(q1.save(localeList.get(i10), q1.getSaver(n2.d.f75554b), Saver));
        }
        return arrayList;
    }
}
