package com.iab.omid.library.inmobi.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class j {

    /* renamed from: d, reason: collision with root package name */
    private static j f30805d = new j();

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f30806a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f30807b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30808c = false;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j jVar;
            boolean z10;
            boolean z11;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                jVar = j.this;
                z10 = jVar.f30808c;
                z11 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                jVar = j.this;
                z10 = jVar.f30808c;
                z11 = false;
            }
            jVar.a(z11, z10);
            j.this.f30807b = z11;
        }
    }

    public static j b() {
        return f30805d;
    }

    public void a() {
        KeyguardManager keyguardManager;
        Context context = this.f30806a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        a(this.f30807b, zIsDeviceLocked);
        this.f30808c = zIsDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.f30806a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f30808c || this.f30807b)) {
            return;
        }
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().d().b(z11 || z10);
        }
    }
}
