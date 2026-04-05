package g2;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public static final z0 f56892e = new z0(1);

    @Override // kv.l
    public final x invoke(Object it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        List list = (List) it;
        Object obj = list.get(0);
        r2.x xVar = null;
        r2.m mVar = obj != null ? (r2.m) obj : null;
        Object obj2 = list.get(1);
        r2.p pVar = obj2 != null ? (r2.p) obj2 : null;
        Object obj3 = list.get(2);
        a1.m saver = q1.getSaver(s2.z.f85366b);
        Boolean bool = Boolean.FALSE;
        s2.z zVar = (kotlin.jvm.internal.e0.areEqual(obj3, bool) || obj3 == null) ? null : (s2.z) ((a1.p) saver).restore(obj3);
        kotlin.jvm.internal.e0.checkNotNull(zVar);
        long jM7003unboximpl = zVar.m7003unboximpl();
        Object obj4 = list.get(3);
        a1.m saver2 = q1.getSaver(r2.x.f83728c);
        if (!kotlin.jvm.internal.e0.areEqual(obj4, bool) && obj4 != null) {
            xVar = (r2.x) ((a1.p) saver2).restore(obj4);
        }
        return new x(mVar, pVar, jM7003unboximpl, xVar, null);
    }
}
