package com.fyber.inneractive.sdk;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a extends com.fyber.inneractive.sdk.dv.a {

    /* renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.dv.interstitial.a f23020j;

    public a(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar, iVar);
        this.f23020j = null;
    }

    public abstract void a(com.fyber.inneractive.sdk.dv.interstitial.a aVar, Activity activity);

    public final void g() {
        try {
            new w(u.EVENT_READY_ON_CLIENT, this.f23944a, (i) this.f23945b).a((String) null);
        } catch (Exception unused) {
        }
    }
}
