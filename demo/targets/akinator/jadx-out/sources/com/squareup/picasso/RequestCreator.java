package com.squareup.picasso;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.RemoteViews;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RemoteViewsAction;
import com.squareup.picasso.Request;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class RequestCreator {
    private static final AtomicInteger nextId = new AtomicInteger();
    private final Request.Builder data;
    private boolean deferred;
    private Drawable errorDrawable;
    private int errorResId;
    private int memoryPolicy;
    private int networkPolicy;
    private boolean noFade;
    private final Picasso picasso;
    private Drawable placeholderDrawable;
    private int placeholderResId;
    private boolean setPlaceholder;
    private Object tag;

    public RequestCreator(Picasso picasso, Uri uri, int i10) {
        this.setPlaceholder = true;
        if (picasso.shutdown) {
            throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
        }
        this.picasso = picasso;
        this.data = new Request.Builder(uri, i10, picasso.defaultBitmapConfig);
    }

    private Request createRequest(long j10) {
        int andIncrement = nextId.getAndIncrement();
        Request requestBuild = this.data.build();
        requestBuild.f50578id = andIncrement;
        requestBuild.started = j10;
        boolean z10 = this.picasso.loggingEnabled;
        if (z10) {
            Utils.log("Main", "created", requestBuild.plainId(), requestBuild.toString());
        }
        Request requestTransformRequest = this.picasso.transformRequest(requestBuild);
        if (requestTransformRequest != requestBuild) {
            requestTransformRequest.f50578id = andIncrement;
            requestTransformRequest.started = j10;
            if (z10) {
                Utils.log("Main", "changed", requestTransformRequest.logId(), "into " + requestTransformRequest);
            }
        }
        return requestTransformRequest;
    }

    private Drawable getPlaceholderDrawable() {
        int i10 = this.placeholderResId;
        return i10 != 0 ? this.picasso.context.getDrawable(i10) : this.placeholderDrawable;
    }

    private void performRemoteViewInto(RemoteViewsAction remoteViewsAction) {
        Bitmap bitmapQuickMemoryCacheCheck;
        if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) && (bitmapQuickMemoryCacheCheck = this.picasso.quickMemoryCacheCheck(remoteViewsAction.getKey())) != null) {
            remoteViewsAction.complete(bitmapQuickMemoryCacheCheck, Picasso.LoadedFrom.MEMORY);
            return;
        }
        int i10 = this.placeholderResId;
        if (i10 != 0) {
            remoteViewsAction.setImageResource(i10);
        }
        this.picasso.enqueueAndSubmit(remoteViewsAction);
    }

    public RequestCreator centerCrop() {
        this.data.centerCrop(17);
        return this;
    }

    public RequestCreator centerInside() {
        this.data.centerInside();
        return this;
    }

    public RequestCreator clearTag() {
        this.tag = null;
        return this;
    }

    public RequestCreator config(Bitmap.Config config) {
        this.data.config(config);
        return this;
    }

    public RequestCreator error(int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        }
        if (this.errorDrawable != null) {
            throw new IllegalStateException("Error image already set.");
        }
        this.errorResId = i10;
        return this;
    }

    public void fetch() {
        fetch(null);
    }

    public RequestCreator fit() {
        this.deferred = true;
        return this;
    }

    public Bitmap get() throws IOException {
        long jNanoTime = System.nanoTime();
        Utils.checkNotMain();
        if (this.deferred) {
            throw new IllegalStateException("Fit cannot be used with get.");
        }
        if (!this.data.hasImage()) {
            return null;
        }
        Request requestCreateRequest = createRequest(jNanoTime);
        GetAction getAction = new GetAction(this.picasso, requestCreateRequest, this.memoryPolicy, this.networkPolicy, this.tag, Utils.createKey(requestCreateRequest, new StringBuilder()));
        Picasso picasso = this.picasso;
        return BitmapHunter.forRequest(picasso, picasso.dispatcher, picasso.cache, picasso.stats, getAction).hunt();
    }

    public Object getTag() {
        return this.tag;
    }

    public void into(Target target) {
        Bitmap bitmapQuickMemoryCacheCheck;
        long jNanoTime = System.nanoTime();
        Utils.checkMain();
        if (target == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (this.deferred) {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        if (!this.data.hasImage()) {
            this.picasso.cancelRequest(target);
            target.onPrepareLoad(this.setPlaceholder ? getPlaceholderDrawable() : null);
            return;
        }
        Request requestCreateRequest = createRequest(jNanoTime);
        String strCreateKey = Utils.createKey(requestCreateRequest);
        if (!MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) || (bitmapQuickMemoryCacheCheck = this.picasso.quickMemoryCacheCheck(strCreateKey)) == null) {
            target.onPrepareLoad(this.setPlaceholder ? getPlaceholderDrawable() : null);
            this.picasso.enqueueAndSubmit(new TargetAction(this.picasso, target, requestCreateRequest, this.memoryPolicy, this.networkPolicy, this.errorDrawable, strCreateKey, this.tag, this.errorResId));
        } else {
            this.picasso.cancelRequest(target);
            target.onBitmapLoaded(bitmapQuickMemoryCacheCheck, Picasso.LoadedFrom.MEMORY);
        }
    }

    public RequestCreator memoryPolicy(MemoryPolicy memoryPolicy, MemoryPolicy... memoryPolicyArr) {
        if (memoryPolicy == null) {
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        this.memoryPolicy = memoryPolicy.index | this.memoryPolicy;
        if (memoryPolicyArr == null) {
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        if (memoryPolicyArr.length > 0) {
            for (MemoryPolicy memoryPolicy2 : memoryPolicyArr) {
                if (memoryPolicy2 == null) {
                    throw new IllegalArgumentException("Memory policy cannot be null.");
                }
                this.memoryPolicy = memoryPolicy2.index | this.memoryPolicy;
            }
        }
        return this;
    }

    public RequestCreator networkPolicy(NetworkPolicy networkPolicy, NetworkPolicy... networkPolicyArr) {
        if (networkPolicy == null) {
            throw new IllegalArgumentException("Network policy cannot be null.");
        }
        this.networkPolicy = networkPolicy.index | this.networkPolicy;
        if (networkPolicyArr == null) {
            throw new IllegalArgumentException("Network policy cannot be null.");
        }
        if (networkPolicyArr.length > 0) {
            for (NetworkPolicy networkPolicy2 : networkPolicyArr) {
                if (networkPolicy2 == null) {
                    throw new IllegalArgumentException("Network policy cannot be null.");
                }
                this.networkPolicy = networkPolicy2.index | this.networkPolicy;
            }
        }
        return this;
    }

    public RequestCreator noFade() {
        this.noFade = true;
        return this;
    }

    public RequestCreator noPlaceholder() {
        if (this.placeholderResId != 0) {
            throw new IllegalStateException("Placeholder resource already set.");
        }
        if (this.placeholderDrawable != null) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.setPlaceholder = false;
        return this;
    }

    public RequestCreator onlyScaleDown() {
        this.data.onlyScaleDown();
        return this;
    }

    public RequestCreator placeholder(int i10) {
        if (!this.setPlaceholder) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (i10 == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        }
        if (this.placeholderDrawable != null) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.placeholderResId = i10;
        return this;
    }

    public RequestCreator priority(Picasso.Priority priority) {
        this.data.priority(priority);
        return this;
    }

    public RequestCreator purgeable() {
        this.data.purgeable();
        return this;
    }

    public RequestCreator resize(int i10, int i11) {
        this.data.resize(i10, i11);
        return this;
    }

    public RequestCreator resizeDimen(int i10, int i11) {
        Resources resources = this.picasso.context.getResources();
        return resize(resources.getDimensionPixelSize(i10), resources.getDimensionPixelSize(i11));
    }

    public RequestCreator rotate(float f10) {
        this.data.rotate(f10);
        return this;
    }

    public RequestCreator stableKey(String str) {
        this.data.stableKey(str);
        return this;
    }

    public RequestCreator tag(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Tag invalid.");
        }
        if (this.tag != null) {
            throw new IllegalStateException("Tag already set.");
        }
        this.tag = obj;
        return this;
    }

    public RequestCreator transform(Transformation transformation) {
        this.data.transform(transformation);
        return this;
    }

    public RequestCreator unfit() {
        this.deferred = false;
        return this;
    }

    public RequestCreator centerCrop(int i10) {
        this.data.centerCrop(i10);
        return this;
    }

    public void fetch(Callback callback) {
        long jNanoTime = System.nanoTime();
        if (this.deferred) {
            throw new IllegalStateException("Fit cannot be used with fetch.");
        }
        if (this.data.hasImage()) {
            if (!this.data.hasPriority()) {
                this.data.priority(Picasso.Priority.LOW);
            }
            Request requestCreateRequest = createRequest(jNanoTime);
            String strCreateKey = Utils.createKey(requestCreateRequest, new StringBuilder());
            if (!MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) || this.picasso.quickMemoryCacheCheck(strCreateKey) == null) {
                this.picasso.submit(new FetchAction(this.picasso, requestCreateRequest, this.memoryPolicy, this.networkPolicy, this.tag, strCreateKey, callback));
                return;
            }
            if (this.picasso.loggingEnabled) {
                Utils.log("Main", "completed", requestCreateRequest.plainId(), "from " + Picasso.LoadedFrom.MEMORY);
            }
            if (callback != null) {
                callback.onSuccess();
            }
        }
    }

    public RequestCreator rotate(float f10, float f11, float f12) {
        this.data.rotate(f10, f11, f12);
        return this;
    }

    public RequestCreator transform(List<? extends Transformation> list) {
        this.data.transform(list);
        return this;
    }

    public RequestCreator error(Drawable drawable) {
        if (drawable != null) {
            if (this.errorResId == 0) {
                this.errorDrawable = drawable;
                return this;
            }
            throw new IllegalStateException("Error image already set.");
        }
        throw new IllegalArgumentException("Error image may not be null.");
    }

    public RequestCreator() {
        this.setPlaceholder = true;
        this.picasso = null;
        this.data = new Request.Builder(null, 0, null);
    }

    public RequestCreator placeholder(Drawable drawable) {
        if (this.setPlaceholder) {
            if (this.placeholderResId == 0) {
                this.placeholderDrawable = drawable;
                return this;
            }
            throw new IllegalStateException("Placeholder image already set.");
        }
        throw new IllegalStateException("Already explicitly declared as no placeholder.");
    }

    public void into(RemoteViews remoteViews, int i10, int i11, Notification notification) {
        into(remoteViews, i10, i11, notification, null);
    }

    public void into(RemoteViews remoteViews, int i10, int i11, Notification notification, String str) {
        into(remoteViews, i10, i11, notification, str, null);
    }

    public void into(RemoteViews remoteViews, int i10, int i11, Notification notification, String str, Callback callback) {
        long jNanoTime = System.nanoTime();
        if (remoteViews == null) {
            throw new IllegalArgumentException("RemoteViews must not be null.");
        }
        if (notification != null) {
            if (!this.deferred) {
                if (this.placeholderDrawable == null && this.placeholderResId == 0 && this.errorDrawable == null) {
                    Request requestCreateRequest = createRequest(jNanoTime);
                    performRemoteViewInto(new RemoteViewsAction.NotificationAction(this.picasso, requestCreateRequest, remoteViews, i10, i11, notification, str, this.memoryPolicy, this.networkPolicy, Utils.createKey(requestCreateRequest, new StringBuilder()), this.tag, this.errorResId, callback));
                    return;
                }
                throw new IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
            }
            throw new IllegalStateException("Fit cannot be used with RemoteViews.");
        }
        throw new IllegalArgumentException("Notification must not be null.");
    }

    public void into(RemoteViews remoteViews, int i10, int[] iArr) {
        into(remoteViews, i10, iArr, (Callback) null);
    }

    public void into(RemoteViews remoteViews, int i10, int[] iArr, Callback callback) {
        long jNanoTime = System.nanoTime();
        if (remoteViews == null) {
            throw new IllegalArgumentException("remoteViews must not be null.");
        }
        if (iArr != null) {
            if (!this.deferred) {
                if (this.placeholderDrawable == null && this.placeholderResId == 0 && this.errorDrawable == null) {
                    Request requestCreateRequest = createRequest(jNanoTime);
                    performRemoteViewInto(new RemoteViewsAction.AppWidgetAction(this.picasso, requestCreateRequest, remoteViews, i10, iArr, this.memoryPolicy, this.networkPolicy, Utils.createKey(requestCreateRequest, new StringBuilder()), this.tag, this.errorResId, callback));
                    return;
                }
                throw new IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
            }
            throw new IllegalStateException("Fit cannot be used with remote views.");
        }
        throw new IllegalArgumentException("appWidgetIds must not be null.");
    }

    public void into(ImageView imageView) {
        into(imageView, null);
    }

    public void into(ImageView imageView, Callback callback) {
        Bitmap bitmapQuickMemoryCacheCheck;
        long jNanoTime = System.nanoTime();
        Utils.checkMain();
        if (imageView != null) {
            if (!this.data.hasImage()) {
                this.picasso.cancelRequest(imageView);
                if (this.setPlaceholder) {
                    PicassoDrawable.setPlaceholder(imageView, getPlaceholderDrawable());
                    return;
                }
                return;
            }
            if (this.deferred) {
                if (!this.data.hasSize()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width != 0 && height != 0) {
                        this.data.resize(width, height);
                    } else {
                        if (this.setPlaceholder) {
                            PicassoDrawable.setPlaceholder(imageView, getPlaceholderDrawable());
                        }
                        this.picasso.defer(imageView, new DeferredRequestCreator(this, imageView, callback));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            Request requestCreateRequest = createRequest(jNanoTime);
            String strCreateKey = Utils.createKey(requestCreateRequest);
            if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) && (bitmapQuickMemoryCacheCheck = this.picasso.quickMemoryCacheCheck(strCreateKey)) != null) {
                this.picasso.cancelRequest(imageView);
                Picasso picasso = this.picasso;
                Context context = picasso.context;
                Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.MEMORY;
                PicassoDrawable.setBitmap(imageView, context, bitmapQuickMemoryCacheCheck, loadedFrom, this.noFade, picasso.indicatorsEnabled);
                if (this.picasso.loggingEnabled) {
                    Utils.log("Main", "completed", requestCreateRequest.plainId(), "from " + loadedFrom);
                }
                if (callback != null) {
                    callback.onSuccess();
                    return;
                }
                return;
            }
            if (this.setPlaceholder) {
                PicassoDrawable.setPlaceholder(imageView, getPlaceholderDrawable());
            }
            this.picasso.enqueueAndSubmit(new ImageViewAction(this.picasso, imageView, requestCreateRequest, this.memoryPolicy, this.networkPolicy, this.errorResId, this.errorDrawable, strCreateKey, this.tag, callback, this.noFade));
            return;
        }
        throw new IllegalArgumentException("Target must not be null.");
    }
}
