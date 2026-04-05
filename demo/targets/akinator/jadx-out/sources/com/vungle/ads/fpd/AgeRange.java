package com.vungle.ads.fpd;

import kotlin.jvm.internal.u;
import qv.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum AgeRange {
    AGE_18_20(1, new m(18, 20)),
    AGE_21_30(2, new m(21, 30)),
    AGE_31_40(3, new m(31, 40)),
    AGE_41_50(4, new m(41, 50)),
    AGE_51_60(5, new m(51, 60)),
    AGE_61_70(6, new m(61, 70)),
    AGE_71_75(7, new m(71, 75)),
    OTHERS(0, new m(Integer.MIN_VALUE, Integer.MAX_VALUE));

    public static final Companion Companion = new Companion(null);

    /* renamed from: id, reason: collision with root package name */
    private final int f50756id;
    private final m range;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final AgeRange fromAge$vungle_ads_release(int i10) {
            AgeRange ageRange;
            AgeRange[] ageRangeArrValues = AgeRange.values();
            int length = ageRangeArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    ageRange = null;
                    break;
                }
                ageRange = ageRangeArrValues[i11];
                m range = ageRange.getRange();
                int first = range.getFirst();
                if (i10 <= range.getLast() && first <= i10) {
                    break;
                }
                i11++;
            }
            return ageRange == null ? AgeRange.OTHERS : ageRange;
        }

        private Companion() {
        }
    }

    AgeRange(int i10, m mVar) {
        this.f50756id = i10;
        this.range = mVar;
    }

    public final int getId() {
        return this.f50756id;
    }

    public final m getRange() {
        return this.range;
    }
}
