package com.fyber.inneractive.sdk.player.ui.remote;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.player.ui.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.r;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements com.fyber.inneractive.sdk.web.remoteui.a, a {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.web.remoteui.a f26287a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.web.remoteui.b f26288b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f26289c;

    /* renamed from: d, reason: collision with root package name */
    public final e f26290d;

    /* renamed from: e, reason: collision with root package name */
    public n f26291e;

    /* renamed from: f, reason: collision with root package name */
    public final String f26292f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26295i;

    /* renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.g f26296j;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26293g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26294h = false;

    /* renamed from: k, reason: collision with root package name */
    public final b f26297k = new b(this);

    /* renamed from: l, reason: collision with root package name */
    public final c f26298l = new c(this);

    /* renamed from: m, reason: collision with root package name */
    public boolean f26299m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f26300n = false;

    public d(Context context, t0 t0Var, String str) {
        this.f26289c = t0Var;
        this.f26292f = str;
        com.fyber.inneractive.sdk.web.remoteui.b bVar = new com.fyber.inneractive.sdk.web.remoteui.b();
        this.f26288b = bVar;
        this.f26290d = new e(this);
        bVar.setCommandHandler(this);
        bVar.setResultFailureListener(this);
        bVar.setCommandHandler(this);
        this.f26296j = new com.fyber.inneractive.sdk.flow.g(context, true, t0Var != null ? t0Var.f23944a : null, b(), null);
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, boolean z10, HashMap map) {
        HashMap map2;
        IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
        r.f26804b.removeCallbacks(this.f26297k);
        String str2 = (map == null || !map.containsKey("failedURL")) ? this.f26292f : (String) map.get("failedURL");
        if (z10) {
            if (b() != null) {
                b().L = false;
            }
            a();
            t tVar = t.VAST_ERROR_DVC_FAILURE;
            t0 t0Var = this.f26289c;
            com.fyber.inneractive.sdk.network.events.a.a(tVar, bVar, t0Var != null ? t0Var.f23944a : null, b(), str, str2, Boolean.valueOf(this.f26295i));
            map2 = map;
        } else {
            t tVar2 = t.VAST_ERROR_DVC_FAILURE;
            String strName = bVar.name();
            t0 t0Var2 = this.f26289c;
            map2 = map;
            com.fyber.inneractive.sdk.network.events.a.a(tVar2, strName, str2, t0Var2 != null ? t0Var2.f23944a : null, b(), map2, Boolean.valueOf(this.f26295i));
        }
        com.fyber.inneractive.sdk.web.remoteui.a aVar = this.f26287a;
        if (aVar != null) {
            aVar.a(bVar, str, z10, map2);
        }
    }

    public final com.fyber.inneractive.sdk.response.e b() {
        t0 t0Var = this.f26289c;
        if (t0Var != null) {
            return t0Var.f23945b;
        }
        return null;
    }

    public final void a() {
        this.f26294h = true;
        this.f26291e = null;
        e eVar = this.f26290d;
        eVar.f26302b.clear();
        eVar.f26301a = null;
        IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
        r.f26804b.removeCallbacks(this.f26297k);
        this.f26288b.setVisibility(8);
        this.f26288b.setUiReady(false);
        this.f26288b.destroy();
        this.f26296j = null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.remote.a
    public final void a(String str, HashMap map) throws JSONException {
        g1 lastClickedLocation;
        e eVar;
        d dVar;
        com.fyber.inneractive.sdk.flow.g gVar;
        lastClickedLocation = this.f26288b.getLastClickedLocation();
        eVar = this.f26290d;
        eVar.getClass();
        str.getClass();
        switch (str) {
            case "clickSkip":
                eVar.a(6, lastClickedLocation);
                break;
            case "expandCollapseClick":
                eVar.a(5, lastClickedLocation);
                break;
            case "appInfoClick":
                eVar.a(10, lastClickedLocation);
                break;
            case "shouldSkipUpdateUi.true":
                d dVar2 = eVar.f26301a;
                if (dVar2 != null) {
                    dVar2.f26299m = true;
                    break;
                }
                break;
            case "onGeneralError":
                d dVar3 = eVar.f26301a;
                if (dVar3 != null) {
                    dVar3.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_GENERAL_ERROR, (String) map.get("error"), "true".equalsIgnoreCase((String) map.get("shouldFailUi")), map);
                    break;
                }
                break;
            case "ctaClick":
                eVar.a(3, lastClickedLocation);
                break;
            case "isSkipEnabled.false":
                d dVar4 = eVar.f26301a;
                if (dVar4 != null) {
                    dVar4.f26300n = false;
                    break;
                }
                break;
            case "clickMuteUnmute":
                eVar.a(1, lastClickedLocation);
                break;
            case "DOMLoaded":
                String str2 = eVar.f26303c ? "FyberRemoteUiBridge.setMute()" : "FyberRemoteUiBridge.setUnmute()";
                d dVar5 = eVar.f26301a;
                if (dVar5 != null) {
                    dVar5.f26288b.a(str2);
                }
                Iterator it = eVar.f26302b.keySet().iterator();
                while (it.hasNext()) {
                    String str3 = (String) eVar.f26302b.get((String) it.next());
                    if (!TextUtils.isEmpty(str3) && (dVar = eVar.f26301a) != null) {
                        dVar.f26288b.a(str3);
                    }
                }
                eVar.f26302b.clear();
                d dVar6 = eVar.f26301a;
                if (dVar6 != null) {
                    IAlog.a("%s : remote UI loaded successfully", "RemoteUIWebviewController");
                    IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
                    r.f26804b.removeCallbacks(dVar6.f26297k);
                    dVar6.f26293g = false;
                    dVar6.f26288b.setUiReady(true);
                    if (dVar6.b() != null) {
                        dVar6.b().L = true;
                    }
                    dVar6.f26288b.setVisibility(0);
                    break;
                }
                break;
            case "adIdentifierClick":
                d dVar7 = eVar.f26301a;
                if (dVar7 != null && (gVar = dVar7.f26296j) != null) {
                    gVar.a();
                    break;
                }
                break;
            case "shouldSkipUpdateUi.false":
                d dVar8 = eVar.f26301a;
                if (dVar8 != null) {
                    dVar8.f26299m = false;
                    break;
                }
                break;
            case "isSkipEnabled.true":
                d dVar9 = eVar.f26301a;
                if (dVar9 != null) {
                    dVar9.f26300n = true;
                    break;
                }
                break;
            case "onVideoClick":
                eVar.a(7, lastClickedLocation);
                break;
            case "onResourceError":
                d dVar10 = eVar.f26301a;
                if (dVar10 != null) {
                    dVar10.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_RESOURCE_ERROR, (String) map.get("error"), true, map);
                    break;
                }
                break;
            default:
                IAlog.a("%s: unknown command: %s", "RemoteUiCommandHandler", str);
                break;
        }
        d dVar11 = eVar.f26301a;
        if (dVar11 != null) {
            dVar11.f26288b.a("FyberRemoteUiBridge.nativeCallComplete()");
        }
    }
}
