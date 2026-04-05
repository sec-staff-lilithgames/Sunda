package qw;

import java.io.IOException;
import kotlin.jvm.internal.e0;
import pw.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m extends pw.u {

    /* renamed from: b, reason: collision with root package name */
    public final long f83592b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f83593c;

    /* renamed from: e, reason: collision with root package name */
    public long f83594e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b1 delegate, long j10, boolean z10) {
        super(delegate);
        e0.checkNotNullParameter(delegate, "delegate");
        this.f83592b = j10;
        this.f83593c = z10;
    }

    @Override // pw.u, pw.b1
    public long read(pw.g sink, long j10) throws IOException {
        e0.checkNotNullParameter(sink, "sink");
        long j11 = this.f83594e;
        long j12 = this.f83592b;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f83593c) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long j14 = super.read(sink, j10);
        if (j14 != -1) {
            this.f83594e += j14;
        }
        long j15 = this.f83594e;
        if ((j15 >= j12 || j14 != -1) && j15 <= j12) {
            return j14;
        }
        if (j14 > 0 && j15 > j12) {
            long size = sink.size() - (this.f83594e - j12);
            pw.g gVar = new pw.g();
            gVar.writeAll(sink);
            sink.write(gVar, size);
            gVar.clear();
        }
        throw new IOException("expected " + j12 + " bytes but got " + this.f83594e);
    }
}
