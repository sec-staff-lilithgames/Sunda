package kotlinx.coroutines.channels;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ChannelResult<T> {
    public static final Companion Companion = new Companion(null);
    private static final Failed failed = new Failed();
    private final Object holder;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Closed extends Failed {
        public final Throwable cause;

        public Closed(Throwable th2) {
            this.cause = th2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Closed) && e0.areEqual(this.cause, ((Closed) obj).cause);
        }

        public int hashCode() {
            Throwable th2 = this.cause;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.ChannelResult.Failed
        public String toString() {
            return "Closed(" + this.cause + ')';
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* renamed from: closed-JP2dKIU, reason: not valid java name */
        public final <E> Object m5166closedJP2dKIU(Throwable th2) {
            return ChannelResult.m5154constructorimpl(new Closed(th2));
        }

        /* renamed from: failure-PtdJZtk, reason: not valid java name */
        public final <E> Object m5167failurePtdJZtk() {
            return ChannelResult.m5154constructorimpl(ChannelResult.failed);
        }

        /* renamed from: success-JP2dKIU, reason: not valid java name */
        public final <E> Object m5168successJP2dKIU(E e10) {
            return ChannelResult.m5154constructorimpl(e10);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Failed {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ ChannelResult(Object obj) {
        this.holder = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ChannelResult m5153boximpl(Object obj) {
        return new ChannelResult(obj);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5155equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof ChannelResult) && e0.areEqual(obj, ((ChannelResult) obj2).m5165unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5156equalsimpl0(Object obj, Object obj2) {
        return e0.areEqual(obj, obj2);
    }

    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m5157exceptionOrNullimpl(Object obj) {
        Closed closed = obj instanceof Closed ? (Closed) obj : null;
        if (closed != null) {
            return closed.cause;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOrNull-impl, reason: not valid java name */
    public static final T m5158getOrNullimpl(Object obj) {
        if (obj instanceof Failed) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOrThrow-impl, reason: not valid java name */
    public static final T m5159getOrThrowimpl(Object obj) throws Throwable {
        if (!(obj instanceof Failed)) {
            return obj;
        }
        if (!(obj instanceof Closed)) {
            throw new IllegalStateException("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
        }
        Throwable th2 = ((Closed) obj).cause;
        if (th2 != null) {
            throw th2;
        }
        throw new IllegalStateException("Trying to call 'getOrThrow' on a channel closed without a cause");
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5160hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m5161isClosedimpl(Object obj) {
        return obj instanceof Closed;
    }

    /* renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m5162isFailureimpl(Object obj) {
        return obj instanceof Failed;
    }

    /* renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m5163isSuccessimpl(Object obj) {
        return !(obj instanceof Failed);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5164toStringimpl(Object obj) {
        if (obj instanceof Closed) {
            return ((Closed) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m5155equalsimpl(this.holder, obj);
    }

    public int hashCode() {
        return m5160hashCodeimpl(this.holder);
    }

    public String toString() {
        return m5164toStringimpl(this.holder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m5165unboximpl() {
        return this.holder;
    }

    public static /* synthetic */ void getHolder$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m5154constructorimpl(Object obj) {
        return obj;
    }
}
