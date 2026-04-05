package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdwm {
    public final long zza;
    public final int[] zzb;

    private zzdwm(long j10, int[] iArr) {
        this.zza = j10;
        this.zzb = iArr;
    }

    public static zzgpe zza(JsonReader jsonReader) throws IOException {
        int i10 = zzgpe.zzd;
        zzgpb zzgpbVar = new zzgpb();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            zzgpe zzgpeVarZzi = zzgpe.zzi();
            jsonReader.beginObject();
            zzdwm zzdwmVar = null;
            Long lValueOf = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (Objects.equals(strNextName, "id")) {
                    lValueOf = Long.valueOf(jsonReader.nextLong());
                } else if (Objects.equals(strNextName, "event_types")) {
                    zzgpb zzgpbVar2 = new zzgpb();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzgpbVar2.zzf(Integer.valueOf(jsonReader.nextInt()));
                    }
                    jsonReader.endArray();
                    zzgpeVarZzi = zzgpbVar2.zzi();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (lValueOf != null && !zzgpeVarZzi.isEmpty()) {
                long jLongValue = lValueOf.longValue();
                int[] iArr = new int[zzgpeVarZzi.size()];
                for (int i11 = 0; i11 < zzgpeVarZzi.size(); i11++) {
                    iArr[i11] = ((Integer) zzgpeVarZzi.get(i11)).intValue();
                }
                zzdwmVar = new zzdwm(jLongValue, iArr);
            }
            if (zzdwmVar != null) {
                zzgpbVar.zzf(zzdwmVar);
            }
        }
        jsonReader.endArray();
        return zzgpbVar.zzi();
    }
}
