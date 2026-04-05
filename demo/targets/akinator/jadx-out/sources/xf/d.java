package xf;

import android.content.res.Resources;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import com.digidust.elokence.akinator.freemium.R;
import qg.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f91968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f91969c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f91970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f91971f;

    public d(a aVar, Toolbar toolbar, int i10, FrameLayout frameLayout) {
        this.f91968b = toolbar;
        this.f91969c = i10;
        this.f91970e = aVar;
        this.f91971f = frameLayout;
    }

    @Override // java.lang.Runnable
    public void run() throws Resources.NotFoundException {
        int i10 = this.f91969c;
        Toolbar toolbar = this.f91968b;
        ActionMenuItemView actionMenuItemView = l0.getActionMenuItemView(toolbar, i10);
        if (actionMenuItemView != null) {
            Resources resources = toolbar.getResources();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_horizontal_offset);
            a aVar = this.f91970e;
            c cVar = aVar.f91947g;
            cVar.f91956a.C = Integer.valueOf(dimensionPixelOffset);
            cVar.f91957b.C = Integer.valueOf(dimensionPixelOffset);
            aVar.k();
            int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_vertical_offset);
            c cVar2 = aVar.f91947g;
            cVar2.f91956a.D = Integer.valueOf(dimensionPixelOffset2);
            cVar2.f91957b.D = Integer.valueOf(dimensionPixelOffset2);
            aVar.k();
            h.attachBadgeDrawable(aVar, actionMenuItemView, this.f91971f);
            h.a(actionMenuItemView, aVar);
        }
    }
}
