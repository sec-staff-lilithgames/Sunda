package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.mbridge.msdk.MBridgeConstans;
import i2.hQ.aTNDubNmpwAqdU;
import kotlinx.coroutines.DebugKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzx {
    private final zzic zza;

    public zzx(zzic zzicVar) {
        this.zza = zzicVar;
    }

    public final void zza() {
        zzic zzicVar = this.zza;
        zzicVar.zzaW().zzg();
        if (zze()) {
            if (zzd()) {
                zzicVar.zzd().zzr.zzb(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                zzicVar.zzj().zzF(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmpx", bundle);
            } else {
                String strZza = zzicVar.zzd().zzr.zza();
                if (TextUtils.isEmpty(strZza)) {
                    zzicVar.zzaV().zzc().zza("Cache still valid but referrer not found");
                } else {
                    long jZza = zzicVar.zzd().zzs.zza() / 3600000;
                    Uri uri = Uri.parse(strZza);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (jZza - 1) * 3600000);
                    Object obj = pair.first;
                    zzicVar.zzj().zzF(obj == null ? MBridgeConstans.DYNAMIC_VIEW_WX_APP : (String) obj, "_cmp", (Bundle) pair.second);
                }
                zzicVar.zzd().zzr.zzb(null);
            }
            zzicVar.zzd().zzs.zzb(0L);
        }
    }

    public final void zzc() {
        if (zze() && zzd()) {
            this.zza.zzd().zzr.zzb(null);
        }
    }

    public final boolean zzd() {
        if (!zze()) {
            return false;
        }
        zzic zzicVar = this.zza;
        return zzicVar.zzaZ().currentTimeMillis() - zzicVar.zzd().zzs.zza() > zzicVar.zzc().zzl(null, zzfy.zzaj);
    }

    public final boolean zze() {
        return this.zza.zzd().zzs.zza() > 0;
    }

    public final void zzb(String str, Bundle bundle) {
        String string;
        zzic zzicVar = this.zza;
        zzicVar.zzaW().zzg();
        if (zzicVar.zzB()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = aTNDubNmpwAqdU.gUYNbfUsdlKtZ;
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        zzicVar.zzd().zzr.zzb(string);
        zzicVar.zzd().zzs.zzb(zzicVar.zzaZ().currentTimeMillis());
    }
}
