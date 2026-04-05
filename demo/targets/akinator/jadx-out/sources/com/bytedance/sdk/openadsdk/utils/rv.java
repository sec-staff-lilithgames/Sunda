package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class rv {

    /* renamed from: cm, reason: collision with root package name */
    private static volatile boolean f21591cm = true;

    /* renamed from: jd, reason: collision with root package name */
    private static String f21592jd;
    private static String jpo;
    private static String wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo extends com.bytedance.sdk.component.xyk.xyk {
        public static AtomicBoolean jpo = new AtomicBoolean(false);

        /* renamed from: jd, reason: collision with root package name */
        private static final AtomicLong f21593jd = new AtomicLong(0);

        public jpo(String str, int i10) {
            super(str, i10);
        }

        public static void jpo() {
            if (jpo.get()) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            AtomicLong atomicLong = f21593jd;
            if (jCurrentTimeMillis - atomicLong.get() < TTAdConstant.AD_MAX_EVENT_TIME) {
                return;
            }
            atomicLong.set(jCurrentTimeMillis);
            duq.jd((com.bytedance.sdk.component.xyk.xyk) new jpo("UpdateSimStatusTask", 5));
        }

        @Override // java.lang.Runnable
        public void run() {
            jpo.set(true);
            rv.my();
            jpo.set(false);
        }
    }

    public static String jd() {
        try {
            jpo.jpo();
            if (!f21591cm) {
                StringBuilder sb2 = new StringBuilder("getMCC");
                sb2.append(f21591cm ? "Have SIM card" : "No SIM card, MCC returns null");
                com.bytedance.sdk.component.utils.nmd.wqx("MCC", sb2.toString());
                return null;
            }
            Configuration configuration = com.bytedance.sdk.openadsdk.core.sq.jpo().getResources().getConfiguration();
            int i10 = configuration.mcc;
            String strValueOf = i10 != 0 ? String.valueOf(i10) : f21592jd;
            com.bytedance.sdk.component.utils.nmd.wqx("MCC", "config=" + configuration.mcc + ",sMCC=" + f21592jd);
            return strValueOf;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("SimUtils", th2.getMessage());
            return null;
        }
    }

    public static String jpo() {
        jpo.jpo();
        return jpo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void my() {
        String simOperatorName;
        String simOperator;
        String strSubstring;
        if (com.bytedance.sdk.openadsdk.core.sq.jpo() == null) {
            return;
        }
        f21591cm = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.sdk.openadsdk.core.sq.jpo().getSystemService("phone");
            try {
                int simState = telephonyManager.getSimState();
                if (simState == 0 || simState == 1) {
                    f21591cm = false;
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.nmd.wqx("SimUtils", th2.getMessage());
            }
            String str = null;
            try {
                simOperatorName = telephonyManager.getSimOperatorName();
            } catch (Throwable unused) {
                simOperatorName = null;
            }
            try {
                simOperator = telephonyManager.getNetworkOperator();
            } catch (Throwable unused2) {
                simOperator = null;
            }
            if (simOperator == null || simOperator.length() < 5) {
                try {
                    simOperator = telephonyManager.getSimOperator();
                } catch (Throwable unused3) {
                }
            }
            if (TextUtils.isEmpty(simOperator) || simOperator.length() <= 4) {
                strSubstring = null;
            } else {
                String strSubstring2 = simOperator.substring(0, 3);
                strSubstring = simOperator.substring(3);
                str = strSubstring2;
            }
            if (!TextUtils.isEmpty(simOperatorName)) {
                jpo = simOperatorName;
            }
            if (!TextUtils.isEmpty(str)) {
                f21592jd = str;
            }
            if (TextUtils.isEmpty(strSubstring)) {
                return;
            }
            wqx = strSubstring;
        } catch (Throwable unused4) {
        }
    }

    public static String wqx() {
        jpo.jpo();
        return wqx;
    }
}
