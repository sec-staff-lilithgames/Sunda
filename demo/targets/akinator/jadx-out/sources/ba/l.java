package ba;

import com.digidust.elokence.akinator.db.accountdb.AccountDatabase_Impl;
import com.ironsource.Q6;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.e0;
import o5.r1;
import u5.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l extends r1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AccountDatabase_Impl f9008d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AccountDatabase_Impl accountDatabase_Impl) {
        super(5, "480da318b4d5dfeab0ad1a6359b9aa8f", "ccb1eeabf62d864b3ab06d36de15fd55");
        this.f9008d = accountDatabase_Impl;
    }

    @Override // o5.r1
    public void createAllTables(x5.b bVar) throws Exception {
        x5.a.execSQL(bVar, "CREATE TABLE IF NOT EXISTS `AccountAwards` (`id` TEXT NOT NULL, `name` TEXT, `type` TEXT, `theme_id` TEXT, `lang` TEXT, `description` TEXT, PRIMARY KEY(`id`))");
        x5.a.execSQL(bVar, "CREATE TABLE IF NOT EXISTS `AccountTenue` (`idTenue` INTEGER NOT NULL, PRIMARY KEY(`idTenue`))");
        x5.a.execSQL(bVar, "CREATE TABLE IF NOT EXISTS `AccountNbAwards` (`idThemeLangLevel` TEXT NOT NULL, `nb` TEXT, `theme_id` TEXT, `lang` TEXT, `type_award` TEXT, PRIMARY KEY(`idThemeLangLevel`))");
        x5.a.execSQL(bVar, "CREATE TABLE IF NOT EXISTS `DefisInfos` (`idThemeLang` TEXT NOT NULL, `idDefi` TEXT, `trouve0` INTEGER NOT NULL, `trouve1` INTEGER NOT NULL, `trouve2` INTEGER NOT NULL, `trouve3` INTEGER NOT NULL, `trouve4` INTEGER NOT NULL, PRIMARY KEY(`idThemeLang`))");
        x5.a.execSQL(bVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        x5.a.execSQL(bVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '480da318b4d5dfeab0ad1a6359b9aa8f')");
    }

    @Override // o5.r1
    public void dropAllTables(x5.b bVar) throws Exception {
        x5.a.execSQL(bVar, "DROP TABLE IF EXISTS `AccountAwards`");
        x5.a.execSQL(bVar, "DROP TABLE IF EXISTS `AccountTenue`");
        x5.a.execSQL(bVar, "DROP TABLE IF EXISTS `AccountNbAwards`");
        x5.a.execSQL(bVar, "DROP TABLE IF EXISTS `DefisInfos`");
    }

    @Override // o5.r1
    public void onOpen(x5.b connection) {
        int i10 = AccountDatabase_Impl.f21717n;
        e0.checkNotNullParameter(connection, "connection");
        this.f9008d.getInvalidationTracker().internalInit$room_runtime_release(connection);
    }

    @Override // o5.r1
    public void onPreMigrate(x5.b bVar) {
        u5.c.dropFtsSyncTriggers(bVar);
    }

    @Override // o5.r1
    public r1.a onValidateSchema(x5.b bVar) {
        HashMap map = new HashMap(6);
        map.put("id", new z.a("id", "TEXT", true, 1, null, 1));
        map.put("name", new z.a("name", "TEXT", false, 0, null, 1));
        map.put("type", new z.a("type", "TEXT", false, 0, null, 1));
        map.put("theme_id", new z.a("theme_id", "TEXT", false, 0, null, 1));
        map.put(Q6.f35290q, new z.a(Q6.f35290q, "TEXT", false, 0, null, 1));
        map.put("description", new z.a("description", "TEXT", false, 0, null, 1));
        z zVar = new z("AccountAwards", map, new HashSet(0), new HashSet(0));
        z zVar2 = z.read(bVar, "AccountAwards");
        if (!zVar.equals(zVar2)) {
            return new r1.a(false, "AccountAwards(com.digidust.elokence.akinator.db.accountdb.AccountAwards).\n Expected:\n" + zVar + "\n Found:\n" + zVar2);
        }
        HashMap map2 = new HashMap(1);
        map2.put("idTenue", new z.a("idTenue", "INTEGER", true, 1, null, 1));
        z zVar3 = new z("AccountTenue", map2, new HashSet(0), new HashSet(0));
        z zVar4 = z.read(bVar, "AccountTenue");
        if (!zVar3.equals(zVar4)) {
            return new r1.a(false, "AccountTenue(com.digidust.elokence.akinator.db.accountdb.AccountTenue).\n Expected:\n" + zVar3 + "\n Found:\n" + zVar4);
        }
        HashMap map3 = new HashMap(5);
        map3.put("idThemeLangLevel", new z.a("idThemeLangLevel", "TEXT", true, 1, null, 1));
        map3.put("nb", new z.a("nb", "TEXT", false, 0, null, 1));
        map3.put("theme_id", new z.a("theme_id", "TEXT", false, 0, null, 1));
        map3.put(Q6.f35290q, new z.a(Q6.f35290q, "TEXT", false, 0, null, 1));
        map3.put("type_award", new z.a("type_award", "TEXT", false, 0, null, 1));
        z zVar5 = new z("AccountNbAwards", map3, new HashSet(0), new HashSet(0));
        z zVar6 = z.read(bVar, "AccountNbAwards");
        if (!zVar5.equals(zVar6)) {
            return new r1.a(false, "AccountNbAwards(com.digidust.elokence.akinator.db.accountdb.AccountNbAwards).\n Expected:\n" + zVar5 + "\n Found:\n" + zVar6);
        }
        HashMap map4 = new HashMap(7);
        map4.put("idThemeLang", new z.a("idThemeLang", "TEXT", true, 1, null, 1));
        map4.put("idDefi", new z.a("idDefi", "TEXT", false, 0, null, 1));
        map4.put("trouve0", new z.a("trouve0", "INTEGER", true, 0, null, 1));
        map4.put("trouve1", new z.a("trouve1", "INTEGER", true, 0, null, 1));
        map4.put("trouve2", new z.a("trouve2", "INTEGER", true, 0, null, 1));
        map4.put("trouve3", new z.a("trouve3", "INTEGER", true, 0, null, 1));
        map4.put("trouve4", new z.a("trouve4", "INTEGER", true, 0, null, 1));
        z zVar7 = new z("DefisInfos", map4, new HashSet(0), new HashSet(0));
        z zVar8 = z.read(bVar, "DefisInfos");
        if (zVar7.equals(zVar8)) {
            return new r1.a(true, null);
        }
        return new r1.a(false, "DefisInfos(com.digidust.elokence.akinator.db.accountdb.DefisInfos).\n Expected:\n" + zVar7 + "\n Found:\n" + zVar8);
    }

    @Override // o5.r1
    public void onCreate(x5.b bVar) {
    }

    @Override // o5.r1
    public void onPostMigrate(x5.b bVar) {
    }
}
