package com.sfbx.appconsentv3.ui.ui.introduction;

import androidx.lifecycle.h3;
import androidx.lifecycle.l1;
import androidx.lifecycle.t1;
import av.e;
import bv.b;
import bv.f;
import bv.n;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import com.sfbx.appconsent.core.AppConsentCore;
import com.sfbx.appconsent.core.AppConsentCoreContract;
import com.sfbx.appconsent.core.model.Notice;
import com.sfbx.appconsent.core.model.api.proto.Consentable;
import com.sfbx.appconsent.core.model.api.proto.HelloReply;
import com.sfbx.appconsent.core.model.api.proto.Stack;
import com.sfbx.appconsent.core.model.api.proto.VendorList;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.model.QrCodeData;
import com.sfbx.appconsentv3.ui.model.Response;
import com.sfbx.appconsentv3.ui.ui.components.widget.ACUnorderedCategoryListWidget;
import com.sfbx.appconsentv3.ui.viewmodel.AbstractTrackingViewModel;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import io.sfbx.appconsent.logger.ACLogger;
import io.sfbx.appconsent.logger.ACLoggerContract;
import j1.o2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;
import uu.o0;
import uu.v0;
import uu.y0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class IntroductionViewModel extends AbstractTrackingViewModel {
    private final t1 _acceptAll;
    private final t1 _examplesDedicatedUsageLiveData;
    private final t1 _examplesTechnicalCollectionsMutableLiveData;
    private final t1 _examplesUsageMutableLiveData;
    private final t1 _examplesUsageOfDataMutableLiveData;
    private final MutableSharedFlow<Response<QrCodeData>> _qrCode;
    private final t1 _refuseAll;
    private final l1 acceptAll;
    private final AppConsentTheme appConsentTheme;
    private final l1 examplesDedicatedUsageLiveData;
    private final l1 examplesTechnicalCollectionsMutableLiveData;
    private final l1 examplesUsageMutableLiveData;
    private final l1 examplesUsageOfDataMutableLiveData;
    private QrCodeData lastQrCodeData;
    private long lastQrCodeRequestTime;
    private final SharedFlow<Response<QrCodeData>> qrCode;
    private boolean qrCodeShowing;
    private final l1 refuseAll;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$acceptAll$1", f = "IntroductionViewModel.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$acceptAll$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ boolean $excludeGeoloc;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$acceptAll$1$1", f = "IntroductionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$acceptAll$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05231 extends n implements q {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IntroductionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05231(IntroductionViewModel introductionViewModel, d<? super C05231> dVar) {
                super(3, dVar);
                this.this$0 = introductionViewModel;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                this.this$0._acceptAll.setValue(new Response.Error((Throwable) this.L$0, null, 2, null));
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super Notice> flowCollector, Throwable th2, d<? super x0> dVar) {
                C05231 c05231 = new C05231(this.this$0, dVar);
                c05231.L$0 = th2;
                return c05231.invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$acceptAll$1$2", f = "IntroductionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$acceptAll$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends n implements p {
            final /* synthetic */ boolean $excludeGeoloc;
            int label;
            final /* synthetic */ IntroductionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(IntroductionViewModel introductionViewModel, boolean z10, d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.this$0 = introductionViewModel;
                this.$excludeGeoloc = z10;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new AnonymousClass2(this.this$0, this.$excludeGeoloc, dVar);
            }

            @Override // kv.p
            public final Object invoke(Notice notice, d<? super Flow<Boolean>> dVar) {
                return ((AnonymousClass2) create(notice, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return this.this$0.getAppConsentCore().acceptAllAndQuit(this.$excludeGeoloc);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$acceptAll$1$3", f = "IntroductionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$acceptAll$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends n implements q {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IntroductionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(IntroductionViewModel introductionViewModel, d<? super AnonymousClass3> dVar) {
                super(3, dVar);
                this.this$0 = introductionViewModel;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                this.this$0._acceptAll.setValue(new Response.Error((Throwable) this.L$0, null, 2, null));
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, d<? super x0> dVar) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, dVar);
                anonymousClass3.L$0 = th2;
                return anonymousClass3.invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$acceptAll$1$4", f = "IntroductionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$acceptAll$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends n implements p {
            int label;
            final /* synthetic */ IntroductionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(IntroductionViewModel introductionViewModel, d<? super AnonymousClass4> dVar) {
                super(2, dVar);
                this.this$0 = introductionViewModel;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new AnonymousClass4(this.this$0, dVar);
            }

            @Override // kv.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (d<? super Flow<Boolean>>) obj2);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return this.this$0.getAppConsentCore().saveConsents();
            }

            public final Object invoke(boolean z10, d<? super Flow<Boolean>> dVar) {
                return ((AnonymousClass4) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$acceptAll$1$5", f = "IntroductionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$acceptAll$1$5, reason: invalid class name */
        public static final class AnonymousClass5 extends n implements q {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IntroductionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(IntroductionViewModel introductionViewModel, d<? super AnonymousClass5> dVar) {
                super(3, dVar);
                this.this$0 = introductionViewModel;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                this.this$0._acceptAll.setValue(new Response.Error((Throwable) this.L$0, null, 2, null));
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, d<? super x0> dVar) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, dVar);
                anonymousClass5.L$0 = th2;
                return anonymousClass5.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z10, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$excludeGeoloc = z10;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return IntroductionViewModel.this.new AnonymousClass1(this.$excludeGeoloc, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                IntroductionViewModel.this._acceptAll.setValue(new Response.Loading());
                Flow flowM5171catch = FlowKt.m5171catch(FlowKt.flatMapConcat(FlowKt.m5171catch(FlowKt.flatMapConcat(FlowKt.m5171catch(IntroductionViewModel.this.getAppConsentCore().getNotice(true), new C05231(IntroductionViewModel.this, null)), new AnonymousClass2(IntroductionViewModel.this, this.$excludeGeoloc, null)), new AnonymousClass3(IntroductionViewModel.this, null)), new AnonymousClass4(IntroductionViewModel.this, null)), new AnonymousClass5(IntroductionViewModel.this, null));
                final IntroductionViewModel introductionViewModel = IntroductionViewModel.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel.acceptAll.1.6
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit(((Boolean) obj2).booleanValue(), (d<? super x0>) dVar);
                    }

                    public final Object emit(boolean z10, d<? super x0> dVar) {
                        introductionViewModel._acceptAll.setValue(new Response.Success(b.boxBoolean(z10)));
                        return x0.f87415a;
                    }
                };
                this.label = 1;
                if (flowM5171catch.collect(flowCollector, this) == coroutine_suspended) {
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
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$buildDedicatedUsageCategory$1", f = "IntroductionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$buildDedicatedUsageCategory$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37131 extends n implements p {
        final /* synthetic */ ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUI $categoryUi;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37131(ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUI categoryUI, d<? super C37131> dVar) {
            super(2, dVar);
            this.$categoryUi = categoryUI;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return IntroductionViewModel.this.new C37131(this.$categoryUi, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            IntroductionViewModel.this.get_examplesDedicatedUsageLiveData$appconsent_ui_v3_prodXchangeRelease().postValue(new Response.Success(this.$categoryUi));
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C37131) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$buildExamplesUsageText$1", f = "IntroductionViewModel.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$buildExamplesUsageText$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37141 extends n implements p {
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$buildExamplesUsageText$1$1", f = "IntroductionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$buildExamplesUsageText$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05241 extends n implements q {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IntroductionViewModel this$0;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$buildExamplesUsageText$1$1$1", f = "IntroductionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$buildExamplesUsageText$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C05251 extends n implements p {
                final /* synthetic */ Throwable $it;
                int label;
                final /* synthetic */ IntroductionViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05251(IntroductionViewModel introductionViewModel, Throwable th2, d<? super C05251> dVar) {
                    super(2, dVar);
                    this.this$0 = introductionViewModel;
                    this.$it = th2;
                }

                @Override // bv.a
                public final d<x0> create(Object obj, d<?> dVar) {
                    return new C05251(this.this$0, this.$it, dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    e.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                    this.this$0.get_examplesUsageMutableLiveData$appconsent_ui_v3_prodXchangeRelease().postValue(new Response.Error(this.$it, null, 2, null));
                    return x0.f87415a;
                }

                @Override // kv.p
                public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
                    return ((C05251) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05241(IntroductionViewModel introductionViewModel, d<? super C05241> dVar) {
                super(3, dVar);
                this.this$0 = introductionViewModel;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default(h3.getViewModelScope(this.this$0), null, null, new C05251(this.this$0, (Throwable) this.L$0, null), 3, null);
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super HelloReply> flowCollector, Throwable th2, d<? super x0> dVar) {
                C05241 c05241 = new C05241(this.this$0, dVar);
                c05241.L$0 = th2;
                return c05241.invokeSuspend(x0.f87415a);
            }
        }

        public C37141(d<? super C37141> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return IntroductionViewModel.this.new C37141(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Flow flowM5171catch = FlowKt.m5171catch(IntroductionViewModel.this.getAppConsentCore().getHelloReply(true), new C05241(IntroductionViewModel.this, null));
                final IntroductionViewModel introductionViewModel = IntroductionViewModel.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel.buildExamplesUsageText.1.2

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$buildExamplesUsageText$1$2$1", f = "IntroductionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$buildExamplesUsageText$1$2$1, reason: invalid class name and collision with other inner class name */
                    public static final class C05261 extends n implements p {
                        final /* synthetic */ HelloReply $it;
                        int label;
                        final /* synthetic */ IntroductionViewModel this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C05261(HelloReply helloReply, IntroductionViewModel introductionViewModel, d<? super C05261> dVar) {
                            super(2, dVar);
                            this.$it = helloReply;
                            this.this$0 = introductionViewModel;
                        }

                        @Override // bv.a
                        public final d<x0> create(Object obj, d<?> dVar) {
                            return new C05261(this.$it, this.this$0, dVar);
                        }

                        @Override // bv.a
                        public final Object invokeSuspend(Object obj) {
                            e.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            a0.throwOnFailure(obj);
                            VendorList vendorList = this.$it.getVendorList();
                            if (vendorList == null || vendorList.getConsentables().isEmpty()) {
                                this.this$0.get_examplesUsageMutableLiveData$appconsent_ui_v3_prodXchangeRelease().postValue(new Response.Success(b.boxBoolean(false)));
                            } else {
                                this.this$0.get_examplesUsageMutableLiveData$appconsent_ui_v3_prodXchangeRelease().postValue(new Response.Success(b.boxBoolean(true)));
                                this.this$0.buildUsageOfDataCategory(vendorList);
                                this.this$0.buildTechnicalCollectionsCategory(vendorList);
                                this.this$0.buildDedicatedUsageCategory(vendorList);
                            }
                            return x0.f87415a;
                        }

                        @Override // kv.p
                        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
                            return ((C05261) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((HelloReply) obj2, (d<? super x0>) dVar);
                    }

                    public final Object emit(HelloReply helloReply, d<? super x0> dVar) {
                        BuildersKt__Builders_commonKt.launch$default(h3.getViewModelScope(introductionViewModel), null, null, new C05261(helloReply, introductionViewModel, null), 3, null);
                        return x0.f87415a;
                    }
                };
                this.label = 1;
                if (flowM5171catch.collect(flowCollector, this) == coroutine_suspended) {
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
            return ((C37141) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$buildTechnicalCollectionsCategory$3", f = "IntroductionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$buildTechnicalCollectionsCategory$3, reason: invalid class name */
    public static final class AnonymousClass3 extends n implements p {
        final /* synthetic */ ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUI $categoryUI;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUI categoryUI, d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$categoryUI = categoryUI;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return IntroductionViewModel.this.new AnonymousClass3(this.$categoryUI, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            IntroductionViewModel.this.get_examplesTechnicalCollectionsMutableLiveData$appconsent_ui_v3_prodXchangeRelease().postValue(new Response.Success(this.$categoryUI));
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass3) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$buildUsageOfDataCategory$1", f = "IntroductionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$buildUsageOfDataCategory$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37151 extends n implements p {
        final /* synthetic */ ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUI $categoryUI;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37151(ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUI categoryUI, d<? super C37151> dVar) {
            super(2, dVar);
            this.$categoryUI = categoryUI;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return IntroductionViewModel.this.new C37151(this.$categoryUI, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            IntroductionViewModel.this.get_examplesUsageOfDataMutableLiveData$appconsent_ui_v3_prodXchangeRelease().postValue(new Response.Success(this.$categoryUI));
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C37151) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$getQrCode$1", f = "IntroductionViewModel.kt", i = {}, l = {Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 146}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$getQrCode$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37161 extends n implements p {
        final /* synthetic */ boolean $forced;
        final /* synthetic */ QrCodeData $qrCodeData;
        int label;
        final /* synthetic */ IntroductionViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37161(boolean z10, IntroductionViewModel introductionViewModel, QrCodeData qrCodeData, d<? super C37161> dVar) {
            super(2, dVar);
            this.$forced = z10;
            this.this$0 = introductionViewModel;
            this.$qrCodeData = qrCodeData;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new C37161(this.$forced, this.this$0, this.$qrCodeData, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
        
            if (r10.emit(r1, r9) == r0) goto L17;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                tu.a0.throwOnFailure(r10)
                goto L72
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                tu.a0.throwOnFailure(r10)
                goto L36
            L1e:
                tu.a0.throwOnFailure(r10)
                com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$getQrCode$1$subscriberPresent$1 r10 = new com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$getQrCode$1$subscriberPresent$1
                com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel r1 = r9.this$0
                boolean r4 = r9.$forced
                r5 = 0
                r10.<init>(r1, r4, r5)
                r9.label = r3
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r10 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r3, r10, r9)
                if (r10 != r0) goto L36
                goto L65
            L36:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r1 = r9.$forced
                java.lang.Boolean r1 = bv.b.boxBoolean(r1)
                boolean r10 = kotlin.jvm.internal.e0.areEqual(r10, r1)
                if (r10 == 0) goto L66
                io.sfbx.appconsent.logger.ACLogger r3 = io.sfbx.appconsent.logger.ACLogger.INSTANCE
                r7 = 4
                r8 = 0
                java.lang.String r4 = "IntroductionViewModel"
                java.lang.String r5 = "subscriber présent, on emit value"
                r6 = 0
                io.sfbx.appconsent.logger.ACLoggerContract.DefaultImpls.d$default(r3, r4, r5, r6, r7, r8)
                com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel r10 = r9.this$0
                kotlinx.coroutines.flow.MutableSharedFlow r10 = com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel.access$get_qrCode$p(r10)
                com.sfbx.appconsentv3.ui.model.Response$Success r1 = new com.sfbx.appconsentv3.ui.model.Response$Success
                com.sfbx.appconsentv3.ui.model.QrCodeData r3 = r9.$qrCodeData
                r1.<init>(r3)
                r9.label = r2
                java.lang.Object r10 = r10.emit(r1, r9)
                if (r10 != r0) goto L72
            L65:
                return r0
            L66:
                io.sfbx.appconsent.logger.ACLogger r1 = io.sfbx.appconsent.logger.ACLogger.INSTANCE
                r5 = 4
                r6 = 0
                java.lang.String r2 = "IntroductionViewModel"
                java.lang.String r3 = "No subscriber... timeout has been raised"
                r4 = 0
                io.sfbx.appconsent.logger.ACLoggerContract.DefaultImpls.d$default(r1, r2, r3, r4, r5, r6)
            L72:
                tu.x0 r10 = tu.x0.f87415a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel.C37161.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C37161) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$getQrCode$2", f = "IntroductionViewModel.kt", i = {0}, l = {154, 156, 169}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$getQrCode$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ String $data;
        final /* synthetic */ String $description;
        final /* synthetic */ String $title;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, String str3, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$data = str;
            this.$title = str2;
            this.$description = str3;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = IntroductionViewModel.this.new AnonymousClass2(this.$data, this.$title, this.$description, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                tu.x0 r2 = tu.x0.f87415a
                r3 = 3
                r4 = 1
                r5 = 2
                r6 = 0
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L27
                if (r1 == r5) goto L21
                if (r1 != r3) goto L19
                tu.a0.throwOnFailure(r11)
                goto L9c
            L19:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L21:
                tu.a0.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L25
                goto L6e
            L25:
                r11 = move-exception
                goto L73
            L27:
                java.lang.Object r1 = r10.L$0
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                tu.a0.throwOnFailure(r11)
                goto L4c
            L2f:
                tu.a0.throwOnFailure(r11)
                java.lang.Object r11 = r10.L$0
                kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
                com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel r1 = com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel.this
                kotlinx.coroutines.flow.MutableSharedFlow r1 = com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel.access$get_qrCode$p(r1)
                com.sfbx.appconsentv3.ui.model.Response$Loading r7 = new com.sfbx.appconsentv3.ui.model.Response$Loading
                r7.<init>()
                r10.L$0 = r11
                r10.label = r4
                java.lang.Object r11 = r1.emit(r7, r10)
                if (r11 != r0) goto L4c
                goto L9b
            L4c:
                com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel r11 = com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel.this
                java.lang.String r1 = r10.$data
                java.lang.String r4 = r10.$title
                java.lang.String r7 = r10.$description
                int r8 = tu.z.f87419c     // Catch: java.lang.Throwable -> L25
                com.sfbx.appconsent.core.AppConsentCore r8 = com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel.access$getAppConsentCore(r11)     // Catch: java.lang.Throwable -> L25
                kotlinx.coroutines.flow.Flow r8 = r8.generateQrCode(r1)     // Catch: java.lang.Throwable -> L25
                com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$getQrCode$2$1$1 r9 = new com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$getQrCode$2$1$1     // Catch: java.lang.Throwable -> L25
                r9.<init>()     // Catch: java.lang.Throwable -> L25
                r10.L$0 = r6     // Catch: java.lang.Throwable -> L25
                r10.label = r5     // Catch: java.lang.Throwable -> L25
                java.lang.Object r11 = r8.collect(r9, r10)     // Catch: java.lang.Throwable -> L25
                if (r11 != r0) goto L6e
                goto L9b
            L6e:
                java.lang.Object r11 = tu.z.m7131constructorimpl(r2)     // Catch: java.lang.Throwable -> L25
                goto L7d
            L73:
                int r1 = tu.z.f87419c
                java.lang.Object r11 = tu.a0.createFailure(r11)
                java.lang.Object r11 = tu.z.m7131constructorimpl(r11)
            L7d:
                com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel r1 = com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel.this
                java.lang.Throwable r4 = tu.z.m7134exceptionOrNullimpl(r11)
                if (r4 == 0) goto L9c
                com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel.access$setLastQrCodeData$p(r1, r6)
                kotlinx.coroutines.flow.MutableSharedFlow r1 = com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel.access$get_qrCode$p(r1)
                com.sfbx.appconsentv3.ui.model.Response$Error r7 = new com.sfbx.appconsentv3.ui.model.Response$Error
                r7.<init>(r4, r6, r5, r6)
                r10.L$0 = r11
                r10.label = r3
                java.lang.Object r11 = r1.emit(r7, r10)
                if (r11 != r0) goto L9c
            L9b:
                return r0
            L9c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$refuseAll$1", f = "IntroductionViewModel.kt", i = {}, l = {328}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$refuseAll$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37171 extends n implements p {
        final /* synthetic */ boolean $continueWithoutAccepting;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$refuseAll$1$1", f = "IntroductionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$refuseAll$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05271 extends n implements q {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IntroductionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05271(IntroductionViewModel introductionViewModel, d<? super C05271> dVar) {
                super(3, dVar);
                this.this$0 = introductionViewModel;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                this.this$0._refuseAll.setValue(new Response.Error((Throwable) this.L$0, null, 2, null));
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super Notice> flowCollector, Throwable th2, d<? super x0> dVar) {
                C05271 c05271 = new C05271(this.this$0, dVar);
                c05271.L$0 = th2;
                return c05271.invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$refuseAll$1$2", f = "IntroductionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$refuseAll$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends n implements p {
            final /* synthetic */ boolean $continueWithoutAccepting;
            int label;
            final /* synthetic */ IntroductionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(IntroductionViewModel introductionViewModel, boolean z10, d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.this$0 = introductionViewModel;
                this.$continueWithoutAccepting = z10;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new AnonymousClass2(this.this$0, this.$continueWithoutAccepting, dVar);
            }

            @Override // kv.p
            public final Object invoke(Notice notice, d<? super Flow<Boolean>> dVar) {
                return ((AnonymousClass2) create(notice, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return AppConsentCoreContract.DefaultImpls.refuseAllAndQuit$default(this.this$0.getAppConsentCore(), false, this.$continueWithoutAccepting, 1, null);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$refuseAll$1$3", f = "IntroductionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$refuseAll$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends n implements q {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IntroductionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(IntroductionViewModel introductionViewModel, d<? super AnonymousClass3> dVar) {
                super(3, dVar);
                this.this$0 = introductionViewModel;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                this.this$0._refuseAll.setValue(new Response.Error((Throwable) this.L$0, null, 2, null));
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, d<? super x0> dVar) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, dVar);
                anonymousClass3.L$0 = th2;
                return anonymousClass3.invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$refuseAll$1$4", f = "IntroductionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$refuseAll$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends n implements p {
            int label;
            final /* synthetic */ IntroductionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(IntroductionViewModel introductionViewModel, d<? super AnonymousClass4> dVar) {
                super(2, dVar);
                this.this$0 = introductionViewModel;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new AnonymousClass4(this.this$0, dVar);
            }

            @Override // kv.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (d<? super Flow<Boolean>>) obj2);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return this.this$0.getAppConsentCore().saveConsents();
            }

            public final Object invoke(boolean z10, d<? super Flow<Boolean>> dVar) {
                return ((AnonymousClass4) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$refuseAll$1$5", f = "IntroductionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel$refuseAll$1$5, reason: invalid class name */
        public static final class AnonymousClass5 extends n implements q {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IntroductionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(IntroductionViewModel introductionViewModel, d<? super AnonymousClass5> dVar) {
                super(3, dVar);
                this.this$0 = introductionViewModel;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                this.this$0._refuseAll.setValue(new Response.Error((Throwable) this.L$0, null, 2, null));
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, d<? super x0> dVar) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, dVar);
                anonymousClass5.L$0 = th2;
                return anonymousClass5.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37171(boolean z10, d<? super C37171> dVar) {
            super(2, dVar);
            this.$continueWithoutAccepting = z10;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return IntroductionViewModel.this.new C37171(this.$continueWithoutAccepting, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                IntroductionViewModel.this._refuseAll.setValue(new Response.Loading());
                Flow flowM5171catch = FlowKt.m5171catch(FlowKt.flatMapConcat(FlowKt.m5171catch(FlowKt.flatMapConcat(FlowKt.m5171catch(IntroductionViewModel.this.getAppConsentCore().getNotice(true), new C05271(IntroductionViewModel.this, null)), new AnonymousClass2(IntroductionViewModel.this, this.$continueWithoutAccepting, null)), new AnonymousClass3(IntroductionViewModel.this, null)), new AnonymousClass4(IntroductionViewModel.this, null)), new AnonymousClass5(IntroductionViewModel.this, null));
                final IntroductionViewModel introductionViewModel = IntroductionViewModel.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel.refuseAll.1.6
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit(((Boolean) obj2).booleanValue(), (d<? super x0>) dVar);
                    }

                    public final Object emit(boolean z10, d<? super x0> dVar) {
                        introductionViewModel._refuseAll.setValue(new Response.Success(b.boxBoolean(z10)));
                        return x0.f87415a;
                    }
                };
                this.label = 1;
                if (flowM5171catch.collect(flowCollector, this) == coroutine_suspended) {
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
            return ((C37171) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroductionViewModel(AppConsentTheme appConsentTheme, AppConsentCore appConsentCore) {
        super(appConsentCore);
        e0.checkNotNullParameter(appConsentTheme, "appConsentTheme");
        e0.checkNotNullParameter(appConsentCore, "appConsentCore");
        this.appConsentTheme = appConsentTheme;
        t1 t1Var = new t1();
        this._acceptAll = t1Var;
        this.acceptAll = t1Var;
        t1 t1Var2 = new t1();
        this._examplesUsageMutableLiveData = t1Var2;
        this.examplesUsageMutableLiveData = t1Var2;
        t1 t1Var3 = new t1();
        this._examplesUsageOfDataMutableLiveData = t1Var3;
        this.examplesUsageOfDataMutableLiveData = t1Var3;
        t1 t1Var4 = new t1();
        this._examplesTechnicalCollectionsMutableLiveData = t1Var4;
        this.examplesTechnicalCollectionsMutableLiveData = t1Var4;
        t1 t1Var5 = new t1();
        this._examplesDedicatedUsageLiveData = t1Var5;
        this.examplesDedicatedUsageLiveData = t1Var5;
        MutableSharedFlow<Response<QrCodeData>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this._qrCode = mutableSharedFlowMutableSharedFlow$default;
        this.qrCode = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        t1 t1Var6 = new t1();
        this._refuseAll = t1Var6;
        this.refuseAll = t1Var6;
    }

    public static /* synthetic */ void acceptAll$default(IntroductionViewModel introductionViewModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        introductionViewModel.acceptAll(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void buildDedicatedUsageCategory(VendorList vendorList) {
        List<Consentable> externalPurposes = vendorList.getExternalPurposes();
        if (externalPurposes.isEmpty()) {
            return;
        }
        String string = this.appConsentTheme.getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_consentable_list_label_extra);
        e0.checkNotNullExpressionValue(string, "appConsentTheme.contextL…entable_list_label_extra)");
        BuildersKt__Builders_commonKt.launch$default(h3.getViewModelScope(this), null, null, new C37131(new ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUI(string, extractNamesFromConsentables(externalPurposes), ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUIPosition.LAST, Integer.valueOf(this.appConsentTheme.getTextColor$appconsent_ui_v3_prodXchangeRelease())), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void buildTechnicalCollectionsCategory(VendorList vendorList) {
        String stack1Name = vendorList.getStack1Name(this.appConsentTheme.getLanguage$appconsent_ui_v3_prodXchangeRelease());
        String purpose1Name = vendorList.getPurpose1Name(this.appConsentTheme.getLanguage$appconsent_ui_v3_prodXchangeRelease());
        List<String> listExtractNamesFromConsentables = extractNamesFromConsentables(vendorList.getFeaturesAndSpecialFeaturesNotIntoStacks());
        ArrayList arrayList = new ArrayList();
        if (stack1Name != null) {
            arrayList.add(stack1Name);
        }
        if (purpose1Name != null) {
            arrayList.add(purpose1Name);
        }
        List<String> list = listExtractNamesFromConsentables;
        if (!list.isEmpty()) {
            arrayList.addAll(list);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        String string = this.appConsentTheme.getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_introduction_example_usage_technical_means_collection);
        e0.checkNotNullExpressionValue(string, "appConsentTheme.contextL…chnical_means_collection)");
        BuildersKt__Builders_commonKt.launch$default(h3.getViewModelScope(this), null, null, new AnonymousClass3(new ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUI(string, arrayList, ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUIPosition.SECOND, Integer.valueOf(this.appConsentTheme.getTextColor$appconsent_ui_v3_prodXchangeRelease())), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void buildUsageOfDataCategory(VendorList vendorList) {
        List<Stack> stacksExceptStack1 = vendorList.getStacksExceptStack1();
        List<String> listExtractNamesFromConsentables = extractNamesFromConsentables(vendorList.getPurposesExceptPurpose1AndPurposesFromStacksOtherThanStack1());
        List listPlus = y0.plus((Collection) y0.plus((Collection) extractNamesFromStacks(stacksExceptStack1), (Iterable) listExtractNamesFromConsentables), (Iterable) extractNamesFromConsentables(vendorList.getSpecialPurposes()));
        if (listPlus.isEmpty()) {
            return;
        }
        String string = this.appConsentTheme.getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_introduction_example_usage_use_of_your_data);
        e0.checkNotNullExpressionValue(string, "appConsentTheme.contextL…e_usage_use_of_your_data)");
        BuildersKt__Builders_commonKt.launch$default(h3.getViewModelScope(this), null, null, new C37151(new ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUI(string, listPlus, ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUIPosition.FIRST, Integer.valueOf(this.appConsentTheme.getTextColor$appconsent_ui_v3_prodXchangeRelease())), null), 3, null);
    }

    private final List<String> extractNamesFromConsentables(List<Consentable> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            v0.addAll(arrayList, o0.listOf(((Consentable) it.next()).getNameAsString(this.appConsentTheme.getLanguage$appconsent_ui_v3_prodXchangeRelease())));
        }
        return arrayList;
    }

    private final List<String> extractNamesFromStacks(List<Stack> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            v0.addAll(arrayList, o0.listOf(((Stack) it.next()).getNameAsString(this.appConsentTheme.getLanguage$appconsent_ui_v3_prodXchangeRelease())));
        }
        return arrayList;
    }

    public static /* synthetic */ void getQrCode$default(IntroductionViewModel introductionViewModel, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        introductionViewModel.getQrCode(str, str2, str3, z10);
    }

    public static /* synthetic */ void get_examplesDedicatedUsageLiveData$appconsent_ui_v3_prodXchangeRelease$annotations() {
    }

    public static /* synthetic */ void get_examplesTechnicalCollectionsMutableLiveData$appconsent_ui_v3_prodXchangeRelease$annotations() {
    }

    public static /* synthetic */ void get_examplesUsageMutableLiveData$appconsent_ui_v3_prodXchangeRelease$annotations() {
    }

    public static /* synthetic */ void get_examplesUsageOfDataMutableLiveData$appconsent_ui_v3_prodXchangeRelease$annotations() {
    }

    public final void acceptAll(boolean z10) {
        BuildersKt__Builders_commonKt.launch$default(h3.getViewModelScope(this), null, null, new AnonymousClass1(z10, null), 3, null);
    }

    public final void buildExamplesUsageText() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C37141(null), 3, null);
    }

    public final void displayLastQrCode() {
        QrCodeData qrCodeData = this.lastQrCodeData;
        String title = qrCodeData != null ? qrCodeData.getTitle() : null;
        QrCodeData qrCodeData2 = this.lastQrCodeData;
        String description = qrCodeData2 != null ? qrCodeData2.getDescription() : null;
        QrCodeData qrCodeData3 = this.lastQrCodeData;
        String url = qrCodeData3 != null ? qrCodeData3.getUrl() : null;
        if (qrCodeData == null || title == null || title.length() == 0 || description == null || description.length() == 0 || url == null || url.length() == 0) {
            return;
        }
        e0.checkNotNull(title);
        e0.checkNotNull(description);
        e0.checkNotNull(url);
        getQrCode(title, description, url, true);
    }

    public final l1 getAcceptAll() {
        return this.acceptAll;
    }

    public final l1 getExamplesDedicatedUsageLiveData() {
        return this.examplesDedicatedUsageLiveData;
    }

    public final l1 getExamplesTechnicalCollectionsMutableLiveData() {
        return this.examplesTechnicalCollectionsMutableLiveData;
    }

    public final l1 getExamplesUsageMutableLiveData() {
        return this.examplesUsageMutableLiveData;
    }

    public final l1 getExamplesUsageOfDataMutableLiveData() {
        return this.examplesUsageOfDataMutableLiveData;
    }

    public final SharedFlow<Response<QrCodeData>> getQrCode() {
        return this.qrCode;
    }

    public final boolean getQrCodeShowing() {
        return this.qrCodeShowing;
    }

    public final l1 getRefuseAll() {
        return this.refuseAll;
    }

    public final t1 get_examplesDedicatedUsageLiveData$appconsent_ui_v3_prodXchangeRelease() {
        return this._examplesDedicatedUsageLiveData;
    }

    public final t1 get_examplesTechnicalCollectionsMutableLiveData$appconsent_ui_v3_prodXchangeRelease() {
        return this._examplesTechnicalCollectionsMutableLiveData;
    }

    public final t1 get_examplesUsageMutableLiveData$appconsent_ui_v3_prodXchangeRelease() {
        return this._examplesUsageMutableLiveData;
    }

    public final t1 get_examplesUsageOfDataMutableLiveData$appconsent_ui_v3_prodXchangeRelease() {
        return this._examplesUsageOfDataMutableLiveData;
    }

    public final void notifyDisplayMetric() {
        getAppConsentCore().sendDisplayMetric();
    }

    public final void qrCodeDismissed() {
        this.qrCodeShowing = false;
        ACLoggerContract.DefaultImpls.d$default(ACLogger.INSTANCE, "IntroductionViewModel", QGjYBESwAiCc.GVgKgrnRlgPY, null, 4, null);
    }

    public final void qrCodePopupDisplayed() {
        this.qrCodeShowing = true;
        ACLoggerContract.DefaultImpls.d$default(ACLogger.INSTANCE, "IntroductionViewModel", "qrcode displayed", null, 4, null);
    }

    public final void refuseAll(boolean z10) {
        BuildersKt__Builders_commonKt.launch$default(h3.getViewModelScope(this), null, null, new C37171(z10, null), 3, null);
    }

    public final void setQrCodeShowing(boolean z10) {
        this.qrCodeShowing = z10;
    }

    public final void getQrCode(String title, String str, String data, boolean z10) {
        e0.checkNotNullParameter(title, "title");
        e0.checkNotNullParameter(str, LJjmO.lXqO);
        e0.checkNotNullParameter(data, "data");
        ACLogger aCLogger = ACLogger.INSTANCE;
        ACLoggerContract.DefaultImpls.d$default(aCLogger, "IntroductionViewModel", o2.n("getQrCode called with forced = ", z10), null, 4, null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastQrCodeRequestTime < 1000 && !z10) {
            ACLoggerContract.DefaultImpls.i$default(aCLogger, "IntroductionViewModel", "QrCode load request ignored due to debounce", null, 4, null);
            return;
        }
        ACLoggerContract.DefaultImpls.d$default(aCLogger, "IntroductionViewModel", "lastQrCodeRequestTime updwill be updated", null, 4, null);
        this.lastQrCodeRequestTime = jCurrentTimeMillis;
        ACLoggerContract.DefaultImpls.d$default(aCLogger, "IntroductionViewModel", "lastQrCodeRequestTime updated", null, 4, null);
        QrCodeData qrCodeData = this.lastQrCodeData;
        if (qrCodeData == null || !e0.areEqual(title, qrCodeData.getTitle()) || !e0.areEqual(str, qrCodeData.getDescription()) || !e0.areEqual(data, qrCodeData.getUrl())) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass2(data, title, str, null), 3, null);
        } else {
            if (this._qrCode.tryEmit(new Response.Success(qrCodeData))) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C37161(z10, this, qrCodeData, null), 3, null);
        }
    }
}
