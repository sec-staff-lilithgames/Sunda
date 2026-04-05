package u7;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final f8.a f87979a;

    /* renamed from: b, reason: collision with root package name */
    public float f87980b = -1.0f;

    public e(List list) {
        this.f87979a = (f8.a) list.get(0);
    }

    @Override // u7.c
    public f8.a getCurrentKeyframe() {
        return this.f87979a;
    }

    @Override // u7.c
    public float getEndProgress() {
        return this.f87979a.getEndProgress();
    }

    @Override // u7.c
    public float getStartDelayProgress() {
        return this.f87979a.getStartProgress();
    }

    @Override // u7.c
    public boolean isCachedValueEnabled(float f10) {
        if (this.f87980b == f10) {
            return true;
        }
        this.f87980b = f10;
        return false;
    }

    @Override // u7.c
    public boolean isEmpty() {
        return false;
    }

    @Override // u7.c
    public boolean isValueChanged(float f10) {
        return !this.f87979a.isStatic();
    }
}
