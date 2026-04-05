package l8;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g extends ByteArrayOutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f72701b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, int i10) {
        super(i10);
        this.f72701b = hVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public String toString() {
        int i10 = ((ByteArrayOutputStream) this).count;
        if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
            i10--;
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i10, this.f72701b.f72703c.name());
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }
}
