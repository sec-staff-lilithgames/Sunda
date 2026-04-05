package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5248b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f5249c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f5250e;

    public l(u uVar, int i10, Bundle bundle) {
        this.f5250e = uVar;
        this.f5248b = i10;
        this.f5249c = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5250e.f5287c.onNavigationEvent(this.f5248b, this.f5249c);
    }
}
