package com.google.firebase.messaging;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class u implements bi.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bi.b0 f29891b;

    public /* synthetic */ u(bi.b0 b0Var, int i10) {
        this.f29890a = i10;
        this.f29891b = b0Var;
    }

    @Override // bi.i
    public final Object create(bi.d dVar) {
        switch (this.f29890a) {
            case 0:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.f29891b, dVar);
            default:
                return new zi.c((Context) dVar.get(Context.class), ((com.google.firebase.g) dVar.get(com.google.firebase.g.class)).getPersistenceKey(), dVar.setOf(zi.d.class), dVar.getProvider(bk.j.class), (Executor) dVar.get(this.f29891b));
        }
    }
}
