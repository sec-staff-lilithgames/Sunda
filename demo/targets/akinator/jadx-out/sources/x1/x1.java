package x1;

import java.util.ArrayList;
import java.util.List;
import z1.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x1 extends b0.b {

    /* renamed from: b, reason: collision with root package name */
    public static final x1 f91449b = new x1("Undefined intrinsics block and it is required");

    @Override // z1.b0.b, x1.x0
    /* renamed from: measure-3p2s80s */
    public y0 mo79measure3p2s80s(a1 measure, List<? extends w0> measurables, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(measure, "$this$measure");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        if (measurables.isEmpty()) {
            return a1.layout$default(measure, s2.c.m6757getMinWidthimpl(j10), s2.c.m6756getMinHeightimpl(j10), null, u1.f91444e, 4, null);
        }
        if (measurables.size() == 1) {
            q1 q1VarMo7826measureBRTryo0 = measurables.get(0).mo7826measureBRTryo0(j10);
            return a1.layout$default(measure, s2.d.m6772constrainWidthK40F9xA(j10, q1VarMo7826measureBRTryo0.getWidth()), s2.d.m6771constrainHeightK40F9xA(j10, q1VarMo7826measureBRTryo0.getHeight()), null, new v1(q1VarMo7826measureBRTryo0), 4, null);
        }
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(measurables.get(i10).mo7826measureBRTryo0(j10));
        }
        int size2 = arrayList.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i11 = 0; i11 < size2; i11++) {
            q1 q1Var = (q1) arrayList.get(i11);
            iMax = Math.max(q1Var.getWidth(), iMax);
            iMax2 = Math.max(q1Var.getHeight(), iMax2);
        }
        return a1.layout$default(measure, s2.d.m6772constrainWidthK40F9xA(j10, iMax), s2.d.m6771constrainHeightK40F9xA(j10, iMax2), null, new w1(arrayList), 4, null);
    }
}
