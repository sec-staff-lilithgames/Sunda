package androidx.fragment.app;

import androidx.lifecycle.g3;
import androidx.lifecycle.i3;
import androidx.lifecycle.l3;
import androidx.lifecycle.m3;
import androidx.lifecycle.n3;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class s2 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Fragment f6455e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f6455e = fragment;
        }

        @Override // kv.a
        public final m3 invoke() {
            FragmentActivity fragmentActivityRequireActivity = this.f6455e.requireActivity();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            m3 viewModelStore = fragmentActivityRequireActivity.getViewModelStore();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Fragment f6456e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f6456e = fragment;
        }

        @Override // kv.a
        public final l3 invoke() {
            FragmentActivity fragmentActivityRequireActivity = this.f6456e.requireActivity();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            return fragmentActivityRequireActivity.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Fragment f6457e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f6457e = fragment;
        }

        @Override // kv.a
        public final Fragment invoke() {
            return this.f6457e;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.a f6458e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kv.a aVar) {
            super(0);
            this.f6458e = aVar;
        }

        @Override // kv.a
        public final m3 invoke() {
            m3 viewModelStore = ((n3) this.f6458e.invoke()).getViewModelStore();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    public static final /* synthetic */ <VM extends g3> tu.o activityViewModels(Fragment activityViewModels, kv.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activityViewModels, "$this$activityViewModels");
        kotlin.jvm.internal.e0.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = kotlin.jvm.internal.c1.getOrCreateKotlinClass(g3.class);
        a aVar2 = new a(activityViewModels);
        if (aVar == null) {
            aVar = new b(activityViewModels);
        }
        return createViewModelLazy(activityViewModels, orCreateKotlinClass, aVar2, aVar);
    }

    public static /* synthetic */ tu.o activityViewModels$default(Fragment activityViewModels, kv.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(activityViewModels, "$this$activityViewModels");
        kotlin.jvm.internal.e0.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = kotlin.jvm.internal.c1.getOrCreateKotlinClass(g3.class);
        a aVar2 = new a(activityViewModels);
        if (aVar == null) {
            aVar = new b(activityViewModels);
        }
        return createViewModelLazy(activityViewModels, orCreateKotlinClass, aVar2, aVar);
    }

    public static final <VM extends g3> tu.o createViewModelLazy(Fragment createViewModelLazy, KClass<VM> viewModelClass, kv.a storeProducer, kv.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(createViewModelLazy, "$this$createViewModelLazy");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.e0.checkNotNullParameter(storeProducer, "storeProducer");
        if (aVar == null) {
            aVar = new t2(createViewModelLazy);
        }
        return new i3(viewModelClass, storeProducer, aVar);
    }

    public static /* synthetic */ tu.o createViewModelLazy$default(Fragment fragment, KClass kClass, kv.a aVar, kv.a aVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar2 = null;
        }
        return createViewModelLazy(fragment, kClass, aVar, aVar2);
    }

    public static final /* synthetic */ <VM extends g3> tu.o viewModels(Fragment viewModels, kv.a ownerProducer, kv.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(viewModels, "$this$viewModels");
        kotlin.jvm.internal.e0.checkNotNullParameter(ownerProducer, "ownerProducer");
        kotlin.jvm.internal.e0.reifiedOperationMarker(4, "VM");
        return createViewModelLazy(viewModels, kotlin.jvm.internal.c1.getOrCreateKotlinClass(g3.class), new d(ownerProducer), aVar);
    }

    public static /* synthetic */ tu.o viewModels$default(Fragment viewModels, kv.a ownerProducer, kv.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ownerProducer = new c(viewModels);
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(viewModels, "$this$viewModels");
        kotlin.jvm.internal.e0.checkNotNullParameter(ownerProducer, "ownerProducer");
        kotlin.jvm.internal.e0.reifiedOperationMarker(4, "VM");
        return createViewModelLazy(viewModels, kotlin.jvm.internal.c1.getOrCreateKotlinClass(g3.class), new d(ownerProducer), aVar);
    }
}
