package iq;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import br.o;
import br.p0;
import br.t;
import dq.q0;
import dq.w;
import eq.c;
import ir.s;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import vq.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends eq.a {

    /* renamed from: s, reason: collision with root package name */
    public final TextView f68352s;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: iq.a$a, reason: collision with other inner class name */
    public static final class C0707a {
        public C0707a(u uVar) {
        }
    }

    static {
        new C0707a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, b repository, br.a adElementParams, c adFormListener, tq.b eventCallback, rq.a aVar) {
        super(context, repository, adElementParams, adFormListener, eventCallback, aVar);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(repository, "repository");
        e0.checkNotNullParameter(adElementParams, "adElementParams");
        e0.checkNotNullParameter(adFormListener, "adFormListener");
        e0.checkNotNullParameter(eventCallback, "eventCallback");
        this.f68352s = new TextView(context);
    }

    @Override // eq.a, dq.h
    public /* bridge */ /* synthetic */ void a(ViewGroup viewGroup) {
        super.a(viewGroup);
    }

    @Override // eq.a
    public final void c(View view, q0 q0Var) {
        e0.checkNotNullParameter(view, "view");
        int cornerRadiusPxOrDefault$default = o.getCornerRadiusPxOrDefault$default(s(), t(), 0, 2, null);
        t border = s().getBorder(t());
        TextView textView = this.f68352s;
        if (q0Var != null) {
            q0Var.a(textView, Integer.valueOf(cornerRadiusPxOrDefault$default), border);
            return;
        }
        w wVar = new w();
        wVar.b(o.getBackgroundOrDefault$default(s(), 0, 1, null));
        wVar.a(cornerRadiusPxOrDefault$default);
        if (border != null) {
            w.a(wVar, border.getStrokeWidthPx(), border.getStrokeColor(), 0.0f, 0.0f, 12, null);
            textView.setPadding(border.getStrokeWidthPx(), border.getStrokeWidthPx() - s.dpToPx(t(), 2.0f), border.getStrokeWidthPx(), s.dpToPx(t(), 2.0f) + border.getStrokeWidthPx());
        }
        textView.setBackground(wVar);
    }

    @Override // eq.a
    public View v() {
        return this.f68352s;
    }

    @Override // eq.a, dq.h
    public void c() {
        String text = h().getText();
        TextView textView = this.f68352s;
        textView.setText(text);
        Integer strokeColor = s().getStrokeColor();
        if (strokeColor != null) {
            textView.setTextColor(strokeColor.intValue());
        }
        Float fontSize = s().getFontSize();
        if (fontSize != null && fontSize.floatValue() > 0.0f) {
            textView.setTextSize(1, fontSize.floatValue());
        }
        p0 fontStyleType = s().getFontStyleType();
        if (fontStyleType != null) {
            textView.setTypeface(Typeface.create(Typeface.DEFAULT, fontStyleType.getTypeface()));
        }
        Integer textMaxLines = s().getTextMaxLines();
        if (textMaxLines != null && textMaxLines.intValue() > 0) {
            textView.setMaxLines(textMaxLines.intValue());
        }
        if (s().getTextLineSpacingPx(t()) != null) {
            textView.setLineSpacing(r0.intValue(), 1.0f);
        }
        textView.setGravity(s().getTextHorizontalGravity().getValue() | 16);
        Integer shadowColor = s().getShadowColor();
        if (shadowColor != null) {
            int iIntValue = shadowColor.intValue();
            float fDpToPx = s.dpToPx(t(), 1.0f);
            textView.setShadowLayer(s.dpToPx(t(), 1.0f), fDpToPx, fDpToPx, iIntValue);
        }
        textView.setIncludeFontPadding(false);
        this.f54991g.b(this);
    }
}
