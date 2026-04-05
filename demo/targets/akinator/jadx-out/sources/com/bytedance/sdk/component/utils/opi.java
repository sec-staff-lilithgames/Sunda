package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.amazon.device.ads.DtbConstants;
import com.ironsource.C3119a4;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class opi {
    public static boolean cm(Context context) {
        return wqx(context) == 4;
    }

    public static int jd(Context context) {
        int iWqx = wqx(context);
        if (iWqx == 1) {
            return 0;
        }
        if (iWqx == 4) {
            return 1;
        }
        if (iWqx == 5) {
            return 4;
        }
        if (iWqx != 6) {
            return iWqx;
        }
        return 6;
    }

    public static boolean jj(Context context) {
        return wqx(context) == 6;
    }

    public static boolean jpo(Context context) {
        return wqx(context) != 0;
    }

    public static boolean my(Context context) {
        return wqx(context) == 5;
    }

    public static String qk(Context context) {
        int iWqx = wqx(context);
        return iWqx != 2 ? iWqx != 3 ? iWqx != 4 ? iWqx != 5 ? iWqx != 6 ? DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY : "5g" : "4g" : C3119a4.f35922b : C3119a4.f35921a : "2g";
    }

    public static int wqx(Context context) {
        return se.jpo(context, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }

    public static boolean xyk(Context context) {
        if (context == null) {
            return false;
        }
        int iWqx = wqx(context);
        return iWqx == 2 || iWqx == 3 || iWqx == 4 || iWqx == 5 || iWqx == 6;
    }

    public static boolean jpo(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(DtbConstants.HTTP) || str.startsWith(DtbConstants.HTTPS);
    }
}
