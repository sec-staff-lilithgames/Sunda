package tn;

import android.net.Uri;
import ao.b2;
import gn.v1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l implements q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f87234b;

    public l(m mVar) {
        this.f87234b = mVar;
    }

    @Override // tn.q, ao.p1
    public void onContinueLoadingRequested(r rVar) {
        m mVar = this.f87234b;
        mVar.f87254v.onContinueLoadingRequested(mVar);
    }

    @Override // tn.q
    public void onPlaylistRefreshRequired(Uri uri) {
        this.f87234b.f87236c.refreshPlaylist(uri);
    }

    @Override // tn.q
    public void onPrepared() {
        m mVar = this.f87234b;
        int i10 = mVar.f87255w - 1;
        mVar.f87255w = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (r rVar : mVar.f87257y) {
            i11 += rVar.getTrackGroups().f7552a;
        }
        v1[] v1VarArr = new v1[i11];
        int i12 = 0;
        for (r rVar2 : mVar.f87257y) {
            int i13 = rVar2.getTrackGroups().f7552a;
            int i14 = 0;
            while (i14 < i13) {
                v1VarArr[i12] = rVar2.getTrackGroups().get(i14);
                i14++;
                i12++;
            }
        }
        mVar.f87256x = new b2(v1VarArr);
        mVar.f87254v.onPrepared(mVar);
    }
}
