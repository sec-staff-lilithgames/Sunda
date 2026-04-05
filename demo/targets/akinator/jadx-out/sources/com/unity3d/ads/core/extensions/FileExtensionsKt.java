package com.unity3d.ads.core.extensions;

import java.io.File;
import java.util.LinkedList;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class FileExtensionsKt {
    public static final long getDirectorySize(File file) {
        File[] fileArrListFiles;
        e0.checkNotNullParameter(file, "<this>");
        long length = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        while (!linkedList.isEmpty()) {
            File file2 = (File) linkedList.remove(0);
            if (file2.exists() && (fileArrListFiles = file2.listFiles()) != null && fileArrListFiles.length != 0) {
                for (File child : fileArrListFiles) {
                    if (child.isDirectory()) {
                        e0.checkNotNullExpressionValue(child, "child");
                        linkedList.add(child);
                    } else {
                        length += child.length();
                    }
                }
            }
        }
        return length;
    }
}
