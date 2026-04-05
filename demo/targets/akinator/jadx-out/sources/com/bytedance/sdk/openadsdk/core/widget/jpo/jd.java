package com.bytedance.sdk.openadsdk.core.widget.jpo;

import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.jr;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements jpo {

    /* renamed from: cm, reason: collision with root package name */
    private final MessageQueue f20902cm;

    /* renamed from: jd, reason: collision with root package name */
    private com.bytedance.sdk.component.zz.jj f20903jd;
    ef jpo;
    private final boolean my;
    private final AtomicInteger wqx;

    public jd(int i10, boolean z10, MessageQueue messageQueue) {
        this.wqx = new AtomicInteger(i10);
        this.my = z10;
        this.f20902cm = messageQueue;
    }

    private void jpo(com.bytedance.sdk.component.zz.jj jjVar) {
        if (jjVar == null || jjVar.getWebView() == null) {
            return;
        }
        try {
            wqx.jpo(sq.jpo()).jpo(false).jpo(jjVar.getWebView());
            jjVar.setVerticalScrollBarEnabled(false);
            jjVar.setHorizontalScrollBarEnabled(false);
            wqx.jpo(jjVar);
            jjVar.oya();
            jjVar.setUserAgentString(jr.jpo(jjVar.getWebView(), BuildConfig.VERSION_CODE));
            jjVar.setMixedContentMode(0);
            jjVar.setJavaScriptEnabled(true);
            jjVar.setJavaScriptCanOpenWindowsAutomatically(true);
            jjVar.setDomStorageEnabled(true);
            jjVar.setDatabaseEnabled(true);
            jjVar.setCacheMode(-1);
            jjVar.setAllowFileAccess(false);
            jjVar.setSupportZoom(true);
            jjVar.setBuiltInZoomControls(true);
            jjVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            jjVar.setUseWideViewPort(true);
        } catch (Throwable th2) {
            nmd.wqx("WebViewPool", th2.toString());
        }
    }

    public void jd() {
        if (this.wqx.get() <= 0) {
            return;
        }
        Objects.toString(this.wqx);
        String strCm = com.bytedance.sdk.component.adexpress.jpo.jd.jd.cm(null);
        if (this.my) {
            String strCm2 = com.bytedance.sdk.component.adexpress.jpo.jd.jd.cm("v3");
            if (strCm != null && strCm.equals(strCm2)) {
                return;
            } else {
                strCm = strCm2;
            }
        }
        if (TextUtils.isEmpty(strCm)) {
            return;
        }
        try {
            com.bytedance.sdk.component.zz.jj jjVar = new com.bytedance.sdk.component.zz.jj(new MutableContextWrapper(sq.jpo()));
            this.f20903jd = jjVar;
            if (jjVar.getWebView() == null) {
                return;
            }
            this.f20903jd.setWebViewClient(new WebViewClient() { // from class: com.bytedance.sdk.openadsdk.core.widget.jpo.jd.1
                @Override // android.webkit.WebViewClient
                public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    return true;
                }
            });
            jpo(this.f20903jd);
            Uri uriBuild = Uri.parse(strCm).buildUpon().appendQueryParameter("isPreLoad", "1").build();
            ef efVar = new ef(this.f20903jd.getContext());
            this.jpo = efVar;
            efVar.jd(this.f20903jd).jpo(this).jpo(this.f20903jd);
            com.bytedance.sdk.component.adexpress.my.my.jpo().jpo(this.f20903jd, this.jpo);
            this.f20903jd.a_(uriBuild.toString());
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.jpo
    public void jpo() {
        MessageQueue messageQueue;
        if (this.my) {
            com.bytedance.sdk.component.adexpress.my.my.jpo().jd(this.f20903jd);
        } else {
            com.bytedance.sdk.component.adexpress.my.my.jpo().wqx(this.f20903jd);
        }
        try {
            this.wqx.get();
            this.wqx.decrementAndGet();
            if (this.wqx.get() <= 0 || (messageQueue = this.f20902cm) == null) {
                return;
            }
            messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.widget.jpo.jd.2
                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    new jd(jd.this.wqx.get(), jd.this.my, jd.this.f20902cm).jd();
                    return false;
                }
            });
        } catch (Exception e10) {
            e10.getMessage();
        }
    }
}
