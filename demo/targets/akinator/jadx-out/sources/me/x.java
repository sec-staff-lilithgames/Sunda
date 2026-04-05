package me;

import com.google.android.exoplayer2.util.v0;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public l f74490a;

    /* renamed from: b, reason: collision with root package name */
    public long f74491b;

    /* renamed from: c, reason: collision with root package name */
    public long f74492c;

    /* renamed from: d, reason: collision with root package name */
    public int f74493d;

    /* renamed from: e, reason: collision with root package name */
    public int f74494e;

    /* renamed from: k, reason: collision with root package name */
    public boolean f74500k;

    /* renamed from: m, reason: collision with root package name */
    public w f74502m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f74504o;

    /* renamed from: p, reason: collision with root package name */
    public long f74505p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f74506q;

    /* renamed from: f, reason: collision with root package name */
    public long[] f74495f = new long[0];

    /* renamed from: g, reason: collision with root package name */
    public int[] f74496g = new int[0];

    /* renamed from: h, reason: collision with root package name */
    public int[] f74497h = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public long[] f74498i = new long[0];

    /* renamed from: j, reason: collision with root package name */
    public boolean[] f74499j = new boolean[0];

    /* renamed from: l, reason: collision with root package name */
    public boolean[] f74501l = new boolean[0];

    /* renamed from: n, reason: collision with root package name */
    public final v0 f74503n = new v0();

    public void fillEncryptionData(ee.q qVar) throws IOException {
        v0 v0Var = this.f74503n;
        qVar.readFully(v0Var.getData(), 0, v0Var.limit());
        v0Var.setPosition(0);
        this.f74504o = false;
    }

    public long getSamplePresentationTimeUs(int i10) {
        return this.f74498i[i10];
    }

    public void initEncryptionData(int i10) {
        this.f74503n.reset(i10);
        this.f74500k = true;
        this.f74504o = true;
    }

    public void initTables(int i10, int i11) {
        this.f74493d = i10;
        this.f74494e = i11;
        if (this.f74496g.length < i10) {
            this.f74495f = new long[i10];
            this.f74496g = new int[i10];
        }
        if (this.f74497h.length < i11) {
            int i12 = (i11 * Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) / 100;
            this.f74497h = new int[i12];
            this.f74498i = new long[i12];
            this.f74499j = new boolean[i12];
            this.f74501l = new boolean[i12];
        }
    }

    public void reset() {
        this.f74493d = 0;
        this.f74505p = 0L;
        this.f74506q = false;
        this.f74500k = false;
        this.f74504o = false;
        this.f74502m = null;
    }

    public boolean sampleHasSubsampleEncryptionTable(int i10) {
        return this.f74500k && this.f74501l[i10];
    }

    public void fillEncryptionData(v0 v0Var) {
        v0 v0Var2 = this.f74503n;
        v0Var.readBytes(v0Var2.getData(), 0, v0Var2.limit());
        v0Var2.setPosition(0);
        this.f74504o = false;
    }
}
