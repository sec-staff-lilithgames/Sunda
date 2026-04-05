package androidx.lifecycle;

import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6556b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6557c;

    public /* synthetic */ e0(Object obj, int i10) {
        this.f6556b = i10;
        this.f6557c = obj;
    }

    @Override // androidx.lifecycle.v0
    public final void onStateChanged(b1 b1Var, i0 event) {
        int i10 = this.f6556b;
        Object obj = this.f6557c;
        switch (i10) {
            case 0:
                kotlin.jvm.internal.e0.checkNotNullParameter(b1Var, "<unused var>");
                kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                ((MutableStateFlow) obj).setValue(event.getTargetState());
                break;
            default:
                w5.a aVar = (w5.a) obj;
                int i11 = w5.a.f90378i;
                kotlin.jvm.internal.e0.checkNotNullParameter(b1Var, "<unused var>");
                kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                if (event != i0.ON_START) {
                    if (event == i0.ON_STOP) {
                        aVar.f90386h = false;
                        break;
                    }
                } else {
                    aVar.f90386h = true;
                    break;
                }
                break;
        }
    }
}
