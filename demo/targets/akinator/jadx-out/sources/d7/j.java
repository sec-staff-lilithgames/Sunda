package d7;

import d7.e;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineDispatcher;
import pw.l;
import pw.n0;
import pw.r;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final long f51916a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f51917b;

    /* renamed from: c, reason: collision with root package name */
    public final r f51918c;

    /* renamed from: d, reason: collision with root package name */
    public final e f51919d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements d7.b {

        /* renamed from: a, reason: collision with root package name */
        public final e.b f51920a;

        public b(e.b bVar) {
            this.f51920a = bVar;
        }

        @Override // d7.b
        public void abort() {
            this.f51920a.abort();
        }

        @Override // d7.b
        public void commit() {
            this.f51920a.commit();
        }

        @Override // d7.b
        public n0 getData() {
            return this.f51920a.file(1);
        }

        @Override // d7.b
        public n0 getMetadata() {
            return this.f51920a.file(0);
        }

        @Override // d7.b
        public c commitAndGet() {
            e.d dVarCommitAndGet = this.f51920a.commitAndGet();
            if (dVarCommitAndGet != null) {
                return new c(dVarCommitAndGet);
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements d7.c {

        /* renamed from: b, reason: collision with root package name */
        public final e.d f51921b;

        public c(e.d dVar) {
            this.f51921b = dVar;
        }

        @Override // d7.c, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f51921b.close();
        }

        @Override // d7.c
        public n0 getData() {
            return this.f51921b.file(1);
        }

        @Override // d7.c
        public n0 getMetadata() {
            return this.f51921b.file(0);
        }

        @Override // d7.c
        public b closeAndEdit() {
            e.b bVarCloseAndEdit = this.f51921b.closeAndEdit();
            if (bVarCloseAndEdit != null) {
                return new b(bVarCloseAndEdit);
            }
            return null;
        }
    }

    static {
        new a(null);
    }

    public j(long j10, n0 n0Var, r rVar, CoroutineDispatcher coroutineDispatcher) {
        this.f51916a = j10;
        this.f51917b = n0Var;
        this.f51918c = rVar;
        this.f51919d = new e(getFileSystem(), getDirectory(), coroutineDispatcher, getMaxSize(), 1, 2);
    }

    @Override // d7.d
    public void clear() {
        this.f51919d.evictAll();
    }

    @Override // d7.d
    public d7.b edit(String str) {
        e.b bVarEdit = this.f51919d.edit(l.f81911f.encodeUtf8(str).sha256().hex());
        if (bVarEdit != null) {
            return new b(bVarEdit);
        }
        return null;
    }

    @Override // d7.d
    public d7.c get(String str) {
        e.d dVar = this.f51919d.get(l.f81911f.encodeUtf8(str).sha256().hex());
        if (dVar != null) {
            return new c(dVar);
        }
        return null;
    }

    @Override // d7.d
    public n0 getDirectory() {
        return this.f51917b;
    }

    @Override // d7.d
    public r getFileSystem() {
        return this.f51918c;
    }

    @Override // d7.d
    public long getMaxSize() {
        return this.f51916a;
    }

    @Override // d7.d
    public long getSize() {
        return this.f51919d.size();
    }

    @Override // d7.d
    public boolean remove(String str) {
        return this.f51919d.remove(l.f81911f.encodeUtf8(str).sha256().hex());
    }
}
