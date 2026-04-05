package io.odeeo.internal.n1;

import io.odeeo.sdk.state.CancellationOption;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f extends c {
    public f() {
        this(null, null, null, 7, null);
    }

    @Override // io.odeeo.internal.n1.c
    public void cancel(CoroutineScope coroutineScope) {
        getOnCancellation().execute(coroutineScope, getMessage());
    }

    public /* synthetic */ f(String str, Map map, CancellationOption cancellationOption, int i10, u uVar) {
        this((i10 & 1) != 0 ? "State Success" : str, (i10 & 2) != 0 ? p1.emptyMap() : map, (i10 & 4) != 0 ? CancellationOption.Cancel : cancellationOption);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String message, Map<String, ? extends Object> parameters, CancellationOption onCancellation) {
        super(message, -1, parameters, onCancellation, null);
        e0.checkNotNullParameter(message, "message");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(onCancellation, "onCancellation");
    }
}
