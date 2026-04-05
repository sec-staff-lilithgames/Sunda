package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.o f23569a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23570b;

    public h() {
        com.fyber.inneractive.sdk.config.o oVar = IAConfigManager.O.f23226u.f23394b;
        this.f23569a = oVar;
        this.f23570b = oVar.a("vast_endcard_x_delay", 5, 0);
    }

    public final void a(b bVar, boolean z10) {
        if (bVar == null) {
            IAlog.a("%sapplyVastCompanionEndCardTime was called with a null endcard", IAlog.a(this));
        } else {
            bVar.f23560f = bVar.k() ? z10 ? this.f23569a.b("d_e_pl_dl_pl", this.f23570b, 0) : this.f23569a.b("d_e_pl", this.f23570b, 0) : z10 ? this.f23569a.b("d_e_npl_dl_npl", this.f23570b, 0) : this.f23569a.b("d_e_npl", this.f23570b, 0);
        }
    }

    public final void a(b bVar, boolean z10, boolean z11) {
        int iB;
        if (bVar == null) {
            IAlog.a("%sapplyNonVastCompanionEndCardTime was called with a null endcard", IAlog.a(this));
            return;
        }
        if (!z10) {
            iB = this.f23569a.b("d_e_def", this.f23570b, 0);
        } else if (z11) {
            iB = this.f23569a.b("d_e_pl_dl_dl", this.f23570b, 0);
        } else {
            iB = this.f23569a.b("d_e_npl_dl_dl", this.f23570b, 0);
        }
        bVar.f23560f = iB;
    }
}
