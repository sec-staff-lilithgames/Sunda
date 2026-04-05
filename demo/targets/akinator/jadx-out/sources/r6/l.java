package r6;

import android.os.Build;
import f.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;
import kv.q;
import n6.c0;
import tu.a0;
import tu.x0;
import uu.p0;
import uu.q0;
import uu.y0;
import v6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final List f83831a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Flow {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow[] f83832b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: r6.l$a$a, reason: collision with other inner class name */
        public static final class C0775a implements kv.a {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Flow[] f83833b;

            public C0775a(Flow[] flowArr) {
                this.f83833b = flowArr;
            }

            @Override // kv.a
            public final c[] invoke() {
                return new c[this.f83833b.length];
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class b extends bv.n implements q {

            /* renamed from: i, reason: collision with root package name */
            public int f83834i;

            /* renamed from: j, reason: collision with root package name */
            public /* synthetic */ FlowCollector f83835j;

            /* renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object[] f83836k;

            public b(zu.d dVar) {
                super(3, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                c cVar;
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f83834i;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    FlowCollector flowCollector = this.f83835j;
                    c[] cVarArr = (c[]) this.f83836k;
                    int length = cVarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            cVar = null;
                            break;
                        }
                        cVar = cVarArr[i11];
                        if (!e0.areEqual(cVar, r6.b.f83807a)) {
                            break;
                        }
                        i11++;
                    }
                    if (cVar == null) {
                        cVar = r6.b.f83807a;
                    }
                    this.f83834i = 1;
                    if (flowCollector.emit(cVar, this) == coroutine_suspended) {
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

            @Override // kv.q
            public final Object invoke(FlowCollector<? super c> flowCollector, c[] cVarArr, zu.d<? super x0> dVar) {
                b bVar = new b(dVar);
                bVar.f83835j = flowCollector;
                bVar.f83836k = cVarArr;
                return bVar.invokeSuspend(x0.f87415a);
            }
        }

        public a(Flow[] flowArr) {
            this.f83832b = flowArr;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, zu.d dVar) {
            Flow[] flowArr = this.f83832b;
            Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new C0775a(flowArr), new b(null), dVar);
            return objCombineInternal == av.e.getCOROUTINE_SUSPENDED() ? objCombineInternal : x0.f87415a;
        }
    }

    public l(List<? extends s6.f> controllers) {
        e0.checkNotNullParameter(controllers, "controllers");
        this.f83831a = controllers;
    }

    public final boolean areAllConstraintsMet(b0 workSpec) {
        e0.checkNotNullParameter(workSpec, "workSpec");
        List list = this.f83831a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((s6.f) obj).isCurrentlyConstrained(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            c0.get().debug(o.f83843a, "Work " + workSpec.f89053a + " constrained by " + y0.joinToString$default(arrayList, null, null, null, 0, null, new j0(16), 31, null));
        }
        return arrayList.isEmpty();
    }

    public final Flow<c> track(b0 spec) {
        e0.checkNotNullParameter(spec, "spec");
        List list = this.f83831a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((s6.f) obj).hasConstraint(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((s6.f) it.next()).track(spec.f89062j));
        }
        return FlowKt.distinctUntilChanged(new a((Flow[]) y0.toList(arrayList2).toArray(new Flow[0])));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(t6.m trackers) {
        this((List<? extends s6.f>) p0.listOfNotNull((Object[]) new s6.f[]{new s6.d(trackers.getBatteryChargingTracker()), new s6.e(trackers.getBatteryNotLowTracker()), new s6.k(trackers.getStorageNotLowTracker()), new s6.g(trackers.getNetworkStateTracker()), new s6.j(trackers.getNetworkStateTracker()), new s6.i(trackers.getNetworkStateTracker()), new s6.h(trackers.getNetworkStateTracker()), Build.VERSION.SDK_INT >= 28 ? o.NetworkRequestConstraintController(trackers.getContext()) : null}));
        e0.checkNotNullParameter(trackers, "trackers");
    }
}
