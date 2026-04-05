package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(bi.b0 b0Var, bi.d dVar) {
        com.google.firebase.g gVar = (com.google.firebase.g) dVar.get(com.google.firebase.g.class);
        if (dVar.get(aj.a.class) == null) {
            return new FirebaseMessaging(gVar, dVar.getProvider(bk.j.class), dVar.getProvider(zi.h.class), (tj.f) dVar.get(tj.f.class), dVar.getProvider(b0Var), (yi.d) dVar.get(yi.d.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<bi.c> getComponents() {
        bi.b0 b0VarQualified = bi.b0.qualified(si.b.class, jd.l.class);
        return Arrays.asList(bi.c.builder(FirebaseMessaging.class).name(LIBRARY_NAME).add(bi.q.required((Class<?>) com.google.firebase.g.class)).add(bi.q.optional(aj.a.class)).add(bi.q.optionalProvider((Class<?>) bk.j.class)).add(bi.q.optionalProvider((Class<?>) zi.h.class)).add(bi.q.required((Class<?>) tj.f.class)).add(bi.q.optionalProvider(b0VarQualified)).add(bi.q.required((Class<?>) yi.d.class)).factory(new u(b0VarQualified, 0)).alwaysEager().build(), bk.i.create(LIBRARY_NAME, "25.0.1"));
    }
}
