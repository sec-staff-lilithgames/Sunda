package io.bidmachine.media3.exoplayer;

import android.content.Context;
import mh.v2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class f implements v2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f61191c;

    public /* synthetic */ f(Context context, int i10) {
        this.f61190b = i10;
        this.f61191c = context;
    }

    @Override // mh.v2
    public final Object get() {
        switch (this.f61190b) {
            case 0:
                return hn.d.getAudioManager(this.f61191c);
            case 1:
                return new fo.e(this.f61191c);
            case 2:
                return go.o.getSingletonInstance(this.f61191c);
            case 3:
                return new r(this.f61191c);
            case 4:
                return new r(this.f61191c);
            case 5:
                return new ao.r(this.f61191c, new ko.u());
            default:
                return new ao.r(this.f61191c, new ko.u());
        }
    }
}
