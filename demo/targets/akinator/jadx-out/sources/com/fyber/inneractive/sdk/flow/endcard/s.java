package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s implements com.fyber.inneractive.sdk.web.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f23622a;

    public s(u uVar) {
        this.f23622a = uVar;
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar) {
        IAlog.a("%s End-Card loaded", this.f23622a.f23553a);
        this.f23622a.f23630h.set(false);
        u uVar = this.f23622a;
        uVar.getClass();
        boolean z10 = iVar != null;
        uVar.f23628f = z10;
        com.fyber.inneractive.sdk.web.m mVar = z10 ? iVar.f26879b : null;
        String str = IAConfigManager.O.H.f23136e;
        if (!uVar.f() || mVar == null || TextUtils.isEmpty(str)) {
            uVar.f23554b.m();
        } else {
            q0.a(mVar, str, uVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        IAlog.f("%s End-Card failed to load!", this.f23622a.f23553a);
        this.f23622a.f23630h.set(false);
        u uVar = this.f23622a;
        uVar.f23628f = false;
        uVar.f23554b.a(inneractiveInfrastructureError);
    }
}
