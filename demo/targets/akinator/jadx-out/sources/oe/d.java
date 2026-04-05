package oe;

import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f79000a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f79001b;

    /* renamed from: c, reason: collision with root package name */
    public final String f79002c;

    /* renamed from: d, reason: collision with root package name */
    public String f79003d;

    /* renamed from: e, reason: collision with root package name */
    public ee.l0 f79004e;

    /* renamed from: f, reason: collision with root package name */
    public int f79005f;

    /* renamed from: g, reason: collision with root package name */
    public int f79006g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f79007h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f79008i;

    /* renamed from: j, reason: collision with root package name */
    public long f79009j;

    /* renamed from: k, reason: collision with root package name */
    public z0 f79010k;

    /* renamed from: l, reason: collision with root package name */
    public int f79011l;

    /* renamed from: m, reason: collision with root package name */
    public long f79012m;

    public d() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    @Override // oe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void consume(com.google.android.exoplayer2.util.v0 r13) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.d.consume(com.google.android.exoplayer2.util.v0):void");
    }

    @Override // oe.j
    public void createTracks(ee.s sVar, i0 i0Var) {
        i0Var.generateNewId();
        this.f79003d = i0Var.getFormatId();
        this.f79004e = sVar.track(i0Var.getTrackId(), 1);
    }

    @Override // oe.j
    public void packetStarted(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f79012m = j10;
        }
    }

    @Override // oe.j
    public void seek() {
        this.f79005f = 0;
        this.f79006g = 0;
        this.f79007h = false;
        this.f79008i = false;
        this.f79012m = C.TIME_UNSET;
    }

    public d(String str) {
        u0 u0Var = new u0(new byte[16]);
        this.f79000a = u0Var;
        this.f79001b = new v0(u0Var.f28575a);
        this.f79005f = 0;
        this.f79006g = 0;
        this.f79007h = false;
        this.f79008i = false;
        this.f79012m = C.TIME_UNSET;
        this.f79002c = str;
    }

    @Override // oe.j
    public void packetFinished() {
    }
}
