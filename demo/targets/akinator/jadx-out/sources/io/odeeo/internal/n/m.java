package io.odeeo.internal.n;

import com.vungle.ads.internal.protos.Sdk;
import io.odeeo.internal.q0.x;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public c f64878a;

    /* renamed from: b, reason: collision with root package name */
    public long f64879b;

    /* renamed from: c, reason: collision with root package name */
    public long f64880c;

    /* renamed from: d, reason: collision with root package name */
    public long f64881d;

    /* renamed from: e, reason: collision with root package name */
    public int f64882e;

    /* renamed from: f, reason: collision with root package name */
    public int f64883f;

    /* renamed from: l, reason: collision with root package name */
    public boolean f64889l;

    /* renamed from: n, reason: collision with root package name */
    public l f64891n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f64893p;

    /* renamed from: q, reason: collision with root package name */
    public long f64894q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f64895r;

    /* renamed from: g, reason: collision with root package name */
    public long[] f64884g = new long[0];

    /* renamed from: h, reason: collision with root package name */
    public int[] f64885h = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public int[] f64886i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    public long[] f64887j = new long[0];

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f64888k = new boolean[0];

    /* renamed from: m, reason: collision with root package name */
    public boolean[] f64890m = new boolean[0];

    /* renamed from: o, reason: collision with root package name */
    public final x f64892o = new x();

    public void fillEncryptionData(io.odeeo.internal.g.i iVar) throws IOException {
        iVar.readFully(this.f64892o.getData(), 0, this.f64892o.limit());
        this.f64892o.setPosition(0);
        this.f64893p = false;
    }

    public long getSamplePresentationTimeUs(int i10) {
        return this.f64887j[i10];
    }

    public void initEncryptionData(int i10) {
        this.f64892o.reset(i10);
        this.f64889l = true;
        this.f64893p = true;
    }

    public void initTables(int i10, int i11) {
        this.f64882e = i10;
        this.f64883f = i11;
        if (this.f64885h.length < i10) {
            this.f64884g = new long[i10];
            this.f64885h = new int[i10];
        }
        if (this.f64886i.length < i11) {
            int i12 = (i11 * Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) / 100;
            this.f64886i = new int[i12];
            this.f64887j = new long[i12];
            this.f64888k = new boolean[i12];
            this.f64890m = new boolean[i12];
        }
    }

    public void reset() {
        this.f64882e = 0;
        this.f64894q = 0L;
        this.f64895r = false;
        this.f64889l = false;
        this.f64893p = false;
        this.f64891n = null;
    }

    public boolean sampleHasSubsampleEncryptionTable(int i10) {
        return this.f64889l && this.f64890m[i10];
    }

    public void fillEncryptionData(x xVar) {
        xVar.readBytes(this.f64892o.getData(), 0, this.f64892o.limit());
        this.f64892o.setPosition(0);
        this.f64893p = false;
    }
}
