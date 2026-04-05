package androidx.viewpager2.adapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f7366b;

    public c(m mVar) {
        this.f7366b = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        m mVar = this.f7366b;
        mVar.mIsInGracePeriod = false;
        mVar.gcFragments();
    }
}
