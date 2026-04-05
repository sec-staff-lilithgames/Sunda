package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.ironsource.C3271ic;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzl {
    public static final /* synthetic */ int zza = 0;
    private static boolean zzc = false;
    private static boolean zzd = false;
    private final List zzg;
    private static final Object zzb = new Object();
    private static final Clock zze = DefaultClock.getInstance();
    private static final Set zzf = new HashSet(Arrays.asList(new String[0]));

    public zzl() {
        throw null;
    }

    public static void zzg() {
        synchronized (zzb) {
            zzc = false;
            zzd = false;
            zzo.zzi("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzh(boolean z10) {
        synchronized (zzb) {
            zzc = true;
            zzd = z10;
        }
    }

    public static boolean zzi() {
        boolean z10;
        synchronized (zzb) {
            z10 = zzc;
        }
        return z10;
    }

    public static boolean zzj() {
        boolean z10;
        synchronized (zzb) {
            try {
                z10 = false;
                if (zzc && zzd) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public static /* synthetic */ void zzk(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zzp(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }

    public static /* synthetic */ void zzl(int i10, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i10);
        jsonWriter.endObject();
        zzp(jsonWriter, map);
        jsonWriter.endObject();
    }

    private final void zzm(final String str, final String str2, final Map map, final byte[] bArr) throws IOException {
        zzq("onNetworkRequest", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzj
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final /* synthetic */ void zza(JsonWriter jsonWriter) throws IOException {
                zzl.zzk(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void zzn(final Map map, final int i10) throws IOException {
        zzq("onNetworkResponse", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzg
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final /* synthetic */ void zza(JsonWriter jsonWriter) throws IOException {
                zzl.zzl(i10, map, jsonWriter);
            }
        });
    }

    private final void zzo(final String str) throws IOException {
        zzq("onNetworkRequestError", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzi
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final /* synthetic */ void zza(JsonWriter jsonWriter) throws IOException {
                int i10 = zzl.zza;
                jsonWriter.name("params").beginObject();
                String str2 = str;
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private static void zzp(JsonWriter jsonWriter, Map map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!zzf.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        zzo.zzf("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    private final void zzq(String str, zzk zzkVar) throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(zze.currentTimeMillis());
            jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            zzkVar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e10) {
            zzo.zzg("unable to log", e10);
        }
        zzr(stringWriter.toString());
    }

    private static synchronized void zzr(String str) {
        try {
            zzo.zzh("GMA Debug BEGIN");
            int i10 = 0;
            while (i10 < str.length()) {
                int i11 = i10 + 4000;
                zzo.zzh("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i10, Math.min(i11, str.length())))));
                i10 = i11;
            }
            zzo.zzh("GMA Debug FINISH");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void zza(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        if (zzj()) {
            zzm(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void zzb(String str, String str2, Map map, byte[] bArr) throws IOException {
        if (zzj()) {
            zzm(str, C3271ic.f36943a, map, bArr);
        }
    }

    public final void zzc(HttpURLConnection httpURLConnection, int i10) throws IOException {
        if (zzj()) {
            String responseMessage = null;
            zzn(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i10);
            if (i10 < 200 || i10 >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e10) {
                    zzo.zzi("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e10.getMessage())));
                }
                zzo(responseMessage);
            }
        }
    }

    public final void zzd(Map map, int i10) throws IOException {
        if (zzj()) {
            zzn(map, i10);
            if (i10 < 200 || i10 >= 300) {
                zzo(null);
            }
        }
    }

    public final void zze(String str) throws IOException {
        if (zzj() && str != null) {
            zzf(str.getBytes());
        }
    }

    public final void zzf(final byte[] bArr) throws IOException {
        zzq("onNetworkResponseBody", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzh
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final /* synthetic */ void zza(JsonWriter jsonWriter) throws IOException {
                int i10 = zzl.zza;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String strEncode = Base64Utils.encode(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(strEncode);
                } else {
                    String strZzf = zzf.zzf(strEncode);
                    if (strZzf != null) {
                        jsonWriter.name("bodydigest").value(strZzf);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    public zzl(String str) {
        this.zzg = !zzj() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }
}
