package x3;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d2 implements rv.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f91558a;

    public d2(ViewGroup viewGroup) {
        this.f91558a = viewGroup;
    }

    @Override // rv.t
    public Iterator<View> iterator() {
        return g2.iterator(this.f91558a);
    }
}
