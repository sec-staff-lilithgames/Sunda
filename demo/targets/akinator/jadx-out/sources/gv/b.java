package gv;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import uu.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends m0 {

    /* renamed from: b, reason: collision with root package name */
    public int f58471b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f58472c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f58473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BufferedInputStream f58474f;

    public b(BufferedInputStream bufferedInputStream) {
        this.f58474f = bufferedInputStream;
    }

    public final void a() throws IOException {
        if (this.f58472c || this.f58473e) {
            return;
        }
        int i10 = this.f58474f.read();
        this.f58471b = i10;
        this.f58472c = true;
        this.f58473e = i10 == -1;
    }

    public final boolean getFinished() {
        return this.f58473e;
    }

    public final int getNextByte() {
        return this.f58471b;
    }

    public final boolean getNextPrepared() {
        return this.f58472c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws IOException {
        a();
        return !this.f58473e;
    }

    @Override // uu.m0
    public byte nextByte() throws IOException {
        a();
        if (this.f58473e) {
            throw new NoSuchElementException("Input stream is over.");
        }
        byte b10 = (byte) this.f58471b;
        this.f58472c = false;
        return b10;
    }

    public final void setFinished(boolean z10) {
        this.f58473e = z10;
    }

    public final void setNextByte(int i10) {
        this.f58471b = i10;
    }

    public final void setNextPrepared(boolean z10) {
        this.f58472c = z10;
    }
}
