package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f5218c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f5220f;

    public /* synthetic */ f0(o0 o0Var, int i10, Bundle bundle, int i11) {
        this.f5217b = i11;
        this.f5218c = o0Var;
        this.f5219e = i10;
        this.f5220f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5217b) {
            case 0:
                this.f5218c.onGreatestScrollPercentageIncreased(this.f5219e, this.f5220f);
                break;
            default:
                this.f5218c.onGreatestScrollPercentageIncreased(this.f5219e, this.f5220f);
                break;
        }
    }
}
