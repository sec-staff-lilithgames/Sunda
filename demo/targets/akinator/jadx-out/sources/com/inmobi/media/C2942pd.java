package com.inmobi.media;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.pd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2942pd {

    /* renamed from: a, reason: collision with root package name */
    public static final C2942pd f33272a = new C2942pd();

    /* renamed from: b, reason: collision with root package name */
    public static String f33273b = null;

    /* renamed from: c, reason: collision with root package name */
    public static String f33274c = "dir";

    public static final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f33274c = str;
    }

    public static /* synthetic */ void b() {
    }

    public static final String c() {
        return "10.8.8";
    }

    public static final String d() {
        return f33274c;
    }

    public static final String f() {
        return f33273b;
    }

    public static final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f33273b = str;
    }

    public static final String a() {
        return !TextUtils.isEmpty("") ? "pr-SAND-10.8.8-20250926-" : "pr-SAND-10.8.8-20250926";
    }

    public final boolean b(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        ConcurrentHashMap concurrentHashMap = I6.f31865b;
        I6 i6A = H6.a(context, "sdk_version_store");
        kotlin.jvm.internal.e0.checkNotNullParameter("db_deletion_failed", C3191e4.h.W);
        return i6A.f31866a.getBoolean("db_deletion_failed", false);
    }

    public final String a(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        ConcurrentHashMap concurrentHashMap = I6.f31865b;
        I6 i6A = H6.a(context, "sdk_version_store");
        kotlin.jvm.internal.e0.checkNotNullParameter("sdk_version", C3191e4.h.W);
        return i6A.f31866a.getString("sdk_version", null);
    }

    public final void a(Context context, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        ConcurrentHashMap concurrentHashMap = I6.f31865b;
        I6.a(H6.a(context, "sdk_version_store"), "sdk_version", str, false, 4, (Object) null);
    }

    public final void a(Context context, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        ConcurrentHashMap concurrentHashMap = I6.f31865b;
        I6.a(H6.a(context, "sdk_version_store"), "db_deletion_failed", z10, false, 4, (Object) null);
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void g() {
    }
}
