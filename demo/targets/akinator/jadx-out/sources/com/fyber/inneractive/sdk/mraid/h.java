package com.fyber.inneractive.sdk.mraid;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import com.fyber.inneractive.sdk.web.j1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h extends e {
    public h(LinkedHashMap linkedHashMap, i0 i0Var, g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        i0 i0Var = this.f24173c;
        Map map = this.f24172b;
        Context contextA = com.fyber.inneractive.sdk.util.o.a(i0Var.f26879b);
        try {
            HashMap mapA = i0.a(map);
            Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event");
            for (String str : mapA.keySet()) {
                Object obj = mapA.get(str);
                if (obj instanceof Long) {
                    type.putExtra(str, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    type.putExtra(str, ((Integer) obj).intValue());
                } else {
                    type.putExtra(str, (String) obj);
                }
            }
            if (!(contextA instanceof Activity)) {
                type.setFlags(268435456);
            }
            contextA.startActivity(type);
            j1 j1Var = i0Var.f26884g;
            if (j1Var != null) {
                ((com.fyber.inneractive.sdk.web.b0) j1Var).d();
            }
        } catch (ActivityNotFoundException unused) {
            IAlog.a("There is no calendar app installed!", new Object[0]);
            i0Var.a(k.CREATE_CALENDAR_EVENT, "Action is unsupported on this device - no calendar app installed");
        } catch (IllegalArgumentException e10) {
            IAlog.a("invalid parameters for create calendar ", e10.getMessage());
            i0Var.a(k.CREATE_CALENDAR_EVENT, e10.getMessage());
        } catch (Throwable unused2) {
            IAlog.a("Failed to create calendar event.", new Object[0]);
            i0Var.a(k.CREATE_CALENDAR_EVENT, "could not create calendar event");
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.e
    public final String c() {
        return null;
    }
}
