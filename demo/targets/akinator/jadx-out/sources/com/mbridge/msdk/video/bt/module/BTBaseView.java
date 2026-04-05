package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.a;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.video.bt.component.d;
import com.mbridge.msdk.videocommon.setting.c;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class BTBaseView extends FrameLayout {
    public static final String TAG = "BTBaseView";

    /* renamed from: n, reason: collision with root package name */
    protected static int f44195n = 0;

    /* renamed from: o, reason: collision with root package name */
    protected static int f44196o = 1;

    /* renamed from: a, reason: collision with root package name */
    protected Context f44197a;

    /* renamed from: b, reason: collision with root package name */
    protected CampaignEx f44198b;

    /* renamed from: c, reason: collision with root package name */
    protected String f44199c;

    /* renamed from: d, reason: collision with root package name */
    protected String f44200d;

    /* renamed from: e, reason: collision with root package name */
    protected c f44201e;

    /* renamed from: f, reason: collision with root package name */
    protected LayoutInflater f44202f;

    /* renamed from: g, reason: collision with root package name */
    protected int f44203g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f44204h;

    /* renamed from: i, reason: collision with root package name */
    protected float f44205i;

    /* renamed from: j, reason: collision with root package name */
    protected float f44206j;

    /* renamed from: k, reason: collision with root package name */
    protected Rect f44207k;

    /* renamed from: l, reason: collision with root package name */
    protected int f44208l;

    /* renamed from: m, reason: collision with root package name */
    protected int f44209m;

    public BTBaseView(Context context) {
        this(context, null);
    }

    public JSONObject a(int i10) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e10) {
            e = e10;
        }
        try {
            jSONObject.put(a.f40711h, u0.b(com.mbridge.msdk.foundation.controller.c.m().d(), this.f44205i));
            jSONObject.put(a.f40712i, u0.b(com.mbridge.msdk.foundation.controller.c.m().d(), this.f44206j));
            jSONObject.put(a.f40716m, i10);
            try {
                this.f44203g = getContext().getResources().getConfiguration().orientation;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            jSONObject.put(a.f40714k, this.f44203g);
            jSONObject.put(a.f40715l, u0.d(getContext()));
            return jSONObject;
        } catch (JSONException e12) {
            e = e12;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            return jSONObject2;
        }
    }

    public void defaultShow() {
        p0.a(TAG, "defaultShow");
    }

    public int findColor(String str) {
        return h0.a(this.f44197a.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return h0.a(this.f44197a.getApplicationContext(), str, "drawable");
    }

    public int findID(String str) {
        return h0.a(this.f44197a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return h0.a(this.f44197a.getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    public CampaignEx getCampaign() {
        return this.f44198b;
    }

    public String getInstanceId() {
        return this.f44200d;
    }

    public FrameLayout.LayoutParams getParentFrameLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public LinearLayout.LayoutParams getParentLinearLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public RelativeLayout.LayoutParams getParentRelativeLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            return (RelativeLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public Rect getRect() {
        return this.f44207k;
    }

    public String getUnitId() {
        return this.f44199c;
    }

    public int getViewHeight() {
        return this.f44209m;
    }

    public int getViewWidth() {
        return this.f44208l;
    }

    public abstract void init(Context context);

    public boolean isLandscape() {
        return this.f44197a.getResources().getConfiguration().orientation == 2;
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < length) {
            if (viewArr[i10] == null) {
                return false;
            }
            i10++;
            z10 = true;
        }
        return z10;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.f44203g = configuration.orientation;
        super.onConfigurationChanged(configuration);
    }

    public abstract void onDestory();

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f44205i = motionEvent.getRawX();
        this.f44206j = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f44203g = configuration.orientation;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f44198b = campaignEx;
    }

    public void setInstanceId(String str) {
        this.f44200d = str;
    }

    public void setLayout(int i10, int i11) {
        this.f44208l = i10;
        this.f44209m = i11;
    }

    public void setLayoutCenter(int i10, int i11) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.addRule(13);
            if (i10 != -999) {
                parentRelativeLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentRelativeLayoutParams.height = i11;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.gravity = 17;
            if (i10 != -999) {
                parentLinearLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentLinearLayoutParams.height = i11;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.gravity = 17;
            if (i10 != -999) {
                parentFrameLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentFrameLayoutParams.height = i11;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setLayoutParam(int i10, int i11, int i12, int i13) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i11;
            parentRelativeLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentRelativeLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentRelativeLayoutParams.height = i13;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.topMargin = i11;
            parentLinearLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentLinearLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentLinearLayoutParams.height = i13;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.topMargin = i11;
            parentFrameLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentFrameLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentFrameLayoutParams.height = i13;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setRect(Rect rect) {
        this.f44207k = rect;
    }

    public void setRewardUnitSetting(c cVar) {
        this.f44201e = cVar;
    }

    public void setUnitId(String str) {
        this.f44199c = str;
    }

    public void setWrapContent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        } else {
            layoutParams.height = -2;
            layoutParams.width = -2;
        }
    }

    public BTBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44200d = "";
        this.f44203g = 1;
        this.f44204h = false;
        this.f44197a = context;
        this.f44202f = LayoutInflater.from(context);
        init(context);
    }

    public static void a(WebView webView, String str, String str2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f44195n);
            jSONObject.put("id", str2);
            jSONObject.put("data", new JSONObject());
            f.a().a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            d.c().a(webView, e10.getMessage());
            p0.a(TAG, e10.getMessage());
        }
    }

    public void b() {
    }
}
