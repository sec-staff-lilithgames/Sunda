package g2;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public static final x0 f56879e = new x0(1);

    @Override // kv.l
    /* renamed from: invoke-x-9fifI, reason: not valid java name and merged with bridge method [inline-methods] */
    public final i1.h invoke(Object it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        if (kotlin.jvm.internal.e0.areEqual(it, Boolean.FALSE)) {
            return i1.h.m4174boximpl(i1.h.f59344b.m4172getUnspecifiedF1C5BW0());
        }
        List list = (List) it;
        Object obj = list.get(0);
        Float f10 = obj != null ? (Float) obj : null;
        kotlin.jvm.internal.e0.checkNotNull(f10);
        float fFloatValue = f10.floatValue();
        Object obj2 = list.get(1);
        Float f11 = obj2 != null ? (Float) obj2 : null;
        kotlin.jvm.internal.e0.checkNotNull(f11);
        return i1.h.m4174boximpl(i1.i.Offset(fFloatValue, f11.floatValue()));
    }
}
