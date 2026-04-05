package com.moloco.sdk.internal.services;

import android.content.Context;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47162a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public n(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f47162a = context;
    }

    @Override // com.moloco.sdk.internal.services.m
    public boolean a() {
        try {
            return Settings.Secure.getInt(this.f47162a.getContentResolver(), "reduce_bright_colors_activated") == 1;
        } catch (Settings.SettingNotFoundException | SecurityException unused) {
            return false;
        }
    }

    @Override // com.moloco.sdk.internal.services.m
    public boolean b() {
        Context context = this.f47162a;
        Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        return ((AccessibilityManager) systemService).isEnabled() && Settings.Secure.getInt(context.getContentResolver(), "accessibility_large_pointer_icon", 0) == 1;
    }

    @Override // com.moloco.sdk.internal.services.m
    public boolean c() {
        try {
            Object systemService = this.f47162a.getSystemService("captioning");
            kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.CaptioningManager");
            return ((CaptioningManager) systemService).isEnabled();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.moloco.sdk.internal.services.m
    public float getFontScale() {
        Context context = this.f47162a;
        Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        if (((AccessibilityManager) systemService).isEnabled()) {
            return context.getResources().getConfiguration().fontScale;
        }
        return 1.0f;
    }
}
