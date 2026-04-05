package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5260b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f5261c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f5262e;

    public o(u uVar, String str, Bundle bundle) {
        this.f5262e = uVar;
        this.f5260b = str;
        this.f5261c = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5262e.f5287c.onPostMessage(this.f5260b, this.f5261c);
    }
}
