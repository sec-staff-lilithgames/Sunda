package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import java.io.BufferedOutputStream;
import java.io.File;
import java.net.HttpURLConnection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2877m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f33063b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2930p1 f33064a;

    public C2877m(InterfaceC2930p1 mResultListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mResultListener, "mResultListener");
        this.f33064a = mResultListener;
    }

    public static void a(File file, HttpURLConnection httpURLConnection, BufferedOutputStream bufferedOutputStream) {
        try {
            if (file.exists()) {
                file.delete();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("m", "TAG");
            }
            httpURLConnection.disconnect();
            C2736da.a(bufferedOutputStream);
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }
}
