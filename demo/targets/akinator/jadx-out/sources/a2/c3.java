package a2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface c3 {
    void discardDisplayList();

    void drawInto(Canvas canvas);

    d3 dumpRenderNodeData();

    float getAlpha();

    int getAmbientShadowColor();

    int getBottom();

    float getCameraDistance();

    boolean getClipToBounds();

    boolean getClipToOutline();

    float getElevation();

    boolean getHasDisplayList();

    int getHeight();

    void getInverseMatrix(Matrix matrix);

    int getLeft();

    void getMatrix(Matrix matrix);

    float getPivotX();

    float getPivotY();

    j1.z1 getRenderEffect();

    int getRight();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    int getSpotShadowColor();

    int getTop();

    float getTranslationX();

    float getTranslationY();

    long getUniqueId();

    int getWidth();

    void offsetLeftAndRight(int i10);

    void offsetTopAndBottom(int i10);

    void record(j1.f0 f0Var, j1.l1 l1Var, kv.l lVar);

    void setAlpha(float f10);

    void setAmbientShadowColor(int i10);

    void setCameraDistance(float f10);

    void setClipToBounds(boolean z10);

    void setClipToOutline(boolean z10);

    void setElevation(float f10);

    boolean setHasOverlappingRendering(boolean z10);

    void setOutline(Outline outline);

    void setPivotX(float f10);

    void setPivotY(float f10);

    boolean setPosition(int i10, int i11, int i12, int i13);

    void setRenderEffect(j1.z1 z1Var);

    void setRotationX(float f10);

    void setRotationY(float f10);

    void setRotationZ(float f10);

    void setScaleX(float f10);

    void setScaleY(float f10);

    void setSpotShadowColor(int i10);

    void setTranslationX(float f10);

    void setTranslationY(float f10);
}
