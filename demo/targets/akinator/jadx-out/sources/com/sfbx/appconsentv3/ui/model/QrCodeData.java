package com.sfbx.appconsentv3.ui.model;

import android.graphics.Bitmap;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class QrCodeData {
    private final String description;
    private final Bitmap qrCode;
    private final String title;
    private final String url;

    public QrCodeData(Bitmap qrCode, String title, String str, String str2) {
        e0.checkNotNullParameter(qrCode, "qrCode");
        e0.checkNotNullParameter(title, "title");
        this.qrCode = qrCode;
        this.title = title;
        this.description = str;
        this.url = str2;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Bitmap getQrCode() {
        return this.qrCode;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public /* synthetic */ QrCodeData(Bitmap bitmap, String str, String str2, String str3, int i10, u uVar) {
        this(bitmap, str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3);
    }
}
