package androidx.fragment.app;

import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f6409b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a3 f6410c;

    public m(p pVar, a3 a3Var) {
        this.f6409b = pVar;
        this.f6410c = a3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6409b.a();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Transition for operation " + this.f6410c + "has completed");
        }
    }
}
