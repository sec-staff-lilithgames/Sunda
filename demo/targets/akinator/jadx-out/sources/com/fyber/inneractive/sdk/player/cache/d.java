package com.fyber.inneractive.sdk.player.cache;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e f24347a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f24348b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24349c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f24350d;

    public d(g gVar, e eVar) {
        this.f24350d = gVar;
        this.f24347a = eVar;
        this.f24348b = eVar.f24353c ? null : new boolean[gVar.f24364g];
    }

    public final void a(byte[] bArr) throws IOException {
        OutputStream cVar;
        FileOutputStream fileOutputStream;
        g gVar = this.f24350d;
        if (gVar.f24364g <= 0) {
            throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + this.f24350d.f24364g);
        }
        synchronized (gVar) {
            try {
                e eVar = this.f24347a;
                if (eVar.f24354d != this) {
                    throw new IllegalStateException();
                }
                if (!eVar.f24353c) {
                    this.f24348b[0] = true;
                }
                File fileB = eVar.b(0);
                try {
                    fileOutputStream = new FileOutputStream(fileB);
                } catch (FileNotFoundException unused) {
                    this.f24350d.f24358a.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(fileB);
                    } catch (FileNotFoundException unused2) {
                        cVar = g.f24357q;
                    }
                }
                cVar = new c(this, fileOutputStream);
            } finally {
            }
        }
        try {
            cVar.write(bArr);
            Charset charset = l.f24380a;
            try {
                cVar.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused3) {
            }
        } catch (Throwable th2) {
            Charset charset2 = l.f24380a;
            if (cVar != null) {
                try {
                    cVar.close();
                } catch (RuntimeException e11) {
                    throw e11;
                } catch (Exception unused4) {
                }
            }
            throw th2;
        }
    }

    public final void a() {
        if (this.f24349c) {
            g.a(this.f24350d, this, false);
            this.f24350d.c(this.f24347a.f24351a);
        } else {
            g.a(this.f24350d, this, true);
        }
    }
}
