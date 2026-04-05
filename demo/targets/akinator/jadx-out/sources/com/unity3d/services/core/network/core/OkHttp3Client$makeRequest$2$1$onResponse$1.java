package com.unity3d.services.core.network.core;

import kotlin.jvm.internal.f0;
import kv.a;
import pw.g;
import pw.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class OkHttp3Client$makeRequest$2$1$onResponse$1 extends f0 implements a {
    final /* synthetic */ g $buffer;
    final /* synthetic */ k $source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttp3Client$makeRequest$2$1$onResponse$1(k kVar, g gVar) {
        super(0);
        this.$source = kVar;
        this.$buffer = gVar;
    }

    @Override // kv.a
    public final Long invoke() {
        return Long.valueOf(this.$source.read(this.$buffer, 8192L));
    }
}
