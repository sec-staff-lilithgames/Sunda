package com.facebook.ads.redexgen.core;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: com.facebook.ads.redexgen.X.7h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC10117h implements InterfaceC2353kN {
    public static String[] A06 = {"A1ZwXb6JdBVxSPYV1ZzpyUVQy2gRfJA9", "vkvPFBYHwcZnb4NzphHjmgFJFbjiYwSo", "W7sj7Up3ABI8RZFTAAZOEHe7srfTkl57", "fls3PiASqtk6GqNgTZFqwBZFoYeyHn2V", "1yDmXHBn42mad7W8CPx8A7RWKYn1BqT7", "CjPJSc8sfbO2R56Y3Yx9Z137FYjSqvlb", "2KSypf5DjPiLYF3nQ7brfSsHONTUzR5A", "k5ePLg8NJJ"};
    public long A00;
    public long A01;
    public C08430t A02;
    public final ArrayDeque<C08430t> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC10127i> A04;
    public final PriorityQueue<C08430t> A05;

    public abstract C2348kI A0Z();

    public abstract void A0b(C10137j c10137j);

    public abstract boolean A0d();

    public AbstractC10117h() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.A03.add(new C08430t());
        }
        this.A04 = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque<AbstractC10127i> arrayDeque = this.A04;
            final C5S c5s = new C5S() { // from class: com.facebook.ads.redexgen.X.kL
                @Override // com.facebook.ads.redexgen.core.C5S
                public final void AGz(AbstractC2535nX abstractC2535nX) {
                    this.A00.A0c((C08420s) abstractC2535nX);
                }
            };
            arrayDeque.add(new AbstractC10127i(c5s) { // from class: com.facebook.ads.redexgen.X.0s
                public C5S<C08420s> A00;

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5S != com.facebook.ads.androidx.media3.decoder.DecoderOutputBuffer$Owner<com.facebook.ads.androidx.media3.extractor.text.cea.CeaDecoder$CeaOutputBuffer> */
                {
                    this.A00 = c5s;
                }

                @Override // com.facebook.ads.redexgen.core.AbstractC10127i, com.facebook.ads.redexgen.core.AbstractC2535nX
                public final void A0B() {
                    this.A00.AGz(this);
                }
            });
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0U(C08430t c08430t) {
        c08430t.A0A();
        this.A03.add(c08430t);
    }

    public final long A0V() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.C5O
    /* renamed from: A0W, reason: merged with bridge method [inline-methods] */
    public C10137j A5j() throws C2352kM {
        C3M.A08(this.A02 == null);
        if (this.A03.isEmpty()) {
            return null;
        }
        this.A02 = this.A03.pollFirst();
        return this.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f7, code lost:
    
        return null;
     */
    @Override // com.facebook.ads.redexgen.core.C5O
    /* renamed from: A0X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.facebook.ads.redexgen.core.AbstractC10127i A5l() throws com.facebook.ads.redexgen.core.C2352kM {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC10117h.A5l():com.facebook.ads.redexgen.X.7i");
    }

    public final AbstractC10127i A0Y() {
        return this.A04.pollFirst();
    }

    @Override // com.facebook.ads.redexgen.core.C5O
    /* renamed from: A0a, reason: merged with bridge method [inline-methods] */
    public void AGZ(C10137j c10137j) throws C2352kM {
        C3M.A07(c10137j == this.A02);
        C08430t c08430t = (C08430t) c10137j;
        if (c08430t.A04()) {
            A0U(c08430t);
        } else {
            long j10 = this.A01;
            this.A01 = 1 + j10;
            c08430t.A00 = j10;
            this.A05.add(c08430t);
        }
        if (A06[7].length() != 10) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "rj1eyhsOe6SuoM1rYy40tvsoNCkJE80J";
        strArr[1] = "ibYLffFAaVDMN4cD1vowu1tbJEM8Lkom";
        this.A02 = null;
    }

    public final void A0c(AbstractC10127i abstractC10127i) {
        abstractC10127i.A0A();
        this.A04.add(abstractC10127i);
    }

    @Override // com.facebook.ads.redexgen.core.C5O
    public void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2353kN
    public void AIx(long j10) {
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.core.C5O
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0U((C08430t) AbstractC09264a.A0f(this.A05.poll()));
        }
        if (this.A02 != null) {
            A0U(this.A02);
            this.A02 = null;
        }
    }
}
