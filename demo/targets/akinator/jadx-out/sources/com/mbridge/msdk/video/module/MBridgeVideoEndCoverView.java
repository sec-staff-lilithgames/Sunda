package com.mbridge.msdk.video.module;

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
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.video.module.listener.impl.j;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MBridgeVideoEndCoverView extends MBridgeBaseView {

    /* renamed from: m, reason: collision with root package name */
    private final String f44732m;

    /* renamed from: n, reason: collision with root package name */
    private View f44733n;

    /* renamed from: o, reason: collision with root package name */
    private ImageView f44734o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f44735p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f44736q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f44737r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f44738s;

    /* renamed from: t, reason: collision with root package name */
    private com.mbridge.msdk.video.signal.factory.b f44739t;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoEndCoverView.this.notifyListener.a(104, "");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            MBridgeVideoEndCoverView.this.g();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            MBridgeVideoEndCoverView.this.g();
        }
    }

    public MBridgeVideoEndCoverView(Context context) {
        super(context);
        this.f44732m = "MBridgeVideoEndCoverView";
    }

    private boolean a(View view) {
        if (view == null) {
            return true;
        }
        try {
            this.f44734o = (ImageView) view.findViewById(findID("mbridge_vec_iv_icon"));
            this.f44735p = (ImageView) view.findViewById(findID("mbridge_vec_iv_close"));
            this.f44736q = (TextView) view.findViewById(findID("mbridge_vec_tv_title"));
            this.f44737r = (TextView) view.findViewById(findID("mbridge_vec_tv_desc"));
            this.f44738s = (TextView) view.findViewById(findID("mbridge_vec_btn"));
            return true;
        } catch (Throwable th2) {
            p0.b("MBridgeVideoEndCoverView", th2.getMessage());
            return false;
        }
    }

    private void e() {
        ImageView imageView;
        CampaignEx campaignEx = this.f44612b;
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getIconUrl()) && (imageView = this.f44734o) != null) {
                a1.a(imageView, this.f44612b.getLocalRequestId(), this.f44612b.getLocalAllowTrackClick());
                com.mbridge.msdk.foundation.same.image.b.a(this.f44611a.getApplicationContext()).a(this.f44612b.getIconUrl(), new j(this.f44734o, com.google.android.gms.internal.play_billing.a.a(8.0f)));
            }
            TextView textView = this.f44736q;
            if (textView != null) {
                textView.setText(this.f44612b.getAppName());
            }
            TextView textView2 = this.f44738s;
            if (textView2 != null) {
                a1.a(textView2, this.f44612b.getLocalRequestId(), this.f44612b.getLocalAllowTrackClick());
                this.f44738s.setText(this.f44612b.getAdCall());
            }
            TextView textView3 = this.f44737r;
            if (textView3 != null) {
                textView3.setText(this.f44612b.getAppDesc());
            }
        }
    }

    private void f() {
        View view = this.f44733n;
        if (view == null) {
            init(this.f44611a);
            preLoadData(this.f44739t);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.f44733n.getParent()).removeView(this.f44733n);
        }
        addView(this.f44733n);
        a(this.f44733n);
        d();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void d() {
        super.d();
        this.f44735p.setOnClickListener(new a());
        this.f44734o.setOnClickListener(new b());
        this.f44738s.setOnClickListener(new c());
    }

    public void g() throws JSONException {
        JSONException e10;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONException e11;
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f40711h, u0.b(com.mbridge.msdk.foundation.controller.c.m().d(), this.f44616f));
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f40712i, u0.b(com.mbridge.msdk.foundation.controller.c.m().d(), this.f44617g));
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f40716m, 0);
                    try {
                        this.f44614d = getContext().getResources().getConfiguration().orientation;
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f40714k, this.f44614d);
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f40715l, u0.d(getContext()));
                } catch (JSONException e13) {
                    e11 = e13;
                    p0.b("MBridgeVideoEndCoverView", e11.getMessage());
                    jSONObject = new JSONObject();
                    jSONObject.put(com.mbridge.msdk.foundation.same.a.f40713j, jSONObject2);
                    this.notifyListener.a(105, jSONObject);
                }
            } catch (JSONException e14) {
                jSONObject2 = jSONObject3;
                e11 = e14;
            }
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.mbridge.msdk.foundation.same.a.f40713j, jSONObject2);
            } catch (JSONException e15) {
                e10 = e15;
                e10.printStackTrace();
                this.notifyListener.a(105, jSONObject);
            }
        } catch (JSONException e16) {
            e10 = e16;
            jSONObject = null;
        }
        this.notifyListener.a(105, jSONObject);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_videoend_cover");
        if (h0.a(iFindLayout)) {
            View viewInflate = this.f44613c.inflate(iFindLayout, (ViewGroup) null);
            this.f44733n = viewInflate;
            if (viewInflate != null) {
                this.f44615e = a(viewInflate);
                addView(this.f44733n, -1, -1);
                d();
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f44616f = motionEvent.getRawX();
        this.f44617g = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f44614d = configuration.orientation;
        removeView(this.f44733n);
        f();
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f44739t = bVar;
        try {
            if (this.f44612b == null || !this.f44615e) {
                return;
            }
            e();
        } catch (Throwable th2) {
            p0.a("MBridgeVideoEndCoverView", th2.getMessage());
        }
    }

    public MBridgeVideoEndCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44732m = "MBridgeVideoEndCoverView";
    }
}
