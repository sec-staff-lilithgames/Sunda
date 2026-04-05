package com.facebook.ads.redexgen.core;

import android.media.AudioDeviceInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.8N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public interface C8N {
    void A51(C2614or c2614or, int i10, int[] iArr) throws C8G;

    void A5r();

    void A6E();

    void A6L();

    long A7X(boolean z10);

    C2598ob A8e();

    boolean A9W(ByteBuffer byteBuffer, long j10, int i10) throws C8M, C8H;

    void A9Z();

    boolean A9g();

    boolean AAG();

    void AGG();

    void AGI() throws C8M;

    void AIW(C2620oy c2620oy);

    void AIX(int i10);

    void AIY(C1P c1p);

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Enable Retry Audio Track")
    void AIg(boolean z10);

    void AIl(C8J c8j);

    void AIt(C2598ob c2598ob);

    void AIw(C10167m c10167m);

    void AIy(AudioDeviceInfo audioDeviceInfo);

    void AJ4(boolean z10);

    boolean AJc(C2614or c2614or);

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    boolean AJe(int i10, int i11);

    void flush();

    void pause();

    void setVolume(float f10);
}
