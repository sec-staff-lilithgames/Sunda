package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcet implements zzblx {
    @Override // com.google.android.gms.internal.ads.zzblx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        zzcdr zzcdrVar = (zzcdr) obj;
        zzcie zzcieVarZzh = zzcdrVar.zzh();
        if (zzcieVarZzh == null) {
            try {
                zzcie zzcieVar = new zzcie(zzcdrVar, Float.parseFloat((String) map.get(IronSourceConstants.EVENTS_DURATION)), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzcdrVar.zzw(zzcieVar);
                zzcieVarZzh = zzcieVar;
            } catch (NullPointerException e10) {
                e = e10;
                Throwable th2 = e;
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to parse videoMeta message.", th2);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e11) {
                e = e11;
                Throwable th22 = e;
                int i102 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to parse videoMeta message.", th22);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th22, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f10 = Float.parseFloat((String) map.get(IronSourceConstants.EVENTS_DURATION));
        boolean zEquals = "1".equals(map.get("muted"));
        float f11 = Float.parseFloat((String) map.get("currentTime"));
        int i11 = Integer.parseInt((String) map.get("playbackState"));
        if (i11 < 0 || i11 > 3) {
            i11 = 0;
        }
        String str = (String) map.get("aspectRatio");
        float f12 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(f11).length() + 45 + String.valueOf(f10).length() + 13 + String.valueOf(zEquals).length() + 19 + String.valueOf(i11).length() + 17 + String.valueOf(str).length());
            sb2.append("Video Meta GMSG: currentTime : ");
            sb2.append(f11);
            sb2.append(" , duration : ");
            sb2.append(f10);
            sb2.append(" , isMuted : ");
            sb2.append(zEquals);
            sb2.append(" , playbackState : ");
            sb2.append(i11);
            sb2.append(" , aspectRatio : ");
            sb2.append(str);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2.toString());
        }
        zzcieVarZzh.zzs(f11, f10, i11, zEquals, f12);
    }
}
