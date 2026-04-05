package ds;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class f implements l0 {
    public abstract void disableAutoInboundFlowControl();

    public abstract boolean isReady();

    @Override // ds.l0
    public abstract /* synthetic */ void onCompleted();

    @Override // ds.l0
    public abstract /* synthetic */ void onError(Throwable th2);

    @Override // ds.l0
    public abstract /* synthetic */ void onNext(Object obj);

    public abstract void request(int i10);

    public abstract void setMessageCompression(boolean z10);

    public abstract void setOnReadyHandler(Runnable runnable);
}
