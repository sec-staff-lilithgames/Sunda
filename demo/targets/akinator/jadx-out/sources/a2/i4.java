package a2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i4 implements c3 {

    /* renamed from: a, reason: collision with root package name */
    public final t f3653a;

    /* renamed from: b, reason: collision with root package name */
    public final RenderNode f3654b;

    /* renamed from: c, reason: collision with root package name */
    public j1.z1 f3655c;

    public i4(t ownerView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ownerView, "ownerView");
        this.f3653a = ownerView;
        this.f3654b = h4.b();
    }

    @Override // a2.c3
    public void discardDisplayList() {
        this.f3654b.discardDisplayList();
    }

    @Override // a2.c3
    public void drawInto(Canvas canvas) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        canvas.drawRenderNode(this.f3654b);
    }

    @Override // a2.c3
    public d3 dumpRenderNodeData() {
        return new d3(this.f3654b.getUniqueId(), this.f3654b.getLeft(), this.f3654b.getTop(), this.f3654b.getRight(), this.f3654b.getBottom(), this.f3654b.getWidth(), this.f3654b.getHeight(), this.f3654b.getScaleX(), this.f3654b.getScaleY(), this.f3654b.getTranslationX(), this.f3654b.getTranslationY(), this.f3654b.getElevation(), this.f3654b.getAmbientShadowColor(), this.f3654b.getSpotShadowColor(), this.f3654b.getRotationZ(), this.f3654b.getRotationX(), this.f3654b.getRotationY(), this.f3654b.getCameraDistance(), this.f3654b.getPivotX(), this.f3654b.getPivotY(), this.f3654b.getClipToOutline(), this.f3654b.getClipToBounds(), this.f3654b.getAlpha(), this.f3655c);
    }

    @Override // a2.c3
    public float getAlpha() {
        return this.f3654b.getAlpha();
    }

    @Override // a2.c3
    public int getAmbientShadowColor() {
        return this.f3654b.getAmbientShadowColor();
    }

    @Override // a2.c3
    public int getBottom() {
        return this.f3654b.getBottom();
    }

    @Override // a2.c3
    public float getCameraDistance() {
        return this.f3654b.getCameraDistance();
    }

    @Override // a2.c3
    public boolean getClipToBounds() {
        return this.f3654b.getClipToBounds();
    }

    @Override // a2.c3
    public boolean getClipToOutline() {
        return this.f3654b.getClipToOutline();
    }

    @Override // a2.c3
    public float getElevation() {
        return this.f3654b.getElevation();
    }

    @Override // a2.c3
    public boolean getHasDisplayList() {
        return this.f3654b.hasDisplayList();
    }

    @Override // a2.c3
    public int getHeight() {
        return this.f3654b.getHeight();
    }

    @Override // a2.c3
    public void getInverseMatrix(Matrix matrix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(matrix, "matrix");
        this.f3654b.getInverseMatrix(matrix);
    }

    @Override // a2.c3
    public int getLeft() {
        return this.f3654b.getLeft();
    }

    @Override // a2.c3
    public void getMatrix(Matrix matrix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(matrix, "matrix");
        this.f3654b.getMatrix(matrix);
    }

    public final t getOwnerView() {
        return this.f3653a;
    }

    @Override // a2.c3
    public float getPivotX() {
        return this.f3654b.getPivotX();
    }

    @Override // a2.c3
    public float getPivotY() {
        return this.f3654b.getPivotY();
    }

    @Override // a2.c3
    public j1.z1 getRenderEffect() {
        return this.f3655c;
    }

    @Override // a2.c3
    public int getRight() {
        return this.f3654b.getRight();
    }

    @Override // a2.c3
    public float getRotationX() {
        return this.f3654b.getRotationX();
    }

    @Override // a2.c3
    public float getRotationY() {
        return this.f3654b.getRotationY();
    }

    @Override // a2.c3
    public float getRotationZ() {
        return this.f3654b.getRotationZ();
    }

    @Override // a2.c3
    public float getScaleX() {
        return this.f3654b.getScaleX();
    }

    @Override // a2.c3
    public float getScaleY() {
        return this.f3654b.getScaleY();
    }

    @Override // a2.c3
    public int getSpotShadowColor() {
        return this.f3654b.getSpotShadowColor();
    }

    @Override // a2.c3
    public int getTop() {
        return this.f3654b.getTop();
    }

    @Override // a2.c3
    public float getTranslationX() {
        return this.f3654b.getTranslationX();
    }

    @Override // a2.c3
    public float getTranslationY() {
        return this.f3654b.getTranslationY();
    }

    @Override // a2.c3
    public long getUniqueId() {
        return this.f3654b.getUniqueId();
    }

    @Override // a2.c3
    public int getWidth() {
        return this.f3654b.getWidth();
    }

    @Override // a2.c3
    public void offsetLeftAndRight(int i10) {
        this.f3654b.offsetLeftAndRight(i10);
    }

    @Override // a2.c3
    public void offsetTopAndBottom(int i10) {
        this.f3654b.offsetTopAndBottom(i10);
    }

    @Override // a2.c3
    public void record(j1.f0 canvasHolder, j1.l1 l1Var, kv.l drawBlock) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvasHolder, "canvasHolder");
        kotlin.jvm.internal.e0.checkNotNullParameter(drawBlock, "drawBlock");
        RecordingCanvas recordingCanvasBeginRecording = this.f3654b.beginRecording();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(recordingCanvasBeginRecording, "renderNode.beginRecording()");
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(recordingCanvasBeginRecording);
        j1.c androidCanvas = canvasHolder.getAndroidCanvas();
        if (l1Var != null) {
            androidCanvas.save();
            j1.e0.m4726clipPathmtrdDE$default(androidCanvas, l1Var, 0, 2, null);
        }
        drawBlock.invoke(androidCanvas);
        if (l1Var != null) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        this.f3654b.endRecording();
    }

    @Override // a2.c3
    public void setAlpha(float f10) {
        this.f3654b.setAlpha(f10);
    }

    @Override // a2.c3
    public void setAmbientShadowColor(int i10) {
        this.f3654b.setAmbientShadowColor(i10);
    }

    @Override // a2.c3
    public void setCameraDistance(float f10) {
        this.f3654b.setCameraDistance(f10);
    }

    @Override // a2.c3
    public void setClipToBounds(boolean z10) {
        this.f3654b.setClipToBounds(z10);
    }

    @Override // a2.c3
    public void setClipToOutline(boolean z10) {
        this.f3654b.setClipToOutline(z10);
    }

    @Override // a2.c3
    public void setElevation(float f10) {
        this.f3654b.setElevation(f10);
    }

    @Override // a2.c3
    public boolean setHasOverlappingRendering(boolean z10) {
        return this.f3654b.setHasOverlappingRendering(z10);
    }

    @Override // a2.c3
    public void setOutline(Outline outline) {
        this.f3654b.setOutline(outline);
    }

    @Override // a2.c3
    public void setPivotX(float f10) {
        this.f3654b.setPivotX(f10);
    }

    @Override // a2.c3
    public void setPivotY(float f10) {
        this.f3654b.setPivotY(f10);
    }

    @Override // a2.c3
    public boolean setPosition(int i10, int i11, int i12, int i13) {
        return this.f3654b.setPosition(i10, i11, i12, i13);
    }

    @Override // a2.c3
    public void setRenderEffect(j1.z1 z1Var) {
        this.f3655c = z1Var;
        if (Build.VERSION.SDK_INT >= 31) {
            j4.f3667a.setRenderEffect(this.f3654b, z1Var);
        }
    }

    @Override // a2.c3
    public void setRotationX(float f10) {
        this.f3654b.setRotationX(f10);
    }

    @Override // a2.c3
    public void setRotationY(float f10) {
        this.f3654b.setRotationY(f10);
    }

    @Override // a2.c3
    public void setRotationZ(float f10) {
        this.f3654b.setRotationZ(f10);
    }

    @Override // a2.c3
    public void setScaleX(float f10) {
        this.f3654b.setScaleX(f10);
    }

    @Override // a2.c3
    public void setScaleY(float f10) {
        this.f3654b.setScaleY(f10);
    }

    @Override // a2.c3
    public void setSpotShadowColor(int i10) {
        this.f3654b.setSpotShadowColor(i10);
    }

    @Override // a2.c3
    public void setTranslationX(float f10) {
        this.f3654b.setTranslationX(f10);
    }

    @Override // a2.c3
    public void setTranslationY(float f10) {
        this.f3654b.setTranslationY(f10);
    }
}
