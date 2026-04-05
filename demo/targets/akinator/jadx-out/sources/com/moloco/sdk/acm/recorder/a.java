package com.moloco.sdk.acm.recorder;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f45649a = new a();

    public final c create(String mediation) {
        e0.checkNotNullParameter(mediation, "mediation");
        return new d(mediation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c withNoMediation() {
        return new d(null, 1, 0 == true ? 1 : 0);
    }
}
