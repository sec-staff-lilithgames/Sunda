package g2;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public static final n1 f56796e = new n1(1);

    @Override // kv.l
    /* renamed from: invoke-XNhUCwk, reason: not valid java name and merged with bridge method [inline-methods] */
    public final s2.z invoke(Object it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        List list = (List) it;
        Object obj = list.get(0);
        Float f10 = obj != null ? (Float) obj : null;
        kotlin.jvm.internal.e0.checkNotNull(f10);
        float fFloatValue = f10.floatValue();
        Object obj2 = list.get(1);
        s2.c0 c0Var = obj2 != null ? (s2.c0) obj2 : null;
        kotlin.jvm.internal.e0.checkNotNull(c0Var);
        return s2.z.m6984boximpl(s2.a0.m6724TextUnitanM5pPY(fFloatValue, c0Var.m6768unboximpl()));
    }
}
