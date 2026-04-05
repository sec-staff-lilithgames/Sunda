package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2776g extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2793h f32849a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2776g(C2793h c2793h) {
        super(0);
        this.f32849a = c2793h;
    }

    @Override // kv.a
    public final Object invoke() {
        return new AdMetaInfo(this.f32849a.o(), this.f32849a.E());
    }
}
