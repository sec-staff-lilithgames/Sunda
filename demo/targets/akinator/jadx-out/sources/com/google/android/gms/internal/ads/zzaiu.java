package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaiu {
    public static String zza(List list) {
        Iterator it = list.iterator();
        String str = null;
        boolean z10 = false;
        while (it.hasNext()) {
            String str2 = ((zzaji) it.next()).zza.zzg.zzo;
            if (zzas.zzb(str2)) {
                return MimeTypes.VIDEO_MP4;
            }
            if (zzas.zza(str2)) {
                z10 = true;
            } else if (zzas.zzc(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z10 ? MimeTypes.AUDIO_MP4 : str != null ? str : MimeTypes.APPLICATION_MP4;
    }
}
