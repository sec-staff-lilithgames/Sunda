package zq;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import ir.s;
import kotlin.jvm.internal.e0;
import o9.j0;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f98430e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final o f98431b;

    /* renamed from: c, reason: collision with root package name */
    public kv.a f98432c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        e0.checkNotNullParameter(context, "context");
        this.f98431b = q.lazy(new f(context));
        this.f98432c = d.f98428e;
        setOnClickListener(new j0(this, 19));
        l privacySheetView = getPrivacySheetView();
        privacySheetView.setOnCloseButtonClickListener(new c(this));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        addView(privacySheetView, layoutParams);
        final int paddingBottom = getPrivacySheetView().getPaddingBottom();
        setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: zq.b
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                g.a(this.f98425a, paddingBottom, view, windowInsets);
                return windowInsets;
            }
        });
    }

    public static void a(g this$0, int i10, View view, WindowInsets insets) {
        Rect rect;
        e0.checkNotNullParameter(this$0, "this$0");
        e0.checkNotNullParameter(view, "<anonymous parameter 0>");
        e0.checkNotNullParameter(insets, "insets");
        if (Build.VERSION.SDK_INT >= 30) {
            Insets insets2 = insets.getInsets(WindowInsets.Type.systemBars());
            rect = new Rect(insets2.left, insets2.top, insets2.right, insets2.bottom);
        } else {
            rect = new Rect(insets.getSystemWindowInsetLeft(), insets.getSystemWindowInsetTop(), insets.getSystemWindowInsetRight(), insets.getSystemWindowInsetBottom());
        }
        this$0.getPrivacySheetView().setPadding(this$0.getPrivacySheetView().getPaddingLeft(), this$0.getPrivacySheetView().getPaddingTop(), this$0.getPrivacySheetView().getPaddingRight(), i10 + rect.bottom);
        this$0.setPadding(0, rect.top, 0, 0);
    }

    private final l getPrivacySheetView() {
        return (l) this.f98431b.getValue();
    }

    public final kv.a getOnCloseClickListener() {
        return this.f98432c;
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View child, int i10, int i11, int i12, int i13) {
        e0.checkNotNullParameter(child, "child");
        int size = View.MeasureSpec.getSize(i10);
        Context context = getContext();
        e0.checkNotNullExpressionValue(context, "context");
        int iDpToPx = s.dpToPx(context, 600.0f);
        Context context2 = getContext();
        e0.checkNotNullExpressionValue(context2, "context");
        if (size >= s.dpToPx(context2, 32.0f) + iDpToPx) {
            i10 = View.MeasureSpec.makeMeasureSpec(iDpToPx, 1073741824);
        }
        super.measureChildWithMargins(child, i10, i11, i12, i13);
    }

    public final void setOnCloseClickListener(kv.a aVar) {
        e0.checkNotNullParameter(aVar, "<set-?>");
        this.f98432c = aVar;
    }

    public final void setSubtitle(String subtitle) {
        e0.checkNotNullParameter(subtitle, "subtitle");
        getPrivacySheetView().setSubtitle(subtitle);
    }

    public final void setTitle(String title) {
        e0.checkNotNullParameter(title, "title");
        getPrivacySheetView().setTitle(title);
    }

    public final void a(String title, Drawable drawable, kv.a clickListener) {
        e0.checkNotNullParameter(title, "title");
        e0.checkNotNullParameter(clickListener, "clickListener");
        getPrivacySheetView().a(title, drawable, clickListener);
    }

    public final void a() {
        getPrivacySheetView().a();
    }
}
