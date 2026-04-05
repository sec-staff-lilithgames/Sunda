package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbdz;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzefm {
    private final zzbdt zza;
    private final Context zzb;
    private final zzeer zzc;
    private final VersionInfoParcel zzd;

    public zzefm(Context context, VersionInfoParcel versionInfoParcel, zzbdt zzbdtVar, zzeer zzeerVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbdtVar;
        this.zzc = zzeerVar;
    }

    public final void zza(final boolean z10) {
        try {
            this.zzc.zza(new zzfjx() { // from class: com.google.android.gms.internal.ads.zzefl
                @Override // com.google.android.gms.internal.ads.zzfjx
                public final /* synthetic */ Object zza(Object obj) {
                    this.zza.zzb(z10, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in offline signals database startup: ".concat(strValueOf));
        }
    }

    public final /* synthetic */ Void zzb(boolean z10, SQLiteDatabase sQLiteDatabase) {
        if (z10) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(zzbdz.zzaf.zza.zzk(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzhxd e10) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(e10.getMessage());
                }
            }
            cursorQuery.close();
            Context context = this.zzb;
            zzbdz.zzaf.zzc zzcVarZzB = zzbdz.zzaf.zzB();
            zzcVarZzB.zzB(context.getPackageName());
            zzcVarZzB.zzH(Build.MODEL);
            zzcVarZzB.zzo(zzefg.zzc(sQLiteDatabase, 0));
            zzcVarZzB.zzj(arrayList);
            zzcVarZzB.zzs(zzefg.zzc(sQLiteDatabase, 1));
            zzcVarZzB.zzQ(zzefg.zzc(sQLiteDatabase, 3));
            zzcVarZzB.zzw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
            zzcVarZzB.zzM(zzefg.zzd(sQLiteDatabase, 2));
            final zzbdz.zzaf zzafVarZzbu = zzcVarZzB.zzbu();
            int size = arrayList.size();
            long jZzb = 0;
            for (int i11 = 0; i11 < size; i11++) {
                zzbdz.zzaf.zza zzaVar = (zzbdz.zzaf.zza) arrayList.get(i11);
                if (zzaVar.zzf() == zzbdz.zzq.ENUM_TRUE && zzaVar.zzb() > jZzb) {
                    jZzb = zzaVar.zzb();
                }
            }
            if (jZzb != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(jZzb));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            zzbdt zzbdtVar = this.zza;
            zzbdtVar.zzb(new zzbds() { // from class: com.google.android.gms.internal.ads.zzefj
                @Override // com.google.android.gms.internal.ads.zzbds
                public final /* synthetic */ void zza(zzbdz.zzt.zza zzaVar2) {
                    zzaVar2.zzaf(zzafVarZzbu);
                }
            });
            VersionInfoParcel versionInfoParcel = this.zzd;
            zzbdz.zzar.zza zzaVarZzs = zzbdz.zzar.zzs();
            zzaVarZzs.zzc(versionInfoParcel.buddyApkVersion);
            zzaVarZzs.zzg(versionInfoParcel.clientJarVersion);
            zzaVarZzs.zzk(true == versionInfoParcel.isClientJar ? 0 : 2);
            final zzbdz.zzar zzarVarZzbu = zzaVarZzs.zzbu();
            zzbdtVar.zzb(new zzbds() { // from class: com.google.android.gms.internal.ads.zzefk
                @Override // com.google.android.gms.internal.ads.zzbds
                public final /* synthetic */ void zza(zzbdz.zzt.zza zzaVar2) {
                    zzbdz.zzm.zza zzaVarZzcc = zzaVar2.zzG().zzcc();
                    zzaVarZzcc.zzs(zzarVarZzbu);
                    zzaVar2.zzI(zzaVarZzcc);
                }
            });
            zzbdtVar.zzc(10004);
            zzefg.zzb(sQLiteDatabase);
        }
        return null;
    }
}
