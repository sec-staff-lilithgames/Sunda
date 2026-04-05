package com.google.android.gms.internal.gtm;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.HttpUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcd extends zzbr implements Closeable {
    private static final String zza = "CREATE TABLE IF NOT EXISTS hits2 ( 'hit_id' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 'hit_time' INTEGER NOT NULL, 'hit_url' TEXT NOT NULL, 'hit_string' TEXT NOT NULL, 'hit_app_id' INTEGER);";
    private static final String zzb = "SELECT MAX(hit_time) FROM hits2 WHERE 1;";
    private final zzcc zzc;
    private final zzfb zzd;
    private final zzfb zze;

    public zzcd(zzbu zzbuVar) {
        super(zzbuVar);
        this.zzd = new zzfb(zzC());
        this.zze = new zzfb(zzC());
        this.zzc = new zzcc(this, zzbuVar.zza(), zzad());
    }

    private final long zzac(String str, String[] strArr, long j10) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zzf().rawQuery(str, strArr);
                long j11 = cursorRawQuery.moveToFirst() ? cursorRawQuery.getLong(0) : 0L;
                cursorRawQuery.close();
                return j11;
            } catch (SQLiteException e10) {
                zzK("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzad() {
        zzw();
        zzw();
        return "google_analytics_v4.db";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.zzc.close();
        } catch (SQLiteException e10) {
            zzJ("Sql error closing database", e10);
        } catch (IllegalStateException e11) {
            zzJ("Error closing database", e11);
        }
    }

    public final void zzY(List list) {
        Preconditions.checkNotNull(list);
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("hit_id in (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            Long l9 = (Long) list.get(i10);
            if (l9 == null || l9.longValue() == 0) {
                throw new SQLiteException("Invalid hit id");
            }
            if (i10 > 0) {
                sb2.append(",");
            }
            sb2.append(l9);
        }
        sb2.append(")");
        String string = sb2.toString();
        try {
            SQLiteDatabase sQLiteDatabaseZzf = zzf();
            zzO("Deleting dispatched hits. count", Integer.valueOf(list.size()));
            int iDelete = sQLiteDatabaseZzf.delete("hits2", string, null);
            if (iDelete != list.size()) {
                zzT("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(iDelete), string);
            }
        } catch (SQLiteException e10) {
            zzJ("Error deleting hits", e10);
            throw e10;
        }
    }

    public final void zzZ() {
        zzV();
        zzf().endTransaction();
    }

    public final int zza() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        if (!this.zzd.zzc(86400000L)) {
            return 0;
        }
        this.zzd.zzb();
        zzN("Deleting stale hits (if any)");
        int iDelete = zzf().delete("hits2", "hit_time < ?", new String[]{Long.toString(zzC().currentTimeMillis() - 2592000000L)});
        zzO("Deleted stale hits, count", Integer.valueOf(iDelete));
        return iDelete;
    }

    public final void zzaa() {
        zzV();
        zzf().setTransactionSuccessful();
    }

    public final boolean zzab() {
        return zzb() == 0;
    }

    public final long zzb() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = zzf().rawQuery("SELECT COUNT(*) FROM hits2", null);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                zzK("Database error", "SELECT COUNT(*) FROM hits2", e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final long zzc() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        return zzac(zzb, null, 0L);
    }

    public final long zze(long j10, String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzV();
        com.google.android.gms.analytics.zzr.zzh();
        return zzac("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{"0", str, str2}, 0L);
    }

    public final SQLiteDatabase zzf() {
        try {
            return this.zzc.getWritableDatabase();
        } catch (SQLiteException e10) {
            zzR("Error opening database", e10);
            throw e10;
        }
    }

    public final List zzj(long j10) throws Throwable {
        Cursor cursorQuery;
        Map map;
        boolean z10;
        Preconditions.checkArgument(j10 >= 0);
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        Cursor cursor = null;
        try {
            try {
                cursorQuery = zzf().query("hits2", new String[]{"hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id"}, null, null, null, null, "hit_id ASC", Long.toString(j10));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e10) {
            e = e10;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (cursorQuery.moveToFirst()) {
                do {
                    long j11 = cursorQuery.getLong(0);
                    long j12 = cursorQuery.getLong(1);
                    String string = cursorQuery.getString(2);
                    String string2 = cursorQuery.getString(3);
                    int i10 = cursorQuery.getInt(4);
                    Map mapZzk = zzk(string);
                    if (!TextUtils.isEmpty(string2) && string2.startsWith("http:")) {
                        map = mapZzk;
                        z10 = false;
                    } else {
                        map = mapZzk;
                        z10 = true;
                    }
                    arrayList.add(new zzek(this, map, j12, z10, j11, i10, null));
                } while (cursorQuery.moveToNext());
            }
            cursorQuery.close();
            return arrayList;
        } catch (SQLiteException e11) {
            e = e11;
            zzJ("Error loading hits from the database", e);
            throw e;
        } catch (Throwable th3) {
            th = th3;
            cursor = cursorQuery;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final Map zzk(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                str = "?".concat(str);
            }
            return HttpUtils.parse(new URI(str), C.UTF8_NAME);
        } catch (URISyntaxException e10) {
            zzJ("Error parsing hit parameters", e10);
            return new HashMap(0);
        }
    }

    public final Map zzl(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            return HttpUtils.parse(new URI("?" + str), C.UTF8_NAME);
        } catch (URISyntaxException e10) {
            zzJ("Error parsing property parameters", e10);
            return new HashMap(0);
        }
    }

    public final void zzm() {
        zzV();
        zzf().beginTransaction();
    }

    public final void zzn(long j10) {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        ArrayList arrayList = new ArrayList(1);
        Long lValueOf = Long.valueOf(j10);
        arrayList.add(lValueOf);
        zzO("Deleting hit, id", lValueOf);
        zzY(arrayList);
    }

    @Override // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
    }
}
