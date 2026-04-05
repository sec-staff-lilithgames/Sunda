package com.google.android.gms.internal.ads;

import com.amazon.device.ads.MraidResizeCommand;
import com.amazon.device.ads.MraidUnloadCommand;
import com.google.android.gms.common.util.CollectionUtils;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.Map;
import org.json.JSONException;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbme implements zzblx {
    static final Map zza = CollectionUtils.mapOfKeyValueArrays(new String[]{MraidResizeCommand.NAME, "playVideo", "storePicture", "createCalendarEvent", MRAIDPresenter.SET_ORIENTATION_PROPERTIES, "closeResizedAd", MraidUnloadCommand.NAME}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final zzbuh zzc;
    private final zzbuo zzd;

    public zzbme(com.google.android.gms.ads.internal.zzb zzbVar, zzbuh zzbuhVar, zzbuo zzbuoVar) {
        this.zzb = zzbVar;
        this.zzc = zzbuhVar;
        this.zzd = zzbuoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws JSONException {
        zzcgy zzcgyVar = (zzcgy) obj;
        int iIntValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i10 = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzb;
                if (!zzbVar.zzb()) {
                    zzbVar.zzc(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.zzc.zza(map);
                    return;
                }
                if (iIntValue == 3) {
                    new zzbuk(zzcgyVar, map).zza();
                    return;
                }
                if (iIntValue == 4) {
                    new zzbue(zzcgyVar, map).zza();
                    return;
                }
                if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.zzc.zzb(true);
                        return;
                    } else if (iIntValue != 7) {
                        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z10 = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzcgyVar == null) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("AdWebView is null");
            return;
        }
        if (GalEuEfxjome.bRiqvDXBLR.equalsIgnoreCase(str)) {
            i10 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i10 = z10 ? -1 : 14;
        }
        zzcgyVar.zzam(i10);
    }
}
