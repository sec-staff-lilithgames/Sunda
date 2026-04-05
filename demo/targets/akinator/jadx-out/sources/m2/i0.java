package m2;

import g2.a2;
import g2.q1;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public static final i0 f73921e = new i0(1);

    @Override // kv.l
    public final j0 invoke(Object it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        List list = (List) it;
        Object obj = list.get(0);
        a1.m annotatedStringSaver = q1.getAnnotatedStringSaver();
        Boolean bool = Boolean.FALSE;
        a2 a2Var = null;
        g2.b bVar = (kotlin.jvm.internal.e0.areEqual(obj, bool) || obj == null) ? null : (g2.b) ((a1.p) annotatedStringSaver).restore(obj);
        kotlin.jvm.internal.e0.checkNotNull(bVar);
        Object obj2 = list.get(1);
        a1.m saver = q1.getSaver(a2.f56706b);
        if (!kotlin.jvm.internal.e0.areEqual(obj2, bool) && obj2 != null) {
            a2Var = (a2) ((a1.p) saver).restore(obj2);
        }
        kotlin.jvm.internal.e0.checkNotNull(a2Var);
        return new j0(bVar, a2Var.m3964unboximpl(), (a2) null, 4, (kotlin.jvm.internal.u) null);
    }
}
