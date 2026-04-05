package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzepv implements zzeya {
    private final zzgus zza;
    private final Context zzb;
    private final zzfgn zzc;
    private final View zzd;

    public zzepv(zzgus zzgusVar, Context context, zzfgn zzfgnVar, ViewGroup viewGroup) {
        this.zza = zzgusVar;
        this.zzb = context;
        this.zzc = zzfgnVar;
        this.zzd = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        zzbeu.zza(this.zzb);
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzepu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 3;
    }

    public final /* synthetic */ zzepw zzc() {
        ArrayList arrayList = new ArrayList();
        View view = this.zzd;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzepw(this.zzb, this.zzc.zzf, arrayList);
    }
}
