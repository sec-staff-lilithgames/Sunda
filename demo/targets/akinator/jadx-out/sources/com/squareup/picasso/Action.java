package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
abstract class Action<T> {
    boolean cancelled;
    final Drawable errorDrawable;
    final int errorResId;
    final String key;
    final int memoryPolicy;
    final int networkPolicy;
    final boolean noFade;
    final Picasso picasso;
    final Request request;
    final Object tag;
    final WeakReference<T> target;
    boolean willReplay;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class RequestWeakReference<M> extends WeakReference<M> {
        final Action action;

        public RequestWeakReference(Action action, M m9, ReferenceQueue<? super M> referenceQueue) {
            super(m9, referenceQueue);
            this.action = action;
        }
    }

    public Action(Picasso picasso, T t10, Request request, int i10, int i11, int i12, Drawable drawable, String str, Object obj, boolean z10) {
        this.picasso = picasso;
        this.request = request;
        this.target = t10 == null ? null : new RequestWeakReference(this, t10, picasso.referenceQueue);
        this.memoryPolicy = i10;
        this.networkPolicy = i11;
        this.noFade = z10;
        this.errorResId = i12;
        this.errorDrawable = drawable;
        this.key = str;
        this.tag = obj == null ? this : obj;
    }

    public void cancel() {
        this.cancelled = true;
    }

    public abstract void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    public abstract void error(Exception exc);

    public String getKey() {
        return this.key;
    }

    public int getMemoryPolicy() {
        return this.memoryPolicy;
    }

    public int getNetworkPolicy() {
        return this.networkPolicy;
    }

    public Picasso getPicasso() {
        return this.picasso;
    }

    public Picasso.Priority getPriority() {
        return this.request.priority;
    }

    public Request getRequest() {
        return this.request;
    }

    public Object getTag() {
        return this.tag;
    }

    public T getTarget() {
        WeakReference<T> weakReference = this.target;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public boolean willReplay() {
        return this.willReplay;
    }
}
