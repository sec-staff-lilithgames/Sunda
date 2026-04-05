package k4;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.File;
import java.io.IOException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q1 implements l1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f70472j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final String f70473k = "Resource deadlock would occur";

    /* renamed from: l, reason: collision with root package name */
    public static final long f70474l = 10;

    /* renamed from: m, reason: collision with root package name */
    public static final long f70475m = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;

    /* renamed from: a, reason: collision with root package name */
    public final zu.m f70476a;

    /* renamed from: b, reason: collision with root package name */
    public final File f70477b;

    /* renamed from: c, reason: collision with root package name */
    public final Flow f70478c;

    /* renamed from: d, reason: collision with root package name */
    public final String f70479d;

    /* renamed from: e, reason: collision with root package name */
    public final String f70480e;

    /* renamed from: f, reason: collision with root package name */
    public final String f70481f;

    /* renamed from: g, reason: collision with root package name */
    public final Mutex f70482g;

    /* renamed from: h, reason: collision with root package name */
    public final tu.o f70483h;

    /* renamed from: i, reason: collision with root package name */
    public final tu.o f70484i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:27:0x0081). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final java.lang.Object access$getExclusiveFileLockWithRetryIfDeadlock(k4.q1.a r12, java.io.FileOutputStream r13, zu.d r14) throws java.io.IOException {
            /*
                r12.getClass()
                boolean r0 = r14 instanceof k4.p1
                if (r0 == 0) goto L16
                r0 = r14
                k4.p1 r0 = (k4.p1) r0
                int r1 = r0.f70459m
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L16
                int r1 = r1 - r2
                r0.f70459m = r1
                goto L1b
            L16:
                k4.p1 r0 = new k4.p1
                r0.<init>(r12, r14)
            L1b:
                java.lang.Object r12 = r0.f70457k
                java.lang.Object r14 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r0.f70459m
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3a
                if (r1 != r3) goto L32
                long r4 = r0.f70456j
                java.io.FileOutputStream r13 = r0.f70455i
                tu.a0.throwOnFailure(r12)
                r12 = r0
                goto L81
            L32:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L3a:
                tu.a0.throwOnFailure(r12)
                long r4 = k4.q1.access$getINITIAL_WAIT_MILLIS$cp()
                r12 = r0
            L42:
                long r0 = k4.q1.access$getMAX_WAIT_MILLIS$cp()
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            */
            //  java.lang.String r1 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
            /*
                if (r0 > 0) goto L85
                java.nio.channels.FileChannel r6 = r13.getChannel()     // Catch: java.io.IOException -> L61
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r11 = 0
                r7 = 0
                java.nio.channels.FileLock r0 = r6.lock(r7, r9, r11)     // Catch: java.io.IOException -> L61
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r1)     // Catch: java.io.IOException -> L61
                r14 = r0
                goto L98
            L61:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                if (r1 == 0) goto L84
                java.lang.String r6 = k4.q1.access$getDEADLOCK_ERROR_MESSAGE$cp()
                r7 = 0
                r8 = 0
                boolean r1 = sv.n0.contains$default(r1, r6, r7, r2, r8)
                if (r1 != r3) goto L84
                r12.f70455i = r13
                r12.f70456j = r4
                r12.f70459m = r3
                java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r4, r12)
                if (r0 != r14) goto L81
                goto L98
            L81:
                long r0 = (long) r2
                long r4 = r4 * r0
                goto L42
            L84:
                throw r0
            L85:
                java.nio.channels.FileChannel r6 = r13.getChannel()
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r11 = 0
                r7 = 0
                java.nio.channels.FileLock r14 = r6.lock(r7, r9, r11)
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r14, r1)
            L98:
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: k4.q1.a.access$getExclusiveFileLockWithRetryIfDeadlock(k4.q1$a, java.io.FileOutputStream, zu.d):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {
        public b(zu.d dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            return q1.this.new b(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            return bv.b.boxInt(q1.access$getSharedCounter(q1.this).getValue());
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.n implements kv.p {
        public c(zu.d dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            return q1.this.new c(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            return bv.b.boxInt(q1.access$getSharedCounter(q1.this).incrementAndGetValue());
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }
    }

    public q1(zu.m context, File file) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        this.f70476a = context;
        this.f70477b = file;
        this.f70478c = c2.f70301c.observe(file);
        this.f70479d = ".lock";
        this.f70480e = ".version";
        this.f70481f = "fcntl failed: EAGAIN";
        this.f70482g = MutexKt.Mutex$default(false, 1, null);
        this.f70483h = tu.q.lazy(new u1(this));
        this.f70484i = tu.q.lazy(new s1(this));
    }

    public static final void access$createIfNotExists(q1 q1Var, File file) throws IOException {
        q1Var.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException(j1.o2.h(file, "Unable to create parent directories of "));
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    public static final File access$fileWithSuffix(q1 q1Var, String str) {
        q1Var.getClass();
        return new File(q1Var.f70477b.getAbsolutePath() + str);
    }

    public static final i2 access$getSharedCounter(q1 q1Var) {
        return (i2) q1Var.f70484i.getValue();
    }

    @Override // k4.l1
    public Flow<tu.x0> getUpdateNotifications() {
        return this.f70478c;
    }

    @Override // k4.l1
    public Object getVersion(zu.d<? super Integer> dVar) {
        tu.o oVar = this.f70484i;
        if (oVar.isInitialized()) {
            return bv.b.boxInt(((i2) oVar.getValue()).getValue());
        }
        return BuildersKt.withContext(this.f70476a, new b(null), dVar);
    }

    @Override // k4.l1
    public Object incrementAndGetVersion(zu.d<? super Integer> dVar) {
        tu.o oVar = this.f70484i;
        if (oVar.isInitialized()) {
            return bv.b.boxInt(((i2) oVar.getValue()).incrementAndGetValue());
        }
        return BuildersKt.withContext(this.f70476a, new c(null), dVar);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf A[Catch: all -> 0x00c3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00c3, blocks: (B:42:0x00bf, B:56:0x00dd, B:57:0x00e0), top: B:69:0x0024, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd A[Catch: all -> 0x00c3, TRY_ENTER, TryCatch #2 {all -> 0x00c3, blocks: (B:42:0x00bf, B:56:0x00dd, B:57:0x00e0), top: B:69:0x0024, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object] */
    @Override // k4.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object lock(kv.l r9, zu.d<? super T> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.q1.lock(kv.l, zu.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e2 A[Catch: all -> 0x00e6, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00e6, blocks: (B:59:0x00e2, B:71:0x00fd, B:72:0x0100), top: B:86:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fd A[Catch: all -> 0x00e6, TRY_ENTER, TryCatch #2 {all -> 0x00e6, blocks: (B:59:0x00e2, B:71:0x00fd, B:72:0x0100), top: B:86:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARN: Type inference failed for: r2v0, types: [kv.p] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, k4.v1] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // k4.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object tryLock(kv.p r19, zu.d<? super T> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.q1.tryLock(kv.p, zu.d):java.lang.Object");
    }
}
