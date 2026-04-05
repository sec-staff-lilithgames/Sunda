package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f5284b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f5285c;

    public t(u uVar, Bundle bundle) {
        this.f5285c = uVar;
        this.f5284b = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5285c.f5287c.onMinimized(this.f5284b);
    }
}
