package androidx.fragment.app;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f6442b;

    public r(w wVar) {
        this.f6442b = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        w wVar = this.f6442b;
        wVar.mOnDismissListener.onDismiss(wVar.mDialog);
    }
}
