package ao;

import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import fo.e;
import gn.b2;
import io.bidmachine.media3.common.StreamKey;
import nh.we;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class c implements mh.v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7555b;

    public /* synthetic */ c(int i10) {
        this.f7555b = i10;
    }

    @Override // mh.v0
    public final Object apply(Object obj) {
        switch (this.f7555b) {
            case 0:
                return ((ko.z) obj).getUnderlyingImplementation().getClass().getSimpleName();
            case 1:
                return ((i0) obj).getTrackGroups().getTrackTypes();
            case 2:
                return gn.v1.fromBundle((Bundle) obj);
            case 3:
                return ((gn.v1) obj).toBundle();
            case 4:
                b2 b2Var = b2.f7550d;
                return Integer.valueOf(((gn.v1) obj).f58207c);
            case 5:
                return new zd.v((com.google.android.exoplayer2.util.d) obj);
            case 6:
                return ((com.google.android.exoplayer2.i) obj).toBundle();
            case 7:
                we weVar = eo.c.f54793b;
                return Long.valueOf(((hp.c) obj).f59100b);
            case 8:
                we weVar2 = eo.c.f54793b;
                return Long.valueOf(((hp.c) obj).f59101c);
            case 9:
                ep.c0 c0Var = (ep.c0) obj;
                int i10 = ep.w.G;
                return c0Var;
            case 10:
                return ((b2) obj).toBundle();
            case 11:
                return ((e.C0566e) obj).toBundle();
            case 12:
                return b2.fromBundle((Bundle) obj);
            case 13:
                return e.C0566e.fromBundle((Bundle) obj);
            case 14:
                return gn.z.fromBundle((Bundle) obj);
            case 15:
                gn.z zVar = (gn.z) obj;
                return zVar.f58263a + ": " + zVar.f58264b;
            case 16:
                return ((gn.z) obj).toBundle();
            case 17:
                return StreamKey.fromBundle((Bundle) obj);
            case 18:
                return gn.o0.fromBundle((Bundle) obj);
            case 19:
                return ((StreamKey) obj).toBundle();
            case 20:
                return ((gn.o0) obj).toBundle();
            case 21:
                return gn.t1.fromBundle((Bundle) obj);
            case 22:
                return gn.r1.fromBundle((Bundle) obj);
            case 23:
                return io.bidmachine.media3.common.b.fromBundle((Bundle) obj);
            case 24:
                return ((gn.w1) obj).toBundle();
            case 25:
                return gn.w1.fromBundle((Bundle) obj);
            case 26:
                return ((b2.a) obj).toBundle();
            case 27:
                return b2.a.fromBundle((Bundle) obj);
            case 28:
                return ((in.b) obj).toSerializableBundle();
            default:
                we weVar3 = hp.d.f59103e;
                long j10 = ((hp.c) obj).f59100b;
                if (j10 == C.TIME_UNSET) {
                    j10 = 0;
                }
                return Long.valueOf(j10);
        }
    }
}
