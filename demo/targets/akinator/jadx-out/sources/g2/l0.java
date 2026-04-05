package g2;

import g2.b;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public static final l0 f56789e = new l0(1);

    @Override // kv.l
    public final b.C0570b invoke(Object it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        List list = (List) it;
        Object obj = list.get(0);
        h hVar = obj != null ? (h) obj : null;
        kotlin.jvm.internal.e0.checkNotNull(hVar);
        Object obj2 = list.get(2);
        Integer num = obj2 != null ? (Integer) obj2 : null;
        kotlin.jvm.internal.e0.checkNotNull(num);
        int iIntValue = num.intValue();
        Object obj3 = list.get(3);
        Integer num2 = obj3 != null ? (Integer) obj3 : null;
        kotlin.jvm.internal.e0.checkNotNull(num2);
        int iIntValue2 = num2.intValue();
        Object obj4 = list.get(4);
        String str = obj4 != null ? (String) obj4 : null;
        kotlin.jvm.internal.e0.checkNotNull(str);
        int iOrdinal = hVar.ordinal();
        if (iOrdinal == 0) {
            Object obj5 = list.get(1);
            a1.m paragraphStyleSaver = q1.getParagraphStyleSaver();
            if (!kotlin.jvm.internal.e0.areEqual(obj5, Boolean.FALSE) && obj5 != null) {
                obj = (x) ((a1.p) paragraphStyleSaver).restore(obj5);
            }
            kotlin.jvm.internal.e0.checkNotNull(obj);
            return new b.C0570b(obj, iIntValue, iIntValue2, str);
        }
        if (iOrdinal == 1) {
            Object obj6 = list.get(1);
            a1.m spanStyleSaver = q1.getSpanStyleSaver();
            if (!kotlin.jvm.internal.e0.areEqual(obj6, Boolean.FALSE) && obj6 != null) {
                obj = (r1) ((a1.p) spanStyleSaver).restore(obj6);
            }
            kotlin.jvm.internal.e0.checkNotNull(obj);
            return new b.C0570b(obj, iIntValue, iIntValue2, str);
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new tu.t();
            }
            Object obj7 = list.get(1);
            obj = obj7 != null ? (String) obj7 : null;
            kotlin.jvm.internal.e0.checkNotNull(obj);
            return new b.C0570b(obj, iIntValue, iIntValue2, str);
        }
        Object obj8 = list.get(1);
        a1.m mVar = q1.f56810d;
        if (!kotlin.jvm.internal.e0.areEqual(obj8, Boolean.FALSE) && obj8 != null) {
            obj = (g2) ((a1.p) mVar).restore(obj8);
        }
        kotlin.jvm.internal.e0.checkNotNull(obj);
        return new b.C0570b(obj, iIntValue, iIntValue2, str);
    }
}
