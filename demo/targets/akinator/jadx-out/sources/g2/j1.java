package g2;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public static final j1 f56778e = new j1(1);

    @Override // kv.l
    public final r2.x invoke(Object it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        List list = (List) it;
        Object obj = list.get(0);
        s2.y yVar = s2.z.f85366b;
        a1.m saver = q1.getSaver(yVar);
        Boolean bool = Boolean.FALSE;
        s2.z zVar = null;
        s2.z zVar2 = (kotlin.jvm.internal.e0.areEqual(obj, bool) || obj == null) ? null : (s2.z) ((a1.p) saver).restore(obj);
        kotlin.jvm.internal.e0.checkNotNull(zVar2);
        long jM7003unboximpl = zVar2.m7003unboximpl();
        Object obj2 = list.get(1);
        a1.m saver2 = q1.getSaver(yVar);
        if (!kotlin.jvm.internal.e0.areEqual(obj2, bool) && obj2 != null) {
            zVar = (s2.z) ((a1.p) saver2).restore(obj2);
        }
        kotlin.jvm.internal.e0.checkNotNull(zVar);
        return new r2.x(jM7003unboximpl, zVar.m7003unboximpl(), null);
    }
}
