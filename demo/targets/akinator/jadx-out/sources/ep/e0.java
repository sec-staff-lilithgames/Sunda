package ep;

import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.media3.common.util.m0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public o f54839a;

    /* renamed from: b, reason: collision with root package name */
    public long f54840b;

    /* renamed from: c, reason: collision with root package name */
    public long f54841c;

    /* renamed from: d, reason: collision with root package name */
    public int f54842d;

    /* renamed from: e, reason: collision with root package name */
    public int f54843e;

    /* renamed from: k, reason: collision with root package name */
    public boolean f54849k;

    /* renamed from: m, reason: collision with root package name */
    public d0 f54851m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f54853o;

    /* renamed from: p, reason: collision with root package name */
    public long f54854p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f54855q;

    /* renamed from: f, reason: collision with root package name */
    public long[] f54844f = new long[0];

    /* renamed from: g, reason: collision with root package name */
    public int[] f54845g = new int[0];

    /* renamed from: h, reason: collision with root package name */
    public int[] f54846h = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public long[] f54847i = new long[0];

    /* renamed from: j, reason: collision with root package name */
    public boolean[] f54848j = new boolean[0];

    /* renamed from: l, reason: collision with root package name */
    public boolean[] f54850l = new boolean[0];

    /* renamed from: n, reason: collision with root package name */
    public final m0 f54852n = new m0();

    public void fillEncryptionData(ko.a0 a0Var) throws IOException {
        m0 m0Var = this.f54852n;
        a0Var.readFully(m0Var.getData(), 0, m0Var.limit());
        m0Var.setPosition(0);
        this.f54853o = false;
    }

    public long getSamplePresentationTimeUs(int i10) {
        return this.f54847i[i10];
    }

    public void initEncryptionData(int i10) {
        this.f54852n.reset(i10);
        this.f54849k = true;
        this.f54853o = true;
    }

    public void initTables(int i10, int i11) {
        this.f54842d = i10;
        this.f54843e = i11;
        if (this.f54845g.length < i10) {
            this.f54844f = new long[i10];
            this.f54845g = new int[i10];
        }
        if (this.f54846h.length < i11) {
            int i12 = (i11 * Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) / 100;
            this.f54846h = new int[i12];
            this.f54847i = new long[i12];
            this.f54848j = new boolean[i12];
            this.f54850l = new boolean[i12];
        }
    }

    public void reset() {
        this.f54842d = 0;
        this.f54854p = 0L;
        this.f54855q = false;
        this.f54849k = false;
        this.f54853o = false;
        this.f54851m = null;
    }

    public boolean sampleHasSubsampleEncryptionTable(int i10) {
        return this.f54849k && this.f54850l[i10];
    }

    public void fillEncryptionData(m0 m0Var) {
        m0 m0Var2 = this.f54852n;
        m0Var.readBytes(m0Var2.getData(), 0, m0Var2.limit());
        m0Var2.setPosition(0);
        this.f54853o = false;
    }
}
