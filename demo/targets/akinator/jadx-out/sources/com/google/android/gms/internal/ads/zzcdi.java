package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzcdi {
    private static final AtomicInteger zza = new AtomicInteger(0);
    private static final AtomicInteger zzb = new AtomicInteger(0);

    public static int zzP() {
        return zza.get();
    }

    public static int zzQ() {
        return zzb.get();
    }

    public static AtomicInteger zzf() {
        return zza;
    }

    public static AtomicInteger zzi() {
        return zzb;
    }

    public abstract void zzA(int i10);

    public abstract boolean zzB();

    public abstract int zzC();

    public abstract long zzD();

    public abstract void zzE(boolean z10);

    public abstract void zzF(int i10);

    public abstract void zzG(int i10);

    public abstract long zzH();

    public abstract long zzI();

    public abstract long zzJ();

    public abstract long zzK();

    public abstract int zzL();

    public abstract void zzM(boolean z10);

    public abstract long zzN();

    public abstract long zzO();

    public abstract Integer zzj();

    public abstract void zzn(Integer num);

    public abstract void zzq(Uri[] uriArr, String str);

    public abstract void zzr(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10);

    public abstract void zzs(zzcdh zzcdhVar);

    public abstract void zzt();

    public abstract void zzu(Surface surface, boolean z10) throws IOException;

    public abstract void zzv(float f10, boolean z10) throws IOException;

    public abstract void zzw();

    public abstract void zzx(long j10);

    public abstract void zzy(int i10);

    public abstract void zzz(int i10);
}
