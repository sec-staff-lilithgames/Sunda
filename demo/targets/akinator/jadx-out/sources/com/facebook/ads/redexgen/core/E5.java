package com.facebook.ads.redexgen.core;

import com.facebook.ads.redexgen.core.E5;

/* loaded from: assets/audience_network.dex */
public abstract class E5<T extends E5<T>> {
    public final int A00;
    public final int A01;
    public final C2614or A02;
    public final C2580oH A03;

    public abstract int A08();

    public abstract boolean A09(T t10);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.E5 != com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.E5<T>> */
    public E5(int i10, C2580oH c2580oH, int i11) {
        this.A00 = i10;
        this.A03 = c2580oH;
        this.A01 = i11;
        this.A02 = c2580oH.A08(i11);
    }
}
