package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import bi.c;
import bi.q;
import bk.i;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.g;
import java.util.Arrays;
import java.util.List;
import yh.d;
import yh.f;
import zh.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ d lambda$getComponents$0(bi.d dVar) {
        return f.getInstance((g) dVar.get(g.class), (Context) dVar.get(Context.class), (yi.d) dVar.get(yi.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c> getComponents() {
        return Arrays.asList(c.builder(d.class).add(q.required((Class<?>) g.class)).add(q.required((Class<?>) Context.class)).add(q.required((Class<?>) yi.d.class)).factory(b.f97967a).eagerInDefaultApp().build(), i.create("fire-analytics", "23.0.0"));
    }
}
