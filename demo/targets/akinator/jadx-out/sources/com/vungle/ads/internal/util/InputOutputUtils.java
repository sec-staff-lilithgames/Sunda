package com.vungle.ads.internal.util;

import android.util.Base64;
import gv.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.e0;
import sv.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class InputOutputUtils {
    public static final InputOutputUtils INSTANCE = new InputOutputUtils();

    private InputOutputUtils() {
    }

    public final String convertForSending(String stringToConvert) throws IOException {
        e0.checkNotNullParameter(stringToConvert, "stringToConvert");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(stringToConvert.length());
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                byte[] bytes = stringToConvert.getBytes(g.f86134b);
                e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.close();
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                e0.checkNotNullExpressionValue(strEncodeToString, "encodeToString(compressed, Base64.NO_WRAP)");
                d.closeFinally(gZIPOutputStream, null);
                d.closeFinally(byteArrayOutputStream, null);
                return strEncodeToString;
            } finally {
            }
        } finally {
        }
    }
}
