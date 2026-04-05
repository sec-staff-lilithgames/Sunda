package de;

import android.os.Handler;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.drm.b f52140a;

    public j(com.google.android.exoplayer2.drm.b bVar) {
        this.f52140a = bVar;
    }

    @Override // de.c
    public void onReferenceCountDecremented(com.google.android.exoplayer2.drm.a aVar, int i10) {
        com.google.android.exoplayer2.drm.b bVar = this.f52140a;
        Set set = bVar.f27422o;
        long j10 = bVar.f27419l;
        if (i10 == 1 && bVar.f27423p > 0 && j10 != C.TIME_UNSET) {
            set.add(aVar);
            ((Handler) com.google.android.exoplayer2.util.a.checkNotNull(bVar.f27428u)).postAtTime(new com.unity3d.services.banners.view.a(aVar, 6), aVar, SystemClock.uptimeMillis() + j10);
        } else if (i10 == 0) {
            bVar.f27420m.remove(aVar);
            if (bVar.f27425r == aVar) {
                bVar.f27425r = null;
            }
            if (bVar.f27426s == aVar) {
                bVar.f27426s = null;
            }
            bVar.f27416i.onSessionFullyReleased(aVar);
            if (j10 != C.TIME_UNSET) {
                ((Handler) com.google.android.exoplayer2.util.a.checkNotNull(bVar.f27428u)).removeCallbacksAndMessages(aVar);
                set.remove(aVar);
            }
        }
        bVar.f();
    }

    @Override // de.c
    public void onReferenceCountIncremented(com.google.android.exoplayer2.drm.a aVar, int i10) {
        com.google.android.exoplayer2.drm.b bVar = this.f52140a;
        if (bVar.f27419l != C.TIME_UNSET) {
            bVar.f27422o.remove(aVar);
            ((Handler) com.google.android.exoplayer2.util.a.checkNotNull(bVar.f27428u)).removeCallbacksAndMessages(aVar);
        }
    }
}
