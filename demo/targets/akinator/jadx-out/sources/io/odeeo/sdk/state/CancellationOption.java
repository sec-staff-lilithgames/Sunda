package io.odeeo.sdk.state;

import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public enum CancellationOption {
    Cancel { // from class: io.odeeo.sdk.state.CancellationOption.a
        @Override // io.odeeo.sdk.state.CancellationOption
        public void execute(CoroutineScope coroutineScope, String str) {
            if (coroutineScope == null) {
                return;
            }
            if (str == null) {
                str = name();
            }
            CoroutineScopeKt.cancel$default(coroutineScope, str, null, 2, null);
        }
    },
    DoNotCancel;

    /* synthetic */ CancellationOption(u uVar) {
        this();
    }

    public static /* synthetic */ void execute$default(CancellationOption cancellationOption, CoroutineScope coroutineScope, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }
        if ((i10 & 1) != 0) {
            coroutineScope = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        cancellationOption.execute(coroutineScope, str);
    }

    public void execute(CoroutineScope coroutineScope, String str) {
    }
}
