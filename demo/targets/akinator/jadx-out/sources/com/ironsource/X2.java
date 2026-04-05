package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class X2 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final pg f35703a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements pg {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(V0 adTools, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "$adTools");
            adTools.d(new sh(adTools, j10, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(V0 adTools, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "$adTools");
            adTools.e().h().a(j10);
        }

        @Override // com.ironsource.pg
        public void a(View view, FrameLayout.LayoutParams layoutParams, V0 adTools) {
            kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
            kotlin.jvm.internal.e0.checkNotNullParameter(layoutParams, "layoutParams");
            kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
            View childAt = X2.this.getChildAt(0);
            long jB = Mb.f34856s.d().g().b();
            if (jB <= 0) {
                X2.this.removeView(childAt);
                X2.this.addView(view, layoutParams);
                adTools.d(new sh(adTools, jB, 1));
                return;
            }
            adTools.d(new sh(adTools, jB, 2));
            view.setAlpha(0.0f);
            X2.this.addView(view, layoutParams);
            if (childAt != null) {
                childAt.animate().alpha(0.0f).setDuration(jB).withStartAction(new ch(childAt, 8)).withEndAction(new lh(X2.this, 2, childAt, childAt)).start();
            }
            view.animate().alpha(1.0f).setDuration(jB).withEndAction(new sh(adTools, jB, 3)).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(V0 adTools, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "$adTools");
            adTools.e().h().a(true, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(V0 adTools, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "$adTools");
            adTools.e().h().a(false, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(View this_apply) {
            kotlin.jvm.internal.e0.checkNotNullParameter(this_apply, "$this_apply");
            this_apply.setEnabled(false);
            this_apply.setClickable(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(X2 x22, View view, View this_apply) {
            kotlin.jvm.internal.e0.checkNotNullParameter(x22, SUvoXnn.lgyIMkoYhAMkv);
            kotlin.jvm.internal.e0.checkNotNullParameter(this_apply, "$this_apply");
            x22.removeView(view);
            this_apply.setEnabled(true);
            this_apply.setClickable(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X2(Context context) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f35703a = new a();
    }

    public final pg getViewBinder() {
        return this.f35703a;
    }
}
