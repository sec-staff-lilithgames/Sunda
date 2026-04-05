package kotlinx.coroutines.internal;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.internal.Segment;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SegmentOrClosed<S extends Segment<S>> {
    private final Object value;

    private /* synthetic */ SegmentOrClosed(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SegmentOrClosed m5199boximpl(Object obj) {
        return new SegmentOrClosed(obj);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5201equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof SegmentOrClosed) && e0.areEqual(obj, ((SegmentOrClosed) obj2).m5207unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5202equalsimpl0(Object obj, Object obj2) {
        return e0.areEqual(obj, obj2);
    }

    /* renamed from: getSegment-impl, reason: not valid java name */
    public static final S m5203getSegmentimpl(Object obj) {
        if (obj == ConcurrentLinkedListKt.CLOSED) {
            throw new IllegalStateException("Does not contain segment");
        }
        e0.checkNotNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (S) obj;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5204hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m5205isClosedimpl(Object obj) {
        return obj == ConcurrentLinkedListKt.CLOSED;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5206toStringimpl(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m5201equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5204hashCodeimpl(this.value);
    }

    public String toString() {
        return m5206toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m5207unboximpl() {
        return this.value;
    }

    public static /* synthetic */ void getSegment$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <S extends Segment<S>> Object m5200constructorimpl(Object obj) {
        return obj;
    }
}
