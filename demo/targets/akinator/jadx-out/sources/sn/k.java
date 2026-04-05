package sn;

import android.os.Handler;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f85991a;

    public k(l lVar) {
        this.f85991a = lVar;
    }

    @Override // sn.c
    public void onReferenceCountDecremented(d dVar, int i10) {
        l lVar = this.f85991a;
        Set set = lVar.f86005o;
        long j10 = lVar.f86002l;
        if (i10 == 1 && lVar.f86006p > 0 && j10 != C.TIME_UNSET) {
            set.add(dVar);
            ((Handler) io.bidmachine.media3.common.util.a.checkNotNull(lVar.f86011u)).postAtTime(new on.w(dVar, 12), dVar, SystemClock.uptimeMillis() + j10);
        } else if (i10 == 0) {
            lVar.f86003m.remove(dVar);
            if (lVar.f86008r == dVar) {
                lVar.f86008r = null;
            }
            if (lVar.f86009s == dVar) {
                lVar.f86009s = null;
            }
            lVar.f85999i.onSessionFullyReleased(dVar);
            if (j10 != C.TIME_UNSET) {
                ((Handler) io.bidmachine.media3.common.util.a.checkNotNull(lVar.f86011u)).removeCallbacksAndMessages(dVar);
                set.remove(dVar);
            }
        }
        lVar.f();
    }

    @Override // sn.c
    public void onReferenceCountIncremented(d dVar, int i10) {
        l lVar = this.f85991a;
        if (lVar.f86002l != C.TIME_UNSET) {
            lVar.f86005o.remove(dVar);
            ((Handler) io.bidmachine.media3.common.util.a.checkNotNull(lVar.f86011u)).removeCallbacksAndMessages(dVar);
        }
    }
}
