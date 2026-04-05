package q5;

import android.database.SQLException;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.e0;
import o5.f2;
import o5.g2;
import o5.h2;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r implements h2, x {

    /* renamed from: a, reason: collision with root package name */
    public final n f82474a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f82475b;

    /* renamed from: c, reason: collision with root package name */
    public final uu.u f82476c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f82477d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements x5.d {

        /* renamed from: b, reason: collision with root package name */
        public final x5.d f82478b;

        /* renamed from: c, reason: collision with root package name */
        public final long f82479c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ r f82480e;

        public a(r rVar, x5.d delegate) {
            e0.checkNotNullParameter(delegate, "delegate");
            this.f82480e = rVar;
            this.f82478b = delegate;
            this.f82479c = p5.d.currentThreadId();
        }

        @Override // x5.d
        public void bindBlob(int i10, byte[] value) {
            e0.checkNotNullParameter(value, "value");
            if (r.access$isRecycled(this.f82480e)) {
                throw o2.x(21, "Statement is recycled");
            }
            if (this.f82479c != p5.d.currentThreadId()) {
                throw o2.x(21, "Attempted to use statement on a different thread");
            }
            this.f82478b.bindBlob(i10, value);
        }

        @Override // x5.d
        public /* bridge */ /* synthetic */ void bindBoolean(int i10, boolean z10) {
            super.bindBoolean(i10, z10);
        }

        @Override // x5.d
        public void bindDouble(int i10, double d10) {
            if (r.access$isRecycled(this.f82480e)) {
                throw o2.x(21, "Statement is recycled");
            }
            if (this.f82479c != p5.d.currentThreadId()) {
                throw o2.x(21, "Attempted to use statement on a different thread");
            }
            this.f82478b.bindDouble(i10, d10);
        }

        @Override // x5.d
        public /* bridge */ /* synthetic */ void bindFloat(int i10, float f10) {
            super.bindFloat(i10, f10);
        }

        @Override // x5.d
        public /* bridge */ /* synthetic */ void bindInt(int i10, int i11) {
            super.bindInt(i10, i11);
        }

        @Override // x5.d
        public void bindLong(int i10, long j10) {
            if (r.access$isRecycled(this.f82480e)) {
                throw o2.x(21, "Statement is recycled");
            }
            if (this.f82479c != p5.d.currentThreadId()) {
                throw o2.x(21, "Attempted to use statement on a different thread");
            }
            this.f82478b.bindLong(i10, j10);
        }

        @Override // x5.d
        public void bindNull(int i10) {
            if (r.access$isRecycled(this.f82480e)) {
                throw o2.x(21, "Statement is recycled");
            }
            if (this.f82479c != p5.d.currentThreadId()) {
                throw o2.x(21, "Attempted to use statement on a different thread");
            }
            this.f82478b.bindNull(i10);
        }

        @Override // x5.d
        public void bindText(int i10, String value) {
            e0.checkNotNullParameter(value, "value");
            if (r.access$isRecycled(this.f82480e)) {
                throw o2.x(21, "Statement is recycled");
            }
            if (this.f82479c != p5.d.currentThreadId()) {
                throw o2.x(21, "Attempted to use statement on a different thread");
            }
            this.f82478b.bindText(i10, value);
        }

        @Override // x5.d
        public void clearBindings() {
            if (r.access$isRecycled(this.f82480e)) {
                throw o2.x(21, "Statement is recycled");
            }
            if (this.f82479c != p5.d.currentThreadId()) {
                throw o2.x(21, "Attempted to use statement on a different thread");
            }
            this.f82478b.clearBindings();
        }

        @Override // x5.d, java.lang.AutoCloseable
        public void close() {
            if (r.access$isRecycled(this.f82480e)) {
                throw o2.x(21, "Statement is recycled");
            }
            if (this.f82479c != p5.d.currentThreadId()) {
                throw o2.x(21, "Attempted to use statement on a different thread");
            }
            this.f82478b.close();
        }

        @Override // x5.d
        public byte[] getBlob(int i10) {
            if (r.access$isRecycled(this.f82480e)) {
                throw o2.x(21, "Statement is recycled");
            }
            if (this.f82479c == p5.d.currentThreadId()) {
                return this.f82478b.getBlob(i10);
            }
            throw o2.x(21, "Attempted to use statement on a different thread");
        }

        @Override // x5.d
        public /* bridge */ /* synthetic */ boolean getBoolean(int i10) {
            return super.getBoolean(i10);
        }

        @Override // x5.d
        public int getColumnCount() {
            if (r.access$isRecycled(this.f82480e)) {
                throw o2.x(21, "Statement is recycled");
            }
            if (this.f82479c == p5.d.currentThreadId()) {
                return this.f82478b.getColumnCount();
            }
            throw o2.x(21, "Attempted to use statement on a different thread");
        }

        @Override // x5.d
        public String getColumnName(int i10) {
            if (r.access$isRecycled(this.f82480e)) {
                throw o2.x(21, "Statement is recycled");
            }
            if (this.f82479c == p5.d.currentThreadId()) {
                return this.f82478b.getColumnName(i10);
            }
            throw o2.x(21, "Attempted to use statement on a different thread");
        }

        @Override // x5.d
        public /* bridge */ /* synthetic */ List getColumnNames() {
            return super.getColumnNames();
        }

        @Override // x5.d
        public int getColumnType(int i10) {
            if (r.access$isRecycled(this.f82480e)) {
                throw o2.x(21, "Statement is recycled");
            }
            if (this.f82479c == p5.d.currentThreadId()) {
                return this.f82478b.getColumnType(i10);
            }
            throw o2.x(21, "Attempted to use statement on a different thread");
        }

        @Override // x5.d
        public double getDouble(int i10) {
            if (r.access$isRecycled(this.f82480e)) {
                throw o2.x(21, "Statement is recycled");
            }
            if (this.f82479c == p5.d.currentThreadId()) {
                return this.f82478b.getDouble(i10);
            }
            throw o2.x(21, "Attempted to use statement on a different thread");
        }

        @Override // x5.d
        public /* bridge */ /* synthetic */ float getFloat(int i10) {
            return super.getFloat(i10);
        }

        @Override // x5.d
        public /* bridge */ /* synthetic */ int getInt(int i10) {
            return super.getInt(i10);
        }

        @Override // x5.d
        public long getLong(int i10) {
            if (r.access$isRecycled(this.f82480e)) {
                throw o2.x(21, "Statement is recycled");
            }
            if (this.f82479c == p5.d.currentThreadId()) {
                return this.f82478b.getLong(i10);
            }
            throw o2.x(21, "Attempted to use statement on a different thread");
        }

        @Override // x5.d
        public String getText(int i10) {
            if (r.access$isRecycled(this.f82480e)) {
                throw o2.x(21, "Statement is recycled");
            }
            if (this.f82479c == p5.d.currentThreadId()) {
                return this.f82478b.getText(i10);
            }
            throw o2.x(21, "Attempted to use statement on a different thread");
        }

        @Override // x5.d
        public boolean isNull(int i10) {
            if (r.access$isRecycled(this.f82480e)) {
                throw o2.x(21, "Statement is recycled");
            }
            if (this.f82479c == p5.d.currentThreadId()) {
                return this.f82478b.isNull(i10);
            }
            throw o2.x(21, "Attempted to use statement on a different thread");
        }

        @Override // x5.d
        public void reset() {
            if (r.access$isRecycled(this.f82480e)) {
                throw o2.x(21, "Statement is recycled");
            }
            if (this.f82479c != p5.d.currentThreadId()) {
                throw o2.x(21, "Attempted to use statement on a different thread");
            }
            this.f82478b.reset();
        }

        @Override // x5.d
        public boolean step() {
            if (r.access$isRecycled(this.f82480e)) {
                throw o2.x(21, "Statement is recycled");
            }
            if (this.f82479c == p5.d.currentThreadId()) {
                return this.f82478b.step();
            }
            throw o2.x(21, "Attempted to use statement on a different thread");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b implements f2, x {
        public b() {
        }

        @Override // q5.x
        public x5.b getRawConnection() {
            return r.this.getRawConnection();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o5.f2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object rollback(java.lang.Object r8, zu.d<?> r9) throws q5.e {
            /*
                r7 = this;
                boolean r0 = r9 instanceof q5.s
                if (r0 == 0) goto L13
                r0 = r9
                q5.s r0 = (q5.s) r0
                int r1 = r0.f82489n
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f82489n = r1
                goto L18
            L13:
                q5.s r0 = new q5.s
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f82487l
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.f82489n
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L38
                if (r2 == r3) goto L2e
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L2e:
                q5.n r8 = r0.f82486k
                q5.r r1 = r0.f82485j
                java.lang.Object r0 = r0.f82484i
                tu.a0.throwOnFailure(r9)
                goto L79
            L38:
                tu.a0.throwOnFailure(r9)
                q5.r r9 = q5.r.this
                boolean r2 = q5.r.access$isRecycled(r9)
                r5 = 21
                if (r2 != 0) goto La3
                zu.m r2 = r0.getContext()
                q5.d$a r6 = q5.d.f82415c
                zu.k r2 = r2.get(r6)
                q5.d r2 = (q5.d) r2
                if (r2 == 0) goto L9c
                q5.r r2 = r2.getConnectionWrapper()
                if (r2 != r9) goto L9c
                uu.u r2 = q5.r.access$getTransactionStack$p(r9)
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L94
                q5.n r2 = r9.getDelegate()
                r0.f82484i = r8
                r0.f82485j = r9
                r0.f82486k = r2
                r0.f82489n = r3
                java.lang.Object r0 = r2.lock(r4, r0)
                if (r0 != r1) goto L76
                return r1
            L76:
                r0 = r8
                r1 = r9
                r8 = r2
            L79:
                uu.u r9 = q5.r.access$getTransactionStack$p(r1)     // Catch: java.lang.Throwable -> L8f
                java.lang.Object r9 = r9.last()     // Catch: java.lang.Throwable -> L8f
                q5.r$c r9 = (q5.r.c) r9     // Catch: java.lang.Throwable -> L8f
                r9.setShouldRollback(r3)     // Catch: java.lang.Throwable -> L8f
                r8.unlock(r4)
                q5.e r8 = new q5.e
                r8.<init>(r0)
                throw r8
            L8f:
                r9 = move-exception
                r8.unlock(r4)
                throw r9
            L94:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "Not in a transaction"
                r8.<init>(r9)
                throw r8
            L9c:
                java.lang.String r8 = "Attempted to use connection on a different coroutine"
                tu.k r8 = p0.o2.x(r5, r8)
                throw r8
            La3:
                java.lang.String r8 = "Connection is recycled"
                tu.k r8 = p0.o2.x(r5, r8)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: q5.r.b.rollback(java.lang.Object, zu.d):java.lang.Object");
        }

        @Override // o5.f2, o5.r0
        public <R> Object usePrepared(String str, kv.l lVar, zu.d<? super R> dVar) {
            return r.this.usePrepared(str, lVar, dVar);
        }

        @Override // o5.f2
        public <R> Object withNestedTransaction(kv.p pVar, zu.d<? super R> dVar) {
            r rVar = r.this;
            if (r.access$isRecycled(rVar)) {
                throw o2.x(21, "Connection is recycled");
            }
            d dVar2 = (d) dVar.getContext().get(d.f82415c);
            if (dVar2 == null || dVar2.getConnectionWrapper() != rVar) {
                throw o2.x(21, "Attempted to use connection on a different coroutine");
            }
            return rVar.c(null, pVar, dVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f82482a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f82483b;

        public c(int i10, boolean z10) {
            this.f82482a = i10;
            this.f82483b = z10;
        }

        public final int getId() {
            return this.f82482a;
        }

        public final boolean getShouldRollback() {
            return this.f82483b;
        }

        public final void setShouldRollback(boolean z10) {
            this.f82483b = z10;
        }
    }

    public r(n delegate, boolean z10) {
        e0.checkNotNullParameter(delegate, "delegate");
        this.f82474a = delegate;
        this.f82475b = z10;
        this.f82476c = new uu.u();
        this.f82477d = new AtomicBoolean(false);
    }

    public static final boolean access$isRecycled(r rVar) {
        return rVar.f82477d.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(o5.g2 r8, zu.d r9) {
        /*
            r7 = this;
            java.lang.String r0 = "SAVEPOINT '"
            boolean r1 = r9 instanceof q5.t
            if (r1 == 0) goto L15
            r1 = r9
            q5.t r1 = (q5.t) r1
            int r2 = r1.f82495n
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f82495n = r2
            goto L1a
        L15:
            q5.t r1 = new q5.t
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.f82493l
            java.lang.Object r2 = av.e.getCOROUTINE_SUSPENDED()
            int r3 = r1.f82495n
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L3c
            if (r3 != r4) goto L34
            q5.n r8 = r1.f82492k
            o5.g2 r2 = r1.f82491j
            q5.r r1 = r1.f82490i
            tu.a0.throwOnFailure(r9)
            r9 = r8
            r8 = r2
            goto L51
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            tu.a0.throwOnFailure(r9)
            r1.f82490i = r7
            r1.f82491j = r8
            q5.n r9 = r7.f82474a
            r1.f82492k = r9
            r1.f82495n = r4
            java.lang.Object r1 = r9.lock(r5, r1)
            if (r1 != r2) goto L50
            return r2
        L50:
            r1 = r7
        L51:
            uu.u r2 = r1.f82476c     // Catch: java.lang.Throwable -> L70
            q5.n r1 = r1.f82474a     // Catch: java.lang.Throwable -> L70
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L70
            boolean r6 = r2.isEmpty()     // Catch: java.lang.Throwable -> L70
            if (r6 == 0) goto L84
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L70
            if (r8 == 0) goto L7e
            if (r8 == r4) goto L78
            r0 = 2
            if (r8 != r0) goto L72
            java.lang.String r8 = "BEGIN EXCLUSIVE TRANSACTION"
            x5.a.execSQL(r1, r8)     // Catch: java.lang.Throwable -> L70
            goto L98
        L70:
            r8 = move-exception
            goto La7
        L72:
            tu.t r8 = new tu.t     // Catch: java.lang.Throwable -> L70
            r8.<init>()     // Catch: java.lang.Throwable -> L70
            throw r8     // Catch: java.lang.Throwable -> L70
        L78:
            java.lang.String r8 = "BEGIN IMMEDIATE TRANSACTION"
            x5.a.execSQL(r1, r8)     // Catch: java.lang.Throwable -> L70
            goto L98
        L7e:
            java.lang.String r8 = "BEGIN DEFERRED TRANSACTION"
            x5.a.execSQL(r1, r8)     // Catch: java.lang.Throwable -> L70
            goto L98
        L84:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L70
            r8.append(r3)     // Catch: java.lang.Throwable -> L70
            r0 = 39
            r8.append(r0)     // Catch: java.lang.Throwable -> L70
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L70
            x5.a.execSQL(r1, r8)     // Catch: java.lang.Throwable -> L70
        L98:
            q5.r$c r8 = new q5.r$c     // Catch: java.lang.Throwable -> L70
            r0 = 0
            r8.<init>(r3, r0)     // Catch: java.lang.Throwable -> L70
            r2.addLast(r8)     // Catch: java.lang.Throwable -> L70
            tu.x0 r8 = tu.x0.f87415a     // Catch: java.lang.Throwable -> L70
            r9.unlock(r5)
            return r8
        La7:
            r9.unlock(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.r.a(o5.g2, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r8, zu.d r9) {
        /*
            r7 = this;
            java.lang.String r0 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r1 = "RELEASE SAVEPOINT '"
            boolean r2 = r9 instanceof q5.u
            if (r2 == 0) goto L17
            r2 = r9
            q5.u r2 = (q5.u) r2
            int r3 = r2.f82501n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f82501n = r3
            goto L1c
        L17:
            q5.u r2 = new q5.u
            r2.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r2.f82499l
            java.lang.Object r3 = av.e.getCOROUTINE_SUSPENDED()
            int r4 = r2.f82501n
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L3c
            if (r4 != r5) goto L34
            boolean r8 = r2.f82498k
            q5.n r3 = r2.f82497j
            q5.r r2 = r2.f82496i
            tu.a0.throwOnFailure(r9)
            goto L52
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            tu.a0.throwOnFailure(r9)
            r2.f82496i = r7
            q5.n r9 = r7.f82474a
            r2.f82497j = r9
            r2.f82498k = r8
            r2.f82501n = r5
            java.lang.Object r2 = r9.lock(r6, r2)
            if (r2 != r3) goto L50
            return r3
        L50:
            r2 = r7
            r3 = r9
        L52:
            uu.u r9 = r2.f82476c     // Catch: java.lang.Throwable -> L78
            q5.n r2 = r2.f82474a     // Catch: java.lang.Throwable -> L78
            boolean r4 = r9.isEmpty()     // Catch: java.lang.Throwable -> L78
            if (r4 != 0) goto Lb9
            java.lang.Object r4 = uu.v0.removeLast(r9)     // Catch: java.lang.Throwable -> L78
            q5.r$c r4 = (q5.r.c) r4     // Catch: java.lang.Throwable -> L78
            r5 = 39
            if (r8 == 0) goto L91
            boolean r8 = r4.getShouldRollback()     // Catch: java.lang.Throwable -> L78
            if (r8 != 0) goto L91
            boolean r8 = r9.isEmpty()     // Catch: java.lang.Throwable -> L78
            if (r8 == 0) goto L7a
            java.lang.String r8 = "END TRANSACTION"
            x5.a.execSQL(r2, r8)     // Catch: java.lang.Throwable -> L78
            goto Lb3
        L78:
            r8 = move-exception
            goto Lc1
        L7a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L78
            int r9 = r4.getId()     // Catch: java.lang.Throwable -> L78
            r8.append(r9)     // Catch: java.lang.Throwable -> L78
            r8.append(r5)     // Catch: java.lang.Throwable -> L78
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L78
            x5.a.execSQL(r2, r8)     // Catch: java.lang.Throwable -> L78
            goto Lb3
        L91:
            boolean r8 = r9.isEmpty()     // Catch: java.lang.Throwable -> L78
            if (r8 == 0) goto L9d
            java.lang.String r8 = "ROLLBACK TRANSACTION"
            x5.a.execSQL(r2, r8)     // Catch: java.lang.Throwable -> L78
            goto Lb3
        L9d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L78
            int r9 = r4.getId()     // Catch: java.lang.Throwable -> L78
            r8.append(r9)     // Catch: java.lang.Throwable -> L78
            r8.append(r5)     // Catch: java.lang.Throwable -> L78
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L78
            x5.a.execSQL(r2, r8)     // Catch: java.lang.Throwable -> L78
        Lb3:
            tu.x0 r8 = tu.x0.f87415a     // Catch: java.lang.Throwable -> L78
            r3.unlock(r6)
            return r8
        Lb9:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L78
            java.lang.String r9 = "Not in a transaction"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L78
            throw r8     // Catch: java.lang.Throwable -> L78
        Lc1:
            r3.unlock(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.r.b(boolean, zu.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(2:22|23)(1:(2:15|16)(4:17|78|18|68)))(6:24|80|25|(1:42)|43|(1:63)(1:46)))(1:29))(5:30|(1:32)|33|(1:36)|63)|76|37|(4:40|(0)|43|(0))|63|(2:(1:71)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
    
        r13 = r12;
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ac, code lost:
    
        r12 = r12.getResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b2, code lost:
    
        r0.f82502i = r12;
        r0.f82503j = null;
        r0.f82507n = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bc, code lost:
    
        if (r13.b(false, r0) == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bf, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c2, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c3, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c4, code lost:
    
        r9 = r12;
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c6, code lost:
    
        r0.f82502i = r9;
        r0.f82503j = r12;
        r0.f82507n = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d0, code lost:
    
        if (r13.b(false, r0) != r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d3, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d4, code lost:
    
        r13 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d7, code lost:
    
        tu.h.addSuppressed(r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00db, code lost:
    
        throw r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #1 {all -> 0x00c0, blocks: (B:49:0x00a8, B:51:0x00ac), top: B:72:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(o5.g2 r12, kv.p r13, zu.d r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.r.c(o5.g2, kv.p, zu.d):java.lang.Object");
    }

    public final n getDelegate() {
        return this.f82474a;
    }

    @Override // q5.x
    public x5.b getRawConnection() {
        return this.f82474a;
    }

    @Override // o5.h2
    public Object inTransaction(zu.d<? super Boolean> dVar) {
        if (access$isRecycled(this)) {
            throw o2.x(21, "Connection is recycled");
        }
        d dVar2 = (d) dVar.getContext().get(d.f82415c);
        if (dVar2 == null || dVar2.getConnectionWrapper() != this) {
            throw o2.x(21, "Attempted to use connection on a different coroutine");
        }
        return bv.b.boxBoolean(!this.f82476c.isEmpty());
    }

    public final boolean isReadOnly() {
        return this.f82475b;
    }

    public final void markRecycled() throws Exception {
        if (this.f82477d.compareAndSet(false, true)) {
            try {
                x5.a.execSQL(this.f82474a, "ROLLBACK TRANSACTION");
            } catch (SQLException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o5.h2, o5.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object usePrepared(java.lang.String r7, kv.l r8, zu.d<? super R> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof q5.w
            if (r0 == 0) goto L13
            r0 = r9
            q5.w r0 = (q5.w) r0
            int r1 = r0.f82514o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82514o = r1
            goto L18
        L13:
            q5.w r0 = new q5.w
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f82512m
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f82514o
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            q5.n r7 = r0.f82511l
            kv.l r8 = r0.f82510k
            kv.l r8 = (kv.l) r8
            java.lang.String r1 = r0.f82509j
            q5.r r0 = r0.f82508i
            tu.a0.throwOnFailure(r9)
            r9 = r7
            r7 = r1
            goto L74
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            tu.a0.throwOnFailure(r9)
            boolean r9 = access$isRecycled(r6)
            r2 = 21
            if (r9 != 0) goto L9e
            zu.m r9 = r0.getContext()
            q5.d$a r5 = q5.d.f82415c
            zu.k r9 = r9.get(r5)
            q5.d r9 = (q5.d) r9
            if (r9 == 0) goto L97
            q5.r r9 = r9.getConnectionWrapper()
            if (r9 != r6) goto L97
            r0.f82508i = r6
            r0.f82509j = r7
            r9 = r8
            kv.l r9 = (kv.l) r9
            r0.f82510k = r9
            q5.n r9 = r6.f82474a
            r0.f82511l = r9
            r0.f82514o = r3
            java.lang.Object r0 = r9.lock(r4, r0)
            if (r0 != r1) goto L73
            return r1
        L73:
            r0 = r6
        L74:
            q5.r$a r1 = new q5.r$a     // Catch: java.lang.Throwable -> L8a
            q5.n r2 = r0.f82474a     // Catch: java.lang.Throwable -> L8a
            x5.d r7 = r2.prepare(r7)     // Catch: java.lang.Throwable -> L8a
            r1.<init>(r0, r7)     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r7 = r8.invoke(r1)     // Catch: java.lang.Throwable -> L8c
            iv.a.closeFinally(r1, r4)     // Catch: java.lang.Throwable -> L8a
            r9.unlock(r4)
            return r7
        L8a:
            r7 = move-exception
            goto L93
        L8c:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L8e
        L8e:
            r8 = move-exception
            iv.a.closeFinally(r1, r7)     // Catch: java.lang.Throwable -> L8a
            throw r8     // Catch: java.lang.Throwable -> L8a
        L93:
            r9.unlock(r4)
            throw r7
        L97:
            java.lang.String r7 = "Attempted to use connection on a different coroutine"
            tu.k r7 = p0.o2.x(r2, r7)
            throw r7
        L9e:
            java.lang.String r7 = "Connection is recycled"
            tu.k r7 = p0.o2.x(r2, r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.r.usePrepared(java.lang.String, kv.l, zu.d):java.lang.Object");
    }

    @Override // o5.h2
    public <R> Object withTransaction(g2 g2Var, kv.p pVar, zu.d<? super R> dVar) {
        if (access$isRecycled(this)) {
            throw o2.x(21, "Connection is recycled");
        }
        d dVar2 = (d) dVar.getContext().get(d.f82415c);
        if (dVar2 == null || dVar2.getConnectionWrapper() != this) {
            throw o2.x(21, "Attempted to use connection on a different coroutine");
        }
        return c(g2Var, pVar, dVar);
    }
}
