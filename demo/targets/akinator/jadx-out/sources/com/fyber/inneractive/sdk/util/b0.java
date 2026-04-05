package com.fyber.inneractive.sdk.util;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f26761a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f26762b;

    /* renamed from: c, reason: collision with root package name */
    public Context f26763c;

    /* renamed from: d, reason: collision with root package name */
    public y f26764d;

    public static void a(b0 b0Var, Context context, Intent intent) {
        boolean zIsKeyguardLocked;
        synchronized (b0Var) {
            try {
                zIsKeyguardLocked = ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
            } catch (Exception unused) {
                IAlog.a("%sFailed to get lock screen status", IAlog.a(b0Var));
                zIsKeyguardLocked = false;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                b0Var.f26762b = true;
            } else if (("android.intent.action.SCREEN_ON".equals(intent.getAction()) && !zIsKeyguardLocked) || "android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                b0Var.f26762b = false;
            }
            IAlog.a("%sNew screen state is locked: %s. number of listeners: %d", IAlog.a(b0Var), Boolean.valueOf(b0Var.f26762b), Integer.valueOf(b0Var.f26761a.size()));
            Iterator it = b0Var.f26761a.iterator();
            while (it.hasNext()) {
                a0 a0Var = (a0) it.next();
                boolean z10 = b0Var.f26762b;
                com.fyber.inneractive.sdk.renderers.l lVar = (com.fyber.inneractive.sdk.renderers.l) a0Var;
                lVar.getClass();
                IAlog.a("%sgot onLockScreenStateChanged with: %s", IAlog.a(lVar), Boolean.valueOf(z10));
                if (z10) {
                    lVar.c(false);
                    com.fyber.inneractive.sdk.renderers.d dVar = lVar.f26589y;
                    if (dVar != null && dVar.f26563g) {
                        dVar.f26563g = false;
                        r.f26804b.removeCallbacks(dVar.f26566j);
                    }
                } else {
                    lVar.O();
                    com.fyber.inneractive.sdk.renderers.d dVar2 = lVar.f26589y;
                    if (dVar2 != null && !dVar2.f26564h && !dVar2.f26563g && dVar2.f26562f != 0) {
                        dVar2.f26562f = 0L;
                        dVar2.f26563g = true;
                        dVar2.a();
                    }
                }
            }
        }
    }
}
