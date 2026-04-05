package q;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsSeekBar;
import android.widget.EditText;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f82062d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82063a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final View f82064b;

    /* renamed from: c, reason: collision with root package name */
    public Object f82065c;

    public e0(AbsSeekBar absSeekBar) {
        this.f82064b = absSeekBar;
    }

    public KeyListener a(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener) ? ((u4.a) this.f82065c).getKeyListener(keyListener) : keyListener;
    }

    public void b(AttributeSet attributeSet, int i10) {
        switch (this.f82063a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f82064b;
                n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(absSeekBar.getContext(), attributeSet, f82062d, i10, 0);
                Drawable drawableIfKnown = n3VarObtainStyledAttributes.getDrawableIfKnown(0);
                if (drawableIfKnown != null) {
                    if (drawableIfKnown instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableIfKnown;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i11 = 0; i11 < numberOfFrames; i11++) {
                            Drawable drawableC = c(animationDrawable.getFrame(i11), true);
                            drawableC.setLevel(10000);
                            animationDrawable2.addFrame(drawableC, animationDrawable.getDuration(i11));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableIfKnown = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableIfKnown);
                }
                Drawable drawableIfKnown2 = n3VarObtainStyledAttributes.getDrawableIfKnown(1);
                if (drawableIfKnown2 != null) {
                    absSeekBar.setProgressDrawable(c(drawableIfKnown2, false));
                }
                n3VarObtainStyledAttributes.recycle();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f82064b).getContext().obtainStyledAttributes(attributeSet, k.a.f69985i, i10, 0);
                try {
                    boolean z10 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
                    typedArrayObtainStyledAttributes.recycle();
                    ((u4.a) this.f82065c).setEnabled(z10);
                    return;
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th2;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable c(Drawable drawable, boolean z10) {
        if (drawable instanceof p3.c) {
            p3.d dVar = (p3.d) ((p3.c) drawable);
            Drawable drawableA = dVar.a();
            if (drawableA != null) {
                dVar.b(c(drawableA, z10));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    int id2 = layerDrawable.getId(i10);
                    drawableArr[i10] = c(layerDrawable.getDrawable(i10), id2 == 16908301 || id2 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    layerDrawable2.setId(i11, layerDrawable.getId(i11));
                    d0.transferLayerProperties(layerDrawable, layerDrawable2, i11);
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f82065c) == null) {
                    this.f82065c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z10 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public e0(EditText editText) {
        this.f82064b = editText;
        this.f82065c = new u4.a(editText, false);
    }
}
