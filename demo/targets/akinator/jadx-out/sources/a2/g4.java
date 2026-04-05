package a2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g4 implements c3 {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f3591i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f3592j;

    /* renamed from: a, reason: collision with root package name */
    public final t f3593a;

    /* renamed from: b, reason: collision with root package name */
    public final RenderNode f3594b;

    /* renamed from: c, reason: collision with root package name */
    public int f3595c;

    /* renamed from: d, reason: collision with root package name */
    public int f3596d;

    /* renamed from: e, reason: collision with root package name */
    public int f3597e;

    /* renamed from: f, reason: collision with root package name */
    public int f3598f;

    /* renamed from: g, reason: collision with root package name */
    public j1.z1 f3599g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3600h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final boolean getTestFailCreateRenderNode$ui_release() {
            return g4.f3591i;
        }

        public final void setTestFailCreateRenderNode$ui_release(boolean z10) {
            g4.f3591i = z10;
        }
    }

    static {
        new a(null);
        f3592j = true;
    }

    public g4(t ownerView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ownerView, "ownerView");
        this.f3593a = ownerView;
        RenderNode renderNodeCreate = RenderNode.create("Compose", ownerView);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(renderNodeCreate, "create(\"Compose\", ownerView)");
        this.f3594b = renderNodeCreate;
        if (f3592j) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                o4 o4Var = o4.f3744a;
                o4Var.setAmbientShadowColor(renderNodeCreate, o4Var.getAmbientShadowColor(renderNodeCreate));
                o4Var.setSpotShadowColor(renderNodeCreate, o4Var.getSpotShadowColor(renderNodeCreate));
            }
            n4.f3736a.discardDisplayList(renderNodeCreate);
            f3592j = false;
        }
        if (f3591i) {
            throw new NoClassDefFoundError();
        }
    }

    @Override // a2.c3
    public void discardDisplayList() {
        n4.f3736a.discardDisplayList(this.f3594b);
    }

    @Override // a2.c3
    public void drawInto(Canvas canvas) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f3594b);
    }

    @Override // a2.c3
    public d3 dumpRenderNodeData() {
        return new d3(0L, 0, 0, 0, 0, 0, 0, this.f3594b.getScaleX(), this.f3594b.getScaleY(), this.f3594b.getTranslationX(), this.f3594b.getTranslationY(), this.f3594b.getElevation(), getAmbientShadowColor(), getSpotShadowColor(), this.f3594b.getRotation(), this.f3594b.getRotationX(), this.f3594b.getRotationY(), this.f3594b.getCameraDistance(), this.f3594b.getPivotX(), this.f3594b.getPivotY(), this.f3594b.getClipToOutline(), getClipToBounds(), this.f3594b.getAlpha(), getRenderEffect());
    }

    @Override // a2.c3
    public float getAlpha() {
        return this.f3594b.getAlpha();
    }

    @Override // a2.c3
    public int getAmbientShadowColor() {
        if (Build.VERSION.SDK_INT >= 28) {
            return o4.f3744a.getAmbientShadowColor(this.f3594b);
        }
        return -16777216;
    }

    @Override // a2.c3
    public int getBottom() {
        return this.f3598f;
    }

    @Override // a2.c3
    public float getCameraDistance() {
        return -this.f3594b.getCameraDistance();
    }

    @Override // a2.c3
    public boolean getClipToBounds() {
        return this.f3600h;
    }

    @Override // a2.c3
    public boolean getClipToOutline() {
        return this.f3594b.getClipToOutline();
    }

    @Override // a2.c3
    public float getElevation() {
        return this.f3594b.getElevation();
    }

    @Override // a2.c3
    public boolean getHasDisplayList() {
        return this.f3594b.isValid();
    }

    @Override // a2.c3
    public int getHeight() {
        return getBottom() - getTop();
    }

    @Override // a2.c3
    public void getInverseMatrix(Matrix matrix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(matrix, "matrix");
        this.f3594b.getInverseMatrix(matrix);
    }

    @Override // a2.c3
    public int getLeft() {
        return this.f3595c;
    }

    @Override // a2.c3
    public void getMatrix(Matrix matrix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(matrix, "matrix");
        this.f3594b.getMatrix(matrix);
    }

    public final t getOwnerView() {
        return this.f3593a;
    }

    @Override // a2.c3
    public float getPivotX() {
        return this.f3594b.getPivotX();
    }

    @Override // a2.c3
    public float getPivotY() {
        return this.f3594b.getPivotY();
    }

    @Override // a2.c3
    public j1.z1 getRenderEffect() {
        return this.f3599g;
    }

    @Override // a2.c3
    public int getRight() {
        return this.f3597e;
    }

    @Override // a2.c3
    public float getRotationX() {
        return this.f3594b.getRotationX();
    }

    @Override // a2.c3
    public float getRotationY() {
        return this.f3594b.getRotationY();
    }

    @Override // a2.c3
    public float getRotationZ() {
        return this.f3594b.getRotation();
    }

    @Override // a2.c3
    public float getScaleX() {
        return this.f3594b.getScaleX();
    }

    @Override // a2.c3
    public float getScaleY() {
        return this.f3594b.getScaleY();
    }

    @Override // a2.c3
    public int getSpotShadowColor() {
        if (Build.VERSION.SDK_INT >= 28) {
            return o4.f3744a.getSpotShadowColor(this.f3594b);
        }
        return -16777216;
    }

    @Override // a2.c3
    public int getTop() {
        return this.f3596d;
    }

    @Override // a2.c3
    public float getTranslationX() {
        return this.f3594b.getTranslationX();
    }

    @Override // a2.c3
    public float getTranslationY() {
        return this.f3594b.getTranslationY();
    }

    @Override // a2.c3
    public long getUniqueId() {
        return 0L;
    }

    @Override // a2.c3
    public int getWidth() {
        return getRight() - getLeft();
    }

    @Override // a2.c3
    public void offsetLeftAndRight(int i10) {
        setLeft(getLeft() + i10);
        setRight(getRight() + i10);
        this.f3594b.offsetLeftAndRight(i10);
    }

    @Override // a2.c3
    public void offsetTopAndBottom(int i10) {
        setTop(getTop() + i10);
        setBottom(getBottom() + i10);
        this.f3594b.offsetTopAndBottom(i10);
    }

    @Override // a2.c3
    public void record(j1.f0 canvasHolder, j1.l1 l1Var, kv.l drawBlock) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvasHolder, "canvasHolder");
        kotlin.jvm.internal.e0.checkNotNullParameter(drawBlock, "drawBlock");
        DisplayListCanvas displayListCanvasStart = this.f3594b.start(getWidth(), getHeight());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(displayListCanvasStart, "renderNode.start(width, height)");
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas((Canvas) displayListCanvasStart);
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
        this.f3594b.end(displayListCanvasStart);
    }

    @Override // a2.c3
    public void setAlpha(float f10) {
        this.f3594b.setAlpha(f10);
    }

    @Override // a2.c3
    public void setAmbientShadowColor(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            o4.f3744a.setAmbientShadowColor(this.f3594b, i10);
        }
    }

    public void setBottom(int i10) {
        this.f3598f = i10;
    }

    @Override // a2.c3
    public void setCameraDistance(float f10) {
        this.f3594b.setCameraDistance(-f10);
    }

    @Override // a2.c3
    public void setClipToBounds(boolean z10) {
        this.f3600h = z10;
        this.f3594b.setClipToBounds(z10);
    }

    @Override // a2.c3
    public void setClipToOutline(boolean z10) {
        this.f3594b.setClipToOutline(z10);
    }

    @Override // a2.c3
    public void setElevation(float f10) {
        this.f3594b.setElevation(f10);
    }

    @Override // a2.c3
    public boolean setHasOverlappingRendering(boolean z10) {
        return this.f3594b.setHasOverlappingRendering(z10);
    }

    public void setLeft(int i10) {
        this.f3595c = i10;
    }

    @Override // a2.c3
    public void setOutline(Outline outline) {
        this.f3594b.setOutline(outline);
    }

    @Override // a2.c3
    public void setPivotX(float f10) {
        this.f3594b.setPivotX(f10);
    }

    @Override // a2.c3
    public void setPivotY(float f10) {
        this.f3594b.setPivotY(f10);
    }

    @Override // a2.c3
    public boolean setPosition(int i10, int i11, int i12, int i13) {
        setLeft(i10);
        setTop(i11);
        setRight(i12);
        setBottom(i13);
        return this.f3594b.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // a2.c3
    public void setRenderEffect(j1.z1 z1Var) {
        this.f3599g = z1Var;
    }

    public void setRight(int i10) {
        this.f3597e = i10;
    }

    @Override // a2.c3
    public void setRotationX(float f10) {
        this.f3594b.setRotationX(f10);
    }

    @Override // a2.c3
    public void setRotationY(float f10) {
        this.f3594b.setRotationY(f10);
    }

    @Override // a2.c3
    public void setRotationZ(float f10) {
        this.f3594b.setRotation(f10);
    }

    @Override // a2.c3
    public void setScaleX(float f10) {
        this.f3594b.setScaleX(f10);
    }

    @Override // a2.c3
    public void setScaleY(float f10) {
        this.f3594b.setScaleY(f10);
    }

    @Override // a2.c3
    public void setSpotShadowColor(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            o4.f3744a.setSpotShadowColor(this.f3594b, i10);
        }
    }

    public void setTop(int i10) {
        this.f3596d = i10;
    }

    @Override // a2.c3
    public void setTranslationX(float f10) {
        this.f3594b.setTranslationX(f10);
    }

    @Override // a2.c3
    public void setTranslationY(float f10) {
        this.f3594b.setTranslationY(f10);
    }
}
