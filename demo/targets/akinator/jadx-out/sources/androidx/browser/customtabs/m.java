package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f5253c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f5254e;

    public m(u uVar, String str, Bundle bundle) {
        this.f5254e = uVar;
        this.f5252b = str;
        this.f5253c = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5254e.f5287c.extraCallback(this.f5252b, this.f5253c);
    }
}
