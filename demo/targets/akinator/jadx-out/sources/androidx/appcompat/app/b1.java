package androidx.appcompat.app;

import android.view.MenuItem;
import q.u3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b1 implements u3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1 f4721a;

    public b1(f1 f1Var) {
        this.f4721a = f1Var;
    }

    @Override // q.u3
    public boolean onMenuItemClick(MenuItem menuItem) {
        return this.f4721a.f4730b.onMenuItemSelected(0, menuItem);
    }
}
