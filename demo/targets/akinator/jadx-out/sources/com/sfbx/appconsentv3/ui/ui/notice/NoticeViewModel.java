package com.sfbx.appconsentv3.ui.ui.notice;

import androidx.lifecycle.h3;
import androidx.lifecycle.l1;
import androidx.lifecycle.t1;
import av.e;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.sfbx.appconsent.core.AppConsentCore;
import com.sfbx.appconsent.core.AppConsentCoreContract;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsent.core.model.Notice;
import com.sfbx.appconsent.core.model.Stack;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsentv3.ui.model.Response;
import com.sfbx.appconsentv3.ui.util.ExtensionKt;
import com.sfbx.appconsentv3.ui.util.SfbxErrorThrowable;
import com.sfbx.appconsentv3.ui.util.SfbxIABWebViewThrowable;
import com.sfbx.appconsentv3.ui.viewmodel.AbstractTrackingViewModel;
import com.vungle.ads.internal.protos.Sdk;
import cv.BLca.YsiBvdpw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;
import uu.o0;
import uu.p0;
import uu.q0;
import uu.y0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class NoticeViewModel extends AbstractTrackingViewModel {
    private final t1 _acceptAll;
    private final t1 _consentableStatus;
    private final t1 _consentables;
    private final t1 _refuseAll;
    private final t1 _saveConsents;
    private final l1 acceptAll;
    private final l1 consentableStatus;
    private final l1 consentables;
    private final l1 refuseAll;
    private final l1 saveConsents;
    private int vendors;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$acceptAll$1", f = "NoticeViewModel.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$acceptAll$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ boolean $excludeGeoloc;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$acceptAll$1$1", f = "NoticeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$acceptAll$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05281 extends n implements q {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ NoticeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05281(NoticeViewModel noticeViewModel, d<? super C05281> dVar) {
                super(3, dVar);
                this.this$0 = noticeViewModel;
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
                C05281 c05281 = new C05281(this.this$0, dVar);
                c05281.L$0 = th2;
                return c05281.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z10, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$excludeGeoloc = z10;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return NoticeViewModel.this.new AnonymousClass1(this.$excludeGeoloc, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                NoticeViewModel.this._acceptAll.setValue(new Response.Loading());
                Flow flowM5171catch = FlowKt.m5171catch(NoticeViewModel.this.getAppConsentCore().acceptAll(this.$excludeGeoloc), new C05281(NoticeViewModel.this, null));
                final NoticeViewModel noticeViewModel = NoticeViewModel.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.acceptAll.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit(((Boolean) obj2).booleanValue(), (d<? super x0>) dVar);
                    }

                    public final Object emit(boolean z10, d<? super x0> dVar) {
                        noticeViewModel._acceptAll.setValue(new Response.Success(bv.b.boxBoolean(z10)));
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
    @f(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$getConsentables$1", f = "NoticeViewModel.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$getConsentables$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37211 extends n implements p {
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$getConsentables$1$1", f = "NoticeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$getConsentables$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05291 extends n implements q {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ NoticeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05291(NoticeViewModel noticeViewModel, d<? super C05291> dVar) {
                super(3, dVar);
                this.this$0 = noticeViewModel;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                this.this$0._consentables.setValue(new Response.Error((Throwable) this.L$0, null, 2, null));
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super Notice> flowCollector, Throwable th2, d<? super x0> dVar) {
                C05291 c05291 = new C05291(this.this$0, dVar);
                c05291.L$0 = th2;
                return c05291.invokeSuspend(x0.f87415a);
            }
        }

        public C37211(d<? super C37211> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return NoticeViewModel.this.new C37211(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                NoticeViewModel.this._consentables.setValue(new Response.Loading());
                Flow flowM5171catch = FlowKt.m5171catch(NoticeViewModel.this.getAppConsentCore().getNotice(true), new C05291(NoticeViewModel.this, null));
                final NoticeViewModel noticeViewModel = NoticeViewModel.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.getConsentables.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((Notice) obj2, (d<? super x0>) dVar);
                    }

                    public final Object emit(Notice notice, d<? super x0> dVar) {
                        if (notice.getConsentables().isEmpty() && notice.getVendors().isEmpty() && notice.getStacks().isEmpty()) {
                            noticeViewModel._consentables.setValue(new Response.Error(new SfbxErrorThrowable("No data received by IAB script, from Webview component system", new SfbxIABWebViewThrowable()), null, 2, null));
                        } else {
                            List listFilterConsentables = noticeViewModel.filterConsentables(notice);
                            noticeViewModel.setVendors(notice.getVendors().size());
                            noticeViewModel._consentables.setValue(new Response.Success(listFilterConsentables));
                        }
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
            return ((C37211) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$refuseAll$1", f = "NoticeViewModel.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$refuseAll$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37221 extends n implements p {
        final /* synthetic */ boolean $excludeGeoloc;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$refuseAll$1$1", f = "NoticeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$refuseAll$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05301 extends n implements q {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ NoticeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05301(NoticeViewModel noticeViewModel, d<? super C05301> dVar) {
                super(3, dVar);
                this.this$0 = noticeViewModel;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, d<? super x0> dVar) {
                C05301 c05301 = new C05301(this.this$0, dVar);
                c05301.L$0 = th2;
                return c05301.invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    a0.throwOnFailure(obj);
                    this.this$0._refuseAll.setValue(new Response.Error((Throwable) this.L$0, null, 2, null));
                    return x0.f87415a;
                }
                throw new IllegalStateException(YsiBvdpw.aJGipeeRxyovp);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37221(boolean z10, d<? super C37221> dVar) {
            super(2, dVar);
            this.$excludeGeoloc = z10;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return NoticeViewModel.this.new C37221(this.$excludeGeoloc, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                NoticeViewModel.this._refuseAll.setValue(new Response.Loading());
                Flow flowM5171catch = FlowKt.m5171catch(AppConsentCoreContract.DefaultImpls.refuseAll$default(NoticeViewModel.this.getAppConsentCore(), this.$excludeGeoloc, false, 2, null), new C05301(NoticeViewModel.this, null));
                final NoticeViewModel noticeViewModel = NoticeViewModel.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.refuseAll.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit(((Boolean) obj2).booleanValue(), (d<? super x0>) dVar);
                    }

                    public final Object emit(boolean z10, d<? super x0> dVar) {
                        noticeViewModel._refuseAll.setValue(new Response.Success(bv.b.boxBoolean(z10)));
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
            return ((C37221) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$saveConsents$1", f = "NoticeViewModel.kt", i = {}, l = {Sdk.SDKError.Reason.TPAT_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$saveConsents$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37231 extends n implements p {
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$saveConsents$1$1", f = "NoticeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$saveConsents$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05311 extends n implements q {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ NoticeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05311(NoticeViewModel noticeViewModel, d<? super C05311> dVar) {
                super(3, dVar);
                this.this$0 = noticeViewModel;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                this.this$0._saveConsents.setValue(new Response.Error((Throwable) this.L$0, null, 2, null));
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, d<? super x0> dVar) {
                C05311 c05311 = new C05311(this.this$0, dVar);
                c05311.L$0 = th2;
                return c05311.invokeSuspend(x0.f87415a);
            }
        }

        public C37231(d<? super C37231> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return NoticeViewModel.this.new C37231(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                NoticeViewModel.this._saveConsents.setValue(new Response.Loading());
                Flow flowM5171catch = FlowKt.m5171catch(NoticeViewModel.this.getAppConsentCore().saveConsents(), new C05311(NoticeViewModel.this, null));
                final NoticeViewModel noticeViewModel = NoticeViewModel.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.saveConsents.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit(((Boolean) obj2).booleanValue(), (d<? super x0>) dVar);
                    }

                    public final Object emit(boolean z10, d<? super x0> dVar) {
                        noticeViewModel._saveConsents.setValue(new Response.Success(bv.b.boxBoolean(z10)));
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
            return ((C37231) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1", f = "NoticeViewModel.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER, 77}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37241 extends n implements p {
        final /* synthetic */ int $consentableId;
        final /* synthetic */ ConsentStatus $newStatus;
        final /* synthetic */ ConsentableType $type;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1$1", f = "NoticeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05321 extends n implements q {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ NoticeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05321(NoticeViewModel noticeViewModel, d<? super C05321> dVar) {
                super(3, dVar);
                this.this$0 = noticeViewModel;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                this.this$0._consentableStatus.setValue(new Response.Error((Throwable) this.L$0, null, 2, null));
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, d<? super x0> dVar) {
                C05321 c05321 = new C05321(this.this$0, dVar);
                c05321.L$0 = th2;
                return c05321.invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1$3", f = "NoticeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends n implements q {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ NoticeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(NoticeViewModel noticeViewModel, d<? super AnonymousClass3> dVar) {
                super(3, dVar);
                this.this$0 = noticeViewModel;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                this.this$0._consentableStatus.setValue(new Response.Error((Throwable) this.L$0, null, 2, null));
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
        /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ConsentableType.values().length];
                try {
                    iArr[ConsentableType.STACK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37241(ConsentableType consentableType, int i10, ConsentStatus consentStatus, d<? super C37241> dVar) {
            super(2, dVar);
            this.$type = consentableType;
            this.$consentableId = i10;
            this.$newStatus = consentStatus;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return NoticeViewModel.this.new C37241(this.$type, this.$consentableId, this.$newStatus, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
        
            if (r11.collect(r1, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x009b, code lost:
        
            if (r11.collect(r1, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x009d, code lost:
        
            return r0;
         */
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
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L17:
                tu.a0.throwOnFailure(r11)
                goto L9e
            L1c:
                tu.a0.throwOnFailure(r11)
                com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel r11 = com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.this
                androidx.lifecycle.t1 r11 = com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.access$get_consentableStatus$p(r11)
                com.sfbx.appconsentv3.ui.model.Response$Loading r1 = new com.sfbx.appconsentv3.ui.model.Response$Loading
                r1.<init>()
                r11.setValue(r1)
                com.sfbx.appconsent.core.model.ConsentableType r11 = r10.$type
                int[] r1 = com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.C37241.WhenMappings.$EnumSwitchMapping$0
                int r11 = r11.ordinal()
                r11 = r1[r11]
                r1 = 0
                if (r11 != r3) goto L6c
                com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel r11 = com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.this
                com.sfbx.appconsent.core.AppConsentCore r4 = com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.access$getAppConsentCore(r11)
                int r5 = r10.$consentableId
                com.sfbx.appconsent.core.model.ConsentStatus r6 = r10.$newStatus
                r8 = 4
                r9 = 0
                r7 = 0
                kotlinx.coroutines.flow.Flow r11 = com.sfbx.appconsent.core.AppConsentCoreContract.DefaultImpls.setStackStatus$default(r4, r5, r6, r7, r8, r9)
                com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1$1 r2 = new com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1$1
                com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel r4 = com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.this
                r2.<init>(r4, r1)
                kotlinx.coroutines.flow.Flow r11 = kotlinx.coroutines.flow.FlowKt.m5171catch(r11, r2)
                com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1$2 r1 = new com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1$2
                com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel r2 = com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.this
                int r4 = r10.$consentableId
                com.sfbx.appconsent.core.model.ConsentableType r5 = r10.$type
                com.sfbx.appconsent.core.model.ConsentStatus r6 = r10.$newStatus
                r1.<init>()
                r10.label = r3
                java.lang.Object r11 = r11.collect(r1, r10)
                if (r11 != r0) goto L9e
                goto L9d
            L6c:
                com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel r11 = com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.this
                com.sfbx.appconsent.core.AppConsentCore r3 = com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.access$getAppConsentCore(r11)
                int r4 = r10.$consentableId
                com.sfbx.appconsent.core.model.ConsentStatus r5 = r10.$newStatus
                r7 = 4
                r8 = 0
                r6 = 0
                kotlinx.coroutines.flow.Flow r11 = com.sfbx.appconsent.core.AppConsentCoreContract.DefaultImpls.setConsentableStatus$default(r3, r4, r5, r6, r7, r8)
                com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1$3 r3 = new com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1$3
                com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel r4 = com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.this
                r3.<init>(r4, r1)
                kotlinx.coroutines.flow.Flow r11 = kotlinx.coroutines.flow.FlowKt.m5171catch(r11, r3)
                com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1$4 r1 = new com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1$4
                com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel r3 = com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.this
                int r4 = r10.$consentableId
                com.sfbx.appconsent.core.model.ConsentableType r5 = r10.$type
                com.sfbx.appconsent.core.model.ConsentStatus r6 = r10.$newStatus
                r1.<init>()
                r10.label = r2
                java.lang.Object r11 = r11.collect(r1, r10)
                if (r11 != r0) goto L9e
            L9d:
                return r0
            L9e:
                tu.x0 r11 = tu.x0.f87415a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.C37241.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C37241) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoticeViewModel(AppConsentCore appConsentCore) {
        super(appConsentCore);
        e0.checkNotNullParameter(appConsentCore, "appConsentCore");
        t1 t1Var = new t1();
        this._consentables = t1Var;
        this.consentables = t1Var;
        t1 t1Var2 = new t1();
        this._consentableStatus = t1Var2;
        this.consentableStatus = t1Var2;
        t1 t1Var3 = new t1();
        this._acceptAll = t1Var3;
        this.acceptAll = t1Var3;
        t1 t1Var4 = new t1();
        this._refuseAll = t1Var4;
        this.refuseAll = t1Var4;
        t1 t1Var5 = new t1();
        this._saveConsents = t1Var5;
        this.saveConsents = t1Var5;
    }

    public static /* synthetic */ void acceptAll$default(NoticeViewModel noticeViewModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        noticeViewModel.acceptAll(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Consentable> filterConsentables(Notice notice) {
        List listEmptyList;
        Object next;
        List<Stack> stacks = notice.getStacks();
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(stacks, 10));
        Iterator<T> it = stacks.iterator();
        while (it.hasNext()) {
            List<Consentable> consentables = ((Stack) it.next()).getConsentables();
            ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(consentables, 10));
            Iterator<T> it2 = consentables.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((Consentable) it2.next()).getId()));
            }
            arrayList.add(y0.distinct(arrayList2));
        }
        if (arrayList.isEmpty()) {
            listEmptyList = p0.emptyList();
        } else {
            Iterator it3 = arrayList.iterator();
            if (!it3.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next2 = it3.next();
            while (it3.hasNext()) {
                next2 = y0.distinct(y0.plus((Collection) next2, (Iterable) it3.next()));
            }
            listEmptyList = (List) next2;
        }
        List<Consentable> consentables2 = notice.getConsentables();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : consentables2) {
            if (!listEmptyList.contains(Integer.valueOf(((Consentable) obj).getId()))) {
                arrayList3.add(obj);
            }
        }
        List<Stack> stacks2 = notice.getStacks();
        ArrayList arrayList4 = new ArrayList(q0.collectionSizeOrDefault(stacks2, 10));
        for (Stack stack : stacks2) {
            List<Consentable> consentables3 = stack.getConsentables();
            ArrayList arrayList5 = new ArrayList(q0.collectionSizeOrDefault(consentables3, 10));
            Iterator<T> it4 = consentables3.iterator();
            while (it4.hasNext()) {
                arrayList5.add(y0.distinct(((Consentable) it4.next()).getVendors()));
            }
            List listDistinct = y0.distinct(q0.flatten(arrayList5));
            ArrayList arrayList6 = new ArrayList();
            for (Object obj2 : listDistinct) {
                Vendor vendor = (Vendor) obj2;
                if (vendor.getIabId() != null && !vendor.isLegVendor() && !vendor.isExtraVendor()) {
                    arrayList6.add(obj2);
                }
            }
            arrayList4.add(ExtensionKt.toConsentableWithVendors(stack, arrayList6));
        }
        Iterator it5 = arrayList3.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next = null;
                break;
            }
            next = it5.next();
            Consentable consentable = (Consentable) next;
            if (consentable.getId() == 1 && consentable.getType() == ConsentableType.PURPOSE) {
                break;
            }
        }
        Consentable consentable2 = (Consentable) next;
        if (consentable2 == null) {
            return y0.plus((Collection) arrayList4, (Iterable) arrayList3);
        }
        List listPlus = y0.plus((Collection) o0.listOf(consentable2), (Iterable) arrayList4);
        ArrayList arrayList7 = new ArrayList();
        boolean z10 = false;
        for (Object obj3 : arrayList3) {
            if (z10) {
                arrayList7.add(obj3);
            } else if (((Consentable) obj3).getId() != 1) {
                arrayList7.add(obj3);
                z10 = true;
            }
        }
        return y0.plus((Collection) listPlus, (Iterable) arrayList7);
    }

    public static /* synthetic */ void refuseAll$default(NoticeViewModel noticeViewModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        noticeViewModel.refuseAll(z10);
    }

    public final void acceptAll(boolean z10) {
        BuildersKt__Builders_commonKt.launch$default(h3.getViewModelScope(this), null, null, new AnonymousClass1(z10, null), 3, null);
    }

    public final l1 getAcceptAll() {
        return this.acceptAll;
    }

    public final l1 getConsentableStatus() {
        return this.consentableStatus;
    }

    public final l1 getConsentables() {
        return this.consentables;
    }

    public final List<Consentable> getConsentablesInCache() {
        return filterConsentables(getAppConsentCore().getConsentInCache());
    }

    public final l1 getRefuseAll() {
        return this.refuseAll;
    }

    public final l1 getSaveConsents() {
        return this.saveConsents;
    }

    public final int getVendors() {
        return this.vendors;
    }

    public final void refuseAll(boolean z10) {
        BuildersKt__Builders_commonKt.launch$default(h3.getViewModelScope(this), null, null, new C37221(z10, null), 3, null);
    }

    public final void resetLastModification() {
        getAppConsentCore().rollbackToInitialValues();
    }

    public final void saveConsents() {
        BuildersKt__Builders_commonKt.launch$default(h3.getViewModelScope(this), null, null, new C37231(null), 3, null);
    }

    public final void setConsentableStatus(int i10, ConsentableType type, ConsentStatus newStatus) {
        e0.checkNotNullParameter(type, "type");
        e0.checkNotNullParameter(newStatus, "newStatus");
        BuildersKt__Builders_commonKt.launch$default(h3.getViewModelScope(this), null, null, new C37241(type, i10, newStatus, null), 3, null);
    }

    public final void setVendors(int i10) {
        this.vendors = i10;
    }

    /* renamed from: getConsentables, reason: collision with other method in class */
    public final void m3471getConsentables() {
        BuildersKt__Builders_commonKt.launch$default(h3.getViewModelScope(this), null, null, new C37211(null), 3, null);
    }
}
