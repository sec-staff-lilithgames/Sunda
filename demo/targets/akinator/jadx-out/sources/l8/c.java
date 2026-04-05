package l8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f72670a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f72671b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f72672c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f72673d;

    public c(f fVar, d dVar) {
        this.f72673d = fVar;
        this.f72670a = dVar;
        this.f72671b = dVar.f72678e ? null : new boolean[fVar.f72693i];
    }

    public void abort() throws IOException {
        f.b(this.f72673d, this, false);
    }

    public void abortUnlessCommitted() {
        if (this.f72672c) {
            return;
        }
        try {
            abort();
        } catch (IOException unused) {
        }
    }

    public void commit() throws IOException {
        f.b(this.f72673d, this, true);
        this.f72672c = true;
    }

    public File getFile(int i10) throws IOException {
        File dirtyFile;
        synchronized (this.f72673d) {
            try {
                d dVar = this.f72670a;
                if (dVar.f72679f != this) {
                    throw new IllegalStateException();
                }
                if (!dVar.f72678e) {
                    this.f72671b[i10] = true;
                }
                dirtyFile = dVar.getDirtyFile(i10);
                this.f72673d.f72687b.mkdirs();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dirtyFile;
    }

    public String getString(int i10) throws IOException {
        FileInputStream fileInputStream;
        synchronized (this.f72673d) {
            d dVar = this.f72670a;
            if (dVar.f72679f != this) {
                throw new IllegalStateException();
            }
            if (dVar.f72678e) {
                try {
                    fileInputStream = new FileInputStream(this.f72670a.getCleanFile(i10));
                } catch (FileNotFoundException unused) {
                }
            }
            fileInputStream = null;
        }
        if (fileInputStream != null) {
            return f.a(fileInputStream);
        }
        return null;
    }

    public void set(int i10, String str) throws Throwable {
        OutputStreamWriter outputStreamWriter = null;
        try {
            OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(getFile(i10)), i.f72708b);
            try {
                outputStreamWriter2.write(str);
                try {
                    outputStreamWriter2.close();
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter = outputStreamWriter2;
                Charset charset = i.f72707a;
                if (outputStreamWriter != null) {
                    try {
                        outputStreamWriter.close();
                    } catch (RuntimeException e11) {
                        throw e11;
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
