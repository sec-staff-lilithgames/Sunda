package oq;

import android.content.Context;
import android.view.View;
import br.g0;
import br.z1;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z implements f {

    /* renamed from: a, reason: collision with root package name */
    public final br.a f79818a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f79819b;

    public z(br.a params, boolean z10) {
        e0.checkNotNullParameter(params, "params");
        this.f79818a = params;
        this.f79819b = z10;
    }

    @Override // oq.f
    public e a(View view, br.i eventType) {
        br.g directionOrDefault;
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(eventType, "eventType");
        br.a aVar = this.f79818a;
        g0 elementLayoutParams = aVar.getElementLayoutParams();
        int i10 = y.f79814a[eventType.ordinal()];
        if (i10 == 1) {
            Float opacity = aVar.getAppearanceParams().getOpacity();
            float fFloatValue = opacity != null ? opacity.floatValue() : 1.0f;
            Context context = view.getContext();
            e0.checkNotNullExpressionValue(context, "context");
            return new e(fFloatValue, elementLayoutParams.getTranslationXPx(context), elementLayoutParams.getTranslationYPx(context));
        }
        if (i10 != 2) {
            throw new tu.t();
        }
        br.l lVar = aVar.getAnimationParams().get(eventType);
        br.g gVarInverted = null;
        br.n style = lVar != null ? lVar.getStyle() : null;
        if (lVar != null && (directionOrDefault = lVar.getDirectionOrDefault()) != null) {
            gVarInverted = directionOrDefault.inverted();
        }
        return b(view, elementLayoutParams, style, gVarInverted);
    }

    @Override // oq.f
    public e b(View view, br.i eventType) {
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(eventType, "eventType");
        int i10 = y.f79814a[eventType.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return a(view);
            }
            throw new tu.t();
        }
        br.a aVar = this.f79818a;
        br.l lVar = aVar.getAnimationParams().get(eventType);
        return b(view, aVar.getElementLayoutParams(), lVar != null ? lVar.getStyle() : null, lVar != null ? lVar.getDirectionOrDefault() : null);
    }

    public final e b(View view, g0 g0Var, br.n nVar, br.g gVar) {
        float translationX;
        int i10;
        float translationY;
        int i11 = nVar == null ? -1 : y.f79815b[nVar.ordinal()];
        if (i11 == 1) {
            return new e(0.0f, view.getTranslationX(), view.getTranslationY());
        }
        if (i11 != 2) {
            return a(view);
        }
        if (gVar != null) {
            Context context = view.getContext();
            e0.checkNotNullExpressionValue(context, "context");
            float marginLeftPx = g0Var.getMarginLeftPx(context);
            float marginRightPx = g0Var.getMarginRightPx(context);
            float marginTopPx = g0Var.getMarginTopPx(context);
            float marginBottomPx = g0Var.getMarginBottomPx(context);
            float widthPx = g0Var.getWidthPx(context);
            float heightPx = g0Var.getHeightPx(context);
            int[] iArr = y.f79817d;
            int i12 = iArr[gVar.ordinal()];
            if (i12 == 1) {
                z1 z1VarA = g.a(g0Var);
                int i13 = z1VarA == null ? -1 : y.f79816c[z1VarA.ordinal()];
                if (i13 != 1) {
                    translationX = i13 != 2 ? view.getTranslationX() : widthPx - marginRightPx;
                } else {
                    translationX = (-widthPx) - marginRightPx;
                }
            } else if (i12 != 2) {
                translationX = view.getTranslationX();
            } else {
                z1 z1VarA2 = g.a(g0Var);
                int i14 = z1VarA2 == null ? -1 : y.f79816c[z1VarA2.ordinal()];
                if (i14 != 1) {
                    translationX = i14 != 2 ? view.getTranslationX() : widthPx - marginLeftPx;
                } else {
                    translationX = (-widthPx) - marginLeftPx;
                }
            }
            int i15 = iArr[gVar.ordinal()];
            if (i15 == 3) {
                z1 z1VarB = g.b(g0Var);
                i10 = z1VarB != null ? y.f79816c[z1VarB.ordinal()] : -1;
                translationY = (i10 == 3 || i10 == 4) ? heightPx - marginBottomPx : view.getTranslationY();
            } else if (i15 != 4) {
                translationY = view.getTranslationY();
            } else {
                z1 z1VarB2 = g.b(g0Var);
                i10 = z1VarB2 != null ? y.f79816c[z1VarB2.ordinal()] : -1;
                translationY = (i10 == 3 || i10 == 4) ? (-heightPx) - marginTopPx : view.getTranslationY();
            }
            return new e(view.getAlpha(), translationX, translationY);
        }
        return a(view);
    }

    public final e a(View view) {
        return new e(this.f79819b ? 0.0f : view.getAlpha(), view.getTranslationX(), view.getTranslationY());
    }
}
