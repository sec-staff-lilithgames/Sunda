package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.Q6;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgz extends zzos {
    public zzgz(zzpg zzpgVar) {
        super(zzpgVar);
    }

    public final boolean zzb() {
        zzaw();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.zzu.zzaY().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final boolean zzbb() {
        return false;
    }

    public final void zzc(String str, zzot zzotVar, com.google.android.gms.internal.measurement.zzib zzibVar, zzgw zzgwVar) {
        zzgz zzgzVar;
        String str2;
        URL url;
        byte[] bArrZzcc;
        zzg();
        zzaw();
        try {
            url = new URI(zzotVar.zza()).toURL();
            this.zzg.zzp();
            bArrZzcc = zzibVar.zzcc();
            zzgzVar = this;
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            zzgzVar = this;
            str2 = str;
        }
        try {
            this.zzu.zzaW().zzm(new zzgy(zzgzVar, str2, url, bArrZzcc, zzotVar.zzb(), zzgwVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            zzgzVar.zzu.zzaV().zzb().zzc("Failed to parse URL. Not uploading MeasurementBatch. appId", zzgu.zzl(str2), zzotVar.zza());
        }
    }

    public final void zzd(zzh zzhVar, Map map, zzgw zzgwVar) {
        zzgz zzgzVar;
        URL url;
        zzg();
        zzaw();
        Preconditions.checkNotNull(zzhVar);
        Preconditions.checkNotNull(zzgwVar);
        zzou zzouVarZzf = this.zzg.zzf();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) zzfy.zze.zzb(null)).encodedAuthority((String) zzfy.zzf.zzb(null)).path("config/app/".concat(String.valueOf(zzhVar.zzf()))).appendQueryParameter(Q6.H, "android");
        zzouVarZzf.zzu.zzc().zzi();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            url = new URI(string).toURL();
            zzgzVar = this;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            zzgzVar = this;
        }
        try {
            this.zzu.zzaW().zzm(new zzgy(zzgzVar, zzhVar.zzc(), url, null, map, zzgwVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            zzgzVar.zzu.zzaV().zzb().zzc("Failed to parse config URL. Not fetching. appId", zzgu.zzl(zzhVar.zzc()), string);
        }
    }
}
