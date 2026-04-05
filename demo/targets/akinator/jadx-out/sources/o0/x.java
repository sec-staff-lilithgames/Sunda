package o0;

import j1.m0;
import j1.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ x f77386a = new x();

    /* renamed from: defaultRippleAlpha-DxMtmZc, reason: not valid java name */
    public final i m5764defaultRippleAlphaDxMtmZc(long j10, boolean z10) {
        return z10 ? ((double) o0.m4892luminance8_81llA(j10)) > 0.5d ? a0.f77288b : a0.f77289c : a0.f77290d;
    }

    /* renamed from: defaultRippleColor-5vOe2sY, reason: not valid java name */
    public final long m5765defaultRippleColor5vOe2sY(long j10, boolean z10) {
        return (z10 || ((double) o0.m4892luminance8_81llA(j10)) >= 0.5d) ? j10 : m0.f68918b.m4836getWhite0d7_KjU();
    }
}
