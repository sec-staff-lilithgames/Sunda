package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class BK implements InterfaceC2285jG {
    public final /* synthetic */ BZ A00;

    public BK(final BZ val$separatorMatcher) {
        this.A00 = val$separatorMatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.1o] */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2285jG
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C08641o AAc(final C2286jH splitter, final CharSequence toSplit) {
        return new BJ(splitter, toSplit) { // from class: com.facebook.ads.redexgen.X.1o
            @Override // com.facebook.ads.redexgen.core.BJ
            public final int A04(int separatorPosition) {
                return separatorPosition + 1;
            }

            @Override // com.facebook.ads.redexgen.core.BJ
            public final int A05(int start) {
                return this.A00.A00.A08(this.A03, start);
            }
        };
    }
}
