package ks;

import com.google.android.exoplayer2.util.a0;
import io.bidmachine.media3.common.util.w;
import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;
import on.c0;
import zd.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class i implements o.a, w, a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71981b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f71982c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f71983e;

    public /* synthetic */ i(Object obj, float f10, int i10) {
        this.f71981b = i10;
        this.f71983e = obj;
        this.f71982c = f10;
    }

    @Override // io.odeeo.internal.q0.o.a
    public final void invoke(Object obj) {
        switch (this.f71981b) {
            case 0:
                ((io.odeeo.internal.c.b) obj).onVolumeChanged((b.a) this.f71983e, this.f71982c);
                break;
            case 1:
                ((c0) ((on.d) obj)).onVolumeChanged((on.b) this.f71983e, this.f71982c);
                break;
            default:
                ((z) ((zd.d) obj)).onVolumeChanged((zd.b) this.f71983e, this.f71982c);
                break;
        }
    }
}
