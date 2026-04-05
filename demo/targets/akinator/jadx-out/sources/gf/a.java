package gf;

import com.google.android.exoplayer2.util.v0;
import ef.i;
import ef.j;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends i {

    /* renamed from: n, reason: collision with root package name */
    public final b f57599n;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        v0 v0Var = new v0(list.get(0));
        this.f57599n = new b(v0Var.readUnsignedShort(), v0Var.readUnsignedShort());
    }

    @Override // ef.i
    public final j c(byte[] bArr, int i10, boolean z10) {
        b bVar = this.f57599n;
        if (z10) {
            bVar.reset();
        }
        return new c(bVar.decode(bArr, i10));
    }
}
