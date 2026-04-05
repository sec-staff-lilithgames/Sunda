package pg;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f81226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f81227b;

    public h(ExtendedFloatingActionButton extendedFloatingActionButton, g gVar) {
        this.f81227b = extendedFloatingActionButton;
        this.f81226a = gVar;
    }

    @Override // pg.n
    public int getHeight() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f81227b;
        int i10 = extendedFloatingActionButton.f29249c0;
        g gVar = this.f81226a;
        if (i10 != -1) {
            return (i10 == 0 || i10 == -2) ? gVar.getHeight() : i10;
        }
        if (!(extendedFloatingActionButton.getParent() instanceof View)) {
            return gVar.getHeight();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.height != -2) {
            return (view.getHeight() - ((!(extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingBottom() + view.getPaddingTop());
        }
        return gVar.getHeight();
    }

    @Override // pg.n
    public ViewGroup.LayoutParams getLayoutParams() {
        int i10 = this.f81227b.f29249c0;
        if (i10 == 0) {
            i10 = -2;
        }
        return new ViewGroup.LayoutParams(-1, i10);
    }

    @Override // pg.n
    public int getPaddingEnd() {
        return this.f81227b.S;
    }

    @Override // pg.n
    public int getPaddingStart() {
        return this.f81227b.R;
    }

    @Override // pg.n
    public int getWidth() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f81227b;
        boolean z10 = extendedFloatingActionButton.getParent() instanceof View;
        g gVar = this.f81226a;
        if (!z10) {
            return gVar.getWidth();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.width != -2) {
            return (view.getWidth() - ((!(extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingRight() + view.getPaddingLeft());
        }
        return gVar.getWidth();
    }
}
