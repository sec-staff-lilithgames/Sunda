package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeeh implements zzfjx {
    private static final Pattern zzd = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zza;
    private final zzflc zzb;
    private final zzflm zzc;

    public zzeeh(String str, zzflm zzflmVar, zzflc zzflcVar) {
        this.zza = str;
        this.zzc = zzflmVar;
        this.zzb = zzflcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjx
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzdzv zzdzvVar;
        String strJoin;
        byte[] bArr;
        JSONObject jSONObjectZza;
        String strConcat;
        zzeeg zzeegVar = (zzeeg) obj;
        int iOptInt = zzeegVar.zza().optInt("http_timeout_millis", DtbConstants.NETWORK_READ_TIMEOUT);
        zzbxl zzbxlVarZzb = zzeegVar.zzb();
        if (zzbxlVarZzb.zza() != -2) {
            if (zzbxlVarZzb.zza() == 1) {
                if (zzbxlVarZzb.zzb() != null) {
                    strJoin = TextUtils.join(", ", zzbxlVarZzb.zzb());
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(strJoin);
                } else {
                    strJoin = "";
                }
                zzdzvVar = new zzdzv(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzdzvVar = new zzdzv(1);
            }
            zzflm zzflmVar = this.zzc;
            zzflc zzflcVar = this.zzb;
            zzflcVar.zzj(zzdzvVar);
            zzflcVar.zzd(false);
            zzflmVar.zza(zzflcVar);
            throw zzdzvVar;
        }
        HashMap map = new HashMap();
        if (zzeegVar.zzb().zzg()) {
            String str = this.zza;
            if (!TextUtils.isEmpty(str)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbg)).booleanValue()) {
                    if (TextUtils.isEmpty(str)) {
                        strConcat = "";
                    } else {
                        Matcher matcher = zzd.matcher(str);
                        strConcat = "";
                        while (matcher.find()) {
                            String strGroup = matcher.group(1);
                            if (strGroup != null) {
                                Locale locale = Locale.ROOT;
                                if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(strConcat)) {
                                        strConcat = strConcat.concat("; ");
                                    }
                                    strConcat = strConcat.concat(strGroup);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strConcat)) {
                        map.put("Cookie", strConcat);
                    }
                } else {
                    map.put("Cookie", str);
                }
            }
        }
        if (zzeegVar.zzb().zzf() && (jSONObjectZza = zzeegVar.zza()) != null) {
            JSONObject jSONObjectOptJSONObject = jSONObjectZza.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
            }
        }
        byte[] byteArray = new byte[0];
        if (TextUtils.isEmpty(zzeegVar.zzb().zzd())) {
            bArr = byteArray;
        } else {
            byte[] bytes = zzeegVar.zzb().zzd().getBytes(StandardCharsets.UTF_8);
            if (zzeegVar.zzb().zzm()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.finish();
                        byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                    } finally {
                    }
                } catch (IOException e10) {
                    com.google.android.gms.ads.internal.util.zze.zzb("gzip compression failed, sending uncompressed.", e10);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "PrepareRequestFunction.apply");
                    byteArray = null;
                }
                if (byteArray != null) {
                    map.put("Content-Encoding", "gzip");
                    bArr = byteArray;
                }
            }
            bArr = bytes;
        }
        String strZzl = !TextUtils.isEmpty(zzeegVar.zzb().zzl()) ? zzeegVar.zzb().zzl() : "";
        zzflm zzflmVar2 = this.zzc;
        zzflc zzflcVar2 = this.zzb;
        zzflcVar2.zzd(true);
        zzflmVar2.zza(zzflcVar2);
        return new zzeec(zzeegVar.zzb().zze(), iOptInt, map, bArr, strZzl, zzeegVar.zzb().zzf());
    }
}
