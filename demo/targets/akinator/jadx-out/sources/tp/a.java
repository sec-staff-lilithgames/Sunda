package tp;

import io.bidmachine.media3.common.util.m0;
import java.io.IOException;
import java.util.List;
import ko.a0;
import ko.a1;
import ko.c0;
import ko.v0;
import ko.z;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements z {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f87332a = new m0(4);

    /* renamed from: b, reason: collision with root package name */
    public final a1 f87333b = new a1(-1, -1, "image/webp");

    @Override // ko.z
    public /* bridge */ /* synthetic */ List getSniffFailureDetails() {
        return super.getSniffFailureDetails();
    }

    @Override // ko.z
    @SideEffectFree
    public /* bridge */ /* synthetic */ z getUnderlyingImplementation() {
        return super.getUnderlyingImplementation();
    }

    @Override // ko.z
    public void init(c0 c0Var) {
        this.f87333b.init(c0Var);
    }

    @Override // ko.z
    public int read(a0 a0Var, v0 v0Var) throws IOException {
        return this.f87333b.read(a0Var, v0Var);
    }

    @Override // ko.z
    public void seek(long j10, long j11) {
        this.f87333b.seek(j10, j11);
    }

    @Override // ko.z
    public boolean sniff(a0 a0Var) throws IOException {
        m0 m0Var = this.f87332a;
        m0Var.reset(4);
        a0Var.peekFully(m0Var.getData(), 0, 4);
        if (m0Var.readUnsignedInt() != 1380533830) {
            return false;
        }
        a0Var.advancePeekPosition(4);
        m0Var.reset(4);
        a0Var.peekFully(m0Var.getData(), 0, 4);
        return m0Var.readUnsignedInt() == 1464156752;
    }

    @Override // ko.z
    public void release() {
    }
}
