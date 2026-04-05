package gh;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.transformation.ExpandableBehavior;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f57685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f57686c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ og.b f57687e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ExpandableBehavior f57688f;

    public a(ExpandableBehavior expandableBehavior, View view, int i10, og.b bVar) {
        this.f57688f = expandableBehavior;
        this.f57685b = view;
        this.f57686c = i10;
        this.f57687e = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View view = this.f57685b;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.f57688f;
        if (expandableBehavior.f29584b == this.f57686c) {
            og.b bVar = this.f57687e;
            expandableBehavior.a((View) bVar, view, bVar.isExpanded(), false);
        }
        return false;
    }
}
