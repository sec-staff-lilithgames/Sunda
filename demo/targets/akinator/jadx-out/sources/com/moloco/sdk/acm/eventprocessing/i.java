package com.moloco.sdk.acm.eventprocessing;

import bv.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kv.p;
import tu.a0;
import tu.x0;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.db.e f45562a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.acm.services.h f45563b;

    /* renamed from: c, reason: collision with root package name */
    public final l f45564c;

    /* renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.acm.services.c f45565d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f45566i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.d f45568k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.acm.d dVar, zu.d<? super b> dVar2) {
            super(2, dVar2);
            this.f45568k = dVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return i.this.new b(this.f45568k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f45566i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                com.moloco.sdk.acm.d dVar = this.f45568k;
                String name = dVar.getName();
                com.moloco.sdk.acm.db.c cVar = com.moloco.sdk.acm.db.c.f45521c;
                long countValue = dVar.getCountValue();
                List<com.moloco.sdk.acm.e> eventTags = dVar.getEventTags();
                ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(eventTags, 10));
                Iterator<T> it = eventTags.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.moloco.sdk.acm.k.a((com.moloco.sdk.acm.e) it.next()));
                }
                this.f45566i = 1;
                if (i.this.a(name, cVar, countValue, arrayList, this) == coroutine_suspended) {
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
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f45569i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f45570j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ i f45571k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.db.c f45572l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f45573m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ List f45574n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, i iVar, com.moloco.sdk.acm.db.c cVar, long j10, List<String> list, zu.d<? super c> dVar) {
            super(2, dVar);
            this.f45570j = str;
            this.f45571k = iVar;
            this.f45572l = cVar;
            this.f45573m = j10;
            this.f45574n = list;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new c(this.f45570j, this.f45571k, this.f45572l, this.f45573m, this.f45574n, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        
            if (r2.a(r17) == r0) goto L22;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r1 = r17
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r1.f45569i
                r3 = 2
                r4 = 1
                com.moloco.sdk.acm.eventprocessing.i r5 = r1.f45571k
                if (r2 == 0) goto L27
                if (r2 == r4) goto L23
                if (r2 != r3) goto L1b
                tu.a0.throwOnFailure(r18)     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
                goto L9b
            L17:
                r0 = move-exception
                goto L69
            L19:
                r0 = move-exception
                goto L7f
            L1b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L23:
                tu.a0.throwOnFailure(r18)     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
                goto L5c
            L27:
                tu.a0.throwOnFailure(r18)
                com.moloco.sdk.acm.db.b r6 = new com.moloco.sdk.acm.db.b     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
                java.lang.String r9 = r1.f45570j     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
                com.moloco.sdk.acm.services.h r2 = com.moloco.sdk.acm.eventprocessing.i.d(r5)     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
                long r10 = r2.invoke()     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
                com.moloco.sdk.acm.db.c r12 = r1.f45572l     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
                long r7 = r1.f45573m     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
                java.lang.Long r13 = bv.b.boxLong(r7)     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
                java.util.List r14 = r1.f45574n     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
                r15 = 1
                r16 = 0
                r7 = 0
                r6.<init>(r7, r9, r10, r12, r13, r14, r15, r16)     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
                com.moloco.sdk.acm.db.e r2 = com.moloco.sdk.acm.eventprocessing.i.b(r5)     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
                r2.a(r6)     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
                com.moloco.sdk.acm.eventprocessing.l r2 = com.moloco.sdk.acm.eventprocessing.i.c(r5)     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
                r1.f45569i = r4     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
                java.lang.Object r2 = r2.b(r1)     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
                if (r2 != r0) goto L5c
                goto L68
            L5c:
                com.moloco.sdk.acm.services.c r2 = com.moloco.sdk.acm.eventprocessing.i.a(r5)     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
                r1.f45569i = r3     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
                java.lang.Object r2 = r2.a(r1)     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
                if (r2 != r0) goto L9b
            L68:
                return r0
            L69:
                com.moloco.sdk.acm.services.f r2 = com.moloco.sdk.acm.services.f.f45659a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "Unexpected error while processing event: "
                r3.<init>(r4)
                java.lang.String r4 = b0.e2.l(r0, r3)
                r6 = 4
                r7 = 0
                java.lang.String r3 = "EventProcessor"
                r5 = 0
                com.moloco.sdk.acm.services.f.a(r2, r3, r4, r5, r6, r7)
                goto L9b
            L7f:
                com.moloco.sdk.acm.services.f r2 = com.moloco.sdk.acm.services.f.f45659a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "Database error: "
                r3.<init>(r4)
                java.lang.String r0 = r0.getMessage()
                r3.append(r0)
                java.lang.String r4 = r3.toString()
                r6 = 4
                r7 = 0
                java.lang.String r3 = "EventProcessor"
                r5 = 0
                com.moloco.sdk.acm.services.f.a(r2, r3, r4, r5, r6, r7)
            L9b:
                tu.x0 r0 = tu.x0.f87415a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.eventprocessing.i.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f45575i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.g f45576j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ i f45577k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.acm.g gVar, i iVar, zu.d<? super d> dVar) {
            super(2, dVar);
            this.f45576j = gVar;
            this.f45577k = iVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new d(this.f45576j, this.f45577k, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        
            if (r12.f45577k.a(r6, r7, r8, r10, r12) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00b2, code lost:
        
            if (r12.f45577k.a(r1, r3, r4, r6, r12) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
        
            return r0;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r12.f45575i
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L17:
                tu.a0.throwOnFailure(r13)
                goto Lb5
            L1c:
                tu.a0.throwOnFailure(r13)
                com.moloco.sdk.acm.g r13 = r12.f45576j
                long r4 = r13.getTime()
                r6 = 0
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                r4 = 10
                if (r1 <= 0) goto L69
                java.lang.String r6 = r13.getName()
                com.moloco.sdk.acm.db.c r7 = com.moloco.sdk.acm.db.c.f45520b
                long r8 = r13.getTime()
                java.util.List r13 = r13.getEventTags()
                java.util.ArrayList r10 = new java.util.ArrayList
                int r1 = uu.q0.collectionSizeOrDefault(r13, r4)
                r10.<init>(r1)
                java.util.Iterator r13 = r13.iterator()
            L48:
                boolean r1 = r13.hasNext()
                if (r1 == 0) goto L5c
                java.lang.Object r1 = r13.next()
                com.moloco.sdk.acm.e r1 = (com.moloco.sdk.acm.e) r1
                java.lang.String r1 = com.moloco.sdk.acm.k.a(r1)
                r10.add(r1)
                goto L48
            L5c:
                r12.f45575i = r3
                com.moloco.sdk.acm.eventprocessing.i r5 = r12.f45577k
                r11 = r12
                java.lang.Object r13 = com.moloco.sdk.acm.eventprocessing.i.a(r5, r6, r7, r8, r10, r11)
                r7 = r11
                if (r13 != r0) goto Lb5
                goto Lb4
            L69:
                r7 = r12
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r3 = "negative_time_"
                r1.<init>(r3)
                java.lang.String r3 = r13.getName()
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                com.moloco.sdk.acm.db.c r3 = com.moloco.sdk.acm.db.c.f45520b
                r6 = r4
                long r4 = r13.getTime()
                java.util.List r13 = r13.getEventTags()
                r8 = r6
                java.util.ArrayList r6 = new java.util.ArrayList
                int r8 = uu.q0.collectionSizeOrDefault(r13, r8)
                r6.<init>(r8)
                java.util.Iterator r13 = r13.iterator()
            L95:
                boolean r8 = r13.hasNext()
                if (r8 == 0) goto La9
                java.lang.Object r8 = r13.next()
                com.moloco.sdk.acm.e r8 = (com.moloco.sdk.acm.e) r8
                java.lang.String r8 = com.moloco.sdk.acm.k.a(r8)
                r6.add(r8)
                goto L95
            La9:
                r7.f45575i = r2
                r2 = r1
                com.moloco.sdk.acm.eventprocessing.i r1 = r7.f45577k
                java.lang.Object r13 = com.moloco.sdk.acm.eventprocessing.i.a(r1, r2, r3, r4, r6, r7)
                if (r13 != r0) goto Lb5
            Lb4:
                return r0
            Lb5:
                tu.x0 r13 = tu.x0.f87415a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.eventprocessing.i.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    public i(com.moloco.sdk.acm.db.e metricsDAO, com.moloco.sdk.acm.services.h timeProviderService, l requestScheduler, com.moloco.sdk.acm.services.c applicationLifecycle) {
        e0.checkNotNullParameter(metricsDAO, "metricsDAO");
        e0.checkNotNullParameter(timeProviderService, "timeProviderService");
        e0.checkNotNullParameter(requestScheduler, "requestScheduler");
        e0.checkNotNullParameter(applicationLifecycle, "applicationLifecycle");
        this.f45562a = metricsDAO;
        this.f45563b = timeProviderService;
        this.f45564c = requestScheduler;
        this.f45565d = applicationLifecycle;
    }

    @Override // com.moloco.sdk.acm.eventprocessing.h
    public Object a(com.moloco.sdk.acm.d dVar, zu.d<? super x0> dVar2) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new b(dVar, null), dVar2);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    @Override // com.moloco.sdk.acm.eventprocessing.h
    public Object a(com.moloco.sdk.acm.g gVar, zu.d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new d(gVar, this, null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    public final Object a(String str, com.moloco.sdk.acm.db.c cVar, long j10, List<String> list, zu.d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new c(str, this, cVar, j10, list, null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }
}
