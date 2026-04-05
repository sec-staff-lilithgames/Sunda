package io.odeeo.internal.n1;

import io.odeeo.sdk.state.CancellationOption;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends c {
    public a() {
        this(null, 0, null, null, 15, null);
    }

    @Override // io.odeeo.internal.n1.c
    public void cancel(CoroutineScope coroutineScope) {
        io.odeeo.internal.b2.a.d("BadInternetError cancel", new Object[0]);
        getOnCancellation().execute(coroutineScope, getMessage());
    }

    public /* synthetic */ a(String str, int i10, Map map, CancellationOption cancellationOption, int i11, u uVar) {
        this((i11 & 1) != 0 ? "Network error" : str, (i11 & 2) != 0 ? 1000 : i10, (i11 & 4) != 0 ? p1.emptyMap() : map, (i11 & 8) != 0 ? CancellationOption.DoNotCancel : cancellationOption);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String message, int i10, Map<String, ? extends Object> parameters, CancellationOption onCancellation) {
        super(message, i10, parameters, onCancellation, null);
        e0.checkNotNullParameter(message, "message");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(onCancellation, "onCancellation");
    }
}
