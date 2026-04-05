package com.google.android.gms.ads.identifier;

import android.util.Log;
import com.google.android.gms.internal.ads_identifier.zzk;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zze {
    public static final void zza(String str) {
        try {
            try {
                zzk.zzb(263);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        Log.w("HttpUrlPinger", "Received non-success response code " + responseCode + " from pinging URL: " + str);
                    }
                    zzk.zza();
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th2) {
                zzk.zza();
                throw th2;
            }
        } catch (IOException e10) {
            e = e10;
            Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
            zzk.zza();
        } catch (IndexOutOfBoundsException e11) {
            Log.w("HttpUrlPinger", "Error while parsing ping URL: " + str + ". " + e11.getMessage(), e11);
            zzk.zza();
        } catch (RuntimeException e12) {
            e = e12;
            Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
            zzk.zza();
        }
    }
}
