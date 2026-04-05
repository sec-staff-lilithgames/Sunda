package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbxj;
import com.google.android.gms.internal.ads.zzduq;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbj {
    public final String zza;
    public String zzb;
    public zzbxj zzd;
    public Bundle zze;
    private long zzg;
    private long zzh;
    public String zzc = null;
    public Bundle zzf = new Bundle();

    public zzbj(JsonReader jsonReader, zzbxj zzbxjVar) throws IOException {
        Bundle bundle;
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzd = zzbxjVar;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName = strNextName == null ? "" : strNextName;
            switch (strNextName.hashCode()) {
                case -1573145462:
                    if (strNextName.equals("start_time")) {
                        this.zzg = jsonReader.nextLong();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case -995427962:
                    if (strNextName.equals("params")) {
                        strNextString = jsonReader.nextString();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case -271442291:
                    if (strNextName.equals("signal_dictionary")) {
                        map = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            map.put(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case 1725551537:
                    if (strNextName.equals("end_time")) {
                        this.zzh = jsonReader.nextLong();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        this.zza = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzf.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcv)).booleanValue() || zzbxjVar == null || (bundle = zzbxjVar.zzm) == null) {
            return;
        }
        bundle.putLong(zzduq.GET_SIGNALS_SDKCORE_START.zza(), this.zzg);
        zzbxjVar.zzm.putLong(zzduq.GET_SIGNALS_SDKCORE_END.zza(), this.zzh);
    }
}
