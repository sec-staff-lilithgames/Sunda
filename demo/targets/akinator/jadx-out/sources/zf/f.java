package zf;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class f extends FloatingActionButton.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f97939b;

    public f(BottomAppBar bottomAppBar, int i10) {
        this.f97939b = bottomAppBar;
        this.f97938a = i10;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public void onHidden(FloatingActionButton floatingActionButton) {
        int i10 = BottomAppBar.f28949x0;
        floatingActionButton.setTranslationX(this.f97939b.A(this.f97938a));
        floatingActionButton.show(new e());
    }
}
