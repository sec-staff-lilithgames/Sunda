package com.unity3d.ads.core.data.datasource;

import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidFIdDataSource$invoke$1$1$1$1 extends f0 implements l {
    final /* synthetic */ d<String> $cont;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidFIdDataSource$invoke$1$1$1$1(d<? super String> dVar) {
        super(1);
        this.$cont = dVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return x0.f87415a;
    }

    public final void invoke(String str) {
        this.$cont.resumeWith(z.m7131constructorimpl(str));
    }
}
