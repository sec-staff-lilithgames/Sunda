package ej;

import hj.t;
import hj.v;
import nj.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f54416a;

    public e(h hVar) {
        this.f54416a = hVar;
    }

    @Override // hj.v
    public void onFinish() {
        h hVar = this.f54416a;
        j jVar = hVar.f54422j;
        if (jVar.f54434m == null || jVar.f54435n == null) {
            return;
        }
        t.logi("Impression timer onFinish for: " + hVar.f54422j.f54434m.getCampaignMetadata().getCampaignId());
        ((q) hVar.f54422j.f54435n).impressionDetected();
    }
}
