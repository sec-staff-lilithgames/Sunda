package io.bidmachine.iab.vast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.view.View;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class VastHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f60385a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final BroadcastReceiver f60386b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final IntentFilter f60387c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f60388d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f60389e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (VastHelper.class) {
                VastHelper.f60389e = "android.intent.action.SCREEN_ON".equals(intent.getAction());
            }
            WeakHashMap weakHashMap = VastHelper.f60385a;
            synchronized (weakHashMap) {
                try {
                    Iterator it = weakHashMap.values().iterator();
                    while (it.hasNext()) {
                        ((vm.j) ((d) it.next())).onScreenStateChange(VastHelper.f60389e);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static {
        IntentFilter intentFilter = new IntentFilter();
        f60387c = intentFilter;
        f60388d = false;
        f60389e = false;
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
    }

    public static synchronized void a(Context context) {
        if (!f60388d) {
            synchronized (VastHelper.class) {
                try {
                    if (!f60388d) {
                        f60389e = ((PowerManager) context.getSystemService("power")).isScreenOn();
                        context.getApplicationContext().registerReceiver(f60386b, f60387c);
                        f60388d = true;
                    }
                } finally {
                }
            }
        }
    }

    public static void addScreenStateChangeListener(View view, d dVar) {
        a(view.getContext());
        WeakHashMap weakHashMap = f60385a;
        synchronized (weakHashMap) {
            weakHashMap.put(view, dVar);
        }
    }

    public static boolean isScreenOn(Context context) {
        a(context);
        return f60389e;
    }

    public static void removeScreenStateChangeListener(View view) {
        if (f60388d) {
            WeakHashMap weakHashMap = f60385a;
            synchronized (weakHashMap) {
                weakHashMap.remove(view);
            }
        }
    }
}
