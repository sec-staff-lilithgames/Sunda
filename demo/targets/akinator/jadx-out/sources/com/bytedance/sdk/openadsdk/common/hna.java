package com.bytedance.sdk.openadsdk.common;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.widget.jpo.jj;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hna {

    /* renamed from: cm, reason: collision with root package name */
    private final String f19721cm;

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.sdk.component.zz.jj f19722jd;

    /* renamed from: jj, reason: collision with root package name */
    private ImageView f19723jj;
    private final LinearLayout jpo;
    private final Context my;

    /* renamed from: qk, reason: collision with root package name */
    private ImageView f19724qk;
    private final dt wqx;
    private jj.jpo xyk;

    public hna(Context context, LinearLayout linearLayout, com.bytedance.sdk.component.zz.jj jjVar, dt dtVar, String str) {
        this.my = context;
        this.jpo = linearLayout;
        this.f19722jd = jjVar;
        this.wqx = dtVar;
        this.f19721cm = str;
        wqx();
    }

    private void wqx() {
        this.f19723jj = (ImageView) this.jpo.findViewById(com.bytedance.sdk.openadsdk.utils.hna.f21552tl);
        this.f19724qk = (ImageView) this.jpo.findViewById(com.bytedance.sdk.openadsdk.utils.hna.erj);
        ImageView imageView = (ImageView) this.jpo.findViewById(com.bytedance.sdk.openadsdk.utils.hna.f21556vk);
        ImageView imageView2 = (ImageView) this.jpo.findViewById(com.bytedance.sdk.openadsdk.utils.hna.f21534kb);
        this.f19723jj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.hna.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                if (hna.this.f19722jd == null || !hna.this.f19722jd.zz()) {
                    return;
                }
                if (hna.this.xyk != null) {
                    hna.this.xyk.jpo();
                }
                hna.this.jpo(ToolBar.BACKWARD);
                hna.this.f19722jd.yd();
            }
        });
        this.f19724qk.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.hna.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                if (hna.this.f19722jd == null || !hna.this.f19722jd.ju()) {
                    return;
                }
                hna.this.jpo(ToolBar.FORWARD);
                hna.this.f19722jd.m423if();
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.hna.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                if (hna.this.f19722jd != null) {
                    hna.this.jd(ToolBar.REFRESH);
                    hna.this.f19722jd.xyk();
                }
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.hna.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                if (hna.this.f19722jd != null) {
                    hna.this.jd("external_btn_click");
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = hna.this.f19722jd.getUrl();
                    if (TextUtils.isEmpty(url)) {
                        return;
                    }
                    intent.setData(Uri.parse(url));
                    com.bytedance.sdk.component.utils.jd.jpo(hna.this.my, intent, null);
                }
            }
        });
        this.jpo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.hna.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        this.f19723jj.setClickable(false);
        this.f19724qk.setClickable(false);
        ImageView imageView3 = this.f19723jj;
        int color = Color.parseColor("#A8FFFFFF");
        PorterDuff.Mode mode = PorterDuff.Mode.ADD;
        imageView3.setColorFilter(color, mode);
        this.f19724qk.setColorFilter(Color.parseColor("#A8FFFFFF"), mode);
    }

    public void jd() {
        if (this.jpo.getAlpha() == 1.0f) {
            ObjectAnimator.ofFloat(this.jpo, "alpha", 1.0f, 0.0f).setDuration(300L).start();
        }
    }

    public void jpo(WebView webView, jj.jpo jpoVar) {
        this.xyk = jpoVar;
        try {
            if (this.f19723jj != null) {
                if (webView.canGoBack()) {
                    this.f19723jj.setClickable(true);
                    this.f19723jj.clearColorFilter();
                } else {
                    this.f19723jj.setClickable(false);
                    this.f19723jj.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.f19724qk != null) {
                if (webView.canGoForward()) {
                    this.f19724qk.setClickable(true);
                    this.f19724qk.clearColorFilter();
                } else {
                    this.f19724qk.setClickable(false);
                    this.f19724qk.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(String str) throws JSONException {
        WebBackForwardList webBackForwardListCopyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f19722jd.getWebView() != null && (webBackForwardListCopyBackForwardList = this.f19722jd.getWebView().copyBackForwardList()) != null) {
                String url = webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex()).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.f19722jd.getUrl();
                }
                jSONObject.putOpt("url", url);
                jSONObject.putOpt("first_page", Integer.valueOf(webBackForwardListCopyBackForwardList.getCurrentIndex() == 0 ? 1 : 0));
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), this.wqx, this.f19721cm, str, jSONObject);
    }

    public void jpo() {
        if (this.jpo.getAlpha() == 0.0f) {
            ObjectAnimator.ofFloat(this.jpo, "alpha", 0.0f, 1.0f).setDuration(300L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(String str) throws JSONException {
        WebBackForwardList webBackForwardListCopyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f19722jd.getWebView() != null && (webBackForwardListCopyBackForwardList = this.f19722jd.getWebView().copyBackForwardList()) != null) {
                int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                String url = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.f19722jd.getUrl();
                }
                String url2 = "";
                if (str.equals(ToolBar.BACKWARD)) {
                    url2 = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex - 1).getUrl();
                }
                int i10 = 1;
                if (str.equals(ToolBar.FORWARD)) {
                    url2 = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex + 1).getUrl();
                }
                jSONObject.putOpt("url", url);
                jSONObject.putOpt("next_url", url2);
                if (webBackForwardListCopyBackForwardList.getCurrentIndex() != 0) {
                    i10 = 0;
                }
                jSONObject.putOpt("first_page", Integer.valueOf(i10));
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), this.wqx, this.f19721cm, str, jSONObject);
    }
}
