package pg;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class i implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f81228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f81229b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f81230c;

    public i(ExtendedFloatingActionButton extendedFloatingActionButton, h hVar, g gVar) {
        this.f81230c = extendedFloatingActionButton;
        this.f81228a = hVar;
        this.f81229b = gVar;
    }

    @Override // pg.n
    public int getHeight() {
        int i10 = this.f81230c.f29249c0;
        return i10 == -1 ? this.f81228a.getHeight() : (i10 == 0 || i10 == -2) ? this.f81229b.getHeight() : i10;
    }

    @Override // pg.n
    public ViewGroup.LayoutParams getLayoutParams() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f81230c;
        int i10 = extendedFloatingActionButton.f29248b0;
        if (i10 == 0) {
            i10 = -2;
        }
        int i11 = extendedFloatingActionButton.f29249c0;
        return new ViewGroup.LayoutParams(i10, i11 != 0 ? i11 : -2);
    }

    @Override // pg.n
    public int getPaddingEnd() {
        return this.f81230c.S;
    }

    @Override // pg.n
    public int getPaddingStart() {
        return this.f81230c.R;
    }

    @Override // pg.n
    public int getWidth() {
        int i10 = this.f81230c.f29248b0;
        return i10 == -1 ? this.f81228a.getWidth() : (i10 == 0 || i10 == -2) ? this.f81229b.getWidth() : i10;
    }
}
