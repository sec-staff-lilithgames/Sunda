package com.google.firebase.installations;

import ai.a;
import ai.b;
import bi.b0;
import bi.c;
import bi.d;
import bi.q;
import bk.i;
import ci.m;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.g;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import tj.e;
import tj.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(d dVar) {
        return new e((g) dVar.get(g.class), dVar.getProvider(zi.f.class), (ExecutorService) dVar.get(b0.qualified(a.class, ExecutorService.class)), m.newSequentialExecutor((Executor) dVar.get(b0.qualified(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c> getComponents() {
        return Arrays.asList(c.builder(f.class).name(LIBRARY_NAME).add(q.required((Class<?>) g.class)).add(q.optionalProvider((Class<?>) zi.f.class)).add(q.required(b0.qualified(a.class, ExecutorService.class))).add(q.required(b0.qualified(b.class, Executor.class))).factory(new bk.b(10)).build(), zi.e.create(), i.create(LIBRARY_NAME, "19.0.1"));
    }
}
