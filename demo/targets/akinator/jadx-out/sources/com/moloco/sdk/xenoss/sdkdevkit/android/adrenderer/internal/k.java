package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.view.View;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class k implements j {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f47808i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f47809j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ View f47810k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f47810k = view;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ProducerScope<? super Boolean> producerScope, zu.d<? super x0> dVar) {
            return ((a) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            a aVar = new a(this.f47810k, dVar);
            aVar.f47809j = obj;
            return aVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f47808i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                ProducerScope producerScope = (ProducerScope) this.f47809j;
                this.f47808i = 1;
                if (l.d(producerScope, this.f47810k, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j
    public Flow<Boolean> a(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        return l.b(FlowKt.channelFlow(new a(view, null)));
    }
}
