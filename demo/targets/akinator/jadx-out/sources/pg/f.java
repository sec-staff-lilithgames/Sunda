package pg;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class f implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f81224a;

    public f(ExtendedFloatingActionButton extendedFloatingActionButton) {
        this.f81224a = extendedFloatingActionButton;
    }

    @Override // pg.n
    public int getHeight() {
        return this.f81224a.getCollapsedSize();
    }

    @Override // pg.n
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(getWidth(), getHeight());
    }

    @Override // pg.n
    public int getPaddingEnd() {
        return this.f81224a.getCollapsedPadding();
    }

    @Override // pg.n
    public int getPaddingStart() {
        return this.f81224a.getCollapsedPadding();
    }

    @Override // pg.n
    public int getWidth() {
        return this.f81224a.getCollapsedSize();
    }
}
