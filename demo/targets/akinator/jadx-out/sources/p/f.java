package p;

import android.view.MenuItem;
import p.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.a f79984b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuItem f79985c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f79986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f79987f;

    public f(g gVar, h.a aVar, MenuItem menuItem, m mVar) {
        this.f79987f = gVar;
        this.f79984b = aVar;
        this.f79985c = menuItem;
        this.f79986e = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        h.a aVar = this.f79984b;
        if (aVar != null) {
            g gVar = this.f79987f;
            gVar.f79989b.C = true;
            aVar.f80015b.close(false);
            gVar.f79989b.C = false;
        }
        MenuItem menuItem = this.f79985c;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.f79986e.performItemAction(menuItem, 4);
        }
    }
}
