package zf;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f97946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f97947c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f97948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f97949f;

    public i(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i10, boolean z10) {
        this.f97949f = bottomAppBar;
        this.f97946b = actionMenuView;
        this.f97947c = i10;
        this.f97948e = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10 = this.f97947c;
        boolean z10 = this.f97948e;
        BottomAppBar bottomAppBar = this.f97949f;
        this.f97946b.setTranslationX(bottomAppBar.z(r3, i10, z10));
    }
}
