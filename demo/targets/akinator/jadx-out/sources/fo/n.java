package fo;

import ao.b2;
import io.bidmachine.media3.exoplayer.u1;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f55913a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f55914b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f55915c;

    /* renamed from: d, reason: collision with root package name */
    public final b2[] f55916d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f55917e;

    /* renamed from: f, reason: collision with root package name */
    public final int[][][] f55918f;

    /* renamed from: g, reason: collision with root package name */
    public final b2 f55919g;

    public n(String[] strArr, int[] iArr, b2[] b2VarArr, int[] iArr2, int[][][] iArr3, b2 b2Var) {
        this.f55914b = strArr;
        this.f55915c = iArr;
        this.f55916d = b2VarArr;
        this.f55918f = iArr3;
        this.f55917e = iArr2;
        this.f55919g = b2Var;
        this.f55913a = iArr.length;
    }

    public int getAdaptiveSupport(int i10, int i11, boolean z10) {
        int i12 = this.f55916d[i10].get(i11).f58205a;
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
        return this.f55918f[i10][i11][i12];
    }

    public int getRendererCount() {
        return this.f55913a;
    }

    public String getRendererName(int i10) {
        return this.f55914b[i10];
    }

    public int getRendererSupport(int i10) {
        int iMax = 0;
        for (int[] iArr : this.f55918f[i10]) {
            for (int i11 : iArr) {
                int formatSupport = u1.getFormatSupport(i11);
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
        return this.f55915c[i10];
    }

    public b2 getTrackGroups(int i10) {
        return this.f55916d[i10];
    }

    public int getTrackSupport(int i10, int i11, int i12) {
        return u1.getFormatSupport(getCapabilities(i10, i11, i12));
    }

    public int getTypeSupport(int i10) {
        int iMax = 0;
        for (int i11 = 0; i11 < this.f55913a; i11++) {
            if (this.f55915c[i11] == i10) {
                iMax = Math.max(iMax, getRendererSupport(i11));
            }
        }
        return iMax;
    }

    public b2 getUnmappedTrackGroups() {
        return this.f55919g;
    }

    public int getAdaptiveSupport(int i10, int i11, int[] iArr) {
        int i12 = 0;
        int iMin = 16;
        String str = null;
        boolean z10 = false;
        int i13 = 0;
        while (i12 < iArr.length) {
            String str2 = this.f55916d[i10].get(i11).getFormat(iArr[i12]).f60665o;
            int i14 = i13 + 1;
            if (i13 == 0) {
                str = str2;
            } else {
                z10 |= !Objects.equals(str, str2);
            }
            iMin = Math.min(iMin, u1.getAdaptiveSupport(this.f55918f[i10][i11][i12]));
            i12++;
            i13 = i14;
        }
        return z10 ? Math.min(iMin, this.f55917e[i10]) : iMin;
    }
}
