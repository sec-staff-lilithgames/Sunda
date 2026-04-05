package com.inmobi.media;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class V3 {

    /* renamed from: a, reason: collision with root package name */
    public final W3 f32386a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f32387b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32388c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y3 f32389d;

    public V3(Y3 y32, W3 w32) {
        this.f32389d = y32;
        this.f32386a = w32;
        this.f32387b = w32.f32433c ? null : new boolean[y32.f32544h];
    }

    public final OutputStream a(int i10) {
        FileOutputStream fileOutputStream;
        U3 u32;
        synchronized (this.f32389d) {
            try {
                W3 w32 = this.f32386a;
                if (w32.f32434d != this) {
                    throw new IllegalStateException();
                }
                if (!w32.f32433c) {
                    this.f32387b[i10] = true;
                }
                File fileB = w32.b(i10);
                try {
                    fileOutputStream = new FileOutputStream(fileB);
                } catch (FileNotFoundException unused) {
                    this.f32389d.f32537a.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(fileB);
                    } catch (FileNotFoundException unused2) {
                        return Y3.f32536q;
                    }
                }
                u32 = new U3(this, fileOutputStream);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return u32;
    }

    public final void a(String str, int i10) throws Throwable {
        OutputStreamWriter outputStreamWriter = null;
        try {
            OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(a(i10), AbstractC2775ff.f32848b);
            try {
                outputStreamWriter2.write(str);
                AbstractC2775ff.a(outputStreamWriter2);
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter = outputStreamWriter2;
                AbstractC2775ff.a(outputStreamWriter);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
