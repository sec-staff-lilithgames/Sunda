package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.IOException;
import pw.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
class MediaStoreRequestHandler extends ContentStreamRequestHandler {
    private static final String[] CONTENT_ORIENTATION = {"orientation"};

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum PicassoKind {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);

        final int androidKind;
        final int height;
        final int width;

        PicassoKind(int i10, int i11, int i12) {
            this.androidKind = i10;
            this.width = i11;
            this.height = i12;
        }
    }

    public MediaStoreRequestHandler(Context context) {
        super(context);
    }

    public static int getExifOrientation(ContentResolver contentResolver, Uri uri) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, CONTENT_ORIENTATION, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                int i10 = cursorQuery.getInt(0);
                cursorQuery.close();
                return i10;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return 0;
        } catch (Throwable th2) {
            if (cursorQuery == null) {
                throw th2;
            }
            cursorQuery.close();
            throw th2;
        }
    }

    public static PicassoKind getPicassoKind(int i10, int i11) {
        PicassoKind picassoKind = PicassoKind.MICRO;
        if (i10 <= picassoKind.width && i11 <= picassoKind.height) {
            return picassoKind;
        }
        PicassoKind picassoKind2 = PicassoKind.MINI;
        return (i10 > picassoKind2.width || i11 > picassoKind2.height) ? PicassoKind.FULL : picassoKind2;
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        Uri uri = request.uri;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i10) throws IOException {
        Request request2;
        Bitmap thumbnail;
        ContentResolver contentResolver = this.context.getContentResolver();
        int exifOrientation = getExifOrientation(contentResolver, request.uri);
        String type = contentResolver.getType(request.uri);
        boolean z10 = type != null && type.startsWith("video/");
        if (request.hasSize()) {
            PicassoKind picassoKind = getPicassoKind(request.targetWidth, request.targetHeight);
            if (!z10 && picassoKind == PicassoKind.FULL) {
                return new RequestHandler.Result(null, h0.source(getInputStream(request)), Picasso.LoadedFrom.DISK, exifOrientation);
            }
            long id2 = ContentUris.parseId(request.uri);
            BitmapFactory.Options optionsCreateBitmapOptions = RequestHandler.createBitmapOptions(request);
            optionsCreateBitmapOptions.inJustDecodeBounds = true;
            request2 = request;
            RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, picassoKind.width, picassoKind.height, optionsCreateBitmapOptions, request2);
            if (z10) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, id2, picassoKind != PicassoKind.FULL ? picassoKind.androidKind : 1, optionsCreateBitmapOptions);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, id2, picassoKind.androidKind, optionsCreateBitmapOptions);
            }
            if (thumbnail != null) {
                return new RequestHandler.Result(thumbnail, null, Picasso.LoadedFrom.DISK, exifOrientation);
            }
        } else {
            request2 = request;
        }
        return new RequestHandler.Result(null, h0.source(getInputStream(request2)), Picasso.LoadedFrom.DISK, exifOrientation);
    }
}
