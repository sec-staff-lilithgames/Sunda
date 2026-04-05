package aa;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import ca.m;
import com.digidust.elokence.akinator.factories.AkApplication;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static f f4244d;

    /* renamed from: e, reason: collision with root package name */
    public static b f4245e;

    /* renamed from: f, reason: collision with root package name */
    public static SQLiteDatabase f4246f;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f4247a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f4248b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences.Editor f4249c;

    public f() {
        SharedPreferences sharedPreferences = AkApplication.getAppContext().getSharedPreferences("ddjSettings", 0);
        this.f4248b = sharedPreferences;
        this.f4249c = sharedPreferences.edit();
    }

    public static boolean a() {
        SQLiteDatabase sQLiteDatabase = f4246f;
        return sQLiteDatabase != null && sQLiteDatabase.isOpen();
    }

    public static void b() {
        SQLiteDatabase sQLiteDatabase = f4246f;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            try {
                f4246f = f4245e.getWritableDatabase();
            } catch (SQLiteException unused) {
            }
        }
    }

    public static void c() {
        if (!a()) {
            b();
        }
        synchronized ("sqliteLock") {
            if (a()) {
                Cursor cursorQuery = null;
                try {
                    try {
                        cursorQuery = f4246f.query("defiCourantTable", null, "baselogiqueid =?", new String[]{String.valueOf(m.sharedInstance().getCurrentInstance().getBaseLogiqueId())}, null, null, null);
                        if (cursorQuery != null && cursorQuery.getCount() > 0) {
                            String[] strArr = {String.valueOf(m.sharedInstance().getCurrentInstance().getBaseLogiqueId())};
                            f4246f.delete("defiPrecedantTable", "baselogiqueid =?", strArr);
                            f4246f.delete("persosPrecedantTable", "baselogiqueid =?", strArr);
                            f4246f.execSQL("INSERT INTO defiPrecedantTable SELECT * FROM defiCourantTable WHERE baselogiqueid=" + m.sharedInstance().getCurrentInstance().getBaseLogiqueId() + ";");
                            f4246f.execSQL("INSERT INTO persosPrecedantTable SELECT * FROM persosCourantTable WHERE baselogiqueid=" + m.sharedInstance().getCurrentInstance().getBaseLogiqueId() + ";");
                        }
                    } catch (Exception e10) {
                        Timber.tag("DefiSetAdapter").e(e10);
                        if (cursorQuery != null) {
                        }
                    }
                } finally {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            }
        }
    }

    public static f sharedInstance() {
        if (f4244d == null) {
            f4244d = new f();
            f4245e = new b(AkApplication.getAppContext(), "defis.db", null, 7);
            f4244d.getClass();
            b();
        }
        return f4244d;
    }

    public void addCharacter(int i10, int i11, int i12) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("defiAwarldLevel", Integer.valueOf(i11));
        contentValues.put("baseId", Integer.valueOf(i12));
        contentValues.put("baselogiqueid", Integer.valueOf(i10));
        synchronized ("sqliteLock") {
            try {
                if (!a()) {
                    b();
                }
                if (a()) {
                    f4246f.insert("defiAwardTable", null, contentValues);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addListener(d dVar) {
        synchronized (this.f4247a) {
            this.f4247a.add(dVar);
        }
    }

    public void close() {
        synchronized ("sqliteLock") {
            f4246f.close();
        }
    }

    public void deleteAll() {
        if (!a()) {
            b();
        }
        synchronized ("sqliteLock") {
            try {
                if (a()) {
                    f4246f.delete("defiPrecedantTable", null, null);
                    f4246f.delete("persosPrecedantTable", null, null);
                    f4246f.delete("defiCourantTable", null, null);
                    f4246f.delete("persosCourantTable", null, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void deleteAwardDdj() {
        if (!a()) {
            b();
        }
        synchronized ("sqliteLock") {
            try {
                if (a()) {
                    f4246f.delete("defiAwardTable", null, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public TreeSet<Integer> getBaseLogiqueIdsAlreadyPlayed() {
        synchronized ("sqliteLock") {
            try {
                if (!a()) {
                    b();
                }
                if (!a()) {
                    return null;
                }
                TreeSet<Integer> treeSet = new TreeSet<>();
                Cursor cursorQuery = f4246f.query(true, "defiCourantTable", new String[]{"baselogiqueid"}, null, null, null, null, null, null);
                if (cursorQuery != null && cursorQuery.getCount() >= 1 && cursorQuery.moveToFirst()) {
                    do {
                        treeSet.add(Integer.valueOf(cursorQuery.getString(0)));
                        if (!cursorQuery.moveToNext()) {
                            break;
                        }
                    } while (!cursorQuery.isAfterLast());
                }
                return treeSet;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public c getDefiDuJourInfos() {
        return getDefiInfos(true);
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0062: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:26:0x0062 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0139 A[Catch: all -> 0x006e, TryCatch #7 {, blocks: (B:7:0x0011, B:31:0x006a, B:66:0x011d, B:73:0x0133, B:74:0x0136, B:70:0x012c, B:76:0x0139, B:77:0x013c, B:37:0x007c, B:78:0x013d), top: B:88:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aa.c getDefiInfos(boolean r19, int r20) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.f.getDefiInfos(boolean, int):aa.c");
    }

    public int getNbAwardDdj(int i10) {
        try {
            return getNbAwardDdj(i10, m.sharedInstance().getCurrentInstance().getBaseLogiqueId());
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getNbDDj() {
        return this.f4248b.getInt("nbDdj", 0);
    }

    public int getNbDDjFull() {
        return this.f4248b.getInt("nbDdjFull", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c A[Catch: all -> 0x0052, PHI: r12
      0x006c: PHI (r12v4 android.database.Cursor) = (r12v3 android.database.Cursor), (r12v6 android.database.Cursor) binds: [B:33:0x006a, B:26:0x005a] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {, blocks: (B:7:0x000c, B:17:0x004d, B:18:0x0050, B:34:0x006c, B:36:0x0072, B:37:0x0075, B:38:0x0076), top: B:42:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getPhotobase64(int r12) {
        /*
            r11 = this;
            boolean r0 = a()
            if (r0 != 0) goto L9
            b()
        L9:
            java.lang.String r1 = "sqliteLock"
            monitor-enter(r1)
            boolean r0 = a()     // Catch: java.lang.Throwable -> L52
            r2 = 0
            if (r0 == 0) goto L76
            java.lang.String r6 = "baseId =? AND baselogiqueid =?"
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            ca.m r0 = ca.m.sharedInstance()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            lb.c r0 = r0.getCurrentInstance()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            int r0 = r0.getBaseLogiqueId()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            java.lang.String[] r7 = new java.lang.String[]{r12, r0}     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            android.database.sqlite.SQLiteDatabase r3 = aa.f.f4246f     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            java.lang.String r4 = "persosCourantTable"
            r9 = 0
            r10 = 0
            r5 = 0
            r8 = 0
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            if (r12 == 0) goto L5a
            int r0 = r12.getCount()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            r3 = 1
            if (r0 != r3) goto L5a
            boolean r0 = r12.moveToFirst()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            if (r0 == 0) goto L5a
            r0 = 3
            java.lang.String r0 = r12.getString(r0)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            r12.close()     // Catch: java.lang.Throwable -> L52
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L52
            return r0
        L52:
            r0 = move-exception
            r12 = r0
            goto L78
        L55:
            r0 = move-exception
            r2 = r12
            goto L70
        L58:
            r0 = move-exception
            goto L61
        L5a:
            if (r12 == 0) goto L76
            goto L6c
        L5d:
            r0 = move-exception
            goto L70
        L5f:
            r0 = move-exception
            r12 = r2
        L61:
            java.lang.String r3 = "DefiSetAdapter"
            timber.log.Timber$Tree r3 = timber.log.Timber.tag(r3)     // Catch: java.lang.Throwable -> L55
            r3.e(r0)     // Catch: java.lang.Throwable -> L55
            if (r12 == 0) goto L76
        L6c:
            r12.close()     // Catch: java.lang.Throwable -> L52
            goto L76
        L70:
            if (r2 == 0) goto L75
            r2.close()     // Catch: java.lang.Throwable -> L52
        L75:
            throw r0     // Catch: java.lang.Throwable -> L52
        L76:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L52
            return r2
        L78:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L52
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.f.getPhotobase64(int):java.lang.String");
    }

    public void incNbDdj() {
        int nbDDj = getNbDDj() + 1;
        SharedPreferences.Editor editor = this.f4249c;
        editor.putInt("nbDdj", nbDDj);
        editor.commit();
    }

    public void incNbDdjFull() {
        int nbDDjFull = getNbDDjFull() + 1;
        SharedPreferences.Editor editor = this.f4249c;
        editor.putInt("nbDdjFull", nbDDjFull);
        editor.commit();
    }

    public boolean isAtLeastOnePersoFound(boolean z10) {
        c defiInfos;
        if (getDefiInfos(z10) == null || (defiInfos = getDefiInfos(z10)) == null || defiInfos.getListPerso() == null) {
            return false;
        }
        Iterator<e> it = defiInfos.getListPerso().iterator();
        while (it.hasNext()) {
            if (it.next().isFound()) {
                return true;
            }
        }
        return false;
    }

    public boolean isDefiPersoExist(String str) {
        if (!a()) {
            b();
        }
        synchronized ("sqliteLock") {
            if (a()) {
                Cursor cursorQuery = null;
                try {
                    try {
                        cursorQuery = f4246f.query("persosCourantTable", null, "baseId =? AND baselogiqueid =?", new String[]{str, String.valueOf(m.sharedInstance().getCurrentInstance().getBaseLogiqueId())}, null, null, null);
                        if (cursorQuery != null) {
                            if (cursorQuery.getCount() == 1) {
                                cursorQuery.close();
                                return true;
                            }
                        }
                    } catch (Exception e10) {
                        Timber.tag("DefiSetAdapter").e(e10);
                        if (cursorQuery != null) {
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th2) {
                    if (cursorQuery == null) {
                        throw th2;
                    }
                    cursorQuery.close();
                    throw th2;
                }
            }
            return false;
        }
    }

    public boolean isPersoAlreadyFound(String str) {
        if (!a()) {
            b();
        }
        synchronized ("sqliteLock") {
            if (a()) {
                Cursor cursorQuery = null;
                try {
                    try {
                        cursorQuery = f4246f.query("persosCourantTable", null, "baseId =? AND trouve =? AND baselogiqueid =?", new String[]{str, "1", String.valueOf(m.sharedInstance().getCurrentInstance().getBaseLogiqueId())}, null, null, null);
                        if (cursorQuery != null) {
                            if (cursorQuery.getCount() == 1) {
                                cursorQuery.close();
                                return true;
                            }
                        }
                    } catch (Exception e10) {
                        Timber.tag("DefiSetAdapter").e(e10);
                        if (cursorQuery != null) {
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } finally {
                }
            }
            return false;
        }
    }

    public void removeListener(d dVar) {
        synchronized (this.f4247a) {
            this.f4247a.remove(dVar);
        }
    }

    public void resetPersoAlreadyFound(int i10, int i11) {
        if (!a()) {
            b();
        }
        synchronized ("sqliteLock") {
            try {
                if (a()) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("trouve", "0");
                    f4246f.update("persosCourantTable", contentValues, "baseId =? AND baselogiqueid =?", new String[]{String.valueOf(i10), String.valueOf(i11)});
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setNbGz(int i10, int i11) {
        if (!a()) {
            b();
        }
        synchronized ("sqliteLock") {
            try {
                if (a()) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("persoGz", Integer.valueOf(i11));
                    f4246f.update("persosCourantTable", contentValues, "baseId =? AND baselogiqueid =?", new String[]{String.valueOf(i10), String.valueOf(m.sharedInstance().getCurrentInstance().getBaseLogiqueId())});
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setPersoAlreadyFound(int i10) {
        if (!a()) {
            b();
        }
        synchronized ("sqliteLock") {
            try {
                if (a()) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("trouve", "1");
                    f4246f.update("persosCourantTable", contentValues, "baseId =? AND baselogiqueid =?", new String[]{String.valueOf(i10), String.valueOf(m.sharedInstance().getCurrentInstance().getBaseLogiqueId())});
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void unlockIndice(e eVar) {
        synchronized ("sqliteLock") {
            try {
                if (!a()) {
                    b();
                }
                if (a()) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("persoIndiceUnlocked", (Integer) 1);
                    if (f4246f.update("persosCourantTable", contentValues, "baseId =?", new String[]{String.valueOf(eVar.getBaseId())}) != -1) {
                        eVar.f4243i = 1;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void updateDefiCourant(String str, int i10, List<e> list) {
        ArrayList arrayList;
        if (!a()) {
            b();
        }
        synchronized ("sqliteLock") {
            try {
                if (a()) {
                    c();
                    String[] strArr = {String.valueOf(m.sharedInstance().getCurrentInstance().getBaseLogiqueId())};
                    f4246f.delete("defiCourantTable", "baselogiqueid =?", strArr);
                    f4246f.delete("persosCourantTable", "baselogiqueid =?", strArr);
                    if (str != null) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("titre", str);
                        contentValues.put("idDefi", Integer.valueOf(i10));
                        contentValues.put("baselogiqueid", Integer.valueOf(m.sharedInstance().getCurrentInstance().getBaseLogiqueId()));
                        f4246f.insert("defiCourantTable", null, contentValues);
                        for (e eVar : list) {
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("baseId", Integer.valueOf(eVar.f4235a));
                            contentValues2.put("nom", eVar.f4236b);
                            contentValues2.put("description", eVar.f4237c);
                            contentValues2.put("photoBase64", eVar.f4238d);
                            contentValues2.put("pourcentage", Float.valueOf(eVar.f4239e));
                            contentValues2.put("trouve", Boolean.valueOf(eVar.f4240f));
                            contentValues2.put("idDefi", Integer.valueOf(i10));
                            contentValues2.put("baselogiqueid", Integer.valueOf(m.sharedInstance().getCurrentInstance().getBaseLogiqueId()));
                            contentValues2.put("persoGz", Integer.valueOf(eVar.f4241g));
                            contentValues2.put("persoIndice", eVar.f4242h);
                            f4246f.insert("persosCourantTable", null, contentValues2);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f4247a) {
            arrayList = new ArrayList(this.f4247a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((d) it.next()).onDefiDuJourModified();
        }
    }

    public int getNbAwardDdj(int i10, int i11) {
        int i12;
        synchronized ("sqliteLock") {
            try {
                if (!a()) {
                    b();
                }
                i12 = 0;
                if (a()) {
                    Cursor cursorRawQuery = f4246f.rawQuery("SELECT COUNT(*) FROM defiAwardTable WHERE defiAwarldLevel=" + i10 + " AND baselogiqueid=" + i11 + ";", null);
                    if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                        i12 = cursorRawQuery.getInt(0);
                        cursorRawQuery.close();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i12;
    }

    public c getDefiInfos(boolean z10) {
        try {
            return getDefiInfos(z10, m.sharedInstance().getCurrentInstance().getBaseLogiqueId());
        } catch (Exception unused) {
            return null;
        }
    }
}
