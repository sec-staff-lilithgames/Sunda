package cu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class k implements vt.a, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final st.q f51012b;

    /* renamed from: c, reason: collision with root package name */
    public final st.c f51013c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f51014e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f51015f;

    public k(st.q qVar, st.c cVar) {
        this.f51012b = qVar;
        this.f51013c = cVar;
    }

    @Override // tw.d
    public final void cancel() {
        this.f51014e.cancel();
    }

    @Override // vt.a, mt.q, tw.c, mt.f
    public abstract /* synthetic */ void onComplete();

    @Override // vt.a, mt.q, tw.c, mt.f
    public abstract /* synthetic */ void onError(Throwable th2);

    @Override // vt.a, mt.q, tw.c
    public final void onNext(Object obj) {
        if (tryOnNext(obj) || this.f51015f) {
            return;
        }
        this.f51014e.request(1L);
    }

    @Override // vt.a, mt.q, tw.c
    public abstract /* synthetic */ void onSubscribe(tw.d dVar);

    @Override // tw.d
    public final void request(long j10) {
        this.f51014e.request(j10);
    }

    @Override // vt.a
    public abstract /* synthetic */ boolean tryOnNext(Object obj);
}
