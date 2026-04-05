package com.fyber.inneractive.sdk.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.factories.h;
import com.fyber.inneractive.sdk.factories.i;
import com.fyber.inneractive.sdk.player.cache.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.s;
import com.fyber.inneractive.sdk.util.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class IAVideoKit extends BroadcastReceiver {
    private static final w sProvider = new a();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        w wVar = sProvider;
        IAConfigManager.O.J.put(wVar.getType(), wVar);
        n nVar = n.f24382f;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            nVar.getClass();
            IAlog.f("context is null, would not start the video cache.", new Object[0]);
        } else if (!nVar.f24385c || !s.a()) {
            nVar.f24383a = applicationContext;
            new Thread(nVar.f24387e, "VideoCache").start();
        }
        IAlog.a("IAVideoKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        com.fyber.inneractive.sdk.factories.d.f23522a.a(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_VAST, new b());
        i iVar = h.f23524a;
        iVar.f23525a.add(new c());
        com.fyber.inneractive.sdk.factories.c cVar = com.fyber.inneractive.sdk.factories.b.f23520a;
        cVar.f23521a.add(new d());
    }
}
