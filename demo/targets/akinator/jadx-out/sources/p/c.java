package p;

import android.content.Context;
import android.view.MenuItem;
import z.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f79979a;

    /* renamed from: b, reason: collision with root package name */
    public t1 f79980b;

    public c(Context context) {
        this.f79979a = context;
    }

    public final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof q3.b)) {
            return menuItem;
        }
        q3.b bVar = (q3.b) menuItem;
        if (this.f79980b == null) {
            this.f79980b = new t1();
        }
        MenuItem menuItem2 = (MenuItem) this.f79980b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        v vVar = new v(this.f79979a, bVar);
        this.f79980b.put(bVar, vVar);
        return vVar;
    }
}
