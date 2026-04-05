package m7;

import android.view.View;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h implements p {

    /* renamed from: b, reason: collision with root package name */
    public final View f74060b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f74061c;

    public h(View view, boolean z10) {
        this.f74060b = view;
        this.f74061c = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return e0.areEqual(getView(), hVar.getView()) && getSubtractPadding() == hVar.getSubtractPadding();
    }

    @Override // m7.p
    public boolean getSubtractPadding() {
        return this.f74061c;
    }

    @Override // m7.p
    public View getView() {
        return this.f74060b;
    }

    public int hashCode() {
        return Boolean.hashCode(getSubtractPadding()) + (getView().hashCode() * 31);
    }

    @Override // m7.p, m7.k
    public Object size(zu.d<? super j> dVar) {
        return m.size(this, dVar);
    }
}
