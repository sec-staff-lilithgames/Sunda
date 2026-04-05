package com.ironsource;

import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.of, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3383of extends K4 {
    private final int b(AbstractC3553z abstractC3553z) {
        return abstractC3553z.h().l();
    }

    @Override // com.ironsource.F
    public boolean a(AbstractC3553z instance, Cg waterfallInstances) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.e0.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        return a(waterfallInstances) < b(instance);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3383of(AbstractC3486v0 adUnitData, Cg cg2) {
        super(adUnitData, cg2);
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.e0.checkNotNullParameter(cg2, SUvoXnn.iIEfM);
    }

    private final int a(Cg cg2) {
        Integer num;
        List<AbstractC3553z> listB = cg2.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (((AbstractC3553z) obj).w()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(b((AbstractC3553z) it.next()));
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(b((AbstractC3553z) it.next()));
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }
}
