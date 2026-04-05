package pf;

import bf.n1;
import com.google.android.exoplayer2.b3;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f81124a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f81125b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f81126c;

    /* renamed from: d, reason: collision with root package name */
    public final n1[] f81127d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f81128e;

    /* renamed from: f, reason: collision with root package name */
    public final int[][][] f81129f;

    /* renamed from: g, reason: collision with root package name */
    public final n1 f81130g;

    public m(String[] strArr, int[] iArr, n1[] n1VarArr, int[] iArr2, int[][][] iArr3, n1 n1Var) {
        this.f81125b = strArr;
        this.f81126c = iArr;
        this.f81127d = n1VarArr;
        this.f81129f = iArr3;
        this.f81128e = iArr2;
        this.f81130g = n1Var;
        this.f81124a = iArr.length;
    }

    public int getAdaptiveSupport(int i10, int i11, boolean z10) {
        int i12 = this.f81127d[i10].get(i11).f9332b;
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

    public int getCapabilities(int i10, int i11, int i12) {
        return this.f81129f[i10][i11][i12];
    }

    public int getRendererCount() {
        return this.f81124a;
    }

    public String getRendererName(int i10) {
        return this.f81125b[i10];
    }

    public int getRendererSupport(int i10) {
        int iMax = 0;
        for (int[] iArr : this.f81129f[i10]) {
            for (int i11 : iArr) {
                int formatSupport = b3.getFormatSupport(i11);
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
        return this.f81126c[i10];
    }

    public n1 getTrackGroups(int i10) {
        return this.f81127d[i10];
    }

    public int getTrackSupport(int i10, int i11, int i12) {
        return b3.getFormatSupport(getCapabilities(i10, i11, i12));
    }

    public int getTypeSupport(int i10) {
        int iMax = 0;
        for (int i11 = 0; i11 < this.f81124a; i11++) {
            if (this.f81126c[i11] == i10) {
                iMax = Math.max(iMax, getRendererSupport(i11));
            }
        }
        return iMax;
    }

    public n1 getUnmappedTrackGroups() {
        return this.f81130g;
    }

    public int getAdaptiveSupport(int i10, int i11, int[] iArr) {
        int i12 = 0;
        int iMin = 16;
        String str = null;
        boolean z10 = false;
        int i13 = 0;
        while (i12 < iArr.length) {
            String str2 = this.f81127d[i10].get(i11).getFormat(iArr[i12]).f28802n;
            int i14 = i13 + 1;
            if (i13 == 0) {
                str = str2;
            } else {
                z10 |= !com.google.android.exoplayer2.util.n1.areEqual(str, str2);
            }
            iMin = Math.min(iMin, b3.getAdaptiveSupport(this.f81129f[i10][i11][i12]));
            i12++;
            i13 = i14;
        }
        return z10 ? Math.min(iMin, this.f81128e[i10]) : iMin;
    }
}
