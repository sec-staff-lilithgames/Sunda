package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.m5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2446m5 implements EA {
    public static String[] A0B = {"ziZaTeBfSFNnIBcgtlZExnB4uOVj2q5B", "5IZt5NWgPCitKNTqtiA", "aLHVXVzU6ljMUMq9dZgrDfQ8JzHl8MF", "mvLcqO7QF6VGSUKAdCZC8bhhp8aLucng", "FQUZNhR4lN6thgMMBkcdaTgoY6ZzypcM", "72R8UBsha86AOqtb805OpiOBiH7oe8El", "AjNBccUrYW9zDFgtuo7TyJwkSvkBJU7y", "GkSBWsvGG5dBFRJxqtw9GV4lDtiTWOM"};
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final C3T A08;

    @MetaExoPlayerCustomization("This is no longer set in the constructor")
    public final EU A09;
    public final int A0A;

    public C2446m5() {
        this(10000, 25000, 25000, 0.75f);
    }

    public C2446m5(int i10, int i11, int i12, float f10) {
        this(null, -1, i10, i11, i12, 1279, 719, f10, 0.75f, 2000L, C3T.A00);
    }

    public C2446m5(EU eu2) {
        this(eu2, -1, 10000, 25000, 25000, 1279, 719, 0.75f, 0.75f, 2000L, C3T.A00);
    }

    public C2446m5(@MetaExoPlayerCustomization("No longer set through factory") EU eu2, @MetaExoPlayerCustomization("Non standard variable; used in oculus") int i10, @MetaExoPlayerCustomization("Removed from upstream") int i11, int i12, int i13, int i14, int i15, float f10, float f11, long j10, C3T c3t) {
        this.A09 = eu2;
        this.A0A = i10;
        this.A05 = i11;
        this.A02 = i12;
        this.A06 = i13;
        this.A04 = i14;
        this.A03 = i15;
        this.A00 = f10;
        this.A01 = f11;
        this.A07 = j10;
        this.A08 = c3t;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    private final C08480y A00(C2580oH c2580oH, int[] iArr, int i10, EU eu2, AbstractC1081Am<C1162Ds> abstractC1081Am) {
        return new C08480y(c2580oH, iArr, i10, eu2, this.A0A, this.A05, this.A02, this.A06, this.A04, this.A03, this.A00, this.A01, this.A07, abstractC1081Am, this.A08);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.core.EA
    public final InterfaceC2424lj[] A5T(E9[] e9Arr, EU eu2, C2461mL c2461mL, Timeline timeline) {
        InterfaceC2424lj interfaceC2424ljA00;
        AbstractC1081Am abstractC1081AmA00 = C08480y.A00(e9Arr);
        InterfaceC2424lj[] interfaceC2424ljArr = new InterfaceC2424lj[e9Arr.length];
        for (int i10 = 0; i10 < e9Arr.length; i10++) {
            E9 e92 = e9Arr[i10];
            if (e92 != null && e92.A02.length != 0) {
                int length = e92.A02.length;
                if (A0B[3].length() != 32) {
                    throw new RuntimeException();
                }
                A0B[1] = "4JDRhnBkti3";
                if (length == 1) {
                    interfaceC2424ljA00 = new C08470x(e92.A01, e92.A02[0], e92.A00);
                } else {
                    interfaceC2424ljA00 = A00(e92.A01, e92.A02, e92.A00, eu2, (AbstractC1081Am) abstractC1081AmA00.get(i10));
                }
                interfaceC2424ljArr[i10] = interfaceC2424ljA00;
            }
        }
        return interfaceC2424ljArr;
    }
}
