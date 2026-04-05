package com.mbridge.msdk.video.module;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.video.signal.factory.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MBridgeClickMiniCardView extends MBridgeH5EndCardView {
    private boolean P;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p0.a(MBridgeBaseView.TAG, "webviewshow");
                String string = "";
                try {
                    int[] iArr = new int[2];
                    MBridgeClickMiniCardView.this.f44662p.getLocationOnScreen(iArr);
                    p0.b(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", u0.b(c.m().d(), (float) iArr[0]));
                    jSONObject.put("startY", u0.b(c.m().d(), (float) iArr[1]));
                    string = jSONObject.toString();
                } catch (Throwable th2) {
                    p0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                }
                f.a().a((WebView) MBridgeClickMiniCardView.this.f44662p, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public MBridgeClickMiniCardView(Context context) {
        super(context);
        this.P = false;
    }

    private void setContentLayoutParams(View view) {
        int iG = u0.g(this.f44611a);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) ((iG * 0.7f) + 0.5f);
        layoutParams.height = (int) ((u0.f(this.f44611a) * 0.7f) + 0.5f);
        view.setLayoutParams(layoutParams);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public RelativeLayout.LayoutParams getContentLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public String getURL() {
        CampaignEx campaignEx = this.f44612b;
        if (campaignEx != null) {
            CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
            strC = rewardTemplateMode != null ? rewardTemplateMode.c() : null;
            if (!TextUtils.isEmpty(strC) && strC.contains(".zip")) {
                String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(strC);
                if (!TextUtils.isEmpty(h5ResAddress)) {
                    return h5ResAddress;
                }
            }
        }
        return strC;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public void j() {
        super.j();
        if (this.f44615e) {
            setBackgroundResource(findColor("mbridge_reward_minicard_bg"));
            setContentLayoutParams(this.f44659m);
            setClickable(true);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) throws JSONException {
        if (this.f44615e) {
            setContentLayoutParams(this.f44659m);
        }
        super.onSelfConfigurationChanged(configuration);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void preLoadData(b bVar) {
        super.preLoadData(bVar);
        setCloseVisible(0);
    }

    public void resizeMiniCard(int i10, int i11) {
        View viewFindViewById = ((Activity) this.f44611a).getWindow().findViewById(R.id.content);
        int width = viewFindViewById.getWidth();
        int height = viewFindViewById.getHeight();
        if (i10 <= 0 || i11 <= 0 || i10 > width || i11 > height) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f44659m.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i11;
        this.f44659m.setLayoutParams(layoutParams);
    }

    public void setMBridgeClickMiniCardViewClickable(boolean z10) {
        setClickable(z10);
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        setBackgroundColor(0);
    }

    public void setMiniCardLocation(int i10, int i11, int i12, int i13) {
        this.P = true;
        resizeMiniCard(i12, i13);
    }

    public void setRadius(int i10) {
        if (i10 > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(u0.a(getContext(), i10));
            gradientDrawable.setColor(-1);
            this.f44662p.setBackground(gradientDrawable);
            this.f44662p.setClipToOutline(true);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f44662p;
        if (windVaneWebView != null) {
            windVaneWebView.post(new a());
            e eVar = new e();
            eVar.a("type", 3);
            d.b().a("2000133", this.f44612b, eVar);
        }
    }

    public MBridgeClickMiniCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P = false;
    }
}
