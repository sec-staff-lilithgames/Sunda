package vn;

import android.net.Uri;
import android.os.SystemClock;
import go.r;
import go.s;
import io.bidmachine.media3.common.util.a1;
import java.util.List;
import vn.d;
import vn.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f89335b;

    public c(d dVar) {
        this.f89335b = dVar;
    }

    @Override // vn.m
    public void onPlaylistChanged() {
        this.f89335b.f89341g.remove(this);
    }

    @Override // vn.m
    public boolean onPlaylistError(Uri uri, s sVar, boolean z10) {
        d.a aVar;
        d dVar = this.f89335b;
        if (dVar.f89350p == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            List list = ((h) a1.castNonNull(dVar.f89348n)).f89430e;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                d.a aVar2 = (d.a) dVar.f89340f.get(((h.b) list.get(i11)).f89442a);
                if (aVar2 != null && jElapsedRealtime < aVar2.f89360j) {
                    i10++;
                }
            }
            r fallbackSelectionFor = dVar.f89339e.getFallbackSelectionFor(new go.q(1, 0, dVar.f89348n.f89430e.size(), i10), sVar);
            if (fallbackSelectionFor != null && fallbackSelectionFor.f58364a == 2 && (aVar = (d.a) dVar.f89340f.get(uri)) != null) {
                d.a.a(aVar, fallbackSelectionFor.f58365b);
            }
        }
        return false;
    }
}
