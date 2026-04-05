package com.facebook.ads.redexgen.core;

import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC2517nF extends InterfaceC08922s, CX, ET, C9Q {

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Temporary Noop Implementation until we completely migrate")
    public static final InterfaceC2517nF A00 = new InterfaceC2517nF() { // from class: com.facebook.ads.redexgen.X.9S
        @Override // com.facebook.ads.redexgen.core.InterfaceC08922s
        public final /* synthetic */ void ACv(C2563o0 c2563o0) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC08922s
        public final /* synthetic */ void ACw(List list) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void AD6(int i10, C2461mL c2461mL, CG cg2) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void ADw(int i10, C2461mL c2461mL, CE ce2, CG cg2) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void ADy(int i10, C2461mL c2461mL, CE ce2, CG cg2, Object obj, Object obj2) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void AE1(int i10, C2461mL c2461mL, CE ce2, CG cg2, IOException iOException, boolean z10) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC08922s
        public final /* synthetic */ void AEb(C2598ob c2598ob) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC08922s
        public final /* synthetic */ void AEd(C2600od c2600od) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC08922s
        public final /* synthetic */ void AEf(boolean z10, int i10) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC08922s
        public final /* synthetic */ void AFB() {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC08922s
        public final /* synthetic */ void AFQ(Timeline timeline, int i10) {
            AbstractC08912r.A00(this, timeline, i10);
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC08922s
        public final /* synthetic */ void AFU(C2569o6 c2569o6) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC2517nF
        public final void AC5() {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC2517nF
        public final void AIv(InterfaceC08992z interfaceC08992z, Looper looper) {
        }
    };

    void AC5();

    void AIv(InterfaceC08992z interfaceC08992z, Looper looper);
}
