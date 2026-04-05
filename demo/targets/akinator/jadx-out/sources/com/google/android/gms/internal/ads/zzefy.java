package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.ironsource.C3191e4;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzefy extends zzfua {
    private final Context zza;
    private final zzgus zzb;

    public zzefy(Context context, zzgus zzgusVar) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjk)).intValue(), zzfuc.zza);
        this.zza = context;
        this.zzb = zzgusVar;
    }

    public static /* synthetic */ Void zzf(com.google.android.gms.ads.internal.util.client.zzu zzuVar, SQLiteDatabase sQLiteDatabase) throws Throwable {
        zzj(sQLiteDatabase, zzuVar);
        return null;
    }

    public static /* synthetic */ void zzg(SQLiteDatabase sQLiteDatabase, String str, com.google.android.gms.ads.internal.util.client.zzu zzuVar) throws Throwable {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzuVar);
    }

    public static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, com.google.android.gms.ads.internal.util.client.zzu zzuVar) throws Throwable {
        SQLiteDatabase sQLiteDatabase2;
        String string;
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArr = {"timestamp", "url"};
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("event_state = 1");
            String string2 = sb2.toString();
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                Cursor cursorQuery = sQLiteDatabase2.query("offline_buffered_pings", strArr, string2, null, null, null, "timestamp ASC", null);
                int count = cursorQuery.getCount();
                String[] strArr2 = new String[count];
                int i10 = 0;
                while (cursorQuery.moveToNext()) {
                    int columnIndex = cursorQuery.getColumnIndex("timestamp");
                    int columnIndex2 = cursorQuery.getColumnIndex("url");
                    if (columnIndex2 != -1) {
                        long j10 = cursorQuery.getLong(columnIndex);
                        String string3 = cursorQuery.getString(columnIndex2);
                        if (string3 == null) {
                            string = "";
                        } else {
                            Uri uri = Uri.parse(string3);
                            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - j10;
                            String encodedQuery = uri.getEncodedQuery();
                            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                            builderClearQuery.appendQueryParameter("bd", Long.toString(jCurrentTimeMillis));
                            String strValueOf = String.valueOf(builderClearQuery.build());
                            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length());
                            sb3.append(strValueOf);
                            sb3.append(C3191e4.i.f36527c);
                            sb3.append(encodedQuery);
                            string = sb3.toString();
                        }
                        strArr2[i10] = string;
                    }
                    i10++;
                }
                cursorQuery.close();
                sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
                for (int i11 = 0; i11 < count; i11++) {
                    zzuVar.zzc(strArr2[i11], null);
                }
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                sQLiteDatabase2.endTransaction();
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void zza(zzfjx zzfjxVar) {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzefx
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.getWritableDatabase();
            }
        };
        zzgus zzgusVar = this.zzb;
        zzgui.zzr(zzgusVar.submit(callable), new zzefr(this, zzfjxVar), zzgusVar);
    }

    public final void zzb(final SQLiteDatabase sQLiteDatabase, final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws Throwable {
                zzefy.zzg(sQLiteDatabase, str, zzuVar);
            }
        });
    }

    public final void zzc(final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final String str) {
        zza(new zzfjx() { // from class: com.google.android.gms.internal.ads.zzeft
            @Override // com.google.android.gms.internal.ads.zzfjx
            public final /* synthetic */ Object zza(Object obj) {
                this.zza.zzb((SQLiteDatabase) obj, zzuVar, str);
                return null;
            }
        });
    }

    public final void zzd(final String str) {
        zza(new zzfjx(this) { // from class: com.google.android.gms.internal.ads.zzefu
            @Override // com.google.android.gms.internal.ads.zzfjx
            public final /* synthetic */ Object zza(Object obj) {
                zzefy.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zze(final zzega zzegaVar) {
        zza(new zzfjx() { // from class: com.google.android.gms.internal.ads.zzefv
            @Override // com.google.android.gms.internal.ads.zzfjx
            public final /* synthetic */ Object zza(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                this.zza.zzh(zzegaVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public final /* synthetic */ Void zzh(zzega zzegaVar, SQLiteDatabase sQLiteDatabase) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzegaVar.zza));
        contentValues.put("gws_query_id", zzegaVar.zzb);
        contentValues.put("url", zzegaVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzegaVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zza;
        com.google.android.gms.ads.internal.util.zzbo zzboVarZzD = com.google.android.gms.ads.internal.util.zzs.zzD(context);
        if (zzboVarZzD != null) {
            try {
                zzboVarZzD.zzf(ObjectWrapper.wrap(context));
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e10);
            }
        }
        return null;
    }
}
