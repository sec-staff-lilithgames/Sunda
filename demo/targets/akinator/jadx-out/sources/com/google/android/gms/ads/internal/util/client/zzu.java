package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbwf;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzu implements zze {
    private final Context zza;
    private final String zzb;
    private String zzc;

    public zzu(Context context, String str) {
        this.zza = context;
        this.zzb = str;
    }

    private final URL zzd(String str) throws MalformedURLException {
        URL urlZze = null;
        try {
            urlZze = new URI(str).toURL();
        } catch (IllegalArgumentException e10) {
            e = e10;
            zzf(str, e);
        } catch (MalformedURLException e11) {
            e = e11;
            zzf(str, e);
        } catch (URISyntaxException e12) {
            zzf(str, e12);
            if (((Boolean) zzbd.zzc().zzd(zzbeu.zze)).booleanValue()) {
                urlZze = zze(str);
            }
        }
        if (urlZze != null) {
            return urlZze;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 47);
        sb2.append("Falling back to direct new URL(\"");
        sb2.append(str);
        sb2.append("\") constructor.");
        zzo.zzd(sb2.toString());
        return new URL(str);
    }

    private final URL zze(String str) throws MalformedURLException {
        URL url;
        URI uri;
        try {
            zzo.zzd("Attempting to parse components, encode, and reconstruct URI.");
            URL url2 = new URL(str);
            uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
            url = uri.toURL();
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e10) {
            e = e10;
            url = null;
        }
        try {
            String string = uri.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 114 + string.length());
            sb2.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
            sb2.append(str);
            sb2.append("\" -> encoded URI: ");
            sb2.append(string);
            zzo.zzd(sb2.toString());
            return url;
        } catch (IllegalArgumentException e11) {
            e = e11;
            zzf(str, e);
            return url;
        } catch (MalformedURLException e12) {
            e = e12;
            zzf(str, e);
            return url;
        } catch (URISyntaxException e13) {
            e = e13;
            zzf(str, e);
            return url;
        }
    }

    private final void zzf(String str, Throwable th2) {
        String message = th2.getMessage();
        StringBuilder sb2 = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb2.append("Error while parsing ping URL: ");
        sb2.append(str);
        sb2.append(". ");
        sb2.append(message);
        zzo.zzi(sb2.toString());
        zzbwf.zza(this.zza).zzi(th2, "HttpUrlPinger.pingUrl", ((Integer) zzbd.zzc().zzd(zzbeu.zznL)).intValue() / 100.0f);
    }

    @Override // com.google.android.gms.ads.internal.util.client.zze
    public final zzt zza(String str) {
        return zzc(str, null);
    }

    public final String zzb() {
        return this.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0157 A[PHI: r0
      0x0157: PHI (r0v6 com.google.android.gms.ads.internal.util.client.zzt) = 
      (r0v0 com.google.android.gms.ads.internal.util.client.zzt)
      (r0v4 com.google.android.gms.ads.internal.util.client.zzt)
      (r0v8 com.google.android.gms.ads.internal.util.client.zzt)
     binds: [B:58:0x0155, B:54:0x014b, B:43:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.ads.internal.util.client.zzt zzc(java.lang.String r10, java.util.Map r11) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.client.zzu.zzc(java.lang.String, java.util.Map):com.google.android.gms.ads.internal.util.client.zzt");
    }
}
