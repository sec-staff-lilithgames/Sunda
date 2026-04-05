package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class TargetAction extends Action<Target> {
    public TargetAction(Picasso picasso, Target target, Request request, int i10, int i11, Drawable drawable, String str, Object obj, int i12) {
        super(picasso, target, request, i10, i11, i12, drawable, str, obj, false);
    }

    @Override // com.squareup.picasso.Action
    public void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new AssertionError("Attempted to complete action with no result!\n" + this);
        }
        Target target = getTarget();
        if (target != null) {
            target.onBitmapLoaded(bitmap, loadedFrom);
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }

    @Override // com.squareup.picasso.Action
    public void error(Exception exc) {
        Target target = getTarget();
        if (target != null) {
            if (this.errorResId != 0) {
                target.onBitmapFailed(exc, this.picasso.context.getResources().getDrawable(this.errorResId));
            } else {
                target.onBitmapFailed(exc, this.errorDrawable);
            }
        }
    }
}
