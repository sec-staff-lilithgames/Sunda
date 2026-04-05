package com.ironsource;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ug {

    /* renamed from: a, reason: collision with root package name */
    private final Rc f39074a;

    /* renamed from: b, reason: collision with root package name */
    private View f39075b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f39076c;

    /* renamed from: d, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f39077d;

    /* renamed from: e, reason: collision with root package name */
    private final ViewTreeObserver.OnWindowFocusChangeListener f39078e;

    /* renamed from: f, reason: collision with root package name */
    private final Rect f39079f;

    public ug(Rc onVisibilityChangeListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onVisibilityChangeListener, "onVisibilityChangeListener");
        this.f39074a = onVisibilityChangeListener;
        this.f39077d = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.ironsource.ii
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ug.a(this.f36956b);
            }
        };
        this.f39078e = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.ironsource.ji
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                ug.a(this.f37046a, z10);
            }
        };
        this.f39079f = new Rect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ug this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ug this$0, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.a();
    }

    public final void b() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        View view = this.f39075b;
        if (view != null && (viewTreeObserver2 = view.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this.f39077d);
        }
        View view2 = this.f39075b;
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnWindowFocusChangeListener(this.f39078e);
        }
        this.f39075b = null;
    }

    public final boolean c() {
        View view = this.f39075b;
        if (view != null) {
            return vg.a(view, this.f39079f);
        }
        return false;
    }

    public final void a(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        this.f39075b = view;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.f39077d);
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this.f39078e);
    }

    private final void a() {
        boolean zC = c();
        if (this.f39076c != zC) {
            this.f39076c = zC;
            this.f39074a.a(zC);
        }
    }
}
