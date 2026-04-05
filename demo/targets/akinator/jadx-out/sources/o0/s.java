package o0;

import android.content.Context;
import android.view.ViewGroup;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;
import uu.p0;
import uu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final int f77370b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f77371c;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f77372e;

    /* renamed from: f, reason: collision with root package name */
    public final t f77373f;

    /* renamed from: g, reason: collision with root package name */
    public int f77374g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f77370b = 5;
        ArrayList arrayList = new ArrayList();
        this.f77371c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f77372e = arrayList2;
        this.f77373f = new t();
        setClipChildren(false);
        u uVar = new u(context);
        addView(uVar);
        arrayList.add(uVar);
        arrayList2.add(uVar);
        this.f77374g = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void disposeRippleIfNeeded(b bVar) throws InterruptedException {
        kotlin.jvm.internal.e0.checkNotNullParameter(bVar, "<this>");
        bVar.resetHostView();
        t tVar = this.f77373f;
        u uVar = tVar.get(bVar);
        if (uVar != null) {
            uVar.disposeRipple();
            tVar.remove(bVar);
            this.f77372e.add(uVar);
        }
    }

    public final u getRippleHostView(b bVar) throws InterruptedException {
        kotlin.jvm.internal.e0.checkNotNullParameter(bVar, "<this>");
        t tVar = this.f77373f;
        u uVar = tVar.get(bVar);
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = (u) v0.removeFirstOrNull(this.f77372e);
        if (uVar2 == null) {
            int i10 = this.f77374g;
            ArrayList arrayList = this.f77371c;
            if (i10 > p0.getLastIndex(arrayList)) {
                Context context = getContext();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "context");
                uVar2 = new u(context);
                addView(uVar2);
                arrayList.add(uVar2);
            } else {
                uVar2 = (u) arrayList.get(this.f77374g);
                b bVar2 = tVar.get(uVar2);
                if (bVar2 != null) {
                    bVar2.resetHostView();
                    tVar.remove(bVar2);
                    uVar2.disposeRipple();
                }
            }
            int i11 = this.f77374g;
            if (i11 < this.f77370b - 1) {
                this.f77374g = i11 + 1;
            } else {
                this.f77374g = 0;
            }
        }
        tVar.set(bVar, uVar2);
        return uVar2;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
