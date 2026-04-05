package com.google.android.gms.internal.gtm;

import a.b;
import com.google.android.gms.internal.gtm.zzaca;
import com.google.android.gms.internal.gtm.zzacf;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzacf<MessageType extends zzacf<MessageType, BuilderType>, BuilderType extends zzaca<MessageType, BuilderType>> extends zzyh<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzaen zzc = zzaen.zzc();

    public static zzace zzab(zzadl zzadlVar, zzadl zzadlVar2, zzaci zzaciVar, int i10, zzaex zzaexVar, boolean z10, Class cls) {
        return new zzace(zzadlVar, zzadu.zze(), zzadlVar2, new zzacd(null, i10, zzaexVar, true, false), cls);
    }

    public static zzace zzac(zzadl zzadlVar, Object obj, zzadl zzadlVar2, zzaci zzaciVar, int i10, zzaex zzaexVar, Class cls) {
        return new zzace(zzadlVar, obj, zzadlVar2, new zzacd(zzaciVar, i10, zzaexVar, false, false), cls);
    }

    public static zzacf zzad(Class cls) throws ClassNotFoundException {
        Map map = zza;
        zzacf zzacfVar = (zzacf) map.get(cls);
        if (zzacfVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzacfVar = (zzacf) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzacfVar != null) {
            return zzacfVar;
        }
        zzacf zzacfVar2 = (zzacf) ((zzacf) zzaet.zze(cls)).zzb(6, null, null);
        if (zzacfVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzacfVar2);
        return zzacfVar2;
    }

    public static zzacf zzaf(zzacf zzacfVar, InputStream inputStream, zzabq zzabqVar) throws zzacq {
        zzyz zzyzVar = new zzyz(inputStream, 4096, null);
        zzacf zzacfVarZzae = zzacfVar.zzae();
        try {
            zzadx zzadxVarZzb = zzadt.zza().zzb(zzacfVarZzae.getClass());
            zzadxVarZzb.zzh(zzacfVarZzae, zzzc.zzq(zzyzVar), zzabqVar);
            zzadxVarZzb.zzf(zzacfVarZzae);
            zze(zzacfVarZzae);
            return zzacfVarZzae;
        } catch (zzacq e10) {
            if (e10.zzb()) {
                throw new zzacq(e10);
            }
            throw e10;
        } catch (zzael e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzacq) {
                throw ((zzacq) e12.getCause());
            }
            throw new zzacq(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzacq) {
                throw ((zzacq) e13.getCause());
            }
            throw e13;
        }
    }

    public static zzacf zzag(zzacf zzacfVar, byte[] bArr, zzabq zzabqVar) throws zzacq {
        zzacf zzacfVarZzf = zzf(zzacfVar, bArr, 0, bArr.length, zzabqVar);
        zze(zzacfVarZzf);
        return zzacfVarZzf;
    }

    public static zzack zzah() {
        return zzacg.zzf();
    }

    public static zzacn zzai() {
        return zzadu.zze();
    }

    public static zzacn zzaj(zzacn zzacnVar) {
        int size = zzacnVar.size();
        return zzacnVar.zzd(size + size);
    }

    public static Object zzak(Method method, Object obj, Object... objArr) {
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

    public static Object zzal(zzadl zzadlVar, String str, Object[] objArr) {
        return new zzadv(zzadlVar, str, objArr);
    }

    public static void zzao(Class cls, zzacf zzacfVar) {
        zzacfVar.zzan();
        zza.put(cls, zzacfVar);
    }

    public static final boolean zzaq(zzacf zzacfVar, boolean z10) {
        byte bByteValue = ((Byte) zzacfVar.zzb(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzadt.zza().zzb(zzacfVar.getClass()).zzl(zzacfVar);
        if (z10) {
            zzacfVar.zzb(2, true != zZzl ? null : zzacfVar, null);
        }
        return zZzl;
    }

    private final int zzc(zzadx zzadxVar) {
        return zzadt.zza().zzb(getClass()).zza(this);
    }

    private static zzacf zze(zzacf zzacfVar) throws zzacq {
        if (zzacfVar == null || zzaq(zzacfVar, true)) {
            return zzacfVar;
        }
        throw new zzael(zzacfVar).zza();
    }

    private static zzacf zzf(zzacf zzacfVar, byte[] bArr, int i10, int i11, zzabq zzabqVar) throws zzacq {
        if (i11 == 0) {
            return zzacfVar;
        }
        zzacf zzacfVarZzae = zzacfVar.zzae();
        try {
            zzadx zzadxVarZzb = zzadt.zza().zzb(zzacfVarZzae.getClass());
            zzadxVarZzb.zzi(zzacfVarZzae, bArr, 0, i11, new zzyl(zzabqVar));
            zzadxVarZzb.zzf(zzacfVarZzae);
            return zzacfVarZzae;
        } catch (zzacq e10) {
            if (e10.zzb()) {
                throw new zzacq(e10);
            }
            throw e10;
        } catch (zzael e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzacq) {
                throw ((zzacq) e12.getCause());
            }
            throw new zzacq(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzadt.zza().zzb(getClass()).zzk(this, (zzacf) obj);
    }

    public final int hashCode() {
        if (zzar()) {
            return zzX();
        }
        int i10 = this.zzb;
        if (i10 != 0) {
            return i10;
        }
        int iZzX = zzX();
        this.zzb = iZzX;
        return iZzX;
    }

    public final String toString() {
        return zzadn.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.gtm.zzyh
    public final int zzQ(zzadx zzadxVar) {
        if (zzar()) {
            int iZza = zzadxVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException(b.e(iZza, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iZza2 = zzadxVar.zza(this);
        if (iZza2 < 0) {
            throw new IllegalStateException(b.e(iZza2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
        return iZza2;
    }

    public final int zzX() {
        return zzadt.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.gtm.zzadl
    public final int zzY() {
        if (zzar()) {
            int iZzc = zzc(null);
            if (iZzc >= 0) {
                return iZzc;
            }
            throw new IllegalStateException(b.e(iZzc, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iZzc2 = zzc(null);
        if (iZzc2 < 0) {
            throw new IllegalStateException(b.e(iZzc2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iZzc2;
        return iZzc2;
    }

    public final zzaca zzZ() {
        return (zzaca) zzb(5, null, null);
    }

    public final zzaca zzaa() {
        zzaca zzacaVar = (zzaca) zzb(5, null, null);
        zzacaVar.zzA(this);
        return zzacaVar;
    }

    public final zzacf zzae() {
        return (zzacf) zzb(4, null, null);
    }

    public final void zzam() {
        zzadt.zza().zzb(getClass()).zzf(this);
        zzan();
    }

    public final void zzan() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzap(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean zzar() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.gtm.zzadl
    public final /* synthetic */ zzadk zzav() {
        return (zzaca) zzb(5, null, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzadl
    public final /* synthetic */ zzadk zzaw() {
        zzaca zzacaVar = (zzaca) zzb(5, null, null);
        zzacaVar.zzA(this);
        return zzacaVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzadl
    public final void zzax(zzzi zzziVar) throws IOException {
        zzadt.zza().zzb(getClass()).zzj(this, zzzj.zza(zzziVar));
    }

    @Override // com.google.android.gms.internal.gtm.zzadm
    public final /* synthetic */ zzadl zzay() {
        return (zzacf) zzb(6, null, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzadm
    public final boolean zzaz() {
        return zzaq(this, true);
    }

    public abstract Object zzb(int i10, Object obj, Object obj2);
}
