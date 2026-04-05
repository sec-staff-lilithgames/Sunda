package com.moloco.sdk.internal.ortb;

import av.e;
import bv.n;
import com.moloco.sdk.internal.w;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements com.moloco.sdk.internal.ortb.a {

    /* renamed from: a, reason: collision with root package name */
    public final Json f46073a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.scheduling.a f46074b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f46076j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f46076j = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super w> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return b.this.new a(this.f46076j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            try {
                Json json = b.this.f46073a;
                String str = this.f46076j;
                KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json.getSerializersModule(), c1.typeOf(com.moloco.sdk.internal.ortb.model.e.class));
                e0.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                return new w.b(d.a((com.moloco.sdk.internal.ortb.model.e) json.decodeFromString(kSerializerSerializer, str)));
            } catch (Exception e10) {
                return new w.a(e10);
            }
        }
    }

    public b(Json json) {
        e0.checkNotNullParameter(json, "json");
        this.f46073a = json;
        this.f46074b = com.moloco.sdk.internal.scheduling.c.a();
    }

    @Override // com.moloco.sdk.internal.ortb.a
    public Object a(String str, zu.d<? super w> dVar) {
        return BuildersKt.withContext(this.f46074b.getIo(), new a(str, null), dVar);
    }
}
