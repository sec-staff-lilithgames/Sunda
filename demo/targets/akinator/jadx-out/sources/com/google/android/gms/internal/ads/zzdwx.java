package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonReader;
import b0.e2;
import com.google.android.gms.ads.RequestConfiguration;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdwx extends zzbmz {
    private final zzdxa zza;
    private final zzdwv zzb;
    private final Map zzc = new HashMap();

    public zzdwx(zzdxa zzdxaVar, zzdwv zzdwvVar) {
        this.zza = zzdxaVar;
        this.zzb = zzdwvVar;
    }

    private static com.google.android.gms.ads.internal.client.zzm zzc(Map map) throws IOException {
        com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return zznVar.zza();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                switch (strNextName.hashCode()) {
                    case -1289032093:
                        if (!strNextName.equals("extras")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            jsonReader.beginObject();
                            Bundle bundle = new Bundle();
                            while (jsonReader.hasNext()) {
                                bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                            }
                            jsonReader.endObject();
                            zznVar.zzb(bundle);
                            break;
                        }
                    case -839117230:
                        if (!strNextName.equals("isTestDevice")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            zznVar.zzd(jsonReader.nextBoolean());
                            break;
                        }
                    case -733436947:
                        if (!strNextName.equals("tagForUnderAgeOfConsent")) {
                            jsonReader.skipValue();
                            break;
                        } else if (!jsonReader.nextBoolean()) {
                            zznVar.zzf(0);
                            break;
                        } else {
                            zznVar.zzf(1);
                            break;
                        }
                    case -99890337:
                        if (!strNextName.equals("httpTimeoutMillis")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            zznVar.zzh(jsonReader.nextInt());
                            break;
                        }
                    case 523149226:
                        if (!strNextName.equals("keywords")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            jsonReader.beginArray();
                            ArrayList arrayList = new ArrayList();
                            while (jsonReader.hasNext()) {
                                arrayList.add(jsonReader.nextString());
                            }
                            jsonReader.endArray();
                            zznVar.zzc(arrayList);
                            break;
                        }
                    case 597632527:
                        if (!strNextName.equals("maxAdContentRating")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            String strNextString = jsonReader.nextString();
                            if (!RequestConfiguration.zza.contains(strNextString)) {
                                break;
                            } else {
                                zznVar.zzg(strNextString);
                                break;
                            }
                        }
                    case 1411582723:
                        if (!strNextName.equals("tagForChildDirectedTreatment")) {
                            jsonReader.skipValue();
                            break;
                        } else if (!jsonReader.nextBoolean()) {
                            zznVar.zze(0);
                            break;
                        } else {
                            zznVar.zze(1);
                            break;
                        }
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad Request json was malformed, parsing ended early.");
        }
        com.google.android.gms.ads.internal.client.zzm zzmVarZza = zznVar.zza();
        Bundle bundle2 = zzmVarZza.zzm;
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle3 == null) {
            bundle3 = zzmVarZza.zzc;
            bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle3);
        }
        return new com.google.android.gms.ads.internal.client.zzm(zzmVarZza.zza, zzmVarZza.zzb, bundle3, zzmVarZza.zzd, zzmVarZza.zze, zzmVarZza.zzf, zzmVarZza.zzg, zzmVarZza.zzh, zzmVarZza.zzi, zzmVarZza.zzj, zzmVarZza.zzk, zzmVarZza.zzl, bundle2, zzmVarZza.zzn, zzmVarZza.zzo, zzmVarZza.zzp, zzmVarZza.zzq, zzmVarZza.zzr, zzmVarZza.zzs, zzmVarZza.zzt, zzmVarZza.zzu, zzmVarZza.zzv, zzmVarZza.zzw, zzmVarZza.zzx, zzmVarZza.zzy, zzmVarZza.zzz, zzmVarZza.zzA);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzbna
    public final void zze(String str) throws RemoteException, NumberFormatException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkV)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri uri = Uri.parse(str);
            com.google.android.gms.ads.internal.zzt.zzc();
            Map mapZzU = com.google.android.gms.ads.internal.util.zzs.zzU(uri);
            String str2 = (String) mapZzU.get("action");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 gmsg did not contain an action");
                return;
            }
            int iHashCode = str2.hashCode();
            if (iHashCode != 579053441) {
                if (iHashCode == 871091088 && str2.equals(MobileAdsBridgeBase.initializeMethodName)) {
                    this.zzc.clear();
                    this.zzb.zza();
                    return;
                }
            } else if (str2.equals("dispose_all")) {
                Map map = this.zzc;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzdwr) it.next()).zzc();
                }
                map.clear();
                return;
            }
            String str3 = (String) mapZzU.get("obj_id");
            try {
                Objects.requireNonNull(str3);
                long j10 = Long.parseLong(str3);
                switch (str2.hashCode()) {
                    case -1790951212:
                        if (str2.equals("show_interstitial_ad")) {
                            zzdwr zzdwrVar = (zzdwr) this.zzc.get(Long.valueOf(j10));
                            if (zzdwrVar != null) {
                                zzdwrVar.zzb();
                                return;
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not show H5 ad, object ID does not exist");
                                this.zzb.zzd(j10);
                                return;
                            }
                        }
                        break;
                    case -1266374734:
                        if (str2.equals("show_rewarded_ad")) {
                            zzdwr zzdwrVar2 = (zzdwr) this.zzc.get(Long.valueOf(j10));
                            if (zzdwrVar2 != null) {
                                zzdwrVar2.zzb();
                                return;
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not show H5 ad, object ID does not exist");
                                this.zzb.zzj(j10);
                                return;
                            }
                        }
                        break;
                    case -257098725:
                        if (str2.equals("load_rewarded_ad")) {
                            zzdwr zzdwrVar3 = (zzdwr) this.zzc.get(Long.valueOf(j10));
                            if (zzdwrVar3 != null) {
                                zzdwrVar3.zza(zzc(mapZzU));
                                return;
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not load H5 ad, object ID does not exist");
                                this.zzb.zzj(j10);
                                return;
                            }
                        }
                        break;
                    case 393881811:
                        if (str2.equals("create_interstitial_ad")) {
                            Map map2 = this.zzc;
                            if (map2.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkW)).intValue()) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, too many existing objects");
                                this.zzb.zzc(j10);
                                return;
                            }
                            Long lValueOf = Long.valueOf(j10);
                            if (map2.containsKey(lValueOf)) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not create H5 ad, object ID already exists");
                                this.zzb.zzc(j10);
                                return;
                            }
                            String str4 = (String) mapZzU.get("ad_unit");
                            if (TextUtils.isEmpty(str4)) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, missing ad unit id");
                                this.zzb.zzc(j10);
                                return;
                            }
                            zzdws zzdwsVarZzc = this.zza.zzc();
                            zzdwsVarZzc.zzc(j10);
                            zzdwsVarZzc.zzb(str4);
                            map2.put(lValueOf, zzdwsVarZzc.zza().zza());
                            this.zzb.zzb(j10);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 39 + String.valueOf(str4).length());
                            e2.A(sb2, "Created H5 interstitial #", j10, " with ad unit ");
                            sb2.append(str4);
                            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                            return;
                        }
                        break;
                    case 585513149:
                        if (str2.equals("load_interstitial_ad")) {
                            zzdwr zzdwrVar4 = (zzdwr) this.zzc.get(Long.valueOf(j10));
                            if (zzdwrVar4 != null) {
                                zzdwrVar4.zza(zzc(mapZzU));
                                return;
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not load H5 ad, object ID does not exist");
                                this.zzb.zzd(j10);
                                return;
                            }
                        }
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            Map map3 = this.zzc;
                            Long lValueOf2 = Long.valueOf(j10);
                            zzdwr zzdwrVar5 = (zzdwr) map3.get(lValueOf2);
                            if (zzdwrVar5 == null) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not dispose H5 ad, object ID does not exist");
                                return;
                            }
                            zzdwrVar5.zzc();
                            map3.remove(lValueOf2);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 16);
                            sb3.append("Disposed H5 ad #");
                            sb3.append(j10);
                            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                            return;
                        }
                        break;
                    case 2109237041:
                        if (str2.equals("create_rewarded_ad")) {
                            Map map4 = this.zzc;
                            if (map4.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkW)).intValue()) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, too many existing objects");
                                this.zzb.zzc(j10);
                                return;
                            }
                            Long lValueOf3 = Long.valueOf(j10);
                            if (map4.containsKey(lValueOf3)) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not create H5 ad, object ID already exists");
                                this.zzb.zzc(j10);
                                return;
                            }
                            String str5 = (String) mapZzU.get("ad_unit");
                            if (TextUtils.isEmpty(str5)) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, missing ad unit id");
                                this.zzb.zzc(j10);
                                return;
                            }
                            zzdws zzdwsVarZzc2 = this.zza.zzc();
                            zzdwsVarZzc2.zzc(j10);
                            zzdwsVarZzc2.zzb(str5);
                            map4.put(lValueOf3, zzdwsVarZzc2.zza().zzb());
                            this.zzb.zzb(j10);
                            StringBuilder sb4 = new StringBuilder(String.valueOf(j10).length() + 35 + String.valueOf(str5).length());
                            e2.A(sb4, "Created H5 rewarded #", j10, " with ad unit ");
                            sb4.append(str5);
                            com.google.android.gms.ads.internal.util.zze.zza(sb4.toString());
                            return;
                        }
                        break;
                }
                com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 gmsg contained invalid action: ".concat(str2));
            } catch (NullPointerException | NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void zzf() {
        this.zzc.clear();
    }
}
