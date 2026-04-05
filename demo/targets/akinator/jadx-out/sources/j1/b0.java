package j1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f68844a = i1.o.f59366b.m4238getUnspecifiedNHjbRc();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ b0 m4673horizontalGradient8A3gB4$default(a aVar, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = r2.f68961b.m4915getClamp3opZhB0();
            }
            return aVar.m4683horizontalGradient8A3gB4((List<m0>) list, f10, f11, i10);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ b0 m4676linearGradientmHitzGk$default(a aVar, tu.v[] vVarArr, long j10, long j11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = i1.h.f59344b.m4173getZeroF1C5BW0();
            }
            long j12 = j10;
            if ((i11 & 4) != 0) {
                j11 = i1.h.f59344b.m4171getInfiniteF1C5BW0();
            }
            long j13 = j11;
            if ((i11 & 8) != 0) {
                i10 = r2.f68961b.m4915getClamp3opZhB0();
            }
            return aVar.m4686linearGradientmHitzGk(vVarArr, j12, j13, i10);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ b0 m4678radialGradientP_VxKs$default(a aVar, tu.v[] vVarArr, long j10, float f10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = i1.h.f59344b.m4172getUnspecifiedF1C5BW0();
            }
            long j11 = j10;
            if ((i11 & 4) != 0) {
                f10 = Float.POSITIVE_INFINITY;
            }
            float f11 = f10;
            if ((i11 & 8) != 0) {
                i10 = r2.f68961b.m4915getClamp3opZhB0();
            }
            return aVar.m4688radialGradientP_VxKs(vVarArr, j11, f11, i10);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ b0 m4680sweepGradientUv8p0NA$default(a aVar, tu.v[] vVarArr, long j10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                j10 = i1.h.f59344b.m4172getUnspecifiedF1C5BW0();
            }
            return aVar.m4690sweepGradientUv8p0NA(vVarArr, j10);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ b0 m4681verticalGradient8A3gB4$default(a aVar, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = r2.f68961b.m4915getClamp3opZhB0();
            }
            return aVar.m4691verticalGradient8A3gB4((List<m0>) list, f10, f11, i10);
        }

        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final b0 m4683horizontalGradient8A3gB4(List<m0> colors, float f10, float f11, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(colors, "colors");
            return m4685linearGradientmHitzGk(colors, i1.i.Offset(f10, 0.0f), i1.i.Offset(f11, 0.0f), i10);
        }

        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final b0 m4686linearGradientmHitzGk(tu.v[] colorStops, long j10, long j11, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(colorStops, "colorStops");
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (tu.v vVar : colorStops) {
                arrayList.add(m0.m4848boximpl(((m0) vVar.getSecond()).m4868unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (tu.v vVar2 : colorStops) {
                arrayList2.add(Float.valueOf(((Number) vVar2.getFirst()).floatValue()));
            }
            return new c1(arrayList, arrayList2, j10, j11, i10, null);
        }

        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final b0 m4688radialGradientP_VxKs(tu.v[] colorStops, long j10, float f10, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(colorStops, "colorStops");
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (tu.v vVar : colorStops) {
                arrayList.add(m0.m4848boximpl(((m0) vVar.getSecond()).m4868unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (tu.v vVar2 : colorStops) {
                arrayList2.add(Float.valueOf(((Number) vVar2.getFirst()).floatValue()));
            }
            return new v1(arrayList, arrayList2, j10, f10, i10, null);
        }

        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final b0 m4690sweepGradientUv8p0NA(tu.v[] colorStops, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(colorStops, "colorStops");
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (tu.v vVar : colorStops) {
                arrayList.add(m0.m4848boximpl(((m0) vVar.getSecond()).m4868unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (tu.v vVar2 : colorStops) {
                arrayList2.add(Float.valueOf(((Number) vVar2.getFirst()).floatValue()));
            }
            return new p2(j10, arrayList, arrayList2, null);
        }

        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final b0 m4691verticalGradient8A3gB4(List<m0> colors, float f10, float f11, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(colors, "colors");
            return m4685linearGradientmHitzGk(colors, i1.i.Offset(0.0f, f10), i1.i.Offset(0.0f, f11), i10);
        }

        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final b0 m4684horizontalGradient8A3gB4(tu.v[] colorStops, float f10, float f11, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(colorStops, "colorStops");
            return m4686linearGradientmHitzGk((tu.v[]) Arrays.copyOf(colorStops, colorStops.length), i1.i.Offset(f10, 0.0f), i1.i.Offset(f11, 0.0f), i10);
        }

        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final b0 m4692verticalGradient8A3gB4(tu.v[] colorStops, float f10, float f11, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(colorStops, "colorStops");
            return m4686linearGradientmHitzGk((tu.v[]) Arrays.copyOf(colorStops, colorStops.length), i1.i.Offset(0.0f, f10), i1.i.Offset(0.0f, f11), i10);
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ b0 m4674horizontalGradient8A3gB4$default(a aVar, tu.v[] vVarArr, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = r2.f68961b.m4915getClamp3opZhB0();
            }
            return aVar.m4684horizontalGradient8A3gB4(vVarArr, f10, f11, i10);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ b0 m4679sweepGradientUv8p0NA$default(a aVar, List list, long j10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                j10 = i1.h.f59344b.m4172getUnspecifiedF1C5BW0();
            }
            return aVar.m4689sweepGradientUv8p0NA((List<m0>) list, j10);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ b0 m4682verticalGradient8A3gB4$default(a aVar, tu.v[] vVarArr, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = r2.f68961b.m4915getClamp3opZhB0();
            }
            return aVar.m4692verticalGradient8A3gB4(vVarArr, f10, f11, i10);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ b0 m4677radialGradientP_VxKs$default(a aVar, List list, long j10, float f10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = i1.h.f59344b.m4172getUnspecifiedF1C5BW0();
            }
            long j11 = j10;
            if ((i11 & 4) != 0) {
                f10 = Float.POSITIVE_INFINITY;
            }
            float f11 = f10;
            if ((i11 & 8) != 0) {
                i10 = r2.f68961b.m4915getClamp3opZhB0();
            }
            return aVar.m4687radialGradientP_VxKs((List<m0>) list, j11, f11, i10);
        }

        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final b0 m4685linearGradientmHitzGk(List<m0> colors, long j10, long j11, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(colors, "colors");
            return new c1(colors, null, j10, j11, i10, null);
        }

        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final b0 m4687radialGradientP_VxKs(List<m0> colors, long j10, float f10, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(colors, "colors");
            return new v1(colors, null, j10, f10, i10, null);
        }

        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final b0 m4689sweepGradientUv8p0NA(List<m0> colors, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(colors, "colors");
            return new p2(j10, colors, null, null);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ b0 m4675linearGradientmHitzGk$default(a aVar, List list, long j10, long j11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = i1.h.f59344b.m4173getZeroF1C5BW0();
            }
            long j12 = j10;
            if ((i11 & 4) != 0) {
                j11 = i1.h.f59344b.m4171getInfiniteF1C5BW0();
            }
            long j13 = j11;
            if ((i11 & 8) != 0) {
                i10 = r2.f68961b.m4915getClamp3opZhB0();
            }
            return aVar.m4685linearGradientmHitzGk((List<m0>) list, j12, j13, i10);
        }
    }

    static {
        new a(null);
    }

    public b0(kotlin.jvm.internal.u uVar) {
    }

    /* renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public abstract void mo4671applyToPq9zytI(long j10, i1 i1Var, float f10);

    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo4672getIntrinsicSizeNHjbRc() {
        return this.f68844a;
    }
}
