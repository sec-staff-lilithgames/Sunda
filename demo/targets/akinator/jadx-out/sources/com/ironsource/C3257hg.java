package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.hg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3257hg {
    public static void a(Context context, String str) throws Exception {
        a(context, str, null);
    }

    public static void a(Context context, String str, String str2) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception("url is null");
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (!TextUtils.isEmpty(str2)) {
            intent.setPackage(str2);
        }
        context.startActivity(intent);
    }
}
