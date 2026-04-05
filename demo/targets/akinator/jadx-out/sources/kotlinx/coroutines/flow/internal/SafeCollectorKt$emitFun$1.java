package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.a0;
import kotlinx.coroutines.flow.FlowCollector;
import kv.q;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public /* synthetic */ class SafeCollectorKt$emitFun$1 extends a0 implements q {
    public static final SafeCollectorKt$emitFun$1 INSTANCE = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, FlowCollector.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kv.q
    public final Object invoke(FlowCollector<Object> flowCollector, Object obj, d<? super x0> dVar) {
        return flowCollector.emit(obj, dVar);
    }
}
