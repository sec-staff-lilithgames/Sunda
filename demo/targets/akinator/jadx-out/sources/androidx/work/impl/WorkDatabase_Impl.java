package androidx.work.impl;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import o5.e1;
import o5.s1;
import o6.i0;
import o6.j0;
import o6.k0;
import o6.l0;
import o6.n0;
import o6.o0;
import o6.q0;
import o6.s0;
import q5.b0;
import tu.o;
import tu.q;
import v6.a0;
import v6.c0;
import v6.d;
import v6.f;
import v6.h;
import v6.i;
import v6.m;
import v6.m0;
import v6.p0;
import v6.r0;
import v6.u;
import v6.w;
import v6.y;
import x5.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f7492v = 0;

    /* renamed from: n, reason: collision with root package name */
    public final o f7493n;

    /* renamed from: o, reason: collision with root package name */
    public final o f7494o;

    /* renamed from: p, reason: collision with root package name */
    public final o f7495p;

    /* renamed from: q, reason: collision with root package name */
    public final o f7496q;

    /* renamed from: r, reason: collision with root package name */
    public final o f7497r;

    /* renamed from: s, reason: collision with root package name */
    public final o f7498s;

    /* renamed from: t, reason: collision with root package name */
    public final o f7499t;

    /* renamed from: u, reason: collision with root package name */
    public final o f7500u;

    public WorkDatabase_Impl() {
        final int i10 = 0;
        this.f7493n = q.lazy(new kv.a(this) { // from class: o6.r0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f77965c;

            {
                this.f77965c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                int i11 = i10;
                WorkDatabase_Impl workDatabase_Impl = this.f77965c;
                switch (i11) {
                    case 0:
                        int i12 = WorkDatabase_Impl.f7492v;
                        return new v6.m0(workDatabase_Impl);
                    case 1:
                        int i13 = WorkDatabase_Impl.f7492v;
                        return new v6.d(workDatabase_Impl);
                    case 2:
                        int i14 = WorkDatabase_Impl.f7492v;
                        return new v6.r0(workDatabase_Impl);
                    case 3:
                        int i15 = WorkDatabase_Impl.f7492v;
                        return new v6.q(workDatabase_Impl);
                    case 4:
                        int i16 = WorkDatabase_Impl.f7492v;
                        return new v6.w(workDatabase_Impl);
                    case 5:
                        int i17 = WorkDatabase_Impl.f7492v;
                        return new v6.a0(workDatabase_Impl);
                    case 6:
                        int i18 = WorkDatabase_Impl.f7492v;
                        return new v6.h(workDatabase_Impl);
                    default:
                        int i19 = WorkDatabase_Impl.f7492v;
                        return new v6.m(workDatabase_Impl);
                }
            }
        });
        final int i11 = 1;
        this.f7494o = q.lazy(new kv.a(this) { // from class: o6.r0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f77965c;

            {
                this.f77965c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                int i112 = i11;
                WorkDatabase_Impl workDatabase_Impl = this.f77965c;
                switch (i112) {
                    case 0:
                        int i12 = WorkDatabase_Impl.f7492v;
                        return new v6.m0(workDatabase_Impl);
                    case 1:
                        int i13 = WorkDatabase_Impl.f7492v;
                        return new v6.d(workDatabase_Impl);
                    case 2:
                        int i14 = WorkDatabase_Impl.f7492v;
                        return new v6.r0(workDatabase_Impl);
                    case 3:
                        int i15 = WorkDatabase_Impl.f7492v;
                        return new v6.q(workDatabase_Impl);
                    case 4:
                        int i16 = WorkDatabase_Impl.f7492v;
                        return new v6.w(workDatabase_Impl);
                    case 5:
                        int i17 = WorkDatabase_Impl.f7492v;
                        return new v6.a0(workDatabase_Impl);
                    case 6:
                        int i18 = WorkDatabase_Impl.f7492v;
                        return new v6.h(workDatabase_Impl);
                    default:
                        int i19 = WorkDatabase_Impl.f7492v;
                        return new v6.m(workDatabase_Impl);
                }
            }
        });
        final int i12 = 2;
        this.f7495p = q.lazy(new kv.a(this) { // from class: o6.r0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f77965c;

            {
                this.f77965c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                int i112 = i12;
                WorkDatabase_Impl workDatabase_Impl = this.f77965c;
                switch (i112) {
                    case 0:
                        int i122 = WorkDatabase_Impl.f7492v;
                        return new v6.m0(workDatabase_Impl);
                    case 1:
                        int i13 = WorkDatabase_Impl.f7492v;
                        return new v6.d(workDatabase_Impl);
                    case 2:
                        int i14 = WorkDatabase_Impl.f7492v;
                        return new v6.r0(workDatabase_Impl);
                    case 3:
                        int i15 = WorkDatabase_Impl.f7492v;
                        return new v6.q(workDatabase_Impl);
                    case 4:
                        int i16 = WorkDatabase_Impl.f7492v;
                        return new v6.w(workDatabase_Impl);
                    case 5:
                        int i17 = WorkDatabase_Impl.f7492v;
                        return new v6.a0(workDatabase_Impl);
                    case 6:
                        int i18 = WorkDatabase_Impl.f7492v;
                        return new v6.h(workDatabase_Impl);
                    default:
                        int i19 = WorkDatabase_Impl.f7492v;
                        return new v6.m(workDatabase_Impl);
                }
            }
        });
        final int i13 = 3;
        this.f7496q = q.lazy(new kv.a(this) { // from class: o6.r0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f77965c;

            {
                this.f77965c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                int i112 = i13;
                WorkDatabase_Impl workDatabase_Impl = this.f77965c;
                switch (i112) {
                    case 0:
                        int i122 = WorkDatabase_Impl.f7492v;
                        return new v6.m0(workDatabase_Impl);
                    case 1:
                        int i132 = WorkDatabase_Impl.f7492v;
                        return new v6.d(workDatabase_Impl);
                    case 2:
                        int i14 = WorkDatabase_Impl.f7492v;
                        return new v6.r0(workDatabase_Impl);
                    case 3:
                        int i15 = WorkDatabase_Impl.f7492v;
                        return new v6.q(workDatabase_Impl);
                    case 4:
                        int i16 = WorkDatabase_Impl.f7492v;
                        return new v6.w(workDatabase_Impl);
                    case 5:
                        int i17 = WorkDatabase_Impl.f7492v;
                        return new v6.a0(workDatabase_Impl);
                    case 6:
                        int i18 = WorkDatabase_Impl.f7492v;
                        return new v6.h(workDatabase_Impl);
                    default:
                        int i19 = WorkDatabase_Impl.f7492v;
                        return new v6.m(workDatabase_Impl);
                }
            }
        });
        final int i14 = 4;
        this.f7497r = q.lazy(new kv.a(this) { // from class: o6.r0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f77965c;

            {
                this.f77965c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                int i112 = i14;
                WorkDatabase_Impl workDatabase_Impl = this.f77965c;
                switch (i112) {
                    case 0:
                        int i122 = WorkDatabase_Impl.f7492v;
                        return new v6.m0(workDatabase_Impl);
                    case 1:
                        int i132 = WorkDatabase_Impl.f7492v;
                        return new v6.d(workDatabase_Impl);
                    case 2:
                        int i142 = WorkDatabase_Impl.f7492v;
                        return new v6.r0(workDatabase_Impl);
                    case 3:
                        int i15 = WorkDatabase_Impl.f7492v;
                        return new v6.q(workDatabase_Impl);
                    case 4:
                        int i16 = WorkDatabase_Impl.f7492v;
                        return new v6.w(workDatabase_Impl);
                    case 5:
                        int i17 = WorkDatabase_Impl.f7492v;
                        return new v6.a0(workDatabase_Impl);
                    case 6:
                        int i18 = WorkDatabase_Impl.f7492v;
                        return new v6.h(workDatabase_Impl);
                    default:
                        int i19 = WorkDatabase_Impl.f7492v;
                        return new v6.m(workDatabase_Impl);
                }
            }
        });
        final int i15 = 5;
        this.f7498s = q.lazy(new kv.a(this) { // from class: o6.r0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f77965c;

            {
                this.f77965c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                int i112 = i15;
                WorkDatabase_Impl workDatabase_Impl = this.f77965c;
                switch (i112) {
                    case 0:
                        int i122 = WorkDatabase_Impl.f7492v;
                        return new v6.m0(workDatabase_Impl);
                    case 1:
                        int i132 = WorkDatabase_Impl.f7492v;
                        return new v6.d(workDatabase_Impl);
                    case 2:
                        int i142 = WorkDatabase_Impl.f7492v;
                        return new v6.r0(workDatabase_Impl);
                    case 3:
                        int i152 = WorkDatabase_Impl.f7492v;
                        return new v6.q(workDatabase_Impl);
                    case 4:
                        int i16 = WorkDatabase_Impl.f7492v;
                        return new v6.w(workDatabase_Impl);
                    case 5:
                        int i17 = WorkDatabase_Impl.f7492v;
                        return new v6.a0(workDatabase_Impl);
                    case 6:
                        int i18 = WorkDatabase_Impl.f7492v;
                        return new v6.h(workDatabase_Impl);
                    default:
                        int i19 = WorkDatabase_Impl.f7492v;
                        return new v6.m(workDatabase_Impl);
                }
            }
        });
        final int i16 = 6;
        this.f7499t = q.lazy(new kv.a(this) { // from class: o6.r0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f77965c;

            {
                this.f77965c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                int i112 = i16;
                WorkDatabase_Impl workDatabase_Impl = this.f77965c;
                switch (i112) {
                    case 0:
                        int i122 = WorkDatabase_Impl.f7492v;
                        return new v6.m0(workDatabase_Impl);
                    case 1:
                        int i132 = WorkDatabase_Impl.f7492v;
                        return new v6.d(workDatabase_Impl);
                    case 2:
                        int i142 = WorkDatabase_Impl.f7492v;
                        return new v6.r0(workDatabase_Impl);
                    case 3:
                        int i152 = WorkDatabase_Impl.f7492v;
                        return new v6.q(workDatabase_Impl);
                    case 4:
                        int i162 = WorkDatabase_Impl.f7492v;
                        return new v6.w(workDatabase_Impl);
                    case 5:
                        int i17 = WorkDatabase_Impl.f7492v;
                        return new v6.a0(workDatabase_Impl);
                    case 6:
                        int i18 = WorkDatabase_Impl.f7492v;
                        return new v6.h(workDatabase_Impl);
                    default:
                        int i19 = WorkDatabase_Impl.f7492v;
                        return new v6.m(workDatabase_Impl);
                }
            }
        });
        final int i17 = 7;
        this.f7500u = q.lazy(new kv.a(this) { // from class: o6.r0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f77965c;

            {
                this.f77965c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                int i112 = i17;
                WorkDatabase_Impl workDatabase_Impl = this.f77965c;
                switch (i112) {
                    case 0:
                        int i122 = WorkDatabase_Impl.f7492v;
                        return new v6.m0(workDatabase_Impl);
                    case 1:
                        int i132 = WorkDatabase_Impl.f7492v;
                        return new v6.d(workDatabase_Impl);
                    case 2:
                        int i142 = WorkDatabase_Impl.f7492v;
                        return new v6.r0(workDatabase_Impl);
                    case 3:
                        int i152 = WorkDatabase_Impl.f7492v;
                        return new v6.q(workDatabase_Impl);
                    case 4:
                        int i162 = WorkDatabase_Impl.f7492v;
                        return new v6.w(workDatabase_Impl);
                    case 5:
                        int i172 = WorkDatabase_Impl.f7492v;
                        return new v6.a0(workDatabase_Impl);
                    case 6:
                        int i18 = WorkDatabase_Impl.f7492v;
                        return new v6.h(workDatabase_Impl);
                    default:
                        int i19 = WorkDatabase_Impl.f7492v;
                        return new v6.m(workDatabase_Impl);
                }
            }
        });
    }

    public static final void access$internalInitInvalidationTracker(WorkDatabase_Impl workDatabase_Impl, b connection) {
        workDatabase_Impl.getClass();
        e0.checkNotNullParameter(connection, "connection");
        workDatabase_Impl.getInvalidationTracker().internalInit$room_runtime_release(connection);
    }

    @Override // o5.y0
    public final LinkedHashMap c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(c1.getOrCreateKotlinClass(c0.class), m0.f89142d.getRequiredConverters());
        linkedHashMap.put(c1.getOrCreateKotlinClass(v6.b.class), d.f89097c.getRequiredConverters());
        linkedHashMap.put(c1.getOrCreateKotlinClass(p0.class), r0.f89154c.getRequiredConverters());
        linkedHashMap.put(c1.getOrCreateKotlinClass(v6.o.class), v6.q.f89151c.getRequiredConverters());
        linkedHashMap.put(c1.getOrCreateKotlinClass(u.class), w.f89161c.getRequiredConverters());
        linkedHashMap.put(c1.getOrCreateKotlinClass(y.class), a0.f89049c.getRequiredConverters());
        linkedHashMap.put(c1.getOrCreateKotlinClass(f.class), h.f89122c.getRequiredConverters());
        linkedHashMap.put(c1.getOrCreateKotlinClass(i.class), m.f89140b.getRequiredConverters());
        return linkedHashMap;
    }

    @Override // o5.y0
    public void clearAllTables() {
        String[] tableNames = {"Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference"};
        e0.checkNotNullParameter(tableNames, "tableNames");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        b0.runBlockingUninterruptible(new e1(this, true, tableNames, null));
    }

    @Override // o5.y0
    public List<s5.b> createAutoMigrations(Map<KClass<? extends s5.a>, ? extends s5.a> autoMigrationSpecs) {
        e0.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i0());
        arrayList.add(new j0());
        arrayList.add(new k0());
        arrayList.add(new l0());
        arrayList.add(new o6.m0());
        arrayList.add(new n0());
        arrayList.add(new o0());
        arrayList.add(new o6.p0());
        arrayList.add(new q0());
        return arrayList;
    }

    @Override // o5.y0
    public final o5.y createInvalidationTracker() {
        return new o5.y(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // o5.y0
    public s1 createOpenDelegate() {
        return new s0(this);
    }

    @Override // androidx.work.impl.WorkDatabase
    public v6.b dependencyDao() {
        return (v6.b) this.f7494o.getValue();
    }

    @Override // o5.y0
    public Set<KClass<? extends s5.a>> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    public f preferenceDao() {
        return (f) this.f7499t.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public i rawWorkInfoDao() {
        return (i) this.f7500u.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public v6.o systemIdInfoDao() {
        return (v6.o) this.f7496q.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public u workNameDao() {
        return (u) this.f7497r.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public y workProgressDao() {
        return (y) this.f7498s.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public c0 workSpecDao() {
        return (c0) this.f7493n.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public p0 workTagDao() {
        return (p0) this.f7495p.getValue();
    }
}
