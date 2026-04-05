package ks;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.util.a0;
import com.google.android.material.search.SearchView;
import io.bidmachine.media3.common.util.w;
import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;
import on.c0;
import x3.e3;
import x3.q0;
import x3.t3;
import zd.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class g implements o.a, w, q0, a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71973b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f71974c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f71975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f71976f;

    public /* synthetic */ g(int i10, int i11, int i12, Object obj) {
        this.f71973b = i12;
        this.f71976f = obj;
        this.f71974c = i10;
        this.f71975e = i11;
    }

    @Override // io.odeeo.internal.q0.o.a
    public void invoke(Object obj) {
        switch (this.f71973b) {
            case 0:
                ((io.odeeo.internal.c.b) obj).onSurfaceSizeChanged((b.a) this.f71976f, this.f71974c, this.f71975e);
                break;
            case 1:
                ((c0) ((on.d) obj)).onSurfaceSizeChanged((on.b) this.f71976f, this.f71974c, this.f71975e);
                break;
            default:
                ((z) ((zd.d) obj)).onSurfaceSizeChanged((zd.b) this.f71976f, this.f71974c, this.f71975e);
                break;
        }
    }

    @Override // x3.q0
    public e3 onApplyWindowInsets(View view, e3 e3Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f71976f;
        int i10 = SearchView.G;
        o3.c insets = e3Var.getInsets(t3.systemBars() | t3.displayCutout());
        marginLayoutParams.leftMargin = this.f71974c + insets.f77432a;
        marginLayoutParams.rightMargin = this.f71975e + insets.f77434c;
        return e3Var;
    }
}
