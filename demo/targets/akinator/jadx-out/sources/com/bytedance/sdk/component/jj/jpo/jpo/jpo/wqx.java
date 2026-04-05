package com.bytedance.sdk.component.jj.jpo.jpo.jpo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {
    public static void jpo(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            jpo.jpo(context).jpo().jpo(str, (String) null, contentValues);
        } catch (Throwable unused) {
        }
    }

    public static void jpo(Context context, String str, List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list) {
        if (list == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            jpo.jpo(context).jpo().jpo(str, (String) null, list);
        } catch (Throwable unused) {
        }
    }

    public static int jpo(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return jpo.jpo(context).jpo().jpo(str, str2, strArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int jpo(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            try {
                return jpo.jpo(context).jpo().jpo(str, contentValues, str2, strArr);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public static Cursor jpo(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return jpo.jpo(context).jpo().jpo(str, strArr, str2, strArr2, null, null, str5);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void jpo(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            jpo.jpo(context).jpo().jpo(Uri.decode(str));
        } catch (Throwable unused) {
        }
    }
}
