package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.vungle.ads.internal.protos.Sdk;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");

    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");

    static {
        new AdSize(-3, 0, "search_v2");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AdSize(int i10, int i11) {
        String strValueOf = i10 == -1 ? "FULL" : String.valueOf(i10);
        String strValueOf2 = i11 == -2 ? "AUTO" : String.valueOf(i11);
        this(i10, i11, o2.r(new StringBuilder(String.valueOf(strValueOf2).length() + String.valueOf(strValueOf).length() + 1 + 3), strValueOf, "x", strValueOf2, "_as"));
    }

    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        AdSize adSizeZzj = com.google.android.gms.ads.internal.util.client.zzf.zzj(context, i10, 50, 0);
        adSizeZzj.zze = true;
        return adSizeZzj;
    }

    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i10) {
        int iZzp = com.google.android.gms.ads.internal.util.client.zzf.zzp(context, 0);
        if (iZzp == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i10, 0);
        adSize.zzg = iZzp;
        adSize.zzf = true;
        return adSize;
    }

    public static AdSize getInlineAdaptiveBannerAdSize(int i10, int i11) {
        AdSize adSize = new AdSize(i10, 0);
        adSize.zzg = i11;
        adSize.zzf = true;
        if (i11 < 32) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            sb2.append("The maximum height set for the inline adaptive ad size was ");
            sb2.append(i11);
            sb2.append(" dp, which is below the minimum recommended value of 32 dp.");
            zzo.zzi(sb2.toString());
        }
        return adSize;
    }

    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        AdSize adSizeZzj = com.google.android.gms.ads.internal.util.client.zzf.zzj(context, i10, 50, 2);
        adSizeZzj.zze = true;
        return adSizeZzj;
    }

    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(Context context, int i10) {
        int iZzp = com.google.android.gms.ads.internal.util.client.zzf.zzp(context, 2);
        AdSize adSize = new AdSize(i10, 0);
        if (iZzp == -1) {
            return INVALID;
        }
        adSize.zzg = iZzp;
        adSize.zzf = true;
        return adSize;
    }

    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        AdSize adSizeZzj = com.google.android.gms.ads.internal.util.client.zzf.zzj(context, i10, 50, 1);
        adSizeZzj.zze = true;
        return adSizeZzj;
    }

    public static AdSize getPortraitInlineAdaptiveBannerAdSize(Context context, int i10) {
        int iZzp = com.google.android.gms.ads.internal.util.client.zzf.zzp(context, 1);
        AdSize adSize = new AdSize(i10, 0);
        if (iZzp == -1) {
            return INVALID;
        }
        adSize.zzg = iZzp;
        adSize.zzf = true;
        return adSize;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.zzb == adSize.zzb && this.zzc == adSize.zzc && this.zzd.equals(adSize.zzd);
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getHeightInPixels(Context context) {
        int i10 = this.zzc;
        if (i10 == -4 || i10 == -3) {
            return -1;
        }
        if (i10 == -2) {
            return zzr.zza(context.getResources().getDisplayMetrics());
        }
        zzbb.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i10);
    }

    public int getWidth() {
        return this.zzb;
    }

    public int getWidthInPixels(Context context) {
        int i10 = this.zzb;
        if (i10 == -3) {
            return -1;
        }
        if (i10 != -1) {
            zzbb.zza();
            return com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i10);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<zzr> creator = zzr.CREATOR;
        return displayMetrics.widthPixels;
    }

    public int hashCode() {
        return this.zzd.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zzc == -2;
    }

    public boolean isFluid() {
        return this.zzb == -3 && this.zzc == -4;
    }

    public boolean isFullWidth() {
        return this.zzb == -1;
    }

    public String toString() {
        return this.zzd;
    }

    public final boolean zza() {
        return this.zze;
    }

    public final boolean zzb() {
        return this.zzf;
    }

    public final void zzc(boolean z10) {
        this.zzf = true;
    }

    public final void zzd(int i10) {
        this.zzg = i10;
    }

    public final int zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final void zzg(boolean z10) {
        this.zzh = true;
    }

    public final int zzh() {
        return this.zzi;
    }

    public final void zzi(int i10) {
        this.zzi = i10;
    }

    public AdSize(int i10, int i11, String str) {
        if (i10 < 0 && i10 != -1 && i10 != -3) {
            throw new IllegalArgumentException(o2.l(i10, "Invalid width for AdSize: ", new StringBuilder(String.valueOf(i10).length() + 26)));
        }
        if (i11 < 0 && i11 != -2 && i11 != -4) {
            throw new IllegalArgumentException(o2.l(i11, "Invalid height for AdSize: ", new StringBuilder(String.valueOf(i11).length() + 27)));
        }
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = str;
    }
}
