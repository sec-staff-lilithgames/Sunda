package com.sfbx.appconsentv3.ui.domain;

import bv.d;
import bv.f;
import com.sfbx.appconsent.core.AppConsentCore;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GetCountryFromBOUseCaseImpl implements GetCountryFromBOUseCase {
    private final AppConsentCore appConsentCore;
    private final CoroutineDispatcher defaultDispatcher;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.domain.GetCountryFromBOUseCaseImpl", f = "GetCountryFromBOUseCaseImpl.kt", i = {}, l = {21}, m = "invoke", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.domain.GetCountryFromBOUseCaseImpl$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetCountryFromBOUseCaseImpl.this.invoke(this);
        }
    }

    public GetCountryFromBOUseCaseImpl(CoroutineDispatcher defaultDispatcher, AppConsentCore appConsentCore) {
        e0.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        e0.checkNotNullParameter(appConsentCore, "appConsentCore");
        this.defaultDispatcher = defaultDispatcher;
        this.appConsentCore = appConsentCore;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sfbx.appconsentv3.ui.domain.SimpleUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(zu.d<? super com.sfbx.appconsentv3.ui.model.CountryCore> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.sfbx.appconsentv3.ui.domain.GetCountryFromBOUseCaseImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r12
            com.sfbx.appconsentv3.ui.domain.GetCountryFromBOUseCaseImpl$invoke$1 r0 = (com.sfbx.appconsentv3.ui.domain.GetCountryFromBOUseCaseImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.sfbx.appconsentv3.ui.domain.GetCountryFromBOUseCaseImpl$invoke$1 r0 = new com.sfbx.appconsentv3.ui.domain.GetCountryFromBOUseCaseImpl$invoke$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            tu.a0.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L2a
            goto L56
        L2a:
            r0 = move-exception
            r12 = r0
            goto L5d
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L35:
            tu.a0.throwOnFailure(r12)
            kotlinx.coroutines.CoroutineDispatcher r12 = r11.defaultDispatcher
            kotlinx.coroutines.CoroutineScope r5 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(r12)
            com.sfbx.appconsentv3.ui.domain.GetCountryFromBOUseCaseImpl$invoke$countryCoreDeferred$1 r8 = new com.sfbx.appconsentv3.ui.domain.GetCountryFromBOUseCaseImpl$invoke$countryCoreDeferred$1
            r8.<init>(r11, r3)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            kotlinx.coroutines.Deferred r12 = kotlinx.coroutines.BuildersKt.async$default(r5, r6, r7, r8, r9, r10)
            int r2 = tu.z.f87419c     // Catch: java.lang.Throwable -> L2a
            r0.label = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r12 = r12.await(r0)     // Catch: java.lang.Throwable -> L2a
            if (r12 != r1) goto L56
            return r1
        L56:
            com.sfbx.appconsentv3.ui.model.CountryCore r12 = (com.sfbx.appconsentv3.ui.model.CountryCore) r12     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r12 = tu.z.m7131constructorimpl(r12)     // Catch: java.lang.Throwable -> L2a
            goto L67
        L5d:
            int r0 = tu.z.f87419c
            java.lang.Object r12 = tu.a0.createFailure(r12)
            java.lang.Object r12 = tu.z.m7131constructorimpl(r12)
        L67:
            com.sfbx.appconsentv3.ui.model.CountryCore r0 = new com.sfbx.appconsentv3.ui.model.CountryCore
            r1 = 0
            r0.<init>(r3, r1, r4, r3)
            boolean r1 = tu.z.m7136isFailureimpl(r12)
            if (r1 == 0) goto L74
            r12 = r0
        L74:
            com.sfbx.appconsentv3.ui.model.CountryCore r12 = (com.sfbx.appconsentv3.ui.model.CountryCore) r12
            if (r12 != 0) goto L79
            goto L7a
        L79:
            r0 = r12
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.domain.GetCountryFromBOUseCaseImpl.invoke(zu.d):java.lang.Object");
    }

    public /* synthetic */ GetCountryFromBOUseCaseImpl(CoroutineDispatcher coroutineDispatcher, AppConsentCore appConsentCore, int i10, u uVar) {
        this((i10 & 1) != 0 ? Dispatchers.getIO() : coroutineDispatcher, appConsentCore);
    }
}
