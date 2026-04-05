package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfgr {
    private final zzaxa zza;

    public zzfgr(zzaxa zzaxaVar) {
        this.zza = zzaxaVar;
    }

    private static final Uri zzb(Uri uri, String str) throws zzaxb {
        if (uri != null) {
            try {
                try {
                    String host = uri.getHost();
                    String path = uri.getPath();
                    if (host != null && host.equals("ad.doubleclick.net") && path != null) {
                        if (path.contains(";")) {
                            if (uri.toString().contains("dc_ms=")) {
                                throw new zzaxb("Parameter already exists: dc_ms");
                            }
                            String string = uri.toString();
                            int iIndexOf = string.indexOf(";adurl");
                            if (iIndexOf != -1) {
                                int i10 = iIndexOf + 1;
                                StringBuilder sb2 = new StringBuilder(string.substring(0, i10));
                                sb2.append("dc_ms=");
                                sb2.append(str);
                                sb2.append(";");
                                sb2.append((CharSequence) string, i10, string.length());
                                return Uri.parse(sb2.toString());
                            }
                            String encodedPath = uri.getEncodedPath();
                            if (encodedPath == null) {
                                throw new UnsupportedOperationException();
                            }
                            int iIndexOf2 = string.indexOf(encodedPath);
                            StringBuilder sb3 = new StringBuilder(string.substring(0, encodedPath.length() + iIndexOf2));
                            sb3.append(";dc_ms=");
                            sb3.append(str);
                            sb3.append(";");
                            sb3.append((CharSequence) string, iIndexOf2 + encodedPath.length(), string.length());
                            return Uri.parse(sb3.toString());
                        }
                    }
                } catch (UnsupportedOperationException unused) {
                    throw new zzaxb("Provided Uri is not in a valid state");
                }
            } catch (NullPointerException unused2) {
            }
        }
        if (uri.getQueryParameter("ms") != null) {
            throw new zzaxb("Query parameter already exists: ms");
        }
        String string2 = uri.toString();
        int iIndexOf3 = string2.indexOf("&adurl");
        if (iIndexOf3 == -1) {
            iIndexOf3 = string2.indexOf("?adurl");
        }
        if (iIndexOf3 == -1) {
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        int i11 = iIndexOf3 + 1;
        StringBuilder sb4 = new StringBuilder(string2.substring(0, i11));
        sb4.append("ms=");
        sb4.append(str);
        sb4.append(C3191e4.i.f36527c);
        sb4.append((CharSequence) string2, i11, string2.length());
        return Uri.parse(sb4.toString());
    }

    public final Uri zza(Uri uri, Context context, View view, Activity activity) throws zzaxb {
        try {
            return zzb(uri, this.zza.zzb().zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzaxb("Provided Uri is not in a valid state");
        }
    }
}
