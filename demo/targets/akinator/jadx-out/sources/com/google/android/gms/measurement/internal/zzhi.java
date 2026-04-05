package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.play_billing.a;
import com.unity3d.ads.beta.xyn.RnJusJ;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.DebugKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhi implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzbq zza;
    final /* synthetic */ ServiceConnection zzb;
    final /* synthetic */ zzhj zzc;

    public zzhi(zzhj zzhjVar, com.google.android.gms.internal.measurement.zzbq zzbqVar, ServiceConnection serviceConnection) {
        this.zza = zzbqVar;
        this.zzb = serviceConnection;
        Objects.requireNonNull(zzhjVar);
        this.zzc = zzhjVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        Bundle bundleZze;
        zzhj zzhjVar = this.zzc;
        zzhk zzhkVar = zzhjVar.zza;
        zzic zzicVar = zzhkVar.zza;
        zzicVar.zzaW().zzg();
        Bundle bundle = new Bundle();
        String strZza = zzhjVar.zza();
        bundle.putString("package_name", strZza);
        try {
            bundleZze = this.zza.zze(bundle);
        } catch (Exception e10) {
            zzhkVar.zza.zzaV().zzb().zzb("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        if (bundleZze == null) {
            zzicVar.zzaV().zzb().zza("Install Referrer Service returned a null response");
            bundleZze = null;
        }
        zzic zzicVar2 = zzhkVar.zza;
        zzicVar2.zzaW().zzg();
        zzic.zzL();
        if (bundleZze != null) {
            long j10 = bundleZze.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                a.C(zzicVar2, RnJusJ.UKJEBDbKTSICles);
            } else {
                String string = bundleZze.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    a.r(zzicVar2, "No referrer defined in Install Referrer response");
                } else {
                    zzicVar2.zzaV().zzk().zzb("InstallReferrer API result", string);
                    Bundle bundleZzi = zzicVar2.zzk().zzi(Uri.parse("?".concat(string)));
                    if (bundleZzi == null) {
                        a.r(zzicVar2, "No campaign params defined in Install Referrer result");
                    } else {
                        List listAsList = Arrays.asList(((String) zzfy.zzbg.zzb(null)).split(","));
                        Iterator<String> it = bundleZzi.keySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (listAsList.contains(it.next())) {
                                long j11 = bundleZze.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                                if (j11 > 0) {
                                    bundleZzi.putLong("click_timestamp", j11);
                                }
                            }
                        }
                        if (j10 == zzicVar2.zzd().zzd.zza()) {
                            zzicVar2.zzaV().zzk().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzicVar2.zzB()) {
                            zzicVar2.zzd().zzd.zzb(j10);
                            zzicVar2.zzaV().zzk().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleZzi.putString("_cis", "referrer API v2");
                            zzicVar2.zzj().zzI(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmp", bundleZzi, strZza);
                        }
                    }
                }
            }
        }
        ConnectionTracker.getInstance().unbindService(zzicVar2.zzaY(), this.zzb);
    }
}
