package k4;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g1 implements s2 {

    /* renamed from: a, reason: collision with root package name */
    public final File f70341a;

    /* renamed from: b, reason: collision with root package name */
    public final h2 f70342b;

    /* renamed from: c, reason: collision with root package name */
    public final l1 f70343c;

    /* renamed from: d, reason: collision with root package name */
    public final kv.a f70344d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f70345e;

    /* renamed from: f, reason: collision with root package name */
    public final Mutex f70346f;

    public g1(File file, h2 serializer, l1 coordinator, kv.a onClose) {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.e0.checkNotNullParameter(serializer, "serializer");
        kotlin.jvm.internal.e0.checkNotNullParameter(coordinator, "coordinator");
        kotlin.jvm.internal.e0.checkNotNullParameter(onClose, "onClose");
        this.f70341a = file;
        this.f70342b = serializer;
        this.f70343c = coordinator;
        this.f70344d = onClose;
        this.f70345e = new AtomicBoolean(false);
        this.f70346f = MutexKt.Mutex$default(false, 1, null);
    }

    @Override // k4.s2, k4.d
    public void close() {
        this.f70345e.set(true);
        this.f70344d.invoke();
    }

    @Override // k4.s2
    public l1 getCoordinator() {
        return this.f70343c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007d, blocks: (B:33:0x007c, B:42:0x008d, B:41:0x008a, B:38:0x0085), top: B:56:0x0022, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [k4.g1] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k4.e1] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [k4.g1] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [kv.q] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // k4.s2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object readScope(kv.q r8, zu.d<? super R> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof k4.e1
            if (r0 == 0) goto L13
            r0 = r9
            k4.e1 r0 = (k4.e1) r0
            int r1 = r0.f70319n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f70319n = r1
            goto L18
        L13:
            k4.e1 r0 = new k4.e1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f70317l
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f70319n
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            boolean r8 = r0.f70316k
            k4.a1 r1 = r0.f70315j
            k4.g1 r0 = r0.f70314i
            tu.a0.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L30
            goto L6c
        L30:
            r9 = move-exception
            goto L85
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            tu.a0.throwOnFailure(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.f70345e
            boolean r9 = r9.get()
            if (r9 != 0) goto L9b
            kotlinx.coroutines.sync.Mutex r9 = r7.f70346f
            boolean r9 = kotlinx.coroutines.sync.Mutex.DefaultImpls.tryLock$default(r9, r4, r3, r4)
            k4.a1 r2 = new k4.a1     // Catch: java.lang.Throwable -> L8e
            java.io.File r5 = r7.f70341a     // Catch: java.lang.Throwable -> L8e
            k4.h2 r6 = r7.f70342b     // Catch: java.lang.Throwable -> L8e
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L8e
            java.lang.Boolean r5 = bv.b.boxBoolean(r9)     // Catch: java.lang.Throwable -> L7f
            r0.f70314i = r7     // Catch: java.lang.Throwable -> L7f
            r0.f70315j = r2     // Catch: java.lang.Throwable -> L7f
            r0.f70316k = r9     // Catch: java.lang.Throwable -> L7f
            r0.f70319n = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r8 = r8.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L7f
            if (r8 != r1) goto L67
            return r1
        L67:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L6c:
            r1.close()     // Catch: java.lang.Throwable -> L71
            r1 = r4
            goto L72
        L71:
            r1 = move-exception
        L72:
            if (r1 != 0) goto L7c
            if (r8 == 0) goto L7b
            kotlinx.coroutines.sync.Mutex r8 = r0.f70346f
            kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(r8, r4, r3, r4)
        L7b:
            return r9
        L7c:
            throw r1     // Catch: java.lang.Throwable -> L7d
        L7d:
            r9 = move-exception
            goto L93
        L7f:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L85:
            r1.close()     // Catch: java.lang.Throwable -> L89
            goto L8d
        L89:
            r1 = move-exception
            tu.h.addSuppressed(r9, r1)     // Catch: java.lang.Throwable -> L7d
        L8d:
            throw r9     // Catch: java.lang.Throwable -> L7d
        L8e:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
        L93:
            if (r8 == 0) goto L9a
            kotlinx.coroutines.sync.Mutex r8 = r0.f70346f
            kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(r8, r4, r3, r4)
        L9a:
            throw r9
        L9b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "StorageConnection has already been disposed."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.g1.readScope(kv.q, zu.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7 A[Catch: all -> 0x0107, IOException -> 0x0109, TRY_ENTER, TryCatch #0 {IOException -> 0x0109, blocks: (B:43:0x00d7, B:45:0x00dd, B:48:0x00e6, B:49:0x0106, B:56:0x0112, B:63:0x011f, B:62:0x011c), top: B:73:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112 A[Catch: all -> 0x0107, IOException -> 0x0109, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0109, blocks: (B:43:0x00d7, B:45:0x00dd, B:48:0x00e6, B:49:0x0106, B:56:0x0112, B:63:0x011f, B:62:0x011c), top: B:73:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // k4.s2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object writeScope(kv.p r11, zu.d<? super tu.x0> r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.g1.writeScope(kv.p, zu.d):java.lang.Object");
    }
}
