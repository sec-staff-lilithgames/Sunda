package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.C3227g4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzxt extends zzbl {
    public static final zzxt zzJ = new zzxt(new zzxs());
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final boolean zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final boolean zzY;
    private final SparseArray zzZ;
    private final SparseBooleanArray zzaa;

    static {
        String str = zzep.zza;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(IronSourceError.AUCTION_ERROR_DECRYPTION, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(TTAdConstant.IMAGE_MODE_1012, 36);
        Integer.toString(C3227g4.f36755i, 36);
        Integer.toString(C3227g4.f36756j, 36);
        Integer.toString(1015, 36);
        Integer.toString(C3227g4.f36758l, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public /* synthetic */ zzxt(zzxs zzxsVar, byte[] bArr) {
        this(zzxsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzxt.class == obj.getClass()) {
            zzxt zzxtVar = (zzxt) obj;
            if (super.equals(zzxtVar) && this.zzK == zzxtVar.zzK && this.zzM == zzxtVar.zzM && this.zzO == zzxtVar.zzO && this.zzT == zzxtVar.zzT && this.zzU == zzxtVar.zzU && this.zzV == zzxtVar.zzV && this.zzX == zzxtVar.zzX) {
                SparseBooleanArray sparseBooleanArray = this.zzaa;
                SparseBooleanArray sparseBooleanArray2 = zzxtVar.zzaa;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            SparseArray sparseArray = this.zzZ;
                            SparseArray sparseArray2 = zzxtVar.zzZ;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i11 = 0; i11 < size2; i11++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i11);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzwv zzwvVar = (zzwv) entry.getKey();
                                                if (!map2.containsKey(zzwvVar) || !Objects.equals(entry.getValue(), map2.get(zzwvVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzK ? 1 : 0)) * 961) + (this.zzM ? 1 : 0)) * 961) + (this.zzO ? 1 : 0)) * 28629151) + (this.zzT ? 1 : 0)) * 31) + (this.zzU ? 1 : 0)) * 31) + (this.zzV ? 1 : 0)) * 961) + (this.zzX ? 1 : 0)) * 31;
    }

    public final boolean zza(int i10) {
        return this.zzaa.get(i10);
    }

    @Deprecated
    public final boolean zzb(int i10, zzwv zzwvVar) {
        Map map = (Map) this.zzZ.get(i10);
        return map != null && map.containsKey(zzwvVar);
    }

    @Deprecated
    public final zzxu zzc(int i10, zzwv zzwvVar) {
        Map map = (Map) this.zzZ.get(i10);
        if (map != null) {
            return (zzxu) map.get(zzwvVar);
        }
        return null;
    }

    public final zzxs zzd() {
        return new zzxs(this, null);
    }

    public final /* synthetic */ SparseArray zze() {
        return this.zzZ;
    }

    public final /* synthetic */ SparseBooleanArray zzf() {
        return this.zzaa;
    }

    private zzxt(zzxs zzxsVar) {
        super(zzxsVar);
        this.zzK = zzxsVar.zzz();
        this.zzL = false;
        this.zzM = zzxsVar.zzA();
        this.zzN = false;
        this.zzO = zzxsVar.zzB();
        this.zzP = false;
        this.zzQ = false;
        this.zzR = false;
        this.zzS = false;
        this.zzT = zzxsVar.zzC();
        this.zzU = zzxsVar.zzD();
        this.zzV = zzxsVar.zzE();
        this.zzW = false;
        this.zzX = zzxsVar.zzF();
        this.zzY = false;
        this.zzZ = zzxsVar.zzG();
        this.zzaa = zzxsVar.zzH();
    }
}
