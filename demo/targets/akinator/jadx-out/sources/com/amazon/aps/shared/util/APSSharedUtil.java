package com.amazon.aps.shared.util;

import com.amazon.aps.ads.ApsLog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class APSSharedUtil {
    public static final String EMPTY_STRING = "";
    public static final String TRUNCATE_SEPARATOR = "...";

    public static void checkNullAndThrowException(Object... objArr) throws IllegalArgumentException {
        if (isNull(objArr)) {
            throw new IllegalArgumentException("Invalid parameters passed");
        }
    }

    public static boolean isClassExistInPackage(String str) {
        try {
            Class.forName(str);
            ApsLog.d("Class name " + str + " is found");
            return true;
        } catch (Throwable unused) {
            ApsLog.d("Class name " + str + " is not found");
            return false;
        }
    }

    public static boolean isNull(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return true;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
            if ((obj instanceof String) && ((String) obj).trim().length() == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.equals("");
    }
}
