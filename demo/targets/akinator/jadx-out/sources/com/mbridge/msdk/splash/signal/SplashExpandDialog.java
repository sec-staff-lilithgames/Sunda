package com.mbridge.msdk.splash.signal;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.device.ads.DTBAdActivity;
import com.amazon.device.ads.MraidUseCustomCloseCommand;
import com.google.android.gms.ads.AdError;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.widget.MBAdChoice;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class SplashExpandDialog extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private final String f42970a;

    /* renamed from: b, reason: collision with root package name */
    private String f42971b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f42972c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f42973d;

    /* renamed from: e, reason: collision with root package name */
    private WindVaneWebView f42974e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f42975f;

    /* renamed from: g, reason: collision with root package name */
    private String f42976g;

    /* renamed from: h, reason: collision with root package name */
    private List<CampaignEx> f42977h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.splash.middle.a f42978i;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.mraid.b f42979j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SplashExpandDialog.this.dismiss();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements com.mbridge.msdk.foundation.feedback.a {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            SplashExpandDialog.this.a();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            SplashExpandDialog.this.a();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements DialogInterface.OnDismissListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (SplashExpandDialog.this.f42978i != null) {
                SplashExpandDialog.this.f42978i.a(false);
                SplashExpandDialog.this.f42978i.close();
            }
            SplashExpandDialog.this.f42974e.loadDataWithBaseURL(null, "", "text/html", G5.N, null);
            SplashExpandDialog.this.f42973d.removeView(SplashExpandDialog.this.f42974e);
            SplashExpandDialog.this.f42974e.release();
            SplashExpandDialog.this.f42974e = null;
            SplashExpandDialog.this.f42978i = null;
        }
    }

    public SplashExpandDialog(Context context, Bundle bundle, com.mbridge.msdk.splash.middle.a aVar) {
        super(context);
        this.f42970a = "SplashExpandDialog";
        this.f42979j = new e();
        if (bundle != null) {
            this.f42971b = bundle.getString("url");
            this.f42972c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f42978i = aVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        b();
    }

    public void setCampaignList(String str, List<CampaignEx> list) {
        this.f42976g = str;
        this.f42977h = list;
    }

    private void b() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f42973d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f42974e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f42973d.addView(this.f42974e);
        TextView textView = new TextView(getContext());
        this.f42975f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f42975f.setLayoutParams(layoutParams);
        this.f42975f.setVisibility(this.f42972c ? 4 : 0);
        this.f42975f.setOnClickListener(new a());
        this.f42973d.addView(this.f42975f);
        setContentView(this.f42973d);
        a();
        this.f42974e.setWebViewListener(new b());
        this.f42974e.setObject(this.f42979j);
        this.f42974e.loadUrl(this.f42971b);
        List<CampaignEx> list = this.f42977h;
        if (list != null && !list.isEmpty()) {
            CampaignEx campaignEx = this.f42977h.get(0);
            if (campaignEx != null) {
                a1.a(this.f42974e, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
            }
            if (campaignEx != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
                MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.m().d());
                mBAdChoice.setCampaign(campaignEx);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(com.google.android.gms.internal.play_billing.a.a(12.0f), com.google.android.gms.internal.play_billing.a.a(12.0f));
                layoutParams2.gravity = 85;
                layoutParams2.bottomMargin = layoutParams.topMargin;
                layoutParams2.rightMargin = layoutParams.rightMargin;
                mBAdChoice.setFeedbackDialogEventListener(new c());
                this.f42973d.addView(mBAdChoice, layoutParams2);
            }
        }
        BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.m().a(this.f42976g, 297);
        if (bitmapDrawableA != null) {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().d());
            u0.a(imageView, bitmapDrawableA, this.f42973d.getResources().getDisplayMetrics());
            this.f42973d.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        }
        setOnDismissListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            int i10 = com.mbridge.msdk.foundation.controller.c.m().d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i10 == 2 ? "landscape" : i10 == 1 ? "portrait" : AdError.UNDEFINED_DOMAIN);
            jSONObject.put("locked", "true");
            float fN = l0.n(com.mbridge.msdk.foundation.controller.c.m().d());
            float fM = l0.m(com.mbridge.msdk.foundation.controller.c.m().d());
            HashMap mapV = l0.v(com.mbridge.msdk.foundation.controller.c.m().d());
            int iIntValue = ((Integer) mapV.get("width")).intValue();
            int iIntValue2 = ((Integer) mapV.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "Interstitial");
            map.put("state", DTBAdActivity.EXPANDED);
            map.put("viewable", "true");
            map.put("currentAppOrientation", jSONObject);
            this.f42974e.getLocationInWindow(new int[2]);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f42974e, r0[0], r0[1], r11.getWidth(), this.f42974e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f42974e, r0[0], r0[1], r5.getWidth(), this.f42974e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f42974e, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f42974e, iIntValue, iIntValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f42974e, map);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f42974e);
        } catch (Throwable th2) {
            p0.b("SplashExpandDialog", "notifyMraid", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends com.mbridge.msdk.mbsignalcommon.listener.b {
        public b() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, String str) {
            super.a(webView, str);
            webView.evaluateJavascript("javascript:" + com.mbridge.msdk.setting.util.a.a().b(), new a());
            SplashExpandDialog.this.c();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements ValueCallback<String> {
            public a() {
            }

            @Override // android.webkit.ValueCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements com.mbridge.msdk.mbsignalcommon.mraid.b {
        public e() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void close() {
            SplashExpandDialog.this.dismiss();
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public CampaignEx getMraidCampaign() {
            return null;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void open(String str) {
            try {
                if (SplashExpandDialog.this.f42974e == null || System.currentTimeMillis() - SplashExpandDialog.this.f42974e.lastTouchTime <= com.mbridge.msdk.click.utils.a.f39821d || !com.mbridge.msdk.click.utils.a.a((CampaignEx) SplashExpandDialog.this.f42977h.get(0), SplashExpandDialog.this.f42974e.getUrl(), com.mbridge.msdk.click.utils.a.f39818a)) {
                    p0.b("SplashExpandDialog", str);
                    if (SplashExpandDialog.this.f42977h.size() > 1) {
                        com.mbridge.msdk.foundation.controller.c.m().d().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (SplashExpandDialog.this.f42978i != null) {
                        SplashExpandDialog.this.f42978i.a(true, str);
                    }
                }
            } catch (Throwable th2) {
                p0.b("SplashExpandDialog", "open", th2);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void unload() {
            close();
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void useCustomClose(boolean z10) {
            try {
                SplashExpandDialog.this.f42975f.setVisibility(z10 ? 4 : 0);
            } catch (Throwable th2) {
                p0.b("SplashExpandDialog", MraidUseCustomCloseCommand.NAME, th2);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void expand(String str, boolean z10) {
        }
    }
}
