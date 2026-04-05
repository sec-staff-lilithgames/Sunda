package com.apm.insight.l;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e extends PrintWriter {

    /* renamed from: a, reason: collision with root package name */
    private MessageDigest f13167a;

    /* renamed from: b, reason: collision with root package name */
    private Charset f13168b;

    /* renamed from: c, reason: collision with root package name */
    private a f13169c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {
        public boolean a(String str) {
            return true;
        }
    }

    public e(OutputStream outputStream, MessageDigest messageDigest, a aVar) {
        super(outputStream);
        this.f13168b = null;
        this.f13167a = messageDigest;
        this.f13169c = aVar;
        if (messageDigest != null) {
            this.f13168b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        super.write(cArr, i10, i11);
        MessageDigest messageDigest = this.f13167a;
        if (messageDigest != null) {
            messageDigest.update(this.f13168b.encode(CharBuffer.wrap(cArr)).array());
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(int i10) {
        super.write(i10);
        MessageDigest messageDigest = this.f13167a;
        if (messageDigest != null) {
            messageDigest.update((byte) i10);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(String str, int i10, int i11) {
        super.write(str, i10, i11);
        if (this.f13167a != null) {
            a aVar = this.f13169c;
            if (aVar == null || aVar.a(str)) {
                this.f13167a.update(this.f13168b.encode(CharBuffer.wrap(str, i10, i11 + i10)).array());
            }
        }
    }
}
