package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
class ResourceRequestHandler extends RequestHandler {
    private final Context context;

    public ResourceRequestHandler(Context context) {
        this.context = context;
    }

    private static Bitmap decodeResource(Resources resources, int i10, Request request) {
        BitmapFactory.Options optionsCreateBitmapOptions = RequestHandler.createBitmapOptions(request);
        if (RequestHandler.requiresInSampleSize(optionsCreateBitmapOptions)) {
            BitmapFactory.decodeResource(resources, i10, optionsCreateBitmapOptions);
            RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, optionsCreateBitmapOptions, request);
        }
        return BitmapFactory.decodeResource(resources, i10, optionsCreateBitmapOptions);
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        if (request.resourceId != 0) {
            return true;
        }
        return "android.resource".equals(request.uri.getScheme());
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i10) throws IOException {
        Resources resources = Utils.getResources(this.context, request);
        return new RequestHandler.Result(decodeResource(resources, Utils.getResourceId(resources, request), request), Picasso.LoadedFrom.DISK);
    }
}
