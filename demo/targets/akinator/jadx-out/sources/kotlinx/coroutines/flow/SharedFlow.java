package kotlinx.coroutines.flow;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface SharedFlow<T> extends Flow<T> {
    @Override // kotlinx.coroutines.flow.Flow
    Object collect(FlowCollector<? super T> flowCollector, zu.d<?> dVar);

    List<T> getReplayCache();
}
