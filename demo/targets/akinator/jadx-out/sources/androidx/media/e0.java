package androidx.media;

import android.os.IBinder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f6808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f6809c;

    public e0(h0 h0Var, i0 i0Var) {
        this.f6809c = h0Var;
        this.f6808b = i0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        IBinder iBinderAsBinder = ((j0) this.f6808b).asBinder();
        k kVar = (k) this.f6809c.f6827a.f6775f.remove(iBinderAsBinder);
        if (kVar != null) {
            iBinderAsBinder.unlinkToDeath(kVar, 0);
        }
    }
}
