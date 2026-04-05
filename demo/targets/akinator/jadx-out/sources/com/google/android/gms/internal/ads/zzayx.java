package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzayx extends zzazr {
    private final zzaye zzh;

    public zzayx(zzayd zzaydVar, String str, String str2, zzauc zzaucVar, int i10, int i11, zzaye zzayeVar) {
        super(zzaydVar, "OKoG374XK3cB1cjYFPuO/Bg6vy6AufzuCyu4QCURxkWhJwL4+NqQjs8XziSHB+CQ", "PjHrXBXcXoGkJe75zH8RZ0khapXmOV4o2gX+YgkGdus=", zzaucVar, i10, 85);
        this.zzh = zzayeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Method method = this.zze;
        zzaye zzayeVar = this.zzh;
        long[] jArr = (long[]) method.invoke(null, Long.valueOf(zzayeVar.zzf()), Long.valueOf(zzayeVar.zzg()), Long.valueOf(zzayeVar.zzi()), Long.valueOf(zzayeVar.zzh()));
        zzauc zzaucVar = this.zzd;
        synchronized (zzaucVar) {
            zzaucVar.zzY(jArr[0]);
            zzaucVar.zzZ(jArr[1]);
        }
    }
}
