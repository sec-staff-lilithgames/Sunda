package tj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d implements uj.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f86928a;

    public d(e eVar) {
        this.f86928a = eVar;
    }

    @Override // uj.b
    public void unregister() {
        synchronized (this.f86928a) {
            this.f86928a.f86940k.remove(null);
        }
    }
}
