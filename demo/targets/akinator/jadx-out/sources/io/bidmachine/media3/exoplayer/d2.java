package io.bidmachine.media3.exoplayer;

import io.bidmachine.media3.exoplayer.StreamVolumeManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class d2 implements mh.v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61152b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f61153c;

    public /* synthetic */ d2(Object obj, int i10) {
        this.f61152b = i10;
        this.f61153c = obj;
    }

    @Override // mh.v0
    public final Object apply(Object obj) {
        switch (this.f61152b) {
            case 0:
                StreamVolumeManager streamVolumeManager = (StreamVolumeManager) this.f61153c;
                StreamVolumeManager.a aVar = (StreamVolumeManager.a) obj;
                StreamVolumeManager.VolumeChangeReceiver volumeChangeReceiver = streamVolumeManager.f60862e;
                if (volumeChangeReceiver != null) {
                    try {
                        streamVolumeManager.f60858a.unregisterReceiver(volumeChangeReceiver);
                    } catch (RuntimeException e10) {
                        io.bidmachine.media3.common.util.b0.w("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
                    }
                    streamVolumeManager.f60862e = null;
                }
                return aVar;
            default:
                return (on.a) this.f61153c;
        }
    }
}
