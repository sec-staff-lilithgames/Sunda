package com.fyber.inneractive.sdk.player.cache;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import j1.o2;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f24380a = Charset.forName(C.ASCII_NAME);

    static {
        Charset.forName(C.UTF8_NAME);
    }

    public static void a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(o2.h(file, "not a readable directory: "));
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                throw new IOException(o2.h(file2, "failed to delete file: "));
            }
        }
    }
}
