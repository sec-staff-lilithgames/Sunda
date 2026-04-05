package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhyq extends zzhvi {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzhvi zzd;
    private final zzhvi zze;
    private final int zzf;
    private final int zzg;

    public /* synthetic */ zzhyq(zzhvi zzhviVar, zzhvi zzhviVar2, byte[] bArr) {
        this(zzhviVar, zzhviVar2);
    }

    private static zzhvi zzD(zzhvi zzhviVar, zzhvi zzhviVar2) {
        int iZzc = zzhviVar.zzc();
        int iZzc2 = zzhviVar2.zzc();
        byte[] bArr = new byte[iZzc + iZzc2];
        zzhviVar.zzu(bArr, 0, 0, iZzc);
        zzhviVar2.zzu(bArr, 0, iZzc, iZzc2);
        return new zzhvg(bArr);
    }

    public static zzhvi zzd(zzhvi zzhviVar, zzhvi zzhviVar2) {
        if (zzhviVar2.zzc() == 0) {
            return zzhviVar;
        }
        if (zzhviVar.zzc() == 0) {
            return zzhviVar2;
        }
        int iZzc = zzhviVar2.zzc() + zzhviVar.zzc();
        if (iZzc < 128) {
            return zzD(zzhviVar, zzhviVar2);
        }
        if (zzhviVar instanceof zzhyq) {
            zzhyq zzhyqVar = (zzhyq) zzhviVar;
            zzhvi zzhviVar3 = zzhyqVar.zze;
            if (zzhviVar2.zzc() + zzhviVar3.zzc() < 128) {
                return new zzhyq(zzhyqVar.zzd, zzD(zzhviVar3, zzhviVar2));
            }
            zzhvi zzhviVar4 = zzhyqVar.zzd;
            if (zzhviVar4.zzf() > zzhviVar3.zzf() && zzhyqVar.zzg > zzhviVar2.zzf()) {
                return new zzhyq(zzhviVar4, new zzhyq(zzhviVar3, zzhviVar2));
            }
        }
        return iZzc >= zzh(Math.max(zzhviVar.zzf(), zzhviVar2.zzf()) + 1) ? new zzhyq(zzhviVar, zzhviVar2) : zzhyo.zza(zzhviVar, zzhviVar2, new ArrayDeque());
    }

    public static int zzh(int i10) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzhvi
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhvi)) {
            return false;
        }
        zzhvi zzhviVar = (zzhvi) obj;
        int i10 = this.zzc;
        if (i10 != zzhviVar.zzc()) {
            return false;
        }
        if (i10 == 0) {
            return true;
        }
        int iZzy = zzy();
        int iZzy2 = zzhviVar.zzy();
        if (iZzy != 0 && iZzy2 != 0 && iZzy != iZzy2) {
            return false;
        }
        byte[] bArr = null;
        zzhyp zzhypVar = new zzhyp(this, bArr);
        zzhvf zzhvfVarZza = zzhypVar.next();
        zzhyp zzhypVar2 = new zzhyp(zzhviVar, bArr);
        zzhvf zzhvfVarZza2 = zzhypVar2.next();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int iZzc = zzhvfVarZza.zzc() - i11;
            int iZzc2 = zzhvfVarZza2.zzc() - i12;
            int iMin = Math.min(iZzc, iZzc2);
            if (!(i11 == 0 ? zzhvfVarZza.zzh(zzhvfVarZza2, i12, iMin) : zzhvfVarZza2.zzh(zzhvfVarZza, i11, iMin))) {
                return false;
            }
            i13 += iMin;
            if (i13 >= i10) {
                if (i13 == i10) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzc) {
                zzhvfVarZza = zzhypVar.next();
                i11 = 0;
            } else {
                i11 += iMin;
                zzhvfVarZza = zzhvfVarZza;
            }
            if (iMin == iZzc2) {
                zzhvfVarZza2 = zzhypVar2.next();
                i12 = 0;
            } else {
                i12 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhvi, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzhyn(this);
    }

    public final /* synthetic */ zzhvi zzB() {
        return this.zzd;
    }

    public final /* synthetic */ zzhvi zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhvi
    public final byte zza(int i10) {
        zzhvi.zzz(i10, this.zzc);
        return zzb(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhvi
    public final byte zzb(int i10) {
        int i11 = this.zzf;
        return i10 < i11 ? this.zzd.zzb(i10) : this.zze.zzb(i10 - i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhvi
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhvi
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            this.zzd.zze(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.zze.zze(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.zzd.zze(bArr, i10, i11, i15);
            this.zze.zze(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhvi
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzhvi
    public final boolean zzg() {
        return this.zzc >= zzh(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzhvi
    public final zzhvi zzi(int i10, int i11) {
        int i12 = this.zzc;
        int iZzA = zzhvi.zzA(i10, i11, i12);
        if (iZzA == 0) {
            return zzhvi.zzb;
        }
        if (iZzA == i12) {
            return this;
        }
        int i13 = this.zzf;
        if (i11 <= i13) {
            return this.zzd.zzi(i10, i11);
        }
        int i14 = i11 - i13;
        if (i10 >= i13) {
            return this.zze.zzi(i10 - i13, i14);
        }
        zzhvi zzhviVar = this.zzd;
        return new zzhyq(zzhviVar.zzi(i10, zzhviVar.zzc()), this.zze.zzi(0, i14));
    }

    @Override // com.google.android.gms.internal.ads.zzhvi
    public final ByteBuffer zzj() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhvi
    public final void zzk(zzhuz zzhuzVar) throws IOException {
        this.zzd.zzk(zzhuzVar);
        this.zze.zzk(zzhuzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhvi
    public final String zzl(Charset charset) {
        return new String(zzv(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzhvi
    public final boolean zzm() {
        zzhvi zzhviVar = this.zzd;
        zzhvi zzhviVar2 = this.zze;
        return zzhviVar2.zzn(zzhviVar.zzn(0, 0, this.zzf), 0, zzhviVar2.zzc()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhvi
    public final int zzn(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzn(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzn(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzn(this.zzd.zzn(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.zzhvi
    public final int zzo(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzo(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzo(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzo(this.zzd.zzo(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.zzhvi
    public final zzhvn zzp() {
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        zzhyp zzhypVar = new zzhyp(this, bArr);
        while (zzhypVar.hasNext()) {
            arrayList.add(zzhypVar.next().zzj());
        }
        Iterator it = arrayList.iterator();
        int i10 = 0;
        int iRemaining = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            iRemaining += byteBuffer.remaining();
            i10 = byteBuffer.hasArray() ? i10 | 1 : byteBuffer.isDirect() ? i10 | 2 : i10 | 4;
        }
        return i10 == 2 ? new zzhvk(arrayList, iRemaining, true, bArr) : zzhvn.zzF(new zzhxe(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzhvi
    /* renamed from: zzq */
    public final zzhvd iterator() {
        return new zzhyn(this);
    }

    private zzhyq(zzhvi zzhviVar, zzhvi zzhviVar2) {
        this.zzd = zzhviVar;
        this.zze = zzhviVar2;
        int iZzc = zzhviVar.zzc();
        this.zzf = iZzc;
        this.zzc = zzhviVar2.zzc() + iZzc;
        this.zzg = Math.max(zzhviVar.zzf(), zzhviVar2.zzf()) + 1;
    }
}
