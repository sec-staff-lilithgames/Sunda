package yg;

import android.graphics.Paint;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class h implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f94426a;

    public h(j jVar) {
        this.f94426a = jVar;
    }

    @Override // yg.q
    public d apply(d dVar) {
        if (dVar instanceof n) {
            return dVar;
        }
        Paint paint = j.H;
        return new b(-this.f94426a.i(), dVar);
    }
}
