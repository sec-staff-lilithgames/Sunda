package g2;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public static final b1 f56735e = new b1(1);

    @Override // kv.l
    public final j1.d2 invoke(Object it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        List list = (List) it;
        Object obj = list.get(0);
        a1.m saver = q1.getSaver(j1.m0.f68918b);
        Boolean bool = Boolean.FALSE;
        j1.m0 m0Var = (kotlin.jvm.internal.e0.areEqual(obj, bool) || obj == null) ? null : (j1.m0) ((a1.p) saver).restore(obj);
        kotlin.jvm.internal.e0.checkNotNull(m0Var);
        long jM4868unboximpl = m0Var.m4868unboximpl();
        Object obj2 = list.get(1);
        i1.h hVar = (kotlin.jvm.internal.e0.areEqual(obj2, bool) || obj2 == null) ? null : (i1.h) ((a1.p) q1.getSaver(i1.h.f59344b)).restore(obj2);
        kotlin.jvm.internal.e0.checkNotNull(hVar);
        long jM4195unboximpl = hVar.m4195unboximpl();
        Object obj3 = list.get(2);
        Float f10 = obj3 != null ? (Float) obj3 : null;
        kotlin.jvm.internal.e0.checkNotNull(f10);
        return new j1.d2(jM4868unboximpl, jM4195unboximpl, f10.floatValue(), null);
    }
}
