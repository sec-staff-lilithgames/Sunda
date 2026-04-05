package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ie, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2825ie {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f32935a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static C2808he f32936b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f32937c;

    public static void a() {
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_IMPRESSIONEVENT, "TAG");
        b("android.intent.action.ACTION_SHUTDOWN");
        b("android.intent.action.REBOOT");
        R3 r32 = R3.f32183a;
        if (r32.R()) {
            b("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        b("android.intent.action.USER_PRESENT");
        if (r32.H()) {
            b("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            b("android.net.conn.CONNECTIVITY_CHANGE");
        }
        f32935a.clear();
    }

    public static void b() {
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_IMPRESSIONEVENT, "TAG");
        a("android.intent.action.ACTION_SHUTDOWN");
        a("android.intent.action.REBOOT");
        R3 r32 = R3.f32183a;
        if (r32.R()) {
            a("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        a("android.intent.action.USER_PRESENT");
        if (r32.H()) {
            a("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            a("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    public static void b(String str) {
        Context contextD = C2925od.d();
        if (contextD != null) {
            if (R3.f32183a.H() && kotlin.jvm.internal.e0.areEqual("SYSTEM_CONNECTIVITY_CHANGE", str) && f32936b != null) {
                Object systemService = contextD.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    C2808he c2808he = f32936b;
                    kotlin.jvm.internal.e0.checkNotNull(c2808he);
                    connectivityManager.unregisterNetworkCallback(c2808he);
                    f32936b = null;
                    return;
                }
                return;
            }
            ConcurrentHashMap concurrentHashMap = f32935a;
            if (concurrentHashMap.get(str) != null) {
                contextD.unregisterReceiver((BroadcastReceiver) concurrentHashMap.get(str));
                concurrentHashMap.remove(str);
            }
        }
    }

    public static void a(String str) {
        Context contextD = C2925od.d();
        if (contextD != null) {
            if (R3.f32183a.H() && kotlin.jvm.internal.e0.areEqual("SYSTEM_CONNECTIVITY_CHANGE", str)) {
                Object systemService = contextD.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    C2808he c2808he = new C2808he();
                    f32936b = c2808he;
                    connectivityManager.registerDefaultNetworkCallback(c2808he);
                    return;
                }
                return;
            }
            ConcurrentHashMap concurrentHashMap = f32935a;
            if (concurrentHashMap.get(str) == null) {
                C2791ge c2791ge = new C2791ge();
                concurrentHashMap.put(str, c2791ge);
                D2.a(contextD, c2791ge, new IntentFilter(str));
            }
        }
    }

    public static final void a(Context context, Intent intent) {
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_IMPRESSIONEVENT, "TAG");
        if (intent.getAction() == null) {
            return;
        }
        try {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_IMPRESSIONEVENT, "TAG");
            intent.getAction();
            boolean zIsDeviceIdleMode = false;
            if (kotlin.jvm.internal.e0.areEqual("android.net.conn.CONNECTIVITY_CHANGE", intent.getAction())) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || activeNetworkInfo.isConnected() != f32937c) {
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            zIsDeviceIdleMode = true;
                        }
                        f32937c = zIsDeviceIdleMode;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_IMPRESSIONEVENT, "TAG");
                        C2925od.f().b(new C2762f2(10, 4, f32937c ? "available" : "lost"));
                        return;
                    }
                    return;
                }
                return;
            }
            if (sv.k0.equals("android.os.action.DEVICE_IDLE_MODE_CHANGED", intent.getAction(), true)) {
                Object systemService2 = context.getSystemService("power");
                PowerManager powerManager = systemService2 instanceof PowerManager ? (PowerManager) systemService2 : null;
                if (powerManager != null && R3.f32183a.R()) {
                    zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
                }
                if (zIsDeviceIdleMode == f32937c || !R3.f32183a.R()) {
                    return;
                }
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_IMPRESSIONEVENT, "TAG");
                C2925od.f().b(new C2762f2(11, 4, String.valueOf(zIsDeviceIdleMode)));
                return;
            }
            if (kotlin.jvm.internal.e0.areEqual("android.intent.action.USER_PRESENT", intent.getAction())) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_IMPRESSIONEVENT, "TAG");
                C2925od.f().b(new C2762f2(100, 6, (String) null));
                return;
            }
            if (kotlin.jvm.internal.e0.areEqual("android.intent.action.ACTION_SHUTDOWN", intent.getAction())) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_IMPRESSIONEVENT, "TAG");
                C2925od.f().b(new C2762f2(1, 6, (String) null));
                Iterator it = f32935a.entrySet().iterator();
                while (it.hasNext()) {
                    b((String) ((Map.Entry) it.next()).getKey());
                }
                f32935a.clear();
                f32936b = null;
                return;
            }
            if (kotlin.jvm.internal.e0.areEqual("android.intent.action.REBOOT", intent.getAction())) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_IMPRESSIONEVENT, "TAG");
                C2925od.f().b(new C2762f2(2, 6, (String) null));
                Iterator it2 = f32935a.entrySet().iterator();
                while (it2.hasNext()) {
                    b((String) ((Map.Entry) it2.next()).getKey());
                }
                f32935a.clear();
                f32936b = null;
                return;
            }
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_IMPRESSIONEVENT, "TAG");
            C2925od.f().b(new C2762f2(99, 4, intent.getAction()));
        } catch (Exception unused) {
        }
    }
}
