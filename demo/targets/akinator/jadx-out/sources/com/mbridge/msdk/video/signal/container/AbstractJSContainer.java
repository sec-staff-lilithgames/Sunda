package com.mbridge.msdk.video.signal.container;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.video.signal.b;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.factory.a;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.video.signal.j;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.setting.c;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class AbstractJSContainer extends FrameLayout implements IJSFactory {

    /* renamed from: a, reason: collision with root package name */
    private int f45166a;

    /* renamed from: b, reason: collision with root package name */
    private int f45167b;

    /* renamed from: c, reason: collision with root package name */
    protected Activity f45168c;

    /* renamed from: d, reason: collision with root package name */
    protected String f45169d;

    /* renamed from: e, reason: collision with root package name */
    protected String f45170e;

    /* renamed from: f, reason: collision with root package name */
    protected c f45171f;

    /* renamed from: g, reason: collision with root package name */
    protected String f45172g;

    /* renamed from: h, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.entity.c f45173h;

    /* renamed from: i, reason: collision with root package name */
    protected String f45174i;

    /* renamed from: j, reason: collision with root package name */
    protected int f45175j;

    /* renamed from: k, reason: collision with root package name */
    protected boolean f45176k;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f45177l;

    /* renamed from: m, reason: collision with root package name */
    protected int f45178m;

    /* renamed from: n, reason: collision with root package name */
    protected int f45179n;

    /* renamed from: o, reason: collision with root package name */
    protected int f45180o;

    /* renamed from: p, reason: collision with root package name */
    protected boolean f45181p;

    /* renamed from: q, reason: collision with root package name */
    protected IJSFactory f45182q;

    public AbstractJSContainer(Context context) {
        super(context);
        this.f45166a = 0;
        this.f45167b = 1;
        this.f45175j = 2;
        this.f45176k = false;
        this.f45177l = false;
        this.f45181p = false;
        this.f45182q = new a();
    }

    private boolean i(int i10) {
        try {
            if (i10 == 1) {
                this.f45168c.setRequestedOrientation(12);
            } else {
                if (i10 != 2) {
                    return false;
                }
                this.f45168c.setRequestedOrientation(11);
            }
            return true;
        } catch (Throwable th2) {
            p0.b("AbstractJSContainer", th2.getMessage(), th2);
            return false;
        }
    }

    public void a(Object obj) {
        f.a().b(obj, h(this.f45166a));
    }

    public void b(Object obj, String str) {
        f.a().b(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public b getActivityProxy() {
        return this.f45182q.getActivityProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        return this.f45182q.getIJSRewardVideoV1();
    }

    public String getInnerPlacementId() {
        c cVar;
        return (!TextUtils.isEmpty(this.f45170e) || (cVar = this.f45171f) == null || TextUtils.isEmpty(cVar.t())) ? this.f45170e : this.f45171f.t();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.c getJSBTModule() {
        return this.f45182q.getJSBTModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        return this.f45182q.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.f getJSContainerModule() {
        return this.f45182q.getJSContainerModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        return this.f45182q.getJSNotifyProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        return this.f45182q.getJSVideoModule();
    }

    public String getPlacementId() {
        return this.f45170e;
    }

    public String getUnitId() {
        return this.f45169d;
    }

    public String h(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            p0.b("AbstractJSContainer", "code to string is error");
            return "";
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (getJSCommon().a()) {
            getActivityProxy().a(configuration);
        }
    }

    public void onDestroy() {
        if (getJSCommon().a()) {
            getActivityProxy().b();
        }
    }

    public void onPause() {
        if (getJSCommon().a()) {
            getActivityProxy().g();
        }
        getActivityProxy().a(1);
    }

    public void onRestart() {
        if (getJSCommon().a()) {
            getActivityProxy().f();
        }
        getActivityProxy().a(4);
    }

    public void onResume() {
        if (com.mbridge.msdk.foundation.feedback.b.f40664f) {
            return;
        }
        if (getJSCommon().a()) {
            getActivityProxy().d();
        }
        getActivityProxy().a(0);
    }

    public void onStart() {
        if (getJSCommon().a()) {
            getActivityProxy().h();
        }
        getActivityProxy().a(2);
    }

    public void onStop() {
        if (getJSCommon().a()) {
            getActivityProxy().c();
        }
        getActivityProxy().a(3);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.f45182q = iJSFactory;
    }

    public void setActivity(Activity activity) {
        this.f45168c = activity;
    }

    public void setBidCampaign(boolean z10) {
        this.f45177l = z10;
    }

    public void setBigOffer(boolean z10) {
        this.f45181p = z10;
    }

    public void setIV(boolean z10) {
        this.f45176k = z10;
    }

    public void setIVRewardEnable(int i10, int i11, int i12) {
        this.f45178m = i10;
        this.f45179n = i11;
        this.f45180o = i12;
    }

    public void setMute(int i10) {
        this.f45175j = i10;
    }

    public void setPlacementId(String str) {
        this.f45170e = str;
    }

    public void setReward(com.mbridge.msdk.videocommon.entity.c cVar) {
        this.f45173h = cVar;
    }

    public void setRewardId(String str) {
        this.f45174i = str;
    }

    public void setRewardUnitSetting(c cVar) {
        this.f45171f = cVar;
    }

    public void setUnitId(String str) {
        this.f45169d = str;
    }

    public void setUserId(String str) {
        this.f45172g = str;
    }

    public void a(Object obj, String str) {
        f.a().a(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    public void b(String str) {
        p0.b("AbstractJSContainer", str);
        Activity activity = this.f45168c;
        if (activity != null) {
            activity.finish();
        }
    }

    public int a(CampaignEx campaignEx) {
        k kVarB = b(campaignEx);
        if (kVarB != null) {
            return kVarB.n();
        }
        return 0;
    }

    public void a(c cVar, CampaignEx campaignEx) {
        CampaignEx.c rewardTemplateMode;
        if (a(campaignEx) == 1) {
            return;
        }
        if (((campaignEx == null || (rewardTemplateMode = campaignEx.getRewardTemplateMode()) == null) ? false : i(rewardTemplateMode.b())) || cVar == null) {
            return;
        }
        i(this.f45171f.y());
    }

    public k b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        a.C0355a c0355aA = com.mbridge.msdk.videocommon.a.a(this.f45176k ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, campaignEx);
        if (c0355aA != null && c0355aA.c()) {
            WindVaneWebView windVaneWebViewB = c0355aA.b();
            if (windVaneWebViewB.getObject() instanceof k) {
                return (k) windVaneWebViewB.getObject();
            }
        }
        return null;
    }

    public AbstractJSContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45166a = 0;
        this.f45167b = 1;
        this.f45175j = 2;
        this.f45176k = false;
        this.f45177l = false;
        this.f45181p = false;
        this.f45182q = new com.mbridge.msdk.video.signal.factory.a();
    }
}
