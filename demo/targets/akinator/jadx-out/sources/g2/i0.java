package g2;

import g2.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public static final i0 f56771e = new i0(2);

    @Override // kv.p
    public final Object invoke(a1.r Saver, List<? extends b.C0570b> it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(Saver, "$this$Saver");
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        ArrayList arrayList = new ArrayList(it.size());
        int size = it.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(q1.save(it.get(i10), q1.f56809c, Saver));
        }
        return arrayList;
    }
}
