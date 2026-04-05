package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.n;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.Arrays;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class StoreWebViewError extends n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreWebViewError(Enum<?> r22, String str, Object... errorArguments) {
        super(r22, str, Arrays.copyOf(errorArguments, errorArguments.length));
        e0.checkNotNullParameter(errorArguments, "errorArguments");
    }

    @Override // com.unity3d.scar.adapter.common.n, com.unity3d.scar.adapter.common.j
    public String getDomain() {
        return WebViewEventCategory.STORE.name();
    }
}
