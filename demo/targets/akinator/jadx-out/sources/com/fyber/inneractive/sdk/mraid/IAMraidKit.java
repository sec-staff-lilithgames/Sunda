package com.fyber.inneractive.sdk.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class IAMraidKit extends BroadcastReceiver {
    private static final com.fyber.inneractive.sdk.util.w sProvider = new a();

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isMRaidSpotContent(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof q0);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IAlog.a("IAMraidKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        com.fyber.inneractive.sdk.util.w wVar = sProvider;
        IAConfigManager.O.J.put(wVar.getType(), wVar);
        b bVar = new b();
        com.fyber.inneractive.sdk.factories.f fVar = com.fyber.inneractive.sdk.factories.d.f23522a;
        fVar.a(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_HTML, bVar);
        fVar.a(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID, bVar);
        com.fyber.inneractive.sdk.factories.i iVar = com.fyber.inneractive.sdk.factories.h.f23524a;
        iVar.f23525a.add(new c(this));
        com.fyber.inneractive.sdk.factories.c cVar = com.fyber.inneractive.sdk.factories.b.f23520a;
        cVar.f23521a.add(new d(this));
    }
}
