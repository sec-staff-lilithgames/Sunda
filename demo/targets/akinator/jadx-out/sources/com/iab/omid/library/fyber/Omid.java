package com.iab.omid.library.fyber;

import android.content.Context;

/* loaded from: classes7.dex */
public final class Omid {
    private static b INSTANCE = new b();

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f30608a = 0;

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.a();
    }

    public static boolean isActive() {
        return INSTANCE.b();
    }

    public static void updateLastActivity() {
        INSTANCE.c();
    }
}
