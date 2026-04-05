package d7;

import j1.o2;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import pw.h0;
import pw.n0;
import pw.r;
import sv.k0;
import sv.x;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e implements Closeable, Flushable {

    /* renamed from: u, reason: collision with root package name */
    public static final x f51877u;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f51878b;

    /* renamed from: c, reason: collision with root package name */
    public final long f51879c;

    /* renamed from: e, reason: collision with root package name */
    public final int f51880e;

    /* renamed from: f, reason: collision with root package name */
    public final int f51881f;

    /* renamed from: g, reason: collision with root package name */
    public final n0 f51882g;

    /* renamed from: h, reason: collision with root package name */
    public final n0 f51883h;

    /* renamed from: i, reason: collision with root package name */
    public final n0 f51884i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f51885j;

    /* renamed from: k, reason: collision with root package name */
    public final CoroutineScope f51886k;

    /* renamed from: l, reason: collision with root package name */
    public long f51887l;

    /* renamed from: m, reason: collision with root package name */
    public int f51888m;

    /* renamed from: n, reason: collision with root package name */
    public pw.j f51889n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f51890o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f51891p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f51892q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f51893r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f51894s;

    /* renamed from: t, reason: collision with root package name */
    public final f f51895t;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        public final c f51896a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f51897b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f51898c;

        public b(c cVar) {
            this.f51896a = cVar;
            this.f51898c = new boolean[e.this.f51881f];
        }

        public final void a(boolean z10) {
            e eVar = e.this;
            synchronized (eVar) {
                try {
                    if (this.f51897b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (e0.areEqual(this.f51896a.getCurrentEditor(), this)) {
                        e.access$completeEdit(eVar, this, z10);
                    }
                    this.f51897b = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void abort() {
            a(false);
        }

        public final void commit() {
            a(true);
        }

        public final d commitAndGet() {
            d dVar;
            e eVar = e.this;
            synchronized (eVar) {
                commit();
                dVar = eVar.get(this.f51896a.getKey());
            }
            return dVar;
        }

        public final void detach() {
            c cVar = this.f51896a;
            if (e0.areEqual(cVar.getCurrentEditor(), this)) {
                cVar.setZombie(true);
            }
        }

        public final n0 file(int i10) {
            n0 n0Var;
            e eVar = e.this;
            synchronized (eVar) {
                if (this.f51897b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.f51898c[i10] = true;
                n0 n0Var2 = this.f51896a.getDirtyFiles().get(i10);
                q7.e.createFile(eVar.f51895t, n0Var2);
                n0Var = n0Var2;
            }
            return n0Var;
        }

        public final c getEntry() {
            return this.f51896a;
        }

        public final boolean[] getWritten() {
            return this.f51898c;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f51900a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f51901b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f51902c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f51903d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f51904e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f51905f;

        /* renamed from: g, reason: collision with root package name */
        public b f51906g;

        /* renamed from: h, reason: collision with root package name */
        public int f51907h;

        public c(String str) {
            this.f51900a = str;
            this.f51901b = new long[e.this.f51881f];
            this.f51902c = new ArrayList(e.this.f51881f);
            this.f51903d = new ArrayList(e.this.f51881f);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int i10 = e.this.f51881f;
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(i11);
                this.f51902c.add(e.this.f51878b.resolve(sb2.toString()));
                sb2.append(".tmp");
                this.f51903d.add(e.this.f51878b.resolve(sb2.toString()));
                sb2.setLength(length);
            }
        }

        public final ArrayList<n0> getCleanFiles() {
            return this.f51902c;
        }

        public final b getCurrentEditor() {
            return this.f51906g;
        }

        public final ArrayList<n0> getDirtyFiles() {
            return this.f51903d;
        }

        public final String getKey() {
            return this.f51900a;
        }

        public final long[] getLengths() {
            return this.f51901b;
        }

        public final int getLockingSnapshotCount() {
            return this.f51907h;
        }

        public final boolean getReadable() {
            return this.f51904e;
        }

        public final boolean getZombie() {
            return this.f51905f;
        }

        public final void setCurrentEditor(b bVar) {
            this.f51906g = bVar;
        }

        public final void setLengths(List<String> list) throws IOException {
            if (list.size() != e.this.f51881f) {
                throw new IOException("unexpected journal line: " + list);
            }
            try {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f51901b[i10] = Long.parseLong(list.get(i10));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        public final void setLockingSnapshotCount(int i10) {
            this.f51907h = i10;
        }

        public final void setReadable(boolean z10) {
            this.f51904e = z10;
        }

        public final void setZombie(boolean z10) {
            this.f51905f = z10;
        }

        public final d snapshot() {
            if (!this.f51904e || this.f51906g != null || this.f51905f) {
                return null;
            }
            ArrayList arrayList = this.f51902c;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                e eVar = e.this;
                if (i10 >= size) {
                    this.f51907h++;
                    return eVar.new d(this);
                }
                if (!eVar.f51895t.exists((n0) arrayList.get(i10))) {
                    try {
                        e.access$removeEntry(eVar, this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i10++;
            }
        }

        public final void writeLengths(pw.j jVar) throws IOException {
            for (long j10 : this.f51901b) {
                jVar.writeByte(32).writeDecimalLong(j10);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class d implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        public final c f51909b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f51910c;

        public d(c cVar) {
            this.f51909b = cVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f51910c) {
                return;
            }
            this.f51910c = true;
            e eVar = e.this;
            synchronized (eVar) {
                this.f51909b.setLockingSnapshotCount(r1.getLockingSnapshotCount() - 1);
                if (this.f51909b.getLockingSnapshotCount() == 0 && this.f51909b.getZombie()) {
                    e.access$removeEntry(eVar, this.f51909b);
                }
            }
        }

        public final b closeAndEdit() {
            b bVarEdit;
            e eVar = e.this;
            synchronized (eVar) {
                close();
                bVarEdit = eVar.edit(this.f51909b.getKey());
            }
            return bVarEdit;
        }

        public final n0 file(int i10) {
            if (this.f51910c) {
                throw new IllegalStateException("snapshot is closed");
            }
            return this.f51909b.getCleanFiles().get(i10);
        }

        public final c getEntry() {
            return this.f51909b;
        }
    }

    static {
        new a(null);
        f51877u = new x("[a-z0-9_-]{1,120}");
    }

    public e(r rVar, n0 n0Var, CoroutineDispatcher coroutineDispatcher, long j10, int i10, int i11) {
        this.f51878b = n0Var;
        this.f51879c = j10;
        this.f51880e = i10;
        this.f51881f = i11;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f51882g = n0Var.resolve("journal");
        this.f51883h = n0Var.resolve("journal.tmp");
        this.f51884i = n0Var.resolve("journal.bkp");
        this.f51885j = new LinkedHashMap(0, 0.75f, true);
        this.f51886k = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(coroutineDispatcher.limitedParallelism(1)));
        this.f51895t = new f(rVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0126 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0012, B:9:0x0018, B:11:0x001d, B:13:0x0025, B:15:0x0037, B:21:0x0042, B:23:0x0047, B:25:0x0063, B:27:0x0078, B:29:0x008a, B:31:0x0091, B:26:0x0069, B:35:0x00b7, B:37:0x00c1, B:40:0x00c6, B:42:0x00d7, B:45:0x00de, B:47:0x0112, B:49:0x011d, B:53:0x0126, B:46:0x00fa, B:32:0x00a0, B:34:0x00a5, B:56:0x012b, B:57:0x0132), top: B:60:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void access$completeEdit(d7.e r9, d7.e.b r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.e.access$completeEdit(d7.e, d7.e$b, boolean):void");
    }

    public static final boolean access$journalRewriteRequired(e eVar) {
        return eVar.f51888m >= 2000;
    }

    public static final /* synthetic */ boolean access$removeEntry(e eVar, c cVar) throws IOException {
        eVar.n(cVar);
        return true;
    }

    public static void p(String str) {
        if (!f51877u.matches(str)) {
            throw new IllegalArgumentException(o2.f(AbstractJsonLexerKt.STRING, "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f51891p && !this.f51892q) {
                Object[] array = this.f51885j.values().toArray(new c[0]);
                e0.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                for (c cVar : (c[]) array) {
                    b currentEditor = cVar.getCurrentEditor();
                    if (currentEditor != null) {
                        currentEditor.detach();
                    }
                }
                o();
                CoroutineScopeKt.cancel$default(this.f51886k, null, 1, null);
                pw.j jVar = this.f51889n;
                e0.checkNotNull(jVar);
                jVar.close();
                this.f51889n = null;
                this.f51892q = true;
                return;
            }
            this.f51892q = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void d() {
        if (this.f51892q) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized b edit(String str) {
        d();
        p(str);
        initialize();
        c cVar = (c) this.f51885j.get(str);
        if ((cVar != null ? cVar.getCurrentEditor() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.getLockingSnapshotCount() != 0) {
            return null;
        }
        if (!this.f51893r && !this.f51894s) {
            pw.j jVar = this.f51889n;
            e0.checkNotNull(jVar);
            jVar.writeUtf8("DIRTY");
            jVar.writeByte(32);
            jVar.writeUtf8(str);
            jVar.writeByte(10);
            jVar.flush();
            if (this.f51890o) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(str);
                this.f51885j.put(str, cVar);
            }
            b bVar = new b(cVar);
            cVar.setCurrentEditor(bVar);
            return bVar;
        }
        h();
        return null;
    }

    public final synchronized void evictAll() {
        try {
            initialize();
            Object[] array = this.f51885j.values().toArray(new c[0]);
            e0.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            for (c cVar : (c[]) array) {
                n(cVar);
            }
            this.f51893r = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f51891p) {
            d();
            o();
            pw.j jVar = this.f51889n;
            e0.checkNotNull(jVar);
            jVar.flush();
        }
    }

    public final synchronized d get(String str) {
        d dVarSnapshot;
        d();
        p(str);
        initialize();
        c cVar = (c) this.f51885j.get(str);
        if (cVar != null && (dVarSnapshot = cVar.snapshot()) != null) {
            boolean z10 = true;
            this.f51888m++;
            pw.j jVar = this.f51889n;
            e0.checkNotNull(jVar);
            jVar.writeUtf8("READ");
            jVar.writeByte(32);
            jVar.writeUtf8(str);
            jVar.writeByte(10);
            if (this.f51888m < 2000) {
                z10 = false;
            }
            if (z10) {
                h();
            }
            return dVarSnapshot;
        }
        return null;
    }

    public final void h() {
        BuildersKt__Builders_commonKt.launch$default(this.f51886k, null, null, new g(this, null), 3, null);
    }

    public final synchronized void initialize() {
        try {
            if (this.f51891p) {
                return;
            }
            this.f51895t.delete(this.f51883h);
            if (this.f51895t.exists(this.f51884i)) {
                if (this.f51895t.exists(this.f51882g)) {
                    this.f51895t.delete(this.f51884i);
                } else {
                    this.f51895t.atomicMove(this.f51884i, this.f51882g);
                }
            }
            if (this.f51895t.exists(this.f51882g)) {
                try {
                    l();
                    k();
                    this.f51891p = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        q7.e.deleteContents(this.f51895t, this.f51878b);
                        this.f51892q = false;
                    } catch (Throwable th2) {
                        this.f51892q = false;
                        throw th2;
                    }
                }
            }
            q();
            this.f51891p = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void k() throws IOException {
        Iterator it = this.f51885j.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            b currentEditor = cVar.getCurrentEditor();
            int i10 = this.f51881f;
            int i11 = 0;
            if (currentEditor == null) {
                while (i11 < i10) {
                    j10 += cVar.getLengths()[i11];
                    i11++;
                }
            } else {
                cVar.setCurrentEditor(null);
                while (i11 < i10) {
                    n0 n0Var = cVar.getCleanFiles().get(i11);
                    f fVar = this.f51895t;
                    fVar.delete(n0Var);
                    fVar.delete(cVar.getDirtyFiles().get(i11));
                    i11++;
                }
                it.remove();
            }
        }
        this.f51887l = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            d7.f r2 = r13.f51895t
            pw.n0 r3 = r13.f51882g
            pw.b1 r4 = r2.source(r3)
            pw.k r4 = pw.h0.buffer(r4)
            r5 = 0
            java.lang.String r6 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r7 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r8 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r9 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r10 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r11 = "libcore.io.DiskLruCache"
            boolean r11 = kotlin.jvm.internal.e0.areEqual(r11, r6)     // Catch: java.lang.Throwable -> L5e
            if (r11 == 0) goto L8a
            java.lang.String r11 = "1"
            boolean r11 = kotlin.jvm.internal.e0.areEqual(r11, r7)     // Catch: java.lang.Throwable -> L5e
            if (r11 == 0) goto L8a
            int r11 = r13.f51880e     // Catch: java.lang.Throwable -> L5e
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L5e
            boolean r11 = kotlin.jvm.internal.e0.areEqual(r11, r8)     // Catch: java.lang.Throwable -> L5e
            if (r11 == 0) goto L8a
            int r11 = r13.f51881f     // Catch: java.lang.Throwable -> L5e
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L5e
            boolean r11 = kotlin.jvm.internal.e0.areEqual(r11, r9)     // Catch: java.lang.Throwable -> L5e
            if (r11 == 0) goto L8a
            int r11 = r10.length()     // Catch: java.lang.Throwable -> L5e
            if (r11 > 0) goto L8a
            r0 = 0
        L54:
            java.lang.String r1 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5e java.io.EOFException -> L60
            r13.m(r1)     // Catch: java.lang.Throwable -> L5e java.io.EOFException -> L60
            int r0 = r0 + 1
            goto L54
        L5e:
            r0 = move-exception
            goto Lb9
        L60:
            java.util.LinkedHashMap r1 = r13.f51885j     // Catch: java.lang.Throwable -> L5e
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L5e
            int r0 = r0 - r1
            r13.f51888m = r0     // Catch: java.lang.Throwable -> L5e
            boolean r0 = r4.exhausted()     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L73
            r13.q()     // Catch: java.lang.Throwable -> L5e
            goto L87
        L73:
            pw.z0 r0 = r2.appendingSink(r3)     // Catch: java.lang.Throwable -> L5e
            d7.i r1 = new d7.i     // Catch: java.lang.Throwable -> L5e
            d7.h r2 = new d7.h     // Catch: java.lang.Throwable -> L5e
            r2.<init>(r13)     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L5e
            pw.j r0 = pw.h0.buffer(r1)     // Catch: java.lang.Throwable -> L5e
            r13.f51889n = r0     // Catch: java.lang.Throwable -> L5e
        L87:
            tu.x0 r0 = tu.x0.f87415a     // Catch: java.lang.Throwable -> L5e
            goto Lbc
        L8a:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L5e
            r3.append(r6)     // Catch: java.lang.Throwable -> L5e
            r3.append(r0)     // Catch: java.lang.Throwable -> L5e
            r3.append(r7)     // Catch: java.lang.Throwable -> L5e
            r3.append(r0)     // Catch: java.lang.Throwable -> L5e
            r3.append(r8)     // Catch: java.lang.Throwable -> L5e
            r3.append(r0)     // Catch: java.lang.Throwable -> L5e
            r3.append(r9)     // Catch: java.lang.Throwable -> L5e
            r3.append(r0)     // Catch: java.lang.Throwable -> L5e
            r3.append(r10)     // Catch: java.lang.Throwable -> L5e
            r0 = 93
            r3.append(r0)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L5e
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5e
            throw r2     // Catch: java.lang.Throwable -> L5e
        Lb9:
            r12 = r5
            r5 = r0
            r0 = r12
        Lbc:
            if (r4 == 0) goto Lca
            r4.close()     // Catch: java.lang.Throwable -> Lc2
            goto Lca
        Lc2:
            r1 = move-exception
            if (r5 != 0) goto Lc7
            r5 = r1
            goto Lca
        Lc7:
            tu.h.addSuppressed(r5, r1)
        Lca:
            if (r5 != 0) goto Ld0
            kotlin.jvm.internal.e0.checkNotNull(r0)
            return
        Ld0:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.e.l():void");
    }

    public final void m(String str) throws IOException {
        String strSubstring;
        int iIndexOf$default = sv.n0.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IOException(a.b.k("unexpected journal line: ", str));
        }
        int i10 = iIndexOf$default + 1;
        int iIndexOf$default2 = sv.n0.indexOf$default((CharSequence) str, ' ', i10, false, 4, (Object) null);
        LinkedHashMap linkedHashMap = this.f51885j;
        if (iIndexOf$default2 == -1) {
            strSubstring = str.substring(i10);
            e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (iIndexOf$default == 6 && k0.startsWith$default(str, "REMOVE", false, 2, null)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf$default2);
            e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Object cVar = linkedHashMap.get(strSubstring);
        if (cVar == null) {
            cVar = new c(strSubstring);
            linkedHashMap.put(strSubstring, cVar);
        }
        c cVar2 = (c) cVar;
        if (iIndexOf$default2 != -1 && iIndexOf$default == 5 && k0.startsWith$default(str, "CLEAN", false, 2, null)) {
            String strSubstring2 = str.substring(iIndexOf$default2 + 1);
            e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            List<String> listSplit$default = sv.n0.split$default((CharSequence) strSubstring2, new char[]{' '}, false, 0, 6, (Object) null);
            cVar2.setReadable(true);
            cVar2.setCurrentEditor(null);
            cVar2.setLengths(listSplit$default);
            return;
        }
        if (iIndexOf$default2 == -1 && iIndexOf$default == 5 && k0.startsWith$default(str, "DIRTY", false, 2, null)) {
            cVar2.setCurrentEditor(new b(cVar2));
        } else if (iIndexOf$default2 != -1 || iIndexOf$default != 4 || !k0.startsWith$default(str, "READ", false, 2, null)) {
            throw new IOException(a.b.k("unexpected journal line: ", str));
        }
    }

    public final void n(c cVar) throws IOException {
        pw.j jVar;
        if (cVar.getLockingSnapshotCount() > 0 && (jVar = this.f51889n) != null) {
            jVar.writeUtf8("DIRTY");
            jVar.writeByte(32);
            jVar.writeUtf8(cVar.getKey());
            jVar.writeByte(10);
            jVar.flush();
        }
        if (cVar.getLockingSnapshotCount() > 0 || cVar.getCurrentEditor() != null) {
            cVar.setZombie(true);
            return;
        }
        for (int i10 = 0; i10 < this.f51881f; i10++) {
            this.f51895t.delete(cVar.getCleanFiles().get(i10));
            this.f51887l -= cVar.getLengths()[i10];
            cVar.getLengths()[i10] = 0;
        }
        this.f51888m++;
        pw.j jVar2 = this.f51889n;
        if (jVar2 != null) {
            jVar2.writeUtf8("REMOVE");
            jVar2.writeByte(32);
            jVar2.writeUtf8(cVar.getKey());
            jVar2.writeByte(10);
        }
        this.f51885j.remove(cVar.getKey());
        if (this.f51888m >= 2000) {
            h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        n(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            long r0 = r4.f51887l
            long r2 = r4.f51879c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L29
            java.util.LinkedHashMap r0 = r4.f51885j
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            d7.e$c r1 = (d7.e.c) r1
            boolean r2 = r1.getZombie()
            if (r2 != 0) goto L12
            r4.n(r1)
            goto L0
        L28:
            return
        L29:
            r0 = 0
            r4.f51893r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.e.o():void");
    }

    public final synchronized void q() {
        x0 x0Var;
        try {
            pw.j jVar = this.f51889n;
            if (jVar != null) {
                jVar.close();
            }
            pw.j jVarBuffer = h0.buffer(this.f51895t.sink(this.f51883h, false));
            Throwable th2 = null;
            try {
                jVarBuffer.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
                jVarBuffer.writeUtf8("1").writeByte(10);
                jVarBuffer.writeDecimalLong(this.f51880e).writeByte(10);
                jVarBuffer.writeDecimalLong(this.f51881f).writeByte(10);
                jVarBuffer.writeByte(10);
                for (c cVar : this.f51885j.values()) {
                    if (cVar.getCurrentEditor() != null) {
                        jVarBuffer.writeUtf8("DIRTY");
                        jVarBuffer.writeByte(32);
                        jVarBuffer.writeUtf8(cVar.getKey());
                        jVarBuffer.writeByte(10);
                    } else {
                        jVarBuffer.writeUtf8("CLEAN");
                        jVarBuffer.writeByte(32);
                        jVarBuffer.writeUtf8(cVar.getKey());
                        cVar.writeLengths(jVarBuffer);
                        jVarBuffer.writeByte(10);
                    }
                }
                x0Var = x0.f87415a;
            } catch (Throwable th3) {
                x0Var = null;
                th2 = th3;
            }
            if (jVarBuffer != null) {
                try {
                    jVarBuffer.close();
                } catch (Throwable th4) {
                    if (th2 == null) {
                        th2 = th4;
                    } else {
                        tu.h.addSuppressed(th2, th4);
                    }
                }
            }
            if (th2 != null) {
                throw th2;
            }
            e0.checkNotNull(x0Var);
            if (this.f51895t.exists(this.f51882g)) {
                this.f51895t.atomicMove(this.f51882g, this.f51884i);
                this.f51895t.atomicMove(this.f51883h, this.f51882g);
                this.f51895t.delete(this.f51884i);
            } else {
                this.f51895t.atomicMove(this.f51883h, this.f51882g);
            }
            this.f51889n = h0.buffer(new i(this.f51895t.appendingSink(this.f51882g), new h(this)));
            this.f51888m = 0;
            this.f51890o = false;
            this.f51894s = false;
        } finally {
        }
    }

    public final synchronized boolean remove(String str) {
        d();
        p(str);
        initialize();
        c cVar = (c) this.f51885j.get(str);
        if (cVar == null) {
            return false;
        }
        n(cVar);
        if (this.f51887l <= this.f51879c) {
            this.f51893r = false;
        }
        return true;
    }

    public final synchronized long size() {
        initialize();
        return this.f51887l;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public static /* synthetic */ void getJOURNAL_FILE$coil_base_release$annotations() {
        }

        public static /* synthetic */ void getJOURNAL_FILE_BACKUP$coil_base_release$annotations() {
        }

        public static /* synthetic */ void getJOURNAL_FILE_TMP$coil_base_release$annotations() {
        }

        public static /* synthetic */ void getMAGIC$coil_base_release$annotations() {
        }

        public static /* synthetic */ void getVERSION$coil_base_release$annotations() {
        }
    }
}
