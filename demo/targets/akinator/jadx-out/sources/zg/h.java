package zg;

import android.net.Network;
import android.webkit.WebView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.inmobi.media.AbstractC2677a2;
import com.inmobi.media.C0;
import com.inmobi.media.C2691b;
import com.inmobi.media.C2743e0;
import com.inmobi.media.C2744e1;
import com.inmobi.media.C2747e4;
import com.inmobi.media.C2780g3;
import com.inmobi.media.C2787ga;
import com.inmobi.media.C2843k;
import com.inmobi.media.C2910nf;
import com.inmobi.media.C2934p5;
import com.inmobi.media.C2981s2;
import com.inmobi.media.C2999t3;
import com.inmobi.media.C3031v1;
import com.inmobi.media.C3099z1;
import com.inmobi.media.Cc;
import com.inmobi.media.D0;
import com.inmobi.media.G;
import com.inmobi.media.G1;
import com.inmobi.media.G7;
import com.inmobi.media.I1;
import com.inmobi.media.J;
import com.inmobi.media.Jf;
import com.inmobi.media.Kf;
import com.inmobi.media.P4;
import com.inmobi.media.U4;
import i4.m;
import zl.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97965b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f97966c;

    public /* synthetic */ h(Object obj, int i10) {
        this.f97965b = i10;
        this.f97966c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f97965b) {
            case 0:
                ag.h hVar = (ag.h) this.f97966c;
                hVar.f4406c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) hVar.f4408e;
                m mVar = sideSheetBehavior.f29373l;
                if (mVar != null && mVar.continueSettling(true)) {
                    hVar.a(hVar.f4405b);
                    break;
                } else if (sideSheetBehavior.f29371j == 2) {
                    sideSheetBehavior.a(hVar.f4405b);
                    break;
                }
                break;
            case 1:
                C0.a((D0) this.f97966c);
                break;
            case 2:
                Cc.a((Cc) this.f97966c);
                break;
            case 3:
                G.a((J) this.f97966c);
                break;
            case 4:
                G1.a((G1) this.f97966c);
                break;
            case 5:
                G7.a((G7) this.f97966c);
                break;
            case 6:
                I1.a((I1) this.f97966c);
                break;
            case 7:
                Jf.a((Kf) this.f97966c);
                break;
            case 8:
                P4.a((P4) this.f97966c);
                break;
            case 9:
                U4.a((U4) this.f97966c);
                break;
            case 10:
                AbstractC2677a2.a((AbstractC2677a2) this.f97966c);
                break;
            case 11:
                C2691b.b((C2691b) this.f97966c);
                break;
            case 12:
                C2743e0.a((C2743e0) this.f97966c);
                break;
            case 13:
                C2744e1.a((C2744e1) this.f97966c);
                break;
            case 14:
                C2780g3.a((C2780g3) this.f97966c);
                break;
            case 15:
                C2787ga.a((C2787ga) this.f97966c);
                break;
            case 16:
                C2910nf.a((C2910nf) this.f97966c);
                break;
            case 17:
                C2934p5.a((C2747e4) this.f97966c);
                break;
            case 18:
                C2981s2.a((WebView) this.f97966c);
                break;
            case 19:
                C2999t3.b((Network) this.f97966c);
                break;
            case 20:
                C3031v1.b((C2843k) this.f97966c);
                break;
            case 21:
                C3099z1.a((C3099z1) this.f97966c);
                break;
            default:
                try {
                    ((t) this.f97966c).b();
                    break;
                } catch (Throwable th2) {
                    nm.a.w(th2);
                }
        }
    }
}
