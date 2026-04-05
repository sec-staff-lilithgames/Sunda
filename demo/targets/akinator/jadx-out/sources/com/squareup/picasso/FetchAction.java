package com.squareup.picasso;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
class FetchAction extends Action<Object> {
    private Callback callback;
    private final Object target;

    public FetchAction(Picasso picasso, Request request, int i10, int i11, Object obj, String str, Callback callback) {
        super(picasso, null, request, i10, i11, 0, null, str, obj, false);
        this.target = new Object();
        this.callback = callback;
    }

    @Override // com.squareup.picasso.Action
    public void cancel() {
        super.cancel();
        this.callback = null;
    }

    @Override // com.squareup.picasso.Action
    public void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        Callback callback = this.callback;
        if (callback != null) {
            callback.onSuccess();
        }
    }

    @Override // com.squareup.picasso.Action
    public void error(Exception exc) {
        Callback callback = this.callback;
        if (callback != null) {
            callback.onError(exc);
        }
    }

    @Override // com.squareup.picasso.Action
    public Object getTarget() {
        return this.target;
    }
}
