package com.sfbx.appconsent.core.provider;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import av.e;
import bv.f;
import bv.n;
import com.sfbx.appconsent.core.provider.ConsentProvider$evaluateScript$1;
import io.sfbx.appconsent.logger.ACLogger;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$evaluateScript$1", f = "ConsentProvider.kt", i = {}, l = {678}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class ConsentProvider$evaluateScript$1 extends n implements p {
    final /* synthetic */ String $script;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ConsentProvider this$0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$evaluateScript$1$1", f = "ConsentProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$evaluateScript$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ ProducerScope<String> $$this$channelFlow;
        final /* synthetic */ String $script;
        int label;
        final /* synthetic */ ConsentProvider this$0;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$evaluateScript$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05041 extends f0 implements kv.a {
            final /* synthetic */ ConsentProvider this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05041(ConsentProvider consentProvider) {
                super(0);
                this.this$0 = consentProvider;
            }

            @Override // kv.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m3451invoke();
                return x0.f87415a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m3451invoke() {
                this.this$0.tryToInstantiateWebViewComponent$appconsent_core_prodXchangeRelease();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ConsentProvider consentProvider, String str, ProducerScope<? super String> producerScope, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = consentProvider;
            this.$script = str;
            this.$$this$channelFlow = producerScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ProducerScope producerScope, String str) {
            if (str == null) {
                str = "";
            }
            ChannelsKt.trySendBlocking(producerScope, str);
            SendChannel.DefaultImpls.close$default(producerScope.getChannel(), null, 1, null);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$script, this.$$this$channelFlow, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            final ProducerScope<String> producerScope = this.$$this$channelFlow;
            ValueCallback<String> valueCallback = new ValueCallback() { // from class: com.sfbx.appconsent.core.provider.b
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj2) {
                    ConsentProvider$evaluateScript$1.AnonymousClass1.invokeSuspend$lambda$0(producerScope, (String) obj2);
                }
            };
            try {
                if (this.this$0.getMWebView() == null) {
                    ConsentProvider consentProvider = this.this$0;
                    consentProvider.executeOnMainThread$appconsent_core_prodXchangeRelease(new C05041(consentProvider));
                }
                WebView mWebView = this.this$0.getMWebView();
                if (mWebView != null) {
                    mWebView.evaluateJavascript(this.$script, valueCallback);
                }
            } catch (Throwable th2) {
                ACLogger aCLogger = ACLogger.INSTANCE;
                String tag = ConsentProvider.tag;
                e0.checkNotNullExpressionValue(tag, "tag");
                aCLogger.e(tag, "It seems that a problem occurred when evaluating the JS script", th2);
                valueCallback.onReceiveValue(null);
            }
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$evaluateScript$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements kv.a {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3452invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3452invoke();
            return x0.f87415a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentProvider$evaluateScript$1(ConsentProvider consentProvider, String str, d<? super ConsentProvider$evaluateScript$1> dVar) {
        super(2, dVar);
        this.this$0 = consentProvider;
        this.$script = str;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        ConsentProvider$evaluateScript$1 consentProvider$evaluateScript$1 = new ConsentProvider$evaluateScript$1(this.this$0, this.$script, dVar);
        consentProvider$evaluateScript$1.L$0 = obj;
        return consentProvider$evaluateScript$1;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(producerScope, Dispatchers.getMain(), null, new AnonymousClass1(this.this$0, this.$script, producerScope, null), 2, null);
            AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(ProducerScope<? super String> producerScope, d<? super x0> dVar) {
        return ((ConsentProvider$evaluateScript$1) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
