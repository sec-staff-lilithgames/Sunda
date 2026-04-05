package g3;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface u extends a, g0 {
    @Override // g3.a
    /* synthetic */ float getProgress();

    boolean isDecorator();

    boolean isUseOnHide();

    boolean isUsedOnShow();

    void onFinishedMotionScene(i0 i0Var);

    void onPostDraw(Canvas canvas);

    void onPreDraw(Canvas canvas);

    void onPreSetup(i0 i0Var, HashMap<View, s> map);

    /* synthetic */ void onTransitionChange(i0 i0Var, int i10, int i11, float f10);

    /* synthetic */ void onTransitionCompleted(i0 i0Var, int i10);

    /* synthetic */ void onTransitionStarted(i0 i0Var, int i10, int i11);

    /* synthetic */ void onTransitionTrigger(i0 i0Var, int i10, boolean z10, float f10);

    @Override // g3.a
    /* synthetic */ void setProgress(float f10);
}
