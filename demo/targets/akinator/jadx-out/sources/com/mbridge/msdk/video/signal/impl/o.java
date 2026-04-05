package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.x0;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class o extends p {

    /* renamed from: a, reason: collision with root package name */
    private Activity f45240a;

    /* renamed from: b, reason: collision with root package name */
    private MBridgeContainerView f45241b;

    public o(Activity activity, MBridgeContainerView mBridgeContainerView) {
        this.f45240a = activity;
        this.f45241b = mBridgeContainerView;
    }

    @Override // com.mbridge.msdk.video.signal.impl.g, com.mbridge.msdk.video.signal.i
    public void a(String str) {
        super.a(str);
        try {
            if (this.f45240a == null || TextUtils.isEmpty(str)) {
                return;
            }
            if (str.equals("landscape")) {
                this.f45240a.setRequestedOrientation(0);
            } else if (str.equals("portrait")) {
                this.f45240a.setRequestedOrientation(1);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.g, com.mbridge.msdk.video.signal.i
    public String b() {
        if (this.f45241b == null) {
            super.b();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f45241b.getCampaign());
                String unitID = this.f45241b.getUnitID();
                com.mbridge.msdk.videocommon.setting.c cVarB = b(unitID);
                JSONObject jSONObject = new JSONObject();
                if (cVarB != null) {
                    jSONObject = cVarB.H();
                }
                p0.a("JSRewardVideoV1", "getEndScreenInfo success campaign = " + this.f45241b.getCampaign());
                return a(arrayList, unitID, "MAL_16.9.91,3.0.1", jSONObject);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return super.b();
    }

    @Override // com.mbridge.msdk.video.signal.impl.g, com.mbridge.msdk.video.signal.i
    public void handlerPlayableException(String str) {
        MBridgeContainerView mBridgeContainerView;
        super.handlerPlayableException(str);
        try {
            if (this.f45240a == null || TextUtils.isEmpty(str) || (mBridgeContainerView = this.f45241b) == null) {
                return;
            }
            mBridgeContainerView.handlerPlayableException(str);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.g, com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i10) {
        super.notifyCloseBtn(i10);
        MBridgeContainerView mBridgeContainerView = this.f45241b;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.notifyCloseBtn(i10);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.g, com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i10) {
        super.toggleCloseBtn(i10);
        MBridgeContainerView mBridgeContainerView = this.f45241b;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.toggleCloseBtn(i10);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.g, com.mbridge.msdk.video.signal.i
    public void triggerCloseBtn(String str) {
        MBridgeContainerView mBridgeContainerView;
        super.triggerCloseBtn(str);
        try {
            if (this.f45240a == null || TextUtils.isEmpty(str) || !str.equals("click") || (mBridgeContainerView = this.f45241b) == null) {
                return;
            }
            mBridgeContainerView.triggerCloseBtn(str);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private String a(List<CampaignEx> list, String str, String str2, JSONObject jSONObject) throws JSONException {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            Object camplistToJson = CampaignEx.parseCamplistToJson(list);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("campaignList", camplistToJson);
            a(jSONObject2);
            jSONObject2.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject2.put("sdk_info", str2);
            jSONObject2.put("unitSetting", jSONObject);
            if (com.mbridge.msdk.setting.h.b() != null) {
                String strE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.m().b());
                if (!TextUtils.isEmpty(strE)) {
                    JSONObject jSONObject3 = new JSONObject(strE);
                    a(jSONObject3, str);
                    String strC = com.mbridge.msdk.setting.h.b().c(str);
                    if (!TextUtils.isEmpty(strC)) {
                        jSONObject3.put("ivreward", new JSONObject(strC));
                    }
                    jSONObject2.put("appSetting", jSONObject3);
                }
            }
            return jSONObject2.toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private com.mbridge.msdk.videocommon.setting.c b(String str) {
        if (com.mbridge.msdk.videocommon.setting.b.b() == null) {
            return null;
        }
        return com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.m().b(), str);
    }

    private void a(JSONObject jSONObject, String str) throws JSONException {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
            String string = x0.a(contextD, "MBridge_ConfirmTitle" + str, "").toString();
            String string2 = x0.a(contextD, "MBridge_ConfirmContent" + str, "").toString();
            String string3 = x0.a(contextD, "MBridge_CancelText" + str, "").toString();
            String string4 = x0.a(contextD, "MBridge_ConfirmText" + str, "").toString();
            if (!TextUtils.isEmpty(string)) {
                jSONObject.put("confirm_title", string);
            }
            if (!TextUtils.isEmpty(string2)) {
                jSONObject.put("confirm_description", string2);
            }
            if (!TextUtils.isEmpty(string3)) {
                jSONObject.put("confirm_t", string3);
            }
            if (!TextUtils.isEmpty(string4)) {
                jSONObject.put("confirm_c_play", string4);
            }
            if (TextUtils.isEmpty(string4)) {
                return;
            }
            jSONObject.put("confirm_c_rv", string4);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
