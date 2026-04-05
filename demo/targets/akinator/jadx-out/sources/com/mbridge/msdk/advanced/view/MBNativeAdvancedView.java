package com.mbridge.msdk.advanced.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.widget.MBAdChoice;
import com.unity3d.ads.BuildConfig;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MBNativeAdvancedView extends RelativeLayout {

    /* renamed from: i, reason: collision with root package name */
    private static String f39616i = "MBAdvancedNativeView";

    /* renamed from: a, reason: collision with root package name */
    private MBNativeAdvancedWebview f39617a;

    /* renamed from: b, reason: collision with root package name */
    private View f39618b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f39619c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f39620d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f39621e;

    /* renamed from: f, reason: collision with root package name */
    MBAdChoice f39622f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.advanced.signal.b f39623g;

    /* renamed from: h, reason: collision with root package name */
    private Context f39624h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p0.a(MBNativeAdvancedView.f39616i, "webviewshow");
                String string = "";
                try {
                    int[] iArr = new int[2];
                    MBNativeAdvancedView.this.f39617a.getLocationOnScreen(iArr);
                    p0.b(MBNativeAdvancedView.f39616i, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", u0.b(c.m().d(), (float) iArr[0]));
                    jSONObject.put("startY", u0.b(c.m().d(), (float) iArr[1]));
                    string = jSONObject.toString();
                } catch (Throwable th2) {
                    p0.b(MBNativeAdvancedView.f39616i, th2.getMessage(), th2);
                }
                f.a().a((WebView) MBNativeAdvancedView.this.f39617a, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public MBNativeAdvancedView(Context context) {
        this(context, null);
    }

    private void b() {
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f39617a;
        if (mBNativeAdvancedWebview != null && mBNativeAdvancedWebview.getParent() == null) {
            addView(this.f39617a, new ViewGroup.LayoutParams(-1, -1));
        }
        c();
        View view = this.f39618b;
        if (view != null) {
            if (view.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(u0.a(getContext(), 28.0f), u0.a(getContext(), 16.0f));
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                layoutParams.rightMargin = u0.a(getContext(), 2.0f);
                layoutParams.topMargin = u0.a(getContext(), 2.0f);
                addView(this.f39618b, layoutParams);
            } else {
                bringChildToFront(this.f39618b);
            }
        }
        if (this.f39622f == null) {
            MBAdChoice mBAdChoice = new MBAdChoice(getContext());
            this.f39622f = mBAdChoice;
            mBAdChoice.setFeedbackDialogEventListener(new a());
        }
    }

    private void c() {
        int[] iArr = new int[2];
        this.f39617a.getLocationInWindow(iArr);
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f39617a;
        transInfoForMraid(mBNativeAdvancedWebview, iArr[0], iArr[1], mBNativeAdvancedWebview.getWidth(), this.f39617a.getHeight());
        MBNativeAdvancedWebview mBNativeAdvancedWebview2 = this.f39617a;
        if (mBNativeAdvancedWebview2 != null) {
            mBNativeAdvancedWebview2.setObject(this.f39623g);
            this.f39617a.post(new b());
        }
    }

    public static void transInfoForMraid(WebView webView, int i10, int i11, int i12, int i13) {
        p0.b(f39616i, "transInfoForMraid");
        try {
            int i14 = c.m().d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i14 == 2 ? "landscape" : i14 == 1 ? "portrait" : AdError.UNDEFINED_DOMAIN);
            jSONObject.put("locked", "true");
            float fN = l0.n(c.m().d());
            float fM = l0.m(c.m().d());
            HashMap mapV = l0.v(c.m().d());
            int iIntValue = ((Integer) mapV.get("width")).intValue();
            int iIntValue2 = ((Integer) mapV.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "inline");
            map.put("state", BuildConfig.FLAVOR);
            map.put("viewable", "true");
            map.put("currentAppOrientation", jSONObject);
            float f10 = i10;
            float f11 = i11;
            float f12 = i12;
            float f13 = i13;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, iIntValue, iIntValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, map);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView);
        } catch (Throwable th2) {
            p0.b(f39616i, "transInfoForMraid", th2);
        }
    }

    public void changeCloseBtnState(int i10) {
        View view = this.f39618b;
        if (view != null) {
            if (i10 == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.f39621e = false;
        this.f39620d = false;
        this.f39619c = false;
    }

    public void clearResStateAndRemoveClose() {
        clearResState();
        View view = this.f39618b;
        if (view != null && view.getParent() != null) {
            removeView(this.f39618b);
        }
        MBAdChoice mBAdChoice = this.f39622f;
        if (mBAdChoice == null || mBAdChoice.getParent() == null) {
            return;
        }
        removeView(this.f39622f);
    }

    public void destroy() {
        removeAllViews();
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f39617a;
        if (mBNativeAdvancedWebview != null && !mBNativeAdvancedWebview.isDestoryed()) {
            this.f39617a.release();
            com.mbridge.msdk.advanced.signal.a.a(this.f39617a, "onSystemDestory", "");
        }
        if (this.f39624h != null) {
            this.f39624h = null;
        }
    }

    public com.mbridge.msdk.advanced.signal.b getAdvancedNativeSignalCommunicationImpl() {
        return this.f39623g;
    }

    public MBNativeAdvancedWebview getAdvancedNativeWebview() {
        return this.f39617a;
    }

    public View getCloseView() {
        return this.f39618b;
    }

    public boolean isEndCardReady() {
        return this.f39621e;
    }

    public boolean isH5Ready() {
        return this.f39619c;
    }

    public boolean isVideoReady() {
        return this.f39620d;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void resetLoadState() {
        this.f39621e = false;
        this.f39620d = false;
        this.f39619c = false;
    }

    public void setAdChoiceCampaign(CampaignEx campaignEx) {
        MBAdChoice mBAdChoice = this.f39622f;
        if (mBAdChoice != null) {
            mBAdChoice.setCampaign(campaignEx);
            if (this.f39622f.getParent() != null) {
                bringChildToFront(this.f39622f);
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(com.google.android.gms.internal.play_billing.a.a(6.0f), com.google.android.gms.internal.play_billing.a.a(6.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            addView(this.f39622f, layoutParams);
        }
    }

    public void setAdvancedNativeSignalCommunicationImpl(com.mbridge.msdk.advanced.signal.b bVar) {
        this.f39623g = bVar;
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f39617a;
        if (mBNativeAdvancedWebview != null) {
            mBNativeAdvancedWebview.setObject(bVar);
        }
    }

    public void setAdvancedNativeWebview(MBNativeAdvancedWebview mBNativeAdvancedWebview) {
        this.f39617a = mBNativeAdvancedWebview;
        com.mbridge.msdk.advanced.signal.b bVar = this.f39623g;
        if (bVar != null) {
            mBNativeAdvancedWebview.setObject(bVar);
        }
    }

    public void setCloseView(View view) {
        this.f39618b = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setEndCardReady(boolean z10) {
        this.f39621e = z10;
    }

    public void setH5Ready(boolean z10) {
        this.f39619c = z10;
    }

    public void setVideoReady(boolean z10) {
        this.f39620d = z10;
    }

    public void show() {
        b();
        clearResState();
    }

    public MBNativeAdvancedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBNativeAdvancedView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39624h = context;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements com.mbridge.msdk.foundation.feedback.a {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (c.m().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b(MBNativeAdvancedView.f39616i, th2.getMessage(), th2);
                string = "";
            }
            f.a().a((WebView) MBNativeAdvancedView.this.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (c.m().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b(MBNativeAdvancedView.f39616i, th2.getMessage(), th2);
                string = "";
            }
            f.a().a((WebView) MBNativeAdvancedView.this.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (c.m().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b(MBNativeAdvancedView.f39616i, th2.getMessage(), th2);
                string = "";
            }
            f.a().a((WebView) MBNativeAdvancedView.this.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }
}
