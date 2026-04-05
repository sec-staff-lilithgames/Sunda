package ub;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import cv.BLca.YsiBvdpw;
import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f0 implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static f0 f88215i = new f0(1000, -1, 1000, 20000000, 50000, -1);

    /* renamed from: b, reason: collision with root package name */
    public final int f88216b;

    /* renamed from: c, reason: collision with root package name */
    public final long f88217c;

    /* renamed from: e, reason: collision with root package name */
    public final long f88218e;

    /* renamed from: f, reason: collision with root package name */
    public final int f88219f;

    /* renamed from: g, reason: collision with root package name */
    public final int f88220g;

    /* renamed from: h, reason: collision with root package name */
    public final int f88221h;

    public f0(int i10, long j10, int i11, int i12, int i13, long j11) {
        this.f88216b = i10;
        this.f88217c = j10;
        this.f88219f = i11;
        this.f88220g = i12;
        this.f88221h = i13;
        this.f88218e = j11;
    }

    public static String a(String str) {
        return a.b.l("`StreamReadConstraints.", str, "()`");
    }

    public static void b(String str, Object... objArr) throws xb.b {
        throw new xb.b(String.format(str, objArr));
    }

    public static e0 builder() {
        e0 e0Var = new e0();
        e0Var.f88211c = 1000;
        e0Var.f88209a = -1L;
        e0Var.f88210b = -1L;
        e0Var.f88212d = 1000;
        e0Var.f88213e = 20000000;
        e0Var.f88214f = 50000;
        return e0Var;
    }

    public static f0 defaults() {
        return f88215i;
    }

    public static void overrideDefaultStreamReadConstraints(f0 f0Var) {
        if (f0Var == null) {
            f88215i = new f0(1000, -1L, 1000, 20000000, 50000, -1L);
        } else {
            f88215i = f0Var;
        }
    }

    public long getMaxDocumentLength() {
        return this.f88217c;
    }

    public int getMaxNameLength() {
        return this.f88221h;
    }

    public int getMaxNestingDepth() {
        return this.f88216b;
    }

    public int getMaxNumberLength() {
        return this.f88219f;
    }

    public int getMaxStringLength() {
        return this.f88220g;
    }

    public long getMaxTokenCount() {
        return this.f88218e;
    }

    public boolean hasMaxDocumentLength() {
        return this.f88217c > 0;
    }

    public boolean hasMaxTokenCount() {
        return this.f88218e > 0;
    }

    public e0 rebuild() {
        e0 e0Var = new e0();
        e0Var.f88211c = this.f88216b;
        e0Var.f88209a = this.f88217c;
        e0Var.f88210b = this.f88218e;
        e0Var.f88212d = this.f88219f;
        e0Var.f88213e = this.f88220g;
        e0Var.f88214f = this.f88221h;
        return e0Var;
    }

    public void validateBigIntegerScale(int i10) throws xb.b {
        if (Math.abs(i10) <= 100000) {
            return;
        }
        b("BigDecimal scale (%d) magnitude exceeds the maximum allowed (%d)", Integer.valueOf(i10), Integer.valueOf(DefaultOggSeeker.MATCH_BYTE_RANGE));
        throw null;
    }

    public void validateDocumentLength(long j10) throws xb.b {
        long j11 = this.f88217c;
        if (j10 <= j11 || j11 <= 0) {
            return;
        }
        b("Document length (%d) exceeds the maximum allowed (%d, from %s)", Long.valueOf(j10), Long.valueOf(j11), a("getMaxDocumentLength"));
        throw null;
    }

    public void validateFPLength(int i10) throws xb.b {
        int i11 = this.f88219f;
        if (i10 <= i11) {
            return;
        }
        b("Number value length (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i10), Integer.valueOf(i11), a("getMaxNumberLength"));
        throw null;
    }

    public void validateIntegerLength(int i10) throws xb.b {
        int i11 = this.f88219f;
        if (i10 <= i11) {
            return;
        }
        b("Number value length (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i10), Integer.valueOf(i11), a("getMaxNumberLength"));
        throw null;
    }

    public void validateNestingDepth(int i10) throws xb.b {
        int i11 = this.f88216b;
        if (i10 <= i11) {
            return;
        }
        b("Document nesting depth (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i10), Integer.valueOf(i11), a("getMaxNestingDepth"));
        throw null;
    }

    public void validateStringLength(int i10) throws xb.b {
        int i11 = this.f88220g;
        if (i10 <= i11) {
            return;
        }
        b("String value length (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i10), Integer.valueOf(i11), a("getMaxStringLength"));
        throw null;
    }

    public void validateTokenCount(long j10) throws xb.b {
        long j11 = this.f88218e;
        if (j10 <= j11) {
            return;
        }
        b("Token count (%d) exceeds the maximum allowed (%d, from %s)", Long.valueOf(j10), Long.valueOf(j11), a("getMaxTokenCount"));
        throw null;
    }

    public void validateNameLength(int i10) throws xb.b {
        int i11 = this.f88221h;
        if (i10 <= i11) {
            return;
        }
        b("Name length (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i10), Integer.valueOf(i11), a(YsiBvdpw.TKjcoqlanZkw));
        throw null;
    }
}
