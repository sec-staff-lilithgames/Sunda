package com.google.android.gms.measurement.internal;

import a.b;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.apm.insight.b.El.rJqlArycrfkilN;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpr;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.internal.play_billing.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.C3191e4;
import com.moloco.sdk.BKC.JzVV;
import com.moloco.sdk.BKC.KerkSviMAy;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import com.unity3d.ads.beta.xyn.RnJusJ;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzav extends zzos {
    private final zzau zzm;
    private final zzog zzn;
    private static final String[] zzb = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    static final String[] zza = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    private static final String[] zzc = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzd = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", KerkSviMAy.gaUxsrFGGpkH, "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};
    private static final String[] zze = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zzf = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzj = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private static final String[] zzk = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    private static final String[] zzl = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public zzav(zzpg zzpgVar) {
        super(zzpgVar);
        this.zzn = new zzog(this.zzu.zzaZ());
        this.zzu.zzc();
        this.zzm = new zzau(this, this.zzu.zzaY(), "google_app_measurement.db");
    }

    private final String zzaA(String str, String[] strArr, String str2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zze().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e10) {
                this.zzu.zzaV().zzb().zzc("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    private final void zzaB(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseZze = zze();
            if (contentValues.getAsString("app_id") == null) {
                this.zzu.zzaV().zzd().zzb("Value of the primary key is not set.", zzgu.zzl("app_id"));
                return;
            }
            new StringBuilder(10).append("app_id = ?");
            if (sQLiteDatabaseZze.update("consent_settings", contentValues, r3.toString(), new String[]{r2}) == 0 && sQLiteDatabaseZze.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                this.zzu.zzaV().zzb().zzc("Failed to insert/update table (got -1). key", zzgu.zzl("consent_settings"), zzgu.zzl("app_id"));
            }
        } catch (SQLiteException e10) {
            this.zzu.zzaV().zzb().zzd("Error storing into table. key", zzgu.zzl("consent_settings"), zzgu.zzl("app_id"), e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.measurement.internal.zzbc zzaC(java.lang.String r30, java.lang.String r31, java.lang.String r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzaC(java.lang.String, java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzbc");
    }

    private final void zzaE(String str, String str2) {
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzaw();
        try {
            zze().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e10) {
            this.zzu.zzaV().zzb().zzc("Error deleting snapshot. appId", zzgu.zzl(str2), e10);
        }
    }

    private final String zzaG() {
        zzic zzicVar = this.zzu;
        long jCurrentTimeMillis = zzicVar.zzaZ().currentTimeMillis();
        Locale locale = Locale.US;
        zzls zzlsVar = zzls.GOOGLE_SIGNAL;
        int iZza = zzlsVar.zza();
        zzicVar.zzc();
        Long l9 = (Long) zzfy.zzS.zzb(null);
        l9.longValue();
        String str = "(upload_type = " + iZza + " AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l9 + ")";
        int iZza2 = zzlsVar.zza();
        zzicVar.zzc();
        String str2 = "(upload_type != " + iZza2 + " AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + zzal.zzI() + ")";
        StringBuilder sb2 = new StringBuilder(o2.c(str.length(), 5, str2.length(), 1));
        a.B(sb2, "(", str, " OR ", str2);
        sb2.append(")");
        return sb2.toString();
    }

    public static final void zzau(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    private final long zzay(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = zze().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                this.zzu.zzaV().zzb().zzc("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    private final long zzaz(String str, String[] strArr, long j10) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zze().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j10 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                this.zzu.zzaV().zzb().zzc("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    public final long zzA(String str, com.google.android.gms.internal.measurement.zzib zzibVar, String str2, Map map, zzls zzlsVar, Long l9) {
        int iDelete;
        zzg();
        zzaw();
        Preconditions.checkNotNull(zzibVar);
        Preconditions.checkNotEmpty(str);
        zzg();
        zzaw();
        if (zzag()) {
            zzpg zzpgVar = this.zzg;
            long jZza = zzpgVar.zzq().zzb.zza();
            zzic zzicVar = this.zzu;
            long jElapsedRealtime = zzicVar.zzaZ().elapsedRealtime();
            long jAbs = Math.abs(jElapsedRealtime - jZza);
            zzicVar.zzc();
            if (jAbs > zzal.zzJ()) {
                zzpgVar.zzq().zzb.zzb(jElapsedRealtime);
                zzg();
                zzaw();
                if (zzag() && (iDelete = zze().delete("upload_queue", zzaG(), new String[0])) > 0) {
                    zzicVar.zzaV().zzk().zzb("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                }
                Preconditions.checkNotEmpty(str);
                zzg();
                zzaw();
                try {
                    int iZzm = zzicVar.zzc().zzm(str, zzfy.zzz);
                    if (iZzm > 0) {
                        zze().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iZzm)});
                    }
                } catch (SQLiteException e10) {
                    this.zzu.zzaV().zzb().zzc("Error deleting over the limit queued batches. appId", zzgu.zzl(str), e10);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append(C3191e4.i.f36525b);
            sb2.append(str4);
            arrayList.add(sb2.toString());
        }
        byte[] bArrZzcc = zzibVar.zzcc();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrZzcc);
        contentValues.put("upload_uri", str2);
        StringBuilder sb3 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb3.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb3.append((CharSequence) "\r\n");
            }
        }
        contentValues.put("upload_headers", sb3.toString());
        contentValues.put("upload_type", Integer.valueOf(zzlsVar.zza()));
        zzic zzicVar2 = this.zzu;
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzicVar2.zzaZ().currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l9 != null) {
            contentValues.put("associated_row_id", l9);
        }
        try {
            long jInsert = zze().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            zzicVar2.zzaV().zzb().zzb("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return -1L;
        } catch (SQLiteException e11) {
            this.zzu.zzaV().zzb().zzc("Error storing MeasurementBatch to upload_queue. appId", str, e11);
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzpj zzB(long r19) throws java.lang.Throwable {
        /*
            r18 = this;
            r18.zzg()
            r18.zzaw()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r18.zze()     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String r3 = "upload_queue"
            java.lang.String r4 = "rowId"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "measurement_batch"
            java.lang.String r7 = "upload_uri"
            java.lang.String r8 = "upload_headers"
            java.lang.String r9 = "upload_type"
            java.lang.String r10 = "retry_count"
            java.lang.String r11 = "creation_timestamp"
            java.lang.String r12 = "associated_row_id"
            java.lang.String r13 = "last_upload_timestamp"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String r5 = "rowId=?"
            java.lang.String r0 = java.lang.String.valueOf(r19)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String r10 = "1"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            if (r0 != 0) goto L42
            r3 = r18
            goto Lab
        L42:
            r0 = 1
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 2
            byte[] r7 = r2.getBlob(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 3
            java.lang.String r8 = r2.getString(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 4
            java.lang.String r9 = r2.getString(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 5
            int r10 = r2.getInt(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 6
            int r11 = r2.getInt(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 7
            long r12 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 8
            long r14 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 9
            long r16 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r3 = r18
            r5 = r19
            com.google.android.gms.measurement.internal.zzpj r0 = r3.zzaF(r4, r5, r7, r8, r9, r10, r11, r12, r14, r16)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r2.close()
            return r0
        L84:
            r0 = move-exception
            goto L88
        L86:
            r0 = move-exception
            goto L8c
        L88:
            r3 = r18
        L8a:
            r1 = r2
            goto Lb3
        L8c:
            r3 = r18
            goto L98
        L8f:
            r0 = move-exception
            goto L93
        L91:
            r0 = move-exception
            goto L96
        L93:
            r3 = r18
            goto Lb3
        L96:
            r2 = r1
            goto L8c
        L98:
            com.google.android.gms.measurement.internal.zzic r4 = r3.zzu     // Catch: java.lang.Throwable -> Lb1
            com.google.android.gms.measurement.internal.zzgu r4 = r4.zzaV()     // Catch: java.lang.Throwable -> Lb1
            com.google.android.gms.measurement.internal.zzgs r4 = r4.zzb()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r5 = "Error to querying MeasurementBatch from upload_queue. rowId"
            java.lang.Long r6 = java.lang.Long.valueOf(r19)     // Catch: java.lang.Throwable -> Lb1
            r4.zzc(r5, r6, r0)     // Catch: java.lang.Throwable -> Lb1
        Lab:
            if (r2 == 0) goto Lb0
            r2.close()
        Lb0:
            return r1
        Lb1:
            r0 = move-exception
            goto L8a
        Lb3:
            if (r1 == 0) goto Lb8
            r1.close()
        Lb8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzB(long):com.google.android.gms.measurement.internal.zzpj");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzC(java.lang.String r19, com.google.android.gms.measurement.internal.zzoo r20, int r21) {
        /*
            r18 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r19)
            r18.zzg()
            r18.zzaw()
            java.lang.String r0 = " AND NOT "
            java.lang.String r1 = "app_id=?"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r18.zze()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r4 = "upload_queue"
            java.lang.String r5 = "rowId"
            java.lang.String r6 = "app_id"
            java.lang.String r7 = "measurement_batch"
            java.lang.String r8 = "upload_uri"
            java.lang.String r9 = "upload_headers"
            java.lang.String r10 = "upload_type"
            java.lang.String r11 = "retry_count"
            java.lang.String r12 = "creation_timestamp"
            java.lang.String r13 = "associated_row_id"
            java.lang.String r14 = "last_upload_timestamp"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r6 = r20
            java.util.List r6 = r6.zza     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r6 = zzaH(r6)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r7 = r18.zzaG()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            int r8 = r8.length()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            int r8 = r8 + 17
            int r9 = r7.length()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r9.<init>(r8)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r9.append(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r9.append(r6)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r9.append(r7)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String[] r7 = new java.lang.String[]{r19}     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r10 = "creation_timestamp ASC"
            if (r21 <= 0) goto L6a
            java.lang.String r0 = java.lang.String.valueOf(r21)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r11 = r0
            goto L6b
        L6a:
            r11 = r2
        L6b:
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r0.<init>()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
        L76:
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            if (r1 == 0) goto Lbd
            r1 = 0
            long r5 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 2
            byte[] r7 = r2.getBlob(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 3
            java.lang.String r8 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 4
            java.lang.String r9 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 5
            int r10 = r2.getInt(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 6
            int r11 = r2.getInt(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 7
            long r12 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 8
            long r14 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 9
            long r16 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r3 = r18
            r4 = r19
            com.google.android.gms.measurement.internal.zzpj r1 = r3.zzaF(r4, r5, r7, r8, r9, r10, r11, r12, r14, r16)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            if (r1 == 0) goto L76
            r0.add(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            goto L76
        Lb9:
            r0 = move-exception
            goto Lc0
        Lbb:
            r0 = move-exception
            goto Lc3
        Lbd:
            r3 = r18
            goto Ld8
        Lc0:
            r3 = r18
            goto Ldf
        Lc3:
            r3 = r18
            com.google.android.gms.measurement.internal.zzic r1 = r3.zzu     // Catch: java.lang.Throwable -> Lde
            com.google.android.gms.measurement.internal.zzgu r1 = r1.zzaV()     // Catch: java.lang.Throwable -> Lde
            com.google.android.gms.measurement.internal.zzgs r1 = r1.zzb()     // Catch: java.lang.Throwable -> Lde
            java.lang.String r4 = "Error to querying MeasurementBatch from upload_queue. appId"
            r5 = r19
            r1.zzc(r4, r5, r0)     // Catch: java.lang.Throwable -> Lde
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> Lde
        Ld8:
            if (r2 == 0) goto Ldd
            r2.close()
        Ldd:
            return r0
        Lde:
            r0 = move-exception
        Ldf:
            if (r2 == 0) goto Le4
            r2.close()
        Le4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzC(java.lang.String, com.google.android.gms.measurement.internal.zzoo, int):java.util.List");
    }

    public final boolean zzD(String str) {
        zzls[] zzlsVarArr = {zzls.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(zzlsVarArr[0].zza()));
        String strZzaH = zzaH(arrayList);
        String strZzaG = zzaG();
        return zzay(o2.r(new StringBuilder((String.valueOf(strZzaH).length() + 61) + strZzaG.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", strZzaH, " AND NOT ", strZzaG), new String[]{str}) != 0;
    }

    public final void zzE(Long l9) {
        zzg();
        zzaw();
        Preconditions.checkNotNull(l9);
        try {
            if (zze().delete("upload_queue", "rowid=?", new String[]{l9.toString()}) != 1) {
                this.zzu.zzaV().zze().zza("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e10) {
            this.zzu.zzaV().zzb().zzb("Failed to delete a MeasurementBatch in a upload_queue table", e10);
            throw e10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzF() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.zze()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L36
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            r2 = move-exception
            goto L27
        L1e:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3c
        L22:
            r0 = move-exception
            goto L3c
        L24:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L27:
            com.google.android.gms.measurement.internal.zzic r3 = r6.zzu     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.zzgu r3 = r3.zzaV()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.zzgs r3 = r3.zzb()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zzb(r4, r2)     // Catch: java.lang.Throwable -> L1a
        L36:
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            return r1
        L3c:
            if (r1 == 0) goto L41
            r1.close()
        L41:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzF():java.lang.String");
    }

    public final boolean zzG() {
        return zzay("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final void zzH(long j10) {
        zzg();
        zzaw();
        try {
            if (zze().delete("queue", "rowid=?", new String[]{String.valueOf(j10)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e10) {
            this.zzu.zzaV().zzb().zzb("Failed to delete a bundle in a queue table", e10);
            throw e10;
        }
    }

    public final void zzI() {
        zzg();
        zzaw();
        if (zzag()) {
            zzpg zzpgVar = this.zzg;
            long jZza = zzpgVar.zzq().zza.zza();
            zzic zzicVar = this.zzu;
            long jElapsedRealtime = zzicVar.zzaZ().elapsedRealtime();
            long jAbs = Math.abs(jElapsedRealtime - jZza);
            zzicVar.zzc();
            if (jAbs > zzal.zzJ()) {
                zzpgVar.zzq().zza.zzb(jElapsedRealtime);
                zzg();
                zzaw();
                if (zzag()) {
                    SQLiteDatabase sQLiteDatabaseZze = zze();
                    String strValueOf = String.valueOf(zzicVar.zzaZ().currentTimeMillis());
                    zzicVar.zzc();
                    int iDelete = sQLiteDatabaseZze.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{strValueOf, String.valueOf(zzal.zzI())});
                    if (iDelete > 0) {
                        zzicVar.zzaV().zzk().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    public final void zzJ(List list) throws SQLException {
        zzg();
        zzaw();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzag()) {
            String strJoin = TextUtils.join(",", list);
            String strO = b.o(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            if (zzay(b.o(new StringBuilder(strO.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strO, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                a.C(this.zzu, "The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseZze = zze();
                StringBuilder sb2 = new StringBuilder(strO.length() + 127);
                sb2.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb2.append(strO);
                sb2.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseZze.execSQL(sb2.toString());
            } catch (SQLiteException e10) {
                this.zzu.zzaV().zzb().zzb("Error incrementing retry count. error", e10);
            }
        }
    }

    public final void zzK(Long l9) throws SQLException {
        zzg();
        zzaw();
        Preconditions.checkNotNull(l9);
        if (zzag()) {
            StringBuilder sb2 = new StringBuilder(l9.toString().length() + 86);
            sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb2.append(l9);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (zzay(sb2.toString(), null) > 0) {
                a.C(this.zzu, "The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseZze = zze();
                long jCurrentTimeMillis = this.zzu.zzaZ().currentTimeMillis();
                StringBuilder sb3 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb3.append(jCurrentTimeMillis);
                String string = sb3.toString();
                StringBuilder sb4 = new StringBuilder(string.length() + 34 + l9.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(string);
                sb4.append(" WHERE rowid = ");
                sb4.append(l9);
                sb4.append(" AND retry_count < 2147483647");
                sQLiteDatabaseZze.execSQL(sb4.toString());
            } catch (SQLiteException e10) {
                this.zzu.zzaV().zzb().zzb("Error incrementing retry count. error", e10);
            }
        }
    }

    public final Object zzL(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            a.r(this.zzu, "Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            this.zzu.zzaV().zzb().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        a.r(this.zzu, "Loaded invalid blob type value, ignoring it");
        return null;
    }

    public final long zzM() {
        return zzaz("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092 A[Catch: all -> 0x006c, SQLiteException -> 0x00a6, TryCatch #0 {SQLiteException -> 0x00a6, blocks: (B:15:0x0071, B:17:0x0092, B:20:0x00a8), top: B:30:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8 A[Catch: all -> 0x006c, SQLiteException -> 0x00a6, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a6, blocks: (B:15:0x0071, B:17:0x0092, B:20:0x00a8), top: B:30:0x0071 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzN(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r13 = "select first_open_count from app2 where app_id=?"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)
            java.lang.String r0 = "first_open_count"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            r11.zzg()
            r11.zzaw()
            android.database.sqlite.SQLiteDatabase r1 = r11.zze()
            r1.beginTransaction()
            r2 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            r5 = 48
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            r4.append(r13)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r13 = r4.toString()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String[] r4 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            r5 = -1
            long r7 = r11.zzaz(r13, r4, r5)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            int r13 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            java.lang.String r4 = "app2"
            java.lang.String r9 = "app_id"
            if (r13 != 0) goto L71
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            r13.<init>()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            r13.put(r9, r12)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            r7 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            r13.put(r0, r7)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r8 = "previous_install_count"
            r13.put(r8, r7)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            r7 = 0
            r8 = 5
            long r7 = r1.insertWithOnConflict(r4, r7, r13, r8)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            int r13 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r13 != 0) goto L70
            com.google.android.gms.measurement.internal.zzic r13 = r11.zzu     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            com.google.android.gms.measurement.internal.zzgu r13 = r13.zzaV()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            com.google.android.gms.measurement.internal.zzgs r13 = r13.zzb()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r4 = "Failed to insert column (got -1). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzgu.zzl(r12)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            r13.zzc(r4, r7, r0)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            goto Lc2
        L6c:
            r12 = move-exception
            goto Lc6
        L6e:
            r13 = move-exception
            goto Lae
        L70:
            r7 = r2
        L71:
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> La6
            r13.<init>()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> La6
            r13.put(r9, r12)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> La6
            r9 = 1
            long r9 = r9 + r7
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> La6
            r13.put(r0, r9)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> La6
            java.lang.String r9 = "app_id = ?"
            java.lang.String[] r10 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> La6
            int r13 = r1.update(r4, r13, r9, r10)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> La6
            long r9 = (long) r13     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> La6
            int r13 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r13 != 0) goto La8
            com.google.android.gms.measurement.internal.zzic r13 = r11.zzu     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> La6
            com.google.android.gms.measurement.internal.zzgu r13 = r13.zzaV()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> La6
            com.google.android.gms.measurement.internal.zzgs r13 = r13.zzb()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> La6
            java.lang.String r2 = "Failed to update column (got 0). appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzgu.zzl(r12)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> La6
            r13.zzc(r2, r3, r0)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> La6
            goto Lc2
        La6:
            r13 = move-exception
            goto Lad
        La8:
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> La6
            r5 = r7
            goto Lc2
        Lad:
            r2 = r7
        Lae:
            com.google.android.gms.measurement.internal.zzic r4 = r11.zzu     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.measurement.internal.zzgu r4 = r4.zzaV()     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.measurement.internal.zzgs r4 = r4.zzb()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r5 = "Error inserting column. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzgu.zzl(r12)     // Catch: java.lang.Throwable -> L6c
            r4.zzd(r5, r12, r0, r13)     // Catch: java.lang.Throwable -> L6c
            r5 = r2
        Lc2:
            r1.endTransaction()
            return r5
        Lc6:
            r1.endTransaction()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzN(java.lang.String, java.lang.String):long");
    }

    public final long zzO() {
        return zzaz("select max(timestamp) from raw_events", null, 0L);
    }

    public final boolean zzP() {
        return zzay("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean zzQ(String str, String str2) {
        return zzay("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final boolean zzR() {
        return zzay("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final long zzS(String str) {
        Preconditions.checkNotEmpty(str);
        return zzaz("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final boolean zzT(String str, Long l9, long j10, com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        zzg();
        zzaw();
        Preconditions.checkNotNull(zzhsVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l9);
        zzic zzicVar = this.zzu;
        byte[] bArrZzcc = zzhsVar.zzcc();
        zzicVar.zzaV().zzk().zzc("Saving complex main event, appId, data size", zzicVar.zzl().zza(str), Integer.valueOf(bArrZzcc.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l9);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", bArrZzcc);
        try {
            if (zze().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzicVar.zzaV().zzb().zzb("Failed to insert complex main event (got -1). appId", zzgu.zzl(str));
            return false;
        } catch (SQLiteException e10) {
            this.zzu.zzaV().zzb().zzc("Error storing complex main event. appId", zzgu.zzl(str), e10);
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:107), block:B:19:0x006a */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle zzU(java.lang.String r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r5.zzg()
            r5.zzaw()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.zze()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            if (r2 != 0) goto L2f
            com.google.android.gms.measurement.internal.zzic r6 = r5.zzu     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.measurement.internal.zzgu r6 = r6.zzaV()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.measurement.internal.zzgs r6 = r6.zzk()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            java.lang.String r2 = "Default event parameters not found"
            r6.zza(r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            goto L7f
        L2b:
            r6 = move-exception
            goto L6a
        L2d:
            r6 = move-exception
            goto L70
        L2f:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.internal.measurement.zzhr r3 = com.google.android.gms.internal.measurement.zzhs.zzk()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.zznl r2 = com.google.android.gms.measurement.internal.zzpk.zzw(r3, r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.zzhr r2 = (com.google.android.gms.internal.measurement.zzhr) r2     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.zzmf r2 = r2.zzbc()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.zzhs r2 = (com.google.android.gms.internal.measurement.zzhs) r2     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.measurement.internal.zzpg r6 = r5.zzg     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            r6.zzp()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            java.util.List r6 = r2.zza()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            android.os.Bundle r6 = com.google.android.gms.measurement.internal.zzpk.zzE(r6)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            r1.close()
            return r6
        L55:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzic r3 = r5.zzu     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.measurement.internal.zzgu r3 = r3.zzaV()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.measurement.internal.zzgs r3 = r3.zzb()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzgu.zzl(r6)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            r3.zzc(r4, r6, r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            goto L7f
        L6a:
            r0 = r1
            goto L85
        L6c:
            r6 = move-exception
            goto L85
        L6e:
            r6 = move-exception
            r1 = r0
        L70:
            com.google.android.gms.measurement.internal.zzic r2 = r5.zzu     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.measurement.internal.zzgu r2 = r2.zzaV()     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.measurement.internal.zzgs r2 = r2.zzb()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = "Error selecting default event parameters"
            r2.zzb(r3, r6)     // Catch: java.lang.Throwable -> L2b
        L7f:
            if (r1 == 0) goto L84
            r1.close()
        L84:
            return r0
        L85:
            if (r0 == 0) goto L8a
            r0.close()
        L8a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzU(java.lang.String):android.os.Bundle");
    }

    public final boolean zzV(String str, long j10) {
        try {
            if (zzaz("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) > 0) {
                return false;
            }
            return zzaz("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) > 0;
        } catch (SQLiteException e10) {
            this.zzu.zzaV().zzb().zzb("Error checking backfill conditions", e10);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x011e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a7 A[Catch: SQLiteException -> 0x02c0, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x02c0, blocks: (B:94:0x028c, B:96:0x02a7), top: B:108:0x028c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzW(java.lang.String r25, java.lang.Long r26, java.lang.String r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzW(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzjl zzX(java.lang.String r5) {
        /*
            r4 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            r4.zzg()
            r4.zzaw()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r0 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r4.zze()     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L49
            android.database.Cursor r5 = r2.rawQuery(r0, r5)     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L49
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            if (r0 != 0) goto L35
            com.google.android.gms.measurement.internal.zzic r0 = r4.zzu     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.zzgu r0 = r0.zzaV()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.zzgs r0 = r0.zzk()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            java.lang.String r2 = "No data found"
            r0.zza(r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
        L2d:
            r5.close()
            goto L5e
        L31:
            r0 = move-exception
            goto L44
        L33:
            r0 = move-exception
            goto L4c
        L35:
            r0 = 0
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            r2 = 1
            int r2 = r5.getInt(r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.zzjl r1 = com.google.android.gms.measurement.internal.zzjl.zzf(r0, r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            goto L2d
        L44:
            r1 = r5
            goto L64
        L46:
            r5 = move-exception
            r0 = r5
            goto L64
        L49:
            r5 = move-exception
            r0 = r5
            r5 = r1
        L4c:
            com.google.android.gms.measurement.internal.zzic r2 = r4.zzu     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.measurement.internal.zzgu r2 = r2.zzaV()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.measurement.internal.zzgs r2 = r2.zzb()     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = "Error querying database."
            r2.zzb(r3, r0)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L5e
            goto L2d
        L5e:
            if (r1 != 0) goto L63
            com.google.android.gms.measurement.internal.zzjl r5 = com.google.android.gms.measurement.internal.zzjl.zza
            return r5
        L63:
            return r1
        L64:
            if (r1 == 0) goto L69
            r1.close()
        L69:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzX(java.lang.String):com.google.android.gms.measurement.internal.zzjl");
    }

    public final boolean zzY(String str, zzoh zzohVar) {
        zzg();
        zzaw();
        Preconditions.checkNotNull(zzohVar);
        Preconditions.checkNotEmpty(str);
        zzic zzicVar = this.zzu;
        long jCurrentTimeMillis = zzicVar.zzaZ().currentTimeMillis();
        zzfx zzfxVar = zzfy.zzav;
        long jLongValue = jCurrentTimeMillis - ((Long) zzfxVar.zzb(null)).longValue();
        long j10 = zzohVar.zzb;
        if (j10 < jLongValue || j10 > ((Long) zzfxVar.zzb(null)).longValue() + jCurrentTimeMillis) {
            zzicVar.zzaV().zze().zzd("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzgu.zzl(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j10));
        }
        zzicVar.zzaV().zzk().zza("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzohVar.zza);
        contentValues.put("source", Integer.valueOf(zzohVar.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(j10));
        try {
            if (zze().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            zzicVar.zzaV().zzb().zzb("Failed to insert trigger URI (got -1). appId", zzgu.zzl(str));
            return false;
        } catch (SQLiteException e10) {
            this.zzu.zzaV().zzb().zzc("Error storing trigger URI. appId", zzgu.zzl(str), e10);
            return false;
        }
    }

    public final void zzZ(String str, zzjl zzjlVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjlVar);
        zzg();
        zzaw();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzjlVar.zzl());
        contentValues.put("consent_source", Integer.valueOf(zzjlVar.zzb()));
        zzaB("consent_settings", "app_id", contentValues);
    }

    public final zzaz zzaa(String str) {
        Preconditions.checkNotNull(str);
        zzg();
        zzaw();
        return zzaz.zzg(zzaA("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final void zzab(String str, zzaz zzazVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzazVar);
        zzg();
        zzaw();
        zzjl zzjlVarZzX = zzX(str);
        zzjl zzjlVar = zzjl.zza;
        if (zzjlVarZzX == zzjlVar) {
            zzZ(str, zzjlVar);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", zzazVar.zze());
        zzaB("consent_settings", "app_id", contentValues);
    }

    public final void zzac(String str, zzjl zzjlVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjlVar);
        zzg();
        zzaw();
        zzZ(str, zzX(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", zzjlVar.zzl());
        zzaB("consent_settings", "app_id", contentValues);
    }

    public final zzjl zzad(String str) {
        Preconditions.checkNotNull(str);
        zzg();
        zzaw();
        return zzjl.zzf(zzaA("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""), 100);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x031c, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x031d, code lost:
    
        r12.put("filter_id", r0);
        r21 = r3;
        r12.put("property_name", r7.zzc());
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x032f, code lost:
    
        if (r7.zzg() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0331, code lost:
    
        r0 = java.lang.Boolean.valueOf(r7.zzh());
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x033a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x033b, code lost:
    
        r12.put("session_scoped", r0);
        r12.put("data", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x034d, code lost:
    
        if (zze().insertWithOnConflict("property_filters", null, r12, 5) != (-1)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x034f, code lost:
    
        r22.zzu.zzaV().zzb().zzb("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzgu.zzl(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0363, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0365, code lost:
    
        r0 = r19;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x036b, code lost:
    
        r22.zzu.zzaV().zzb().zzc("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x037e, code lost:
    
        zzaw();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r23);
        r0 = zze();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r23, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r23, java.lang.String.valueOf(r10)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03a1, code lost:
    
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0494, code lost:
    
        r20.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0497, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0176, code lost:
    
        r11 = r0.zzc().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0182, code lost:
    
        if (r11.hasNext() == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x018e, code lost:
    
        if (((com.google.android.gms.internal.measurement.zzfn) r11.next()).zza() != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0190, code lost:
    
        r22.zzu.zzaV().zze().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzgu.zzl(r23), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a9, code lost:
    
        r11 = r0.zzf().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b5, code lost:
    
        r19 = r0;
        r0 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c3, code lost:
    
        if (r11.hasNext() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c5, code lost:
    
        r12 = (com.google.android.gms.internal.measurement.zzff) r11.next();
        zzaw();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r23);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01df, code lost:
    
        if (r12.zzc().isEmpty() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e1, code lost:
    
        r0 = r22.zzu.zzaV().zze();
        r11 = com.google.android.gms.measurement.internal.zzgu.zzl(r23);
        r13 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f9, code lost:
    
        if (r12.zza() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01fb, code lost:
    
        r16 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0206, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0208, code lost:
    
        r0.zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r11, r13, java.lang.String.valueOf(r16));
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0213, code lost:
    
        r3 = r12.zzcc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0217, code lost:
    
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0219, code lost:
    
        r7 = new android.content.ContentValues();
        r7.put("app_id", r23);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x022c, code lost:
    
        if (r12.zza() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x022e, code lost:
    
        r0 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0237, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x023a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x023b, code lost:
    
        r7.put("filter_id", r0);
        r7.put("event_name", r12.zzc());
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x024b, code lost:
    
        if (r12.zzk() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x024d, code lost:
    
        r0 = java.lang.Boolean.valueOf(r12.zzm());
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0256, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0257, code lost:
    
        r7.put("session_scoped", r0);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0269, code lost:
    
        if (zze().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x026b, code lost:
    
        r22.zzu.zzaV().zzb().zzb("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzgu.zzl(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x027e, code lost:
    
        r0 = r19;
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0286, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0287, code lost:
    
        r22.zzu.zzaV().zzb().zzc("Error storing event filter. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x029c, code lost:
    
        r20 = r7;
        r3 = r19.zzc().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02aa, code lost:
    
        if (r3.hasNext() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02ac, code lost:
    
        r7 = (com.google.android.gms.internal.measurement.zzfn) r3.next();
        zzaw();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r23);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02c6, code lost:
    
        if (r7.zzc().isEmpty() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02c8, code lost:
    
        r0 = r22.zzu.zzaV().zze();
        r9 = com.google.android.gms.measurement.internal.zzgu.zzl(r23);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02e0, code lost:
    
        if (r7.zza() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02e2, code lost:
    
        r16 = java.lang.Integer.valueOf(r7.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02ed, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02ef, code lost:
    
        r0.zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02f8, code lost:
    
        r11 = r7.zzcc();
        r12 = new android.content.ContentValues();
        r12.put(r0, r23);
        r19 = r0;
        r12.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0311, code lost:
    
        if (r7.zza() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0313, code lost:
    
        r0 = java.lang.Integer.valueOf(r7.zzb());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzae(java.lang.String r23, java.util.List r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzae(java.lang.String, java.util.List):void");
    }

    public final zzbc zzaf(String str, com.google.android.gms.internal.measurement.zzhs zzhsVar, String str2) throws Throwable {
        zzbc zzbcVarZzaC = zzaC("events", str, zzhsVar.zzd());
        if (zzbcVarZzaC == null) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaV().zze().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzgu.zzl(str), zzicVar.zzl().zza(str2));
            return new zzbc(str, zzhsVar.zzd(), 1L, 1L, 1L, zzhsVar.zzf(), 0L, null, null, null, null);
        }
        long j10 = zzbcVarZzaC.zze + 1;
        long j11 = zzbcVarZzaC.zzd + 1;
        return new zzbc(zzbcVarZzaC.zza, zzbcVarZzaC.zzb, zzbcVarZzaC.zzc + 1, j11, j10, zzbcVarZzaC.zzf, zzbcVarZzaC.zzg, zzbcVarZzaC.zzh, zzbcVarZzaC.zzi, zzbcVarZzaC.zzj, zzbcVarZzaC.zzk);
    }

    public final boolean zzag() {
        zzic zzicVar = this.zzu;
        Context contextZzaY = zzicVar.zzaY();
        zzicVar.zzc();
        return contextZzaY.getDatabasePath("google_app_measurement.db").exists();
    }

    public final /* synthetic */ long zzah(String str, String[] strArr, long j10) {
        return zzaz("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", strArr, -1L);
    }

    public final /* synthetic */ zzog zzas() {
        return this.zzn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5 A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x0070, B:45:0x00ce, B:47:0x00f5, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0137, B:56:0x0151, B:68:0x0178, B:71:0x0180, B:77:0x01a0, B:61:0x0167, B:75:0x0192, B:76:0x019b, B:98:0x0221), top: B:112:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x0070, B:45:0x00ce, B:47:0x00f5, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0137, B:56:0x0151, B:68:0x0178, B:71:0x0180, B:77:0x01a0, B:61:0x0167, B:75:0x0192, B:76:0x019b, B:98:0x0221), top: B:112:0x0070 }] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzat(java.lang.String r20, long r21, long r23, com.google.android.gms.measurement.internal.zzpc r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzat(java.lang.String, long, long, com.google.android.gms.measurement.internal.zzpc):void");
    }

    public final void zzb() {
        zzaw();
        zze().beginTransaction();
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final boolean zzbb() {
        return false;
    }

    public final void zzc() {
        zzaw();
        zze().setTransactionSuccessful();
    }

    public final void zzd() {
        zzaw();
        zze().endTransaction();
    }

    public final SQLiteDatabase zze() {
        zzg();
        try {
            return this.zzm.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.zzu.zzaV().zze().zzb("Error opening database", e10);
            throw e10;
        }
    }

    public final zzbc zzf(String str, String str2) {
        return zzaC("events", str, str2);
    }

    public final void zzh(zzbc zzbcVar) {
        zzaD("events", zzbcVar);
    }

    public final void zzi(String str) {
        zzbc zzbcVarZzaC;
        zzaE("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = zze().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (zzbcVarZzaC = zzaC("events", str, string)) != null) {
                            zzaD("events_snapshot", zzbcVarZzaC);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e10) {
                this.zzu.zzaV().zzb().zzc("Error creating snapshot. appId", zzgu.zzl(str), e10);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzj(java.lang.String):void");
    }

    public final void zzk(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzaw();
        try {
            zze().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaV().zzb().zzd("Error deleting user property. appId", zzgu.zzl(str), zzicVar.zzl().zzc(str2), e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzpn zzm(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)
            r10.zzg()
            r10.zzaw()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.zze()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            java.lang.String r3 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            if (r0 != 0) goto L32
            goto L99
        L32:
            r0 = 0
            long r7 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            r0 = 1
            java.lang.Object r9 = r10.zzL(r2, r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            if (r9 != 0) goto L40
            goto L99
        L40:
            r0 = 2
            java.lang.String r5 = r2.getString(r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            com.google.android.gms.measurement.internal.zzpn r3 = new com.google.android.gms.measurement.internal.zzpn     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            boolean r11 = r2.moveToNext()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            if (r11 == 0) goto L6c
            com.google.android.gms.measurement.internal.zzic r11 = r10.zzu     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            com.google.android.gms.measurement.internal.zzgu r11 = r11.zzaV()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            com.google.android.gms.measurement.internal.zzgs r11 = r11.zzb()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            java.lang.String r12 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.zzgu.zzl(r4)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            r11.zzb(r12, r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            goto L6c
        L66:
            r0 = move-exception
            r11 = r0
            goto L74
        L69:
            r0 = move-exception
        L6a:
            r11 = r0
            goto L7e
        L6c:
            r2.close()
            return r3
        L70:
            r0 = move-exception
            r4 = r11
            r6 = r12
            goto L6a
        L74:
            r1 = r2
            goto L9f
        L76:
            r0 = move-exception
            r11 = r0
            goto L9f
        L79:
            r0 = move-exception
            r4 = r11
            r6 = r12
            r11 = r0
            r2 = r1
        L7e:
            com.google.android.gms.measurement.internal.zzic r12 = r10.zzu     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.measurement.internal.zzgu r0 = r12.zzaV()     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.measurement.internal.zzgs r0 = r0.zzb()     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzgu.zzl(r4)     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.measurement.internal.zzgn r12 = r12.zzl()     // Catch: java.lang.Throwable -> L66
            java.lang.String r12 = r12.zzc(r6)     // Catch: java.lang.Throwable -> L66
            r0.zzd(r3, r4, r12, r11)     // Catch: java.lang.Throwable -> L66
        L99:
            if (r2 == 0) goto L9e
            r2.close()
        L9e:
            return r1
        L9f:
            if (r1 == 0) goto La4
            r1.close()
        La4:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzm(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzpn");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzn(java.lang.String r13) {
        /*
            r12 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            r12.zzg()
            r12.zzaw()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r9 = "1000"
            r10 = 0
            android.database.sqlite.SQLiteDatabase r1 = r12.zze()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L85
            java.lang.String r2 = "user_attributes"
            java.lang.String r3 = "name"
            java.lang.String r4 = "origin"
            java.lang.String r5 = "set_timestamp"
            java.lang.String r6 = "value"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5, r6}     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L85
            java.lang.String r4 = "app_id=?"
            java.lang.String[] r5 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L85
            java.lang.String r8 = "rowid"
            com.google.android.gms.measurement.internal.zzic r11 = r12.zzu     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L85
            r11.zzc()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L85
            r6 = 0
            r7 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L85
            boolean r1 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            if (r1 == 0) goto L9d
        L3c:
            r1 = 0
            java.lang.String r5 = r10.getString(r1)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            r1 = 1
            java.lang.String r1 = r10.getString(r1)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            if (r1 != 0) goto L4a
            java.lang.String r1 = ""
        L4a:
            r4 = r1
            goto L52
        L4c:
            r0 = move-exception
            r13 = r0
            goto La3
        L4f:
            r0 = move-exception
            r3 = r13
            goto L88
        L52:
            r1 = 2
            long r6 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            r1 = 3
            java.lang.Object r8 = r12.zzL(r10, r1)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            if (r8 != 0) goto L71
            com.google.android.gms.measurement.internal.zzgu r1 = r11.zzaV()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            com.google.android.gms.measurement.internal.zzgs r1 = r1.zzb()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            java.lang.String r2 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzgu.zzl(r13)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            r1.zzb(r2, r3)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            r3 = r13
            goto L7a
        L71:
            com.google.android.gms.measurement.internal.zzpn r2 = new com.google.android.gms.measurement.internal.zzpn     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            r3 = r13
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L83
            r0.add(r2)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L83
        L7a:
            boolean r13 = r10.moveToNext()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L83
            if (r13 != 0) goto L81
            goto L9d
        L81:
            r13 = r3
            goto L3c
        L83:
            r0 = move-exception
            goto L88
        L85:
            r0 = move-exception
            r3 = r13
            r13 = r0
        L88:
            com.google.android.gms.measurement.internal.zzic r13 = r12.zzu     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.measurement.internal.zzgu r13 = r13.zzaV()     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.measurement.internal.zzgs r13 = r13.zzb()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = "Error querying user properties. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzgu.zzl(r3)     // Catch: java.lang.Throwable -> L4c
            r13.zzc(r1, r2, r0)     // Catch: java.lang.Throwable -> L4c
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L4c
        L9d:
            if (r10 == 0) goto La2
            r10.close()
        La2:
            return r0
        La3:
            if (r10 == 0) goto La8
            r10.close()
        La8:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzn(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b6, code lost:
    
        r0 = r8.zzaV().zzb();
        r8.zzc();
        r0.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzo(java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzo(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final boolean zzp(zzah zzahVar) {
        Preconditions.checkNotNull(zzahVar);
        zzg();
        zzaw();
        String str = zzahVar.zza;
        Preconditions.checkNotNull(str);
        if (zzm(str, zzahVar.zzc.zzb) == null) {
            long jZzay = zzay("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzu.zzc();
            if (jZzay >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzahVar.zzb);
        contentValues.put("name", zzahVar.zzc.zzb);
        zzau(contentValues, "value", Preconditions.checkNotNull(zzahVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzahVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzahVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzahVar.zzh));
        zzic zzicVar = this.zzu;
        contentValues.put("timed_out_event", zzicVar.zzk().zzae(zzahVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzahVar.zzd));
        contentValues.put("triggered_event", zzicVar.zzk().zzae(zzahVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzahVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzahVar.zzj));
        contentValues.put("expired_event", zzicVar.zzk().zzae(zzahVar.zzk));
        try {
            if (zze().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            zzicVar.zzaV().zzb().zzb("Failed to insert/update conditional user property (got -1)", zzgu.zzl(str));
            return true;
        } catch (SQLiteException e10) {
            this.zzu.zzaV().zzb().zzc("Error storing conditional user property", zzgu.zzl(str), e10);
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00f6: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:247), block:B:29:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzah zzq(java.lang.String r26, java.lang.String r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzq(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzah");
    }

    public final int zzr(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzaw();
        try {
            return zze().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaV().zzb().zzd("Error deleting conditional property", zzgu.zzl(str), zzicVar.zzl().zzc(str2), e10);
            return 0;
        }
    }

    public final List zzs(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzaw();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return zzt(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void zzv(zzh zzhVar, boolean z10, boolean z11) {
        Preconditions.checkNotNull(zzhVar);
        zzg();
        zzaw();
        String strZzc = zzhVar.zzc();
        Preconditions.checkNotNull(strZzc);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strZzc);
        if (z10) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.zzg.zzB(strZzc).zzo(zzjk.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", zzhVar.zzd());
        }
        contentValues.put("gmp_app_id", zzhVar.zzf());
        zzpg zzpgVar = this.zzg;
        if (zzpgVar.zzB(strZzc).zzo(zzjk.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", zzhVar.zzj());
        }
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.zzG()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.zzn()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.zzp()));
        contentValues.put("app_version", zzhVar.zzr());
        contentValues.put("app_store", zzhVar.zzv());
        contentValues.put("gmp_version", Long.valueOf(zzhVar.zzx()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzhVar.zzz()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.zzD()));
        contentValues.put("day", Long.valueOf(zzhVar.zzN()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.zzP()));
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.zzR()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.zzT()));
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.zzH()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.zzJ()));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.zzt()));
        contentValues.put("firebase_instance_id", zzhVar.zzl());
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.zzX()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.zzV()));
        contentValues.put("health_monitor_sample", zzhVar.zzZ());
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.zzac()));
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.zzB()));
        if (zzpgVar.zzB(strZzc).zzo(zzjk.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", zzhVar.zzh());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzhVar.zzai()));
        contentValues.put("target_os_version", Long.valueOf(zzhVar.zzak()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(zzhVar.zzam()));
        zzqp.zza();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzc().zzp(strZzc, zzfy.zzaP)) {
            contentValues.put("ad_services_version", Integer.valueOf(zzhVar.zzao()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(zzhVar.zzaw()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(zzhVar.zzaq()));
        contentValues.put("npa_metadata_value", zzhVar.zzae());
        contentValues.put("bundle_delivery_index", Long.valueOf(zzhVar.zzaF()));
        contentValues.put("sgtm_preview_key", zzhVar.zzay());
        contentValues.put("dma_consent_state", Integer.valueOf(zzhVar.zzaA()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(zzhVar.zzaC()));
        contentValues.put("serialized_npa_metadata", zzhVar.zzaH());
        contentValues.put("client_upload_eligibility", Integer.valueOf(zzhVar.zzaL()));
        List listZzag = zzhVar.zzag();
        if (listZzag != null) {
            if (listZzag.isEmpty()) {
                zzicVar.zzaV().zze().zzb("Safelisted events should not be an empty list. appId", strZzc);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listZzag));
            }
        }
        zzpr.zza();
        if (zzicVar.zzc().zzp(null, zzfy.zzaK) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", zzhVar.zzas());
        contentValues.put("unmatched_uwa", zzhVar.zzau());
        contentValues.put("ad_campaign_info", zzhVar.zzaJ());
        try {
            SQLiteDatabase sQLiteDatabaseZze = zze();
            if (sQLiteDatabaseZze.update("apps", contentValues, "app_id = ?", new String[]{strZzc}) == 0 && sQLiteDatabaseZze.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzicVar.zzaV().zzb().zzb("Failed to insert/update app (got -1). appId", zzgu.zzl(strZzc));
            }
        } catch (SQLiteException e10) {
            this.zzu.zzaV().zzb().zzc("Error storing app. appId", zzgu.zzl(strZzc), e10);
        }
    }

    public final zzar zzw(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        return zzx(j10, str, 1L, false, false, z12, false, z14, z15, z16);
    }

    public final zzar zzx(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzaw();
        String[] strArr = {str};
        zzar zzarVar = new zzar();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseZze = zze();
                cursorQuery = sQLiteDatabaseZze.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j10) {
                        zzarVar.zzb = cursorQuery.getLong(1);
                        zzarVar.zza = cursorQuery.getLong(2);
                        zzarVar.zzc = cursorQuery.getLong(3);
                        zzarVar.zzd = cursorQuery.getLong(4);
                        zzarVar.zze = cursorQuery.getLong(5);
                        zzarVar.zzf = cursorQuery.getLong(6);
                        zzarVar.zzg = cursorQuery.getLong(7);
                    }
                    if (z10) {
                        zzarVar.zzb += j11;
                    }
                    if (z11) {
                        zzarVar.zza += j11;
                    }
                    if (z12) {
                        zzarVar.zzc += j11;
                    }
                    if (z13) {
                        zzarVar.zzd += j11;
                    }
                    if (z14) {
                        zzarVar.zze += j11;
                    }
                    if (z15) {
                        zzarVar.zzf += j11;
                    }
                    if (z16) {
                        zzarVar.zzg += j11;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j10));
                    contentValues.put("daily_public_events_count", Long.valueOf(zzarVar.zza));
                    contentValues.put("daily_events_count", Long.valueOf(zzarVar.zzb));
                    contentValues.put("daily_conversions_count", Long.valueOf(zzarVar.zzc));
                    contentValues.put("daily_error_events_count", Long.valueOf(zzarVar.zzd));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(zzarVar.zze));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(zzarVar.zzf));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(zzarVar.zzg));
                    sQLiteDatabaseZze.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    this.zzu.zzaV().zze().zzb("Not updating daily counts, app is not known. appId", zzgu.zzl(str));
                }
            } catch (SQLiteException e10) {
                this.zzu.zzaV().zzb().zzc("Error updating daily counts. appId", zzgu.zzl(str), e10);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return zzarVar;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzaq zzy(java.lang.String r11) throws java.lang.Throwable {
        /*
            r10 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)
            r10.zzg()
            r10.zzaw()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.zze()     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L6d
            java.lang.String r3 = "apps"
            java.lang.String r0 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L6d
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L6d
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L6d
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            if (r0 != 0) goto L2e
            goto L82
        L2e:
            r0 = 0
            byte[] r0 = r2.getBlob(r0)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r3 = 1
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r4 = 2
            java.lang.String r4 = r2.getString(r4)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            boolean r5 = r2.moveToNext()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            if (r5 == 0) goto L5c
            com.google.android.gms.measurement.internal.zzic r5 = r10.zzu     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            com.google.android.gms.measurement.internal.zzgu r5 = r5.zzaV()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            com.google.android.gms.measurement.internal.zzgs r5 = r5.zzb()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzgu.zzl(r11)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r5.zzb(r6, r7)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            goto L5c
        L57:
            r0 = move-exception
            r11 = r0
            goto L68
        L5a:
            r0 = move-exception
            goto L6f
        L5c:
            if (r0 != 0) goto L5f
            goto L82
        L5f:
            com.google.android.gms.measurement.internal.zzaq r5 = new com.google.android.gms.measurement.internal.zzaq     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r5.<init>(r0, r3, r4)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r2.close()
            return r5
        L68:
            r1 = r2
            goto L88
        L6a:
            r0 = move-exception
            r11 = r0
            goto L88
        L6d:
            r0 = move-exception
            r2 = r1
        L6f:
            com.google.android.gms.measurement.internal.zzic r3 = r10.zzu     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.zzgu r3 = r3.zzaV()     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.zzgs r3 = r3.zzb()     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzgu.zzl(r11)     // Catch: java.lang.Throwable -> L57
            r3.zzc(r4, r11, r0)     // Catch: java.lang.Throwable -> L57
        L82:
            if (r2 == 0) goto L87
            r2.close()
        L87:
            return r1
        L88:
            if (r1 == 0) goto L8d
            r1.close()
        L8d:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzy(java.lang.String):com.google.android.gms.measurement.internal.zzaq");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzz(com.google.android.gms.internal.measurement.zzid r8, boolean r9) {
        /*
            r7 = this;
            r7.zzg()
            r7.zzaw()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            java.lang.String r0 = r8.zzA()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            boolean r0 = r8.zzn()
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            r7.zzI()
            com.google.android.gms.measurement.internal.zzic r0 = r7.zzu
            com.google.android.gms.common.util.Clock r1 = r0.zzaZ()
            long r1 = r1.currentTimeMillis()
            long r3 = r8.zzo()
            r0.zzc()
            long r5 = com.google.android.gms.measurement.internal.zzal.zzI()
            long r5 = r1 - r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L45
            long r3 = r8.zzo()
            r0.zzc()
            long r5 = com.google.android.gms.measurement.internal.zzal.zzI()
            long r5 = r5 + r1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L66
        L45:
            com.google.android.gms.measurement.internal.zzgu r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgs r0 = r0.zze()
            java.lang.String r3 = r8.zzA()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzgu.zzl(r3)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r4 = r8.zzo()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            r0.zzd(r4, r3, r1, r2)
        L66:
            byte[] r0 = r8.zzcc()
            r1 = 0
            com.google.android.gms.measurement.internal.zzpg r2 = r7.zzg     // Catch: java.io.IOException -> L108
            com.google.android.gms.measurement.internal.zzpk r2 = r2.zzp()     // Catch: java.io.IOException -> L108
            byte[] r0 = r2.zzv(r0)     // Catch: java.io.IOException -> L108
            com.google.android.gms.measurement.internal.zzic r2 = r7.zzu
            com.google.android.gms.measurement.internal.zzgu r3 = r2.zzaV()
            com.google.android.gms.measurement.internal.zzgs r3 = r3.zzk()
            int r4 = r0.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Saving bundle, size"
            r3.zzb(r5, r4)
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r4 = r8.zzA()
            java.lang.String r5 = "app_id"
            r3.put(r5, r4)
            long r4 = r8.zzo()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "bundle_end_timestamp"
            r3.put(r5, r4)
            java.lang.String r4 = "data"
            r3.put(r4, r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = "has_realtime"
            r3.put(r0, r9)
            boolean r9 = r8.zzaa()
            if (r9 == 0) goto Lc5
            int r9 = r8.zzab()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = "retry_count"
            r3.put(r0, r9)
        Lc5:
            android.database.sqlite.SQLiteDatabase r9 = r7.zze()     // Catch: android.database.sqlite.SQLiteException -> Lec
            java.lang.String r0 = "queue"
            r4 = 0
            long r3 = r9.insert(r0, r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lec
            r5 = -1
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 != 0) goto Lee
            com.google.android.gms.measurement.internal.zzgu r9 = r2.zzaV()     // Catch: android.database.sqlite.SQLiteException -> Lec
            com.google.android.gms.measurement.internal.zzgs r9 = r9.zzb()     // Catch: android.database.sqlite.SQLiteException -> Lec
            java.lang.String r0 = "Failed to insert bundle (got -1). appId"
            java.lang.String r2 = r8.zzA()     // Catch: android.database.sqlite.SQLiteException -> Lec
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzgu.zzl(r2)     // Catch: android.database.sqlite.SQLiteException -> Lec
            r9.zzb(r0, r2)     // Catch: android.database.sqlite.SQLiteException -> Lec
            return r1
        Lec:
            r9 = move-exception
            goto Lf0
        Lee:
            r8 = 1
            return r8
        Lf0:
            com.google.android.gms.measurement.internal.zzic r0 = r7.zzu
            com.google.android.gms.measurement.internal.zzgu r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgs r0 = r0.zzb()
            java.lang.String r8 = r8.zzA()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzgu.zzl(r8)
            java.lang.String r2 = "Error storing bundle. appId"
            r0.zzc(r2, r8, r9)
            return r1
        L108:
            r9 = move-exception
            com.google.android.gms.measurement.internal.zzic r0 = r7.zzu
            com.google.android.gms.measurement.internal.zzgu r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgs r0 = r0.zzb()
            java.lang.String r8 = r8.zzA()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzgu.zzl(r8)
            java.lang.String r2 = "Data loss. Failed to serialize bundle. appId"
            r0.zzc(r2, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzz(com.google.android.gms.internal.measurement.zzid, boolean):boolean");
    }

    private final zzpj zzaF(String str, long j10, byte[] bArr, String str2, String str3, int i10, int i11, long j11, long j12, long j13) {
        if (TextUtils.isEmpty(str2)) {
            this.zzu.zzaV().zzj().zza("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzpk.zzw(com.google.android.gms.internal.measurement.zzib.zzh(), bArr);
            zzls zzlsVarZzb = zzls.zzb(i10);
            if (zzlsVarZzb != zzls.GOOGLE_SIGNAL && zzlsVarZzb != zzls.GOOGLE_SIGNAL_PENDING && i11 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = zzhzVar.zza().iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.zzic zzicVar = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) it.next()).zzcl();
                    zzicVar.zzao(i11);
                    arrayList.add((com.google.android.gms.internal.measurement.zzid) zzicVar.zzbc());
                }
                zzhzVar.zzg();
                zzhzVar.zzf(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                String[] strArrSplit = str3.split(wHkgq.MzXqrU);
                int length = strArrSplit.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        break;
                    }
                    String str4 = strArrSplit[i12];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit2 = str4.split(C3191e4.i.f36525b, 2);
                    if (strArrSplit2.length != 2) {
                        this.zzu.zzaV().zzb().zzb("Invalid upload header: ", str4);
                        break;
                    }
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                    i12++;
                }
            }
            zzpi zzpiVar = new zzpi();
            zzpiVar.zzb(j10);
            zzpiVar.zzc((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc());
            zzpiVar.zzd(str2);
            zzpiVar.zze(map);
            zzpiVar.zzf(zzlsVarZzb);
            zzpiVar.zzg(j11);
            zzpiVar.zzh(j12);
            zzpiVar.zzi(j13);
            zzpiVar.zzj(i11);
            return zzpiVar.zza();
        } catch (IOException e10) {
            this.zzu.zzaV().zzb().zzc("Failed to queued MeasurementBatch from upload_queue. appId", str, e10);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
    
        r2 = r12.zzaV().zzb();
        r12.zzc();
        r2.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzt(java.lang.String r29, java.lang.String[] r30) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzt(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x02e7: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:742), block:B:83:0x02e7 */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0308  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzh zzu(java.lang.String r52) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzu(java.lang.String):com.google.android.gms.measurement.internal.zzh");
    }

    private final void zzaD(String str, zzbc zzbcVar) {
        Long l9;
        Preconditions.checkNotNull(zzbcVar);
        zzg();
        zzaw();
        ContentValues contentValues = new ContentValues();
        String str2 = zzbcVar.zza;
        contentValues.put("app_id", str2);
        contentValues.put("name", zzbcVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzbcVar.zzc));
        contentValues.put(RnJusJ.JBwYTyrgnvAL, Long.valueOf(zzbcVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzbcVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzbcVar.zzg));
        contentValues.put("last_bundled_day", zzbcVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzbcVar.zzi);
        contentValues.put("last_sampling_rate", zzbcVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzbcVar.zze));
        Boolean bool = zzbcVar.zzk;
        if (bool != null && bool.booleanValue()) {
            l9 = 1L;
        } else {
            l9 = null;
        }
        contentValues.put("last_exempt_from_sampling", l9);
        try {
            if (zze().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                this.zzu.zzaV().zzb().zzb("Failed to insert/update event aggregates (got -1). appId", zzgu.zzl(str2));
            }
        } catch (SQLiteException e10) {
            this.zzu.zzaV().zzb().zzc("Error storing event aggregates. appId", zzgu.zzl(zzbcVar.zza), e10);
        }
    }

    private static final String zzaH(List list) {
        if (list.isEmpty()) {
            return "";
        }
        return b.l(rJqlArycrfkilN.fthdUnGgC, TextUtils.join(", ", list), "))");
    }

    public final boolean zzl(zzpn zzpnVar) {
        Preconditions.checkNotNull(zzpnVar);
        zzg();
        zzaw();
        String str = zzpnVar.zza;
        String str2 = zzpnVar.zzc;
        if (zzm(str, str2) == null) {
            if (zzpp.zzh(str2)) {
                if (zzay("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= this.zzu.zzc().zzn(str, zzfy.zzV, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long jZzay = zzay("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, zzpnVar.zzb});
                this.zzu.zzc();
                if (jZzay >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzpnVar.zzb);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(zzpnVar.zzd));
        zzau(contentValues, "value", zzpnVar.zze);
        try {
            if (zze().insertWithOnConflict(JzVV.NAjYtuxVvyHKFwK, null, contentValues, 5) == -1) {
                this.zzu.zzaV().zzb().zzb("Failed to insert/update user property (got -1). appId", zzgu.zzl(str));
                return true;
            }
            return true;
        } catch (SQLiteException e10) {
            this.zzu.zzaV().zzb().zzc("Error storing user property. appId", zzgu.zzl(zzpnVar.zza), e10);
            return true;
        }
    }
}
