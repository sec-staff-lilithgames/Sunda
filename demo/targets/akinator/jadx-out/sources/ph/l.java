package ph;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public int f81320b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f81321c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f81322e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Writer f81323f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f81324g;

    public l(n nVar, Writer writer) {
        this.f81323f = writer;
        this.f81324g = nVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i10 = this.f81321c;
        Writer writer = this.f81323f;
        if (i10 > 0) {
            int i11 = this.f81320b;
            n nVar = this.f81324g;
            g gVar = nVar.f81331f;
            writer.write(gVar.f81302b[(i11 << (gVar.f81304d - i10)) & gVar.f81303c]);
            this.f81322e++;
            if (nVar.f81332g != null) {
                while (this.f81322e % nVar.f81331f.f81305e != 0) {
                    writer.write(nVar.f81332g.charValue());
                    this.f81322e++;
                }
            }
        }
        writer.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f81323f.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f81320b = (i10 & 255) | (this.f81320b << 8);
        this.f81321c += 8;
        while (true) {
            int i11 = this.f81321c;
            n nVar = this.f81324g;
            g gVar = nVar.f81331f;
            int i12 = gVar.f81304d;
            if (i11 < i12) {
                return;
            }
            this.f81323f.write(gVar.f81302b[(this.f81320b >> (i11 - i12)) & gVar.f81303c]);
            this.f81322e++;
            this.f81321c -= nVar.f81331f.f81304d;
        }
    }
}
