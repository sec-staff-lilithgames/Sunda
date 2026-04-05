package com.sfbx.appconsentv3.ui.ui.geolocation;

import androidx.lifecycle.h3;
import androidx.lifecycle.l1;
import androidx.lifecycle.t1;
import av.e;
import bv.b;
import bv.f;
import bv.n;
import com.sfbx.appconsent.core.AppConsentCore;
import com.sfbx.appconsent.core.AppConsentCoreContract;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.Notice;
import com.sfbx.appconsentv3.ui.model.Response;
import com.sfbx.appconsentv3.ui.viewmodel.AbstractTrackingViewModel;
import com.vungle.ads.internal.protos.Sdk;
import io.sfbx.appconsent.logger.ACLogger;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GeolocationViewModel extends AbstractTrackingViewModel {
    public static final Companion Companion = new Companion(null);
    private static final String tag = "GeolocationViewModel";
    private final t1 _consentables;
    private final t1 _save;
    private final l1 consentables;
    private final l1 save;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$fetchConsentables$1", f = "GeolocationViewModel.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$fetchConsentables$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$fetchConsentables$1$2", f = "GeolocationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$fetchConsentables$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends n implements q {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ GeolocationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(GeolocationViewModel geolocationViewModel, d<? super AnonymousClass2> dVar) {
                super(3, dVar);
                this.this$0 = geolocationViewModel;
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
            public final Object invoke(FlowCollector<? super List<Consentable>> flowCollector, Throwable th2, d<? super x0> dVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, dVar);
                anonymousClass2.L$0 = th2;
                return anonymousClass2.invokeSuspend(x0.f87415a);
            }
        }

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return GeolocationViewModel.this.new AnonymousClass1(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                GeolocationViewModel.this._consentables.setValue(new Response.Loading());
                final Flow<Notice> notice = GeolocationViewModel.this.getAppConsentCore().getNotice(true);
                Flow flowM5171catch = FlowKt.m5171catch(new Flow<List<? extends Consentable>>() { // from class: com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$fetchConsentables$1$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    /* renamed from: com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$fetchConsentables$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                        @f(c = "com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$fetchConsentables$1$invokeSuspend$$inlined$map$1$2", f = "GeolocationViewModel.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                        /* renamed from: com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$fetchConsentables$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends bv.d {
                            Object L$0;
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

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r7, zu.d r8) {
                            /*
                                r6 = this;
                                boolean r0 = r8 instanceof com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$fetchConsentables$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r8
                                com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$fetchConsentables$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$fetchConsentables$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$fetchConsentables$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$fetchConsentables$1$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r8)
                            L18:
                                java.lang.Object r8 = r0.result
                                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                tu.a0.throwOnFailure(r8)
                                goto L67
                            L29:
                                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                                r7.<init>(r8)
                                throw r7
                            L31:
                                tu.a0.throwOnFailure(r8)
                                kotlinx.coroutines.flow.FlowCollector r8 = r6.$this_unsafeFlow
                                com.sfbx.appconsent.core.model.Notice r7 = (com.sfbx.appconsent.core.model.Notice) r7
                                java.util.List r7 = r7.getConsentables()
                                java.lang.Iterable r7 = (java.lang.Iterable) r7
                                java.util.ArrayList r2 = new java.util.ArrayList
                                r2.<init>()
                                java.util.Iterator r7 = r7.iterator()
                            L47:
                                boolean r4 = r7.hasNext()
                                if (r4 == 0) goto L5e
                                java.lang.Object r4 = r7.next()
                                r5 = r4
                                com.sfbx.appconsent.core.model.Consentable r5 = (com.sfbx.appconsent.core.model.Consentable) r5
                                boolean r5 = r5.isGeolocation()
                                if (r5 == 0) goto L47
                                r2.add(r4)
                                goto L47
                            L5e:
                                r0.label = r3
                                java.lang.Object r7 = r8.emit(r2, r0)
                                if (r7 != r1) goto L67
                                return r1
                            L67:
                                tu.x0 r7 = tu.x0.f87415a
                                return r7
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$fetchConsentables$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends Consentable>> flowCollector, d dVar) {
                        Object objCollect = notice.collect(new AnonymousClass2(flowCollector), dVar);
                        return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
                    }
                }, new AnonymousClass2(GeolocationViewModel.this, null));
                final GeolocationViewModel geolocationViewModel = GeolocationViewModel.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel.fetchConsentables.1.3
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((List<Consentable>) obj2, (d<? super x0>) dVar);
                    }

                    public final Object emit(List<Consentable> list, d<? super x0> dVar) {
                        geolocationViewModel._consentables.setValue(new Response.Success(list));
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
    @f(c = "com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$save$1", f = "GeolocationViewModel.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$save$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37101 extends n implements p {
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$save$1$1", f = "GeolocationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$save$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05191 extends n implements q {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ GeolocationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05191(GeolocationViewModel geolocationViewModel, d<? super C05191> dVar) {
                super(3, dVar);
                this.this$0 = geolocationViewModel;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                this.this$0._save.setValue(new Response.Error((Throwable) this.L$0, null, 2, null));
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, d<? super x0> dVar) {
                C05191 c05191 = new C05191(this.this$0, dVar);
                c05191.L$0 = th2;
                return c05191.invokeSuspend(x0.f87415a);
            }
        }

        public C37101(d<? super C37101> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return GeolocationViewModel.this.new C37101(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                GeolocationViewModel.this._save.setValue(new Response.Loading());
                Flow flowM5171catch = FlowKt.m5171catch(GeolocationViewModel.this.getAppConsentCore().saveConsents(), new C05191(GeolocationViewModel.this, null));
                final GeolocationViewModel geolocationViewModel = GeolocationViewModel.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel.save.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit(((Boolean) obj2).booleanValue(), (d<? super x0>) dVar);
                    }

                    public final Object emit(boolean z10, d<? super x0> dVar) {
                        geolocationViewModel._save.setValue(new Response.Success(b.boxBoolean(z10)));
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
            return ((C37101) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$setConsentableStatus$1", f = "GeolocationViewModel.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$setConsentableStatus$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37111 extends n implements p {
        final /* synthetic */ int $consentableId;
        final /* synthetic */ ConsentStatus $newStatus;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$setConsentableStatus$1$1", f = "GeolocationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel$setConsentableStatus$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05201 extends n implements q {
            /* synthetic */ Object L$0;
            int label;

            public C05201(d<? super C05201> dVar) {
                super(3, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                Throwable th2 = (Throwable) this.L$0;
                ACLogger aCLogger = ACLogger.INSTANCE;
                String tag = GeolocationViewModel.tag;
                e0.checkNotNullExpressionValue(tag, "tag");
                aCLogger.e(tag, th2);
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, d<? super x0> dVar) {
                C05201 c05201 = new C05201(dVar);
                c05201.L$0 = th2;
                return c05201.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37111(int i10, ConsentStatus consentStatus, d<? super C37111> dVar) {
            super(2, dVar);
            this.$consentableId = i10;
            this.$newStatus = consentStatus;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return GeolocationViewModel.this.new C37111(this.$consentableId, this.$newStatus, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Flow flowM5171catch = FlowKt.m5171catch(AppConsentCoreContract.DefaultImpls.setConsentableStatus$default(GeolocationViewModel.this.getAppConsentCore(), this.$consentableId, this.$newStatus, false, 4, null), new C05201(null));
                this.label = 1;
                if (FlowKt.collect(flowM5171catch, this) == coroutine_suspended) {
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
            return ((C37111) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeolocationViewModel(AppConsentCore appConsentCore) {
        super(appConsentCore);
        e0.checkNotNullParameter(appConsentCore, "appConsentCore");
        t1 t1Var = new t1();
        this._consentables = t1Var;
        this.consentables = t1Var;
        t1 t1Var2 = new t1();
        this._save = t1Var2;
        this.save = t1Var2;
    }

    public final void fetchConsentables() {
        BuildersKt__Builders_commonKt.launch$default(h3.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final l1 getConsentables() {
        return this.consentables;
    }

    public final l1 getSave() {
        return this.save;
    }

    public final void save() {
        BuildersKt__Builders_commonKt.launch$default(h3.getViewModelScope(this), null, null, new C37101(null), 3, null);
    }

    public final void setConsentableStatus(int i10, ConsentStatus newStatus) {
        e0.checkNotNullParameter(newStatus, "newStatus");
        BuildersKt__Builders_commonKt.launch$default(h3.getViewModelScope(this), null, null, new C37111(i10, newStatus, null), 3, null);
    }
}
