package io.odeeo.internal.n0;

import android.util.Pair;
import io.odeeo.internal.a0.k0;
import io.odeeo.internal.a0.l0;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.b.n;
import io.odeeo.internal.b.q0;
import io.odeeo.internal.b.r0;
import io.odeeo.internal.b.y0;
import io.odeeo.internal.b.z0;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.u0.h1;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class f extends k {

    /* renamed from: c, reason: collision with root package name */
    public a f64985c;

    public static int a(q0[] q0VarArr, k0 k0Var, int[] iArr, boolean z10) throws n {
        int length = q0VarArr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < q0VarArr.length; i11++) {
            q0 q0Var = q0VarArr[i11];
            int iMax = 0;
            for (int i12 = 0; i12 < k0Var.f62395a; i12++) {
                iMax = Math.max(iMax, q0.getFormatSupport(q0Var.supportsFormat(k0Var.getFormat(i12))));
            }
            boolean z12 = iArr[i11] == 0;
            if (iMax > i10 || (iMax == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = iMax;
            }
        }
        return length;
    }

    public abstract Pair<r0[], d[]> a(a aVar, int[][][] iArr, int[] iArr2, t.a aVar2, y0 y0Var) throws n;

    public final a getCurrentMappedTrackInfo() {
        return this.f64985c;
    }

    @Override // io.odeeo.internal.n0.k
    public final void onSelectionActivated(Object obj) {
        this.f64985c = (a) obj;
    }

    @Override // io.odeeo.internal.n0.k
    public final l selectTracks(q0[] q0VarArr, l0 l0Var, t.a aVar, y0 y0Var) throws n {
        int[] iArr = new int[q0VarArr.length + 1];
        int length = q0VarArr.length + 1;
        k0[][] k0VarArr = new k0[length][];
        int[][][] iArr2 = new int[q0VarArr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = l0Var.f62401a;
            k0VarArr[i10] = new k0[i11];
            iArr2[i10] = new int[i11][];
        }
        int[] iArrA = a(q0VarArr);
        for (int i12 = 0; i12 < l0Var.f62401a; i12++) {
            k0 k0Var = l0Var.get(i12);
            int iA = a(q0VarArr, k0Var, iArr, io.odeeo.internal.q0.t.getTrackType(k0Var.getFormat(0).f62971l) == 5);
            int[] iArrA2 = iA == q0VarArr.length ? new int[k0Var.f62395a] : a(q0VarArr[iA], k0Var);
            int i13 = iArr[iA];
            k0VarArr[iA][i13] = k0Var;
            iArr2[iA][i13] = iArrA2;
            iArr[iA] = i13 + 1;
        }
        l0[] l0VarArr = new l0[q0VarArr.length];
        String[] strArr = new String[q0VarArr.length];
        int[] iArr3 = new int[q0VarArr.length];
        for (int i14 = 0; i14 < q0VarArr.length; i14++) {
            int i15 = iArr[i14];
            l0VarArr[i14] = new l0((k0[]) g0.nullSafeArrayCopy(k0VarArr[i14], i15));
            iArr2[i14] = (int[][]) g0.nullSafeArrayCopy(iArr2[i14], i15);
            strArr[i14] = q0VarArr[i14].getName();
            iArr3[i14] = q0VarArr[i14].getTrackType();
        }
        a aVar2 = new a(strArr, iArr3, l0VarArr, iArrA, iArr2, new l0((k0[]) g0.nullSafeArrayCopy(k0VarArr[q0VarArr.length], iArr[q0VarArr.length])));
        Pair<r0[], d[]> pairA = a(aVar2, iArr2, iArrA, aVar, y0Var);
        return new l((r0[]) pairA.first, (d[]) pairA.second, a((g[]) pairA.second, aVar2), aVar2);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f64986a;

        /* renamed from: b, reason: collision with root package name */
        public final String[] f64987b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f64988c;

        /* renamed from: d, reason: collision with root package name */
        public final l0[] f64989d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f64990e;

        /* renamed from: f, reason: collision with root package name */
        public final int[][][] f64991f;

        /* renamed from: g, reason: collision with root package name */
        public final l0 f64992g;

        public a(String[] strArr, int[] iArr, l0[] l0VarArr, int[] iArr2, int[][][] iArr3, l0 l0Var) {
            this.f64987b = strArr;
            this.f64988c = iArr;
            this.f64989d = l0VarArr;
            this.f64991f = iArr3;
            this.f64990e = iArr2;
            this.f64992g = l0Var;
            this.f64986a = iArr.length;
        }

        public int getAdaptiveSupport(int i10, int i11, boolean z10) {
            int i12 = this.f64989d[i10].get(i11).f62395a;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int trackSupport = getTrackSupport(i10, i11, i14);
                if (trackSupport == 4 || (z10 && trackSupport == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return getAdaptiveSupport(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int getRendererCount() {
            return this.f64986a;
        }

        public String getRendererName(int i10) {
            return this.f64987b[i10];
        }

        public int getRendererSupport(int i10) {
            int iMax = 0;
            for (int[] iArr : this.f64991f[i10]) {
                for (int i11 : iArr) {
                    int formatSupport = q0.getFormatSupport(i11);
                    int i12 = 1;
                    if (formatSupport != 0 && formatSupport != 1 && formatSupport != 2) {
                        if (formatSupport != 3) {
                            if (formatSupport == 4) {
                                return 3;
                            }
                            throw new IllegalStateException();
                        }
                        i12 = 2;
                    }
                    iMax = Math.max(iMax, i12);
                }
            }
            return iMax;
        }

        public int getRendererType(int i10) {
            return this.f64988c[i10];
        }

        public l0 getTrackGroups(int i10) {
            return this.f64989d[i10];
        }

        public int getTrackSupport(int i10, int i11, int i12) {
            return q0.getFormatSupport(this.f64991f[i10][i11][i12]);
        }

        public int getTypeSupport(int i10) {
            int iMax = 0;
            for (int i11 = 0; i11 < this.f64986a; i11++) {
                if (this.f64988c[i11] == i10) {
                    iMax = Math.max(iMax, getRendererSupport(i11));
                }
            }
            return iMax;
        }

        public l0 getUnmappedTrackGroups() {
            return this.f64992g;
        }

        public int getAdaptiveSupport(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int iMin = 16;
            String str = null;
            boolean z10 = false;
            int i13 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f64989d[i10].get(i11).getFormat(iArr[i12]).f62971l;
                int i14 = i13 + 1;
                if (i13 == 0) {
                    str = str2;
                } else {
                    z10 |= !g0.areEqual(str, str2);
                }
                iMin = Math.min(iMin, q0.getAdaptiveSupport(this.f64991f[i10][i11][i12]));
                i12++;
                i13 = i14;
            }
            return z10 ? Math.min(iMin, this.f64990e[i10]) : iMin;
        }
    }

    public static int[] a(q0 q0Var, k0 k0Var) throws n {
        int[] iArr = new int[k0Var.f62395a];
        for (int i10 = 0; i10 < k0Var.f62395a; i10++) {
            iArr[i10] = q0Var.supportsFormat(k0Var.getFormat(i10));
        }
        return iArr;
    }

    public static int[] a(q0[] q0VarArr) throws n {
        int length = q0VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = q0VarArr[i10].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }

    public static z0 a(g[] gVarArr, a aVar) {
        h1.a aVar2 = new h1.a();
        for (int i10 = 0; i10 < aVar.getRendererCount(); i10++) {
            l0 trackGroups = aVar.getTrackGroups(i10);
            g gVar = gVarArr[i10];
            for (int i11 = 0; i11 < trackGroups.f62401a; i11++) {
                k0 k0Var = trackGroups.get(i11);
                int i12 = k0Var.f62395a;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < k0Var.f62395a; i13++) {
                    iArr[i13] = aVar.getTrackSupport(i10, i11, i13);
                    zArr[i13] = (gVar == null || gVar.getTrackGroup() != k0Var || gVar.indexOf(i13) == -1) ? false : true;
                }
                aVar2.add((h1.a) new z0.a(k0Var, iArr, aVar.getRendererType(i10), zArr));
            }
        }
        l0 unmappedTrackGroups = aVar.getUnmappedTrackGroups();
        for (int i14 = 0; i14 < unmappedTrackGroups.f62401a; i14++) {
            k0 k0Var2 = unmappedTrackGroups.get(i14);
            int[] iArr2 = new int[k0Var2.f62395a];
            Arrays.fill(iArr2, 0);
            aVar2.add((h1.a) new z0.a(k0Var2, iArr2, io.odeeo.internal.q0.t.getTrackType(k0Var2.getFormat(0).f62971l), new boolean[k0Var2.f62395a]));
        }
        return new z0(aVar2.build());
    }
}
