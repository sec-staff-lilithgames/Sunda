package p8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c0 implements o {

    /* renamed from: a, reason: collision with root package name */
    public final r8.a f80735a;

    /* renamed from: b, reason: collision with root package name */
    public volatile r8.c f80736b;

    public c0(r8.a aVar) {
        this.f80735a = aVar;
    }

    @Override // p8.o
    public r8.c getDiskCache() {
        if (this.f80736b == null) {
            synchronized (this) {
                try {
                    if (this.f80736b == null) {
                        this.f80736b = this.f80735a.build();
                    }
                    if (this.f80736b == null) {
                        this.f80736b = new r8.d();
                    }
                } finally {
                }
            }
        }
        return this.f80736b;
    }
}
