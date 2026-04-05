package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.webkit.WebResourceResponse;
import android.widget.RelativeLayout;
import java.io.InputStream;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class D2 {
    public static final boolean a(String str) {
        return str != null && str.length() > 0;
    }

    public static final int b(float f10) {
        try {
            return mv.d.roundToInt(f10);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final int c(float f10) {
        try {
            return (int) (f10 / AbstractC2679a4.b());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final boolean a(JSONArray jSONArray) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jSONArray, "<this>");
        return jSONArray.length() == 0;
    }

    public static final WebResourceResponse a(InputStream inputStream, String mimeType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(inputStream, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(mimeType, "mimeType");
        Map mapMapOf = uu.o1.mapOf(tu.e0.to("Access-Control-Allow-Origin", "*"));
        if (R3.Q()) {
            return new WebResourceResponse(mimeType, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME, 200, "OK", mapMapOf, inputStream);
        }
        return new WebResourceResponse(mimeType, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME, inputStream);
    }

    public static final int a(int i10) {
        try {
            return (int) (i10 / AbstractC2679a4.b());
        } catch (Exception unused) {
            return i10;
        }
    }

    public static final float a(float f10) {
        return mv.d.roundToInt(f10 * 10.0f) / 10.0f;
    }

    public static final Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter filter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(filter, "filter");
        if (R3.f32183a.L()) {
            return context.registerReceiver(broadcastReceiver, filter, 2);
        }
        return context.registerReceiver(broadcastReceiver, filter);
    }

    public static final boolean a(Context context) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "<this>");
        if (!R3.f32183a.N()) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
            applicationInfo = packageInfo.applicationInfo;
        } catch (Exception unused) {
        }
        int i10 = applicationInfo != null ? applicationInfo.targetSdkVersion : -1;
        return i10 >= 35;
    }

    public static final void a(bg bgVar, RelativeLayout.LayoutParams layoutParams, EnumC3108za orientation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bgVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutParams, "layoutParams");
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        bgVar.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        ag agVar = (ag) bgVar.f32694a.get(orientation);
        int i10 = agVar != null ? agVar.f32659a : 0;
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        ag agVar2 = (ag) bgVar.f32694a.get(orientation);
        int i11 = agVar2 != null ? agVar2.f32661c : 0;
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        ag agVar3 = (ag) bgVar.f32694a.get(orientation);
        layoutParams.setMargins(i10, 0, i11, agVar3 != null ? agVar3.f32662d : 0);
    }
}
