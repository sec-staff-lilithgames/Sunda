package com.fyber.inneractive.sdk.player.ui.remote;

import com.fyber.inneractive.sdk.ignite.m;
import com.fyber.inneractive.sdk.player.ui.o;
import com.fyber.inneractive.sdk.player.ui.s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements com.fyber.inneractive.sdk.web.remoteui.a {

    /* renamed from: a, reason: collision with root package name */
    public s f26304a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26311h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26305b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26306c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f26307d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26308e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26309f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26310g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26312i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f26313j = false;

    /* renamed from: k, reason: collision with root package name */
    public m f26314k = m.NONE;

    /* renamed from: l, reason: collision with root package name */
    public String f26315l = "";

    public f(o oVar) {
        this.f26304a = null;
        this.f26311h = false;
        this.f26304a = oVar;
        this.f26311h = oVar.H;
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, boolean z10, HashMap map) {
        s sVar = this.f26304a;
        if (sVar == null) {
            IAlog.a("%s: showFallback: fallback won't be displayed because it is null", "RemoteUiFallbackHandler");
            return;
        }
        sVar.g(this.f26305b);
        this.f26304a.d(this.f26312i);
        this.f26304a.f(this.f26309f);
        this.f26304a.a(this.f26308e, this.f26314k);
        this.f26304a.c(this.f26311h);
        this.f26304a.a(this.f26313j, this.f26315l);
        this.f26304a.b(this.f26310g);
        this.f26304a.e(this.f26306c);
        this.f26304a.a(this.f26307d);
    }
}
