package b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kv.l f8570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kv.l f8571c;

    public a(kv.l lVar, kv.l lVar2) {
        this.f8570b = lVar;
        this.f8571c = lVar2;
    }

    @Override // kv.l
    public final e invoke(u uVar) {
        long j10;
        synchronized (y.getLock()) {
            j10 = y.f8706e;
            y.f8706e++;
        }
        return new e(j10, uVar, this.f8570b, this.f8571c);
    }
}
