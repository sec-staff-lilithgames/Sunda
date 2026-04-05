package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbwr;
import com.google.android.gms.internal.ads.zzbzt;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final zzbzt zzc;
    private final zzbwr zzd = new zzbwr(false, Collections.EMPTY_LIST);

    public zzb(Context context, zzbzt zzbztVar, zzbwr zzbwrVar) {
        this.zza = context;
        this.zzc = zzbztVar;
    }

    private final boolean zzd() {
        zzbzt zzbztVar = this.zzc;
        return (zzbztVar != null && zzbztVar.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final boolean zzb() {
        return !zzd() || this.zzb;
    }

    public final void zzc(String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzbzt zzbztVar = this.zzc;
            if (zzbztVar != null) {
                zzbztVar.zze(str, null, 3);
                return;
            }
            zzbwr zzbwrVar = this.zzd;
            if (!zzbwrVar.zza || (list = zzbwrVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.zza;
                    zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzP(context, "", strReplace);
                }
            }
        }
    }
}
