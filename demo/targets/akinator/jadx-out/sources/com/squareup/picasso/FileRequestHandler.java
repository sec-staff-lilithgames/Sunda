package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.ironsource.C3191e4;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import cv.BLca.YsiBvdpw;
import java.io.IOException;
import pw.h0;
import v4.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
class FileRequestHandler extends ContentStreamRequestHandler {
    public FileRequestHandler(Context context) {
        super(context);
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        return C3191e4.h.f36473b.equals(request.uri.getScheme());
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i10) throws IOException {
        return new RequestHandler.Result(null, h0.source(getInputStream(request)), Picasso.LoadedFrom.DISK, getFileExifRotation(request.uri));
    }

    public static int getFileExifRotation(Uri uri) throws IOException {
        return new c(uri.getPath()).getAttributeInt(YsiBvdpw.aOyzuaQGtOsCCpn, 1);
    }
}
