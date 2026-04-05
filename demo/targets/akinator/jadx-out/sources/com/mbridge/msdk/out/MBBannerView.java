package com.mbridge.msdk.out;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.error.b;
import com.mbridge.msdk.foundation.same.report.metrics.c;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbbanner.controll.a;
import java.security.NoSuchAlgorithmException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class MBBannerView extends RelativeLayout implements BaseExtraInterfaceForHandler {
    private String bidToken;
    private a controller;
    private boolean hadAttached;
    private boolean isVisible;
    private BannerAdListener mBannerAdListener;
    private MBridgeIds mBridgeIds;
    private String unitId;

    public MBBannerView(Context context) {
        this(context, null);
    }

    private void callbackAndReportFail(c cVar, b bVar) {
        String strG = "";
        if (bVar != null) {
            try {
                strG = bVar.g();
            } catch (Throwable th2) {
                p0.b("BannerView", th2.getMessage());
            }
        }
        cVar.a(bVar);
        cVar.b(true);
        com.mbridge.msdk.mbbanner.common.report.a.a("2000047", cVar, (e) null);
        BannerAdListener bannerAdListener = this.mBannerAdListener;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.mBridgeIds, strG);
        }
    }

    private void delayedNotify() {
        postDelayed(new Runnable() { // from class: com.mbridge.msdk.out.MBBannerView.1
            @Override // java.lang.Runnable
            public void run() {
                if (MBBannerView.this.controller == null || com.mbridge.msdk.foundation.feedback.b.f40664f) {
                    return;
                }
                MBBannerView.this.controller.c(true);
            }
        }, 200L);
    }

    private void updateAttachedState(boolean z10) {
        this.hadAttached = z10;
        a aVar = this.controller;
        if (aVar != null) {
            aVar.b(z10);
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.controller;
        return aVar != null ? aVar.d() : "";
    }

    public String getRequestId() {
        a aVar = this.controller;
        return aVar != null ? aVar.e() : "";
    }

    public void init(BannerSize bannerSize, String str, String str2) {
        this.unitId = str2;
        this.mBridgeIds = new MBridgeIds(TextUtils.isEmpty(str) ? "" : str, str2);
        String strE = u0.e(str2);
        if (!TextUtils.isEmpty(strE)) {
            u0.b(str2, strE);
        }
        a aVar = new a(this, bannerSize, str, str2);
        this.controller = aVar;
        aVar.c(this.isVisible);
        this.controller.b(this.hadAttached);
    }

    public void load() throws NoSuchAlgorithmException {
        String strB = com.mbridge.msdk.mbbanner.common.report.a.b(this.bidToken);
        c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.unitId, strB);
        cVarA.h("0");
        a aVar = this.controller;
        if (aVar != null) {
            aVar.b(this.hadAttached);
            this.controller.a("", strB);
        } else {
            b bVar = new b(880042);
            bVar.b(strB);
            callbackAndReportFail(cVarA, bVar);
        }
    }

    public void loadFromBid(String str) throws NoSuchAlgorithmException {
        this.bidToken = str;
        String strB = com.mbridge.msdk.mbbanner.common.report.a.b(str);
        c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.unitId, strB);
        cVarA.h("1");
        if (this.controller == null) {
            b bVar = new b(880042);
            bVar.b(strB);
            callbackAndReportFail(cVarA, bVar);
        } else if (TextUtils.isEmpty(str)) {
            b bVar2 = new b(880035);
            bVar2.b(strB);
            callbackAndReportFail(cVarA, bVar2);
        } else {
            this.controller.b(this.hadAttached);
            this.controller.b(0);
            this.controller.a(str, strB);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateAttachedState(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        updateAttachedState(false);
    }

    public void onPause() {
        if (this.controller == null || !TextUtils.isEmpty(this.bidToken)) {
            return;
        }
        this.controller.g();
    }

    public void onResume() {
        if (this.controller == null || !TextUtils.isEmpty(this.bidToken) || com.mbridge.msdk.foundation.feedback.b.f40664f) {
            return;
        }
        this.controller.h();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a aVar = this.controller;
        if (aVar != null) {
            aVar.a(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        this.isVisible = i10 == 0;
        a aVar = this.controller;
        if (aVar != null) {
            if (i10 == 0) {
                delayedNotify();
            } else {
                aVar.c(false);
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.isVisible = i10 == 0;
        if (this.controller != null) {
            if (i10 == 0) {
                delayedNotify();
            } else {
                if (com.mbridge.msdk.foundation.feedback.b.f40664f) {
                    return;
                }
                this.controller.c(false);
            }
        }
    }

    public void release() {
        if (this.mBannerAdListener != null) {
            this.mBannerAdListener = null;
        }
        a aVar = this.controller;
        if (aVar != null) {
            aVar.a((BannerAdListener) null);
            this.controller.i();
        }
        removeAllViews();
    }

    public void setAllowShowCloseBtn(boolean z10) {
        a aVar = this.controller;
        if (aVar != null) {
            aVar.a(z10);
        }
    }

    public void setBannerAdListener(BannerAdListener bannerAdListener) {
        this.mBannerAdListener = bannerAdListener;
        a aVar = this.controller;
        if (aVar != null) {
            aVar.a(bannerAdListener);
        }
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) throws JSONException {
        com.mbridge.msdk.foundation.controller.c.m().a(this.unitId, jSONObject);
    }

    public void setRefreshTime(int i10) {
        a aVar = this.controller;
        if (aVar == null || i10 < 0) {
            return;
        }
        aVar.b(i10);
    }

    public void updateBannerSize(BannerSize bannerSize) {
        a aVar = this.controller;
        if (aVar != null) {
            aVar.a(bannerSize);
        }
    }

    public MBBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBBannerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.hadAttached = false;
        this.isVisible = false;
        com.mbridge.msdk.foundation.controller.c.m().a(context);
    }
}
