package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import b0.e2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdnd {
    private final zzdse zza;
    private final zzdqt zzb;
    private final zzcql zzc;
    private final zzdly zzd;

    public zzdnd(zzdse zzdseVar, zzdqt zzdqtVar, zzcql zzcqlVar, zzdly zzdlyVar) {
        this.zza = zzdseVar;
        this.zzb = zzdqtVar;
        this.zzc = zzcqlVar;
        this.zzd = zzdlyVar;
    }

    public final View zza() throws zzchn {
        zzcgy zzcgyVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        zzcgyVarZza.zzE().setVisibility(8);
        zzcgyVarZza.zzab("/sendMessageToSdk", new zzblx() { // from class: com.google.android.gms.internal.ads.zzdnc
            @Override // com.google.android.gms.internal.ads.zzblx
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzb((zzcgy) obj, map);
            }
        });
        zzcgyVarZza.zzab("/adMuted", new zzblx() { // from class: com.google.android.gms.internal.ads.zzdmx
            @Override // com.google.android.gms.internal.ads.zzblx
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzc((zzcgy) obj, map);
            }
        });
        WeakReference weakReference = new WeakReference(zzcgyVarZza);
        zzblx zzblxVar = new zzblx() { // from class: com.google.android.gms.internal.ads.zzdmy
            @Override // com.google.android.gms.internal.ads.zzblx
            public final /* synthetic */ void zza(Object obj, final Map map) {
                zzcgy zzcgyVar = (zzcgy) obj;
                zzciw zzciwVarZzP = zzcgyVar.zzP();
                final zzdnd zzdndVar = this.zza;
                zzciwVarZzP.zzG(new zzciu() { // from class: com.google.android.gms.internal.ads.zzdnb
                    @Override // com.google.android.gms.internal.ads.zzciu
                    public final /* synthetic */ void zza(boolean z10, int i10, String str, String str2) {
                        zzdndVar.zzf(map, z10, i10, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcgyVar.loadData(str, "text/html", C.UTF8_NAME);
                } else {
                    zzcgyVar.loadDataWithBaseURL(str2, str, "text/html", C.UTF8_NAME, null);
                }
            }
        };
        zzdqt zzdqtVar = this.zzb;
        zzdqtVar.zzh(weakReference, "/loadHtml", zzblxVar);
        zzdqtVar.zzh(new WeakReference(zzcgyVarZza), "/showOverlay", new zzblx() { // from class: com.google.android.gms.internal.ads.zzdmz
            @Override // com.google.android.gms.internal.ads.zzblx
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzd((zzcgy) obj, map);
            }
        });
        zzdqtVar.zzh(new WeakReference(zzcgyVarZza), "/hideOverlay", new zzblx() { // from class: com.google.android.gms.internal.ads.zzdna
            @Override // com.google.android.gms.internal.ads.zzblx
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zze((zzcgy) obj, map);
            }
        });
        return zzcgyVarZza.zzE();
    }

    public final /* synthetic */ void zzb(zzcgy zzcgyVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(zzcgy zzcgyVar, Map map) {
        this.zzd.zzt();
    }

    public final /* synthetic */ void zzd(zzcgy zzcgyVar, Map map) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Showing native ads overlay.");
        zzcgyVar.zzE().setVisibility(0);
        this.zzc.zze(true);
    }

    public final /* synthetic */ void zze(zzcgy zzcgyVar, Map map) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Hiding native ads overlay.");
        zzcgyVar.zzE().setVisibility(8);
        this.zzc.zze(false);
    }

    public final /* synthetic */ void zzf(Map map, boolean z10, int i10, String str, String str2) {
        HashMap mapS = e2.s("messageType", "htmlLoaded");
        mapS.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", mapS);
    }
}
