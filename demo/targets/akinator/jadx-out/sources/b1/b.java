package b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kv.l f8574b;

    public b(kv.l lVar) {
        this.f8574b = lVar;
    }

    @Override // kv.l
    public final k invoke(u uVar) {
        long j10;
        synchronized (y.getLock()) {
            j10 = y.f8706e;
            y.f8706e++;
        }
        return new k(j10, uVar, this.f8574b);
    }
}
