package com.unity3d.ads.core.data.datasource;

import kotlin.jvm.internal.e0;
import tu.a0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidFIdExistenceDataSource implements FIdExistenceDataSource {
    private final String className;

    public AndroidFIdExistenceDataSource(String className) {
        e0.checkNotNullParameter(className, "className");
        this.className = className;
    }

    @Override // com.unity3d.ads.core.data.datasource.FIdExistenceDataSource
    public boolean invoke() {
        Object objM7131constructorimpl;
        try {
            int i10 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(Class.forName(this.className));
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        return z.m7137isSuccessimpl(objM7131constructorimpl);
    }
}
