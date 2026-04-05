package r5;

import kotlin.jvm.internal.e0;
import kv.l;
import kv.p;
import o5.f2;
import o5.g2;
import o5.h2;
import q5.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements h2, x {

    /* renamed from: a, reason: collision with root package name */
    public final r5.a f83786a;

    /* renamed from: b, reason: collision with root package name */
    public g2 f83787b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements f2, x {
        public a() {
        }

        @Override // q5.x
        public x5.b getRawConnection() {
            return d.this.getRawConnection();
        }

        @Override // o5.f2
        public Object rollback(Object obj, zu.d<?> dVar) throws q5.e {
            throw new q5.e(obj);
        }

        @Override // o5.f2, o5.r0
        public <R> Object usePrepared(String str, l lVar, zu.d<? super R> dVar) {
            return d.this.usePrepared(str, lVar, dVar);
        }

        @Override // o5.f2
        public <R> Object withNestedTransaction(p pVar, zu.d<? super R> dVar) {
            d dVar2 = d.this;
            g2 g2Var = dVar2.f83787b;
            if (g2Var != null) {
                return dVar2.a(g2Var, pVar, dVar);
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public d(r5.a delegate) {
        e0.checkNotNullParameter(delegate, "delegate");
        this.f83786a = delegate;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(o5.g2 r6, kv.p r7, zu.d r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof r5.e
            if (r0 == 0) goto L13
            r0 = r8
            r5.e r0 = (r5.e) r0
            int r1 = r0.f83793m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83793m = r1
            goto L18
        L13:
            r5.e r0 = new r5.e
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f83791k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f83793m
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            y5.c r6 = r0.f83790j
            r5.d r7 = r0.f83789i
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L2e q5.e -> L31
            goto L7f
        L2e:
            r8 = move-exception
            goto La9
        L31:
            r8 = move-exception
            goto L99
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            tu.a0.throwOnFailure(r8)
            r5.a r8 = r5.f83786a
            y5.c r8 = r8.getDb()
            boolean r2 = r8.inTransaction()
            if (r2 != 0) goto L4d
            r5.f83787b = r6
        L4d:
            int r6 = r6.ordinal()
            if (r6 == 0) goto L66
            if (r6 == r4) goto L62
            r2 = 2
            if (r6 != r2) goto L5c
            r8.beginTransaction()
            goto L69
        L5c:
            tu.t r6 = new tu.t
            r6.<init>()
            throw r6
        L62:
            r8.beginTransactionNonExclusive()
            goto L69
        L66:
            r8.beginTransactionReadOnly()
        L69:
            r5.d$a r6 = new r5.d$a     // Catch: java.lang.Throwable -> L8e q5.e -> L94
            r6.<init>()     // Catch: java.lang.Throwable -> L8e q5.e -> L94
            r0.f83789i = r5     // Catch: java.lang.Throwable -> L8e q5.e -> L94
            r0.f83790j = r8     // Catch: java.lang.Throwable -> L8e q5.e -> L94
            r0.f83793m = r4     // Catch: java.lang.Throwable -> L8e q5.e -> L94
            java.lang.Object r6 = r7.invoke(r6, r0)     // Catch: java.lang.Throwable -> L8e q5.e -> L94
            if (r6 != r1) goto L7b
            return r1
        L7b:
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r5
        L7f:
            r6.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L2e q5.e -> L31
            r6.endTransaction()
            boolean r6 = r6.inTransaction()
            if (r6 != 0) goto L8d
            r7.f83787b = r3
        L8d:
            return r8
        L8e:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto La9
        L94:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r5
        L99:
            java.lang.Object r8 = r8.getResult()     // Catch: java.lang.Throwable -> L2e
            r6.endTransaction()
            boolean r6 = r6.inTransaction()
            if (r6 != 0) goto La8
            r7.f83787b = r3
        La8:
            return r8
        La9:
            r6.endTransaction()
            boolean r6 = r6.inTransaction()
            if (r6 != 0) goto Lb4
            r7.f83787b = r3
        Lb4:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.d.a(o5.g2, kv.p, zu.d):java.lang.Object");
    }

    public final r5.a getDelegate() {
        return this.f83786a;
    }

    @Override // q5.x
    public x5.b getRawConnection() {
        return this.f83786a;
    }

    @Override // o5.h2
    public Object inTransaction(zu.d<? super Boolean> dVar) {
        return bv.b.boxBoolean(this.f83786a.getDb().inTransaction());
    }

    @Override // o5.h2, o5.r0
    public <R> Object usePrepared(String str, l lVar, zu.d<? super R> dVar) throws Exception {
        f fVarPrepare = this.f83786a.prepare(str);
        try {
            Object objInvoke = lVar.invoke(fVarPrepare);
            iv.a.closeFinally(fVarPrepare, null);
            return objInvoke;
        } finally {
        }
    }

    @Override // o5.h2
    public <R> Object withTransaction(g2 g2Var, p pVar, zu.d<? super R> dVar) {
        return a(g2Var, pVar, dVar);
    }
}
