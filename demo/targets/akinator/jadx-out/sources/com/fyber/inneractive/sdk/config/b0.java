package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.network.i1;
import com.fyber.inneractive.sdk.network.k1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b0 implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f23235a;

    public b0(IAConfigManager iAConfigManager) {
        this.f23235a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        int i10;
        h0 h0Var = (h0) obj;
        if (h0Var != null) {
            if (z10) {
                IAConfigManager iAConfigManager = this.f23235a;
                IAConfigManager iAConfigManager2 = IAConfigManager.O;
                iAConfigManager.getClass();
                iAConfigManager.f23210e = h0Var.f23314c;
                iAConfigManager.f23209d = h0Var.f23313b;
                iAConfigManager.f23206a = h0Var.f23315d;
                iAConfigManager.f23207b = h0Var.f23316e;
            } else {
                IAConfigManager.P = System.currentTimeMillis();
                IAConfigManager iAConfigManager3 = this.f23235a;
                iAConfigManager3.getClass();
                IAlog.a("Got new remote configuration from server:", new Object[0]);
                iAConfigManager3.f23210e = h0Var.f23314c;
                iAConfigManager3.f23209d = h0Var.f23313b;
                iAConfigManager3.f23206a = h0Var.f23315d;
                iAConfigManager3.f23207b = h0Var.f23316e;
            }
        } else if (exc instanceof com.fyber.inneractive.sdk.network.g) {
            IAConfigManager.P = System.currentTimeMillis();
        }
        if (z10) {
            return;
        }
        IAConfigManager iAConfigManager4 = this.f23235a;
        IAConfigManager iAConfigManager5 = IAConfigManager.O;
        if (iAConfigManager5.f23210e != null) {
            iAConfigManager4.a(null);
        } else {
            iAConfigManager4.getClass();
            if ((exc instanceof InvalidAppIdException) || (exc instanceof FileNotFoundException) || (!(exc instanceof k1) ? !TextUtils.isEmpty(iAConfigManager4.f23208c.trim()) : (i10 = ((k1) exc).f24236a) < 400 || i10 >= 500)) {
                iAConfigManager4.a(new InvalidAppIdException());
            } else if (exc instanceof com.fyber.inneractive.sdk.network.b) {
                iAConfigManager4.a(exc);
            } else {
                iAConfigManager4.a(new i0());
            }
        }
        if (iAConfigManager5.f23210e != null) {
            IAConfigManager iAConfigManager6 = this.f23235a;
            if (iAConfigManager6.C == null) {
                iAConfigManager6.C = new com.fyber.inneractive.sdk.network.v0(new e0(iAConfigManager6), iAConfigManager6.f23211f, new com.fyber.inneractive.sdk.config.global.m());
            }
            i1 i1Var = iAConfigManager6.C.f24287f;
            if (i1Var == i1.RUNNING || i1Var == i1.QUEUED) {
                return;
            }
            iAConfigManager5.f23224s.a(iAConfigManager6.C);
        }
    }
}
