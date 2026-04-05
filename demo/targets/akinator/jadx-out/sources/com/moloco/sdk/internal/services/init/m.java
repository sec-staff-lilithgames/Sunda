package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.internal.services.init.j;
import com.moloco.sdk.internal.w;
import io.ktor.http.HttpStatusCode;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class m {
    public static final boolean a(w.a aVar) {
        e0.checkNotNullParameter(aVar, "<this>");
        if (aVar.a() instanceof j.b) {
            return a(((j.b) aVar.a()).a());
        }
        return true;
    }

    public static final boolean a(int i10) {
        HttpStatusCode.Companion companion = HttpStatusCode.Companion;
        return i10 == companion.getTooManyRequests().getValue() || i10 == companion.getRequestTimeout().getValue() || i10 < 400 || i10 >= 500;
    }
}
