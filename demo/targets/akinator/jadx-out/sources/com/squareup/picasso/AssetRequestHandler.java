package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.ironsource.C3191e4;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.IOException;
import pw.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
class AssetRequestHandler extends RequestHandler {
    protected static final String ANDROID_ASSET = "android_asset";
    private static final int ASSET_PREFIX_LENGTH = 22;
    private AssetManager assetManager;
    private final Context context;
    private final Object lock = new Object();

    public AssetRequestHandler(Context context) {
        this.context = context;
    }

    public static String getFilePath(Request request) {
        return request.uri.toString().substring(ASSET_PREFIX_LENGTH);
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        Uri uri = request.uri;
        return C3191e4.h.f36473b.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && ANDROID_ASSET.equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i10) throws IOException {
        if (this.assetManager == null) {
            synchronized (this.lock) {
                try {
                    if (this.assetManager == null) {
                        this.assetManager = this.context.getAssets();
                    }
                } finally {
                }
            }
        }
        return new RequestHandler.Result(h0.source(this.assetManager.open(getFilePath(request))), Picasso.LoadedFrom.DISK);
    }
}
