package com.fyber.inneractive.sdk.player.ui;

import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.u1;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f26276b;

    public j(l lVar, int i10) {
        this.f26276b = lVar;
        this.f26275a = i10;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() throws JSONException {
        if (this.f26276b.f26271h) {
            IAlog.a("Autoclick is aborted - app in background", new Object[0]);
        } else {
            IAlog.a("Autoclick is triggered", new Object[0]);
            ((z) this.f26276b.f26270g).a(this.f26275a, l.I);
        }
        this.f26276b.p();
    }
}
