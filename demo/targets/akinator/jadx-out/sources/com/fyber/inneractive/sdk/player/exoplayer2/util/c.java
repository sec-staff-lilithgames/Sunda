package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final File f26010a;

    /* renamed from: b, reason: collision with root package name */
    public final File f26011b;

    public c(File file) {
        this.f26010a = file;
        this.f26011b = new File(file.getPath() + ".bak");
    }

    public final FileInputStream a() {
        if (this.f26011b.exists()) {
            this.f26010a.delete();
            this.f26011b.renameTo(this.f26010a);
        }
        return new FileInputStream(this.f26010a);
    }

    public final b b() throws IOException {
        if (this.f26010a.exists()) {
            if (this.f26011b.exists()) {
                this.f26010a.delete();
            } else if (!this.f26010a.renameTo(this.f26011b)) {
                Log.w("AtomicFile", "Couldn't rename file " + this.f26010a + " to backup file " + this.f26011b);
            }
        }
        try {
            return new b(this.f26010a);
        } catch (FileNotFoundException unused) {
            if (!this.f26010a.getParentFile().mkdirs()) {
                throw new IOException("Couldn't create directory " + this.f26010a);
            }
            try {
                return new b(this.f26010a);
            } catch (FileNotFoundException unused2) {
                throw new IOException("Couldn't create " + this.f26010a);
            }
        }
    }
}
