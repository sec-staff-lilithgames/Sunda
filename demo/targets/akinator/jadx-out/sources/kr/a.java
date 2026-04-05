package kr;

import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface a {
    boolean canDelete(File file);

    default void clean(File file) {
        if (file != null) {
            try {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2 != null && canDelete(file2)) {
                            b.deleteFile(file2);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
