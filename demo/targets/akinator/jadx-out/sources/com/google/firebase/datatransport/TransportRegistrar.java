package com.google.firebase.datatransport;

import android.content.Context;
import bi.b0;
import bi.c;
import bi.d;
import bi.q;
import bk.b;
import bk.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import jd.l;
import kd.a;
import md.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l lambda$getComponents$0(d dVar) {
        h0.initialize((Context) dVar.get(Context.class));
        return h0.getInstance().newFactory(a.f70806f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l lambda$getComponents$1(d dVar) {
        h0.initialize((Context) dVar.get(Context.class));
        return h0.getInstance().newFactory(a.f70806f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l lambda$getComponents$2(d dVar) {
        h0.initialize((Context) dVar.get(Context.class));
        return h0.getInstance().newFactory(a.f70805e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c> getComponents() {
        return Arrays.asList(c.builder(l.class).name(LIBRARY_NAME).add(q.required((Class<?>) Context.class)).factory(new b(7)).build(), c.builder(b0.qualified(si.a.class, l.class)).add(q.required((Class<?>) Context.class)).factory(new b(8)).build(), c.builder(b0.qualified(si.b.class, l.class)).add(q.required((Class<?>) Context.class)).factory(new b(9)).build(), i.create(LIBRARY_NAME, "19.0.0"));
    }
}
