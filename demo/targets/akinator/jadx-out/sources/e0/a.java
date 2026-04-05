package e0;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements t2 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f52956a = new a();

    @Override // e0.t2
    /* renamed from: calculateMouseWheelScroll-8xgXZGE, reason: not valid java name */
    public long mo3742calculateMouseWheelScroll8xgXZGE(s2.e calculateMouseWheelScroll, u1.m event, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(calculateMouseWheelScroll, "$this$calculateMouseWheelScroll");
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        List<u1.c0> changes = event.getChanges();
        i1.h hVarM4174boximpl = i1.h.m4174boximpl(i1.h.f59344b.m4173getZeroF1C5BW0());
        int size = changes.size();
        for (int i10 = 0; i10 < size; i10++) {
            hVarM4174boximpl = i1.h.m4174boximpl(i1.h.m4190plusMKHz9U(hVarM4174boximpl.m4195unboximpl(), changes.get(i10).m7297getScrollDeltaF1C5BW0()));
        }
        return i1.h.m4192timestuRUvjQ(hVarM4174boximpl.m4195unboximpl(), -calculateMouseWheelScroll.mo3425toPx0680j_4(s2.i.m6817constructorimpl(64)));
    }
}
