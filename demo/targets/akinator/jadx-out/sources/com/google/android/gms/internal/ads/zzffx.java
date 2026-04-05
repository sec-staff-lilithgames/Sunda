package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import com.amazon.device.ads.DTBMetricReport;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzffx {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final long zzg;
    public final boolean zzh;
    public final String zzi;
    public final zzffw zzj;
    public final Bundle zzk;
    public final String zzl;
    public final String zzm;
    public final String zzn;
    public final JSONObject zzo;
    public final JSONObject zzp;
    public final String zzq;
    public final int zzr;
    public long zzs;
    public long zzt;

    public zzffx(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List listZzb = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String strNextString = "";
        String strNextString2 = "";
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        int iNextInt = 0;
        int iNextInt2 = 0;
        boolean zNextBoolean = false;
        zzffw zzffwVar = null;
        long jZza = -1;
        long jZza2 = -1;
        long jNextLong = 0;
        int iNextInt3 = -1;
        int iMax = 1;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Objects.equals(strNextName, "nofill_urls")) {
                listZzb = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if (Objects.equals(strNextName, "refresh_load_delay_time_interval")) {
                iNextInt3 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString6 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt2 = jsonReader.nextInt();
            } else if (DTBMetricReport.LATENCY.equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                String str = strNextString3;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjg)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzffwVar = new zzffw(jsonReader);
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString7 = jsonReader.nextString();
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlu)).booleanValue() && Objects.equals(strNextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(strNextName)) {
                        strNextString3 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(strNextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzho)).booleanValue()) {
                            try {
                                try {
                                    Bundle bundleZzl = com.google.android.gms.ads.internal.util.zzbp.zzl(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                                    if (bundleZzl != null) {
                                        bundle = bundleZzl;
                                    }
                                } catch (IOException | JSONException unused) {
                                }
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(strNextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkm)).booleanValue()) {
                            strNextString5 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(strNextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkm)).booleanValue()) {
                            strNextString4 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        zzbel zzbelVar = zzbeu.zzkn;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue() && Objects.equals(strNextName, "adResponseBody")) {
                            strNextString2 = jsonReader.nextString();
                        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue() && Objects.equals(strNextName, "adResponseHeaders")) {
                            jSONObject = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                        } else if (Objects.equals(strNextName, "max_parallel_renderers")) {
                            iMax = Math.max(1, jsonReader.nextInt());
                        } else {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkv)).booleanValue() && Objects.equals(strNextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                            } else {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcw)).booleanValue() && Objects.equals(strNextName, "latency_extras")) {
                                    try {
                                        Bundle bundleZzl2 = com.google.android.gms.ads.internal.util.zzbp.zzl(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                                        if (bundleZzl2 != null) {
                                            jZza2 = zza(bundleZzl2.getDouble("start_time"));
                                            jZza = zza(bundleZzl2.getDouble("end_time"));
                                        }
                                    } catch (IllegalStateException unused3) {
                                        jsonReader.skipValue();
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                        }
                    }
                }
                strNextString3 = str;
            }
        }
        String str2 = strNextString3;
        jsonReader.endObject();
        this.zza = listZzb;
        this.zzc = iNextInt;
        if (((Boolean) zzbha.zzc.zze()).booleanValue()) {
            this.zzd = -1;
        } else {
            zzbge zzbgeVar = zzbgi.zza;
            if (((Long) zzbgeVar.zze()).longValue() > -1) {
                this.zzd = ((Long) zzbgeVar.zze()).intValue();
            } else {
                this.zzd = iNextInt3;
            }
        }
        this.zzb = strNextString;
        this.zze = strNextString6;
        this.zzf = iNextInt2;
        this.zzg = jNextLong;
        this.zzj = zzffwVar;
        this.zzh = zNextBoolean;
        this.zzi = strNextString7;
        this.zzk = bundle;
        this.zzl = strNextString4;
        this.zzm = strNextString5;
        this.zzn = strNextString2;
        this.zzo = jSONObject;
        this.zzp = jSONObject2;
        this.zzq = str2;
        zzbge zzbgeVar2 = zzbgy.zza;
        this.zzr = ((Long) zzbgeVar2.zze()).longValue() > 0 ? ((Long) zzbgeVar2.zze()).intValue() : iMax;
        this.zzs = jZza2;
        this.zzt = jZza;
    }

    private static final long zza(double d10) {
        if (d10 > 9.223372036854776E18d || d10 < -9.223372036854776E18d) {
            return -1L;
        }
        return (long) d10;
    }
}
