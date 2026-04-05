package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.amazon.device.ads.DtbConstants;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3191e4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfin implements zzfim {
    private final Object[] zza;

    public zzfin(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, int i10, String str2, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i10));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzmVar.zzb));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(zza(zzmVar.zzc));
        } else if (hashSet.contains("npa")) {
            arrayList.add(zzmVar.zzc.getString("npa"));
        }
        if (hashSet.contains(InneractiveMediationDefs.KEY_GENDER)) {
            arrayList.add(Integer.valueOf(zzmVar.zzd));
        }
        if (hashSet.contains("keywords")) {
            List list = zzmVar.zze;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzmVar.zzf));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzmVar.zzg));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzmVar.zzh));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzmVar.zzi);
        }
        if (hashSet.contains(DtbConstants.PRIVACY_LOCATION_KEY)) {
            Location location = zzmVar.zzk;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzmVar.zzl);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(zza(zzmVar.zzm));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(zza(zzmVar.zzn));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = zzmVar.zzo;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzmVar.zzp);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzmVar.zzq);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzmVar.zzr));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(zzmVar.zzt));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(zzmVar.zzu);
        }
        if (hashSet.contains("orientation")) {
            if (zzxVar != null) {
                arrayList.add(Integer.valueOf(zzxVar.zza));
            } else {
                arrayList.add(null);
            }
        }
        this.zza = arrayList.toArray();
    }

    private static String zza(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb2.append(obj == null ? AbstractJsonLexerKt.NULL : obj instanceof Bundle ? zza((Bundle) obj) : obj.toString());
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfim
    public final boolean equals(Object obj) {
        if (obj instanceof zzfin) {
            return Arrays.equals(this.zza, ((zzfin) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfim
    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        Object[] objArr = this.zza;
        int iHashCode = Arrays.hashCode(objArr);
        String string = Arrays.toString(objArr);
        StringBuilder sb2 = new StringBuilder(String.valueOf(iHashCode).length() + 10 + String.valueOf(string).length() + 1);
        sb2.append("[PoolKey#");
        sb2.append(iHashCode);
        sb2.append(" ");
        sb2.append(string);
        sb2.append(C3191e4.i.f36531e);
        return sb2.toString();
    }
}
