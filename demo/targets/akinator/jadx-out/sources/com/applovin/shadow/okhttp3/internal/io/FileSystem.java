package com.applovin.shadow.okhttp3.internal.io;

import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Okio__JvmOkioKt;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import j1.o2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface FileSystem {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class SystemFileSystem implements FileSystem {
            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            public Sink appendingSink(File file) throws FileNotFoundException {
                e0.checkNotNullParameter(file, "file");
                try {
                    return Okio.appendingSink(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio.appendingSink(file);
                }
            }

            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            public void delete(File file) throws IOException {
                e0.checkNotNullParameter(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException(o2.h(file, "failed to delete "));
                }
            }

            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            public void deleteContents(File directory) throws IOException {
                e0.checkNotNullParameter(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException(o2.h(directory, "not a readable directory: "));
                }
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        e0.checkNotNullExpressionValue(file, "file");
                        deleteContents(file);
                    }
                    if (!file.delete()) {
                        throw new IOException(o2.h(file, "failed to delete "));
                    }
                }
            }

            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            public boolean exists(File file) {
                e0.checkNotNullParameter(file, "file");
                return file.exists();
            }

            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            public void rename(File from, File to2) throws IOException {
                e0.checkNotNullParameter(from, "from");
                e0.checkNotNullParameter(to2, "to");
                delete(to2);
                if (from.renameTo(to2)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to2);
            }

            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            public Sink sink(File file) throws FileNotFoundException {
                e0.checkNotNullParameter(file, "file");
                try {
                    return Okio__JvmOkioKt.sink$default(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio__JvmOkioKt.sink$default(file, false, 1, null);
                }
            }

            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            public long size(File file) {
                e0.checkNotNullParameter(file, "file");
                return file.length();
            }

            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            public Source source(File file) throws FileNotFoundException {
                e0.checkNotNullParameter(file, "file");
                return Okio.source(file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    Sink appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    Sink sink(File file) throws FileNotFoundException;

    long size(File file);

    Source source(File file) throws FileNotFoundException;
}
