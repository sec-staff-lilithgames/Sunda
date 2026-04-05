package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f5273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f5274c;

    public r(u uVar, Bundle bundle) {
        this.f5274c = uVar;
        this.f5273b = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5274c.f5287c.onWarmupCompleted(this.f5273b);
    }
}
