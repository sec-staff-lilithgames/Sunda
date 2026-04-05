package com.bytedance.sdk.openadsdk.core.zz;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.cm.zz;
import com.bytedance.sdk.openadsdk.cm.Cif;
import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.kln;
import com.ironsource.G5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd extends com.bytedance.sdk.openadsdk.core.widget.jpo.my {

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.model.dt f21152jd;
    public ArrayList<Integer> jpo;

    /* renamed from: ju, reason: collision with root package name */
    private boolean f21153ju;

    /* renamed from: yd, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.jd.au f21154yd;

    public yd(Context context, ef efVar, com.bytedance.sdk.openadsdk.core.model.dt dtVar, Cif cif, com.bytedance.sdk.component.adexpress.jd.au auVar) {
        super(context, efVar, dtVar.fc(), cif, false);
        this.f21153ju = false;
        this.jpo = new ArrayList<>();
        this.f21152jd = dtVar;
        this.f21154yd = auVar;
        this.f21153ju = com.bytedance.sdk.openadsdk.rq.jpo.jpo("inject_data_normal_open", 0) == 1;
    }

    private WebResourceResponse cm(String str, zz.jpo jpoVar) {
        InputStream inputStreamJd;
        if (TextUtils.isEmpty(str) || (inputStreamJd = oya.jd(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse(jpoVar.jpo(), C.UTF8_NAME, inputStreamJd);
        jpo(webResourceResponse);
        return webResourceResponse;
    }

    private com.bytedance.sdk.component.adexpress.jpo.jd.jpo jd(String str, zz.jpo jpoVar) {
        kln.jpo jpoVarJj;
        JSONArray jSONArrayJd;
        kln klnVarJrx = this.f21152jd.jrx();
        if (klnVarJrx == null || (jpoVarJj = klnVarJrx.jj()) == null || (jSONArrayJd = jpoVarJj.jd()) == null || jSONArrayJd.length() <= 0) {
            return null;
        }
        return jpo(jSONArrayJd, str, jpoVar);
    }

    private WebResourceResponse my() throws Resources.NotFoundException {
        InputStream inputStreamOpenRawResource;
        int iZz = com.bytedance.sdk.openadsdk.core.zz.jd().zz();
        if (iZz == 0) {
            return null;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.sq.jpo().getResources();
        if (resources != null) {
            try {
                inputStreamOpenRawResource = resources.openRawResource(iZz);
            } catch (Resources.NotFoundException e10) {
                com.bytedance.sdk.component.utils.nmd.wqx("ExpressClient", e10.toString());
            }
        } else {
            inputStreamOpenRawResource = null;
        }
        if (inputStreamOpenRawResource != null) {
            return new WebResourceResponse(zz.jpo.IMAGE.jpo(), C.UTF8_NAME, inputStreamOpenRawResource);
        }
        return null;
    }

    private com.bytedance.sdk.component.adexpress.jpo.jd.jpo wqx(String str, zz.jpo jpoVar) {
        kln.jpo jpoVarJj;
        JSONArray jSONArrayWqx;
        kln klnVarJrx = this.f21152jd.jrx();
        if (klnVarJrx == null || (jpoVarJj = klnVarJrx.jj()) == null || (jSONArrayWqx = jpoVarJj.wqx()) == null || jSONArrayWqx.length() <= 0) {
            return null;
        }
        return jpo(jSONArrayWqx, str, jpoVar);
    }

    public int jpo() {
        Iterator<Integer> it = this.jpo.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (next.intValue() == 3 || next.intValue() == 2 || next.intValue() == -1) {
                return next.intValue();
            }
        }
        return TextUtils.isEmpty(cm()) ? -1 : 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.f20928qk = false;
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.xyk = false;
        super.onPageStarted(webView, str, bitmap);
        com.bytedance.sdk.component.adexpress.jd.au auVar = this.f21154yd;
        if (auVar != null && auVar.dt() && this.f21153ju) {
            this.f21154yd.wqx();
            com.bytedance.sdk.component.utils.oya.jpo(webView, "javascript:window.SDK_INJECT_DATA=" + this.f21154yd.wqx());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.jpo("ExpressClient", "shouldInterceptRequest error1", th2);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r9, java.lang.String r10) {
        /*
            r8 = this;
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            com.bytedance.sdk.component.adexpress.jpo.jd.jpo r0 = r8.jpo(r9, r10)     // Catch: java.lang.Throwable -> L19
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1d
            android.webkit.WebResourceResponse r1 = r0.jpo()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1d
            r1 = 1
        L15:
            r6 = r10
            r7 = r1
            r1 = r8
            goto L1f
        L19:
            r0 = move-exception
            r1 = r8
            r6 = r10
            goto L4b
        L1d:
            r1 = 2
            goto L15
        L1f:
            r1.jpo(r2, r4, r6, r7)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3e
            int r10 = r0.jd()     // Catch: java.lang.Throwable -> L3c
            r2 = 5
            if (r10 == r2) goto L3e
            r0.jd()     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList<java.lang.Integer> r10 = r1.jpo     // Catch: java.lang.Throwable -> L3c
            int r2 = r0.jd()     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L3c
            r10.add(r2)     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r0 = move-exception
            goto L4b
        L3e:
            if (r0 == 0) goto L52
            android.webkit.WebResourceResponse r10 = r0.jpo()     // Catch: java.lang.Throwable -> L3c
            if (r10 == 0) goto L52
            android.webkit.WebResourceResponse r9 = r0.jpo()     // Catch: java.lang.Throwable -> L3c
            return r9
        L4b:
            java.lang.String r10 = "ExpressClient"
            java.lang.String r2 = "shouldInterceptRequest error2"
            com.bytedance.sdk.component.utils.nmd.jpo(r10, r2, r0)
        L52:
            android.webkit.WebResourceResponse r9 = super.shouldInterceptRequest(r9, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.zz.yd.shouldInterceptRequest(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
    }

    private String cm() {
        com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.f21152jd;
        if (dtVar == null) {
            return null;
        }
        if (dtVar.vzb() != null) {
            return this.f21152jd.vzb().ju();
        }
        if (this.f21152jd.jrx() != null) {
            return "v3";
        }
        return null;
    }

    private WebResourceResponse my(String str) {
        InputStream inputStreamJpo;
        if (TextUtils.isEmpty(str) || (inputStreamJpo = com.bytedance.sdk.openadsdk.core.my.jpo.jpo().jpo(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse("audio/*", C.UTF8_NAME, inputStreamJpo);
        jpo(webResourceResponse);
        return webResourceResponse;
    }

    private com.bytedance.sdk.component.adexpress.jpo.jd.jpo jpo(WebView webView, String str) {
        com.bytedance.sdk.openadsdk.core.model.opi opiVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.equals("local://pag_open_icon_id") && !str.equals(com.bytedance.sdk.openadsdk.core.zz.jpo.jd.jpo)) {
            dt.jpo jpoVarVzb = this.f21152jd.vzb();
            if (jpoVarVzb != null && !TextUtils.isEmpty(str) && str.equals(jpoVarVzb.jd())) {
                com.bytedance.sdk.component.adexpress.jpo.jd.jpo jpoVar = new com.bytedance.sdk.component.adexpress.jpo.jd.jpo();
                jpoVar.jpo(5);
                WebResourceResponse webResourceResponseMy = my(str);
                jpoVar.jpo(webResourceResponseMy);
                com.bytedance.sdk.openadsdk.core.my.jpo.jpo().jpo(webResourceResponseMy != null);
                return jpoVar;
            }
            zz.jpo jpoVarJpo = com.bytedance.sdk.component.adexpress.cm.zz.jpo(str);
            if (oya.jd(this.f21152jd)) {
                com.bytedance.sdk.component.adexpress.jpo.jd.jpo jpoVarJpo2 = jpo(str, jpoVarJpo);
                if (jpoVarJpo2 != null) {
                    return jpoVarJpo2;
                }
                com.bytedance.sdk.component.adexpress.jpo.jd.jpo jpoVarJd = jd(str, jpoVarJpo);
                if (jpoVarJd != null) {
                    Log.d("ExpressClient", "interceptTemplate: Hit fetch file cache url=".concat(str));
                    return jpoVarJd;
                }
                com.bytedance.sdk.component.adexpress.jpo.jd.jpo jpoVarWqx = wqx(str, jpoVarJpo);
                if (jpoVarWqx != null) {
                    return jpoVarWqx;
                }
            }
            if (jpoVarJpo != zz.jpo.IMAGE) {
                Iterator<com.bytedance.sdk.openadsdk.core.model.opi> it = this.f21152jd.fri().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.bytedance.sdk.openadsdk.core.model.opi next = it.next();
                    if (!TextUtils.isEmpty(next.jpo()) && !TextUtils.isEmpty(str)) {
                        String strJpo = next.jpo();
                        if (strJpo.startsWith(HttpRequest.DEFAULT_SCHEME)) {
                            strJpo = strJpo.replaceFirst(HttpRequest.DEFAULT_SCHEME, "http");
                        }
                        if ((str.startsWith(HttpRequest.DEFAULT_SCHEME) ? str.replaceFirst(HttpRequest.DEFAULT_SCHEME, "http") : str).equals(strJpo)) {
                            opiVar = next;
                            break;
                        }
                    }
                }
            }
            if (jpoVarJpo != zz.jpo.IMAGE && opiVar == null) {
                return com.bytedance.sdk.component.adexpress.jpo.jd.jd.jpo(str, jpoVarJpo, "", cm());
            }
            com.bytedance.sdk.component.adexpress.jpo.jd.jpo jpoVar2 = new com.bytedance.sdk.component.adexpress.jpo.jd.jpo();
            jpoVar2.jpo(5);
            jpoVar2.jpo(jpo(str, com.bytedance.sdk.openadsdk.core.zz.jpo.jd.jpo(this.f21152jd, str)));
            return jpoVar2;
        }
        com.bytedance.sdk.component.adexpress.jpo.jd.jpo jpoVar3 = new com.bytedance.sdk.component.adexpress.jpo.jd.jpo();
        jpoVar3.jpo(5);
        jpoVar3.jpo(my());
        return jpoVar3;
    }

    private com.bytedance.sdk.component.adexpress.jpo.jd.jpo jpo(String str, zz.jpo jpoVar) {
        kln.jpo jpoVarJj;
        JSONArray jSONArrayJpo;
        kln klnVarJrx = this.f21152jd.jrx();
        if (klnVarJrx != null && (jpoVarJj = klnVarJrx.jj()) != null && (jSONArrayJpo = jpoVarJj.jpo()) != null && jSONArrayJpo.length() > 0) {
            for (int i10 = 0; i10 < jSONArrayJpo.length(); i10++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.ju.wqx.jpo(jSONArrayJpo.optString(i10), com.bytedance.sdk.openadsdk.core.settings.au.jrx().ree()), str) && jpoVar == zz.jpo.IMAGE) {
                    com.bytedance.sdk.component.adexpress.jpo.jd.jpo jpoVar2 = new com.bytedance.sdk.component.adexpress.jpo.jd.jpo();
                    jpoVar2.jpo(5);
                    jpoVar2.jpo(jpo(str, com.bytedance.sdk.component.utils.my.jpo(str)));
                    return jpoVar2;
                }
            }
        }
        return null;
    }

    private com.bytedance.sdk.component.adexpress.jpo.jd.jpo jpo(JSONArray jSONArray, String str, zz.jpo jpoVar) {
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.ju.wqx.jpo(jSONArray.optString(i10), com.bytedance.sdk.openadsdk.core.settings.au.jrx().ree()), str)) {
                    com.bytedance.sdk.component.adexpress.jpo.jd.jpo jpoVar2 = new com.bytedance.sdk.component.adexpress.jpo.jd.jpo();
                    jpoVar2.jpo(5);
                    jpoVar2.jpo(cm(str, jpoVar));
                    return jpoVar2;
                }
            }
        }
        return null;
    }

    private WebResourceResponse jpo(String str, String str2) {
        WebResourceResponse webResourceResponse = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream inputStreamJpo = com.bytedance.sdk.openadsdk.zz.cm.jpo(str, str2);
            if (inputStreamJpo == null) {
                return null;
            }
            WebResourceResponse webResourceResponse2 = new WebResourceResponse(zz.jpo.IMAGE.jpo(), G5.N, inputStreamJpo);
            try {
                jpo(webResourceResponse2);
                return webResourceResponse2;
            } catch (Throwable th2) {
                th = th2;
                webResourceResponse = webResourceResponse2;
                com.bytedance.sdk.component.utils.nmd.jpo("ExpressClient", "get image WebResourceResponse error", th);
                return webResourceResponse;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void jpo(long j10, long j11, String str, int i10) {
        Cif cif = this.f20925jj;
        if (cif == null || cif.jd() == null) {
            return;
        }
        zz.jpo jpoVarJpo = com.bytedance.sdk.component.adexpress.cm.zz.jpo(str);
        if (jpoVarJpo == zz.jpo.HTML) {
            this.f20925jj.jd().jpo(str, j10, j11, i10);
        } else if (jpoVarJpo == zz.jpo.JS) {
            this.f20925jj.jd().jd(str, j10, j11, i10);
        }
    }

    private void jpo(WebResourceResponse webResourceResponse) {
        if (webResourceResponse == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("Access-Control-Allow-Origin", "*");
        webResourceResponse.setResponseHeaders(map);
    }
}
