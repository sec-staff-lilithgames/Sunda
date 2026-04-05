package com.moloco.sdk.internal.services.usertracker;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final d f47178a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.usertracker.b f47179b;

    /* renamed from: c, reason: collision with root package name */
    public final Mutex f47180c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public Object f47181i;

        /* renamed from: j, reason: collision with root package name */
        public Mutex f47182j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f47183k;

        /* renamed from: m, reason: collision with root package name */
        public int f47185m;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f47183k = obj;
            this.f47185m |= Integer.MIN_VALUE;
            return f.this.a(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public Object f47186i;

        /* renamed from: j, reason: collision with root package name */
        public Object f47187j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f47188k;

        /* renamed from: m, reason: collision with root package name */
        public int f47190m;

        public b(zu.d<? super b> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f47188k = obj;
            this.f47190m |= Integer.MIN_VALUE;
            return f.this.b(this);
        }
    }

    public f(d idGenerator, com.moloco.sdk.internal.services.usertracker.b idRepository) {
        e0.checkNotNullParameter(idGenerator, "idGenerator");
        e0.checkNotNullParameter(idRepository, "idRepository");
        this.f47178a = idGenerator;
        this.f47179b = idRepository;
        this.f47180c = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.internal.services.usertracker.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(zu.d<? super tu.x0> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.moloco.sdk.internal.services.usertracker.f.a
            if (r0 == 0) goto L13
            r0 = r8
            com.moloco.sdk.internal.services.usertracker.f$a r0 = (com.moloco.sdk.internal.services.usertracker.f.a) r0
            int r1 = r0.f47185m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47185m = r1
            goto L18
        L13:
            com.moloco.sdk.internal.services.usertracker.f$a r0 = new com.moloco.sdk.internal.services.usertracker.f$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f47183k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f47185m
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r0 = r0.f47181i
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L31
            goto L69
        L31:
            r8 = move-exception
            goto L6f
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            kotlinx.coroutines.sync.Mutex r2 = r0.f47182j
            java.lang.Object r4 = r0.f47181i
            com.moloco.sdk.internal.services.usertracker.f r4 = (com.moloco.sdk.internal.services.usertracker.f) r4
            tu.a0.throwOnFailure(r8)
            r8 = r2
            goto L59
        L46:
            tu.a0.throwOnFailure(r8)
            r0.f47181i = r7
            kotlinx.coroutines.sync.Mutex r8 = r7.f47180c
            r0.f47182j = r8
            r0.f47185m = r4
            java.lang.Object r2 = r8.lock(r5, r0)
            if (r2 != r1) goto L58
            goto L67
        L58:
            r4 = r7
        L59:
            com.moloco.sdk.internal.services.usertracker.b r2 = r4.f47179b     // Catch: java.lang.Throwable -> L73
            r0.f47181i = r8     // Catch: java.lang.Throwable -> L73
            r0.f47182j = r5     // Catch: java.lang.Throwable -> L73
            r0.f47185m = r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L73
            if (r0 != r1) goto L68
        L67:
            return r1
        L68:
            r0 = r8
        L69:
            tu.x0 r8 = tu.x0.f87415a     // Catch: java.lang.Throwable -> L31
            r0.unlock(r5)
            return r8
        L6f:
            r6 = r0
            r0 = r8
            r8 = r6
            goto L74
        L73:
            r0 = move-exception
        L74:
            r8.unlock(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.usertracker.f.a(zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
    
        if (r4.a(r9, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089 A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:21:0x004c, B:34:0x0085, B:36:0x0089), top: B:47:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.internal.services.usertracker.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(zu.d<? super java.lang.String> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.moloco.sdk.internal.services.usertracker.f.b
            if (r0 == 0) goto L13
            r0 = r9
            com.moloco.sdk.internal.services.usertracker.f$b r0 = (com.moloco.sdk.internal.services.usertracker.f.b) r0
            int r1 = r0.f47190m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47190m = r1
            goto L18
        L13:
            com.moloco.sdk.internal.services.usertracker.f$b r0 = new com.moloco.sdk.internal.services.usertracker.f$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f47188k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f47190m
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L5f
            if (r2 == r5) goto L52
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r1 = r0.f47187j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f47186i
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            tu.a0.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L39
            goto La0
        L39:
            r9 = move-exception
            goto La8
        L3c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L44:
            java.lang.Object r2 = r0.f47187j
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            java.lang.Object r4 = r0.f47186i
            com.moloco.sdk.internal.services.usertracker.f r4 = (com.moloco.sdk.internal.services.usertracker.f) r4
            tu.a0.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L50
            goto L85
        L50:
            r9 = move-exception
            goto La9
        L52:
            java.lang.Object r2 = r0.f47187j
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            java.lang.Object r5 = r0.f47186i
            com.moloco.sdk.internal.services.usertracker.f r5 = (com.moloco.sdk.internal.services.usertracker.f) r5
            tu.a0.throwOnFailure(r9)
            r9 = r2
            goto L72
        L5f:
            tu.a0.throwOnFailure(r9)
            r0.f47186i = r8
            kotlinx.coroutines.sync.Mutex r9 = r8.f47180c
            r0.f47187j = r9
            r0.f47190m = r5
            java.lang.Object r2 = r9.lock(r6, r0)
            if (r2 != r1) goto L71
            goto L9d
        L71:
            r5 = r8
        L72:
            com.moloco.sdk.internal.services.usertracker.b r2 = r5.f47179b     // Catch: java.lang.Throwable -> La4
            r0.f47186i = r5     // Catch: java.lang.Throwable -> La4
            r0.f47187j = r9     // Catch: java.lang.Throwable -> La4
            r0.f47190m = r4     // Catch: java.lang.Throwable -> La4
            java.lang.Object r2 = r2.b(r0)     // Catch: java.lang.Throwable -> La4
            if (r2 != r1) goto L81
            goto L9d
        L81:
            r4 = r2
            r2 = r9
            r9 = r4
            r4 = r5
        L85:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L50
            if (r9 != 0) goto L9e
            com.moloco.sdk.internal.services.usertracker.d r9 = r4.f47178a     // Catch: java.lang.Throwable -> L50
            java.lang.String r9 = r9.a()     // Catch: java.lang.Throwable -> L50
            com.moloco.sdk.internal.services.usertracker.b r4 = r4.f47179b     // Catch: java.lang.Throwable -> L50
            r0.f47186i = r2     // Catch: java.lang.Throwable -> L50
            r0.f47187j = r9     // Catch: java.lang.Throwable -> L50
            r0.f47190m = r3     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = r4.a(r9, r0)     // Catch: java.lang.Throwable -> L50
            if (r0 != r1) goto L9e
        L9d:
            return r1
        L9e:
            r1 = r9
            r0 = r2
        La0:
            r0.unlock(r6)
            return r1
        La4:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        La8:
            r2 = r0
        La9:
            r2.unlock(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.usertracker.f.b(zu.d):java.lang.Object");
    }
}
