package com.bumptech.glide.manager;

import androidx.lifecycle.k0;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f16643b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.localbroadcastmanager.content.b f16644c;

    public p(androidx.localbroadcastmanager.content.b bVar, k0 k0Var) {
        this.f16644c = bVar;
        this.f16643b = k0Var;
    }

    @Override // com.bumptech.glide.manager.o
    public void onDestroy() {
        ((HashMap) this.f16644c.f6756a).remove(this.f16643b);
    }

    @Override // com.bumptech.glide.manager.o
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.o
    public void onStop() {
    }
}
