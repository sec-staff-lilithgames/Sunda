package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.i1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2812i1 {

    /* renamed from: a, reason: collision with root package name */
    public static AppSetIdInfo f32915a;

    static {
        b();
    }

    public static final void a(kv.l tmp0, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static void b() {
        Context contextD = C2925od.d();
        if (contextD != null && a()) {
            AppSetIdClient client = AppSet.getClient(contextD);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(client, "getClient(...)");
            Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(appSetIdInfo, "getAppSetIdInfo(...)");
            appSetIdInfo.addOnSuccessListener(new b1.l(2, C2795h1.f32892a));
        }
    }

    public static boolean a() {
        try {
            kotlin.jvm.internal.c1.getOrCreateKotlinClass(AppSetIdInfo.class).getSimpleName();
            kotlin.jvm.internal.c1.getOrCreateKotlinClass(Task.class).getSimpleName();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }
}
