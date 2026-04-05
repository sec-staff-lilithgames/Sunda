package u7;

import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class y extends f {

    /* renamed from: i, reason: collision with root package name */
    public final Object f88051i;

    public y(f8.c cVar) {
        this(cVar, null);
    }

    @Override // u7.f
    public final float b() {
        return 1.0f;
    }

    @Override // u7.f
    public Object getValue() {
        f8.c cVar = this.f87985e;
        float progress = getProgress();
        float progress2 = getProgress();
        float progress3 = getProgress();
        Object obj = this.f88051i;
        return cVar.getValueInternal(0.0f, 0.0f, obj, obj, progress, progress2, progress3);
    }

    @Override // u7.f
    public void notifyListeners() {
        if (this.f87985e != null) {
            super.notifyListeners();
        }
    }

    @Override // u7.f
    public void setProgress(float f10) {
        this.f87984d = f10;
    }

    public y(f8.c cVar, Object obj) {
        super(Collections.EMPTY_LIST);
        setValueCallback(cVar);
        this.f88051i = obj;
    }

    @Override // u7.f
    public final Object getValue(f8.a aVar, float f10) {
        return getValue();
    }
}
