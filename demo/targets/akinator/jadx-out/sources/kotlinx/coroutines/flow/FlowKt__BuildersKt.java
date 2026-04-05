package kotlinx.coroutines.flow;

import av.e;
import java.util.Iterator;
import kv.l;
import kv.p;
import qv.m;
import rv.t;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final /* synthetic */ class FlowKt__BuildersKt {
    public static final <T> Flow<T> asFlow(final kv.a aVar) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super T> flowCollector, zu.d<? super x0> dVar) {
                Object objEmit = flowCollector.emit(aVar.invoke(), dVar);
                return objEmit == e.getCOROUTINE_SUSPENDED() ? objEmit : x0.f87415a;
            }
        };
    }

    public static final <T> Flow<T> callbackFlow(p pVar) {
        return new CallbackFlowBuilder(pVar, null, 0, null, 14, null);
    }

    public static final <T> Flow<T> channelFlow(p pVar) {
        return new ChannelFlowBuilder(pVar, null, 0, null, 14, null);
    }

    public static final <T> Flow<T> emptyFlow() {
        return EmptyFlow.INSTANCE;
    }

    public static final <T> Flow<T> flow(p pVar) {
        return new SafeFlow(pVar);
    }

    public static final <T> Flow<T> flowOf(T... tArr) {
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(tArr);
    }

    public static final <T> Flow<T> asFlow(l lVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2(lVar);
    }

    public static final <T> Flow<T> flowOf(final T t10) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super T> flowCollector, zu.d<? super x0> dVar) {
                Object objEmit = flowCollector.emit((Object) t10, dVar);
                return objEmit == e.getCOROUTINE_SUSPENDED() ? objEmit : x0.f87415a;
            }
        };
    }

    public static final <T> Flow<T> asFlow(Iterable<? extends T> iterable) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(iterable);
    }

    public static final <T> Flow<T> asFlow(Iterator<? extends T> it) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4(it);
    }

    public static final <T> Flow<T> asFlow(t tVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5(tVar);
    }

    public static final <T> Flow<T> asFlow(T[] tArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6(tArr);
    }

    public static final Flow<Integer> asFlow(int[] iArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7(iArr);
    }

    public static final Flow<Long> asFlow(long[] jArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8(jArr);
    }

    public static final Flow<Integer> asFlow(m mVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9(mVar);
    }

    public static final Flow<Long> asFlow(qv.p pVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10(pVar);
    }
}
