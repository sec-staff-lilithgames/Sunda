package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcv {
    @EnsuresNonNull({"#1"})
    @Deprecated
    @Pure
    public static String zza(String str) {
        zzgmd.zza(!TextUtils.isEmpty(str));
        return str;
    }
}
