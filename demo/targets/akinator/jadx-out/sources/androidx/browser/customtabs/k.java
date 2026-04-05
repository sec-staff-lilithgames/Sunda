package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f5241b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f5242c;

    public k(u uVar, Bundle bundle) {
        this.f5242c = uVar;
        this.f5241b = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5242c.f5287c.onUnminimized(this.f5241b);
    }
}
