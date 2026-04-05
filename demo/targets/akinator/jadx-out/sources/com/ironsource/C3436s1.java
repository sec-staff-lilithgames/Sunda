package com.ironsource;

import android.os.OutcomeReceiver;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.s1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3436s1 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.s1$a */
    public static final class a implements OutcomeReceiver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ zu.d<tu.x0> f38329a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(zu.d<? super tu.x0> dVar) {
            this.f38329a = dVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception error) {
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
            zu.d<tu.x0> dVar = this.f38329a;
            int i10 = tu.z.f87419c;
            dVar.resumeWith(tu.z.m7131constructorimpl(tu.a0.createFailure(error)));
        }

        public void onResult(Object obj) {
            zu.d<tu.x0> dVar = this.f38329a;
            int i10 = tu.z.f87419c;
            dVar.resumeWith(tu.z.m7131constructorimpl(tu.x0.f87415a));
        }
    }

    public static final OutcomeReceiver a(zu.d<? super tu.x0> dVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dVar, SUvoXnn.heYyKmqrrRx);
        return new a(dVar);
    }
}
