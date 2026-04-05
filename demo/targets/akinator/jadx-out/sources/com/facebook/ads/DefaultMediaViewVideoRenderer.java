package com.facebook.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class DefaultMediaViewVideoRenderer extends MediaViewVideoRenderer {
    private DefaultMediaViewVideoRendererApi mDefaultMediaViewVideoRendererApi;

    public DefaultMediaViewVideoRenderer(Context context) {
        super(context);
        initializeSelf(context);
    }

    private void initializeSelf(Context context) {
        DefaultMediaViewVideoRendererApi defaultMediaViewVideoRendererApiCreateDefaultMediaViewVideoRendererApi = DynamicLoaderFactory.makeLoader(context).createDefaultMediaViewVideoRendererApi();
        this.mDefaultMediaViewVideoRendererApi = defaultMediaViewVideoRendererApiCreateDefaultMediaViewVideoRendererApi;
        defaultMediaViewVideoRendererApiCreateDefaultMediaViewVideoRendererApi.initialize(context, this, getMediaViewVideoRendererApi(), 0);
    }

    @Override // com.facebook.ads.MediaViewVideoRenderer
    public void onPrepared() {
        super.onPrepared();
        this.mDefaultMediaViewVideoRendererApi.onPrepared();
    }

    public DefaultMediaViewVideoRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initializeSelf(context);
    }

    public DefaultMediaViewVideoRenderer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        initializeSelf(context);
    }

    public DefaultMediaViewVideoRenderer(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        initializeSelf(context);
    }
}
