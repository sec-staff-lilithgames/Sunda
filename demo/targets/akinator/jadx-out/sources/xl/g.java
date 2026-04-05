package xl;

import android.os.Bundle;
import io.bidmachine.media3.common.util.a1;
import io.odeeo.internal.b.g;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import io.odeeo.internal.n0.c;
import io.odeeo.internal.n0.i;
import io.odeeo.internal.n0.j;
import xn.g0;
import xn.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class g implements rr.b, xn.j, g0, g.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f92033b;

    public /* synthetic */ g(int i10) {
        this.f92033b = i10;
    }

    @Override // io.odeeo.internal.b.g.a
    /* renamed from: fromBundle */
    public io.odeeo.internal.b.g mo3834fromBundle(Bundle bundle) {
        switch (this.f92033b) {
            case 11:
                return new c.e(bundle).build();
            case 12:
                return c.f.a(bundle);
            case 13:
                return io.odeeo.internal.n0.i.a(bundle);
            case 14:
                return i.c.a(bundle);
            default:
                return new j.a(bundle).build();
        }
    }

    @Override // rr.b
    public Object get() {
        switch (this.f92033b) {
            case 0:
                return "BackgroundSource don't found. Can't create Image";
            case 1:
                return "BackgroundSource don't found. Set one of: color, gradient";
            case 2:
                return "ResourceSource don't found. Set one of: html, xml";
            case 3:
                return "ResourceSource don't found. Set one of: base64, url, payload";
            case 4:
                return "BrokenCreativeDetector algorithms is empty";
            case 5:
                return "Not all BrokenCreativeDetector algorithms were applied, check if the algorithms are specified correctly";
            case 6:
                return "PlaceholderSource don't found. Set one of: name, color, gradient";
            default:
                return "ColorSource don't found. Can't parse color";
        }
    }

    @Override // xn.j
    public Bundle onLoudnessParameterUpdate(Bundle bundle) {
        return bundle;
    }

    @Override // xn.g0
    public int getScore(Object obj) {
        s sVar = (s) obj;
        switch (this.f92033b) {
            case 9:
                String str = sVar.f92111a;
                if (str.startsWith(QCmNMSGd.bSSFXZBpaJMMzE) || str.startsWith("c2.android")) {
                    return 1;
                }
                return (a1.f60679a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return (sVar.f92118h ? 2 : 0) + (!sVar.f92119i ? 1 : 0);
        }
    }
}
