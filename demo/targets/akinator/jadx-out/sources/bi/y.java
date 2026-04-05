package bi;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class y implements sj.c, sj.b {

    /* renamed from: c, reason: collision with root package name */
    public static final a2.o f9600c = new a2.o(15);

    /* renamed from: d, reason: collision with root package name */
    public static final k f9601d = new k(1);

    /* renamed from: a, reason: collision with root package name */
    public sj.a f9602a;

    /* renamed from: b, reason: collision with root package name */
    public volatile sj.c f9603b;

    public y(a2.o oVar, sj.c cVar) {
        this.f9602a = oVar;
        this.f9603b = cVar;
    }

    @Override // sj.c
    public Object get() {
        return this.f9603b.get();
    }

    @Override // sj.b
    public void whenAvailable(sj.a aVar) {
        sj.c cVar;
        sj.c cVar2;
        sj.c cVar3 = this.f9603b;
        k kVar = f9601d;
        if (cVar3 != kVar) {
            aVar.handle(cVar3);
            return;
        }
        synchronized (this) {
            cVar = this.f9603b;
            if (cVar != kVar) {
                cVar2 = cVar;
            } else {
                this.f9602a = new ao.n(2, this.f9602a, aVar);
                cVar2 = null;
            }
        }
        if (cVar2 != null) {
            aVar.handle(cVar);
        }
    }
}
