package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q4 {

    /* renamed from: a, reason: collision with root package name */
    public final w f80408a;

    public /* synthetic */ q4(w wVar) {
        this.f80408a = wVar;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ q4 m5830boximpl(w wVar) {
        return new q4(wVar);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5832equalsimpl(w wVar, Object obj) {
        return (obj instanceof q4) && kotlin.jvm.internal.e0.areEqual(wVar, ((q4) obj).m5837unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5833equalsimpl0(w wVar, w wVar2) {
        return kotlin.jvm.internal.e0.areEqual(wVar, wVar2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5834hashCodeimpl(w wVar) {
        return wVar.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5835toStringimpl(w wVar) {
        return "SkippableUpdater(composer=" + wVar + ')';
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final void m5836updateimpl(w wVar, kv.l lVar) {
        wVar.startReplaceableGroup(509942095);
        lVar.invoke(a6.m5779boximpl(a6.m5780constructorimpl(wVar)));
        wVar.endReplaceableGroup();
    }

    public boolean equals(Object obj) {
        return m5832equalsimpl(this.f80408a, obj);
    }

    public int hashCode() {
        return m5834hashCodeimpl(this.f80408a);
    }

    public String toString() {
        return m5835toStringimpl(this.f80408a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ w m5837unboximpl() {
        return this.f80408a;
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> w m5831constructorimpl(w wVar) {
        return wVar;
    }
}
