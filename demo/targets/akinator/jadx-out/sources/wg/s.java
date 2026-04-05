package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.EditText;
import com.google.android.material.search.SearchBar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f90606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f90607b;

    public s(t tVar, boolean z10) {
        this.f90607b = tVar;
        this.f90606a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        t tVar = this.f90607b;
        EditText editText = tVar.f90617j;
        boolean z10 = this.f90606a;
        t.a(tVar, z10 ? 1.0f : 0.0f);
        editText.setAlpha(1.0f);
        SearchBar searchBar = tVar.f90623p;
        if (searchBar != null) {
            searchBar.getTextView().setAlpha(1.0f);
        }
        editText.setClipBounds(null);
        tVar.f90610c.resetClipBoundsAndCornerRadii();
        if (z10) {
            return;
        }
        tVar.f90621n.clearExpandedCornerRadii();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        t.a(this.f90607b, this.f90606a ? 0.0f : 1.0f);
    }
}
