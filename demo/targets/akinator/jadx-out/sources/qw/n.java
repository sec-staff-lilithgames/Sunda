package qw;

import kotlin.jvm.internal.e0;
import pw.a1;
import pw.b1;
import pw.r0;
import pw.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f83595a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f83596b;

    public n(r0 sinkPipe, r0 sourcePipe) {
        e0.checkNotNullParameter(sinkPipe, "sinkPipe");
        e0.checkNotNullParameter(sourcePipe, "sourcePipe");
        this.f83595a = sinkPipe;
        this.f83596b = sourcePipe;
    }

    @Override // pw.a1
    public void cancel() {
        this.f83596b.cancel();
        this.f83595a.cancel();
    }

    @Override // pw.a1
    public z0 getSink() {
        return this.f83595a.sink();
    }

    public final r0 getSinkPipe() {
        return this.f83595a;
    }

    @Override // pw.a1
    public b1 getSource() {
        return this.f83596b.source();
    }

    public final r0 getSourcePipe() {
        return this.f83596b;
    }
}
