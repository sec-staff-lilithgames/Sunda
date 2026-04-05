package is;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.odeeo.internal.b.g;
import io.odeeo.internal.b.l0;
import io.odeeo.internal.b.n;
import io.odeeo.internal.b.o0;
import io.odeeo.internal.b.s;
import io.odeeo.internal.b.t;
import io.odeeo.internal.b.v;
import io.odeeo.internal.b.v0;
import io.odeeo.internal.b.x0;
import io.odeeo.internal.b.y0;
import io.odeeo.internal.b.z;
import io.odeeo.internal.b.z0;
import io.odeeo.internal.q0.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class b implements g.a, o.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f68377b;

    public /* synthetic */ b(int i10) {
        this.f68377b = i10;
    }

    @Override // io.odeeo.internal.b.g.a
    /* renamed from: fromBundle */
    public io.odeeo.internal.b.g mo3834fromBundle(Bundle bundle) {
        switch (this.f68377b) {
            case 0:
                return io.odeeo.internal.b.m.a(bundle);
            case 1:
                return new n(bundle);
            case 2:
                return o0.a(bundle);
            case 3:
            case 4:
            default:
                return z0.a.a(bundle);
            case 5:
                return t.a(bundle);
            case 6:
                return v.b(bundle);
            case 7:
                return v0.b(bundle);
            case 8:
                return x0.b(bundle);
            case 9:
                return y0.a(bundle);
            case 10:
                return y0.b.a(bundle);
            case 11:
                return y0.d.a(bundle);
            case 12:
                return z.a(bundle);
            case 13:
                return new z.d.a().setStartPositionMs(bundle.getLong(z.d.a(0), 0L)).setEndPositionMs(bundle.getLong(z.d.a(1), Long.MIN_VALUE)).setRelativeToLiveWindow(bundle.getBoolean(z.d.a(2), false)).setRelativeToDefaultPosition(bundle.getBoolean(z.d.a(3), false)).setStartsAtKeyFrame(bundle.getBoolean(z.d.a(4), false)).buildClippingProperties();
            case 14:
                return z.g.a(bundle);
            case 15:
                return z0.a(bundle);
        }
    }

    @Override // io.odeeo.internal.q0.o.a
    public void invoke(Object obj) {
        l0.c cVar = (l0.c) obj;
        switch (this.f68377b) {
            case 3:
                cVar.onPlayerError(n.createForUnexpected(new s(1), IronSourceError.AUCTION_ERROR_DECRYPTION));
                break;
            default:
                cVar.onSeekProcessed();
                break;
        }
    }
}
