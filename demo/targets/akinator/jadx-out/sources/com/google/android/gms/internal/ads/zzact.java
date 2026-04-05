package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzact implements zzacu {
    static final /* synthetic */ zzact zza = new zzact();

    private /* synthetic */ zzact() {
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ Constructor zza() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i10 = zzacw.zza;
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzada.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
}
