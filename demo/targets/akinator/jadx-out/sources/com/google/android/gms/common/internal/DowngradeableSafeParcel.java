package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    private static final Object zza = new Object();
    private boolean zzb = false;

    public static boolean canUnparcelSafely(String str) {
        synchronized (zza) {
        }
        return true;
    }

    public static Integer getUnparcelClientVersion() {
        synchronized (zza) {
        }
        return null;
    }

    public abstract boolean prepareForClientVersion(int i10);

    public void setShouldDowngrade(boolean z10) {
        this.zzb = z10;
    }

    public boolean shouldDowngrade() {
        return this.zzb;
    }
}
