package com.mbridge.msdk.newreward.function.common;

import a.b;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.x0;
import com.mbridge.msdk.video.bt.module.orglistener.h;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class MBridgeGlobalCommon {
    public static String SESSION_ID = "";
    public static Map<String, h> showRewardListenerMap = new HashMap();

    public static void setAlertDialogText(String str, String str2, String str3, String str4, String str5) {
        Context contextD = c.m().d();
        if (!TextUtils.isEmpty(str2)) {
            x0.b(contextD, b.k("MBridge_ConfirmTitle", str), str2.trim());
        }
        if (!TextUtils.isEmpty(str3)) {
            x0.b(contextD, b.k("MBridge_ConfirmContent", str), str3.trim());
        }
        if (!TextUtils.isEmpty(str5)) {
            x0.b(contextD, b.k("MBridge_CancelText", str), str5.trim());
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        x0.b(contextD, b.k("MBridge_ConfirmText", str), str4.trim());
    }
}
