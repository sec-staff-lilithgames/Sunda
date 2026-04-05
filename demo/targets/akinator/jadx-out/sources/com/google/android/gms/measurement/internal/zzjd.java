package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzjd extends zzga {
    private final zzpg zza;
    private Boolean zzb;
    private String zzc;

    public zzjd(zzpg zzpgVar, String str) {
        Preconditions.checkNotNull(zzpgVar);
        this.zza = zzpgVar;
        this.zzc = null;
    }

    private final void zzM(zzbg zzbgVar, zzr zzrVar) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzZ();
        zzpgVar.zzF(zzbgVar, zzrVar);
    }

    private final void zzN(zzr zzrVar, boolean z10) {
        Preconditions.checkNotNull(zzrVar);
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzO(str, false);
        this.zza.zzt().zzA(zzrVar.zzb);
    }

    private final void zzO(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            this.zza.zzaV().zzb().zza("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.zzb == null) {
                    boolean z11 = true;
                    if (!"com.google.android.gms".equals(this.zzc)) {
                        zzpg zzpgVar = this.zza;
                        if (!UidVerifier.isGooglePlayServicesUid(zzpgVar.zzaY(), Binder.getCallingUid()) && !GoogleSignatureVerifier.getInstance(zzpgVar.zzaY()).isUidGoogleSigned(Binder.getCallingUid())) {
                            z11 = false;
                        }
                    }
                    this.zzb = Boolean.valueOf(z11);
                }
                if (this.zzb.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                this.zza.zzaV().zzb().zzb("Measurement Service called with invalid calling package. appId", zzgu.zzl(str));
                throw e10;
            }
        }
        if (this.zzc == null && GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zzaY(), Binder.getCallingUid(), str)) {
            this.zzc = str;
        }
        if (str.equals(this.zzc)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzA(zzr zzrVar) throws IllegalStateException {
        zzN(zzrVar, false);
        zzd(new zzif(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzB(zzr zzrVar, final zzoo zzooVar, final zzgh zzghVar) throws IllegalStateException {
        zzN(zzrVar, false);
        final String str = (String) Preconditions.checkNotNull(zzrVar.zza);
        this.zza.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zziz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzI(str, zzooVar, zzghVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzC(final zzr zzrVar, final zzaf zzafVar) throws IllegalStateException {
        zzN(zzrVar, false);
        zzd(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzja
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzJ(zzrVar, zzafVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzD(final zzr zzrVar, final Bundle bundle, final zzge zzgeVar) throws IllegalStateException {
        zzN(zzrVar, false);
        final String str = (String) Preconditions.checkNotNull(zzrVar.zza);
        this.zza.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zziy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH(zzrVar, bundle, zzgeVar, str);
            }
        });
    }

    public final void zzE(Runnable runnable) throws IllegalStateException {
        Preconditions.checkNotNull(runnable);
        zzpg zzpgVar = this.zza;
        if (zzpgVar.zzaW().zze()) {
            runnable.run();
        } else {
            zzpgVar.zzaW().zzl(runnable);
        }
    }

    public final /* synthetic */ void zzF(zzr zzrVar) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzZ();
        zzpgVar.zzv(zzrVar);
    }

    public final /* synthetic */ void zzG(zzr zzrVar) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzZ();
        zzpgVar.zzw(zzrVar);
    }

    public final /* synthetic */ void zzH(zzr zzrVar, Bundle bundle, zzge zzgeVar, String str) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzZ();
        try {
            zzgeVar.zze(zzpgVar.zzaq(zzrVar, bundle));
        } catch (RemoteException e10) {
            this.zza.zzaV().zzb().zzc("Failed to return trigger URIs for app", str, e10);
        }
    }

    public final /* synthetic */ void zzI(String str, zzoo zzooVar, zzgh zzghVar) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzZ();
        zzpgVar.zzaW().zzg();
        zzpgVar.zzu();
        List<zzpj> listZzC = zzpgVar.zzj().zzC(str, zzooVar, ((Integer) zzfy.zzA.zzb(null)).intValue());
        ArrayList arrayList = new ArrayList();
        for (zzpj zzpjVar : listZzC) {
            if (zzpgVar.zzO(str, zzpjVar.zze())) {
                int iZzi = zzpjVar.zzi();
                if (iZzi > 0) {
                    if (iZzi <= ((Integer) zzfy.zzy.zzb(null)).intValue()) {
                        if (zzpgVar.zzaZ().currentTimeMillis() >= zzpjVar.zzh() + Math.min(((Long) zzfy.zzw.zzb(null)).longValue() * (1 << (iZzi - 1)), ((Long) zzfy.zzx.zzb(null)).longValue())) {
                        }
                    }
                    zzpgVar.zzaV().zzk().zzd("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(zzpjVar.zzc()), Long.valueOf(zzpjVar.zzh()));
                }
                zzom zzomVarZzb = zzpjVar.zzb();
                try {
                    com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzpk.zzw(com.google.android.gms.internal.measurement.zzib.zzh(), zzomVarZzb.zzb);
                    for (int i10 = 0; i10 < zzhzVar.zzb(); i10++) {
                        com.google.android.gms.internal.measurement.zzic zzicVar = (com.google.android.gms.internal.measurement.zzic) zzhzVar.zzc(i10).zzcl();
                        zzicVar.zzs(zzpgVar.zzaZ().currentTimeMillis());
                        zzhzVar.zzd(i10, zzicVar);
                    }
                    zzomVarZzb.zzb = ((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc()).zzcc();
                    if (Log.isLoggable(zzpgVar.zzaV().zzn(), 2)) {
                        zzomVarZzb.zzg = zzpgVar.zzp().zzi((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc());
                    }
                    arrayList.add(zzomVarZzb);
                } catch (com.google.android.gms.internal.measurement.zzmr unused) {
                    zzpgVar.zzaV().zze().zzb("Failed to parse queued batch. appId", str);
                }
            } else {
                zzpgVar.zzaV().zzk().zzd("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(zzpjVar.zzc()), zzpjVar.zze());
            }
        }
        zzoq zzoqVar = new zzoq(arrayList);
        try {
            zzghVar.zze(zzoqVar);
            this.zza.zzaV().zzk().zzc("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(zzoqVar.zza.size()));
        } catch (RemoteException e10) {
            this.zza.zzaV().zzb().zzc("[sgtm] Failed to return upload batches for app", str, e10);
        }
    }

    public final /* synthetic */ void zzJ(zzr zzrVar, zzaf zzafVar) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzZ();
        zzpgVar.zzar((String) Preconditions.checkNotNull(zzrVar.zza), zzafVar);
    }

    public final /* synthetic */ void zzK(Bundle bundle, String str, zzr zzrVar) throws SQLException {
        zzpg zzpgVar = this.zza;
        boolean zZzp = zzpgVar.zzd().zzp(null, zzfy.zzaV);
        if (bundle.isEmpty() && zZzp) {
            zzav zzavVarZzj = this.zza.zzj();
            zzavVarZzj.zzg();
            zzavVarZzj.zzaw();
            try {
                zzavVarZzj.zze().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                return;
            } catch (SQLiteException e10) {
                zzavVarZzj.zzu.zzaV().zzb().zzb("Error clearing default event params", e10);
                return;
            }
        }
        zzav zzavVarZzj2 = zzpgVar.zzj();
        zzavVarZzj2.zzg();
        zzavVarZzj2.zzaw();
        byte[] bArrZzcc = zzavVarZzj2.zzg.zzp().zzh(new zzbb(zzavVarZzj2.zzu, "", str, "dep", 0L, 0L, bundle)).zzcc();
        zzic zzicVar = zzavVarZzj2.zzu;
        zzicVar.zzaV().zzk().zzc("Saving default event parameters, appId, data size", str, Integer.valueOf(bArrZzcc.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrZzcc);
        try {
            if (zzavVarZzj2.zze().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                zzicVar.zzaV().zzb().zzb("Failed to insert default event parameters (got -1). appId", zzgu.zzl(str));
            }
        } catch (SQLiteException e11) {
            zzavVarZzj2.zzu.zzaV().zzb().zzc("Error storing default event parameters. appId", zzgu.zzl(str), e11);
        }
        zzpg zzpgVar2 = this.zza;
        zzav zzavVarZzj3 = zzpgVar2.zzj();
        long j10 = zzrVar.zzD;
        if (zzavVarZzj3.zzV(str, j10)) {
            zzpgVar2.zzj().zzW(str, Long.valueOf(j10), null, bundle);
        }
    }

    public final /* synthetic */ zzpg zzL() {
        return this.zza;
    }

    public final void zzb(zzbg zzbgVar, zzr zzrVar) {
        zzpg zzpgVar = this.zza;
        zzht zzhtVarZzh = zzpgVar.zzh();
        String str = zzrVar.zza;
        com.google.android.gms.internal.measurement.zzc zzcVar = TextUtils.isEmpty(str) ? null : (com.google.android.gms.internal.measurement.zzc) zzhtVarZzh.zzd.get(str);
        if (zzcVar == null) {
            this.zza.zzaV().zzk().zzb("EES not loaded for", zzrVar.zza);
            zzM(zzbgVar, zzrVar);
            return;
        }
        try {
            Map mapZzz = zzpgVar.zzp().zzz(zzbgVar.zzb.zzf(), true);
            String str2 = zzbgVar.zza;
            String strZza = zzjm.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            if (zzcVar.zzb(new com.google.android.gms.internal.measurement.zzaa(str2, zzbgVar.zzd, mapZzz))) {
                if (zzcVar.zzc()) {
                    zzpg zzpgVar2 = this.zza;
                    zzpgVar2.zzaV().zzk().zzb("EES edited event", zzbgVar.zza);
                    zzM(zzpgVar2.zzp().zzA(zzcVar.zze().zzc()), zzrVar);
                } else {
                    zzM(zzbgVar, zzrVar);
                }
                if (zzcVar.zzd()) {
                    for (com.google.android.gms.internal.measurement.zzaa zzaaVar : zzcVar.zze().zzf()) {
                        zzpg zzpgVar3 = this.zza;
                        zzpgVar3.zzaV().zzk().zzb("EES logging created event", zzaaVar.zzb());
                        zzM(zzpgVar3.zzp().zzA(zzaaVar), zzrVar);
                    }
                    return;
                }
                return;
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zza.zzaV().zzb().zzc("EES error. appId, eventName", zzrVar.zzb, zzbgVar.zza);
        }
        this.zza.zzaV().zzk().zzb("EES was not applied to event", zzbgVar.zza);
        zzM(zzbgVar, zzrVar);
    }

    public final zzbg zzc(zzbg zzbgVar, zzr zzrVar) {
        zzbe zzbeVar;
        if ("_cmp".equals(zzbgVar.zza) && (zzbeVar = zzbgVar.zzb) != null && zzbeVar.zze() != 0) {
            String strZzd = zzbeVar.zzd("_cis");
            if ("referrer broadcast".equals(strZzd) || "referrer API".equals(strZzd)) {
                this.zza.zzaV().zzi().zzb("Event has been filtered ", zzbgVar.toString());
                return new zzbg("_cmpx", zzbeVar, zzbgVar.zzc, zzbgVar.zzd);
            }
        }
        return zzbgVar;
    }

    public final void zzd(Runnable runnable) throws IllegalStateException {
        Preconditions.checkNotNull(runnable);
        zzpg zzpgVar = this.zza;
        if (zzpgVar.zzaW().zze()) {
            runnable.run();
        } else {
            zzpgVar.zzaW().zzj(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zze(zzbg zzbgVar, zzr zzrVar) throws IllegalStateException {
        Preconditions.checkNotNull(zzbgVar);
        zzN(zzrVar, false);
        zzd(new zzir(this, zzbgVar, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzf(zzpl zzplVar, zzr zzrVar) throws IllegalStateException {
        Preconditions.checkNotNull(zzplVar);
        zzN(zzrVar, false);
        zzd(new zziu(this, zzplVar, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzg(zzr zzrVar) throws IllegalStateException {
        zzN(zzrVar, false);
        zzd(new zzie(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzh(zzbg zzbgVar, String str, String str2) throws IllegalStateException {
        Preconditions.checkNotNull(zzbgVar);
        Preconditions.checkNotEmpty(str);
        zzO(str, true);
        zzd(new zzis(this, zzbgVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzi(zzr zzrVar) throws IllegalStateException {
        zzN(zzrVar, false);
        zzd(new zzin(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzj(zzr zzrVar, boolean z10) {
        zzN(zzrVar, false);
        String str = zzrVar.zza;
        Preconditions.checkNotNull(str);
        try {
            List<zzpn> list = (List) this.zza.zzaW().zzh(new zzid(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzpn zzpnVar : list) {
                if (z10 || !zzpp.zzZ(zzpnVar.zzc)) {
                    arrayList.add(new zzpl(zzpnVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.zza.zzaV().zzb().zzc("Failed to get user properties. appId", zzgu.zzl(zzrVar.zza), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            this.zza.zzaV().zzb().zzc("Failed to get user properties. appId", zzgu.zzl(zzrVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final byte[] zzk(zzbg zzbgVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbgVar);
        zzO(str, true);
        zzpg zzpgVar = this.zza;
        zzgs zzgsVarZzj = zzpgVar.zzaV().zzj();
        zzgn zzgnVarZzs = zzpgVar.zzs();
        String str2 = zzbgVar.zza;
        zzgsVarZzj.zzb("Log and bundle. event", zzgnVarZzs.zza(str2));
        long jNanoTime = zzpgVar.zzaZ().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) zzpgVar.zzaW().zzi(new zzit(this, zzbgVar, str)).get();
            if (bArr == null) {
                zzpgVar.zzaV().zzb().zzb("Log and bundle returned null. appId", zzgu.zzl(str));
                bArr = new byte[0];
            }
            zzpgVar.zzaV().zzj().zzd("Log and bundle processed. event, size, time_ms", zzpgVar.zzs().zza(str2), Integer.valueOf(bArr.length), Long.valueOf((zzpgVar.zzaZ().nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e10) {
            e = e10;
            zzpg zzpgVar2 = this.zza;
            zzpgVar2.zzaV().zzb().zzd("Failed to log and bundle. appId, event, error", zzgu.zzl(str), zzpgVar2.zzs().zza(zzbgVar.zza), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            zzpg zzpgVar22 = this.zza;
            zzpgVar22.zzaV().zzb().zzd("Failed to log and bundle. appId, event, error", zzgu.zzl(str), zzpgVar22.zzs().zza(zzbgVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzl(long j10, String str, String str2, String str3) throws IllegalStateException {
        zzd(new zzig(this, str2, str3, str, j10));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final String zzm(zzr zzrVar) {
        zzN(zzrVar, false);
        return this.zza.zzap(zzrVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzn(zzah zzahVar, zzr zzrVar) throws IllegalStateException {
        Preconditions.checkNotNull(zzahVar);
        Preconditions.checkNotNull(zzahVar.zzc);
        zzN(zzrVar, false);
        zzah zzahVar2 = new zzah(zzahVar);
        zzahVar2.zza = zzrVar.zza;
        zzd(new zzih(this, zzahVar2, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzo(zzah zzahVar) throws IllegalStateException {
        Preconditions.checkNotNull(zzahVar);
        Preconditions.checkNotNull(zzahVar.zzc);
        Preconditions.checkNotEmpty(zzahVar.zza);
        zzO(zzahVar.zza, true);
        zzd(new zzii(this, new zzah(zzahVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzp(String str, String str2, boolean z10, zzr zzrVar) {
        zzN(zzrVar, false);
        String str3 = zzrVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            List<zzpn> list = (List) this.zza.zzaW().zzh(new zzij(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzpn zzpnVar : list) {
                if (z10 || !zzpp.zzZ(zzpnVar.zzc)) {
                    arrayList.add(new zzpl(zzpnVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.zza.zzaV().zzb().zzc("Failed to query user properties. appId", zzgu.zzl(zzrVar.zza), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            this.zza.zzaV().zzb().zzc("Failed to query user properties. appId", zzgu.zzl(zzrVar.zza), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzq(String str, String str2, String str3, boolean z10) {
        zzO(str, true);
        try {
            List<zzpn> list = (List) this.zza.zzaW().zzh(new zzik(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzpn zzpnVar : list) {
                if (z10 || !zzpp.zzZ(zzpnVar.zzc)) {
                    arrayList.add(new zzpl(zzpnVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.zza.zzaV().zzb().zzc("Failed to get user properties as. appId", zzgu.zzl(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            this.zza.zzaV().zzb().zzc("Failed to get user properties as. appId", zzgu.zzl(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzr(String str, String str2, zzr zzrVar) {
        zzN(zzrVar, false);
        String str3 = zzrVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.zza.zzaW().zzh(new zzil(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.zza.zzaV().zzb().zzb("Failed to get conditional user properties", e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzs(String str, String str2, String str3) {
        zzO(str, true);
        try {
            return (List) this.zza.zzaW().zzh(new zzim(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.zza.zzaV().zzb().zzb("Failed to get conditional user properties as", e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzt(zzr zzrVar) throws IllegalStateException {
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzO(str, false);
        zzd(new zzio(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzu(final Bundle bundle, final zzr zzrVar) throws IllegalStateException {
        zzN(zzrVar, false);
        final String str = zzrVar.zza;
        Preconditions.checkNotNull(str);
        zzd(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws SQLException {
                this.zza.zzK(bundle, str, zzrVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzv(zzr zzrVar) throws IllegalStateException {
        Preconditions.checkNotEmpty(zzrVar.zza);
        Preconditions.checkNotNull(zzrVar.zzs);
        zzE(new zzip(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final zzao zzw(zzr zzrVar) throws IllegalStateException {
        zzN(zzrVar, false);
        Preconditions.checkNotEmpty(zzrVar.zza);
        try {
            return (zzao) this.zza.zzaW().zzi(new zziq(this, zzrVar)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.zza.zzaV().zzb().zzc("Failed to get consent. appId", zzgu.zzl(zzrVar.zza), e10);
            return new zzao(null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzx(zzr zzrVar, Bundle bundle) throws IllegalStateException {
        zzN(zzrVar, false);
        Preconditions.checkNotNull(zzrVar.zza);
        zzpg zzpgVar = this.zza;
        if (!zzpgVar.zzd().zzp(null, zzfy.zzaY)) {
            try {
                return (List) this.zza.zzaW().zzh(new zziw(this, zzrVar, bundle)).get();
            } catch (InterruptedException | ExecutionException e10) {
                this.zza.zzaV().zzb().zzc("Failed to get trigger URIs. appId", zzgu.zzl(zzrVar.zza), e10);
                return Collections.EMPTY_LIST;
            }
        }
        try {
            return (List) zzpgVar.zzaW().zzi(new zziv(this, zzrVar, bundle)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            this.zza.zzaV().zzb().zzc("Failed to get trigger URIs. appId", zzgu.zzl(zzrVar.zza), e11);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzy(final zzr zzrVar) throws IllegalStateException {
        Preconditions.checkNotEmpty(zzrVar.zza);
        Preconditions.checkNotNull(zzrVar.zzs);
        zzE(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzF(zzrVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzz(final zzr zzrVar) throws IllegalStateException {
        Preconditions.checkNotEmpty(zzrVar.zza);
        Preconditions.checkNotNull(zzrVar.zzs);
        zzE(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzix
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG(zzrVar);
            }
        });
    }
}
