package o0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import j1.o2;
import p0.v5;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class f extends h {
    public f(boolean z10, float f10, v5 v5Var, kotlin.jvm.internal.u uVar) {
        super(z10, f10, v5Var, null);
    }

    @Override // o0.h
    /* renamed from: rememberUpdatedRippleInstance-942rkJo, reason: not valid java name */
    public v mo5755rememberUpdatedRippleInstance942rkJo(f0.o interactionSource, boolean z10, float f10, v5 color, v5 rippleAlpha, p0.w wVar, int i10) {
        View sVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(interactionSource, "interactionSource");
        kotlin.jvm.internal.e0.checkNotNullParameter(color, "color");
        kotlin.jvm.internal.e0.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        wVar.startReplaceableGroup(331259447);
        wVar.startReplaceableGroup(-1737891121);
        Object objConsume = wVar.consume(AndroidCompositionLocals_androidKt.getLocalView());
        while (!(objConsume instanceof ViewGroup)) {
            ViewParent parent = ((View) objConsume).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(o2.k(objConsume, "Couldn't find a valid parent for ", GalEuEfxjome.TOiJlpbNbyR).toString());
            }
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(parent, "parent");
            objConsume = parent;
        }
        ViewGroup viewGroup = (ViewGroup) objConsume;
        wVar.endReplaceableGroup();
        wVar.startReplaceableGroup(1643267286);
        boolean zIsInEditMode = viewGroup.isInEditMode();
        p0.v vVar = p0.v.f80515a;
        if (zIsInEditMode) {
            wVar.startReplaceableGroup(-3686552);
            boolean zChanged = wVar.changed(interactionSource) | wVar.changed(this);
            Object objRememberedValue = wVar.rememberedValue();
            if (zChanged || objRememberedValue == vVar.getEmpty()) {
                Object dVar = new d(z10, f10, color, rippleAlpha, null);
                wVar.updateRememberedValue(dVar);
                objRememberedValue = dVar;
            }
            wVar.endReplaceableGroup();
            d dVar2 = (d) objRememberedValue;
            wVar.endReplaceableGroup();
            wVar.endReplaceableGroup();
            return dVar2;
        }
        wVar.endReplaceableGroup();
        int childCount = viewGroup.getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                sVar = null;
                break;
            }
            sVar = viewGroup.getChildAt(i11);
            if (sVar instanceof s) {
                break;
            }
            i11++;
        }
        if (sVar == null) {
            Context context = viewGroup.getContext();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "view.context");
            sVar = new s(context);
            viewGroup.addView(sVar);
        }
        wVar.startReplaceableGroup(-3686095);
        boolean zChanged2 = wVar.changed(interactionSource) | wVar.changed(this) | wVar.changed(sVar);
        Object objRememberedValue2 = wVar.rememberedValue();
        if (zChanged2 || objRememberedValue2 == vVar.getEmpty()) {
            Object bVar = new b(z10, f10, color, rippleAlpha, (s) sVar, null);
            wVar.updateRememberedValue(bVar);
            objRememberedValue2 = bVar;
        }
        wVar.endReplaceableGroup();
        b bVar2 = (b) objRememberedValue2;
        wVar.endReplaceableGroup();
        return bVar2;
    }
}
