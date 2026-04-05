package yr;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class d extends i {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f94848c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, as.d dVar) {
        super(dVar);
        this.f94848c = fVar;
    }

    @Override // yr.i, as.d
    public void ackSettings(as.p pVar) throws IOException {
        this.f94848c.f94898n++;
        super.ackSettings(pVar);
    }

    @Override // yr.i, as.d
    public void ping(boolean z10, int i10, int i11) throws IOException {
        if (z10) {
            this.f94848c.f94898n++;
        }
        super.ping(z10, i10, i11);
    }

    @Override // yr.i, as.d
    public void rstStream(int i10, as.a aVar) throws IOException {
        this.f94848c.f94898n++;
        super.rstStream(i10, aVar);
    }
}
