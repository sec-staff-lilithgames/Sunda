package com.fyber.inneractive.sdk.config;

import android.os.Handler;
import android.os.Message;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f23234a;

    public b(e eVar) {
        this.f23234a = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 123) {
            return false;
        }
        e eVar = this.f23234a;
        if (eVar.f23253a.compareAndSet(false, true)) {
            if (eVar.f23253a.get() && eVar.f23255c != null) {
                IAlog.a("startCounting", new Object[0]);
                v1 v1Var = eVar.f23255c;
                v1Var.getClass();
                t1 t1Var = new t1(v1Var);
                v1Var.f26826c = t1Var;
                v1Var.f26827d = false;
                t1Var.sendEmptyMessage(1932593528);
            }
            IAlog.a("Pause signal", new Object[0]);
        }
        return true;
    }
}
