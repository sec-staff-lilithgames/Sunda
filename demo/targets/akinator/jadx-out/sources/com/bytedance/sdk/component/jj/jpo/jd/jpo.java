package com.bytedance.sdk.component.jj.jpo.jd;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.jj.jpo.jpo.my;
import com.bytedance.sdk.component.jj.jpo.xyk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    public static boolean cm() {
        my myVarCm = xyk.qk().cm();
        return (myVarCm == null || TextUtils.isEmpty(myVarCm.my())) ? false : true;
    }

    private static long jd(int i10, Context context) {
        if (context == null) {
            return i10;
        }
        Runtime runtime = Runtime.getRuntime();
        long jFreeMemory = runtime.freeMemory() / 1048576;
        long jMaxMemory = (runtime.maxMemory() / 1048576) - (runtime.totalMemory() / 1048576);
        if (jMaxMemory <= 0) {
            if (jFreeMemory <= 2) {
                return 1L;
            }
            return jFreeMemory <= 10 ? Math.min(i10, 10) : Math.min((jFreeMemory / 2) * 10, i10);
        }
        long j10 = ((jFreeMemory + jMaxMemory) - 10) / 2;
        if (j10 <= 2) {
            return 1L;
        }
        return j10 <= 10 ? Math.min(i10, 10) : Math.min(j10 * 10, i10);
    }

    public static boolean jj() {
        my myVarCm = xyk.qk().cm();
        return (myVarCm == null || TextUtils.isEmpty(myVarCm.jj())) ? false : true;
    }

    public static long jpo(int i10, Context context) {
        return jd(i10, context);
    }

    public static boolean my() {
        my myVarCm = xyk.qk().cm();
        return (myVarCm == null || TextUtils.isEmpty(myVarCm.wqx())) ? false : true;
    }

    public static boolean wqx() {
        my myVarCm = xyk.qk().cm();
        return (myVarCm == null || TextUtils.isEmpty(myVarCm.cm())) ? false : true;
    }

    public static boolean jpo() {
        my myVarCm = xyk.qk().cm();
        return (myVarCm == null || TextUtils.isEmpty(myVarCm.jpo())) ? false : true;
    }

    public static boolean jd() {
        my myVarCm = xyk.qk().cm();
        return (myVarCm == null || TextUtils.isEmpty(myVarCm.jd())) ? false : true;
    }
}
