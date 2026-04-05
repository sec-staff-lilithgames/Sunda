package cq;

import dq.c0;
import ir.t;
import kotlin.jvm.internal.e0;
import um.h0;
import yq.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class d implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50877b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f50878c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f50879e;

    public /* synthetic */ d(e eVar, o oVar) {
        this.f50879e = eVar;
        this.f50878c = oVar;
    }

    @Override // dq.c0, ir.k
    public final void onRun() {
        int i10 = this.f50877b;
        e this$0 = this.f50879e;
        o placeholderView = this.f50878c;
        switch (i10) {
            case 0:
                int i11 = e.f50880m;
                e0.checkNotNullParameter(this$0, "this$0");
                e0.checkNotNullParameter(placeholderView, "$placeholderView");
                this$0.removeView(placeholderView);
                break;
            default:
                int i12 = e.f50880m;
                e0.checkNotNullParameter(placeholderView, "$placeholderView");
                e0.checkNotNullParameter(this$0, "this$0");
                if (placeholderView.getParent() != this$0) {
                    h0.removeFromParent(placeholderView);
                    this$0.addView(placeholderView, t.createMatchParentParams());
                    placeholderView.bringToFront();
                    placeholderView.h();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d(o oVar, e eVar) {
        this.f50878c = oVar;
        this.f50879e = eVar;
    }
}
