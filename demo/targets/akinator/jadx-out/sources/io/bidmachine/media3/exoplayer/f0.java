package io.bidmachine.media3.exoplayer;

import io.bidmachine.media3.exoplayer.StreamVolumeManager;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class f0 implements io.bidmachine.media3.common.util.w, y0, io.bidmachine.media3.common.util.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f61193c;

    public /* synthetic */ f0(Object obj, int i10) {
        this.f61192b = i10;
        this.f61193c = obj;
    }

    @Override // io.bidmachine.media3.exoplayer.y0
    public z0 create(a1 a1Var, long j10) {
        o0 o0Var = (o0) this.f61193c;
        return new z0(o0Var.f61439c, j10, o0Var.f61444f, o0Var.f61447h.getAllocator(), o0Var.f61461v, a1Var, o0Var.f61446g, o0Var.f61438b0.f60857a);
    }

    @Override // io.bidmachine.media3.common.util.w
    public void invoke(Object obj) {
        int i10 = this.f61192b;
        Object obj2 = this.f61193c;
        switch (i10) {
            case 0:
                int i11 = l0.A0;
                ((gn.g1) obj).onMediaMetadataChanged((gn.s0) obj2);
                break;
            case 1:
                int i12 = l0.A0;
                ((gn.g1) obj).onTrackSelectionParametersChanged((gn.a2) obj2);
                break;
            case 2:
                int i13 = l0.A0;
                ((gn.g1) obj).onAudioAttributesChanged((gn.h) obj2);
                break;
            case 3:
                ((gn.g1) obj).onDeviceInfoChanged((gn.q) obj2);
                break;
            case 4:
                ((gn.g1) obj).onCues((in.d) obj2);
                break;
            case 5:
                ((gn.g1) obj).onMediaMetadataChanged(((j0) obj2).f61288b.T);
                break;
            case 6:
                ((gn.g1) obj).onMetadata((gn.u0) obj2);
                break;
            case 7:
                ((gn.g1) obj).onVideoSizeChanged((gn.k2) obj2);
                break;
            default:
                ((gn.g1) obj).onCues((List<in.b>) obj2);
                break;
        }
    }

    @Override // io.bidmachine.media3.common.util.d
    public void onStateChanged(Object obj, Object obj2) {
        StreamVolumeManager streamVolumeManager = (StreamVolumeManager) this.f61193c;
        StreamVolumeManager.a aVar = (StreamVolumeManager.a) obj;
        StreamVolumeManager.a aVar2 = (StreamVolumeManager.a) obj2;
        g2 g2Var = streamVolumeManager.f60859b;
        boolean z10 = aVar.f60867c;
        int i10 = aVar.f60866b;
        if (!z10 && aVar2.f60867c) {
            streamVolumeManager.f60863f = i10;
        }
        int i11 = aVar2.f60866b;
        boolean z11 = aVar2.f60867c;
        if (i10 != i11 || z10 != z11) {
            ((j0) g2Var).onStreamVolumeChanged(i11, z11);
        }
        int i12 = aVar.f60865a;
        int i13 = aVar2.f60865a;
        if (i12 == i13 && aVar.f60868d == aVar2.f60868d && aVar.f60869e == aVar2.f60869e) {
            return;
        }
        ((j0) g2Var).onStreamTypeChanged(i13);
    }
}
