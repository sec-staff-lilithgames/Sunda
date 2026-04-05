package ks;

import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class o implements o.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.a f72000c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f72001e;

    public /* synthetic */ o(b.a aVar, String str, int i10) {
        this.f71999b = i10;
        this.f72000c = aVar;
        this.f72001e = str;
    }

    @Override // io.odeeo.internal.q0.o.a
    public final void invoke(Object obj) {
        switch (this.f71999b) {
            case 0:
                ((io.odeeo.internal.c.b) obj).onAudioDecoderReleased(this.f72000c, this.f72001e);
                break;
            default:
                ((io.odeeo.internal.c.b) obj).onVideoDecoderReleased(this.f72000c, this.f72001e);
                break;
        }
    }
}
