package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f5255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f5256c;

    public n(u uVar, Bundle bundle) {
        this.f5256c = uVar;
        this.f5255b = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5256c.f5287c.onMessageChannelReady(this.f5255b);
    }
}
