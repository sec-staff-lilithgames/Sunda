package zq;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import ir.s;
import kotlin.jvm.internal.e0;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l extends LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f98437g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final o f98438b;

    /* renamed from: c, reason: collision with root package name */
    public final o f98439c;

    /* renamed from: e, reason: collision with root package name */
    public final o f98440e;

    /* renamed from: f, reason: collision with root package name */
    public final o f98441f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context);
        e0.checkNotNullParameter(context, "context");
        this.f98438b = q.lazy(new k(this));
        this.f98439c = q.lazy(new j(this));
        this.f98440e = q.lazy(new i(this));
        this.f98441f = q.lazy(new h(this));
        View.inflate(context, R.layout.bm_privacy_sheet, this);
        setOrientation(1);
        setBackgroundResource(R.drawable.bm_bg_privacy_sheet);
        int iDpToPx = s.dpToPx(context, 16.0f);
        setPadding(iDpToPx, iDpToPx, iDpToPx, 0);
    }

    private final LinearLayout getActionButtonsContainer() {
        Object value = this.f98441f.getValue();
        e0.checkNotNullExpressionValue(value, "<get-actionButtonsContainer>(...)");
        return (LinearLayout) value;
    }

    private final View getCloseButton() {
        Object value = this.f98440e.getValue();
        e0.checkNotNullExpressionValue(value, "<get-closeButton>(...)");
        return (View) value;
    }

    private final TextView getSubtitleTextView() {
        Object value = this.f98439c.getValue();
        e0.checkNotNullExpressionValue(value, "<get-subtitleTextView>(...)");
        return (TextView) value;
    }

    private final TextView getTitleTextView() {
        Object value = this.f98438b.getValue();
        e0.checkNotNullExpressionValue(value, "<get-titleTextView>(...)");
        return (TextView) value;
    }

    public final void a(String title, Drawable drawable, kv.a clickListener) {
        e0.checkNotNullParameter(title, "title");
        e0.checkNotNullParameter(clickListener, "clickListener");
        LinearLayout actionButtonsContainer = getActionButtonsContainer();
        Context context = getContext();
        e0.checkNotNullExpressionValue(context, "context");
        a aVar = new a(context);
        aVar.setText(title);
        aVar.setActionIcon(drawable);
        aVar.setOnClickListener(new com.moloco.sdk.internal.publisher.nativead.ui.c(1, clickListener));
        actionButtonsContainer.addView(aVar, -1, -2);
    }

    public final void setOnCloseButtonClickListener(kv.a clickListener) {
        e0.checkNotNullParameter(clickListener, "clickListener");
        getCloseButton().setOnClickListener(new com.moloco.sdk.internal.publisher.nativead.ui.c(2, clickListener));
    }

    public final void setSubtitle(String subtitle) {
        e0.checkNotNullParameter(subtitle, "subtitle");
        getSubtitleTextView().setText(subtitle);
    }

    public final void setTitle(String title) {
        e0.checkNotNullParameter(title, "title");
        getTitleTextView().setText(title);
    }

    public final void a() {
        getActionButtonsContainer().removeAllViews();
    }
}
