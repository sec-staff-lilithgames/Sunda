package mt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface d0 extends k {
    boolean isDisposed();

    @Override // mt.k
    /* synthetic */ void onComplete();

    @Override // mt.k
    /* synthetic */ void onError(Throwable th2);

    @Override // mt.k
    /* synthetic */ void onNext(Object obj);

    d0 serialize();

    void setCancellable(st.f fVar);

    void setDisposable(pt.c cVar);

    boolean tryOnError(Throwable th2);
}
