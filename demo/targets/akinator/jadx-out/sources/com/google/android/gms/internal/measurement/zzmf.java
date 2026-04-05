package com.google.android.gms.internal.measurement;

import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.google.android.gms.internal.measurement.zzmb;
import com.google.android.gms.internal.measurement.zzmf;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzmf<MessageType extends zzmf<MessageType, BuilderType>, BuilderType extends zzmb<MessageType, BuilderType>> extends zzks<MessageType, BuilderType> {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb = -1;
    protected zzoj zzc = zzoj.zza();

    private final int zzc(zznx zznxVar) {
        return zznu.zza().zzb(getClass()).zze(this);
    }

    public static zzmf zzco(Class cls) throws ClassNotFoundException {
        Map map = zzd;
        zzmf zzmfVar = (zzmf) map.get(cls);
        if (zzmfVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzmfVar = (zzmf) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzmfVar != null) {
            return zzmfVar;
        }
        zzmf zzmfVar2 = (zzmf) ((zzmf) zzop.zzc(cls)).zzl(6, null, null);
        if (zzmfVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzmfVar2);
        return zzmfVar2;
    }

    public static void zzcp(Class cls, zzmf zzmfVar) {
        zzmfVar.zzcg();
        zzd.put(cls, zzmfVar);
    }

    public static Object zzcq(zznm zznmVar, String str, Object[] objArr) {
        return new zznw(zznmVar, str, objArr);
    }

    public static Object zzcr(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static zzmm zzcs() {
        return zzmg.zzd();
    }

    public static zzmn zzct() {
        return zzna.zze();
    }

    public static zzmn zzcu(zzmn zzmnVar) {
        int size = zzmnVar.size();
        return zzmnVar.zzg(size + size);
    }

    public static zzmo zzcv() {
        return zznv.zzd();
    }

    public static zzmo zzcw(zzmo zzmoVar) {
        int size = zzmoVar.size();
        return zzmoVar.zzg(size + size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzd(zzmf zzmfVar, boolean z10) {
        byte bByteValue = ((Byte) zzmfVar.zzl(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zznu.zza().zzb(zzmfVar.getClass()).zzk(zzmfVar);
        if (z10) {
            zzmfVar.zzl(2, true != zZzk ? null : zzmfVar, null);
        }
        return zZzk;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zznu.zza().zzb(getClass()).zzb(this, (zzmf) obj);
    }

    public final int hashCode() {
        if (zzcf()) {
            return zzci();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iZzci = zzci();
        this.zza = iZzci;
        return iZzci;
    }

    public final String toString() {
        return zzno.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zznm
    public final void zzcB(zzlm zzlmVar) throws IOException {
        zznu.zza().zzb(getClass()).zzf(this, zzln.zza(zzlmVar));
    }

    @Override // com.google.android.gms.internal.measurement.zznm
    public final /* synthetic */ zznl zzcC() {
        return (zzmb) zzl(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zznn
    public final boolean zzcD() {
        return zzd(this, true);
    }

    @Override // com.google.android.gms.internal.measurement.zznn
    public final /* synthetic */ zznm zzcE() {
        return (zzmf) zzl(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzks
    public final int zzcd(zznx zznxVar) {
        if (zzcf()) {
            int iZze = zznxVar.zze(this);
            if (iZze >= 0) {
                return iZze;
            }
            StringBuilder sb2 = new StringBuilder(a.a(iZze, 42));
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iZze);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iZze2 = zznxVar.zze(this);
        if (iZze2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iZze2;
            return iZze2;
        }
        StringBuilder sb3 = new StringBuilder(a.a(iZze2, 42));
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iZze2);
        throw new IllegalStateException(sb3.toString());
    }

    public final boolean zzcf() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void zzcg() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final zzmf zzch() {
        return (zzmf) zzl(4, null, null);
    }

    public final int zzci() {
        return zznu.zza().zzb(getClass()).zzc(this);
    }

    public final void zzcj() {
        zznu.zza().zzb(getClass()).zzj(this);
        zzcg();
    }

    public final zzmb zzck() {
        return (zzmb) zzl(5, null, null);
    }

    public final zzmb zzcl() {
        zzmb zzmbVar = (zzmb) zzl(5, null, null);
        zzmbVar.zzbd(this);
        return zzmbVar;
    }

    public final void zzcm(int i10) {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zznm
    public final int zzcn() {
        if (zzcf()) {
            int iZzc = zzc(null);
            if (iZzc >= 0) {
                return iZzc;
            }
            StringBuilder sb2 = new StringBuilder(a.a(iZzc, 42));
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iZzc);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iZzc2 = zzc(null);
        if (iZzc2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iZzc2;
            return iZzc2;
        }
        StringBuilder sb3 = new StringBuilder(a.a(iZzc2, 42));
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iZzc2);
        throw new IllegalStateException(sb3.toString());
    }

    public abstract Object zzl(int i10, Object obj, Object obj2);
}
