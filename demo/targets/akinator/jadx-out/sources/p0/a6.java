package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a6 {

    /* renamed from: a, reason: collision with root package name */
    public final w f80146a;

    public /* synthetic */ a6(w wVar) {
        this.f80146a = wVar;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ a6 m5779boximpl(w wVar) {
        return new a6(wVar);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5781equalsimpl(w wVar, Object obj) {
        return (obj instanceof a6) && kotlin.jvm.internal.e0.areEqual(wVar, ((a6) obj).m5791unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5782equalsimpl0(w wVar, w wVar2) {
        return kotlin.jvm.internal.e0.areEqual(wVar, wVar2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5783hashCodeimpl(w wVar) {
        return wVar.hashCode();
    }

    /* renamed from: init-impl, reason: not valid java name */
    public static final void m5784initimpl(w wVar, kv.l lVar) {
        if (wVar.getInserting()) {
            wVar.apply(tu.x0.f87415a, new z5(0, lVar));
        }
    }

    /* renamed from: reconcile-impl, reason: not valid java name */
    public static final void m5785reconcileimpl(w wVar, kv.l lVar) {
        wVar.apply(tu.x0.f87415a, new z5(1, lVar));
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m5786setimpl(w wVar, int i10, kv.p pVar) {
        if (wVar.getInserting() || !kotlin.jvm.internal.e0.areEqual(wVar.rememberedValue(), Integer.valueOf(i10))) {
            wVar.updateRememberedValue(Integer.valueOf(i10));
            wVar.apply(Integer.valueOf(i10), pVar);
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5788toStringimpl(w wVar) {
        return "Updater(composer=" + wVar + ')';
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final void m5789updateimpl(w wVar, int i10, kv.p pVar) {
        boolean inserting = wVar.getInserting();
        if (inserting || !kotlin.jvm.internal.e0.areEqual(wVar.rememberedValue(), Integer.valueOf(i10))) {
            wVar.updateRememberedValue(Integer.valueOf(i10));
            if (inserting) {
                return;
            }
            wVar.apply(Integer.valueOf(i10), pVar);
        }
    }

    public boolean equals(Object obj) {
        return m5781equalsimpl(this.f80146a, obj);
    }

    public int hashCode() {
        return m5783hashCodeimpl(this.f80146a);
    }

    public String toString() {
        return m5788toStringimpl(this.f80146a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ w m5791unboximpl() {
        return this.f80146a;
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final <V> void m5787setimpl(w wVar, V v10, kv.p pVar) {
        if (wVar.getInserting() || !kotlin.jvm.internal.e0.areEqual(wVar.rememberedValue(), v10)) {
            wVar.updateRememberedValue(v10);
            wVar.apply(v10, pVar);
        }
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final <V> void m5790updateimpl(w wVar, V v10, kv.p pVar) {
        boolean inserting = wVar.getInserting();
        if (inserting || !kotlin.jvm.internal.e0.areEqual(wVar.rememberedValue(), v10)) {
            wVar.updateRememberedValue(v10);
            if (inserting) {
                return;
            }
            wVar.apply(v10, pVar);
        }
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> w m5780constructorimpl(w wVar) {
        return wVar;
    }
}
