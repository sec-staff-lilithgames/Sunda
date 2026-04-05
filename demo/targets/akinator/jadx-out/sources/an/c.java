package an;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f4448b;

    public c(e eVar) {
        this.f4448b = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar;
        e eVar = this.f4448b;
        if (eVar.f4457e == null) {
            return;
        }
        long j10 = eVar.f4455b.f4452d;
        if (eVar.isShown()) {
            j10 += 50;
            eVar.f4455b.a(j10);
            eVar.f4457e.changePercentage((int) ((100 * j10) / eVar.f4455b.f4451c), (int) Math.ceil((r8 - j10) / 1000.0d));
        }
        if (j10 < eVar.f4455b.f4451c) {
            eVar.postDelayed(this, 50L);
            return;
        }
        eVar.a();
        if (eVar.f4455b.f4450b <= 0.0f || (aVar = eVar.f4459g) == null) {
            return;
        }
        aVar.onCountDownFinish();
    }
}
