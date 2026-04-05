package com.inmobi.media;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.s7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2986s7 {
    public static final boolean a(String tag, String data, String filePath) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        kotlin.jvm.internal.e0.checkNotNullParameter(filePath, "filePath");
        try {
            a(filePath);
            File file = new File(filePath);
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bytes = data.getBytes(sv.g.f86134b);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
            return true;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    public static final void a(String filePath) {
        kotlin.jvm.internal.e0.checkNotNullParameter(filePath, "filePath");
        File file = new File(filePath);
        if (file.exists() && file.delete()) {
            file.getName();
        }
    }
}
