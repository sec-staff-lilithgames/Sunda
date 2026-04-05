package com.facebook.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class MediaViewVideoRendererWithBackgroundPlayback extends MediaViewVideoRenderer {
    private DefaultMediaViewVideoRendererApi mDefaultMediaViewVideoRendererApi;

    public MediaViewVideoRendererWithBackgroundPlayback(Context context) {
        super(context);
        initialize(context);
    }

    private void initialize(Context context) {
        DefaultMediaViewVideoRendererApi defaultMediaViewVideoRendererApiCreateDefaultMediaViewVideoRendererApi = DynamicLoaderFactory.makeLoader(context).createDefaultMediaViewVideoRendererApi();
        this.mDefaultMediaViewVideoRendererApi = defaultMediaViewVideoRendererApiCreateDefaultMediaViewVideoRendererApi;
        defaultMediaViewVideoRendererApiCreateDefaultMediaViewVideoRendererApi.initialize(context, this, getMediaViewVideoRendererApi(), 1);
    }

    @Override // com.facebook.ads.MediaViewVideoRenderer
    public void onPrepared() {
        super.onPrepared();
        this.mDefaultMediaViewVideoRendererApi.onPrepared();
    }

    @Override // com.facebook.ads.MediaViewVideoRenderer
    public boolean shouldAllowBackgroundPlayback() {
        return true;
    }

    public MediaViewVideoRendererWithBackgroundPlayback(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context);
    }

    public MediaViewVideoRendererWithBackgroundPlayback(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        initialize(context);
    }

    public MediaViewVideoRendererWithBackgroundPlayback(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        initialize(context);
    }
}
