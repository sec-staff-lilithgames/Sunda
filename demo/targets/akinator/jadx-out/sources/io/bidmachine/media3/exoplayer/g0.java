package io.bidmachine.media3.exoplayer;

import io.bidmachine.media3.exoplayer.StreamVolumeManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class g0 implements mh.v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61200b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f61201c;

    public /* synthetic */ g0(int i10, int i11) {
        this.f61200b = i11;
        this.f61201c = i10;
    }

    @Override // mh.v0
    public final Object apply(Object obj) {
        int i10 = this.f61200b;
        int iIntValue = this.f61201c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj;
                int i11 = l0.A0;
                if (iIntValue == 0) {
                    iIntValue = num.intValue();
                }
                return Integer.valueOf(iIntValue);
            case 1:
                StreamVolumeManager.a aVar = (StreamVolumeManager.a) obj;
                int i12 = aVar.f60865a;
                int i13 = aVar.f60868d;
                return new StreamVolumeManager.a(i12, (iIntValue < i13 || iIntValue > aVar.f60869e) ? aVar.f60866b : iIntValue, iIntValue == 0, i13, aVar.f60869e);
            default:
                StreamVolumeManager.a aVar2 = (StreamVolumeManager.a) obj;
                return new StreamVolumeManager.a(this.f61201c, aVar2.f60866b, aVar2.f60867c, aVar2.f60868d, aVar2.f60869e);
        }
    }
}
