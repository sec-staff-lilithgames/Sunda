package n6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.KClass;
import n6.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 extends b1 {

    /* renamed from: e, reason: collision with root package name */
    public static final b f75738e = new b(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends b1.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<? extends b0> workerClass) {
            super(workerClass);
            kotlin.jvm.internal.e0.checkNotNullParameter(workerClass, "workerClass");
        }

        public final a setInputMerger(Class<? extends q> inputMerger) {
            kotlin.jvm.internal.e0.checkNotNullParameter(inputMerger, "inputMerger");
            v6.b0 workSpec$work_runtime_release = getWorkSpec$work_runtime_release();
            String name = inputMerger.getName();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(name, "getName(...)");
            workSpec$work_runtime_release.f89056d = name;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(KClass<? extends b0> workerClass) {
            this((Class<? extends b0>) jv.a.getJavaClass((KClass) workerClass));
            kotlin.jvm.internal.e0.checkNotNullParameter(workerClass, "workerClass");
        }

        @Override // n6.b1.a
        public f0 buildInternal$work_runtime_release() {
            if (getBackoffCriteriaSet$work_runtime_release() && getWorkSpec$work_runtime_release().f89062j.requiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new f0(this);
        }

        @Override // n6.b1.a
        public a getThisObject$work_runtime_release() {
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }

        public final f0 from(Class<? extends b0> workerClass) {
            kotlin.jvm.internal.e0.checkNotNullParameter(workerClass, "workerClass");
            return (f0) new a(workerClass).build();
        }

        public final List<f0> from(List<? extends Class<? extends b0>> workerClasses) {
            kotlin.jvm.internal.e0.checkNotNullParameter(workerClasses, "workerClasses");
            List<? extends Class<? extends b0>> list = workerClasses;
            ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((f0) new a((Class<? extends b0>) it.next()).build());
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(a builder) {
        super(builder.getId$work_runtime_release(), builder.getWorkSpec$work_runtime_release(), builder.getTags$work_runtime_release());
        kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
    }

    public static final List<f0> from(List<? extends Class<? extends b0>> list) {
        return f75738e.from(list);
    }

    public static final f0 from(Class<? extends b0> cls) {
        return f75738e.from(cls);
    }
}
