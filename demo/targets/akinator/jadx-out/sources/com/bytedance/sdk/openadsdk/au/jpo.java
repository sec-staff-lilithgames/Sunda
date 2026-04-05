package com.bytedance.sdk.openadsdk.au;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.zz.jj;
import com.bytedance.sdk.openadsdk.cm.Cif;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.jr;
import com.bytedance.sdk.openadsdk.core.model.nmd;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.widget.jpo.my;
import com.bytedance.sdk.openadsdk.core.widget.jpo.wqx;
import com.bytedance.sdk.openadsdk.qk.jd;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.rq;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: cm, reason: collision with root package name */
    private static long f19474cm = 3600000;
    private static volatile jpo jpo = null;
    private static int wqx = 2;

    /* renamed from: jd, reason: collision with root package name */
    private final Handler f19475jd;
    private LinkedHashMap<Integer, SoftReference<jj>> my;

    public jpo() {
        wqx = com.bytedance.sdk.openadsdk.rq.jpo.jpo("pre_render_count", 2);
        long jJpo = com.bytedance.sdk.openadsdk.rq.jpo.jpo("pre_render_duration", 3600000);
        f19474cm = jJpo;
        if (wqx <= 0) {
            wqx = 2;
        }
        if (jJpo <= 0) {
            f19474cm = 3600000L;
        }
        this.my = new LinkedHashMap<>();
        this.f19475jd = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.au.jpo.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                SoftReference softReference;
                int i10 = message.what;
                if (jpo.this.my == null || (softReference = (SoftReference) jpo.this.my.get(Integer.valueOf(i10))) == null) {
                    return false;
                }
                jj jjVar = (jj) softReference.get();
                jpo.this.jpo(i10, 2, new dt(), jjVar == null ? "" : jjVar.getTag());
                return false;
            }
        });
    }

    public static boolean wqx(dt dtVar) {
        return nmd.xyk(dtVar) || nmd.jd(dtVar) || nmd.wqx(dtVar);
    }

    public jj jd(dt dtVar) {
        if (dtVar == null || TextUtils.isEmpty(dtVar.iwg())) {
            return null;
        }
        String strIwg = dtVar.iwg();
        if (TextUtils.isEmpty(strIwg)) {
            return null;
        }
        int iHashCode = strIwg.hashCode();
        SoftReference<jj> softReference = this.my.get(Integer.valueOf(iHashCode));
        if (softReference == null || softReference.get() == null) {
            return null;
        }
        jj jjVar = softReference.get();
        jpo(dtVar, jjVar.getTag(), Double.valueOf((System.currentTimeMillis() / 1000) - dtVar.iy()).floatValue(), "web_use_pre_render");
        jpo(iHashCode, 3, dtVar, jjVar.getTag());
        return jjVar;
    }

    public static jpo jpo() {
        if (jpo == null) {
            synchronized (jpo.class) {
                try {
                    if (jpo == null) {
                        jpo = new jpo();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    public void jpo(final dt dtVar) {
        final String str;
        if (dtVar == null || !wqx(dtVar)) {
            return;
        }
        jr jrVarTu = dtVar.tu();
        if (jrVarTu == null) {
            jrVarTu = new jr();
        }
        dtVar.sbz();
        if (dtVar.sbz()) {
            String strIwg = dtVar.iwg();
            if (TextUtils.isEmpty(strIwg)) {
                return;
            }
            final int iHashCode = strIwg.hashCode();
            if (nmd.jd(dtVar)) {
                str = "landingpage_split_screen";
            } else if (nmd.cm(dtVar)) {
                str = "landingpage_direct";
            } else if (nmd.wqx(dtVar)) {
                str = "landingpage_split_ceiling";
            } else {
                str = "";
            }
            LinkedHashMap<Integer, SoftReference<jj>> linkedHashMap = this.my;
            if (linkedHashMap == null || !linkedHashMap.containsKey(Integer.valueOf(iHashCode))) {
                HashMap map = new HashMap();
                map.put(dtVar.afh(), dtVar);
                if (jrVarTu.jd() == 2) {
                    jd.jpo().jpo((Map<String, dt>) map, new jd.jpo() { // from class: com.bytedance.sdk.openadsdk.au.jpo.2
                        @Override // com.bytedance.sdk.openadsdk.qk.jd.jpo
                        public void jpo() {
                            jpo.this.jpo(iHashCode, dtVar, str, true);
                        }
                    }, true);
                    return;
                }
                if (jrVarTu.jd() == 1) {
                    jd.jpo().jpo((Map<String, dt>) map, (jd.jpo) null, true);
                    jpo(iHashCode, dtVar, str, true);
                } else if (jrVarTu.jd() == 0) {
                    jpo(iHashCode, dtVar, str, false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(final int i10, final dt dtVar, final String str, final boolean z10) {
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.au.jpo.3
            private my jpo(final jj jjVar, Cif cif) {
                my myVar = new my(sq.jpo(), null, dtVar.fc(), cif, true) { // from class: com.bytedance.sdk.openadsdk.au.jpo.3.3
                    @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
                    public void onPageFinished(WebView webView, String str2) {
                        jj jjVar2 = jjVar;
                        if (jjVar2 != null) {
                            jjVar2.setPreFinish(true);
                        }
                        super.onPageFinished(webView, str2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
                    public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                        jj jjVar2 = jjVar;
                        if (jjVar2 != null) {
                            jjVar2.setPreStart(true);
                        }
                        super.onPageStarted(webView, str2, bitmap);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
                    public void onReceivedError(WebView webView, int i11, String str2, String str3) {
                        String strCm = my.cm(str3);
                        boolean z11 = false;
                        boolean z12 = strCm != null && strCm.startsWith("image");
                        if (strCm != null && strCm.startsWith("mp4")) {
                            z11 = true;
                        }
                        if (!z12 && !z11 && !jjVar.wqx()) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            jpo.this.jpo(i10, 4, dtVar, str);
                        }
                        super.onReceivedError(webView, i11, str2, str3);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
                    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                        if (sslErrorHandler != null) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            jpo.this.jpo(i10, 4, dtVar, str);
                        }
                        super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                        try {
                            if (!z10) {
                                return super.shouldInterceptRequest(webView, str2);
                            }
                            jj jjVar2 = jjVar;
                            if (jjVar2 != null) {
                                jjVar2.jpo++;
                            }
                            WebResourceResponseModel webResourceResponseModelJpo = jd.jpo().jpo(jd.jpo().jd(), dtVar.afh(), str2);
                            if (webResourceResponseModelJpo != null && webResourceResponseModelJpo.getWebResourceResponse() != null) {
                                jj jjVar3 = jjVar;
                                if (jjVar3 != null) {
                                    jjVar3.f19072jd++;
                                }
                                return webResourceResponseModelJpo.getWebResourceResponse();
                            }
                            if (jjVar != null && webResourceResponseModelJpo != null && webResourceResponseModelJpo.getMsg() == 2) {
                                jjVar.wqx++;
                            }
                            return super.shouldInterceptRequest(webView, str2);
                        } catch (Throwable unused) {
                            return super.shouldInterceptRequest(webView, str2);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView, String str2) {
                        return super.shouldOverrideUrlLoading(webView, str2);
                    }
                };
                myVar.jpo(dtVar);
                myVar.jpo(str);
                return myVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 385
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.au.jpo.AnonymousClass3.run():void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(int i10, int i11, dt dtVar, String str) {
        LinkedHashMap<Integer, SoftReference<jj>> linkedHashMap = this.my;
        if (linkedHashMap != null && linkedHashMap.containsKey(Integer.valueOf(i10))) {
            this.my.remove(Integer.valueOf(i10));
        }
        Handler handler = this.f19475jd;
        if (handler != null) {
            handler.removeMessages(i10);
        }
        jpo(dtVar, str, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(jj jjVar, String str) {
        if (jjVar == null) {
            return;
        }
        wqx.jpo(sq.jpo()).jpo(false).jd(false).jpo(jjVar.getWebView());
        jjVar.setMixedContentMode(0);
        rq.jpo(jjVar, str);
    }

    public static void jpo(dt dtVar, String str, final float f10, String str2) {
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), dtVar, str, str2, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.au.jpo.4
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, f10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void jpo(dt dtVar, final String str, final int i10) {
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), dtVar, str, "web_delete_pre_render", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.au.jpo.5
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jpo() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("reason", i10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }
}
