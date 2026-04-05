package dq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class o0 implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public long f52506b;

    /* renamed from: c, reason: collision with root package name */
    public long f52507c;

    public void a() {
        this.f52506b = Math.max(this.f52507c - System.currentTimeMillis(), 0L);
        cr.q.cancelOnUiThread(this);
    }

    public void b() {
        long j10 = this.f52506b;
        if (j10 > 0) {
            cr.q.onUiThread(this, j10);
        } else {
            cr.q.onUiThread(this);
        }
    }

    @Override // dq.c0, ir.k
    public abstract /* synthetic */ void onRun() throws Throwable;

    @Override // dq.c0, ir.k
    public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
        super.onThrows(th2);
    }

    @Override // dq.c0, ir.k, java.lang.Runnable
    public /* bridge */ /* synthetic */ void run() {
        super.run();
    }

    public void a(long j10) {
        this.f52506b = j10;
        this.f52507c = System.currentTimeMillis() + j10;
        b();
    }
}
