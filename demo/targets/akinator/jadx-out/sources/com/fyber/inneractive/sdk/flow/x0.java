package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23950a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f23951b;

    /* renamed from: c, reason: collision with root package name */
    public final InneractiveAdRequest f23952c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.g f23953d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.model.vast.b f23954e;

    /* renamed from: f, reason: collision with root package name */
    public final JSONArray f23955f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.features.u f23956g;

    public x0(Context context, t0 t0Var) {
        com.fyber.inneractive.sdk.config.global.features.u uVar;
        JSONArray jSONArrayB;
        com.fyber.inneractive.sdk.config.global.r rVar = t0Var.f23946c;
        InneractiveAdRequest inneractiveAdRequest = t0Var.f23944a;
        com.fyber.inneractive.sdk.response.g gVar = (com.fyber.inneractive.sdk.response.g) t0Var.f23945b;
        com.fyber.inneractive.sdk.model.vast.b bVar = gVar.O;
        if (rVar != null) {
            uVar = (com.fyber.inneractive.sdk.config.global.features.u) rVar.a(com.fyber.inneractive.sdk.config.global.features.u.class);
            jSONArrayB = rVar.b();
        } else {
            uVar = null;
            jSONArrayB = null;
        }
        this.f23950a = context;
        this.f23951b = t0Var;
        this.f23952c = inneractiveAdRequest;
        this.f23953d = gVar;
        this.f23954e = bVar;
        this.f23956g = uVar;
        this.f23955f = jSONArrayB;
    }
}
