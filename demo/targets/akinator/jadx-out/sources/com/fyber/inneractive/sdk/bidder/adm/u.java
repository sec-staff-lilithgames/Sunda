package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.c0;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f23072a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Exception f23073b;

    public u(c0 c0Var, Exception exc) {
        this.f23072a = c0Var;
        this.f23073b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        c0 c0Var = this.f23072a;
        if (c0Var != null) {
            c0Var.a(this.f23073b, InneractiveErrorCode.INVALID_INPUT, new com.fyber.inneractive.sdk.response.e[0]);
        }
    }
}
