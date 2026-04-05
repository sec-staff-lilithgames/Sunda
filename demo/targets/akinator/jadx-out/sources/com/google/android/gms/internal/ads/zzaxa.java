package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaxa {
    private static final String[] zzc = {"/aclk", "/pcs/click", "/dbm/clk"};
    private final String zza = "ad.doubleclick.net";
    private final String[] zzb = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private final zzawv zzd;

    @Deprecated
    public zzaxa(zzawv zzawvVar) {
        this.zzd = zzawvVar;
    }

    private final Uri zzf(Uri uri, String str) throws zzaxb {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals(this.zza)) {
                    if (uri.getPath().contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new zzaxb("Parameter already exists: dc_ms");
                        }
                        String string = uri.toString();
                        int iIndexOf = string.indexOf(";adurl");
                        if (iIndexOf != -1) {
                            int i10 = iIndexOf + 1;
                            return Uri.parse(string.substring(0, i10) + "dc_ms=" + str + ";" + string.substring(i10));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int iIndexOf2 = string.indexOf(encodedPath);
                        return Uri.parse(string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms=" + str + ";" + string.substring(iIndexOf2 + encodedPath.length()));
                    }
                }
            } catch (NullPointerException unused) {
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
            return Uri.parse(string2.substring(0, i11) + "ms=" + str + C3191e4.i.f36527c + string2.substring(i11));
        } catch (UnsupportedOperationException unused2) {
            throw new zzaxb("Provided Uri is not in a valid state");
        }
    }

    public final boolean zza(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.zzb;
            for (int i10 = 0; i10 < 3; i10++) {
                if (host.endsWith(strArr[i10])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    @Deprecated
    public final zzawv zzb() {
        return this.zzd;
    }

    @Deprecated
    public final void zzc(MotionEvent motionEvent) {
        this.zzd.zzd(motionEvent);
    }

    public final boolean zze(Uri uri) {
        if (zza(uri)) {
            String[] strArr = zzc;
            for (int i10 = 0; i10 < 3; i10++) {
                if (uri.getPath().endsWith(strArr[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    @Deprecated
    public final Uri zzd(Uri uri, Context context, View view, Activity activity) throws zzaxb {
        try {
            return zzf(uri, this.zzd.zzf(context, uri.getQueryParameter(LJjmO.DPhFfdc), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzaxb("Provided Uri is not in a valid state");
        }
    }
}
