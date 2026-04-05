package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhua extends Writer {
    private final Appendable zza;
    private final zzhtz zzb = new zzhtz(null);

    public zzhua(Appendable appendable) {
        this.zza = appendable;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) throws IOException {
        this.zza.append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(int i10) throws IOException {
        this.zza.append((char) i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i10, int i11) throws IOException {
        Objects.requireNonNull(str);
        this.zza.append(str, i10, i11 + i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
        this.zza.append(charSequence, i10, i11);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
        append(charSequence, i10, i11);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) throws IOException {
        zzhtz zzhtzVar = this.zzb;
        zzhtzVar.zza(cArr);
        this.zza.append(zzhtzVar, i10, i11 + i10);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }
}
