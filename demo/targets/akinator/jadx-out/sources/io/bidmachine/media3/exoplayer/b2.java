package io.bidmachine.media3.exoplayer;

import android.media.AudioManager;
import io.bidmachine.media3.exoplayer.StreamVolumeManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class b2 implements mh.v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61122b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f61123c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f61124e;

    public /* synthetic */ b2(Object obj, int i10, int i11) {
        this.f61122b = i11;
        this.f61123c = obj;
        this.f61124e = i10;
    }

    @Override // mh.v0
    public final Object apply(Object obj) {
        int i10 = this.f61122b;
        int iGenerateAudioSessionIdV21 = this.f61124e;
        Object obj2 = this.f61123c;
        switch (i10) {
            case 0:
                StreamVolumeManager streamVolumeManager = (StreamVolumeManager) obj2;
                StreamVolumeManager.a aVar = (StreamVolumeManager.a) obj;
                streamVolumeManager.getClass();
                int i11 = aVar.f60866b;
                int i12 = aVar.f60865a;
                if (i11 >= aVar.f60869e) {
                    return aVar;
                }
                ((AudioManager) io.bidmachine.media3.common.util.a.checkNotNull(streamVolumeManager.f60861d)).adjustStreamVolume(i12, 1, iGenerateAudioSessionIdV21);
                return streamVolumeManager.a(i12);
            case 1:
                StreamVolumeManager streamVolumeManager2 = (StreamVolumeManager) obj2;
                StreamVolumeManager.a aVar2 = (StreamVolumeManager.a) obj;
                streamVolumeManager2.getClass();
                int i13 = aVar2.f60866b;
                int i14 = aVar2.f60865a;
                if (i13 <= aVar2.f60868d) {
                    return aVar2;
                }
                ((AudioManager) io.bidmachine.media3.common.util.a.checkNotNull(streamVolumeManager2.f60861d)).adjustStreamVolume(i14, -1, iGenerateAudioSessionIdV21);
                return streamVolumeManager2.a(i14);
            case 2:
                StreamVolumeManager streamVolumeManager3 = (StreamVolumeManager) obj2;
                StreamVolumeManager.a aVar3 = (StreamVolumeManager.a) obj;
                streamVolumeManager3.getClass();
                return aVar3.f60865a == iGenerateAudioSessionIdV21 ? aVar3 : streamVolumeManager3.a(iGenerateAudioSessionIdV21);
            default:
                l0 l0Var = (l0) obj2;
                if (iGenerateAudioSessionIdV21 != 0) {
                    int i15 = l0.A0;
                    l0Var.getClass();
                } else {
                    iGenerateAudioSessionIdV21 = io.bidmachine.media3.common.util.a1.generateAudioSessionIdV21(l0Var.f61343e);
                }
                return Integer.valueOf(iGenerateAudioSessionIdV21);
        }
    }
}
