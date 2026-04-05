package com.google.android.gms.internal.play_billing;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbv {
    private static final Collector zza = Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.zzbj
        @Override // java.util.function.Supplier
        public final Object get() {
            return new zzck(4);
        }
    }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.zzbm
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((zzck) obj).zzd(obj2);
        }
    }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.zzbn
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            zzck zzckVar = (zzck) obj;
            zzck zzckVar2 = (zzck) obj2;
            zzckVar.zzb(zzckVar2.zza, zzckVar2.zzb);
            return zzckVar;
        }
    }, new Function() { // from class: com.google.android.gms.internal.play_billing.zzbo
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((zzck) obj).zze();
        }
    }, new Collector.Characteristics[0]);

    static {
        Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.zzbp
            @Override // java.util.function.Supplier
            public final Object get() {
                return new zzcu();
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.zzbq
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((zzcu) obj).zzd(obj2);
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.zzbr
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                zzcu zzcuVar = (zzcu) obj;
                zzcu zzcuVar2 = (zzcu) obj2;
                zzcuVar.zzb(zzcuVar2.zza, zzcuVar2.zzb);
                return zzcuVar;
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.zzbs
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                zzcu zzcuVar = (zzcu) obj;
                int i10 = zzcuVar.zzb;
                if (i10 == 0) {
                    return zzdq.zza;
                }
                if (i10 == 1) {
                    Object obj2 = zzcuVar.zza[0];
                    Objects.requireNonNull(obj2);
                    return new zzdt(obj2);
                }
                zzcv zzcvVarZzl = zzcv.zzl(i10, zzcuVar.zza);
                zzcuVar.zzb = zzcvVarZzl.size();
                zzcuVar.zzc = true;
                return zzcvVarZzl;
            }
        }, new Collector.Characteristics[0]);
        Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.zzbt
            @Override // java.util.function.Supplier
            public final Object get() {
                return new zzcs();
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.zzbu
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((zzcs) obj).zza((zzdh) obj2);
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.zzbk
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                zzcs zzcsVar = (zzcs) obj;
                zzcsVar.zzb((zzcs) obj2);
                return zzcsVar;
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.zzbl
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((zzcs) obj).zzc();
            }
        }, new Collector.Characteristics[0]);
    }

    public static Collector zza() {
        return zza;
    }
}
