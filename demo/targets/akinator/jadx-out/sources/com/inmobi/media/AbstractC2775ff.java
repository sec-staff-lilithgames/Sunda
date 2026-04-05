package com.inmobi.media;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ff, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2775ff {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f32847a = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.ASCII_NAME);

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f32848b = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);

    public static String a(InputStreamReader inputStreamReader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int i10 = inputStreamReader.read(cArr);
                if (i10 == -1) {
                    String string = stringWriter.toString();
                    inputStreamReader.close();
                    return string;
                }
                stringWriter.write(cArr, 0, i10);
            }
        } catch (Throwable th2) {
            inputStreamReader.close();
            throw th2;
        }
    }

    public static void a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (!file2.delete()) {
                    throw new IOException(j1.o2.h(file2, "failed to delete file: "));
                }
            }
            return;
        }
        throw new IOException(j1.o2.h(file, "not a readable directory: "));
    }

    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }
}
