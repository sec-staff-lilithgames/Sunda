package g2;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public static final h0 f56765e = new h0(1);

    @Override // kv.l
    public final b invoke(Object it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        List list = (List) it;
        Object obj = list.get(0);
        List list2 = null;
        String str = obj != null ? (String) obj : null;
        kotlin.jvm.internal.e0.checkNotNull(str);
        Object obj2 = list.get(1);
        a1.m mVar = q1.f56808b;
        Boolean bool = Boolean.FALSE;
        List list3 = (kotlin.jvm.internal.e0.areEqual(obj2, bool) || obj2 == null) ? null : (List) ((a1.p) mVar).restore(obj2);
        kotlin.jvm.internal.e0.checkNotNull(list3);
        Object obj3 = list.get(2);
        List list4 = (kotlin.jvm.internal.e0.areEqual(obj3, bool) || obj3 == null) ? null : (List) ((a1.p) q1.f56808b).restore(obj3);
        kotlin.jvm.internal.e0.checkNotNull(list4);
        Object obj4 = list.get(3);
        a1.m mVar2 = q1.f56808b;
        if (!kotlin.jvm.internal.e0.areEqual(obj4, bool) && obj4 != null) {
            list2 = (List) ((a1.p) mVar2).restore(obj4);
        }
        kotlin.jvm.internal.e0.checkNotNull(list2);
        return new b(str, list3, list4, list2);
    }
}
