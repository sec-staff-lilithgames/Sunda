package com.moloco.sdk.internal.utils;

import kotlin.jvm.internal.e0;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class b {
    public static final String a(String substituteCountDownTimeLeftMacro, int i10) {
        e0.checkNotNullParameter(substituteCountDownTimeLeftMacro, "$this$substituteCountDownTimeLeftMacro");
        return k0.replace$default(substituteCountDownTimeLeftMacro, "[SECONDS_LEFT]", Long.toString(i10 & 4294967295L, 10), false, 4, (Object) null);
    }

    public static final String b(String str, String str2) {
        e0.checkNotNullParameter(str, "<this>");
        if (str2 == null) {
            return str;
        }
        String strReplace$default = k0.replace$default(str, "[MTID]", str2, false, 4, (Object) null);
        return strReplace$default == null ? str : strReplace$default;
    }

    public static final String a(String str, String errorCode) {
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(errorCode, "errorCode");
        return k0.replace$default(str, "[ERROR_CODE]", errorCode, false, 4, (Object) null);
    }

    public static final String a(String str, long j10) {
        e0.checkNotNullParameter(str, "<this>");
        return k0.replace$default(str, "[HAPPENED_AT_TS]", String.valueOf(j10), false, 4, (Object) null);
    }

    public static final String a(String str, String errorCode, long j10) {
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(errorCode, "errorCode");
        return a(a(str, errorCode), j10);
    }
}
