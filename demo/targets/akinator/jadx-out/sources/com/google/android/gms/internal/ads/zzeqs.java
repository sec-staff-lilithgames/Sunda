package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.amazon.device.ads.DTBMetricReport;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeqs implements zzeya {
    private final zzgus zza;
    private final zzdsy zzb;
    private final zzdxt zzc;
    private final zzequ zzd;

    public zzeqs(zzgus zzgusVar, zzdsy zzdsyVar, zzdxt zzdxtVar, zzequ zzequVar) {
        this.zza = zzgusVar;
        this.zzb = zzdsyVar;
        this.zzc = zzdxtVar;
        this.zzd = zzequVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        zzbel zzbelVar = zzbeu.zzmF;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue()) {
            zzequ zzequVar = this.zzd;
            if (zzequVar.zzd() != null) {
                zzeqt zzeqtVarZzd = zzequVar.zzd();
                zzeqtVarZzd.getClass();
                return zzgui.zza(zzeqtVarZzd);
            }
        }
        if (zzgmu.zzc((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbI)) || (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue() && (this.zzd.zzb() || !this.zzc.zze()))) {
            return zzgui.zza(new zzeqt(new Bundle()));
        }
        this.zzd.zza(true);
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqr
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 1;
    }

    public final /* synthetic */ zzeqt zzc() {
        List<String> listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbI)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                zzfhl zzfhlVarZza = this.zzb.zza(str, new JSONObject());
                zzfhlVarZza.zzn();
                boolean zZze = this.zzc.zze();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmF)).booleanValue() || zZze) {
                    try {
                        zzbtx zzbtxVarZzC = zzfhlVarZza.zzC();
                        if (zzbtxVarZzC != null) {
                            bundle2.putString("sdk_version", zzbtxVarZzC.toString());
                        }
                    } catch (zzfgu unused) {
                    }
                }
                try {
                    zzbtx zzbtxVarZzB = zzfhlVarZza.zzB();
                    if (zzbtxVarZzB != null) {
                        bundle2.putString(DTBMetricReport.ADAPTER_VERSION, zzbtxVarZzB.toString());
                    }
                } catch (zzfgu unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfgu unused3) {
            }
        }
        zzeqt zzeqtVar = new zzeqt(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmF)).booleanValue()) {
            this.zzd.zzc(zzeqtVar);
        }
        return zzeqtVar;
    }
}
