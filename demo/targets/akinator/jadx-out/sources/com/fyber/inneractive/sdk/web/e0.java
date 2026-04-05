package com.fyber.inneractive.sdk.web;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f26866a;

    /* renamed from: b, reason: collision with root package name */
    public int f26867b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f26868c;

    public e0(i0 i0Var) {
        this.f26868c = i0Var;
    }

    public final void a() {
        try {
            i0 i0Var = this.f26868c;
            i0Var.getClass();
            IAlog.a("%sunregister screen broadcast receiver called", IAlog.a(i0Var));
            if (this.f26866a != null) {
                i0 i0Var2 = this.f26868c;
                i0Var2.getClass();
                IAlog.a("%sunregistering broadcast receiver", IAlog.a(i0Var2));
                this.f26866a.unregisterReceiver(this);
                this.f26866a = null;
            }
        } catch (Throwable th2) {
            IAlog.f("IAmraidWebViewControllerBase: OrientationBroadcastReceiver: unregister: exception: %s", th2.toString());
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iB;
        if (this.f26866a == null || !"android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) || (iB = com.fyber.inneractive.sdk.util.o.b()) == this.f26867b) {
            return;
        }
        this.f26867b = iB;
        i0 i0Var = this.f26868c;
        m mVar = i0Var.f26879b;
        if (mVar != null) {
            mVar.getViewTreeObserver().removeOnPreDrawListener(i0Var.f26912n0);
            i0Var.f26879b.getViewTreeObserver().addOnPreDrawListener(i0Var.f26912n0);
        }
    }
}
