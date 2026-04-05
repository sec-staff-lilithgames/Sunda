package com.iab.omid.library.ironsrc.internal;

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
    private static j f30940d = new j();

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f30941a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f30942b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30943c = false;

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
                z10 = jVar.f30943c;
                z11 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                jVar = j.this;
                z10 = jVar.f30943c;
                z11 = false;
            }
            jVar.a(z11, z10);
            j.this.f30942b = z11;
        }
    }

    public static j b() {
        return f30940d;
    }

    public void a() {
        Context context = this.f30941a.get();
        if (context == null) {
            return;
        }
        boolean zIsDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        a(this.f30942b, zIsDeviceLocked);
        this.f30943c = zIsDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.f30941a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f30943c || this.f30942b)) {
            return;
        }
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().b(z11 || z10);
        }
    }
}
