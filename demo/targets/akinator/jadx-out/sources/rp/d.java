package rp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import ko.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.l0 f84572a;

    /* renamed from: b, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f84573b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84574c;

    /* renamed from: d, reason: collision with root package name */
    public final int f84575d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84576e;

    /* renamed from: f, reason: collision with root package name */
    public String f84577f;

    /* renamed from: g, reason: collision with root package name */
    public e1 f84578g;

    /* renamed from: h, reason: collision with root package name */
    public int f84579h;

    /* renamed from: i, reason: collision with root package name */
    public int f84580i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f84581j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f84582k;

    /* renamed from: l, reason: collision with root package name */
    public long f84583l;

    /* renamed from: m, reason: collision with root package name */
    public io.bidmachine.media3.common.b f84584m;

    /* renamed from: n, reason: collision with root package name */
    public int f84585n;

    /* renamed from: o, reason: collision with root package name */
    public long f84586o;

    public d(String str) {
        this(null, 0, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    @Override // rp.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void consume(io.bidmachine.media3.common.util.m0 r13) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rp.d.consume(io.bidmachine.media3.common.util.m0):void");
    }

    @Override // rp.j
    public void createTracks(ko.c0 c0Var, m0 m0Var) {
        m0Var.generateNewId();
        this.f84577f = m0Var.getFormatId();
        this.f84578g = c0Var.track(m0Var.getTrackId(), 1);
    }

    @Override // rp.j
    public void packetStarted(long j10, int i10) {
        this.f84586o = j10;
    }

    @Override // rp.j
    public void seek() {
        this.f84579h = 0;
        this.f84580i = 0;
        this.f84581j = false;
        this.f84582k = false;
        this.f84586o = C.TIME_UNSET;
    }

    public d(String str, int i10, String str2) {
        io.bidmachine.media3.common.util.l0 l0Var = new io.bidmachine.media3.common.util.l0(new byte[16]);
        this.f84572a = l0Var;
        this.f84573b = new io.bidmachine.media3.common.util.m0(l0Var.f60741a);
        this.f84579h = 0;
        this.f84580i = 0;
        this.f84581j = false;
        this.f84582k = false;
        this.f84586o = C.TIME_UNSET;
        this.f84574c = str;
        this.f84575d = i10;
        this.f84576e = str2;
    }

    @Override // rp.j
    public void packetFinished(boolean z10) {
    }
}
