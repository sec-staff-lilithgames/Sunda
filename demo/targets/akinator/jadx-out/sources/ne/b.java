package ne;

import com.google.android.exoplayer2.util.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final g f76004a;

    /* renamed from: b, reason: collision with root package name */
    public final long f76005b;

    /* renamed from: c, reason: collision with root package name */
    public final long f76006c;

    /* renamed from: d, reason: collision with root package name */
    public final k f76007d;

    /* renamed from: e, reason: collision with root package name */
    public int f76008e;

    /* renamed from: f, reason: collision with root package name */
    public long f76009f;

    /* renamed from: g, reason: collision with root package name */
    public long f76010g;

    /* renamed from: h, reason: collision with root package name */
    public long f76011h;

    /* renamed from: i, reason: collision with root package name */
    public long f76012i;

    /* renamed from: j, reason: collision with root package name */
    public long f76013j;

    /* renamed from: k, reason: collision with root package name */
    public long f76014k;

    /* renamed from: l, reason: collision with root package name */
    public long f76015l;

    public b(k kVar, long j10, long j11, long j12, long j13, boolean z10) {
        com.google.android.exoplayer2.util.a.checkArgument(j10 >= 0 && j11 > j10);
        this.f76007d = kVar;
        this.f76005b = j10;
        this.f76006c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f76009f = j13;
            this.f76008e = 4;
        } else {
            this.f76008e = 0;
        }
        this.f76004a = new g();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    @Override // ne.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long read(ee.q r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.b.read(ee.q):long");
    }

    @Override // ne.h
    public void startSeek(long j10) {
        this.f76011h = n1.constrainValue(j10, 0L, this.f76009f - 1);
        this.f76008e = 2;
        this.f76012i = this.f76005b;
        this.f76013j = this.f76006c;
        this.f76014k = 0L;
        this.f76015l = this.f76009f;
    }

    @Override // ne.h
    public a createSeekMap() {
        if (this.f76009f != 0) {
            return new a(this);
        }
        return null;
    }
}
