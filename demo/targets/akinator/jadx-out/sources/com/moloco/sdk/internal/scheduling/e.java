package com.moloco.sdk.internal.scheduling;

import bv.n;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final CoroutineScope f46751a = CoroutineScopeKt.CoroutineScope(c.a().getMainImmediate());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ kv.a f46752i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kv.a aVar, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f46752i = aVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new a(this.f46752i, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            this.f46752i.invoke();
            return x0.f87415a;
        }
    }

    public static final Job a(kv.a block) {
        e0.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(f46751a, null, null, new a(block, null), 3, null);
    }
}
