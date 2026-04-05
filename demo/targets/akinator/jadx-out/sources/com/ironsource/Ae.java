package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sfbx.appconsent.core.exception.ACExceptionKt;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ae implements Ec {

    /* renamed from: a, reason: collision with root package name */
    public static final Ae f33847a = new Ae();

    /* renamed from: b, reason: collision with root package name */
    private static final De f33848b = new De();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements InterfaceC3432re {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3432re f33849a;

        public a(InterfaceC3432re interfaceC3432re) {
            this.f33849a = interfaceC3432re;
        }

        @Override // com.ironsource.InterfaceC3432re
        public void a(C3326le sdkConfig) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sdkConfig, "sdkConfig");
            Ae.f33848b.a(new dh(sdkConfig, this.f33849a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C3326le sdkConfig, InterfaceC3432re listener) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sdkConfig, "$sdkConfig");
            kotlin.jvm.internal.e0.checkNotNullParameter(listener, "$listener");
            Ae.f33847a.a(sdkConfig, listener);
        }

        @Override // com.ironsource.InterfaceC3432re
        public void a(C3364ne error) {
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
            Ae.f33848b.d(new eh(this.f33849a, error, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(InterfaceC3432re listener, C3364ne error) {
            kotlin.jvm.internal.e0.checkNotNullParameter(listener, "$listener");
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "$error");
            listener.a(error);
        }
    }

    private Ae() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, C3466te initRequest, InterfaceC3432re listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.e0.checkNotNullParameter(initRequest, "$initRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "$listener");
        new V9().a(EnumC3449se.LEVEL_PLAY_INIT);
        f33847a.a(context, initRequest, listener, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Context context, C3466te initRequest, InterfaceC3432re listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.e0.checkNotNullParameter(initRequest, "$initRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "$listener");
        com.ironsource.mediationsdk.r rVarM = com.ironsource.mediationsdk.r.m();
        String strD = initRequest.d();
        IronSource.a[] aVarArr = (IronSource.a[]) initRequest.e().toArray(new IronSource.a[0]);
        List<IronSource.a> validAdUnitsList = rVarM.a(context, strD, false, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(validAdUnitsList, "validAdUnitsList");
        initRequest.a(validAdUnitsList);
        new V9().a(EnumC3449se.EXTERNAL_MEDIATION_INIT);
        f33847a.a(context, initRequest, listener, true);
    }

    public final void c(Context context, C3466te initRequest, InterfaceC3432re listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(initRequest, "initRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        f33848b.c(new bh(context, initRequest, listener, 1));
    }

    @Override // com.ironsource.Ec
    public void onInitFailed(IronSourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        f33848b.a(new ch(error, 1));
    }

    public final void a(Context context, C3466te initRequest, InterfaceC3432re listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(initRequest, "initRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        f33848b.c(new bh(context, initRequest, listener, 0));
    }

    private final void a(Context context, C3466te c3466te, InterfaceC3432re interfaceC3432re, boolean z10) {
        String strF = c3466te.f();
        if (strF != null && strF.length() > 0) {
            com.ironsource.mediationsdk.r.m().o(c3466te.f());
        } else {
            c3466te = new C3466te(c3466te.d(), com.ironsource.mediationsdk.r.m().o(), uu.y0.toMutableList((Collection) c3466te.e()));
        }
        com.ironsource.mediationsdk.r rVarM = com.ironsource.mediationsdk.r.m();
        String strD = c3466te.d();
        IronSource.a[] aVarArr = (IronSource.a[]) c3466te.e().toArray(new IronSource.a[0]);
        IronSourceError ironSourceErrorA = rVarM.a(context, strD, z10, this, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        if (ironSourceErrorA != null && ironSourceErrorA.getErrorCode() != 2020) {
            if (ironSourceErrorA.getErrorCode() == 2040) {
                Me meH = com.ironsource.mediationsdk.r.m().h();
                if (meH != null) {
                    a(new C3326le(new C3483ue(meH)), interfaceC3432re);
                    return;
                }
            } else if (ironSourceErrorA.getErrorCode() == 2030) {
                C3568ze.f39378a.e();
                return;
            }
            f33848b.d(new gi(2, interfaceC3432re, ironSourceErrorA));
            return;
        }
        C3568ze.f39378a.a(context, c3466te, new a(interfaceC3432re));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Me serverResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(serverResponse, "$serverResponse");
        C3568ze.f39378a.a(new C3483ue(serverResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC3432re listener, IronSourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "$listener");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(error, "error");
        listener.a(new C3364ne(error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C3326le c3326le, InterfaceC3432re interfaceC3432re) {
        if (!com.ironsource.mediationsdk.r.m().a(false, c3326le.d())) {
            f33848b.d(new ch(interfaceC3432re, 0));
        } else {
            f33848b.d(new dh(interfaceC3432re, c3326le, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC3432re listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "$listener");
        listener.a(new C3364ne(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, ACExceptionKt.unknownMessage));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC3432re listener, C3326le sdkInitResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "$listener");
        kotlin.jvm.internal.e0.checkNotNullParameter(sdkInitResponse, "$sdkInitResponse");
        listener.a(sdkInitResponse);
    }

    @Override // com.ironsource.Ec
    public void a(Me serverResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(serverResponse, "serverResponse");
        f33848b.a(new ch(serverResponse, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "$error");
        C3568ze.f39378a.b(new C3364ne(error));
    }
}
