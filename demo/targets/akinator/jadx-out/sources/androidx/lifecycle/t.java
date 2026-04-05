package androidx.lifecycle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final r f6708b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f6709c;

    public t(r defaultLifecycleObserver, v0 v0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f6708b = defaultLifecycleObserver;
        this.f6709c = v0Var;
    }

    @Override // androidx.lifecycle.v0
    public void onStateChanged(b1 source, i0 event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        int i10 = s.$EnumSwitchMapping$0[event.ordinal()];
        r rVar = this.f6708b;
        switch (i10) {
            case 1:
                rVar.onCreate(source);
                break;
            case 2:
                rVar.onStart(source);
                break;
            case 3:
                rVar.onResume(source);
                break;
            case 4:
                rVar.onPause(source);
                break;
            case 5:
                rVar.onStop(source);
                break;
            case 6:
                rVar.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new tu.t();
        }
        v0 v0Var = this.f6709c;
        if (v0Var != null) {
            v0Var.onStateChanged(source, event);
        }
    }
}
