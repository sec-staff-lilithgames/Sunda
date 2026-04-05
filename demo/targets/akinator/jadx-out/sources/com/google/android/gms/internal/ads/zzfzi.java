package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfzi {
    private final ExecutorService zza;

    public zzfzi(ExecutorService executorService) {
        this.zza = executorService;
    }

    public final zzfyz zza(File file, zzhxz zzhxzVar, Function function) {
        return new zzfzh(file, this.zza, new zzfzf(zzhxzVar), function);
    }

    public final zzfyz zzb(File file, byte[] bArr, Function function) {
        return new zzfzh(file, this.zza, new zzfzb(bArr), function);
    }
}
