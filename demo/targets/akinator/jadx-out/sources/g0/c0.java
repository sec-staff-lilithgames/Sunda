package g0;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 implements x1.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f56372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1.d f56373b;

    public c0(e1.d dVar, boolean z10) {
        this.f56372a = z10;
        this.f56373b = dVar;
    }

    @Override // x1.x0
    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(x1.z zVar, List list, int i10) {
        return super.maxIntrinsicHeight(zVar, list, i10);
    }

    @Override // x1.x0
    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(x1.z zVar, List list, int i10) {
        return super.maxIntrinsicWidth(zVar, list, i10);
    }

    @Override // x1.x0
    /* renamed from: measure-3p2s80s */
    public final x1.y0 mo79measure3p2s80s(x1.a1 MeasurePolicy, List<? extends x1.w0> measurables, long j10) {
        long j11;
        int iM6757getMinWidthimpl;
        int iM6756getMinHeightimpl;
        x1.q1 q1VarMo7826measureBRTryo0;
        kotlin.jvm.internal.e0.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        if (measurables.isEmpty()) {
            return x1.a1.layout$default(MeasurePolicy, s2.c.m6757getMinWidthimpl(j10), s2.c.m6756getMinHeightimpl(j10), null, z.f56658e, 4, null);
        }
        if (this.f56372a) {
            j11 = j10;
        } else {
            j11 = j10;
            j10 = s2.c.m6747copyZbe2FdA$default(j11, 0, 0, 0, 0, 10, null);
        }
        if (measurables.size() == 1) {
            x1.w0 w0Var = measurables.get(0);
            if (d0.access$getMatchesParentSize(w0Var)) {
                iM6757getMinWidthimpl = s2.c.m6757getMinWidthimpl(j11);
                iM6756getMinHeightimpl = s2.c.m6756getMinHeightimpl(j11);
                q1VarMo7826measureBRTryo0 = w0Var.mo7826measureBRTryo0(s2.c.f85320b.m6738fixedJhjzzOo(s2.c.m6757getMinWidthimpl(j11), s2.c.m6756getMinHeightimpl(j11)));
            } else {
                q1VarMo7826measureBRTryo0 = w0Var.mo7826measureBRTryo0(j10);
                iM6757getMinWidthimpl = Math.max(s2.c.m6757getMinWidthimpl(j11), q1VarMo7826measureBRTryo0.getWidth());
                iM6756getMinHeightimpl = Math.max(s2.c.m6756getMinHeightimpl(j11), q1VarMo7826measureBRTryo0.getHeight());
            }
            int i10 = iM6757getMinWidthimpl;
            int i11 = iM6756getMinHeightimpl;
            return x1.a1.layout$default(MeasurePolicy, i10, i11, null, new a0(q1VarMo7826measureBRTryo0, w0Var, MeasurePolicy, i10, i11, this.f56373b), 4, null);
        }
        x1.q1[] q1VarArr = new x1.q1[measurables.size()];
        kotlin.jvm.internal.z0 z0Var = new kotlin.jvm.internal.z0();
        z0Var.f71866b = s2.c.m6757getMinWidthimpl(j11);
        kotlin.jvm.internal.z0 z0Var2 = new kotlin.jvm.internal.z0();
        z0Var2.f71866b = s2.c.m6756getMinHeightimpl(j11);
        int size = measurables.size();
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            x1.w0 w0Var2 = measurables.get(i12);
            if (d0.access$getMatchesParentSize(w0Var2)) {
                z10 = true;
            } else {
                x1.q1 q1VarMo7826measureBRTryo02 = w0Var2.mo7826measureBRTryo0(j10);
                q1VarArr[i12] = q1VarMo7826measureBRTryo02;
                z0Var.f71866b = Math.max(z0Var.f71866b, q1VarMo7826measureBRTryo02.getWidth());
                z0Var2.f71866b = Math.max(z0Var2.f71866b, q1VarMo7826measureBRTryo02.getHeight());
            }
        }
        if (z10) {
            int i13 = z0Var.f71866b;
            int i14 = i13 != Integer.MAX_VALUE ? i13 : 0;
            int i15 = z0Var2.f71866b;
            long jConstraints = s2.d.Constraints(i14, i13, i15 != Integer.MAX_VALUE ? i15 : 0, i15);
            int size2 = measurables.size();
            for (int i16 = 0; i16 < size2; i16++) {
                x1.w0 w0Var3 = measurables.get(i16);
                if (d0.access$getMatchesParentSize(w0Var3)) {
                    q1VarArr[i16] = w0Var3.mo7826measureBRTryo0(jConstraints);
                }
            }
        }
        return x1.a1.layout$default(MeasurePolicy, z0Var.f71866b, z0Var2.f71866b, null, new b0(q1VarArr, measurables, MeasurePolicy, z0Var, z0Var2, this.f56373b), 4, null);
    }

    @Override // x1.x0
    public /* bridge */ /* synthetic */ int minIntrinsicHeight(x1.z zVar, List list, int i10) {
        return super.minIntrinsicHeight(zVar, list, i10);
    }

    @Override // x1.x0
    public /* bridge */ /* synthetic */ int minIntrinsicWidth(x1.z zVar, List list, int i10) {
        return super.minIntrinsicWidth(zVar, list, i10);
    }
}
