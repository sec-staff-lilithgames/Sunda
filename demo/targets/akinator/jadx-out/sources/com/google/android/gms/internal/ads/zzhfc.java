package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhfc {
    public static final zzhsz zza = zzhsz.zza(new byte[0]);

    public static final zzhsz zza(int i10) {
        return zzhsz.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(i10).array());
    }

    public static final zzhsz zzb(int i10) {
        return zzhsz.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(i10).array());
    }
}
