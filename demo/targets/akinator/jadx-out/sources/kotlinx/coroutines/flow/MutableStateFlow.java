package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface MutableStateFlow<T> extends StateFlow<T>, MutableSharedFlow<T> {
    boolean compareAndSet(T t10, T t11);

    @Override // kotlinx.coroutines.flow.StateFlow
    T getValue();

    void setValue(T t10);
}
