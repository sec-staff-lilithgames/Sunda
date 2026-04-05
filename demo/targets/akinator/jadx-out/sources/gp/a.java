package gp;

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
    public final a1 f58387a = new a1(35152, 2, "image/png");

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
        this.f58387a.init(c0Var);
    }

    @Override // ko.z
    public int read(a0 a0Var, v0 v0Var) throws IOException {
        return this.f58387a.read(a0Var, v0Var);
    }

    @Override // ko.z
    public void seek(long j10, long j11) {
        this.f58387a.seek(j10, j11);
    }

    @Override // ko.z
    public boolean sniff(a0 a0Var) throws IOException {
        return this.f58387a.sniff(a0Var);
    }

    @Override // ko.z
    public void release() {
    }
}
