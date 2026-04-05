package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class se {
    private static final Object jpo = new Object();

    /* renamed from: jd, reason: collision with root package name */
    private static final Map<jpo, Object> f19008jd = new ConcurrentHashMap();
    private static AtomicBoolean wqx = new AtomicBoolean(false);

    /* renamed from: cm, reason: collision with root package name */
    private static volatile int f19007cm = -1;
    private static volatile long my = 0;

    /* renamed from: jj, reason: collision with root package name */
    private static volatile int f19009jj = DtbConstants.NETWORK_READ_TIMEOUT;

    /* renamed from: qk, reason: collision with root package name */
    private static jr f19010qk = null;
    private static final AtomicBoolean xyk = new AtomicBoolean(false);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd extends BroadcastReceiver {
        private jd() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                boolean z10 = false;
                boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
                if (se.f19008jd != null && se.f19008jd.size() > 0) {
                    z10 = true;
                }
                se.jd(context, intent, z10, booleanExtra);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo(Context context, Intent intent, boolean z10, int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jd(final Context context, final Intent intent, final boolean z10, final boolean z11) {
        if (!z10 && z11) {
            f19007cm = 0;
        } else if (xyk.compareAndSet(false, true)) {
            com.bytedance.sdk.component.xyk.jj.jd(new com.bytedance.sdk.component.xyk.xyk("getNetworkType") { // from class: com.bytedance.sdk.component.utils.se.1
                @Override // java.lang.Runnable
                public void run() {
                    int unused = se.f19007cm = z11 ? 0 : se.jd(context);
                    se.xyk.set(false);
                    if (z10) {
                        se.jd(context, intent, se.f19007cm, z11);
                    }
                }
            });
        }
    }

    private static int wqx(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? 1 : 4;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        jr jrVar = f19010qk;
                        return (jrVar == null || !jrVar.jpo(context, telephonyManager)) ? 5 : 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        return (TextUtils.isEmpty(subtypeName) || !(subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000"))) ? 1 : 3;
                }
            }
            return 0;
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jd(Context context, Intent intent, int i10, boolean z10) {
        Map<jpo, Object> map = f19008jd;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (jpo jpoVar : map.keySet()) {
            if (jpoVar != null) {
                try {
                    jpoVar.jpo(context, intent, !z10, i10);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static int jpo(Context context, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (my + j10 <= jElapsedRealtime) {
            return jd(context);
        }
        if (f19007cm == -1) {
            return jd(context);
        }
        if (jElapsedRealtime - my >= f19009jj) {
            jd(context, (Intent) null, false, false);
        }
        return f19007cm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int jd(Context context) {
        f19007cm = wqx(context);
        my = SystemClock.elapsedRealtime();
        return f19007cm;
    }

    public static void jpo(jpo jpoVar, Context context) {
        if (jpoVar == null) {
            return;
        }
        if (!wqx.get()) {
            try {
                context.registerReceiver(new jd(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                wqx.set(true);
            } catch (Throwable unused) {
            }
        }
        f19008jd.put(jpoVar, jpo);
    }

    public static void jpo(jpo jpoVar) {
        if (jpoVar == null) {
            return;
        }
        f19008jd.remove(jpoVar);
    }
}
