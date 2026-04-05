package p1;

import android.view.View;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final View f80666a;

    public d(View view) {
        e0.checkNotNullParameter(view, "view");
        this.f80666a = view;
    }

    @Override // p1.a
    /* renamed from: performHapticFeedback-CdsT49E */
    public void mo5860performHapticFeedbackCdsT49E(int i10) {
        b bVar = c.f80664b;
        boolean zM5866equalsimpl0 = c.m5866equalsimpl0(i10, bVar.m5861getLongPress5zf0vsI());
        View view = this.f80666a;
        if (zM5866equalsimpl0) {
            view.performHapticFeedback(0);
        } else if (c.m5866equalsimpl0(i10, bVar.m5862getTextHandleMove5zf0vsI())) {
            view.performHapticFeedback(9);
        }
    }
}
