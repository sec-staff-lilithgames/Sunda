package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzfkk {
    private static final n1 zza = zzgui.zza(null);
    private final zzgus zzb;
    private final ScheduledExecutorService zzc;
    private final zzfkl zzd;

    public zzfkk(zzgus zzgusVar, ScheduledExecutorService scheduledExecutorService, zzfkl zzfklVar) {
        this.zzb = zzgusVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfklVar;
    }

    public final zzfkj zza(Object obj, n1 n1Var) {
        return new zzfkj(this, obj, null, n1Var, Collections.singletonList(n1Var), n1Var, null);
    }

    public final zzfkb zzb(Object obj, n1... n1VarArr) {
        return new zzfkb(this, obj, Arrays.asList(n1VarArr), null);
    }

    public abstract String zzc(Object obj);

    public final /* synthetic */ zzgus zze() {
        return this.zzb;
    }

    public final /* synthetic */ ScheduledExecutorService zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzfkl zzg() {
        return this.zzd;
    }
}
