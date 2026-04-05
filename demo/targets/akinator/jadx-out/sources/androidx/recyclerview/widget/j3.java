package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    public final i3 f7158a;

    /* renamed from: b, reason: collision with root package name */
    public final h3 f7159b;

    public j3(i3 i3Var) {
        this.f7158a = i3Var;
        h3 h3Var = new h3();
        h3Var.f7135a = 0;
        this.f7159b = h3Var;
    }

    public final View a(int i10, int i11, int i12, int i13) {
        i3 i3Var = this.f7158a;
        int parentStart = i3Var.getParentStart();
        int parentEnd = i3Var.getParentEnd();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View childAt = i3Var.getChildAt(i10);
            int childStart = i3Var.getChildStart(childAt);
            int childEnd = i3Var.getChildEnd(childAt);
            h3 h3Var = this.f7159b;
            h3Var.f7136b = parentStart;
            h3Var.f7137c = parentEnd;
            h3Var.f7138d = childStart;
            h3Var.f7139e = childEnd;
            if (i12 != 0) {
                h3Var.f7135a = i12;
                if (h3Var.a()) {
                    return childAt;
                }
            }
            if (i13 != 0) {
                h3Var.f7135a = i13;
                if (h3Var.a()) {
                    view = childAt;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public final boolean b(View view) {
        i3 i3Var = this.f7158a;
        int parentStart = i3Var.getParentStart();
        int parentEnd = i3Var.getParentEnd();
        int childStart = i3Var.getChildStart(view);
        int childEnd = i3Var.getChildEnd(view);
        h3 h3Var = this.f7159b;
        h3Var.f7136b = parentStart;
        h3Var.f7137c = parentEnd;
        h3Var.f7138d = childStart;
        h3Var.f7139e = childEnd;
        h3Var.f7135a = 24579;
        return h3Var.a();
    }
}
