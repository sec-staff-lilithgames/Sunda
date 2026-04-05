package o5;

import android.database.Cursor;
import android.database.SQLException;
import java.util.Iterator;
import java.util.List;
import o5.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class t1 extends y5.d {

    /* renamed from: g, reason: collision with root package name */
    public static final a f77718g = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public l f77719b;

    /* renamed from: c, reason: collision with root package name */
    public final List f77720c;

    /* renamed from: d, reason: collision with root package name */
    public final b f77721d;

    /* renamed from: e, reason: collision with root package name */
    public final String f77722e;

    /* renamed from: f, reason: collision with root package name */
    public final String f77723f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final void dropAllTables$room_runtime_release(y5.c db2) throws SQLException {
            kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
            Cursor cursorQuery = db2.query("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                Cursor cursor = cursorQuery;
                List listCreateListBuilder = uu.o0.createListBuilder();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(0);
                    kotlin.jvm.internal.e0.checkNotNull(string);
                    if (!sv.k0.startsWith$default(string, "sqlite_", false, 2, null) && !kotlin.jvm.internal.e0.areEqual(string, "android_metadata")) {
                        listCreateListBuilder.add(tu.e0.to(string, Boolean.valueOf(kotlin.jvm.internal.e0.areEqual(cursor.getString(1), "view"))));
                    }
                }
                List<tu.v> listBuild = uu.o0.build(listCreateListBuilder);
                gv.d.closeFinally(cursorQuery, null);
                for (tu.v vVar : listBuild) {
                    String str = (String) vVar.component1();
                    if (((Boolean) vVar.component2()).booleanValue()) {
                        db2.execSQL("DROP VIEW IF EXISTS " + str);
                    } else {
                        db2.execSQL("DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        }

        public final boolean hasEmptySchema$room_runtime_release(y5.c db2) {
            kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
            Cursor cursorQuery = db2.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                Cursor cursor = cursorQuery;
                boolean z10 = false;
                if (cursor.moveToFirst()) {
                    if (cursor.getInt(0) == 0) {
                        z10 = true;
                    }
                }
                gv.d.closeFinally(cursorQuery, null);
                return z10;
            } finally {
            }
        }

        public final boolean hasRoomMasterTable$room_runtime_release(y5.c db2) {
            kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
            Cursor cursorQuery = db2.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                Cursor cursor = cursorQuery;
                boolean z10 = false;
                if (cursor.moveToFirst()) {
                    if (cursor.getInt(0) != 0) {
                        z10 = true;
                    }
                }
                gv.d.closeFinally(cursorQuery, null);
                return z10;
            } finally {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f77724a;

        public b(int i10) {
            this.f77724a = i10;
        }

        public abstract void createAllTables(y5.c cVar);

        public abstract void dropAllTables(y5.c cVar);

        public abstract void onCreate(y5.c cVar);

        public abstract void onOpen(y5.c cVar);

        public void onPostMigrate(y5.c db2) {
            kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
        }

        public void onPreMigrate(y5.c db2) {
            kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
        }

        public c onValidateSchema(y5.c db2) {
            kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
            kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f77725a;

        /* renamed from: b, reason: collision with root package name */
        public final String f77726b;

        public c(boolean z10, String str) {
            this.f77725a = z10;
            this.f77726b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(l configuration, b delegate, String identityHash, String legacyHash) {
        super(delegate.f77724a);
        kotlin.jvm.internal.e0.checkNotNullParameter(configuration, "configuration");
        kotlin.jvm.internal.e0.checkNotNullParameter(delegate, "delegate");
        kotlin.jvm.internal.e0.checkNotNullParameter(identityHash, "identityHash");
        kotlin.jvm.internal.e0.checkNotNullParameter(legacyHash, "legacyHash");
        this.f77720c = configuration.f77625e;
        this.f77719b = configuration;
        this.f77721d = delegate;
        this.f77722e = identityHash;
        this.f77723f = legacyHash;
    }

    @Override // y5.d
    public void onConfigure(y5.c db2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
        super.onConfigure(db2);
    }

    @Override // y5.d
    public void onCreate(y5.c db2) throws SQLException {
        kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
        boolean zHasEmptySchema$room_runtime_release = f77718g.hasEmptySchema$room_runtime_release(db2);
        b bVar = this.f77721d;
        bVar.createAllTables(db2);
        if (!zHasEmptySchema$room_runtime_release) {
            c cVarOnValidateSchema = bVar.onValidateSchema(db2);
            if (!cVarOnValidateSchema.f77725a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarOnValidateSchema.f77726b);
            }
        }
        db2.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db2.execSQL(q1.createInsertQuery(this.f77722e));
        bVar.onCreate(db2);
        List list = this.f77720c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((y0.b) it.next()).onCreate(db2);
            }
        }
    }

    @Override // y5.d
    public void onDowngrade(y5.c db2, int i10, int i11) throws SQLException {
        kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
        onUpgrade(db2, i10, i11);
    }

    @Override // y5.d
    public void onOpen(y5.c db2) throws SQLException {
        kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
        super.onOpen(db2);
        boolean zHasRoomMasterTable$room_runtime_release = f77718g.hasRoomMasterTable$room_runtime_release(db2);
        b bVar = this.f77721d;
        String str = this.f77722e;
        if (zHasRoomMasterTable$room_runtime_release) {
            Cursor cursorQuery = db2.query(new y5.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                Cursor cursor = cursorQuery;
                String string = cursor.moveToFirst() ? cursor.getString(0) : null;
                gv.d.closeFinally(cursorQuery, null);
                if (!kotlin.jvm.internal.e0.areEqual(str, string) && !kotlin.jvm.internal.e0.areEqual(this.f77723f, string)) {
                    throw new IllegalStateException(a.b.m("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ", str, ", found: ", string));
                }
            } finally {
            }
        } else {
            c cVarOnValidateSchema = bVar.onValidateSchema(db2);
            if (!cVarOnValidateSchema.f77725a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarOnValidateSchema.f77726b);
            }
            bVar.onPostMigrate(db2);
            db2.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            db2.execSQL(q1.createInsertQuery(str));
        }
        bVar.onOpen(db2);
        List list = this.f77720c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((y0.b) it.next()).onOpen(db2);
            }
        }
        this.f77719b = null;
    }

    @Override // y5.d
    public void onUpgrade(y5.c db2, int i10, int i11) throws SQLException {
        List<s5.b> listFindMigrationPath;
        kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
        l lVar = this.f77719b;
        b bVar = this.f77721d;
        if (lVar != null && (listFindMigrationPath = lVar.f77624d.findMigrationPath(i10, i11)) != null) {
            bVar.onPreMigrate(db2);
            Iterator<T> it = listFindMigrationPath.iterator();
            while (it.hasNext()) {
                ((s5.b) it.next()).migrate(new r5.a(db2));
            }
            c cVarOnValidateSchema = bVar.onValidateSchema(db2);
            if (!cVarOnValidateSchema.f77725a) {
                throw new IllegalStateException("Migration didn't properly handle: " + cVarOnValidateSchema.f77726b);
            }
            bVar.onPostMigrate(db2);
            db2.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            db2.execSQL(q1.createInsertQuery(this.f77722e));
            return;
        }
        l lVar2 = this.f77719b;
        if (lVar2 == null || lVar2.isMigrationRequired(i10, i11)) {
            throw new IllegalStateException(p0.o2.i(i10, i11, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
        }
        if (lVar2.f77640t) {
            f77718g.dropAllTables$room_runtime_release(db2);
        } else {
            bVar.dropAllTables(db2);
        }
        List list = this.f77720c;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((y0.b) it2.next()).onDestructiveMigration(db2);
            }
        }
        bVar.createAllTables(db2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t1(l configuration, b delegate, String legacyHash) {
        this(configuration, delegate, "", legacyHash);
        kotlin.jvm.internal.e0.checkNotNullParameter(configuration, "configuration");
        kotlin.jvm.internal.e0.checkNotNullParameter(delegate, "delegate");
        kotlin.jvm.internal.e0.checkNotNullParameter(legacyHash, "legacyHash");
    }
}
