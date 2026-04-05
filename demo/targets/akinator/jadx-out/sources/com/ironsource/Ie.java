package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ie implements N8 {
    @Override // com.ironsource.N8
    public void a(Context context, String key, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        IronSourceUtils.b(context, key, i10);
    }

    @Override // com.ironsource.N8
    public int b(Context context, String key, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return IronSourceUtils.a(context, key, i10);
    }

    @Override // com.ironsource.N8
    public void a(Context context, String key, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        IronSourceUtils.b(context, key, j10);
    }

    @Override // com.ironsource.N8
    public long b(Context context, String key, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return IronSourceUtils.a(context, key, j10);
    }
}
