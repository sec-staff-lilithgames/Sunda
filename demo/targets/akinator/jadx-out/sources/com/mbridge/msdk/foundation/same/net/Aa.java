package com.mbridge.msdk.foundation.same.net;

import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.j0;
import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Aa {
    private static final String C_END = "_mv_end";
    private static final String C_START = "mv_channel_";

    /* renamed from: a, reason: collision with root package name */
    private static String f40798a = "";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.killProcess(Process.myPid());
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public static String a() {
        return f40798a;
    }

    public static String b() {
        return null;
    }

    private static Integer c(String str) {
        Throwable th2;
        Integer numValueOf;
        if (str != null) {
            int iIndexOf = str.indexOf(C_START);
            int iIndexOf2 = str.indexOf(C_END);
            if (iIndexOf != -1 && iIndexOf2 != -1 && iIndexOf2 > iIndexOf) {
                try {
                    numValueOf = Integer.valueOf(str.substring(iIndexOf + 11, iIndexOf2));
                    try {
                        if (numValueOf.intValue() > 0) {
                            return numValueOf;
                        }
                        return null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        th2.printStackTrace();
                        return numValueOf;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    numValueOf = null;
                }
            }
        }
        return null;
    }

    private static void g() {
        new Handler().postDelayed(new a(), 500L);
    }

    private static void b(String str) {
        String strA;
        Integer numC;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            strA = j0.a(str);
        } catch (Throwable th2) {
            th2.printStackTrace();
            strA = null;
        }
        if (!TextUtils.isEmpty(strA) && strA.startsWith(C_START) && strA.endsWith(uQjDr.alLvCZK) && (numC = c(strA)) != null) {
            f40798a = String.valueOf(numC);
        } else {
            if (MBridgeConstans.DEBUG) {
                g();
                throw new RuntimeException("please don't update this value");
            }
            f40798a = "";
        }
    }
}
