package androidx.lifecycle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c2 implements k2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b2 f6532a;

    public c2(b2 b2Var) {
        this.f6532a = b2Var;
    }

    @Override // androidx.lifecycle.k2
    public void onResume() {
        this.f6532a.activityResumed$lifecycle_process_release();
    }

    @Override // androidx.lifecycle.k2
    public void onStart() {
        this.f6532a.activityStarted$lifecycle_process_release();
    }

    @Override // androidx.lifecycle.k2
    public void onCreate() {
    }
}
