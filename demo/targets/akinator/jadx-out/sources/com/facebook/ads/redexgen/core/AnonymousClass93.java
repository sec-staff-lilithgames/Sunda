package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.ironsource.C3227g4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.93, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass93 extends C2573oA implements C1S {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    @MetaExoPlayerCustomization("D25277746")
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final SparseArray<Map<C2451mA, C2429lo>> A0E;
    public final SparseBooleanArray A0F;
    public static String[] A0G = {"aGn7PxmzFVI8pseTQREUgmPTmRn3c3Qe", "IWvjCaXZ0UNcR9QsrMbq4cwMoqcNO01w", "zzFjDnJDYUSk81dZD4bwc1a4UEkJCW7c", "AfyHMFnboWczrAj6gDYBkfictlCviIiz", "ZudaxJy5LTgucmpkRl3p1l6eoKWNEQ3P", "dJwbxLQye6WGEEeA8Aa4EZe7IW3A7RwI", "l9ypC7Hglf3jtTkN6zxYkfXofkc9mvwo", "bL7rVgPoAdAWEHuIi5lDma"};
    public static final AnonymousClass93 A0J = new C2437lw().A0p();

    @Deprecated
    public static final AnonymousClass93 A0I = A0J;
    public static final String A0W = AbstractC09264a.A0h(1000);
    public static final String A0Q = AbstractC09264a.A0h(1001);
    public static final String A0R = AbstractC09264a.A0h(1002);
    public static final String A0T = AbstractC09264a.A0h(IronSourceError.AUCTION_ERROR_DECRYPTION);
    public static final String A0M = AbstractC09264a.A0h(1004);
    public static final String A0N = AbstractC09264a.A0h(1005);
    public static final String A0K = AbstractC09264a.A0h(1006);
    public static final String A0V = AbstractC09264a.A0h(1007);
    public static final String A0b = AbstractC09264a.A0h(1008);
    public static final String A0O = AbstractC09264a.A0h(1009);
    public static final String A0Z = AbstractC09264a.A0h(1010);
    public static final String A0a = AbstractC09264a.A0h(1011);
    public static final String A0Y = AbstractC09264a.A0h(TTAdConstant.IMAGE_MODE_1012);
    public static final String A0X = AbstractC09264a.A0h(C3227g4.f36755i);
    public static final String A0P = AbstractC09264a.A0h(C3227g4.f36756j);
    public static final String A0L = AbstractC09264a.A0h(1015);
    public static final String A0S = AbstractC09264a.A0h(C3227g4.f36758l);
    public static final String A0U = AbstractC09264a.A0h(1017);
    public static final C1R<AnonymousClass93> A0H = new C1R() { // from class: com.facebook.ads.redexgen.X.lx
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return new C2437lw(bundle).A0p();
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0M(SparseArray<Map<C2451mA, C2429lo>> sparseArray, SparseArray<Map<C2451mA, C2429lo>> sparseArray2) {
        int size = sparseArray.size();
        if (sparseArray2.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
            if (iIndexOfKey < 0 || !A0O(sparseArray.valueAt(i10), sparseArray2.valueAt(iIndexOfKey))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0O(Map<C2451mA, C2429lo> map, Map<C2451mA, C2429lo> map2) {
        if (map2.size() != map.size()) {
            return false;
        }
        for (Map.Entry<C2451mA, C2429lo> entry : map.entrySet()) {
            C2451mA key = entry.getKey();
            if (!map2.containsKey(key) || !AbstractC09264a.A1E(entry.getValue(), map2.get(key))) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass93(C2437lw c2437lw) {
        super(c2437lw);
        this.A0C = c2437lw.A0C;
        this.A06 = c2437lw.A06;
        this.A07 = c2437lw.A07;
        this.A05 = c2437lw.A05;
        this.A09 = c2437lw.A09;
        this.A02 = c2437lw.A02;
        this.A03 = c2437lw.A03;
        this.A00 = c2437lw.A00;
        this.A01 = c2437lw.A01;
        this.A08 = c2437lw.A08;
        this.A0B = c2437lw.A0B;
        this.A0D = c2437lw.A0D;
        this.A04 = c2437lw.A04;
        this.A0E = c2437lw.A0E;
        this.A0F = c2437lw.A0F;
        this.A0A = c2437lw.A0A;
    }

    public static AnonymousClass93 A02(Context context) {
        return new C2437lw(context).A0p();
    }

    public static /* synthetic */ String A0B() {
        String str = A0Z;
        String[] strArr = A0G;
        if (strArr[0].charAt(18) == strArr[1].charAt(18)) {
            throw new RuntimeException();
        }
        A0G[2] = "q21ODw35C4tKhNLL23C7ozdatpTCdbhY";
        return str;
    }

    public static /* synthetic */ String A0C() {
        String str = A0a;
        if (A0G[2].charAt(14) == 'E') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[3] = "0vyQVqHCYWPXhQOTbdu3xGlynIqeANBb";
        strArr[6] = "GRyh1cWelO50ilzlDGPvyp85W4uMwhgp";
        return str;
    }

    public static /* synthetic */ String A0H() {
        String str = A0P;
        String[] strArr = A0G;
        if (strArr[4].charAt(4) != strArr[5].charAt(4)) {
            throw new RuntimeException();
        }
        A0G[7] = "pTwWTj5vm";
        return str;
    }

    public static /* synthetic */ String A0J() {
        String str = A0M;
        String[] strArr = A0G;
        if (strArr[3].charAt(2) != strArr[6].charAt(2)) {
            throw new RuntimeException();
        }
        A0G[7] = "PzaI";
        return str;
    }

    public static boolean A0N(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray.size();
        int firstSize = sparseBooleanArray2.size();
        if (firstSize != size) {
            return false;
        }
        for (int indexInFirst = 0; indexInFirst < size; indexInFirst++) {
            int firstSize2 = sparseBooleanArray.keyAt(indexInFirst);
            if (sparseBooleanArray2.indexOfKey(firstSize2) < 0) {
                return false;
            }
        }
        return true;
    }

    public final C2437lw A0P() {
        return new C2437lw(this);
    }

    @Deprecated
    public final C2429lo A0Q(int i10, C2451mA c2451mA) {
        Map<C2451mA, C2429lo> map = this.A0E.get(i10);
        if (map != null) {
            return map.get(c2451mA);
        }
        return null;
    }

    public final boolean A0R(int i10) {
        return this.A0F.get(i10);
    }

    @Deprecated
    public final boolean A0S(int i10, C2451mA c2451mA) {
        Map<C2451mA, C2429lo> map = this.A0E.get(i10);
        return map != null && map.containsKey(c2451mA);
    }

    @Override // com.facebook.ads.redexgen.core.C2573oA
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            Class<?> cls2 = obj.getClass();
            String[] strArr = A0G;
            if (strArr[4].charAt(4) != strArr[5].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[0] = "DcJRbXEfPLE5m3v2P2UTupH85cHshXE1";
            strArr2[1] = "UExlWRKDpxUDxSKj0OTM8Ioa8cI6hcv0";
            if (cls == cls2) {
                AnonymousClass93 anonymousClass93 = (AnonymousClass93) obj;
                if (super.equals(anonymousClass93) && this.A0C == anonymousClass93.A0C && this.A06 == anonymousClass93.A06 && this.A07 == anonymousClass93.A07 && this.A05 == anonymousClass93.A05 && this.A09 == anonymousClass93.A09 && this.A02 == anonymousClass93.A02 && this.A03 == anonymousClass93.A03 && this.A00 == anonymousClass93.A00 && this.A01 == anonymousClass93.A01 && this.A08 == anonymousClass93.A08 && this.A0B == anonymousClass93.A0B && this.A0D == anonymousClass93.A0D && this.A04 == anonymousClass93.A04 && A0N(this.A0F, anonymousClass93.A0F) && A0M(this.A0E, anonymousClass93.A0E)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.C2573oA
    public final int hashCode() {
        return (((((((((((((((((((((((((((1 * 31) + super.hashCode()) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A00 ? 1 : 0)) * 31) + (this.A01 ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
