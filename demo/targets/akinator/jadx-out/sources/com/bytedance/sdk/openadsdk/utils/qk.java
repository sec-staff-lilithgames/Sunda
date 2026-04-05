package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk {

    /* renamed from: jd, reason: collision with root package name */
    static float f21587jd = 0.0f;
    static int jpo = -1;
    private static long wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: jd, reason: collision with root package name */
        public final float f21588jd;
        public final int jpo;

        public jpo(int i10, float f10) {
            this.jpo = i10;
            this.f21588jd = f10;
        }
    }

    private static void jpo(Intent intent) {
        if (intent.getIntExtra("status", -1) == 2) {
            jpo = 1;
        } else {
            jpo = 0;
        }
        f21587jd = (intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / intent.getIntExtra("scale", -1);
    }

    public static jpo jpo() {
        if (wqx == 0 || SystemClock.elapsedRealtime() - wqx > ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
            Intent intentRegisterReceiver = com.bytedance.sdk.openadsdk.core.sq.jpo().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(intentRegisterReceiver)));
            if (intentRegisterReceiver != null) {
                jpo(intentRegisterReceiver);
                wqx = SystemClock.elapsedRealtime();
            }
        }
        return new jpo(jpo, f21587jd);
    }
}
