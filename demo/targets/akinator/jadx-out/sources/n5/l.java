package n5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f75670a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f75671b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f75672c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f75673d;

    public l(boolean z10, boolean z11, boolean z12, int i10) {
        this.f75670a = i10;
        this.f75672c = z11;
        this.f75671b = z10;
        this.f75673d = z12;
    }

    public boolean appApkHasEmbeddedProfile() {
        return this.f75673d;
    }

    public int getProfileInstallResultCode() {
        return this.f75670a;
    }

    public boolean hasProfileEnqueuedForCompilation() {
        return this.f75672c;
    }

    public boolean isCompiledWithProfile() {
        return this.f75671b;
    }
}
