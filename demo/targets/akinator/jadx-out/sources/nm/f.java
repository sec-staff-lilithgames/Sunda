package nm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f77040b;

    public f(d dVar) {
        this.f77040b = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        d dVar = this.f77040b;
        d.access$100(dVar);
        if (dVar.callback == null || dVar.isCanceled()) {
            return;
        }
        if (dVar.currentState == g.f77043e) {
            dVar.callback.onSuccess(dVar.requestResult);
        } else {
            dVar.callback.onFail(dVar.errorResult);
        }
    }
}
