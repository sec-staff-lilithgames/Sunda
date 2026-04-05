package com.mbridge.msdk.out;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.reward.controller.a;
import com.mbridge.msdk.util.b;
import com.mbridge.msdk.video.bt.module.orglistener.g;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class MBRewardVideoHandler implements BaseExtraInterfaceForHandler {
    private static final String TAG = "MBRewardVideoHandler";
    private String cancelText;
    private String confirmContent;
    private String confirmText;
    private String confirmTitle;
    private a controller;
    private boolean isRewardPlusOpen;
    private g listener;
    private String placementId;
    private String unitId;
    private boolean isSetListenerController = false;
    private int isSilent = 2;
    private boolean isConfigAlertDialogTextController = false;

    public MBRewardVideoHandler(Context context, String str, String str2) {
        if (c.m().d() == null && context != null) {
            c.m().b(context);
        }
        if (context instanceof Activity) {
            c.m().a(context);
        }
        initData(str, str2);
    }

    private void checkAndCreateController() {
        if (this.controller == null) {
            initMBRewardVideoHandler(this.placementId, this.unitId);
        }
        configController();
    }

    private void configController() {
        if (this.controller == null) {
            return;
        }
        if (this.isSetListenerController) {
            if (b.a()) {
                this.controller.a(new com.mbridge.msdk.video.bt.module.orglistener.a(this.listener, this.unitId, false));
            } else {
                this.controller.a(new com.mbridge.msdk.video.bt.module.orglistener.a(this.listener));
            }
            this.isSetListenerController = false;
        }
        if (this.isConfigAlertDialogTextController) {
            this.controller.a(this.confirmTitle, this.confirmContent, this.confirmText, this.cancelText);
            this.isConfigAlertDialogTextController = false;
        }
        this.controller.f(this.isRewardPlusOpen);
    }

    private void initData(String str, String str2) {
        String strE = u0.e(str2);
        if (!TextUtils.isEmpty(strE)) {
            u0.b(str2, strE);
        }
        this.placementId = str;
        this.unitId = str2;
        checkAndCreateController();
    }

    private void initMBRewardVideoHandler(String str, String str2) {
        try {
            if (this.controller == null) {
                a aVar = new a();
                this.controller = aVar;
                aVar.d(false);
                this.controller.c(str, str2);
            }
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage(), th2);
        }
    }

    public void clearBitmapCache() {
        try {
            com.mbridge.msdk.foundation.same.image.b.a(c.m().d()).a();
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    public void clearVideoCache() {
        try {
            a aVar = this.controller;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.controller;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        a aVar = this.controller;
        return aVar != null ? aVar.m() : "";
    }

    public boolean isReady() {
        checkAndCreateController();
        a aVar = this.controller;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void load() {
        checkAndCreateController();
        if (this.controller != null) {
            this.controller.a(true, d.b().a(0, 94, this.unitId, true, 2));
        }
    }

    public void loadFormSelfFilling() {
        checkAndCreateController();
        if (this.controller != null) {
            configController();
            this.controller.a(false, d.b().a(0, 94, this.unitId, true, 1));
        }
    }

    public void playVideoMute(int i10) {
        this.isSilent = i10;
        a aVar = this.controller;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.confirmTitle = str;
        this.confirmContent = str2;
        this.confirmText = str3;
        this.cancelText = str4;
        this.isConfigAlertDialogTextController = true;
        MBridgeGlobalCommon.setAlertDialogText(this.unitId, str, str2, str3, str4);
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) throws JSONException {
        c.m().a(this.unitId, jSONObject);
    }

    public void setRewardPlus(boolean z10) {
        this.isRewardPlusOpen = z10;
        a aVar = this.controller;
        if (aVar != null) {
            aVar.f(z10);
        }
    }

    public void setRewardVideoListener(g gVar) {
        this.listener = gVar;
        this.isSetListenerController = true;
        a aVar = this.controller;
        if (aVar == null || aVar.u()) {
            return;
        }
        if (b.a()) {
            this.controller.a(new com.mbridge.msdk.video.bt.module.orglistener.a(gVar, this.unitId, false));
        } else {
            this.controller.a(new com.mbridge.msdk.video.bt.module.orglistener.a(gVar));
        }
        this.isSetListenerController = false;
    }

    public void show() {
        checkAndCreateController();
        if (this.controller != null) {
            this.controller.a((String) null, (String) null, (String) null, d.b().a(0, 94, this.unitId, false, -1));
        }
    }

    public void show(String str) {
        checkAndCreateController();
        if (this.controller != null) {
            this.controller.a((String) null, str, (String) null, d.b().a(0, 94, this.unitId, false, -1));
        }
    }

    public void show(String str, String str2) {
        checkAndCreateController();
        if (this.controller != null) {
            this.controller.a((String) null, str, str2, d.b().a(0, 94, this.unitId, false, -1));
        }
    }

    public MBRewardVideoHandler(String str, String str2) {
        initData(str, str2);
    }
}
