package com.bumptech.glide.manager;

import android.content.Context;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    public final Context f16632b;

    /* renamed from: c, reason: collision with root package name */
    public final b f16633c;

    public e(Context context, b bVar) {
        this.f16632b = context.getApplicationContext();
        this.f16633c = bVar;
    }

    @Override // com.bumptech.glide.manager.c, com.bumptech.glide.manager.o
    public void onStart() {
        d0 d0VarB = d0.b(this.f16632b);
        b bVar = this.f16633c;
        synchronized (d0VarB) {
            ((HashSet) d0VarB.f16631c).add(bVar);
            if (!d0VarB.f16629a && !((HashSet) d0VarB.f16631c).isEmpty()) {
                d0VarB.f16629a = ((c0) d0VarB.f16630b).register();
            }
        }
    }

    @Override // com.bumptech.glide.manager.c, com.bumptech.glide.manager.o
    public void onStop() {
        d0 d0VarB = d0.b(this.f16632b);
        b bVar = this.f16633c;
        synchronized (d0VarB) {
            ((HashSet) d0VarB.f16631c).remove(bVar);
            if (d0VarB.f16629a && ((HashSet) d0VarB.f16631c).isEmpty()) {
                ((c0) d0VarB.f16630b).unregister();
                d0VarB.f16629a = false;
            }
        }
    }

    @Override // com.bumptech.glide.manager.c, com.bumptech.glide.manager.o
    public void onDestroy() {
    }
}
