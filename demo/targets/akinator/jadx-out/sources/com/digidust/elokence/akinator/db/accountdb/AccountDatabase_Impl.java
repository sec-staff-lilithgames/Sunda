package com.digidust.elokence.akinator.db.accountdb;

import ba.k;
import ba.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import o5.e1;
import o5.s1;
import o5.y;
import q5.b0;
import s5.a;
import s5.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class AccountDatabase_Impl extends AccountDatabase {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f21717n = 0;

    /* renamed from: m, reason: collision with root package name */
    public volatile k f21718m;

    @Override // o5.y0
    public void clearAllTables() {
        String[] tableNames = {"AccountAwards", "AccountTenue", "AccountNbAwards", "DefisInfos"};
        e0.checkNotNullParameter(tableNames, "tableNames");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        b0.runBlockingUninterruptible(new e1(this, false, tableNames, null));
    }

    @Override // o5.y0
    public final y createInvalidationTracker() {
        return new y(this, new HashMap(0), new HashMap(0), "AccountAwards", "AccountTenue", "AccountNbAwards", "DefisInfos");
    }

    @Override // o5.y0
    public final s1 createOpenDelegate() {
        return new l(this);
    }

    @Override // o5.y0
    public List<b> getAutoMigrations(Map<Class<? extends a>, a> map) {
        return new ArrayList();
    }

    @Override // com.digidust.elokence.akinator.db.accountdb.AccountDatabase
    public ba.b getDao() {
        k kVar;
        if (this.f21718m != null) {
            return this.f21718m;
        }
        synchronized (this) {
            try {
                if (this.f21718m == null) {
                    this.f21718m = new k(this);
                }
                kVar = this.f21718m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }

    @Override // o5.y0
    public Set<Class<? extends a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // o5.y0
    public final Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(ba.b.class, k.getRequiredConverters());
        return map;
    }
}
