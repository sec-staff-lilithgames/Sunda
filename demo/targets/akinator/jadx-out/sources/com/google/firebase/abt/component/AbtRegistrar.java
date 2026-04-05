package com.google.firebase.abt.component;

import android.content.Context;
import bi.c;
import bi.d;
import bi.q;
import bk.b;
import bk.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import wh.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(d dVar) {
        return new a((Context) dVar.get(Context.class), dVar.getProvider(yh.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c> getComponents() {
        return Arrays.asList(c.builder(a.class).name(LIBRARY_NAME).add(q.required((Class<?>) Context.class)).add(q.optionalProvider((Class<?>) yh.d.class)).factory(new b(11)).build(), i.create(LIBRARY_NAME, "21.1.1"));
    }
}
