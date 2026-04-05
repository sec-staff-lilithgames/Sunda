package ds;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class x extends f {
    public void disableAutoRequest() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean isCancelled();

    @Override // ds.f
    public abstract boolean isReady();

    @Override // ds.f, ds.l0
    public abstract /* synthetic */ void onCompleted();

    @Override // ds.f, ds.l0
    public abstract /* synthetic */ void onError(Throwable th2);

    @Override // ds.f, ds.l0
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // ds.f
    public abstract void request(int i10);

    public abstract void setCompression(String str);

    @Override // ds.f
    public abstract void setMessageCompression(boolean z10);

    public abstract void setOnCancelHandler(Runnable runnable);

    public void setOnCloseHandler(Runnable runnable) {
        throw new UnsupportedOperationException();
    }

    @Override // ds.f
    public abstract void setOnReadyHandler(Runnable runnable);
}
