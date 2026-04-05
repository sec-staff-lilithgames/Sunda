package com.iab.omid.library.vungle.internal;

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
    private static j f31455d = new j();

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f31456a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31457b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31458c = false;

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
                z10 = jVar.f31458c;
                z11 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                jVar = j.this;
                z10 = jVar.f31458c;
                z11 = false;
            }
            jVar.a(z11, z10);
            j.this.f31457b = z11;
        }
    }

    public static j b() {
        return f31455d;
    }

    public void a() {
        Context context = this.f31456a.get();
        if (context == null) {
            return;
        }
        boolean zIsDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        a(this.f31457b, zIsDeviceLocked);
        this.f31458c = zIsDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.f31456a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f31458c || this.f31457b)) {
            return;
        }
        Iterator<com.iab.omid.library.vungle.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().d().b(z11 || z10);
        }
    }
}
