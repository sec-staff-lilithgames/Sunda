package q;

import android.graphics.drawable.LayerDrawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d0 {
    public static void transferLayerProperties(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i10) {
        layerDrawable2.setLayerGravity(i10, layerDrawable.getLayerGravity(i10));
        layerDrawable2.setLayerWidth(i10, layerDrawable.getLayerWidth(i10));
        layerDrawable2.setLayerHeight(i10, layerDrawable.getLayerHeight(i10));
        layerDrawable2.setLayerInsetLeft(i10, layerDrawable.getLayerInsetLeft(i10));
        layerDrawable2.setLayerInsetRight(i10, layerDrawable.getLayerInsetRight(i10));
        layerDrawable2.setLayerInsetTop(i10, layerDrawable.getLayerInsetTop(i10));
        layerDrawable2.setLayerInsetBottom(i10, layerDrawable.getLayerInsetBottom(i10));
        layerDrawable2.setLayerInsetStart(i10, layerDrawable.getLayerInsetStart(i10));
        layerDrawable2.setLayerInsetEnd(i10, layerDrawable.getLayerInsetEnd(i10));
    }
}
