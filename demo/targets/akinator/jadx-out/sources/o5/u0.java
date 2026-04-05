package o5;

import java.util.Collection;
import java.util.List;
import o5.a;
import o5.r1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u0 extends o5.a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f77730h = 0;

    /* renamed from: c, reason: collision with root package name */
    public final l f77731c;

    /* renamed from: d, reason: collision with root package name */
    public final r1 f77732d;

    /* renamed from: e, reason: collision with root package name */
    public final List f77733e;

    /* renamed from: f, reason: collision with root package name */
    public final q5.f f77734f;

    /* renamed from: g, reason: collision with root package name */
    public y5.c f77735g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends r1 {
        public a() {
            super(-1, "", "");
        }

        @Override // o5.r1
        public void createAllTables(x5.b connection) {
            kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // o5.r1
        public void dropAllTables(x5.b connection) {
            kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // o5.r1
        public void onCreate(x5.b connection) {
            kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // o5.r1
        public void onOpen(x5.b connection) {
            kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // o5.r1
        public void onPostMigrate(x5.b connection) {
            kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // o5.r1
        public void onPreMigrate(x5.b connection) {
            kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // o5.r1
        public r1.a onValidateSchema(x5.b connection) {
            kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b extends y5.d {
        public b(int i10) {
            super(i10);
        }

        @Override // y5.d
        public void onCreate(y5.c db2) throws Exception {
            kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
            u0.this.e(new r5.a(db2));
        }

        @Override // y5.d
        public void onDowngrade(y5.c db2, int i10, int i11) throws Exception {
            kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
            onUpgrade(db2, i10, i11);
        }

        @Override // y5.d
        public void onOpen(y5.c db2) throws Exception {
            kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
            r5.a aVar = new r5.a(db2);
            u0 u0Var = u0.this;
            u0Var.g(aVar);
            u0Var.f77735g = db2;
        }

        @Override // y5.d
        public void onUpgrade(y5.c db2, int i10, int i11) throws Exception {
            kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
            u0.this.f(new r5.a(db2), i10, i11);
        }
    }

    public u0(l config, r1 openDelegate) {
        int i10;
        q5.f fVarNewConnectionPool;
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.e0.checkNotNullParameter(openDelegate, "openDelegate");
        this.f77731c = config;
        this.f77732d = openDelegate;
        List list = config.f77625e;
        z0 z0Var = config.f77627g;
        y5.f fVar = config.f77623c;
        String str = config.f77622b;
        this.f77733e = list == null ? uu.p0.emptyList() : list;
        x5.c cVar = config.f77641u;
        if (cVar != null) {
            if (cVar instanceof a6.b) {
                fVarNewConnectionPool = new q5.a(new a.b(this, cVar), str == null ? ":memory:" : str);
            } else if (str == null) {
                fVarNewConnectionPool = q5.m.newSingleConnectionPool(new a.b(this, cVar), ":memory:");
            } else {
                a.b bVar = new a.b(this, cVar);
                kotlin.jvm.internal.e0.checkNotNullParameter(z0Var, "<this>");
                int[] iArr = c.$EnumSwitchMapping$0;
                int i11 = iArr[z0Var.ordinal()];
                if (i11 == 1) {
                    i10 = 1;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + z0Var + '\'').toString());
                    }
                    i10 = 4;
                }
                kotlin.jvm.internal.e0.checkNotNullParameter(z0Var, "<this>");
                int i12 = iArr[z0Var.ordinal()];
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + z0Var + '\'').toString());
                }
                fVarNewConnectionPool = q5.m.newConnectionPool(bVar, str, i10, 1);
            }
            this.f77734f = fVarNewConnectionPool;
        } else {
            if (fVar == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
            this.f77734f = new r5.b(new r5.c(fVar.create(y5.e.f94075f.builder(config.f77621a).name(str).callback(new b(openDelegate.getVersion())).build())));
        }
        boolean z10 = config.f77627g == z0.f77855e;
        y5.g supportOpenHelper$room_runtime_release = getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release != null) {
            supportOpenHelper$room_runtime_release.setWriteAheadLoggingEnabled(z10);
        }
    }

    @Override // o5.a
    public final List b() {
        return this.f77733e;
    }

    @Override // o5.a
    public final l c() {
        return this.f77731c;
    }

    public final void close() {
        this.f77734f.close();
    }

    @Override // o5.a
    public final r1 d() {
        return this.f77732d;
    }

    public final y5.g getSupportOpenHelper$room_runtime_release() {
        r5.c supportDriver$room_runtime_release;
        q5.f fVar = this.f77734f;
        r5.b bVar = fVar instanceof r5.b ? (r5.b) fVar : null;
        if (bVar == null || (supportDriver$room_runtime_release = bVar.getSupportDriver$room_runtime_release()) == null) {
            return null;
        }
        return supportDriver$room_runtime_release.getOpenHelper();
    }

    public final boolean isSupportDatabaseOpen() {
        y5.c cVar = this.f77735g;
        if (cVar != null) {
            return cVar.isOpen();
        }
        return false;
    }

    @Override // o5.a
    public String resolveFileName$room_runtime_release(String fileName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fileName, "fileName");
        if (kotlin.jvm.internal.e0.areEqual(fileName, ":memory:")) {
            return fileName;
        }
        String absolutePath = this.f77731c.f77621a.getDatabasePath(fileName).getAbsolutePath();
        kotlin.jvm.internal.e0.checkNotNull(absolutePath);
        return absolutePath;
    }

    @Override // o5.a
    public <R> Object useConnection(boolean z10, kv.p pVar, zu.d<? super R> dVar) {
        return this.f77734f.useConnection(z10, pVar, dVar);
    }

    public u0(l config, kv.l supportOpenHelperFactory) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.e0.checkNotNullParameter(supportOpenHelperFactory, "supportOpenHelperFactory");
        this.f77731c = config;
        this.f77732d = new a();
        List list = config.f77625e;
        this.f77733e = list == null ? uu.p0.emptyList() : list;
        aw.f fVar = new aw.f(this, 25);
        List list2 = config.f77625e;
        this.f77734f = new r5.b(new r5.c((y5.g) supportOpenHelperFactory.invoke(l.copy$default(config, null, null, null, null, uu.y0.plus((Collection<? extends v0>) (list2 == null ? uu.p0.emptyList() : list2), new v0(fVar)), false, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, 4194287, null))));
        boolean z10 = config.f77627g == z0.f77855e;
        y5.g supportOpenHelper$room_runtime_release = getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release != null) {
            supportOpenHelper$room_runtime_release.setWriteAheadLoggingEnabled(z10);
        }
    }
}
