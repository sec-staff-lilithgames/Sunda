package com.digitalturbine.ignite.authenticator.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bb.b;
import org.json.JSONArray;
import org.json.JSONException;
import ua.d;
import wa.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public b f21827a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21828b = false;

    public a(b bVar) {
        this.f21827a = bVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b bVar;
        if ("com.dt.ignite.service.action.PROPERTY_CHANGED".equals(intent.getAction())) {
            cb.b.a("%s : broadcast received", "PropertyChangeReceiver");
            String stringExtra = intent.getStringExtra("PROPERTIES_CHANGED");
            if (stringExtra == null || (bVar = this.f21827a) == null) {
                return;
            }
            d dVar = (d) bVar;
            try {
                JSONArray jSONArray = new JSONArray(stringExtra);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if ("DTID".equalsIgnoreCase(jSONArray.getString(i10))) {
                        cb.b.a("%s : onPropertiesChanged", "OneDTPropertyWatchdog");
                        if (!dVar.f88182c.c()) {
                            h hVar = dVar.f88183d;
                            if (hVar != null) {
                                hVar.m();
                                return;
                            }
                            return;
                        }
                        cb.b.a("%s : onPropertiesChanged: will reconnect", "OneDTPropertyWatchdog");
                        h hVar2 = dVar.f88183d;
                        if (hVar2 != null) {
                            cb.b.a("%s : one dt refresh required", "OneDTAuthenticator");
                            hVar2.f90503m.set(true);
                        }
                        dVar.f88182c.l();
                        return;
                    }
                }
            } catch (JSONException e10) {
                ya.b.a(ya.d.ONE_DT_BROADCAST_ERROR, e10);
            }
        }
    }
}
