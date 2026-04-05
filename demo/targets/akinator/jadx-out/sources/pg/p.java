package pg;

import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class p implements w {

    /* renamed from: a, reason: collision with root package name */
    public final vf.k f81232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FloatingActionButton f81233b;

    public p(FloatingActionButton floatingActionButton, vf.k kVar) {
        this.f81233b = floatingActionButton;
        this.f81232a = kVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof p) && ((p) obj).f81232a.equals(this.f81232a);
    }

    public int hashCode() {
        return this.f81232a.hashCode();
    }

    @Override // pg.w
    public void onScaleChanged() {
        ((zf.b) this.f81232a).onScaleChanged((View) this.f81233b);
    }

    @Override // pg.w
    public void onTranslationChanged() {
        ((zf.b) this.f81232a).onTranslationChanged((View) this.f81233b);
    }
}
