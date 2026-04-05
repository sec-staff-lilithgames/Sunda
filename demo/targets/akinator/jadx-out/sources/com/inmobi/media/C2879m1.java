package com.inmobi.media;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.m1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2879m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C2879m1 f33066a = new C2879m1();

    /* renamed from: b, reason: collision with root package name */
    public static LinkedHashSet f33067b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f33068c;

    public static final boolean a(C2879m1 c2879m1, Context context) {
        c2879m1.getClass();
        try {
            Object systemService = context.getSystemService("activity");
            kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                String packageName = context.getPackageName();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (packageName.equals(runningAppProcessInfo.processName)) {
                        return runningAppProcessInfo.importance == 100;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("m1", "TAG");
            return false;
        }
    }

    public static final /* synthetic */ String b() {
        return "m1";
    }

    public final void c() {
        f33068c = true;
    }

    public final void d() {
        f33068c = false;
    }

    public static final void a(C2879m1 c2879m1, boolean z10) {
        LinkedHashSet linkedHashSet;
        c2879m1.getClass();
        if (C2925od.d() == null || (linkedHashSet = f33067b) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            try {
                ((C2707bf) ((InterfaceC2845k1) it.next())).a(z10);
            } catch (Exception unused) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("m1", "TAG");
            }
        }
    }

    public final void a(Context context, InterfaceC2845k1 listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        if (f33067b == null) {
            f33067b = new LinkedHashSet();
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                try {
                    application.registerActivityLifecycleCallbacks(new C2862l1(context));
                } catch (Throwable unused) {
                }
            }
        }
        LinkedHashSet linkedHashSet = f33067b;
        if (linkedHashSet != null) {
            linkedHashSet.add(listener);
        }
    }
}
