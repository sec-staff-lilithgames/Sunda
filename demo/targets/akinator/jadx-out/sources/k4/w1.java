package k4;

import java.io.File;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f70554e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(CoroutineScope coroutineScope) {
        super(1);
        this.f70554e = coroutineScope;
    }

    @Override // kv.l
    public final l1 invoke(File it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        return new q1(this.f70554e.getCoroutineContext(), it);
    }
}
