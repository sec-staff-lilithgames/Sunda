package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhwi;
import com.google.android.gms.internal.ads.zzhwo;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzhwo<MessageType extends zzhwo<MessageType, BuilderType>, BuilderType extends zzhwi<MessageType, BuilderType>> extends zzhur<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zzhwo<?, ?>> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected zzhzd zzt = zzhzd.zza();

    public static Method zzbA(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            int length = name.length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + length + 43 + 2);
            com.google.android.gms.internal.play_billing.a.B(sb2, "Generated message class \"", name, "\" missing method \"", str);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    public static Object zzbB(Method method, Object obj, Object... objArr) {
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

    public static zzhww zzbC() {
        return zzhwp.zzd();
    }

    public static zzhww zzbD(zzhww zzhwwVar) {
        int size = zzhwwVar.size();
        return zzhwwVar.zzh(size + size);
    }

    public static zzhwz zzbE() {
        return zzhxn.zzg();
    }

    public static zzhwz zzbF(zzhwz zzhwzVar) {
        int size = zzhwzVar.size();
        return zzhwzVar.zzh(size + size);
    }

    public static zzhwv zzbG() {
        return zzhwf.zzd();
    }

    public static zzhwv zzbH(zzhwv zzhwvVar) {
        int size = zzhwvVar.size();
        return zzhwvVar.zzh(size + size);
    }

    public static zzhwr zzbI() {
        return zzhvv.zzd();
    }

    public static zzhwr zzbJ(zzhwr zzhwrVar) {
        int size = zzhwrVar.size();
        return zzhwrVar.zzh(size + size);
    }

    public static zzhwq zzbK() {
        return zzhuy.zzd();
    }

    public static zzhwq zzbL(zzhwq zzhwqVar) {
        int size = zzhwqVar.size();
        return zzhwqVar.zzh(size + size);
    }

    public static <E> zzhxa<E> zzbM() {
        return zzhyk.zzd();
    }

    public static <E> zzhxa<E> zzbN(zzhxa<E> zzhxaVar) {
        int size = zzhxaVar.size();
        return zzhxaVar.zzh(size + size);
    }

    public static <T extends zzhwo<T, ?>> T zzbO(T t10, zzhvn zzhvnVar, zzhvy zzhvyVar) throws zzhxd {
        T t11 = (T) t10.zzbg();
        try {
            zzhyr zzhyrVarZzb = zzhyj.zza().zzb(t11.getClass());
            zzhyrVarZzb.zzg(t11, zzhvo.zza(zzhvnVar), zzhvyVar);
            zzhyrVarZzb.zzk(t11);
            return t11;
        } catch (zzhxd e10) {
            if (e10.zzb()) {
                throw new zzhxd(e10);
            }
            throw e10;
        } catch (zzhzb e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzhxd) {
                throw ((zzhxd) e12.getCause());
            }
            throw new zzhxd(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzhxd) {
                throw ((zzhxd) e13.getCause());
            }
            throw e13;
        }
    }

    public static <T extends zzhwo<T, ?>> T zzbP(T t10, zzhvn zzhvnVar) throws zzhxd {
        int i10 = zzhvy.zzb;
        int i11 = zzhuv.zza;
        return (T) zzbO(t10, zzhvnVar, zzhvy.zza);
    }

    public static <T extends zzhwo<T, ?>> T zzbQ(T t10, ByteBuffer byteBuffer, zzhvy zzhvyVar) throws zzhxd {
        zzhvn zzhvnVarZzG;
        boolean z10 = false;
        if (byteBuffer.hasArray()) {
            zzhvnVarZzG = zzhvn.zzG(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && zzhzj.zzb()) {
            zzhvnVarZzG = new zzhvm(byteBuffer, z10, null);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            zzhvnVarZzG = zzhvn.zzG(bArr, 0, iRemaining, true);
        }
        T t11 = (T) zzbZ(t10, zzhvnVarZzG, zzhvyVar);
        zzi(t11);
        return t11;
    }

    public static <T extends zzhwo<T, ?>> T zzbR(T t10, ByteBuffer byteBuffer) throws zzhxd {
        int i10 = zzhvy.zzb;
        int i11 = zzhuv.zza;
        return (T) zzbQ(t10, byteBuffer, zzhvy.zza);
    }

    public static <T extends zzhwo<T, ?>> T zzbS(T t10, zzhvi zzhviVar) throws zzhxd {
        int i10 = zzhvy.zzb;
        int i11 = zzhuv.zza;
        T t11 = (T) zzbT(t10, zzhviVar, zzhvy.zza);
        zzi(t11);
        return t11;
    }

    public static <T extends zzhwo<T, ?>> T zzbT(T t10, zzhvi zzhviVar, zzhvy zzhvyVar) throws zzhxd {
        T t11 = (T) zzj(t10, zzhviVar, zzhvyVar);
        zzi(t11);
        return t11;
    }

    public static <T extends zzhwo<T, ?>> T zzbU(T t10, byte[] bArr) throws zzhxd {
        int length = bArr.length;
        int i10 = zzhvy.zzb;
        int i11 = zzhuv.zza;
        T t11 = (T) zzh(t10, bArr, 0, length, zzhvy.zza);
        zzi(t11);
        return t11;
    }

    public static <T extends zzhwo<T, ?>> T zzbV(T t10, byte[] bArr, zzhvy zzhvyVar) throws zzhxd {
        T t11 = (T) zzh(t10, bArr, 0, bArr.length, zzhvyVar);
        zzi(t11);
        return t11;
    }

    public static <T extends zzhwo<T, ?>> T zzbW(T t10, InputStream inputStream) throws zzhxd {
        zzhvn zzhvnVarZzF = zzhvn.zzF(inputStream, 4096);
        int i10 = zzhvy.zzb;
        int i11 = zzhuv.zza;
        T t11 = (T) zzbO(t10, zzhvnVarZzF, zzhvy.zza);
        zzi(t11);
        return t11;
    }

    public static <T extends zzhwo<T, ?>> T zzbX(T t10, InputStream inputStream, zzhvy zzhvyVar) throws zzhxd {
        T t11 = (T) zzbO(t10, zzhvn.zzF(inputStream, 4096), zzhvyVar);
        zzi(t11);
        return t11;
    }

    public static <T extends zzhwo<T, ?>> T zzbY(T t10, zzhvn zzhvnVar) throws zzhxd {
        int i10 = zzhvy.zzb;
        int i11 = zzhuv.zza;
        return (T) zzbZ(t10, zzhvnVar, zzhvy.zza);
    }

    public static <T extends zzhwo<T, ?>> T zzbZ(T t10, zzhvn zzhvnVar, zzhvy zzhvyVar) throws zzhxd {
        T t11 = (T) zzbO(t10, zzhvnVar, zzhvyVar);
        zzi(t11);
        return t11;
    }

    public static <T extends zzhwo> T zzbt(Class<T> cls) throws ClassNotFoundException {
        zzhwo<?, ?> zzhwoVar = zzd.get(cls);
        if (zzhwoVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzhwoVar = zzd.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzhwoVar != null) {
            return zzhwoVar;
        }
        zzhwo<?, ?> zzhwoVarZzbw = ((zzhwo) zzhzj.zzc(cls)).zzbw();
        if (zzhwoVarZzbw == null) {
            throw new IllegalStateException();
        }
        zzd.put(cls, zzhwoVarZzbw);
        return zzhwoVarZzbw;
    }

    public static <T extends zzhwo> void zzbu(Class<T> cls, T t10) {
        t10.zzaY();
        zzd.put(cls, t10);
    }

    public static Object zzbv(zzhxz zzhxzVar, String str, Object[] objArr) {
        return new zzhyl(zzhxzVar, str, objArr);
    }

    public static <ContainingType extends zzhxz, Type> zzhwm<ContainingType, Type> zzby(ContainingType containingtype, Type type, zzhxz zzhxzVar, zzhwt zzhwtVar, int i10, zzhzp zzhzpVar, Class cls) {
        return new zzhwm<>(containingtype, type, zzhxzVar, new zzhwl(zzhwtVar, i10, zzhzpVar, false, false), cls);
    }

    public static <ContainingType extends zzhxz, Type> zzhwm<ContainingType, Type> zzbz(ContainingType containingtype, zzhxz zzhxzVar, zzhwt zzhwtVar, int i10, zzhzp zzhzpVar, boolean z10, Class cls) {
        return new zzhwm<>(containingtype, zzhyk.zzd(), zzhxzVar, new zzhwl(zzhwtVar, i10, zzhzpVar, true, z10), cls);
    }

    private void zzc() {
        if (this.zzt == zzhzd.zza()) {
            this.zzt = zzhzd.zzb();
        }
    }

    public static <T extends zzhwo<T, ?>> T zzca(T t10, InputStream inputStream) throws zzhxd {
        int i10 = zzhvy.zzb;
        int i11 = zzhuv.zza;
        T t11 = (T) zzk(t10, inputStream, zzhvy.zza);
        zzi(t11);
        return t11;
    }

    public static <T extends zzhwo<T, ?>> T zzcb(T t10, InputStream inputStream, zzhvy zzhvyVar) throws zzhxd {
        T t11 = (T) zzk(t10, inputStream, zzhvyVar);
        zzi(t11);
        return t11;
    }

    private int zzd(zzhyr<?> zzhyrVar) {
        if (zzhyrVar != null) {
            return zzhyrVar.zze(this);
        }
        return zzhyj.zza().zzb(getClass()).zze(this);
    }

    private static <MessageType extends zzhwk<MessageType, BuilderType>, BuilderType, T> zzhwm<MessageType, T> zze(zzhvw<MessageType, T> zzhvwVar) {
        return (zzhwm) zzhvwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zzhwo<T, ?>> boolean zzg(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.zzdh(zzhwn.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzhyj.zza().zzb(t10.getClass()).zzl(t10);
        if (z10) {
            t10.zzdh(zzhwn.SET_MEMOIZED_IS_INITIALIZED, true != zZzl ? null : t10, null);
        }
        return zZzl;
    }

    private static <T extends zzhwo<T, ?>> T zzh(T t10, byte[] bArr, int i10, int i11, zzhvy zzhvyVar) throws zzhxd {
        if (i11 == 0) {
            return t10;
        }
        T t11 = (T) t10.zzbg();
        try {
            zzhyr zzhyrVarZzb = zzhyj.zza().zzb(t11.getClass());
            zzhyrVarZzb.zzj(t11, bArr, i10, i10 + i11, new zzhuw(zzhvyVar));
            zzhyrVarZzb.zzk(t11);
            return t11;
        } catch (zzhxd e10) {
            if (e10.zzb()) {
                throw new zzhxd(e10);
            }
            throw e10;
        } catch (zzhzb e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzhxd) {
                throw ((zzhxd) e12.getCause());
            }
            throw new zzhxd(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static <T extends zzhwo<T, ?>> T zzi(T t10) throws zzhxd {
        if (t10 == null || t10.zzbi()) {
            return t10;
        }
        throw t10.zzaU().zza();
    }

    private static <T extends zzhwo<T, ?>> T zzj(T t10, zzhvi zzhviVar, zzhvy zzhvyVar) throws zzhxd {
        zzhvn zzhvnVarZzp = zzhviVar.zzp();
        T t11 = (T) zzbO(t10, zzhvnVarZzp, zzhvyVar);
        zzhvnVarZzp.zzb(0);
        return t11;
    }

    private static <T extends zzhwo<T, ?>> T zzk(T t10, InputStream inputStream, zzhvy zzhvyVar) throws IOException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            zzhvn zzhvnVarZzF = zzhvn.zzF(new zzhup(inputStream, zzhvn.zzM(i10, inputStream)), 4096);
            T t11 = (T) zzbO(t10, zzhvnVarZzF, zzhvyVar);
            zzhvnVarZzF.zzb(0);
            return t11;
        } catch (zzhxd e10) {
            if (e10.zzb()) {
                throw new zzhxd(e10);
            }
            throw e10;
        } catch (IOException e11) {
            throw new zzhxd(e11);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzhyj.zza().zzb(getClass()).zzb(this, (zzhwo) obj);
    }

    public int hashCode() {
        if (zzaX()) {
            return zzbh();
        }
        if (zzbc()) {
            zzba(zzbh());
        }
        return zzaZ();
    }

    public String toString() {
        return zzhyb.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhur
    public int zzaQ() {
        return this.zzc & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzhur
    public void zzaR(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(o2.l(i10, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(i10).length() + 42)));
        }
        this.zzc = i10 | (this.zzc & Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzhur
    public int zzaT(zzhyr zzhyrVar) {
        if (zzaX()) {
            int iZzd = zzd(zzhyrVar);
            if (iZzd >= 0) {
                return iZzd;
            }
            throw new IllegalStateException(o2.l(iZzd, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(iZzd).length() + 42)));
        }
        if (zzaQ() != Integer.MAX_VALUE) {
            return zzaQ();
        }
        int iZzd2 = zzd(zzhyrVar);
        zzaR(iZzd2);
        return iZzd2;
    }

    public boolean zzaX() {
        return (this.zzc & Integer.MIN_VALUE) != 0;
    }

    public void zzaY() {
        this.zzc &= Integer.MAX_VALUE;
    }

    public int zzaZ() {
        return this.zzq;
    }

    public void zzba(int i10) {
        this.zzq = i10;
    }

    public void zzbb() {
        this.zzq = 0;
    }

    public boolean zzbc() {
        return zzaZ() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhxz
    public final zzhyh<MessageType> zzbd() {
        return (zzhyh) zzdh(zzhwn.GET_PARSER, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhya
    /* renamed from: zzbe, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbw() {
        return (MessageType) zzdh(zzhwn.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhxz
    /* renamed from: zzbf, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzdd() {
        return (BuilderType) zzdh(zzhwn.NEW_BUILDER, null, null);
    }

    public MessageType zzbg() {
        return (MessageType) zzdh(zzhwn.NEW_MUTABLE_INSTANCE, null, null);
    }

    public int zzbh() {
        return zzhyj.zza().zzb(getClass()).zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhya
    public final boolean zzbi() {
        return zzg(this, true);
    }

    public boolean zzbj(int i10, zzhvn zzhvnVar) throws IOException {
        if ((i10 & 7) == 4) {
            return false;
        }
        zzc();
        return this.zzt.zzl(i10, zzhvnVar);
    }

    public void zzbk(int i10, int i11) {
        zzc();
        zzhzd zzhzdVar = this.zzt;
        zzhzdVar.zze();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhzdVar.zzk(i10 << 3, Long.valueOf(i11));
    }

    public void zzbl(int i10, zzhvi zzhviVar) {
        zzc();
        zzhzd zzhzdVar = this.zzt;
        zzhzdVar.zze();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhzdVar.zzk((i10 << 3) | 2, zzhviVar);
    }

    public void zzbm() {
        zzhyj.zza().zzb(getClass()).zzk(this);
        zzaY();
    }

    public final <MessageType2 extends zzhwo<MessageType2, BuilderType2>, BuilderType2 extends zzhwi<MessageType2, BuilderType2>> BuilderType2 zzbn() {
        return (BuilderType2) zzdh(zzhwn.NEW_BUILDER, null, null);
    }

    public final <MessageType2 extends zzhwo<MessageType2, BuilderType2>, BuilderType2 extends zzhwi<MessageType2, BuilderType2>> BuilderType2 zzbo(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) zzbn();
        buildertype2.zzbo(messagetype2);
        return buildertype2;
    }

    /* renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcc() {
        BuilderType buildertype = (BuilderType) zzdh(zzhwn.NEW_BUILDER, null, null);
        buildertype.zzbo(this);
        return buildertype;
    }

    public void zzbq() {
        zzaR(Integer.MAX_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzhxz
    public int zzbr() {
        return zzaT(null);
    }

    public Object zzbs() throws Exception {
        return zzdh(zzhwn.BUILD_MESSAGE_INFO, null, null);
    }

    public final void zzbx(zzhzd zzhzdVar) {
        this.zzt = zzhzd.zzc(this.zzt, zzhzdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhxz
    public void zzdc(zzhvt zzhvtVar) throws IOException {
        zzhyj.zza().zzb(getClass()).zzf(this, zzhvu.zza(zzhvtVar));
    }

    public abstract Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2);
}
