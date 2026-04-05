package com.bytedance.sdk.openadsdk.core.zz;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hna extends com.bytedance.sdk.openadsdk.core.au.jd.jj implements View.OnClickListener {

    /* renamed from: sq, reason: collision with root package name */
    private boolean f21059sq;

    public hna(Context context, com.bytedance.sdk.openadsdk.core.model.dt dtVar, String str, com.bytedance.sdk.openadsdk.cm.qk qkVar, boolean z10) {
        super(context, dtVar, false, str, false, false, qkVar);
        this.f21059sq = false;
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
        setNeedSelfManagerVideo(!z10);
    }

    private void jr() {
        qk();
        RelativeLayout relativeLayout = this.f20163qk;
        if (relativeLayout != null) {
            if (relativeLayout.getVisibility() == 0) {
                return;
            } else {
                com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(this.jpo.ww().yd(), this.jpo.ww().wqx(), this.jpo.ww().jd(), this.xyk, this.jpo);
            }
        }
        opi();
    }

    private void opi() {
        va.jpo((View) this.f20163qk, 0);
        va.jpo((View) this.xyk, 0);
        va.jpo((View) this.f20170yd, 8);
    }

    public void cm() {
        ImageView imageView = this.f20170yd;
        if (imageView != null) {
            va.jpo((View) imageView, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.jj
    public void jd() {
        if (!this.my || !hmu.jd(this.f113if)) {
            this.f20153cm = false;
        }
        super.jd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.jj
    public void jpo(boolean z10) {
    }

    public void my() {
        qk();
        va.jpo((View) this.f20163qk, 0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ImageView imageView = this.zz;
        if (imageView != null && imageView.getVisibility() == 0) {
            va.my(this.f20163qk);
        }
        wqx();
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.jj, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        ImageView imageView = this.zz;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowFocusChanged(z10);
        } else {
            jr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.jj, android.view.View
    public void onWindowVisibilityChanged(int i10) {
        ImageView imageView = this.zz;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowVisibilityChanged(i10);
        } else {
            jr();
        }
    }

    public void setCanInterruptVideoPlay(boolean z10) {
        this.f21059sq = z10;
    }

    public void setShouldCheckNetChange(boolean z10) {
        com.bytedance.sdk.openadsdk.core.au.jd.wqx wqxVar = this.f20157jd;
        if (wqxVar != null) {
            wqxVar.my(z10);
        }
    }

    public void setShowAdInteractionView(boolean z10) {
        com.bytedance.sdk.openadsdk.core.au.jd.my myVarMo374if;
        com.bytedance.sdk.openadsdk.core.au.jd.wqx wqxVar = this.f20157jd;
        if (wqxVar == null || (myVarMo374if = wqxVar.mo374if()) == null) {
            return;
        }
        myVarMo374if.jpo(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.jj
    public void wqx() {
        if (this.f21059sq) {
            super.wqx();
        }
    }

    public void jpo(int i10, int i11) {
        com.bytedance.sdk.openadsdk.core.au.jd.wqx wqxVar = this.f20157jd;
        if (wqxVar != null) {
            wqxVar.jd(i10, i11);
        }
    }
}
