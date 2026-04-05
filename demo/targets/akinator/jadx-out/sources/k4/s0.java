package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f70505e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(p pVar) {
        super(1);
        this.f70505e = pVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        p pVar = this.f70505e;
        if (th2 != null) {
            pVar.f70445h.tryUpdate(new j1(th2));
        }
        if (pVar.f70447j.isInitialized()) {
            pVar.getStorageConnection$datastore_core_release().close();
        }
    }
}
