package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends i1 {
    public final com.fyber.inneractive.sdk.flow.endcard.q N;

    public b(com.fyber.inneractive.sdk.flow.endcard.q qVar, boolean z10) {
        super(z10, c0.INTERSTITIAL, null);
        this.N = qVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    @Override // com.fyber.inneractive.sdk.web.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r9, com.fyber.inneractive.sdk.util.g1 r10) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.web.b.a(java.lang.String, com.fyber.inneractive.sdk.util.g1):boolean");
    }

    @Override // com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.j
    public final void d() {
        if (this.N == null || this.f26883f == null) {
            return;
        }
        this.f26883f.a(this, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.WEBVIEW_FMP_ENDCARD_ERROR));
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final com.fyber.inneractive.sdk.measurement.tracker.e f() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.web.l
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.web.l
    public final void c() {
    }

    @Override // com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.j
    public final void a(WebView webView) {
        String string;
        if (webView == null || this.N == null) {
            return;
        }
        webView.setLongClickable(false);
        webView.setOnLongClickListener(new com.fyber.inneractive.sdk.util.p0());
        com.fyber.inneractive.sdk.flow.endcard.q qVar = this.N;
        com.fyber.inneractive.sdk.flow.endcard.p pVar = (com.fyber.inneractive.sdk.flow.endcard.p) qVar.f23621d.f();
        pVar.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            com.fyber.inneractive.sdk.util.c1.a(jSONObject, "name", pVar.f23615j);
            JSONArray jSONArray = new JSONArray();
            String str = pVar.f23616k;
            if (!TextUtils.isEmpty(str)) {
                jSONArray.put(str);
            }
            com.fyber.inneractive.sdk.util.c1.a(jSONObject, "icons", jSONArray);
            string = jSONObject.toString();
        } catch (Exception e10) {
            IAlog.a("%s FMP End-Card JSON error: %s", e10, pVar.f23553a, e10.getMessage());
            string = null;
        }
        if (TextUtils.isEmpty(string)) {
            IAlog.f("%s FMP End-Card JSON required", qVar.f23618a);
            return;
        }
        com.fyber.inneractive.sdk.util.q0.a(webView, "loadAssets(" + string + ");");
    }

    @Override // com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.j
    public final void a() {
        super.a();
        if (this.f26883f != null) {
            this.f26883f.a(this, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.WEBVIEW_FMP_ENDCARD_ERROR, new WebViewRendererProcessHasGoneError()));
        }
    }
}
