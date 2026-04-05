package xr;

import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r9 extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t9 f92963b;

    public r9(t9 t9Var) {
        this.f92963b = t9Var;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        this.f92963b.c(i10, i11, bArr);
    }
}
