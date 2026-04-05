package f7;

import c7.t;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f55454a;

    /* renamed from: b, reason: collision with root package name */
    public final l7.o f55455b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements h {
        @Override // f7.h
        public i create(ByteBuffer byteBuffer, l7.o oVar, a7.m mVar) {
            return new c(byteBuffer, oVar);
        }
    }

    public c(ByteBuffer byteBuffer, l7.o oVar) {
        this.f55454a = byteBuffer;
        this.f55455b = oVar;
    }

    @Override // f7.i
    public Object fetch(zu.d<? super g> dVar) {
        ByteBuffer byteBuffer = this.f55454a;
        try {
            pw.g gVar = new pw.g();
            gVar.write(byteBuffer);
            byteBuffer.position(0);
            return new o(t.create(gVar, this.f55455b.getContext()), null, c7.f.f11834c);
        } catch (Throwable th2) {
            byteBuffer.position(0);
            throw th2;
        }
    }
}
