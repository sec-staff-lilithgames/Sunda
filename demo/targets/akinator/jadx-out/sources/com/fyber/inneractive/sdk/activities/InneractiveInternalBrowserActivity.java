package com.fyber.inneractive.sdk.activities;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.o0;
import com.fyber.inneractive.sdk.util.v;
import com.ironsource.G5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import i2.hQ.aTNDubNmpwAqdU;
import j1.o2;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class InneractiveInternalBrowserActivity extends InneractiveBaseActivity {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";
    public static final String URL_EXTRA = "extra_url";

    /* renamed from: j, reason: collision with root package name */
    public static String f23035j;

    /* renamed from: k, reason: collision with root package name */
    public static InternalBrowserListener f23036k;

    /* renamed from: b, reason: collision with root package name */
    public x f23037b;

    /* renamed from: c, reason: collision with root package name */
    public String f23038c;

    /* renamed from: d, reason: collision with root package name */
    public LinearLayout f23039d;

    /* renamed from: e, reason: collision with root package name */
    public WebView f23040e;

    /* renamed from: f, reason: collision with root package name */
    public ImageButton f23041f;

    /* renamed from: g, reason: collision with root package name */
    public ImageButton f23042g;

    /* renamed from: h, reason: collision with root package name */
    public ImageButton f23043h;

    /* renamed from: i, reason: collision with root package name */
    public ImageButton f23044i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface InternalBrowserListener {
        void onApplicationInBackground();

        void onInternalBrowserDismissed();
    }

    public static void a(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity, com.fyber.inneractive.sdk.click.b bVar) throws JSONException {
        r rVar;
        x xVar = inneractiveInternalBrowserActivity.f23037b;
        InneractiveAdRequest inneractiveAdRequest = xVar != null ? xVar.f23944a : null;
        com.fyber.inneractive.sdk.response.e eVarB = xVar != null ? xVar.b() : null;
        x xVar2 = inneractiveInternalBrowserActivity.f23037b;
        JSONArray jSONArrayB = (xVar2 == null || (rVar = xVar2.f23946c) == null) ? null : rVar.b();
        u uVar = u.FYBER_SUCCESS_CLICK;
        w wVar = new w(eVarB);
        wVar.f24326c = uVar;
        wVar.f24324a = inneractiveAdRequest;
        wVar.f24327d = jSONArrayB;
        JSONObject jSONObject = new JSONObject();
        long j10 = bVar.f23164e;
        if (j10 != 0) {
            Object objValueOf = Long.valueOf(j10);
            try {
                jSONObject.put("time_passed", objValueOf);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "time_passed", objValueOf);
            }
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = bVar.f23165f.iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.click.j jVar = (com.fyber.inneractive.sdk.click.j) it.next();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("url", jVar.f23182a);
                jSONObject2.put("success", jVar.f23183b);
                jSONObject2.put("opened_by", jVar.f23184c);
                jSONObject2.put("reason", jVar.f23185d);
            } catch (Exception unused2) {
            }
            jSONArray.put(jSONObject2);
        }
        try {
            jSONObject.put("urls", jSONArray);
        } catch (Exception unused3) {
            IAlog.f("Got exception adding param to json object: %s, %s", "urls", jSONArray);
        }
        Object obj = com.fyber.inneractive.sdk.util.g.VIDEO_CTA;
        try {
            jSONObject.put("origin", obj);
        } catch (Exception unused4) {
            IAlog.f("Got exception adding param to json object: %s, %s", "origin", obj);
        }
        wVar.f24329f.put(jSONObject);
        wVar.a((String) null);
    }

    public static void disableWebviewZoomControls(WebView webView) {
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        new o0(webView).run();
    }

    public static void setHtmlExtra(String str) {
        f23035j = str;
    }

    public static void setInternalBrowserListener(InternalBrowserListener internalBrowserListener) {
        f23036k = internalBrowserListener;
    }

    @Override // android.app.Activity
    public void finish() {
        InternalBrowserListener internalBrowserListener = f23036k;
        super.finish();
        if (internalBrowserListener != null) {
            internalBrowserListener.onInternalBrowserDismissed();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws UnsupportedEncodingException {
        InneractiveAdSpot spot;
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        getWindow().addFlags(1024);
        super.onCreate(bundle);
        if (getActionBar() != null) {
            getActionBar().hide();
        }
        try {
            setContentView(a());
            String stringExtra = getIntent().getStringExtra("spotId");
            this.f23038c = stringExtra;
            if (!TextUtils.isEmpty(stringExtra) && (spot = InneractiveAdSpotManager.get().getSpot(this.f23038c)) != null) {
                this.f23037b = spot.getAdContent();
            }
            Intent intent = getIntent();
            WebSettings settings = this.f23040e.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            disableWebviewZoomControls(this.f23040e);
            this.f23040e.setWebChromeClient(new e(this));
            String stringExtra2 = intent.getStringExtra("extra_url");
            if (!TextUtils.isEmpty(f23035j)) {
                String strO = o2.o(new StringBuilder(), f23035j, "<title>DigitalTurbine Internal Browser</title>");
                f23035j = strO;
                this.f23040e.loadDataWithBaseURL(stringExtra2, strO, "text/html", C.UTF8_NAME, null);
            } else if (TextUtils.isEmpty(stringExtra2)) {
                IAlog.f("Empty url", new Object[0]);
                finish();
            } else if (!h0.d(stringExtra2)) {
                this.f23040e.loadUrl(stringExtra2);
            } else if (h0.c(stringExtra2)) {
                try {
                    stringExtra2 = URLDecoder.decode(stringExtra2, G5.N);
                    this.f23040e.loadUrl(stringExtra2);
                } catch (Exception unused) {
                    IAlog.f("Failed to open Url: %s", stringExtra2);
                    finish();
                }
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra2));
                intent2.addFlags(268435456);
                try {
                    startActivity(intent2);
                    InternalBrowserListener internalBrowserListener = f23036k;
                    if (internalBrowserListener != null) {
                        internalBrowserListener.onApplicationInBackground();
                    }
                } catch (ActivityNotFoundException unused2) {
                    IAlog.f("Failed to start activity for %s. Please ensure that your phone can handle this intent.", stringExtra2);
                }
                finish();
            }
            this.f23041f.setBackgroundColor(0);
            this.f23041f.setOnClickListener(new i(this));
            this.f23041f.setContentDescription("IABackButton");
            this.f23042g.setBackgroundColor(0);
            this.f23042g.setOnClickListener(new j(this));
            this.f23042g.setContentDescription("IAForwardButton");
            this.f23043h.setBackgroundColor(0);
            this.f23043h.setOnClickListener(new k(this));
            this.f23043h.setContentDescription("IARefreshButton");
            this.f23044i.setBackgroundColor(0);
            this.f23044i.setOnClickListener(new l(this));
            this.f23044i.setContentDescription("IACloseButton");
            com.fyber.inneractive.sdk.util.o.a();
            com.fyber.inneractive.sdk.util.o.f();
        } catch (Exception unused3) {
            finish();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        LinearLayout linearLayout = this.f23039d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        WebView webView = this.f23040e;
        if (webView != null) {
            webView.removeAllViews();
            v.a(this.f23040e);
            this.f23040e.destroy();
            this.f23040e = null;
        }
        super.onDestroy();
        setHtmlExtra(null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setVisible(false);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        com.fyber.inneractive.sdk.util.o.g();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        com.fyber.inneractive.sdk.util.o.f();
    }

    public final LinearLayout a() {
        this.f23039d = new LinearLayout(this);
        this.f23039d.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f23039d.setOrientation(1);
        this.f23039d.setContentDescription(aTNDubNmpwAqdU.IwFCgrttsHsSW);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f23039d.addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, com.fyber.inneractive.sdk.util.o.b(getResources().getInteger(R.integer.ia_ib_toolbar_height_dp)));
        layoutParams.addRule(12);
        linearLayout.setLayoutParams(layoutParams);
        com.fyber.inneractive.sdk.util.o.a(linearLayout, com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_background));
        relativeLayout.addView(linearLayout);
        this.f23041f = a(com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_left_arrow));
        this.f23042g = a(com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_right_arrow));
        this.f23043h = a(com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_refresh));
        this.f23044i = a(com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_close));
        linearLayout.addView(this.f23041f);
        linearLayout.addView(this.f23042g);
        linearLayout.addView(this.f23043h);
        linearLayout.addView(this.f23044i);
        WebView webView = new WebView(IAConfigManager.O.f23227v.a());
        this.f23040e = webView;
        webView.setWebViewClient(new f(this));
        this.f23040e.setId(R.id.ia_inneractive_webview_internal_browser);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, 1);
        this.f23040e.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.f23040e);
        return this.f23039d;
    }

    public final ImageButton a(Drawable drawable) {
        ImageButton imageButton = new ImageButton(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(com.fyber.inneractive.sdk.util.o.b(getResources().getInteger(R.integer.ia_ib_button_size_dp)), com.fyber.inneractive.sdk.util.o.b(getResources().getInteger(R.integer.ia_ib_button_size_dp)), 1.0f);
        layoutParams.gravity = 16;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setImageDrawable(drawable);
        return imageButton;
    }
}
