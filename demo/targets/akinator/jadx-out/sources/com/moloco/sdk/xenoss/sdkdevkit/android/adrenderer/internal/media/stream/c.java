package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

import bv.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d;
import java.io.File;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kv.l;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a {

    /* renamed from: a, reason: collision with root package name */
    public d f47990a;

    /* renamed from: b, reason: collision with root package name */
    public final Flow f47991b;

    /* renamed from: c, reason: collision with root package name */
    public l f47992c;

    /* renamed from: d, reason: collision with root package name */
    public p f47993d;

    /* renamed from: e, reason: collision with root package name */
    public l f47994e;

    /* renamed from: f, reason: collision with root package name */
    public l f47995f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f47996i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f47997j;

        public a(zu.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ProducerScope<? super d> producerScope, zu.d<? super x0> dVar) {
            return ((a) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            a aVar = c.this.new a(dVar);
            aVar.f47997j = obj;
            return aVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f47996i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                final ProducerScope producerScope = (ProducerScope) this.f47997j;
                final int i11 = 0;
                l lVar = new l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b
                    @Override // kv.l
                    public final Object invoke(Object obj2) {
                        switch (i11) {
                            case 0:
                                return c.a.a(producerScope, (File) obj2);
                            case 1:
                                return c.a.a(producerScope, (d.a) obj2);
                            default:
                                return c.a.a(producerScope, (d.b) obj2);
                        }
                    }
                };
                c cVar = c.this;
                cVar.f47992c = lVar;
                cVar.f47993d = new a1.a(producerScope, 4);
                final int i12 = 1;
                cVar.f47994e = new l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b
                    @Override // kv.l
                    public final Object invoke(Object obj2) {
                        switch (i12) {
                            case 0:
                                return c.a.a(producerScope, (File) obj2);
                            case 1:
                                return c.a.a(producerScope, (d.a) obj2);
                            default:
                                return c.a.a(producerScope, (d.b) obj2);
                        }
                    }
                };
                final int i13 = 2;
                cVar.f47995f = new l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b
                    @Override // kv.l
                    public final Object invoke(Object obj2) {
                        switch (i13) {
                            case 0:
                                return c.a.a(producerScope, (File) obj2);
                            case 1:
                                return c.a.a(producerScope, (d.a) obj2);
                            default:
                                return c.a.a(producerScope, (d.b) obj2);
                        }
                    }
                };
                a1.e eVar = new a1.e(cVar, 13);
                this.f47996i = 1;
                if (ProduceKt.awaitClose(producerScope, eVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }

        public static final x0 a(ProducerScope producerScope, File file) {
            producerScope.mo5139trySendJP2dKIU(new d.c(file, new d.C0412d(0L, 0L)));
            return x0.f87415a;
        }

        public static final x0 a(ProducerScope producerScope, File file, d.C0412d c0412d) {
            producerScope.mo5139trySendJP2dKIU(new d.c(file, c0412d));
            return x0.f87415a;
        }

        public static final x0 a(ProducerScope producerScope, d.a aVar) {
            producerScope.mo5139trySendJP2dKIU(aVar);
            return x0.f87415a;
        }

        public static final x0 a(ProducerScope producerScope, d.b bVar) {
            producerScope.mo5139trySendJP2dKIU(bVar);
            return x0.f87415a;
        }

        public static final x0 a(c cVar) {
            cVar.f47992c = null;
            cVar.f47993d = null;
            cVar.f47994e = null;
            cVar.f47995f = null;
            return x0.f87415a;
        }
    }

    public c(d initialStatus) {
        e0.checkNotNullParameter(initialStatus, "initialStatus");
        this.f47990a = initialStatus;
        this.f47991b = FlowKt.callbackFlow(new a(null));
    }

    public final Flow<d> b() {
        return this.f47991b;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a
    public d a() {
        return this.f47990a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a
    public void a(File file) {
        e0.checkNotNullParameter(file, "file");
        this.f47990a = new d.c(file, new d.C0412d(0L, 0L));
        l lVar = this.f47992c;
        if (lVar != null) {
            lVar.invoke(file);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a
    public void a(File file, d.C0412d progress) {
        e0.checkNotNullParameter(file, "file");
        e0.checkNotNullParameter(progress, "progress");
        this.f47990a = new d.c(file, progress);
        p pVar = this.f47993d;
        if (pVar != null) {
            pVar.invoke(file, progress);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a
    public void a(d.a result) {
        e0.checkNotNullParameter(result, "result");
        this.f47990a = result;
        l lVar = this.f47994e;
        if (lVar != null) {
            lVar.invoke(result);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a
    public void a(d.b error) {
        e0.checkNotNullParameter(error, "error");
        this.f47990a = error;
        l lVar = this.f47995f;
        if (lVar != null) {
            lVar.invoke(error);
        }
    }
}
