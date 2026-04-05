package u5;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import o5.d2;
import o5.f1;
import o5.f2;
import o5.g2;
import o5.h2;
import o5.y0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract /* synthetic */ class h {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f87912i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ y0 f87913j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ boolean f87914k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f87915l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kv.l f87916m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zu.d dVar, y0 y0Var, boolean z10, boolean z11, kv.l lVar) {
            super(2, dVar);
            this.f87913j = y0Var;
            this.f87914k = z10;
            this.f87915l = z11;
            this.f87916m = lVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new a(dVar, this.f87913j, this.f87914k, this.f87915l, this.f87916m);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f87912i;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
                return obj;
            }
            tu.a0.throwOnFailure(obj);
            kv.l lVar = this.f87916m;
            boolean z10 = this.f87915l;
            boolean z11 = this.f87914k;
            y0 y0Var = this.f87913j;
            b bVar = new b(z10, z11, y0Var, null, lVar);
            this.f87912i = 1;
            Object objUseConnection$room_runtime_release = y0Var.useConnection$room_runtime_release(z11, bVar, this);
            return objUseConnection$room_runtime_release == coroutine_suspended ? coroutine_suspended : objUseConnection$room_runtime_release;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super R> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public g2 f87917i;

        /* renamed from: j, reason: collision with root package name */
        public int f87918j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f87919k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f87920l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f87921m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ y0 f87922n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ kv.l f87923o;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public /* synthetic */ Object f87924i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ kv.l f87925j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zu.d dVar, kv.l lVar) {
                super(2, dVar);
                this.f87925j = lVar;
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                a aVar = new a(dVar, this.f87925j);
                aVar.f87924i = obj;
                return aVar;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                tu.a0.throwOnFailure(obj);
                f2 f2Var = (f2) this.f87924i;
                e0.checkNotNull(f2Var, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return this.f87925j.invoke(((q5.x) f2Var).getRawConnection());
            }

            @Override // kv.p
            public final Object invoke(f2 f2Var, zu.d<? super R> dVar) {
                return ((a) create(f2Var, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, boolean z11, y0 y0Var, zu.d dVar, kv.l lVar) {
            super(2, dVar);
            this.f87920l = z10;
            this.f87921m = z11;
            this.f87922n = y0Var;
            this.f87923o = lVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            b bVar = new b(this.f87920l, this.f87921m, this.f87922n, dVar, this.f87923o);
            bVar.f87919k = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00a0 A[PHI: r1 r11
          0x00a0: PHI (r1v11 o5.h2) = (r1v8 o5.h2), (r1v16 o5.h2) binds: [B:34:0x009d, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE]
          0x00a0: PHI (r11v17 java.lang.Object) = (r11v15 java.lang.Object), (r11v0 java.lang.Object) binds: [B:34:0x009d, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00bf A[RETURN] */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 208
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: u5.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(h2 h2Var, zu.d<? super R> dVar) {
            return ((b) create(h2Var, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    @tu.f
    public static final CancellationSignal createCancellationSignal() {
        return new CancellationSignal();
    }

    @tu.f
    public static final void dropFtsSyncTriggers(y5.c db2) {
        e0.checkNotNullParameter(db2, "db");
        c.dropFtsSyncTriggers(new r5.a(db2));
    }

    public static final void foreignKeyCheck(y5.c db2, String tableName) {
        e0.checkNotNullParameter(db2, "db");
        e0.checkNotNullParameter(tableName, "tableName");
        c.foreignKeyCheck(new r5.a(db2), tableName);
    }

    public static final Object getCoroutineContext(y0 y0Var, boolean z10, zu.d<? super zu.m> dVar) {
        zu.g transactionDispatcher$room_runtime_release;
        zu.m mVarPlus;
        if (!y0Var.inCompatibilityMode$room_runtime_release()) {
            return y0Var.getCoroutineScope().getCoroutineContext();
        }
        d2 d2Var = (d2) dVar.getContext().get(d2.f77529e);
        return (d2Var == null || (transactionDispatcher$room_runtime_release = d2Var.getTransactionDispatcher$room_runtime_release()) == null || (mVarPlus = y0Var.getQueryContext().plus(transactionDispatcher$room_runtime_release)) == null) ? z10 ? y0Var.getTransactionContext$room_runtime_release() : y0Var.getQueryContext() : mVarPlus;
    }

    public static final <R> R performBlocking(y0 db2, boolean z10, boolean z11, kv.l block) {
        e0.checkNotNullParameter(db2, "db");
        e0.checkNotNullParameter(block, "block");
        db2.assertNotMainThread();
        db2.assertNotSuspendingTransaction();
        return (R) q5.b0.runBlockingUninterruptible(new e(db2, z11, z10, block, null));
    }

    public static final <R> Object performInTransactionSuspending(y0 y0Var, kv.l lVar, zu.d<? super R> dVar) {
        return y0Var.inCompatibilityMode$room_runtime_release() ? f1.withTransactionContext(y0Var, new f(y0Var, lVar, null), dVar) : BuildersKt.withContext(y0Var.getCoroutineScope().getCoroutineContext(), new g(y0Var, lVar, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object performSuspending(o5.y0 r14, boolean r15, boolean r16, kv.l r17, zu.d<? super R> r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof u5.i
            if (r1 == 0) goto L16
            r1 = r0
            u5.i r1 = (u5.i) r1
            int r2 = r1.f87931n
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f87931n = r2
        L14:
            r6 = r1
            goto L1c
        L16:
            u5.i r1 = new u5.i
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r6.f87930m
            java.lang.Object r7 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r6.f87931n
            r2 = 3
            r3 = 2
            r8 = 1
            if (r1 == 0) goto L51
            if (r1 == r8) goto L4d
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            tu.a0.throwOnFailure(r0)
            return r0
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            boolean r14 = r6.f87929l
            boolean r15 = r6.f87928k
            kv.l r1 = r6.f87927j
            kv.l r1 = (kv.l) r1
            o5.y0 r3 = r6.f87926i
            tu.a0.throwOnFailure(r0)
            r12 = r14
            r13 = r1
            r10 = r3
        L4b:
            r11 = r15
            goto L9a
        L4d:
            tu.a0.throwOnFailure(r0)
            return r0
        L51:
            tu.a0.throwOnFailure(r0)
            boolean r0 = r14.inCompatibilityMode$room_runtime_release()
            if (r0 == 0) goto L7d
            boolean r0 = r14.isOpenInternal()
            if (r0 == 0) goto L7d
            boolean r0 = r14.inTransaction()
            if (r0 == 0) goto L7d
            u5.h$b r0 = new u5.h$b
            r4 = 0
            r3 = r14
            r2 = r15
            r1 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = r0
            r6.f87931n = r8
            java.lang.Object r14 = r14.useConnection$room_runtime_release(r15, r2, r6)
            if (r14 != r7) goto L7c
            goto Laf
        L7c:
            return r14
        L7d:
            r4 = r16
            r6.f87926i = r14
            r5 = r17
            kv.l r5 = (kv.l) r5
            r6.f87927j = r5
            r6.f87928k = r15
            r6.f87929l = r4
            r6.f87931n = r3
            java.lang.Object r3 = u5.c.getCoroutineContext(r14, r4, r6)
            if (r3 != r7) goto L94
            goto Laf
        L94:
            r10 = r14
            r13 = r17
            r0 = r3
            r12 = r4
            goto L4b
        L9a:
            zu.m r0 = (zu.m) r0
            u5.h$a r8 = new u5.h$a
            r9 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r14 = 0
            r6.f87926i = r14
            r6.f87927j = r14
            r6.f87931n = r2
            java.lang.Object r14 = kotlinx.coroutines.BuildersKt.withContext(r0, r8, r6)
            if (r14 != r7) goto Lb0
        Laf:
            return r7
        Lb0:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.h.performSuspending(o5.y0, boolean, boolean, kv.l, zu.d):java.lang.Object");
    }

    @tu.f
    public static final Cursor query(y0 db2, y5.i sqLiteQuery, boolean z10) {
        e0.checkNotNullParameter(db2, "db");
        e0.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        return c.query(db2, sqLiteQuery, z10, null);
    }

    public static final int readVersion(File databaseFile) throws IOException {
        e0.checkNotNullParameter(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i10 = byteBufferAllocate.getInt();
            gv.d.closeFinally(channel, null);
            return i10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                gv.d.closeFinally(channel, th2);
                throw th3;
            }
        }
    }

    public static final x5.b toSQLiteConnection(y5.c db2) {
        e0.checkNotNullParameter(db2, "db");
        return new r5.a(db2);
    }

    public static final Cursor query(y0 db2, y5.i sqLiteQuery, boolean z10, CancellationSignal cancellationSignal) {
        e0.checkNotNullParameter(db2, "db");
        e0.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        Cursor cursorQuery = db2.query(sqLiteQuery, cancellationSignal);
        if (!z10 || !(cursorQuery instanceof AbstractWindowedCursor)) {
            return cursorQuery;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? u5.b.copyAndClose(cursorQuery) : cursorQuery;
    }
}
