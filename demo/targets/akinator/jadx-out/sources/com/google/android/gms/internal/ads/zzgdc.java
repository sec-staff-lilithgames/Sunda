package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgdc extends zzgdh {
    private final Context zza;
    private final Map zzb;

    public zzgdc(zzauc zzaucVar, zzgcd zzgcdVar, Map map, Context context, zzgjd zzgjdVar) {
        super("yl2V2fIFd/+gtM2i3wtw7rRydnC7INCVtpRFdnYEC9BkEYS1KI4o6evRDqm9gjRN", "/ngo8an629JW3IpM1KyGjEthGKpic0JTOThCbrYq6ZE=", zzaucVar, zzgcdVar, zzgjdVar.zza(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL));
        this.zza = context;
        this.zzb = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final void zza(Method method, zzauc zzaucVar) throws IllegalAccessException, InvocationTargetException {
        Long lValueOf = -1L;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Long l9 = (Long) method.invoke("", this.zza);
                if (l9 == null) {
                    throw null;
                }
                lValueOf = l9;
            } else {
                n1 n1Var = (n1) this.zzb.get("gs");
                if (n1Var != null && n1Var.isDone()) {
                    lValueOf = Long.valueOf(((zzauz) n1Var.get()).zze());
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        synchronized (zzaucVar) {
            zzaucVar.zzR(lValueOf.longValue());
        }
    }
}
