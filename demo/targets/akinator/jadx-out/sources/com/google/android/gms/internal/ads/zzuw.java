package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface zzuw {
    void zzD(zzus zzusVar);

    zzus zzG(zzuu zzuuVar, zzyv zzyvVar, long j10);

    default zzbf zzH() {
        return null;
    }

    default boolean zzI() {
        return true;
    }

    zzak zzJ();

    void zzl(Handler handler, zzvf zzvfVar);

    void zzm(zzvf zzvfVar);

    void zzn(Handler handler, zzrv zzrvVar);

    void zzo(zzrv zzrvVar);

    void zzp(zzuv zzuvVar, zzgz zzgzVar, zzpc zzpcVar);

    void zzq(zzuv zzuvVar);

    void zzr(zzuv zzuvVar);

    void zzs(zzuv zzuvVar);

    void zzt() throws IOException;

    default void zzA(zzak zzakVar) {
    }
}
