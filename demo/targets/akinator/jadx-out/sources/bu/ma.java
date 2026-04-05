package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ma implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final la f10656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ na f10657c;

    public ma(na naVar, la laVar) {
        this.f10657c = naVar;
        this.f10656b = laVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f10657c.f10053b.subscribe(this.f10656b);
    }
}
