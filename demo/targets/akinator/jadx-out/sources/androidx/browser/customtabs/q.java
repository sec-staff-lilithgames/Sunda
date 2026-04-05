package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5270c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f5271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f5272f;

    public q(u uVar, int i10, int i11, Bundle bundle) {
        this.f5272f = uVar;
        this.f5269b = i10;
        this.f5270c = i11;
        this.f5271e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5272f.f5287c.onActivityResized(this.f5269b, this.f5270c, this.f5271e);
    }
}
