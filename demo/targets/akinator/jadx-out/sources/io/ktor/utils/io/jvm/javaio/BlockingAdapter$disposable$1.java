package io.ktor.utils.io.jvm.javaio;

import kotlin.jvm.internal.f0;
import kv.l;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class BlockingAdapter$disposable$1 extends f0 implements l {
    final /* synthetic */ BlockingAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockingAdapter$disposable$1(BlockingAdapter blockingAdapter) {
        super(1);
        this.this$0 = blockingAdapter;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        if (th2 != null) {
            d dVar = this.this$0.end;
            int i10 = z.f87419c;
            dVar.resumeWith(z.m7131constructorimpl(a0.createFailure(th2)));
        }
    }
}
