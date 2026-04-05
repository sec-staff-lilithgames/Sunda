package com.vungle.ads.fpd;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.u;
import qv.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum MonthlyHousingCosts {
    UNDER_500(0, new m(Integer.MIN_VALUE, 500)),
    FROM_500_TO_1000(1, new m(501, 1000)),
    FROM_1000_TO_1500(2, new m(1001, 1500)),
    FROM_1500_TO_2000(3, new m(1501, 2000)),
    FROM_2000_TO_2500(4, new m(2001, 2500)),
    FROM_2500_TO_3000(5, new m(2501, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED)),
    FROM_3000_TO_3500(6, new m(3001, 3500)),
    FROM_3500_TO_4000(7, new m(3501, 4000)),
    FROM_4000_TO_4500(8, new m(4001, 4500)),
    OVER_4500(9, new m(4501, Integer.MAX_VALUE));

    public static final Companion Companion = new Companion(null);

    /* renamed from: id, reason: collision with root package name */
    private final int f50759id;
    private final m range;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final MonthlyHousingCosts fromCost$vungle_ads_release(int i10) {
            MonthlyHousingCosts monthlyHousingCosts;
            MonthlyHousingCosts[] monthlyHousingCostsArrValues = MonthlyHousingCosts.values();
            int length = monthlyHousingCostsArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    monthlyHousingCosts = null;
                    break;
                }
                monthlyHousingCosts = monthlyHousingCostsArrValues[i11];
                m range = monthlyHousingCosts.getRange();
                int first = range.getFirst();
                if (i10 <= range.getLast() && first <= i10) {
                    break;
                }
                i11++;
            }
            return monthlyHousingCosts == null ? MonthlyHousingCosts.UNDER_500 : monthlyHousingCosts;
        }

        private Companion() {
        }
    }

    MonthlyHousingCosts(int i10, m mVar) {
        this.f50759id = i10;
        this.range = mVar;
    }

    public final int getId() {
        return this.f50759id;
    }

    public final m getRange() {
        return this.range;
    }
}
