package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.fa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3215fa {

    /* renamed from: a, reason: collision with root package name */
    private static final String f36694a = "_preferences";

    private C3215fa() {
    }

    public static String a(Context context, String str) {
        if (context == null) {
            return str;
        }
        return context.getPackageName() + f36694a;
    }

    public static void b(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putString(str2, str3);
        editorEdit.apply();
    }

    public static String a(Context context, String str, String str2, String str3) {
        return context == null ? str3 : context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    public static String a(Context context, String str, String str2) {
        return a(context, a(context, ""), str, str2);
    }

    public static boolean a(Context context, String str, String str2, boolean z10) {
        return context == null ? z10 : context.getSharedPreferences(str, 0).getBoolean(str2, z10);
    }

    public static int a(Context context, String str, String str2, int i10) {
        return context == null ? i10 : context.getSharedPreferences(str, 0).getInt(str2, i10);
    }

    public static int a(Context context, String str, int i10) {
        return a(context, a(context, ""), str, i10);
    }
}
