package pg;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class g implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f81225a;

    public g(ExtendedFloatingActionButton extendedFloatingActionButton) {
        this.f81225a = extendedFloatingActionButton;
    }

    @Override // pg.n
    public int getHeight() {
        return this.f81225a.getMeasuredHeight();
    }

    @Override // pg.n
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // pg.n
    public int getPaddingEnd() {
        return this.f81225a.S;
    }

    @Override // pg.n
    public int getPaddingStart() {
        return this.f81225a.R;
    }

    @Override // pg.n
    public int getWidth() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f81225a;
        return ((extendedFloatingActionButton.getMeasuredWidth() - extendedFloatingActionButton.getPaddingStart()) - extendedFloatingActionButton.getPaddingEnd()) + extendedFloatingActionButton.R + extendedFloatingActionButton.S;
    }
}
