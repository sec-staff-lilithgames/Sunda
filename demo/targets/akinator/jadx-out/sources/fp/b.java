package fp;

import io.bidmachine.media3.common.util.a1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final g f55931a;

    /* renamed from: b, reason: collision with root package name */
    public final long f55932b;

    /* renamed from: c, reason: collision with root package name */
    public final long f55933c;

    /* renamed from: d, reason: collision with root package name */
    public final k f55934d;

    /* renamed from: e, reason: collision with root package name */
    public int f55935e;

    /* renamed from: f, reason: collision with root package name */
    public long f55936f;

    /* renamed from: g, reason: collision with root package name */
    public long f55937g;

    /* renamed from: h, reason: collision with root package name */
    public long f55938h;

    /* renamed from: i, reason: collision with root package name */
    public long f55939i;

    /* renamed from: j, reason: collision with root package name */
    public long f55940j;

    /* renamed from: k, reason: collision with root package name */
    public long f55941k;

    /* renamed from: l, reason: collision with root package name */
    public long f55942l;

    public b(k kVar, long j10, long j11, long j12, long j13, boolean z10) {
        io.bidmachine.media3.common.util.a.checkArgument(j10 >= 0 && j11 > j10);
        this.f55934d = kVar;
        this.f55932b = j10;
        this.f55933c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f55936f = j13;
            this.f55935e = 4;
        } else {
            this.f55935e = 0;
        }
        this.f55931a = new g();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    @Override // fp.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long read(ko.a0 r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fp.b.read(ko.a0):long");
    }

    @Override // fp.h
    public void startSeek(long j10) {
        this.f55938h = a1.constrainValue(j10, 0L, this.f55936f - 1);
        this.f55935e = 2;
        this.f55939i = this.f55932b;
        this.f55940j = this.f55933c;
        this.f55941k = 0L;
        this.f55942l = this.f55936f;
    }

    @Override // fp.h
    public a createSeekMap() {
        if (this.f55936f != 0) {
            return new a(this);
        }
        return null;
    }
}
