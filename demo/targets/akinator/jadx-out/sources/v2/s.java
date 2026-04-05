package v2;

import java.util.ArrayList;
import java.util.List;
import uu.p0;
import x1.a1;
import x1.q1;
import x1.w0;
import x1.x0;
import x1.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final s f88929a = new s();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public static final a f88930e = new a();

        public a() {
            super(1);
        }

        public final void invoke(q1.a layout) {
            kotlin.jvm.internal.e0.checkNotNullParameter(layout, "$this$layout");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q1.a) obj);
            return tu.x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ q1 f88931e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q1 q1Var) {
            super(1);
            this.f88931e = q1Var;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q1.a) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(q1.a layout) {
            kotlin.jvm.internal.e0.checkNotNullParameter(layout, "$this$layout");
            q1.a.placeRelative$default(layout, this.f88931e, 0, 0, 0.0f, 4, null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List f88932e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<? extends q1> list) {
            super(1);
            this.f88932e = list;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q1.a) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(q1.a layout) {
            kotlin.jvm.internal.e0.checkNotNullParameter(layout, "$this$layout");
            List list = this.f88932e;
            int lastIndex = p0.getLastIndex(list);
            if (lastIndex < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                q1.a aVar = layout;
                q1.a.placeRelative$default(aVar, (q1) list.get(i10), 0, 0, 0.0f, 4, null);
                if (i10 == lastIndex) {
                    return;
                }
                i10++;
                layout = aVar;
            }
        }
    }

    @Override // x1.x0
    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(x1.z zVar, List list, int i10) {
        return super.maxIntrinsicHeight(zVar, list, i10);
    }

    @Override // x1.x0
    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(x1.z zVar, List list, int i10) {
        return super.maxIntrinsicWidth(zVar, list, i10);
    }

    @Override // x1.x0
    /* renamed from: measure-3p2s80s */
    public final y0 mo79measure3p2s80s(a1 Layout, List<? extends w0> measurables, long j10) {
        int i10;
        int i11;
        kotlin.jvm.internal.e0.checkNotNullParameter(Layout, "$this$Layout");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        int size = measurables.size();
        if (size == 0) {
            return a1.layout$default(Layout, 0, 0, null, a.f88930e, 4, null);
        }
        int i12 = 0;
        if (size == 1) {
            q1 q1VarMo7826measureBRTryo0 = measurables.get(0).mo7826measureBRTryo0(j10);
            return a1.layout$default(Layout, q1VarMo7826measureBRTryo0.getWidth(), q1VarMo7826measureBRTryo0.getHeight(), null, new b(q1VarMo7826measureBRTryo0), 4, null);
        }
        ArrayList arrayList = new ArrayList(measurables.size());
        int size2 = measurables.size();
        for (int i13 = 0; i13 < size2; i13++) {
            arrayList.add(measurables.get(i13).mo7826measureBRTryo0(j10));
        }
        int lastIndex = p0.getLastIndex(arrayList);
        if (lastIndex >= 0) {
            int iMax = 0;
            int iMax2 = 0;
            while (true) {
                q1 q1Var = (q1) arrayList.get(i12);
                iMax = Math.max(iMax, q1Var.getWidth());
                iMax2 = Math.max(iMax2, q1Var.getHeight());
                if (i12 == lastIndex) {
                    break;
                }
                i12++;
            }
            i10 = iMax;
            i11 = iMax2;
        } else {
            i10 = 0;
            i11 = 0;
        }
        return a1.layout$default(Layout, i10, i11, null, new c(arrayList), 4, null);
    }

    @Override // x1.x0
    public /* bridge */ /* synthetic */ int minIntrinsicHeight(x1.z zVar, List list, int i10) {
        return super.minIntrinsicHeight(zVar, list, i10);
    }

    @Override // x1.x0
    public /* bridge */ /* synthetic */ int minIntrinsicWidth(x1.z zVar, List list, int i10) {
        return super.minIntrinsicWidth(zVar, list, i10);
    }
}
