package sf;

import android.os.Bundle;
import com.google.android.exoplayer2.util.n1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements com.google.android.exoplayer2.i {

    /* renamed from: h, reason: collision with root package name */
    public static final b f85606h = new b(1, 2, 3, null);

    /* renamed from: i, reason: collision with root package name */
    public static final String f85607i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f85608j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f85609k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f85610l;

    /* renamed from: m, reason: collision with root package name */
    public static final pe.a f85611m;

    /* renamed from: b, reason: collision with root package name */
    public final int f85612b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85613c;

    /* renamed from: e, reason: collision with root package name */
    public final int f85614e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f85615f;

    /* renamed from: g, reason: collision with root package name */
    public int f85616g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f85617a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f85618b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f85619c = -1;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f85620d;

        public b build() {
            return new b(this.f85617a, this.f85618b, this.f85619c, this.f85620d);
        }

        public a setColorRange(int i10) {
            this.f85618b = i10;
            return this;
        }

        public a setColorSpace(int i10) {
            this.f85617a = i10;
            return this;
        }

        public a setColorTransfer(int i10) {
            this.f85619c = i10;
            return this;
        }

        public a setHdrStaticInfo(byte[] bArr) {
            this.f85620d = bArr;
            return this;
        }
    }

    static {
        new a().setColorSpace(1).setColorRange(1).setColorTransfer(2).build();
        f85607i = n1.intToStringMaxRadix(0);
        f85608j = n1.intToStringMaxRadix(1);
        f85609k = n1.intToStringMaxRadix(2);
        f85610l = n1.intToStringMaxRadix(3);
        f85611m = new pe.a(29);
    }

    @Deprecated
    public b(int i10, int i11, int i12, byte[] bArr) {
        this.f85612b = i10;
        this.f85613c = i11;
        this.f85614e = i12;
        this.f85615f = bArr;
    }

    public static String a(int i10) {
        return i10 != -1 ? i10 != 10 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 6 ? i10 != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean isTransferHdr(b bVar) {
        if (bVar == null) {
            return false;
        }
        int i10 = bVar.f85614e;
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

    public a buildUpon() {
        a aVar = new a();
        aVar.f85617a = this.f85612b;
        aVar.f85618b = this.f85613c;
        aVar.f85619c = this.f85614e;
        aVar.f85620d = this.f85615f;
        return aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f85612b == bVar.f85612b && this.f85613c == bVar.f85613c && this.f85614e == bVar.f85614e && Arrays.equals(this.f85615f, bVar.f85615f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f85616g == 0) {
            this.f85616g = Arrays.hashCode(this.f85615f) + ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f85612b) * 31) + this.f85613c) * 31) + this.f85614e) * 31);
        }
        return this.f85616g;
    }

    public boolean isValid() {
        return (this.f85612b == -1 || this.f85613c == -1 || this.f85614e == -1) ? false : true;
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f85607i, this.f85612b);
        bundle.putInt(f85608j, this.f85613c);
        bundle.putInt(f85609k, this.f85614e);
        bundle.putByteArray(f85610l, this.f85615f);
        return bundle;
    }

    public String toLogString() {
        if (!isValid()) {
            return "NA";
        }
        int i10 = this.f85612b;
        String str = i10 != -1 ? i10 != 6 ? i10 != 1 ? i10 != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space";
        int i11 = this.f85613c;
        return n1.formatInvariant("%s/%s/%s", str, i11 != -1 ? i11 != 1 ? i11 != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range", a(this.f85614e));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        int i10 = this.f85612b;
        sb2.append(i10 != -1 ? i10 != 6 ? i10 != 1 ? i10 != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space");
        sb2.append(", ");
        int i11 = this.f85613c;
        sb2.append(i11 != -1 ? i11 != 1 ? i11 != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range");
        sb2.append(", ");
        sb2.append(a(this.f85614e));
        sb2.append(", ");
        return a.b.q(sb2, this.f85615f != null, ")");
    }
}
