package com.vungle.ads.fpd;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import kotlin.jvm.internal.u;
import qv.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum MedianHomeValueUSD {
    UNDER_100K(0, new m(Integer.MIN_VALUE, DefaultOggSeeker.MATCH_BYTE_RANGE)),
    FROM_100K_TO_300K(1, new m(100001, 300000)),
    FROM_300K_TO_500K(2, new m(300001, 500000)),
    FROM_500K_TO_700K(3, new m(500001, 700000)),
    FROM_700K_TO_900K(4, new m(700001, 900000)),
    FROM_900K_TO_1M1(5, new m(900001, 1100000)),
    FROM_1M1_TO_1M3(6, new m(1100001, 1300000)),
    FROM_1M3_TO_1M5(7, new m(1300001, 1500000)),
    FROM_1M5_TO_1M7(8, new m(1500001, 1700000)),
    OVER_1M7(9, new m(1700001, Integer.MAX_VALUE));

    public static final Companion Companion = new Companion(null);

    /* renamed from: id, reason: collision with root package name */
    private final int f50758id;
    private final m range;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final MedianHomeValueUSD fromPrice$vungle_ads_release(int i10) {
            MedianHomeValueUSD medianHomeValueUSD;
            MedianHomeValueUSD[] medianHomeValueUSDArrValues = MedianHomeValueUSD.values();
            int length = medianHomeValueUSDArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    medianHomeValueUSD = null;
                    break;
                }
                medianHomeValueUSD = medianHomeValueUSDArrValues[i11];
                m range = medianHomeValueUSD.getRange();
                int first = range.getFirst();
                if (i10 <= range.getLast() && first <= i10) {
                    break;
                }
                i11++;
            }
            return medianHomeValueUSD == null ? MedianHomeValueUSD.UNDER_100K : medianHomeValueUSD;
        }

        private Companion() {
        }
    }

    MedianHomeValueUSD(int i10, m mVar) {
        this.f50758id = i10;
        this.range = mVar;
    }

    public final int getId() {
        return this.f50758id;
    }

    public final m getRange() {
        return this.range;
    }
}
