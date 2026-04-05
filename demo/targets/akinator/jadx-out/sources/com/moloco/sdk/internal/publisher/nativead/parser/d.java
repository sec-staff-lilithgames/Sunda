package com.moloco.sdk.internal.publisher.nativead.parser;

import android.content.Context;
import bv.n;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.nativead.model.a;
import com.moloco.sdk.internal.publisher.nativead.model.b;
import com.moloco.sdk.internal.w;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.e0;
import tu.o;
import tu.t;
import tu.v;
import tu.x0;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class d {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public a.AbstractC0378a.b f46588i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f46589j;

        /* renamed from: k, reason: collision with root package name */
        public int f46590k;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46589j = obj;
            this.f46590k |= Integer.MIN_VALUE;
            return d.b(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public long f46591i;

        /* renamed from: j, reason: collision with root package name */
        public Object f46592j;

        /* renamed from: k, reason: collision with root package name */
        public List f46593k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f46594l;

        /* renamed from: m, reason: collision with root package name */
        public int f46595m;

        public b(zu.d<? super b> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46594l = obj;
            this.f46595m |= Integer.MIN_VALUE;
            return d.a((Context) null, (List<? extends a.AbstractC0378a>) null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f46596i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f46597j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ List f46598k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ o f46599l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f46600m;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends n implements p {

            /* renamed from: i, reason: collision with root package name */
            public a.AbstractC0378a f46601i;

            /* renamed from: j, reason: collision with root package name */
            public int f46602j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ a.AbstractC0378a f46603k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ o f46604l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ long f46605m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a.AbstractC0378a abstractC0378a, o oVar, long j10, zu.d<? super a> dVar) {
                super(2, dVar);
                this.f46603k = abstractC0378a;
                this.f46604l = oVar;
                this.f46605m = j10;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super v> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new a(this.f46603k, this.f46604l, this.f46605m, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                a.AbstractC0378a abstractC0378a;
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f46602j;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    a.AbstractC0378a abstractC0378a2 = this.f46603k;
                    this.f46601i = abstractC0378a2;
                    this.f46602j = 1;
                    Object objB = d.b(abstractC0378a2, this.f46604l, this.f46605m, this);
                    if (objB == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    abstractC0378a = abstractC0378a2;
                    obj = objB;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC0378a = this.f46601i;
                    a0.throwOnFailure(obj);
                }
                return e0.to(abstractC0378a, obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<? extends a.AbstractC0378a> list, o oVar, long j10, zu.d<? super c> dVar) {
            super(2, dVar);
            this.f46598k = list;
            this.f46599l = oVar;
            this.f46600m = j10;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super List<? extends v>> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            c cVar = new c(this.f46598k, this.f46599l, this.f46600m, dVar);
            cVar.f46597j = obj;
            return cVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46596i;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return obj;
            }
            a0.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f46597j;
            List list = this.f46598k;
            ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new a((a.AbstractC0378a) it.next(), this.f46599l, this.f46600m, null), 3, null));
            }
            this.f46596i = 1;
            Object objAwaitAll = AwaitKt.awaitAll(arrayList, this);
            return objAwaitAll == coroutine_suspended ? coroutine_suspended : objAwaitAll;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.parser.d$d, reason: collision with other inner class name */
    public static final class C0381d extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f46606i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f46607j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ List f46608k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ o f46609l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f46610m;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.internal.publisher.nativead.parser.d$d$a */
        public static final class a extends n implements p {

            /* renamed from: i, reason: collision with root package name */
            public int f46611i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ a.AbstractC0378a f46612j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ o f46613k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ long f46614l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a.AbstractC0378a abstractC0378a, o oVar, long j10, zu.d<? super a> dVar) {
                super(2, dVar);
                this.f46612j = abstractC0378a;
                this.f46613k = oVar;
                this.f46614l = j10;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super v> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new a(this.f46612j, this.f46613k, this.f46614l, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) throws com.moloco.sdk.internal.publisher.nativead.parser.b {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f46611i;
                a.AbstractC0378a abstractC0378a = this.f46612j;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    this.f46611i = 1;
                    obj = d.b(abstractC0378a, this.f46613k, this.f46614l, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                }
                w wVar = (w) obj;
                if (wVar instanceof w.b) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "PrepareNativeAssets", "Successfully prepared native asset: " + abstractC0378a.a(), null, false, 12, null);
                    return e0.to(abstractC0378a, wVar);
                }
                if (!(wVar instanceof w.a)) {
                    throw new t();
                }
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "PrepareNativeAssets", "Failed to prepare required native asset: " + abstractC0378a.a(), null, false, 12, null);
                throw new com.moloco.sdk.internal.publisher.nativead.parser.b(abstractC0378a.a(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((w.a) wVar).a());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0381d(List<? extends a.AbstractC0378a> list, o oVar, long j10, zu.d<? super C0381d> dVar) {
            super(2, dVar);
            this.f46608k = list;
            this.f46609l = oVar;
            this.f46610m = j10;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super List<? extends v>> dVar) {
            return ((C0381d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C0381d c0381d = new C0381d(this.f46608k, this.f46609l, this.f46610m, dVar);
            c0381d.f46607j = obj;
            return c0381d;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46606i;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return obj;
            }
            a0.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f46607j;
            List list = this.f46608k;
            ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new a((a.AbstractC0378a) it.next(), this.f46609l, this.f46610m, null), 3, null));
            }
            this.f46606i = 1;
            Object objAwaitAll = AwaitKt.awaitAll(arrayList, this);
            return objAwaitAll == coroutine_suspended ? coroutine_suspended : objAwaitAll;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public a.AbstractC0378a.d f46615i;

        /* renamed from: j, reason: collision with root package name */
        public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e f46616j;

        /* renamed from: k, reason: collision with root package name */
        public long f46617k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f46618l;

        /* renamed from: m, reason: collision with root package name */
        public int f46619m;

        public e(zu.d<? super e> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46618l = obj;
            this.f46619m |= Integer.MIN_VALUE;
            return d.b((a.AbstractC0378a.d) null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e) null, 0L, this);
        }
    }

    public static final Object b(a.AbstractC0378a abstractC0378a, o oVar, long j10, zu.d<? super w> dVar) {
        if (abstractC0378a instanceof a.AbstractC0378a.C0379a) {
            return new w.b(new b.a((a.AbstractC0378a.C0379a) abstractC0378a));
        }
        if (abstractC0378a instanceof a.AbstractC0378a.b) {
            return a((a.AbstractC0378a.b) abstractC0378a, null, dVar, 2, null);
        }
        if (abstractC0378a instanceof a.AbstractC0378a.c) {
            return new w.b(new b.c((a.AbstractC0378a.c) abstractC0378a));
        }
        if (abstractC0378a instanceof a.AbstractC0378a.d) {
            return b((a.AbstractC0378a.d) abstractC0378a, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e) oVar.getValue(), j10, dVar);
        }
        throw new t();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(android.content.Context r16, java.util.List<? extends com.moloco.sdk.internal.publisher.nativead.model.a.AbstractC0378a> r17, long r18, zu.d<? super com.moloco.sdk.internal.w> r20) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.parser.d.a(android.content.Context, java.util.List, long, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.moloco.sdk.internal.publisher.nativead.model.a.AbstractC0378a.b r7, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h r8, zu.d<? super com.moloco.sdk.internal.w> r9) {
        /*
            boolean r0 = r9 instanceof com.moloco.sdk.internal.publisher.nativead.parser.d.a
            if (r0 == 0) goto L13
            r0 = r9
            com.moloco.sdk.internal.publisher.nativead.parser.d$a r0 = (com.moloco.sdk.internal.publisher.nativead.parser.d.a) r0
            int r1 = r0.f46590k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46590k = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.nativead.parser.d$a r0 = new com.moloco.sdk.internal.publisher.nativead.parser.d$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f46589j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f46590k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.moloco.sdk.internal.publisher.nativead.model.a$a$b r7 = r0.f46588i
            tu.a0.throwOnFailure(r9)
            goto L45
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            tu.a0.throwOnFailure(r9)
            java.lang.String r9 = r7.e()
            r0.f46588i = r7
            r0.f46590k = r3
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L45
            return r1
        L45:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g r9 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g) r9
            boolean r8 = r9 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g.b
            if (r8 == 0) goto L94
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE     // Catch: java.lang.Exception -> L7c
            java.lang.String r1 = "PrepareNativeAssets"
            java.lang.String r2 = "Successfully loaded image asset media"
            r5 = 12
            r6 = 0
            r3 = 0
            r4 = 0
            com.moloco.sdk.internal.MolocoLogger.info$default(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L7c
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g$b r9 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g.b) r9     // Catch: java.lang.Exception -> L7c
            java.io.File r8 = r9.a()     // Catch: java.lang.Exception -> L7c
            java.lang.String r8 = r8.getAbsolutePath()     // Catch: java.lang.Exception -> L7c
            java.lang.String r9 = "getAbsolutePath(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r8, r9)     // Catch: java.lang.Exception -> L7c
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch: java.lang.Exception -> L7c
            java.lang.String r9 = "parse(this)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r8, r9)     // Catch: java.lang.Exception -> L7c
            com.moloco.sdk.internal.w$b r9 = new com.moloco.sdk.internal.w$b
            com.moloco.sdk.internal.publisher.nativead.model.b$b r0 = new com.moloco.sdk.internal.publisher.nativead.model.b$b
            r0.<init>(r7, r8)
            r9.<init>(r0)
            return r9
        L7c:
            r0 = move-exception
            r7 = r0
            r3 = r7
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r5 = 8
            r6 = 0
            java.lang.String r1 = "PrepareNativeAssets"
            java.lang.String r2 = "Failed to prepare image asset"
            r4 = 0
            com.moloco.sdk.internal.MolocoLogger.warn$default(r0, r1, r2, r3, r4, r5, r6)
            com.moloco.sdk.internal.w$a r7 = new com.moloco.sdk.internal.w$a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g.f47690e
            r7.<init>(r8)
            return r7
        L94:
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r5 = 12
            r6 = 0
            java.lang.String r1 = "PrepareNativeAssets"
            java.lang.String r2 = "Failed to fetch image asset media"
            r3 = 0
            r4 = 0
            com.moloco.sdk.internal.MolocoLogger.warn$default(r0, r1, r2, r3, r4, r5, r6)
            com.moloco.sdk.internal.w$a r7 = new com.moloco.sdk.internal.w$a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g.f47689c
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.parser.d.b(com.moloco.sdk.internal.publisher.nativead.model.a$a$b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        if (r14 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.moloco.sdk.internal.publisher.nativead.model.a.AbstractC0378a.d r10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e r11, long r12, zu.d<? super com.moloco.sdk.internal.w> r14) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.parser.d.b(com.moloco.sdk.internal.publisher.nativead.model.a$a$d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e, long, zu.d):java.lang.Object");
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e a(Context context) {
        return g.a(context);
    }

    public static /* synthetic */ Object a(a.AbstractC0378a.b bVar, h hVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            hVar = a.g.f47460a.a();
        }
        return b(bVar, hVar, dVar);
    }
}
