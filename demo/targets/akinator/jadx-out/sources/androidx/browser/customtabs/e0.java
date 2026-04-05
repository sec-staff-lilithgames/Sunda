package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5212b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f5213c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f5215f;

    public /* synthetic */ e0(o0 o0Var, boolean z10, Bundle bundle, int i10) {
        this.f5212b = i10;
        this.f5213c = o0Var;
        this.f5214e = z10;
        this.f5215f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5212b) {
            case 0:
                this.f5213c.onSessionEnded(this.f5214e, this.f5215f);
                break;
            case 1:
                this.f5213c.onVerticalScrollEvent(this.f5214e, this.f5215f);
                break;
            case 2:
                this.f5213c.onVerticalScrollEvent(this.f5214e, this.f5215f);
                break;
            default:
                this.f5213c.onSessionEnded(this.f5214e, this.f5215f);
                break;
        }
    }
}
