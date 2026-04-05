package com.mbridge.msdk.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MBridgeVastEndCardView extends MBridgeBaseView {

    /* renamed from: m, reason: collision with root package name */
    private ViewGroup f44727m;

    /* renamed from: n, reason: collision with root package name */
    private View f44728n;

    /* renamed from: o, reason: collision with root package name */
    private View f44729o;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVastEndCardView.this.notifyListener.a(104, "");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends com.mbridge.msdk.widget.a {
        public b() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            MBridgeVastEndCardView mBridgeVastEndCardView = MBridgeVastEndCardView.this;
            mBridgeVastEndCardView.notifyListener.a(108, mBridgeVastEndCardView.c());
        }
    }

    public MBridgeVastEndCardView(Context context) {
        super(context);
    }

    private boolean e() {
        this.f44727m = (ViewGroup) findViewById(findID("mbridge_rl_content"));
        this.f44728n = findViewById(findID("mbridge_iv_vastclose"));
        View viewFindViewById = findViewById(findID("mbridge_iv_vastok"));
        this.f44729o = viewFindViewById;
        return isNotNULL(this.f44727m, this.f44728n, viewFindViewById);
    }

    private void f() {
        if (this.f44615e) {
            setMatchParent();
            setBackgroundResource(findColor("mbridge_reward_endcard_vast_bg"));
            setClickable(true);
            ((RelativeLayout.LayoutParams) this.f44727m.getLayoutParams()).addRule(13, -1);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void d() {
        super.d();
        if (this.f44615e) {
            this.f44728n.setOnClickListener(new a());
            this.f44729o.setOnClickListener(new b());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_endcard_vast");
        if (h0.a(iFindLayout)) {
            this.f44613c.inflate(iFindLayout, this);
            this.f44615e = e();
            d();
            f();
        }
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
    }

    public MBridgeVastEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void notifyShowListener() {
        this.notifyListener.a(111, SFPXhf.zKuSqDhpmkOWDzl);
    }
}
