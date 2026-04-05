package com.fyber.inneractive.sdk.web.remoteui;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.m;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends m implements a, com.fyber.inneractive.sdk.player.ui.remote.a {

    /* renamed from: h, reason: collision with root package name */
    public a f26946h;

    /* renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.remote.a f26947i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f26948j = false;

    /* renamed from: k, reason: collision with root package name */
    public final c f26949k;

    public b() {
        c cVar = new c(this, this);
        this.f26949k = cVar;
        setWebViewClient(cVar);
        getSettings().setJavaScriptEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setBackgroundColor(0);
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, boolean z10, HashMap map) {
        this.f26948j = false;
        a aVar = this.f26946h;
        if (aVar != null) {
            aVar.a(bVar, str, z10, map);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.m, android.webkit.WebView
    public final void destroy() {
        this.f26946h = null;
        this.f26947i = null;
        c cVar = this.f26949k;
        cVar.getClass();
        IAlog.a("%s: destroy()", "RemoteUiWebViewClient");
        cVar.f26951b = null;
        cVar.f26950a = null;
        super.destroy();
    }

    public void setCommandHandler(com.fyber.inneractive.sdk.player.ui.remote.a aVar) {
        this.f26947i = aVar;
    }

    public void setResultFailureListener(a aVar) {
        this.f26946h = aVar;
    }

    public void setUiReady(boolean z10) {
        this.f26948j = z10;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.remote.a
    public final void a(String str, HashMap map) {
        com.fyber.inneractive.sdk.player.ui.remote.a aVar = this.f26947i;
        if (aVar != null) {
            aVar.a(str, map);
        }
    }
}
