package oq;

import android.view.View;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b0 implements f {

    /* renamed from: a, reason: collision with root package name */
    public final br.e f79737a;

    public b0(br.e params) {
        e0.checkNotNullParameter(params, "params");
        this.f79737a = params;
    }

    @Override // oq.f
    public e a(View view, br.i eventType) {
        br.g directionOrDefault;
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(eventType, "eventType");
        int i10 = a0.f79734a[eventType.ordinal()];
        if (i10 == 1) {
            return new e(1.0f, 0.0f, 0.0f);
        }
        if (i10 != 2) {
            throw new tu.t();
        }
        br.l lVar = this.f79737a.getAnimationParams().get(eventType);
        br.g gVarInverted = null;
        br.n style = lVar != null ? lVar.getStyle() : null;
        if (lVar != null && (directionOrDefault = lVar.getDirectionOrDefault()) != null) {
            gVarInverted = directionOrDefault.inverted();
        }
        return b(view, style, gVarInverted);
    }

    @Override // oq.f
    public e b(View view, br.i eventType) {
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(eventType, "eventType");
        int i10 = a0.f79734a[eventType.ordinal()];
        if (i10 == 1) {
            br.l lVar = this.f79737a.getAnimationParams().get(eventType);
            return b(view, lVar != null ? lVar.getStyle() : null, lVar != null ? lVar.getDirectionOrDefault() : null);
        }
        if (i10 == 2) {
            return new e(view);
        }
        throw new tu.t();
    }

    public static e b(View view, br.n nVar, br.g gVar) {
        int i10 = nVar == null ? -1 : a0.f79735b[nVar.ordinal()];
        if (i10 == 1) {
            return new e(0.0f, view.getTranslationX(), view.getTranslationY());
        }
        if (i10 != 2) {
            return new e(view);
        }
        if (gVar != null) {
            float measuredWidth = view.getMeasuredWidth();
            int[] iArr = a0.f79736c;
            int i11 = iArr[gVar.ordinal()];
            if (i11 != 1) {
                measuredWidth = i11 != 2 ? view.getTranslationX() : -measuredWidth;
            }
            float measuredHeight = view.getMeasuredHeight();
            int i12 = iArr[gVar.ordinal()];
            if (i12 != 3) {
                measuredHeight = i12 != 4 ? view.getTranslationY() : -measuredHeight;
            }
            return new e(view.getAlpha(), measuredWidth, measuredHeight);
        }
        return new e(view);
    }
}
