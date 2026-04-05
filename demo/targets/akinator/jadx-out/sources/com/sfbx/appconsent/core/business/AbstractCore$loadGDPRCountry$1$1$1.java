package com.sfbx.appconsent.core.business;

import av.e;
import bv.b;
import bv.f;
import bv.n;
import com.sfbx.appconsent.core.model.api.proto.HelloReply;
import io.sfbx.appconsent.logger.ACLogger;
import io.sfbx.appconsent.logger.ACLoggerContract;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.FlowCollector;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.sfbx.appconsent.core.business.AbstractCore$loadGDPRCountry$1$1$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class AbstractCore$loadGDPRCountry$1$1$1 extends n implements q {
    int label;
    final /* synthetic */ AbstractCore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractCore$loadGDPRCountry$1$1$1(AbstractCore abstractCore, d<? super AbstractCore$loadGDPRCountry$1$1$1> dVar) {
        super(3, dVar);
        this.this$0 = abstractCore;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        e.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0.throwOnFailure(obj);
        this.this$0.get_isGDPRState$appconsent_core_prodXchangeRelease().compareAndSet(b.boxBoolean(false), b.boxBoolean(true));
        ACLogger aCLogger = ACLogger.INSTANCE;
        String tag = AbstractCore.tag;
        e0.checkNotNullExpressionValue(tag, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag, "<< loadGDPRCountry", null, 4, null);
        return x0.f87415a;
    }

    @Override // kv.q
    public final Object invoke(FlowCollector<? super HelloReply> flowCollector, Throwable th2, d<? super x0> dVar) {
        return new AbstractCore$loadGDPRCountry$1$1$1(this.this$0, dVar).invokeSuspend(x0.f87415a);
    }
}
