package j9;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f69187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f69188b;

    public i(j jVar) {
        this.f69188b = jVar;
    }

    @Override // j9.j
    public Object get() {
        if (this.f69187a == null) {
            synchronized (this) {
                try {
                    if (this.f69187a == null) {
                        this.f69187a = q.checkNotNull(this.f69188b.get());
                    }
                } finally {
                }
            }
        }
        return this.f69187a;
    }
}
