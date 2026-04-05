package e6;

import android.graphics.Rect;
import e6.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n extends c0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rect f53852a;

    public n(Rect rect) {
        this.f53852a = rect;
    }

    @Override // e6.c0.a
    public Rect onGetEpicenter(c0 c0Var) {
        return this.f53852a;
    }
}
