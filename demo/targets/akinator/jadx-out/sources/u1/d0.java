package u1;

import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f87536a = new LinkedHashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f87537a;

        /* renamed from: b, reason: collision with root package name */
        public final long f87538b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f87539c;

        /* renamed from: d, reason: collision with root package name */
        public final int f87540d;

        public a(long j10, long j11, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
            this.f87537a = j10;
            this.f87538b = j11;
            this.f87539c = z10;
            this.f87540d = i10;
        }

        public final boolean getDown() {
            return this.f87539c;
        }

        /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
        public final long m7299getPositionOnScreenF1C5BW0() {
            return this.f87538b;
        }

        /* renamed from: getType-T8wyACA, reason: not valid java name */
        public final int m7300getTypeT8wyACA() {
            return this.f87540d;
        }

        public final long getUptime() {
            return this.f87537a;
        }
    }

    public final void clear() {
        this.f87536a.clear();
    }

    public final g produce(e0 pointerInputEvent, a1 positionCalculator) {
        long uptime;
        boolean down;
        long jMo59screenToLocalMKHz9U;
        kotlin.jvm.internal.e0.checkNotNullParameter(pointerInputEvent, "pointerInputEvent");
        kotlin.jvm.internal.e0.checkNotNullParameter(positionCalculator, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(pointerInputEvent.getPointers().size());
        List<f0> pointers = pointerInputEvent.getPointers();
        int size = pointers.size();
        for (int i10 = 0; i10 < size; i10++) {
            f0 f0Var = pointers.get(i10);
            b0 b0VarM7255boximpl = b0.m7255boximpl(f0Var.m7310getIdJ3iCeTQ());
            LinkedHashMap linkedHashMap2 = this.f87536a;
            a aVar = (a) linkedHashMap2.get(b0VarM7255boximpl);
            if (aVar == null) {
                uptime = f0Var.getUptime();
                down = false;
                jMo59screenToLocalMKHz9U = f0Var.m7311getPositionF1C5BW0();
            } else {
                uptime = aVar.getUptime();
                down = aVar.getDown();
                jMo59screenToLocalMKHz9U = positionCalculator.mo59screenToLocalMKHz9U(aVar.m7299getPositionOnScreenF1C5BW0());
            }
            linkedHashMap.put(b0.m7255boximpl(f0Var.m7310getIdJ3iCeTQ()), new c0(f0Var.m7310getIdJ3iCeTQ(), f0Var.getUptime(), f0Var.m7311getPositionF1C5BW0(), f0Var.getDown(), uptime, jMo59screenToLocalMKHz9U, down, false, f0Var.m7314getTypeT8wyACA(), (List) f0Var.getHistorical(), f0Var.m7313getScrollDeltaF1C5BW0(), (kotlin.jvm.internal.u) null));
            if (f0Var.getDown()) {
                linkedHashMap2.put(b0.m7255boximpl(f0Var.m7310getIdJ3iCeTQ()), new a(f0Var.getUptime(), f0Var.m7312getPositionOnScreenF1C5BW0(), f0Var.getDown(), f0Var.m7314getTypeT8wyACA(), null));
            } else {
                linkedHashMap2.remove(b0.m7255boximpl(f0Var.m7310getIdJ3iCeTQ()));
            }
        }
        return new g(linkedHashMap, pointerInputEvent);
    }
}
