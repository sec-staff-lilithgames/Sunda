package x3;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e2 implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public static final e2 f91567b = new e2();

    @Override // kv.l
    public final Iterator<View> invoke(View view) {
        rv.t children;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (children = g2.getChildren(viewGroup)) == null) {
            return null;
        }
        return children.iterator();
    }
}
