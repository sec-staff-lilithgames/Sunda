package com.unity3d.services.core.network.core;

import kotlin.jvm.internal.f0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class OkHttp3Client$makeRequest$2$1$onResponse$2 extends f0 implements l {
    public static final OkHttp3Client$makeRequest$2$1$onResponse$2 INSTANCE = new OkHttp3Client$makeRequest$2$1$onResponse$2();

    public OkHttp3Client$makeRequest$2$1$onResponse$2() {
        super(1);
    }

    public final Boolean invoke(long j10) {
        return Boolean.valueOf(j10 != -1);
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }
}
