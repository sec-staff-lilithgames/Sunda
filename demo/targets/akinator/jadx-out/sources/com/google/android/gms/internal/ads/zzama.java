package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzama implements zzaki {
    private final zzeg zza = new zzeg();
    private final zzalr zzb = new zzalr();

    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zza(byte[] bArr, int i10, int i11, zzakh zzakhVar, zzdg zzdgVar) throws zzat {
        zzeg zzegVar = this.zza;
        zzegVar.zzb(bArr, i11 + i10);
        zzegVar.zzh(i10);
        ArrayList arrayList = new ArrayList();
        try {
            int iZzg = zzegVar.zzg();
            Charset charset = StandardCharsets.UTF_8;
            String strZzN = zzegVar.zzN(charset);
            if (strZzN == null || !strZzN.startsWith("WEBVTT")) {
                zzegVar.zzh(iZzg);
                throw zzat.zzb("Expected WEBVTT. Got ".concat(String.valueOf(zzegVar.zzN(charset))), null);
            }
            while (!TextUtils.isEmpty(zzegVar.zzN(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                char c10 = 65535;
                int iZzg2 = 0;
                while (c10 == 65535) {
                    iZzg2 = zzegVar.zzg();
                    String strZzN2 = zzegVar.zzN(StandardCharsets.UTF_8);
                    c10 = strZzN2 == null ? (char) 0 : "STYLE".equals(strZzN2) ? (char) 2 : strZzN2.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                zzegVar.zzh(iZzg2);
                if (c10 == 0) {
                    zzakc.zza(new zzamd(arrayList2), zzakhVar, zzdgVar);
                    return;
                }
                if (c10 == 1) {
                    while (!TextUtils.isEmpty(zzegVar.zzN(StandardCharsets.UTF_8))) {
                    }
                } else if (c10 != 2) {
                    zzalt zzaltVarZza = zzalz.zza(zzegVar, arrayList);
                    if (zzaltVarZza != null) {
                        arrayList2.add(zzaltVarZza);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    zzegVar.zzN(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zza(zzegVar));
                }
            }
        } catch (zzat e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
