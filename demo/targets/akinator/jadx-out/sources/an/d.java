package an;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4449a;

    /* renamed from: b, reason: collision with root package name */
    public float f4450b;

    /* renamed from: c, reason: collision with root package name */
    public long f4451c;

    /* renamed from: d, reason: collision with root package name */
    public long f4452d;

    /* renamed from: e, reason: collision with root package name */
    public long f4453e;

    /* renamed from: f, reason: collision with root package name */
    public long f4454f;

    public void a(boolean z10, float f10) {
        this.f4449a = z10;
        this.f4450b = f10;
        this.f4451c = (long) (f10 * 1000.0f);
        this.f4452d = 0L;
    }

    public long b() {
        return this.f4453e > 0 ? System.currentTimeMillis() - this.f4453e : this.f4454f;
    }

    public boolean c() {
        long j10 = this.f4451c;
        return j10 != 0 && this.f4452d < j10;
    }

    public boolean d() {
        return this.f4449a;
    }

    public void a(long j10) {
        this.f4452d = j10;
    }

    public boolean a() {
        long j10 = this.f4451c;
        return j10 == 0 || this.f4452d >= j10;
    }
}
