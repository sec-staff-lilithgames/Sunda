package ao;

import java.util.concurrent.Executor;
import mh.v2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class f1 implements v2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v2 f7661c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.bidmachine.media3.common.util.k f7662e;

    public /* synthetic */ f1(v2 v2Var, io.bidmachine.media3.common.util.k kVar, int i10) {
        this.f7660b = i10;
        this.f7661c = v2Var;
        this.f7662e = kVar;
    }

    @Override // mh.v2
    public final Object get() {
        int i10 = this.f7660b;
        io.bidmachine.media3.common.util.k kVar = this.f7662e;
        v2 v2Var = this.f7661c;
        switch (i10) {
        }
        return ho.b.from((Executor) v2Var.get(), kVar);
    }
}
