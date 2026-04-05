package com.unity3d.ads.adplayer;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.c1;
import av.b;
import av.e;
import bv.f;
import bv.h;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kv.a;
import kv.p;
import org.json.JSONObject;
import tu.a0;
import tu.e0;
import tu.o;
import tu.q;
import tu.s;
import tu.x0;
import tu.z;
import uu.o1;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class FullScreenWebViewDisplay extends ComponentActivity implements IServiceComponent {
    private final o adObject$delegate;
    private final o dispatchers$delegate;
    private String opportunityId = "";
    private final o sendDiagnosticEvent$delegate;
    private Map<String, ? extends Object> showOptions;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1", f = "FullScreenWebViewDisplay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ WebView $webView;
        int label;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$1", f = "FullScreenWebViewDisplay.kt", i = {}, l = {Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05411 extends n implements p {
            int label;
            final /* synthetic */ FullScreenWebViewDisplay this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05411(FullScreenWebViewDisplay fullScreenWebViewDisplay, d<? super C05411> dVar) {
                super(2, dVar);
                this.this$0 = fullScreenWebViewDisplay;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new C05411(this.this$0, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    MutableSharedFlow<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                    DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(this.this$0.opportunityId, this.this$0.showOptions);
                    this.label = 1;
                    if (displayMessages.emit(displayReady, this) == coroutine_suspended) {
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
            public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
                return ((C05411) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$2", f = "FullScreenWebViewDisplay.kt", i = {}, l = {Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends n implements p {
            int label;
            final /* synthetic */ FullScreenWebViewDisplay this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(FullScreenWebViewDisplay fullScreenWebViewDisplay, d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.this$0 = fullScreenWebViewDisplay;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new AnonymousClass2(this.this$0, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    MutableSharedFlow<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                    DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(this.this$0.opportunityId, "WebView failed to attach to FullScreenWebViewDisplay.");
                    this.label = 1;
                    if (displayMessages.emit(displayError, this) == coroutine_suspended) {
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
            public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
                return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WebView webView, FullScreenWebViewDisplay fullScreenWebViewDisplay, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$webView = webView;
            this.this$0 = fullScreenWebViewDisplay;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$webView, this.this$0, dVar);
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            x0 x0Var = x0.f87415a;
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            try {
                ViewParent parent = this.$webView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.$webView);
                }
                this.this$0.setContentView(this.$webView);
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.this$0.getDispatchers().getDefault()), null, null, new C05411(this.this$0, null), 3, null);
            } catch (Throwable th2) {
                if (th2 instanceof CancellationException) {
                    return x0Var;
                }
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.this$0.getDispatchers().getDefault()), null, null, new AnonymousClass2(this.this$0, null), 3, null);
                String message = th2.getMessage();
                if (message == null) {
                    message = "Unknown";
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.getSendDiagnosticEvent(), "native_show_ad_viewer_fullscreen_intent_failed_to_attach_webview", null, o1.mapOf(e0.to(gjnZrsdA.TUUGrTgUqwaTJb, message)), null, this.this$0.getAdObject(), null, 42, null);
                this.this$0.setResult(0);
                this.this$0.finish();
            }
            return x0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$1", f = "FullScreenWebViewDisplay.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37441 extends n implements p {
        int label;

        public C37441(d<? super C37441> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return FullScreenWebViewDisplay.this.new C37441(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MutableSharedFlow<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(FullScreenWebViewDisplay.this.opportunityId, "Opportunity ID not found");
                this.label = 1;
                if (displayMessages.emit(displayError, this) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C37441) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$2", f = "FullScreenWebViewDisplay.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        int label;

        public AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return FullScreenWebViewDisplay.this.new AnonymousClass2(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MutableSharedFlow<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(FullScreenWebViewDisplay.this.opportunityId, "AdPlayer is not active. Could be because show was called while the app was in background.");
                this.label = 1;
                if (displayMessages.emit(displayError, this) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$6", f = "FullScreenWebViewDisplay.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$6, reason: invalid class name */
    public static final class AnonymousClass6 extends n implements p {
        int label;

        public AnonymousClass6(d<? super AnonymousClass6> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return FullScreenWebViewDisplay.this.new AnonymousClass6(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FullScreenWebViewDisplay fullScreenWebViewDisplay = FullScreenWebViewDisplay.this;
                this.label = 1;
                if (fullScreenWebViewDisplay.listenToAdPlayerEvents(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(FullScreenWebViewDisplay.this.getSendDiagnosticEvent(), "native_show_ad_viewer_fullscreen_intent_creation_success_time", null, null, null, FullScreenWebViewDisplay.this.getAdObject(), null, 46, null);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass6) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onDestroy$1", f = "FullScreenWebViewDisplay.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onDestroy$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37451 extends n implements p {
        int label;

        public C37451(d<? super C37451> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return FullScreenWebViewDisplay.this.new C37451(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MutableSharedFlow<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.DisplayDestroyed displayDestroyed = new DisplayMessage.DisplayDestroyed(FullScreenWebViewDisplay.this.opportunityId);
                this.label = 1;
                if (displayMessages.emit(displayDestroyed, this) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C37451) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onPause$1", f = "FullScreenWebViewDisplay.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onPause$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37461 extends n implements p {
        int label;

        public C37461(d<? super C37461> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return FullScreenWebViewDisplay.this.new C37461(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MutableSharedFlow<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.VisibilityChanged visibilityChanged = new DisplayMessage.VisibilityChanged(FullScreenWebViewDisplay.this.opportunityId, false);
                this.label = 1;
                if (displayMessages.emit(visibilityChanged, this) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C37461) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onPause$2", f = "FullScreenWebViewDisplay.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onPause$2, reason: invalid class name and case insensitive filesystem */
    public static final class C37472 extends n implements p {
        int label;

        public C37472(d<? super C37472> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return FullScreenWebViewDisplay.this.new C37472(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MutableSharedFlow<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.DisplayDestroyed displayDestroyed = new DisplayMessage.DisplayDestroyed(FullScreenWebViewDisplay.this.opportunityId);
                this.label = 1;
                if (displayMessages.emit(displayDestroyed, this) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C37472) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onResume$1", f = "FullScreenWebViewDisplay.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onResume$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37481 extends n implements p {
        int label;

        public C37481(d<? super C37481> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return FullScreenWebViewDisplay.this.new C37481(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MutableSharedFlow<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.VisibilityChanged visibilityChanged = new DisplayMessage.VisibilityChanged(FullScreenWebViewDisplay.this.opportunityId, true);
                this.label = 1;
                if (displayMessages.emit(visibilityChanged, this) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C37481) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onWindowFocusChanged$1", f = "FullScreenWebViewDisplay.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onWindowFocusChanged$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37491 extends n implements p {
        final /* synthetic */ boolean $hasFocus;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37491(boolean z10, d<? super C37491> dVar) {
            super(2, dVar);
            this.$hasFocus = z10;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return FullScreenWebViewDisplay.this.new C37491(this.$hasFocus, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MutableSharedFlow<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.FocusChanged focusChanged = new DisplayMessage.FocusChanged(FullScreenWebViewDisplay.this.opportunityId, this.$hasFocus);
                this.label = 1;
                if (displayMessages.emit(focusChanged, this) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C37491) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public FullScreenWebViewDisplay() {
        s sVar = s.f87405e;
        this.sendDiagnosticEvent$delegate = q.lazy(sVar, (a) new FullScreenWebViewDisplay$special$$inlined$inject$default$1(this, ""));
        this.adObject$delegate = q.lazy(new FullScreenWebViewDisplay$adObject$2(this));
        this.dispatchers$delegate = q.lazy(sVar, (a) new FullScreenWebViewDisplay$special$$inlined$inject$default$2(this, ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getAdObject() {
        return (AdObject) this.adObject$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ISDKDispatchers getDispatchers() {
        return (ISDKDispatchers) this.dispatchers$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return (SendDiagnosticEvent) this.sendDiagnosticEvent$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object listenToAdPlayerEvents(d<? super x0> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        final SharedFlow sharedFlowOnSubscription = FlowKt.onSubscription(AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages(), new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this, cancellableContinuationImpl, null));
        FlowKt.launchIn(FlowKt.onEach(new Flow<DisplayMessage>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ FullScreenWebViewDisplay this$0;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2", f = "FullScreenWebViewDisplay.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends bv.d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // bv.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, FullScreenWebViewDisplay fullScreenWebViewDisplay) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = fullScreenWebViewDisplay;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, zu.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r7)
                        goto L52
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        tu.a0.throwOnFailure(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.DisplayMessage r2 = (com.unity3d.ads.adplayer.DisplayMessage) r2
                        java.lang.String r2 = r2.getOpportunityId()
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay r4 = r5.this$0
                        java.lang.String r4 = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.access$getOpportunityId$p(r4)
                        boolean r2 = kotlin.jvm.internal.e0.areEqual(r2, r4)
                        if (r2 == 0) goto L52
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L52
                        return r1
                    L52:
                        tu.x0 r6 = tu.x0.f87415a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super DisplayMessage> flowCollector, d dVar2) {
                Object objCollect = sharedFlowOnSubscription.collect(new AnonymousClass2(flowCollector, this), dVar2);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this, null)), c1.getLifecycleScope(this));
        Object result = cancellableContinuationImpl.getResult();
        if (result == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return result == e.getCOROUTINE_SUSPENDED() ? result : x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadWebView(WebView webView) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getMain()), null, null, new AnonymousClass1(webView, this, null), 3, null);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        CoroutineScope scope;
        Object objM7131constructorimpl;
        Map<String, ? extends Object> map;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("opportunityId");
        if (stringExtra == null) {
            stringExtra = "not_provided";
        }
        this.opportunityId = stringExtra;
        SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_show_ad_viewer_fullscreen_intent_creation_starts", null, o1.mapOf(e0.to("intentOpportunityId", this.opportunityId)), null, getAdObject(), null, 42, null);
        if (kotlin.jvm.internal.e0.areEqual(this.opportunityId, "not_provided")) {
            setResult(0);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new C37441(null), 3, null);
            SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_show_ad_viewer_fullscreen_intent_creation_fails", null, o1.mapOf(e0.to("reason_debug", "no_opportunity_id")), null, null, null, 58, null);
            finish();
            return;
        }
        AdObject adObject = getAdObject();
        AdPlayer adPlayer = adObject != null ? adObject.getAdPlayer() : null;
        if (adPlayer == null || (scope = adPlayer.getScope()) == null || !CoroutineScopeKt.isActive(scope)) {
            setResult(0);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new AnonymousClass2(null), 3, null);
            finish();
            SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_show_ad_viewer_fullscreen_intent_creation_fails", null, o1.mapOf(e0.to("reason_debug", "ad_player_scope_not_active")), null, null, null, 58, null);
            return;
        }
        boolean zHasExtra = getIntent().hasExtra("orientation");
        Boolean boolValueOf = Boolean.valueOf(zHasExtra);
        if (!zHasExtra) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            setRequestedOrientation(getIntent().getIntExtra("orientation", -1));
        }
        String stringExtra2 = getIntent().getStringExtra("showOptions");
        if (stringExtra2 != null) {
            try {
                int i10 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl(JSONObjectExtensionsKt.toBuiltInMap(new JSONObject(stringExtra2)));
            } catch (Throwable th2) {
                int i11 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
            }
            if (z.m7136isFailureimpl(objM7131constructorimpl)) {
                objM7131constructorimpl = null;
            }
            map = (Map) objM7131constructorimpl;
        } else {
            map = null;
        }
        this.showOptions = map;
        BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(this), null, null, new AnonymousClass6(null), 3, null);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        FullScreenWebViewDisplay fullScreenWebViewDisplay;
        SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_show_ad_viewer_fullscreen_intent_destroyed", null, null, null, getAdObject(), null, 46, null);
        if (isFinishing()) {
            fullScreenWebViewDisplay = this;
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, fullScreenWebViewDisplay.new C37451(null), 3, null);
            SendDiagnosticEvent.DefaultImpls.invoke$default(fullScreenWebViewDisplay.getSendDiagnosticEvent(), "native_show_ad_viewer_fullscreen_intent_finishing_on_destroy", null, null, null, fullScreenWebViewDisplay.getAdObject(), null, 46, null);
        } else {
            fullScreenWebViewDisplay = this;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return i10 == 4;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new C37461(null), 3, null);
        if (isFinishing()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new C37472(null), 3, null);
            SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_show_ad_viewer_fullscreen_intent_finishing_on_pause", null, null, null, getAdObject(), null, 46, null);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new C37481(null), 3, null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new C37491(z10, null), 3, null);
    }
}
