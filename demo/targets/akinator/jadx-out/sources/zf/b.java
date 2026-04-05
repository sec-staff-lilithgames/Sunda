package zf;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b implements vf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f97935a;

    public b(BottomAppBar bottomAppBar) {
        this.f97935a = bottomAppBar;
    }

    @Override // vf.k
    public void onScaleChanged(FloatingActionButton floatingActionButton) {
        BottomAppBar bottomAppBar = this.f97935a;
        bottomAppBar.f28950a0.setInterpolation((floatingActionButton.getVisibility() == 0 && bottomAppBar.f28955f0 == 1) ? floatingActionButton.getScaleY() : 0.0f);
    }

    @Override // vf.k
    public void onTranslationChanged(FloatingActionButton floatingActionButton) {
        BottomAppBar bottomAppBar = this.f97935a;
        yg.j jVar = bottomAppBar.f28950a0;
        if (bottomAppBar.f28955f0 != 1) {
            return;
        }
        float translationX = floatingActionButton.getTranslationX();
        if (bottomAppBar.getTopEdgeTreatment().getHorizontalOffset() != translationX) {
            bottomAppBar.getTopEdgeTreatment().f97955g = translationX;
            jVar.invalidateSelf();
        }
        float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
        if (bottomAppBar.getTopEdgeTreatment().f97954f != fMax) {
            bottomAppBar.getTopEdgeTreatment().a(fMax);
            jVar.invalidateSelf();
        }
        jVar.setInterpolation(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
    }
}
