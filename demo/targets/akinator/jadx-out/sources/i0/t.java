package i0;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p0.v;
import p0.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t {
    public static final Rect access$toRect(i1.j jVar) {
        return new Rect((int) jVar.getLeft(), (int) jVar.getTop(), (int) jVar.getRight(), (int) jVar.getBottom());
    }

    public static final e rememberDefaultBringIntoViewParent(w wVar, int i10) {
        wVar.startReplaceableGroup(-1031410916);
        View view = (View) wVar.consume(AndroidCompositionLocals_androidKt.getLocalView());
        wVar.startReplaceableGroup(1157296644);
        boolean zChanged = wVar.changed(view);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == v.f80515a.getEmpty()) {
            objRememberedValue = new a(view);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        a aVar = (a) objRememberedValue;
        wVar.endReplaceableGroup();
        return aVar;
    }
}
