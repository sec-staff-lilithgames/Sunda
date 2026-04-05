package com.bytedance.sdk.openadsdk.activity;

import a.b;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import b0.e2;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.utils.opi;
import com.bytedance.sdk.component.zz.jj;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.sq;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.pdm;
import com.bytedance.sdk.openadsdk.core.tic;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.ju;
import com.bytedance.sdk.openadsdk.utils.va;
import com.unity3d.services.core.request.NJc.yFkbx;
import java.net.URLEncoder;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class TTWebsiteActivity extends TTBaseActivity {

    /* renamed from: jd, reason: collision with root package name */
    private sq f19290jd;
    private String jpo = null;
    private WebView wqx;

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        tic.jpo(this.wqx);
        super.onDestroy();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String strCm;
        String str;
        String str2;
        dt dtVar;
        String stringExtra;
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.core.sq.jd(getApplicationContext());
        if (!oya.my()) {
            finish();
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            stringExtra = getIntent().getStringExtra("_extra_meta");
            String stringExtra2 = getIntent().getStringExtra("_extra_glo_d");
            String stringExtra3 = getIntent().getStringExtra("_privacy_url");
            strCm = getIntent().getStringExtra("_privacy_title");
            str = stringExtra3;
            str2 = stringExtra2;
            dtVar = null;
        } else {
            dt dtVarJpo = pdm.jpo().jpo(pdm.jpo(getIntent()));
            if (dtVarJpo == null) {
                finish();
                return;
            }
            String strHmu = dtVarJpo.hmu();
            String strWqx = dtVarJpo.mb().wqx();
            strCm = dtVarJpo.mb().cm();
            str = strWqx;
            str2 = strHmu;
            dtVar = dtVarJpo;
            stringExtra = null;
        }
        if (TextUtils.isEmpty(str)) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(this);
        if (Build.VERSION.SDK_INT >= 35) {
            myVar.setFitsSystemWindows(true);
        }
        myVar.setBackgroundColor(-1);
        myVar.setId(520093726);
        myVar.setOrientation(1);
        myVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(myVar);
            int iJd = va.jd(this, 5.0f);
            int iJd2 = va.jd(this, 8.0f);
            int iJd3 = va.jd(this, 10.0f);
            int iJd4 = va.jd(this, 12.0f);
            int iJd5 = va.jd(this, 14.0f);
            int iJd6 = va.jd(this, 20.0f);
            int iJd7 = va.jd(this, 24.0f);
            int iJd8 = va.jd(this, 40.0f);
            int iJd9 = va.jd(this, 44.0f);
            String str3 = str2;
            int iJd10 = va.jd(this, 191.0f);
            String str4 = str;
            com.bytedance.sdk.openadsdk.core.jj.qk qkVar = new com.bytedance.sdk.openadsdk.core.jj.qk(this);
            final String str5 = stringExtra;
            qkVar.setGravity(15);
            final dt dtVar2 = dtVar;
            qkVar.setLayoutParams(new LinearLayout.LayoutParams(-1, iJd9));
            com.bytedance.sdk.openadsdk.core.jj.cm cmVar = new com.bytedance.sdk.openadsdk.core.jj.cm(this);
            cmVar.setId(520093720);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iJd8, iJd9);
            layoutParams.setMarginStart(iJd2);
            cmVar.setLayoutParams(layoutParams);
            cmVar.setClickable(true);
            cmVar.setFocusable(true);
            cmVar.setPadding(iJd5, iJd4, iJd5, iJd4);
            cmVar.setImageDrawable(com.bytedance.sdk.component.utils.dt.wqx(this, "tt_ad_arrow_backward"));
            final com.bytedance.sdk.openadsdk.core.jj.cm cmVar2 = new com.bytedance.sdk.openadsdk.core.jj.cm(this);
            String str6 = strCm;
            cmVar2.setId(520093716);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iJd8, iJd9);
            layoutParams2.addRule(17, 520093720);
            cmVar2.setLayoutParams(layoutParams2);
            cmVar2.setClickable(true);
            cmVar2.setFocusable(true);
            cmVar2.setPadding(iJd4, iJd5, iJd4, iJd5);
            cmVar2.setImageDrawable(com.bytedance.sdk.component.utils.dt.wqx(this, "tt_ad_xmark"));
            com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(this);
            xykVar.setId(hna.f21549sg);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iJd10, iJd7);
            layoutParams3.setMarginStart(iJd);
            layoutParams3.addRule(15);
            layoutParams3.addRule(16, 520093741);
            layoutParams3.addRule(17, 520093716);
            xykVar.setLayoutParams(layoutParams3);
            xykVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            xykVar.setGravity(17);
            xykVar.setSingleLine(true);
            xykVar.setTextColor(Color.parseColor("#222222"));
            xykVar.setTextSize(17.0f);
            com.bytedance.sdk.openadsdk.core.jj.cm cmVar3 = new com.bytedance.sdk.openadsdk.core.jj.cm(this);
            cmVar3.setId(520093741);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iJd8, iJd9);
            layoutParams4.addRule(16, 520093742);
            cmVar3.setLayoutParams(layoutParams4);
            cmVar3.setPadding(iJd3, iJd4, iJd3, iJd4);
            cmVar3.setImageDrawable(com.bytedance.sdk.component.utils.dt.wqx(this, "tt_ad_link"));
            com.bytedance.sdk.openadsdk.core.jj.cm cmVar4 = new com.bytedance.sdk.openadsdk.core.jj.cm(this);
            cmVar4.setId(520093742);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(iJd8, iJd9);
            layoutParams5.addRule(21);
            layoutParams5.setMarginEnd(iJd2);
            cmVar4.setLayoutParams(layoutParams5);
            cmVar4.setPadding(iJd4, iJd6, iJd4, iJd6);
            cmVar4.setImageDrawable(com.bytedance.sdk.component.utils.dt.wqx(this, "tt_ad_threedots"));
            final com.bytedance.sdk.openadsdk.core.jj.jj jjVar = new com.bytedance.sdk.openadsdk.core.jj.jj(this, null, R.style.Widget.ProgressBar.Horizontal);
            jjVar.setId(520093743);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, va.jd(this, 2.0f));
            layoutParams6.addRule(12);
            jjVar.setLayoutParams(layoutParams6);
            jjVar.setProgress(1);
            jjVar.setProgressDrawable(ju.jpo(this, "tt_privacy_progress_style"));
            View view = new View(this);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, va.jd(this, 1.0f));
            layoutParams7.addRule(12);
            view.setLayoutParams(layoutParams7);
            qkVar.addView(cmVar);
            qkVar.addView(cmVar2);
            qkVar.addView(xykVar);
            qkVar.addView(cmVar3);
            qkVar.addView(cmVar4);
            qkVar.addView(jjVar);
            qkVar.addView(view);
            myVar.addView(qkVar);
            try {
                WebView webView = new WebView(getApplicationContext());
                this.wqx = webView;
                webView.setBackgroundColor(-1);
                myVar.addView(this.wqx, new ViewGroup.LayoutParams(-1, -1));
                cmVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.wqx.canGoBack()) {
                            TTWebsiteActivity.this.wqx.goBack();
                        } else {
                            TTWebsiteActivity.this.finish();
                        }
                    }
                });
                cmVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.this.finish();
                    }
                });
                cmVar2.setVisibility(4);
                cmVar2.setClickable(false);
                if (!TextUtils.isEmpty(str6)) {
                    xykVar.setText(str6);
                }
                cmVar3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        String url = TTWebsiteActivity.this.wqx.getUrl();
                        if (TextUtils.isEmpty(url)) {
                            return;
                        }
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.jd.jpo(TTWebsiteActivity.this, intent, null);
                    }
                });
                cmVar4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.f19290jd == null) {
                            TTWebsiteActivity.this.f19290jd = new sq(TTWebsiteActivity.this);
                            TTWebsiteActivity.this.f19290jd.jpo(str5, dtVar2);
                            TTWebsiteActivity.this.f19290jd.setCanceledOnTouchOutside(false);
                        }
                        TTWebsiteActivity.this.f19290jd.show();
                    }
                });
                this.jpo = str4;
                if (!TextUtils.isEmpty(str3)) {
                    String strEncode = URLEncoder.encode(str3);
                    if (this.jpo.contains("?")) {
                        this.jpo = b.o(new StringBuilder(), this.jpo, "&gdid_encrypted=", strEncode);
                    } else {
                        this.jpo = b.o(new StringBuilder(), this.jpo, "?gdid_encrypted=", strEncode);
                    }
                }
                if (this.jpo == null) {
                    finish();
                    return;
                }
                WebSettings settings = this.wqx.getSettings();
                settings.setMixedContentMode(0);
                try {
                    settings.setJavaScriptEnabled(true);
                    settings.setDomStorageEnabled(true);
                    settings.setSavePassword(false);
                    settings.setAllowFileAccess(false);
                } catch (Throwable unused) {
                }
                try {
                    this.wqx.loadUrl(this.jpo, e2.s("Referer", TTAdConstant.REQUEST_HEAD_REFERER));
                } catch (Throwable unused2) {
                    this.wqx.loadUrl(this.jpo);
                }
                this.wqx.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.5
                    @Override // android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView2, int i10) {
                        super.onProgressChanged(webView2, i10);
                        if (jjVar == null || TTWebsiteActivity.this.isFinishing()) {
                            return;
                        }
                        if (i10 != 100) {
                            jjVar.setVisibility(0);
                            jjVar.setProgress(i10);
                            return;
                        }
                        jjVar.setVisibility(8);
                        if (webView2.canGoBack()) {
                            cmVar2.setVisibility(0);
                            cmVar2.setClickable(true);
                        } else {
                            cmVar2.setVisibility(4);
                            cmVar2.setClickable(false);
                        }
                    }
                });
                this.wqx.setWebViewClient(new jj.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.6
                    @Override // android.webkit.WebViewClient
                    public void onPageFinished(WebView webView2, String str7) {
                        super.onPageFinished(webView2, str7);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView2, webResourceRequest, webResourceError);
                        webResourceError.getErrorCode();
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                        Objects.toString(webResourceResponse);
                    }

                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView2, String str7) {
                        try {
                            Uri uri = Uri.parse(str7);
                            if (!opi.jpo(str7)) {
                                try {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    intent.setData(uri);
                                    intent.addFlags(268435456);
                                    com.bytedance.sdk.component.utils.jd.jpo(TTWebsiteActivity.this, intent, null);
                                    return true;
                                } catch (Throwable unused3) {
                                    return true;
                                }
                            }
                        } catch (Throwable unused4) {
                        }
                        return super.shouldOverrideUrlLoading(webView2, str7);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView2, int i10, String str7, String str8) {
                        super.onReceivedError(webView2, i10, str7, str8);
                    }
                });
                com.bytedance.sdk.openadsdk.core.widget.jpo.wqx.jd(this.wqx);
            } catch (Exception e10) {
                nmd.jpo(yFkbx.KhTP, "onCreate: ", e10);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    public static void jpo(Context context, dt dtVar, String str) {
        if (context == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), dtVar, str, "open_policy");
        if (TextUtils.isEmpty(dtVar.mb().wqx())) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) TTWebsiteActivity.class);
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            intent.putExtra("_extra_meta", dtVar.xfa().toString());
            intent.putExtra("_extra_glo_d", dtVar.hmu());
            intent.putExtra("_privacy_url", dtVar.mb().wqx());
            intent.putExtra("_privacy_title", dtVar.mb().cm());
        } else {
            intent.putExtra("meta_index", pdm.jpo().jpo(dtVar));
        }
        com.bytedance.sdk.component.utils.jd.jpo(context, intent, null);
    }
}
