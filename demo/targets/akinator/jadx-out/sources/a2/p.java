package a2;

import a2.t;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.amazon.aps.ads.util.adview.ApsAdViewBase;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3750b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3751c;

    public /* synthetic */ p(ViewGroup viewGroup, int i10) {
        this.f3750b = i10;
        this.f3751c = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i10 = this.f3750b;
        ViewGroup viewGroup = this.f3751c;
        switch (i10) {
            case 0:
                t this$0 = (t) viewGroup;
                t.a aVar = t.f3798r0;
                kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
                this$0.n();
                break;
            default:
                ((ApsAdViewBase) viewGroup).verifyIsVisible();
                break;
        }
    }
}
