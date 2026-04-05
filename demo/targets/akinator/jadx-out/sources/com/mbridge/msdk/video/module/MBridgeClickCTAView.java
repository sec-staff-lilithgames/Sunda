package com.mbridge.msdk.video.module;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.video.dynview.listener.h;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MBridgeClickCTAView extends MBridgeClickCTAViewDiff {
    public f ctaClickCallBack;

    /* renamed from: m, reason: collision with root package name */
    private ViewGroup f44623m;

    /* renamed from: n, reason: collision with root package name */
    private ImageView f44624n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f44625o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f44626p;

    /* renamed from: q, reason: collision with root package name */
    private String f44627q;

    /* renamed from: r, reason: collision with root package name */
    private float f44628r;

    /* renamed from: s, reason: collision with root package name */
    private float f44629s;

    /* renamed from: t, reason: collision with root package name */
    private int f44630t;

    /* renamed from: u, reason: collision with root package name */
    private ObjectAnimator f44631u;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends com.mbridge.msdk.widget.a {
        public b() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) throws JSONException {
            MBridgeClickCTAView.this.getClass();
            MBridgeClickCTAView.this.e();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends com.mbridge.msdk.widget.a {
        public c() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) throws JSONException {
            MBridgeClickCTAView.this.getClass();
            MBridgeClickCTAView.this.e();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e extends com.mbridge.msdk.video.module.listener.impl.e {
        public e(ImageView imageView, CampaignEx campaignEx, String str) {
            super(imageView, campaignEx, str);
        }

        @Override // com.mbridge.msdk.video.module.listener.impl.e, com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            super.onFailedLoad(str, str2);
            MBridgeClickCTAView.this.g();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface f {
    }

    public MBridgeClickCTAView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() throws JSONException {
        JSONObject jSONObject;
        CampaignEx campaignEx = this.f44612b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.c rewardTemplateMode = this.f44612b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.f() + "";
                }
                j.a(com.mbridge.msdk.foundation.controller.c.m().d(), "cta_click", this.f44612b.getCampaignUnitId(), this.f44612b.isBidCampaign(), this.f44612b.getRequestId(), this.f44612b.getRequestIdNotice(), this.f44612b.getId(), str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.mbridge.msdk.foundation.same.a.f40713j, a(0));
            } catch (JSONException e11) {
                e = e11;
                e.printStackTrace();
                this.f44612b.setTriggerClickSource(1);
                this.f44612b.setClickTempSource(1);
                this.notifyListener.a(105, jSONObject);
            }
        } catch (JSONException e12) {
            e = e12;
            jSONObject = null;
        }
        this.f44612b.setTriggerClickSource(1);
        this.f44612b.setClickTempSource(1);
        this.notifyListener.a(105, jSONObject);
    }

    private void f() {
        int iFindLayout = findLayout("mbridge_reward_clickable_cta");
        if (h0.a(iFindLayout)) {
            this.f44613c.inflate(iFindLayout, this);
            this.f44615e = h();
            d();
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        ImageView imageView = this.f44624n;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        this.f44623m = (ViewGroup) findViewById(findID("mbridge_viewgroup_ctaroot"));
        this.f44624n = (ImageView) findViewById(findID("mbridge_iv_appicon"));
        this.f44625o = (TextView) findViewById(findID("mbridge_tv_title"));
        TextView textView = (TextView) findViewById(findID("mbridge_tv_install"));
        this.ctaTv = textView;
        return isNotNULL(this.f44623m, this.f44624n, this.f44625o, textView);
    }

    private void i() {
        setWrapContent();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void d() {
        super.d();
        if (this.f44615e) {
            CampaignEx campaignEx = this.f44612b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                a1.a(this, this.f44612b.getLocalRequestId(), this.f44612b.getLocalAllowTrackClick());
                setOnClickListener(new b());
            }
            CampaignEx campaignEx2 = this.f44612b;
            if (campaignEx2 != null) {
                a1.a(this.ctaTv, campaignEx2.getLocalRequestId(), this.f44612b.getLocalAllowTrackClick());
            }
            this.ctaTv.setOnClickListener(new c());
            ImageView imageView = this.f44624n;
            if (imageView != null) {
                imageView.setOnClickListener(new d());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f44631u;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f44631u;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f44628r = motionEvent.getRawX();
        this.f44629s = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f44630t = configuration.orientation;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeClickCTAViewDiff
    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        CampaignEx campaignEx = this.f44612b;
        if (campaignEx != null) {
            if (campaignEx.isDynamicView()) {
                a(this, this.f44612b);
            } else {
                f();
            }
            if (this.f44615e) {
                if (com.mbridge.msdk.util.b.a()) {
                    setChinaCTAData();
                }
                this.ctaTv.setText(this.f44612b.getAdCall());
                if (TextUtils.isEmpty(this.f44612b.getIconUrl())) {
                    g();
                } else {
                    com.mbridge.msdk.foundation.same.image.b.a(this.f44611a.getApplicationContext()).a(this.f44612b.getIconUrl(), new e(this.f44624n, this.f44612b, this.f44627q));
                }
                if (this.f44625o != null && !TextUtils.isEmpty(this.f44612b.getAppName())) {
                    this.f44625o.setText(this.f44612b.getAppName());
                }
                if (this.f44626p == null || TextUtils.isEmpty(this.f44612b.getAppDesc())) {
                    return;
                }
                this.f44626p.setText(this.f44612b.getAppDesc());
            }
        }
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f44631u = objectAnimator;
    }

    public void setUnitId(String str) {
        this.f44627q = str;
    }

    public MBridgeClickCTAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a(ViewGroup viewGroup, CampaignEx campaignEx) {
        com.mbridge.msdk.video.dynview.b.a().a(new com.mbridge.msdk.video.dynview.wrapper.c().a(viewGroup, campaignEx), new a(viewGroup));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f44632a;

        public a(ViewGroup viewGroup) {
            this.f44632a = viewGroup;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.a aVar) {
            if (aVar != null) {
                this.f44632a.addView(aVar.b());
                MBridgeClickCTAView mBridgeClickCTAView = MBridgeClickCTAView.this;
                mBridgeClickCTAView.f44615e = mBridgeClickCTAView.h();
                MBridgeClickCTAView mBridgeClickCTAView2 = MBridgeClickCTAView.this;
                mBridgeClickCTAView2.f44626p = (TextView) mBridgeClickCTAView2.findViewById(mBridgeClickCTAView2.findID("mbridge_tv_desc"));
                MBridgeClickCTAView.this.d();
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.error.a aVar) {
            p0.b(MBridgeBaseView.TAG, "errorMsg:" + aVar.b());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeClickCTAViewDiff, com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    public void setCtaClickCallBack(f fVar) {
    }
}
