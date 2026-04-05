package com.fyber.inneractive.sdk.web;

import android.media.MediaScannerConnection;
import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a0 implements MediaScannerConnection.MediaScannerConnectionClient {

    /* renamed from: a, reason: collision with root package name */
    public final String f26835a;

    /* renamed from: b, reason: collision with root package name */
    public MediaScannerConnection f26836b;

    public a0(String str) {
        this.f26835a = str;
    }

    @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
    public final void onMediaScannerConnected() {
        MediaScannerConnection mediaScannerConnection = this.f26836b;
        if (mediaScannerConnection != null) {
            mediaScannerConnection.scanFile(this.f26835a, null);
        }
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, Uri uri) {
        MediaScannerConnection mediaScannerConnection = this.f26836b;
        if (mediaScannerConnection != null) {
            mediaScannerConnection.disconnect();
        }
    }
}
