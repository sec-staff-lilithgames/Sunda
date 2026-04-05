package kotlinx.coroutines.selects;

import kotlinx.coroutines.DisposableHandle;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface SelectInstance<R> {
    void disposeOnCompletion(DisposableHandle disposableHandle);

    m getContext();

    void selectInRegistrationPhase(Object obj);

    boolean trySelect(Object obj, Object obj2);
}
