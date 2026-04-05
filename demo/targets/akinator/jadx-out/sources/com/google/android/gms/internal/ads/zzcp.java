package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcp {
    private static final String zza;
    private static final String zzb;
    private static final String zzc;
    private static final String zzd;
    private static final String zze;

    static {
        String str = zzep.zza;
        zza = Integer.toString(0, 36);
        zzb = Integer.toString(1, 36);
        zzc = Integer.toString(2, 36);
        zzd = Integer.toString(3, 36);
        zze = Integer.toString(4, 36);
    }

    public static ArrayList zza(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (zzcr zzcrVar : (zzcr[]) spanned.getSpans(0, spanned.length(), zzcr.class)) {
            arrayList.add(zzb(spanned, zzcrVar, 1, zzcrVar.zza()));
        }
        for (zzct zzctVar : (zzct[]) spanned.getSpans(0, spanned.length(), zzct.class)) {
            arrayList.add(zzb(spanned, zzctVar, 2, zzctVar.zza()));
        }
        for (zzcq zzcqVar : (zzcq[]) spanned.getSpans(0, spanned.length(), zzcq.class)) {
            arrayList.add(zzb(spanned, zzcqVar, 3, null));
        }
        for (zzcu zzcuVar : (zzcu[]) spanned.getSpans(0, spanned.length(), zzcu.class)) {
            arrayList.add(zzb(spanned, zzcuVar, 4, zzcuVar.zza()));
        }
        return arrayList;
    }

    private static Bundle zzb(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(zza, spanned.getSpanStart(obj));
        bundle2.putInt(zzb, spanned.getSpanEnd(obj));
        bundle2.putInt(zzc, spanned.getSpanFlags(obj));
        bundle2.putInt(zzd, i10);
        if (bundle != null) {
            bundle2.putBundle(zze, bundle);
        }
        return bundle2;
    }
}
