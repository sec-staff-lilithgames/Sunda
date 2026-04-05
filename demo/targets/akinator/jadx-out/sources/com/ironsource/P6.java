package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class P6 {
    public static String a(String str) {
        try {
            return new String(Base64.decode(str, 0), com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }

    public static String b(String str) {
        return Base64.encodeToString(str.getBytes(), 10);
    }
}
