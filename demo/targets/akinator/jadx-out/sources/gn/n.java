package gn;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.Pure;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n {

    /* renamed from: h, reason: collision with root package name */
    public static final n f58006h = new m().setColorSpace(1).setColorRange(2).setColorTransfer(3).build();

    /* renamed from: i, reason: collision with root package name */
    public static final String f58007i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f58008j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f58009k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f58010l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f58011m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f58012n;

    /* renamed from: a, reason: collision with root package name */
    public final int f58013a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58014b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58015c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f58016d;

    /* renamed from: e, reason: collision with root package name */
    public final int f58017e;

    /* renamed from: f, reason: collision with root package name */
    public final int f58018f;

    /* renamed from: g, reason: collision with root package name */
    public int f58019g;

    static {
        new m().setColorSpace(1).setColorRange(1).setColorTransfer(2).build();
        f58007i = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);
        f58008j = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);
        f58009k = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(2);
        f58010l = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(3);
        f58011m = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(4);
        f58012n = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(5);
    }

    public n(int i10, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f58013a = i10;
        this.f58014b = i11;
        this.f58015c = i12;
        this.f58016d = bArr;
        this.f58017e = i13;
        this.f58018f = i14;
    }

    public static String a(int i10) {
        return i10 != -1 ? i10 != 1 ? i10 != 2 ? a.b.e(i10, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String b(int i10) {
        return i10 != -1 ? i10 != 6 ? i10 != 1 ? i10 != 2 ? a.b.e(i10, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String c(int i10) {
        return i10 != -1 ? i10 != 10 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 6 ? i10 != 7 ? a.b.e(i10, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static int colorSpaceToIsoColorPrimaries(int i10) {
        if (i10 != 2) {
            return i10 != 6 ? 1 : 9;
        }
        return 5;
    }

    public static int colorSpaceToIsoMatrixCoefficients(int i10) {
        if (i10 != 2) {
            return i10 != 6 ? 1 : 9;
        }
        return 6;
    }

    public static int colorTransferToIsoTransferCharacteristics(int i10) {
        if (i10 == 1) {
            return 8;
        }
        if (i10 == 2) {
            return 13;
        }
        if (i10 == 6) {
            return 16;
        }
        if (i10 != 7) {
            return i10 != 10 ? 1 : 4;
        }
        return 18;
    }

    public static n fromBundle(Bundle bundle) {
        return new n(bundle.getInt(f58007i, -1), bundle.getInt(f58008j, -1), bundle.getInt(f58009k, -1), bundle.getInt(f58011m, -1), bundle.getInt(f58012n, -1), bundle.getByteArray(f58010l));
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean isEquivalentToAssumedSdrDefault(n nVar) {
        if (nVar == null) {
            return true;
        }
        int i10 = nVar.f58013a;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = nVar.f58014b;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = nVar.f58015c;
        if ((i12 != -1 && i12 != 3) || nVar.f58016d != null) {
            return false;
        }
        int i13 = nVar.f58018f;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = nVar.f58017e;
        return i14 == -1 || i14 == 8;
    }

    public static boolean isTransferHdr(n nVar) {
        if (nVar == null) {
            return false;
        }
        int i10 = nVar.f58015c;
        return i10 == 7 || i10 == 6;
    }

    @Pure
    public static int isoColorPrimariesToColorSpace(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int isoTransferCharacteristicsToColorTransfer(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public m buildUpon() {
        m mVar = new m();
        mVar.f57999a = this.f58013a;
        mVar.f58000b = this.f58014b;
        mVar.f58001c = this.f58015c;
        mVar.f58002d = this.f58016d;
        mVar.f58003e = this.f58017e;
        mVar.f58004f = this.f58018f;
        return mVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (this.f58013a == nVar.f58013a && this.f58014b == nVar.f58014b && this.f58015c == nVar.f58015c && Arrays.equals(this.f58016d, nVar.f58016d) && this.f58017e == nVar.f58017e && this.f58018f == nVar.f58018f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f58019g == 0) {
            this.f58019g = ((((Arrays.hashCode(this.f58016d) + ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f58013a) * 31) + this.f58014b) * 31) + this.f58015c) * 31)) * 31) + this.f58017e) * 31) + this.f58018f;
        }
        return this.f58019g;
    }

    public boolean isBitdepthValid() {
        return (this.f58017e == -1 || this.f58018f == -1) ? false : true;
    }

    public boolean isDataSpaceValid() {
        return (this.f58013a == -1 || this.f58014b == -1 || this.f58015c == -1) ? false : true;
    }

    public boolean isValid() {
        return isBitdepthValid() || isDataSpaceValid();
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f58007i, this.f58013a);
        bundle.putInt(f58008j, this.f58014b);
        bundle.putInt(f58009k, this.f58015c);
        bundle.putByteArray(f58010l, this.f58016d);
        bundle.putInt(f58011m, this.f58017e);
        bundle.putInt(f58012n, this.f58018f);
        return bundle;
    }

    public String toLogString() {
        String str;
        String invariant = isDataSpaceValid() ? io.bidmachine.media3.common.util.a1.formatInvariant("%s/%s/%s", b(this.f58013a), a(this.f58014b), c(this.f58015c)) : "NA/NA/NA";
        if (isBitdepthValid()) {
            str = this.f58017e + "/" + this.f58018f;
        } else {
            str = "NA/NA";
        }
        return w0.i.d(invariant, "/", str);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(b(this.f58013a));
        sb2.append(", ");
        sb2.append(a(this.f58014b));
        sb2.append(", ");
        sb2.append(c(this.f58015c));
        sb2.append(", ");
        sb2.append(this.f58016d != null);
        sb2.append(", ");
        int i10 = this.f58017e;
        sb2.append(i10 != -1 ? o2.j(i10, "bit Luma") : "NA");
        sb2.append(", ");
        int i11 = this.f58018f;
        return j1.o2.o(sb2, i11 != -1 ? o2.j(i11, "bit Chroma") : "NA", ")");
    }
}
