package q5;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l implements f {

    /* renamed from: b, reason: collision with root package name */
    public final q f82441b;

    /* renamed from: c, reason: collision with root package name */
    public final q f82442c;

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f82443e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f82444f;

    /* renamed from: g, reason: collision with root package name */
    public long f82445g;

    public l(final x5.c driver, final String fileName) {
        e0.checkNotNullParameter(driver, "driver");
        e0.checkNotNullParameter(fileName, "fileName");
        this.f82443e = new ThreadLocal();
        this.f82444f = new AtomicBoolean(false);
        tv.e eVar = tv.f.f87433c;
        this.f82445g = tv.h.toDuration(30, tv.i.f87442g);
        final int i10 = 2;
        q qVar = new q(1, new kv.a() { // from class: q5.g
            @Override // kv.a
            public final Object invoke() throws Exception {
                switch (i10) {
                    case 0:
                        x5.b bVarOpen = driver.open(fileName);
                        x5.a.execSQL(bVarOpen, "PRAGMA query_only = 1");
                        break;
                }
                return driver.open(fileName);
            }
        });
        this.f82441b = qVar;
        this.f82442c = qVar;
    }

    public final void a(boolean z10) {
        String str = z10 ? "reader" : "writer";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Timed out attempting to acquire a " + str + " connection.");
        sb2.append("\n\nWriter pool:\n");
        this.f82442c.dump(sb2);
        sb2.append("Reader pool:");
        sb2.append('\n');
        this.f82441b.dump(sb2);
        x5.a.throwSQLiteException(5, sb2.toString());
        throw new tu.k();
    }

    @Override // q5.f, java.lang.AutoCloseable
    public void close() {
        if (this.f82444f.compareAndSet(false, true)) {
            this.f82441b.close();
            this.f82442c.close();
        }
    }

    /* renamed from: getTimeout-UwyO8pc$room_runtime_release, reason: not valid java name */
    public final long m5977getTimeoutUwyO8pc$room_runtime_release() {
        return this.f82445g;
    }

    /* renamed from: setTimeout-LRDsOJo$room_runtime_release, reason: not valid java name */
    public final void m5978setTimeoutLRDsOJo$room_runtime_release(long j10) {
        this.f82445g = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x014b A[Catch: all -> 0x015f, TryCatch #7 {all -> 0x015f, blocks: (B:69:0x0137, B:71:0x014b, B:76:0x015b, B:80:0x0164, B:84:0x016e, B:92:0x01b3, B:93:0x01ba, B:94:0x01bb, B:95:0x01bc, B:96:0x01bf), top: B:126:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a1 A[Catch: all -> 0x01b2, TRY_LEAVE, TryCatch #1 {all -> 0x01b2, blocks: (B:88:0x019b, B:90:0x01a1), top: B:114:0x019b }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bc A[Catch: all -> 0x015f, TryCatch #7 {all -> 0x015f, blocks: (B:69:0x0137, B:71:0x014b, B:76:0x015b, B:80:0x0164, B:84:0x016e, B:92:0x01b3, B:93:0x01ba, B:94:0x01bb, B:95:0x01bc, B:96:0x01bf), top: B:126:0x0137 }] */
    @Override // q5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object useConnection(boolean r18, kv.p r19, zu.d<? super R> r20) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.l.useConnection(boolean, kv.p, zu.d):java.lang.Object");
    }

    public l(final x5.c driver, final String fileName, int i10, int i11) {
        e0.checkNotNullParameter(driver, "driver");
        e0.checkNotNullParameter(fileName, "fileName");
        this.f82443e = new ThreadLocal();
        final int i12 = 0;
        this.f82444f = new AtomicBoolean(false);
        tv.e eVar = tv.f.f87433c;
        this.f82445g = tv.h.toDuration(30, tv.i.f87442g);
        if (i10 <= 0) {
            throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
        }
        if (i11 > 0) {
            this.f82441b = new q(i10, new kv.a() { // from class: q5.g
                @Override // kv.a
                public final Object invoke() throws Exception {
                    switch (i12) {
                        case 0:
                            x5.b bVarOpen = driver.open(fileName);
                            x5.a.execSQL(bVarOpen, "PRAGMA query_only = 1");
                            break;
                    }
                    return driver.open(fileName);
                }
            });
            final int i13 = 1;
            this.f82442c = new q(i11, new kv.a() { // from class: q5.g
                @Override // kv.a
                public final Object invoke() throws Exception {
                    switch (i13) {
                        case 0:
                            x5.b bVarOpen = driver.open(fileName);
                            x5.a.execSQL(bVarOpen, "PRAGMA query_only = 1");
                            break;
                    }
                    return driver.open(fileName);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of writers must be greater than 0");
    }
}
