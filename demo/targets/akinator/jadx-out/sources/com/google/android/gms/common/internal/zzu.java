package com.google.android.gms.common.internal;

import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzu {
    public static final /* synthetic */ int zza = 0;
    private static final Uri zzb;
    private static final Uri zzc;

    static {
        Uri uri = Uri.parse("https://plus.google.com/");
        zzb = uri;
        zzc = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
