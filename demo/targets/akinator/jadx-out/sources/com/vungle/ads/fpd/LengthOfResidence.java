package com.vungle.ads.fpd;

import kotlin.jvm.internal.u;
import qv.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum LengthOfResidence {
    LESS_THAN_ONE_YEAR(0, new m(Integer.MIN_VALUE, 0)),
    ONE_TO_FIVE_YEARS(1, new m(1, 5)),
    SIX_TO_TEN_YEARS(2, new m(6, 10)),
    ELEVEN_TO_TWENTY_YEARS(3, new m(11, 20)),
    TWENTY_ONE_TO_THIRTY_YEARS(4, new m(21, 30)),
    THIRTY_ONE_TO_FORTY_YEARS(5, new m(31, 40)),
    FORTY_ONE_TO_FIFTY_YEARS(6, new m(41, 50)),
    FIFTY_ONE_TO_SIXTY_YEARS(7, new m(51, 60)),
    SIXTY_ONE_TO_SEVENTY_YEARS(8, new m(61, 70)),
    OVER_SEVENTY_ONE_YEARS(9, new m(71, Integer.MAX_VALUE));

    public static final Companion Companion = new Companion(null);

    /* renamed from: id, reason: collision with root package name */
    private final int f50757id;
    private final m range;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final LengthOfResidence fromYears$vungle_ads_release(int i10) {
            LengthOfResidence lengthOfResidence;
            LengthOfResidence[] lengthOfResidenceArrValues = LengthOfResidence.values();
            int length = lengthOfResidenceArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    lengthOfResidence = null;
                    break;
                }
                lengthOfResidence = lengthOfResidenceArrValues[i11];
                m range = lengthOfResidence.getRange();
                int first = range.getFirst();
                if (i10 <= range.getLast() && first <= i10) {
                    break;
                }
                i11++;
            }
            return lengthOfResidence == null ? LengthOfResidence.LESS_THAN_ONE_YEAR : lengthOfResidence;
        }

        private Companion() {
        }
    }

    LengthOfResidence(int i10, m mVar) {
        this.f50757id = i10;
        this.range = mVar;
    }

    public final int getId() {
        return this.f50757id;
    }

    public final m getRange() {
        return this.range;
    }
}
