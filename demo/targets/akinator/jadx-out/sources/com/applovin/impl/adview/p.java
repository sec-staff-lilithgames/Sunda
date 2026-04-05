package com.applovin.impl.adview;

import android.view.View;
import com.applovin.impl.sdk.i;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.google.android.exoplayer2.p0;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.inmobi.media.A;
import com.inmobi.media.B6;
import com.inmobi.media.C2985s6;
import com.inmobi.media.I1;
import com.inmobi.media.T1;
import io.odeeo.internal.b.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13559b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13560c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13561e;

    public /* synthetic */ p(int i10, Object obj, int i11) {
        this.f13559b = i11;
        this.f13560c = i10;
        this.f13561e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.exoplayer2.audio.k kVar;
        switch (this.f13559b) {
            case 0:
                ((a) this.f13561e).a(this.f13560c);
                break;
            case 1:
                ((i.a) this.f13561e).a(this.f13560c);
                break;
            case 2:
                ((MaxAdPlacer) this.f13561e).a(this.f13560c);
                break;
            case 3:
                com.google.android.exoplayer2.c cVar = com.google.android.exoplayer2.c.this;
                cVar.getClass();
                int i10 = this.f13560c;
                if (i10 != -3 && i10 != -2) {
                    if (i10 == -1) {
                        com.google.android.exoplayer2.d dVar = cVar.f27342c;
                        if (dVar != null) {
                            ((p0) dVar).executePlayerCommand(-1);
                        }
                        cVar.a();
                        break;
                    } else if (i10 == 1) {
                        cVar.b(1);
                        com.google.android.exoplayer2.d dVar2 = cVar.f27342c;
                        if (dVar2 != null) {
                            ((p0) dVar2).executePlayerCommand(1);
                            break;
                        }
                    } else {
                        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.p(i10, "Unknown focus change type: ", "AudioFocusManager");
                        break;
                    }
                } else if (i10 != -2 && ((kVar = cVar.f27343d) == null || kVar.f27158b != 1)) {
                    cVar.b(3);
                    break;
                } else {
                    com.google.android.exoplayer2.d dVar3 = cVar.f27342c;
                    if (dVar3 != null) {
                        ((p0) dVar3).executePlayerCommand(0);
                    }
                    cVar.b(2);
                    break;
                }
                break;
            case 4:
                ((hn.b) this.f13561e).f59023b.onAudioFocusChange(this.f13560c);
                break;
            case 5:
                io.odeeo.sdk.c.a(this.f13560c, (io.odeeo.sdk.c) this.f13561e);
                break;
            case 6:
                ((c.a) this.f13561e).a(this.f13560c);
                break;
            case 7:
                ((n3.n) this.f13561e).onFontRetrievalFailed(this.f13560c);
                break;
            case 8:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f13561e;
                View view = (View) sideSheetBehavior.f29380s.get();
                if (view != null) {
                    sideSheetBehavior.c(view, this.f13560c, false);
                    break;
                }
                break;
            case 9:
                A.b(this.f13560c, (I1) this.f13561e);
                break;
            case 10:
                B6.a((B6) this.f13561e, this.f13560c);
                break;
            case 11:
                T1.a((T1) this.f13561e, this.f13560c);
                break;
            default:
                C2985s6.a((C2985s6) this.f13561e, this.f13560c);
                break;
        }
    }

    public /* synthetic */ p(Object obj, int i10, int i11) {
        this.f13559b = i11;
        this.f13561e = obj;
        this.f13560c = i10;
    }
}
