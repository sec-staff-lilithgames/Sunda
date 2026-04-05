package g2;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public static final l1 f56790e = new l1(1);

    @Override // kv.l
    /* renamed from: invoke-VqIyPBM, reason: not valid java name and merged with bridge method [inline-methods] */
    public final a2 invoke(Object it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        List list = (List) it;
        Object obj = list.get(0);
        Integer num = obj != null ? (Integer) obj : null;
        kotlin.jvm.internal.e0.checkNotNull(num);
        int iIntValue = num.intValue();
        Object obj2 = list.get(1);
        Integer num2 = obj2 != null ? (Integer) obj2 : null;
        kotlin.jvm.internal.e0.checkNotNull(num2);
        return a2.m3948boximpl(b2.TextRange(iIntValue, num2.intValue()));
    }
}
