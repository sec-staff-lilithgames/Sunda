package p5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f80680c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f80681d = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f80682a;

    /* renamed from: b, reason: collision with root package name */
    public final c f80683b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public static final c access$getFileLock(a aVar, String str) {
            aVar.getClass();
            return new c(str);
        }

        public static final ReentrantLock access$getThreadLock(a aVar, String str) {
            ReentrantLock reentrantLock;
            synchronized (aVar) {
                try {
                    Map map = b.f80681d;
                    Object reentrantLock2 = map.get(str);
                    if (reentrantLock2 == null) {
                        reentrantLock2 = new ReentrantLock();
                        map.put(str, reentrantLock2);
                    }
                    reentrantLock = (ReentrantLock) reentrantLock2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return reentrantLock;
        }
    }

    public b(String filename, boolean z10) {
        e0.checkNotNullParameter(filename, "filename");
        a aVar = f80680c;
        this.f80682a = a.access$getThreadLock(aVar, filename);
        this.f80683b = z10 ? a.access$getFileLock(aVar, filename) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[Catch: all -> 0x0025, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0025, blocks: (B:11:0x0021, B:19:0x002f, B:20:0x0032, B:9:0x001b), top: B:29:0x001b, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T withLock(kv.a r4, kv.l r5) {
        /*
            r3 = this;
            java.lang.String r0 = "onLocked"
            kotlin.jvm.internal.e0.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "onLockError"
            kotlin.jvm.internal.e0.checkNotNullParameter(r5, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r3.f80682a
            r0.lock()
            p5.c r1 = r3.f80683b
            if (r1 == 0) goto L1a
            r1.lock()     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r4 = move-exception
            r1 = 0
            goto L33
        L1a:
            r2 = 1
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L28
            r1.unlock()     // Catch: java.lang.Throwable -> L25
            goto L28
        L25:
            r4 = move-exception
            r1 = r2
            goto L33
        L28:
            r0.unlock()
            return r4
        L2c:
            r4 = move-exception
            if (r1 == 0) goto L32
            r1.unlock()     // Catch: java.lang.Throwable -> L25
        L32:
            throw r4     // Catch: java.lang.Throwable -> L25
        L33:
            if (r1 == 0) goto L38
            throw r4     // Catch: java.lang.Throwable -> L36
        L36:
            r4 = move-exception
            goto L41
        L38:
            r5.invoke(r4)     // Catch: java.lang.Throwable -> L36
            tu.k r4 = new tu.k     // Catch: java.lang.Throwable -> L36
            r4.<init>()     // Catch: java.lang.Throwable -> L36
            throw r4     // Catch: java.lang.Throwable -> L36
        L41:
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.b.withLock(kv.a, kv.l):java.lang.Object");
    }
}
