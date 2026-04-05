package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.lw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2437lw extends AnonymousClass35 {
    public static String[] A0G = {"svIlLfjydeGBu6G0UjrHSopJ4Ky0wypW", "Eix0ooWKKyHx1hOwK", "jEg8xHvrvI0NXBTEehRxqQQjEYaTbIQI", "2fo", "JdZ", "dfBQZRQYRFpeihXeeCDcyjRnxunK4YCt", "ZC", "go43CHW4mwtjJCZZxmpd9eXXAUtGDH29"};
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    @MetaExoPlayerCustomization("D25277746 - If all qualities are filtered out, do not use a fixed selection but differ to adaptive track selection in hero.")
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final SparseArray<Map<C2451mA, C2429lo>> A0E;
    public final SparseBooleanArray A0F;

    @Deprecated
    public C2437lw() {
        this.A0E = new SparseArray<>();
        this.A0F = new SparseBooleanArray();
        A0W();
    }

    public C2437lw(Context context) {
        super(context);
        this.A0E = new SparseArray<>();
        this.A0F = new SparseBooleanArray();
        A0W();
    }

    @MetaExoPlayerCustomization("Modified to support setExceedRendererCapabilitiesIfAllFilteredOut")
    public C2437lw(Bundle bundle) {
        super(bundle);
        A0W();
        AnonymousClass93 anonymousClass93 = AnonymousClass93.A0J;
        A17(bundle.getBoolean(AnonymousClass93.A0W, anonymousClass93.A0C));
        A11(bundle.getBoolean(AnonymousClass93.A0Q, anonymousClass93.A06));
        A12(bundle.getBoolean(AnonymousClass93.A0R, anonymousClass93.A07));
        A10(bundle.getBoolean(AnonymousClass93.A0H(), anonymousClass93.A05));
        A14(bundle.getBoolean(AnonymousClass93.A0T, anonymousClass93.A09));
        A0x(bundle.getBoolean(AnonymousClass93.A0J(), anonymousClass93.A02));
        A0y(bundle.getBoolean(AnonymousClass93.A0N, anonymousClass93.A03));
        A0v(bundle.getBoolean(AnonymousClass93.A0K, anonymousClass93.A00));
        A0w(bundle.getBoolean(AnonymousClass93.A0L, anonymousClass93.A01));
        A13(bundle.getBoolean(AnonymousClass93.A0S, anonymousClass93.A08));
        A16(bundle.getBoolean(AnonymousClass93.A0V, anonymousClass93.A0B));
        A18(bundle.getBoolean(AnonymousClass93.A0b, anonymousClass93.A0D));
        A0z(bundle.getBoolean(AnonymousClass93.A0O, anonymousClass93.A04));
        A15(bundle.getBoolean(AnonymousClass93.A0U, anonymousClass93.A0A));
        this.A0E = new SparseArray<>();
        A0X(bundle);
        this.A0F = A0R(bundle.getIntArray(AnonymousClass93.A0X));
    }

    @MetaExoPlayerCustomization("To support exceedRendererCapabilitiesIfAllFilteredOut")
    public C2437lw(AnonymousClass93 anonymousClass93) {
        super(anonymousClass93);
        this.A0C = anonymousClass93.A0C;
        this.A06 = anonymousClass93.A06;
        this.A07 = anonymousClass93.A07;
        this.A05 = anonymousClass93.A05;
        this.A09 = anonymousClass93.A09;
        this.A02 = anonymousClass93.A02;
        this.A03 = anonymousClass93.A03;
        this.A00 = anonymousClass93.A00;
        this.A01 = anonymousClass93.A01;
        this.A08 = anonymousClass93.A08;
        this.A0B = anonymousClass93.A0B;
        this.A0D = anonymousClass93.A0D;
        this.A04 = anonymousClass93.A04;
        this.A0A = anonymousClass93.A0A;
        this.A0E = A0G((SparseArray<Map<C2451mA, C2429lo>>) anonymousClass93.A0E);
        this.A0F = anonymousClass93.A0F.clone();
    }

    public static SparseArray<Map<C2451mA, C2429lo>> A0G(SparseArray<Map<C2451mA, C2429lo>> sparseArray) {
        SparseArray<Map<C2451mA, C2429lo>> sparseArray2 = new SparseArray<>();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
        }
        return sparseArray2;
    }

    private SparseBooleanArray A0R(int[] iArr) {
        if (iArr == null) {
            return new SparseBooleanArray();
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
        for (int i10 : iArr) {
            sparseBooleanArray.append(i10, true);
        }
        return sparseBooleanArray;
    }

    @MetaExoPlayerCustomization("To support setting exceedRendererCapabilitiesIfAllFilteredOut")
    private void A0W() {
        this.A0C = true;
        this.A06 = false;
        this.A07 = true;
        this.A05 = false;
        this.A09 = true;
        this.A02 = false;
        this.A03 = false;
        this.A00 = false;
        this.A01 = false;
        this.A08 = true;
        this.A0B = true;
        this.A0D = false;
        this.A04 = true;
        this.A0A = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A0X(Bundle bundle) {
        AbstractC1081Am abstractC1081AmA01;
        SparseArray sparseArrayA00;
        int[] intArray = bundle.getIntArray(AnonymousClass93.A0B());
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(AnonymousClass93.A0C());
        if (parcelableArrayList == null) {
            abstractC1081AmA01 = AbstractC1081Am.A03();
        } else {
            C1R<C2451mA> c1r = C2451mA.A05;
            String[] strArr = A0G;
            if (strArr[1].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[2] = "KlsLVpZXOsku5rL5eePguYtdE3UqynPn";
            strArr2[5] = "qpearOu2I9fJNwBbehSRgczBWJlsPwpY";
            abstractC1081AmA01 = C3S.A01(c1r, parcelableArrayList);
        }
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(AnonymousClass93.A0Y);
        if (sparseParcelableArray == null) {
            sparseArrayA00 = new SparseArray();
        } else {
            sparseArrayA00 = C3S.A00(C2429lo.A05, sparseParcelableArray);
        }
        if (intArray == null || intArray.length != abstractC1081AmA01.size()) {
            return;
        }
        for (int i10 = 0; i10 < intArray.length; i10++) {
            A0r(intArray[i10], (C2451mA) abstractC1081AmA01.get(i10), (C2429lo) sparseArrayA00.get(i10));
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass35
    /* renamed from: A0q, reason: merged with bridge method [inline-methods] */
    public final C2437lw A0m(int i10, int i11, boolean z10) {
        super.A0m(i10, i11, z10);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (com.facebook.ads.redexgen.core.AbstractC09264a.A1E(r4, r8) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (com.facebook.ads.redexgen.core.AbstractC09264a.A1E(r4, r8) != false) goto L15;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.core.C2437lw A0r(int r6, com.facebook.ads.redexgen.core.C2451mA r7, com.facebook.ads.redexgen.core.C2429lo r8) {
        /*
            r5 = this;
            android.util.SparseArray<java.util.Map<com.facebook.ads.redexgen.X.mA, com.facebook.ads.redexgen.X.lo>> r0 = r5.A0E
            java.lang.Object r3 = r0.get(r6)
            java.util.Map r3 = (java.util.Map) r3
            if (r3 != 0) goto L14
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            android.util.SparseArray<java.util.Map<com.facebook.ads.redexgen.X.mA, com.facebook.ads.redexgen.X.lo>> r0 = r5.A0E
            r0.put(r6, r3)
        L14:
            boolean r4 = r3.containsKey(r7)
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2437lw.A0G
            r0 = 4
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L30
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L30:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2437lw.A0G
            java.lang.String r1 = "Tjk1w46Zsfr3yClteaW3dwU9W0N7TL6X"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "KoERYkShSHV4ud9Re9JlKSMcCXAYN5Cn"
            r0 = 5
            r2[r0] = r1
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r3.get(r7)
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2437lw.A0G
            r0 = 0
            r1 = r2[r0]
            r0 = 7
            r2 = r2[r0]
            r0 = 28
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L69
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2437lw.A0G
            java.lang.String r1 = "d9Fp2lxah88hbF8VY"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "He"
            r0 = 6
            r2[r0] = r1
            boolean r0 = com.facebook.ads.redexgen.core.AbstractC09264a.A1E(r4, r8)
            if (r0 == 0) goto L7c
        L68:
            return r5
        L69:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2437lw.A0G
            java.lang.String r1 = "6G3DmRjovsWEEopHgL7H9VeUKDmRIoIA"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "heYp32NvS9S7pouisOnfj6NnH9zTXJMv"
            r0 = 7
            r2[r0] = r1
            boolean r0 = com.facebook.ads.redexgen.core.AbstractC09264a.A1E(r4, r8)
            if (r0 == 0) goto L7c
            goto L68
        L7c:
            r3.put(r7, r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2437lw.A0r(int, com.facebook.ads.redexgen.X.mA, com.facebook.ads.redexgen.X.lo):com.facebook.ads.redexgen.X.lw");
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass35
    /* renamed from: A0s, reason: merged with bridge method [inline-methods] */
    public final C2437lw A0n(Context context) {
        super.A0n(context);
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass35
    /* renamed from: A0t, reason: merged with bridge method [inline-methods] */
    public final C2437lw A0o(Context context, boolean z10) {
        super.A0o(context, z10);
        return this;
    }

    public final C2437lw A0u(C2573oA c2573oA) {
        super.A0W(c2573oA);
        return this;
    }

    public final C2437lw A0v(boolean z10) {
        this.A00 = z10;
        return this;
    }

    public final C2437lw A0w(boolean z10) {
        this.A01 = z10;
        return this;
    }

    public final C2437lw A0x(boolean z10) {
        this.A02 = z10;
        return this;
    }

    public final C2437lw A0y(boolean z10) {
        this.A03 = z10;
        return this;
    }

    public final C2437lw A0z(boolean z10) {
        this.A04 = z10;
        return this;
    }

    public final C2437lw A10(boolean z10) {
        this.A05 = z10;
        return this;
    }

    public final C2437lw A11(boolean z10) {
        this.A06 = z10;
        return this;
    }

    public final C2437lw A12(boolean z10) {
        this.A07 = z10;
        return this;
    }

    public final C2437lw A13(boolean z10) {
        this.A08 = z10;
        return this;
    }

    public final C2437lw A14(boolean z10) {
        this.A09 = z10;
        return this;
    }

    @MetaExoPlayerCustomization("D25277746")
    public final C2437lw A15(boolean z10) {
        this.A0A = z10;
        return this;
    }

    public final C2437lw A16(boolean z10) {
        this.A0B = z10;
        return this;
    }

    public final C2437lw A17(boolean z10) {
        this.A0C = z10;
        return this;
    }

    public final C2437lw A18(boolean z10) {
        this.A0D = z10;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass35
    /* renamed from: A19, reason: merged with bridge method [inline-methods] */
    public final AnonymousClass93 A0p() {
        return new AnonymousClass93(this);
    }
}
