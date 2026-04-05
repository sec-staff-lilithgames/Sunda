package com.google.android.gms.internal.ads;

import a0.c;
import b0.e2;
import com.google.android.gms.internal.ads.zzhuq;
import com.google.android.gms.internal.ads.zzhur;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzhuq<MessageType extends zzhur<MessageType, BuilderType>, BuilderType extends zzhuq<MessageType, BuilderType>> implements zzhxy {
    private String zza(String str) {
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 16 + String.valueOf(str).length() + 44);
        com.google.android.gms.internal.play_billing.a.B(sb2, "Reading ", name, " from a ", str);
        sb2.append(" threw an IOException (should never happen).");
        return sb2.toString();
    }

    public static zzhzb zzaR(zzhxz zzhxzVar) {
        return new zzhzb(zzhxzVar);
    }

    @Deprecated
    public static <T> void zzaS(Iterable<T> iterable, Collection<? super T> collection) {
        zzaT(iterable, (List) collection);
    }

    public static <T> void zzaT(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzhxb.zzb;
        iterable.getClass();
        if (!(iterable instanceof zzhxk)) {
            if (iterable instanceof zzhyi) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List listZza = ((zzhxk) iterable).zza();
        zzhxk zzhxkVar = (zzhxk) list;
        int size = list.size();
        for (Object obj : listZza) {
            if (obj == null) {
                int size2 = zzhxkVar.size() - size;
                String strN = e2.n(new StringBuilder(String.valueOf(size2).length() + 26), "Element at index ", size2, " is null.");
                int size3 = zzhxkVar.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(strN);
                    }
                    zzhxkVar.remove(size3);
                }
            } else if (obj instanceof zzhvi) {
                zzhxkVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                zzhvi.zzr(bArr2, 0, bArr2.length);
                zzhxkVar.zzb();
            } else {
                zzhxkVar.add((String) obj);
            }
        }
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzhyk) {
                ((zzhyk) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    zzc(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            c cVar = (Object) list2.get(i10);
            if (cVar == null) {
                zzc(list, size2);
            }
            list.add(cVar);
        }
    }

    private static void zzc(List<?> list, int i10) {
        int size = list.size() - i10;
        String strN = e2.n(new StringBuilder(String.valueOf(size).length() + 26), "Element at index ", size, " is null.");
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i10) {
                throw new NullPointerException(strN);
            }
            list.remove(size2);
        }
    }

    @Override // 
    /* renamed from: zzaC, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BuilderType zzbf();

    /* renamed from: zzaD, reason: merged with bridge method [inline-methods] */
    public BuilderType zzbe(zzhvn zzhvnVar) throws IOException {
        int i10 = zzhvy.zzb;
        int i11 = zzhuv.zza;
        return (BuilderType) zzbd(zzhvnVar, zzhvy.zza);
    }

    @Override // 
    /* renamed from: zzaE, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzbd(zzhvn zzhvnVar, zzhvy zzhvyVar) throws IOException;

    public BuilderType zzaF(zzhvi zzhviVar) throws zzhxd {
        try {
            zzhvn zzhvnVarZzp = zzhviVar.zzp();
            zzbe(zzhvnVarZzp);
            zzhvnVarZzp.zzb(0);
            return this;
        } catch (zzhxd e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("ByteString"), e11);
        }
    }

    public BuilderType zzaG(zzhvi zzhviVar, zzhvy zzhvyVar) throws zzhxd {
        try {
            zzhvn zzhvnVarZzp = zzhviVar.zzp();
            zzbd(zzhvnVarZzp, zzhvyVar);
            zzhvnVarZzp.zzb(0);
            return this;
        } catch (zzhxd e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("ByteString"), e11);
        }
    }

    /* renamed from: zzaH, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr) throws zzhxd {
        return (BuilderType) zzaZ(bArr, 0, bArr.length);
    }

    @Override // 
    /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i10, int i11) throws zzhxd {
        try {
            zzhvn zzhvnVarZzG = zzhvn.zzG(bArr, i10, i11, false);
            zzbe(zzhvnVarZzG);
            zzhvnVarZzG.zzb(0);
            return this;
        } catch (zzhxd e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("byte array"), e11);
        }
    }

    /* renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zzhvy zzhvyVar) throws zzhxd {
        return (BuilderType) zzaX(bArr, 0, bArr.length, zzhvyVar);
    }

    @Override // 
    /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaX(byte[] bArr, int i10, int i11, zzhvy zzhvyVar) throws zzhxd {
        try {
            zzhvn zzhvnVarZzG = zzhvn.zzG(bArr, i10, i11, false);
            zzbd(zzhvnVarZzG, zzhvyVar);
            zzhvnVarZzG.zzb(0);
            return this;
        } catch (zzhxd e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("byte array"), e11);
        }
    }

    public BuilderType zzaL(InputStream inputStream) throws IOException {
        zzhvn zzhvnVarZzF = zzhvn.zzF(inputStream, 4096);
        zzbe(zzhvnVarZzF);
        zzhvnVarZzF.zzb(0);
        return this;
    }

    public BuilderType zzaM(InputStream inputStream, zzhvy zzhvyVar) throws IOException {
        zzhvn zzhvnVarZzF = zzhvn.zzF(inputStream, 4096);
        zzbd(zzhvnVarZzF, zzhvyVar);
        zzhvnVarZzF.zzb(0);
        return this;
    }

    public boolean zzaN(InputStream inputStream, zzhvy zzhvyVar) throws IOException {
        int i10 = inputStream.read();
        if (i10 == -1) {
            return false;
        }
        zzaM(new zzhup(inputStream, zzhvn.zzM(i10, inputStream)), zzhvyVar);
        return true;
    }

    public boolean zzaO(InputStream inputStream) throws IOException {
        int i10 = zzhvy.zzb;
        int i11 = zzhuv.zza;
        return zzaN(inputStream, zzhvy.zza);
    }

    /* renamed from: zzaP, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(zzhxz zzhxzVar) {
        if (zzbw().getClass().isInstance(zzhxzVar)) {
            return (BuilderType) zzaQ((zzhur) zzhxzVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public abstract BuilderType zzaQ(MessageType messagetype);

    public /* bridge */ /* synthetic */ zzhxy zzaV(InputStream inputStream, zzhvy zzhvyVar) throws IOException {
        zzaM(inputStream, zzhvyVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhxy zzaW(InputStream inputStream) throws IOException {
        zzaL(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhxy zzbb(zzhvi zzhviVar, zzhvy zzhvyVar) throws zzhxd {
        zzaG(zzhviVar, zzhvyVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhxy zzbc(zzhvi zzhviVar) throws zzhxd {
        zzaF(zzhviVar);
        return this;
    }
}
