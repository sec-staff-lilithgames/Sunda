package q5;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import uu.o0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f82466a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.a f82467b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f82468c;

    /* renamed from: d, reason: collision with root package name */
    public int f82469d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f82470e;

    /* renamed from: f, reason: collision with root package name */
    public final n[] f82471f;

    /* renamed from: g, reason: collision with root package name */
    public final Semaphore f82472g;

    /* renamed from: h, reason: collision with root package name */
    public final z.i f82473h;

    public q(int i10, kv.a connectionFactory) {
        e0.checkNotNullParameter(connectionFactory, "connectionFactory");
        this.f82466a = i10;
        this.f82467b = connectionFactory;
        this.f82468c = new ReentrantLock();
        this.f82471f = new n[i10];
        this.f82472g = SemaphoreKt.Semaphore$default(i10, 0, 2, null);
        this.f82473h = new z.i(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object acquire(zu.d<? super q5.n> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof q5.p
            if (r0 == 0) goto L13
            r0 = r7
            q5.p r0 = (q5.p) r0
            int r1 = r0.f82465l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82465l = r1
            goto L18
        L13:
            q5.p r0 = new q5.p
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f82463j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f82465l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            q5.q r0 = r0.f82462i
            tu.a0.throwOnFailure(r7)
            goto L44
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            tu.a0.throwOnFailure(r7)
            r0.f82462i = r6
            r0.f82465l = r3
            kotlinx.coroutines.sync.Semaphore r7 = r6.f82472g
            java.lang.Object r7 = r7.acquire(r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            r0 = r6
        L44:
            java.util.concurrent.locks.ReentrantLock r7 = r0.f82468c     // Catch: java.lang.Throwable -> L82
            z.i r1 = r0.f82473h     // Catch: java.lang.Throwable -> L82
            r7.lock()     // Catch: java.lang.Throwable -> L82
            boolean r2 = r0.f82470e     // Catch: java.lang.Throwable -> L84
            if (r2 != 0) goto L86
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L78
            int r2 = r0.f82469d     // Catch: java.lang.Throwable -> L84
            int r3 = r0.f82466a     // Catch: java.lang.Throwable -> L84
            if (r2 < r3) goto L5c
            goto L78
        L5c:
            q5.n r2 = new q5.n     // Catch: java.lang.Throwable -> L84
            kv.a r3 = r0.f82467b     // Catch: java.lang.Throwable -> L84
            java.lang.Object r3 = r3.invoke()     // Catch: java.lang.Throwable -> L84
            x5.b r3 = (x5.b) r3     // Catch: java.lang.Throwable -> L84
            r4 = 2
            r5 = 0
            r2.<init>(r3, r5, r4, r5)     // Catch: java.lang.Throwable -> L84
            q5.n[] r3 = r0.f82471f     // Catch: java.lang.Throwable -> L84
            int r4 = r0.f82469d     // Catch: java.lang.Throwable -> L84
            int r5 = r4 + 1
            r0.f82469d = r5     // Catch: java.lang.Throwable -> L84
            r3[r4] = r2     // Catch: java.lang.Throwable -> L84
            r1.addLast(r2)     // Catch: java.lang.Throwable -> L84
        L78:
            java.lang.Object r1 = r1.popFirst()     // Catch: java.lang.Throwable -> L84
            q5.n r1 = (q5.n) r1     // Catch: java.lang.Throwable -> L84
            r7.unlock()     // Catch: java.lang.Throwable -> L82
            return r1
        L82:
            r7 = move-exception
            goto L97
        L84:
            r1 = move-exception
            goto L93
        L86:
            java.lang.String r1 = "Connection pool is closed"
            r2 = 21
            x5.a.throwSQLiteException(r2, r1)     // Catch: java.lang.Throwable -> L84
            tu.k r1 = new tu.k     // Catch: java.lang.Throwable -> L84
            r1.<init>()     // Catch: java.lang.Throwable -> L84
            throw r1     // Catch: java.lang.Throwable -> L84
        L93:
            r7.unlock()     // Catch: java.lang.Throwable -> L82
            throw r1     // Catch: java.lang.Throwable -> L82
        L97:
            kotlinx.coroutines.sync.Semaphore r0 = r0.f82472g
            r0.release()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.q.acquire(zu.d):java.lang.Object");
    }

    public final void close() {
        ReentrantLock reentrantLock = this.f82468c;
        reentrantLock.lock();
        try {
            this.f82470e = true;
            for (n nVar : this.f82471f) {
                if (nVar != null) {
                    nVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void dump(StringBuilder builder) {
        z.i iVar = this.f82473h;
        e0.checkNotNullParameter(builder, "builder");
        ReentrantLock reentrantLock = this.f82468c;
        reentrantLock.lock();
        try {
            List listCreateListBuilder = o0.createListBuilder();
            int size = iVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                listCreateListBuilder.add(iVar.get(i10));
            }
            List listBuild = o0.build(listCreateListBuilder);
            builder.append('\t' + toString() + " (");
            builder.append("capacity=" + this.f82466a + ", ");
            builder.append("permits=" + this.f82472g.getAvailablePermits() + ", ");
            builder.append("queue=(size=" + listBuild.size() + ")[" + y0.joinToString$default(listBuild, null, null, null, 0, null, null, 63, null) + "], ");
            builder.append(")");
            builder.append('\n');
            n[] nVarArr = this.f82471f;
            int length = nVarArr.length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                n nVar = nVarArr[i12];
                i11++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i11);
                sb2.append("] - ");
                sb2.append(nVar != null ? nVar.toString() : null);
                builder.append(sb2.toString());
                builder.append('\n');
                if (nVar != null) {
                    nVar.dump(builder);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int getCapacity() {
        return this.f82466a;
    }

    public final kv.a getConnectionFactory() {
        return this.f82467b;
    }

    public final void recycle(n connection) {
        e0.checkNotNullParameter(connection, "connection");
        ReentrantLock reentrantLock = this.f82468c;
        reentrantLock.lock();
        try {
            this.f82473h.addLast(connection);
            reentrantLock.unlock();
            this.f82472g.release();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
