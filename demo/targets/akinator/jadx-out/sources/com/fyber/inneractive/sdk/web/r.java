package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.content.IntentFilter;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f26944a;

    public r(i0 i0Var) {
        this.f26944a = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i0 i0Var = this.f26944a;
        if (i0Var.V == null) {
            try {
                IAlog.a("%sregistering orientation broadcast receiver", IAlog.a(i0Var));
                this.f26944a.V = new e0(this.f26944a);
                if (com.fyber.inneractive.sdk.util.o.a(this.f26944a.f26879b) != null) {
                    i0 i0Var2 = this.f26944a;
                    e0 e0Var = i0Var2.V;
                    Context contextA = com.fyber.inneractive.sdk.util.o.a(i0Var2.f26879b);
                    i0 i0Var3 = e0Var.f26868c;
                    i0Var3.getClass();
                    IAlog.a("%sregister screen broadcast receiver", IAlog.a(i0Var3));
                    e0Var.f26866a = contextA;
                    contextA.registerReceiver(e0Var, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
                }
            } catch (Exception e10) {
                i0 i0Var4 = this.f26944a;
                i0Var4.getClass();
                IAlog.f("%sfailed registering orientation broadcast recevier", IAlog.a(i0Var4));
                if (IAlog.f26748a >= 3) {
                    e10.printStackTrace();
                }
            }
        }
    }
}
