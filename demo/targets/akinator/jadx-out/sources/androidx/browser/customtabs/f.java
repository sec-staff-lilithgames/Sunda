package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends d0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f5216b;

    public f(Context context) {
        this.f5216b = context;
    }

    @Override // androidx.browser.customtabs.d0
    public final void onCustomTabsServiceConnected(ComponentName componentName, v vVar) {
        vVar.warmup(0L);
        this.f5216b.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
