package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o1 extends gr.f {

    /* renamed from: c, reason: collision with root package name */
    public final f1 f61967c;

    public o1(gr.d dVar) {
        super(dVar);
        this.f61967c = new f1();
    }

    @Override // gr.f, gr.e, gr.b
    public void trackEvent(gr.j jVar, TrackEventType trackEventType, gr.i iVar, AdsType adsType, pr.a aVar, gr.a aVar2) {
        super.trackEvent(jVar, trackEventType, iVar, adsType, aVar, aVar2);
        this.f61967c.trackEvent(jVar, trackEventType, iVar, adsType, aVar, aVar2);
    }
}
