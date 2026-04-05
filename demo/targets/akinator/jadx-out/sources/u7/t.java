package u7;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class t extends f {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f88016i;

    /* renamed from: j, reason: collision with root package name */
    public final PointF f88017j;

    /* renamed from: k, reason: collision with root package name */
    public final f f88018k;

    /* renamed from: l, reason: collision with root package name */
    public final f f88019l;

    /* renamed from: m, reason: collision with root package name */
    public f8.c f88020m;

    /* renamed from: n, reason: collision with root package name */
    public f8.c f88021n;

    public t(f fVar, f fVar2) {
        super(Collections.EMPTY_LIST);
        this.f88016i = new PointF();
        this.f88017j = new PointF();
        this.f88018k = fVar;
        this.f88019l = fVar2;
        setProgress(getProgress());
    }

    @Override // u7.f
    public void setProgress(float f10) {
        f fVar = this.f88018k;
        fVar.setProgress(f10);
        f fVar2 = this.f88019l;
        fVar2.setProgress(f10);
        this.f88016i.set(((Float) fVar.getValue()).floatValue(), ((Float) fVar2.getValue()).floatValue());
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f87981a;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i10)).onValueChanged();
            i10++;
        }
    }

    public void setXValueCallback(f8.c cVar) {
        f8.c cVar2 = this.f88020m;
        if (cVar2 != null) {
            cVar2.setAnimation(null);
        }
        this.f88020m = cVar;
        if (cVar != null) {
            cVar.setAnimation(this);
        }
    }

    public void setYValueCallback(f8.c cVar) {
        f8.c cVar2 = this.f88021n;
        if (cVar2 != null) {
            cVar2.setAnimation(null);
        }
        this.f88021n = cVar;
        if (cVar != null) {
            cVar.setAnimation(this);
        }
    }

    @Override // u7.f
    public PointF getValue() {
        return getValue((f8.a) null, 0.0f);
    }

    @Override // u7.f
    public final PointF getValue(f8.a aVar, float f10) {
        Float f11;
        f fVar;
        f8.a aVarA;
        f fVar2;
        f8.a aVarA2;
        Float f12 = null;
        if (this.f88020m == null || (aVarA2 = (fVar2 = this.f88018k).a()) == null) {
            f11 = null;
        } else {
            Float f13 = aVarA2.f55495h;
            f8.c cVar = this.f88020m;
            float f14 = aVarA2.f55494g;
            f11 = (Float) cVar.getValueInternal(f14, f13 == null ? f14 : f13.floatValue(), (Float) aVarA2.f55489b, (Float) aVarA2.f55490c, fVar2.c(), fVar2.d(), fVar2.getProgress());
        }
        if (this.f88021n != null && (aVarA = (fVar = this.f88019l).a()) != null) {
            Float f15 = aVarA.f55495h;
            f8.c cVar2 = this.f88021n;
            float f16 = aVarA.f55494g;
            f12 = (Float) cVar2.getValueInternal(f16, f15 == null ? f16 : f15.floatValue(), (Float) aVarA.f55489b, (Float) aVarA.f55490c, fVar.c(), fVar.d(), fVar.getProgress());
        }
        PointF pointF = this.f88016i;
        PointF pointF2 = this.f88017j;
        if (f11 == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f11.floatValue(), 0.0f);
        }
        if (f12 == null) {
            pointF2.set(pointF2.x, pointF.y);
        } else {
            pointF2.set(pointF2.x, f12.floatValue());
        }
        return pointF2;
    }
}
