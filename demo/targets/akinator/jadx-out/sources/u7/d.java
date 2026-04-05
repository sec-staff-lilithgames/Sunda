package u7;

import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final List f87975a;

    /* renamed from: c, reason: collision with root package name */
    public f8.a f87977c = null;

    /* renamed from: d, reason: collision with root package name */
    public float f87978d = -1.0f;

    /* renamed from: b, reason: collision with root package name */
    public f8.a f87976b = a(0.0f);

    public d(List list) {
        this.f87975a = list;
    }

    public final f8.a a(float f10) {
        List list = this.f87975a;
        f8.a aVar = (f8.a) o2.g(1, list);
        if (f10 >= aVar.getStartProgress()) {
            return aVar;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            f8.a aVar2 = (f8.a) list.get(size);
            if (this.f87976b != aVar2 && aVar2.containsProgress(f10)) {
                return aVar2;
            }
        }
        return (f8.a) list.get(0);
    }

    @Override // u7.c
    public f8.a getCurrentKeyframe() {
        return this.f87976b;
    }

    @Override // u7.c
    public float getEndProgress() {
        return ((f8.a) o2.g(1, this.f87975a)).getEndProgress();
    }

    @Override // u7.c
    public float getStartDelayProgress() {
        return ((f8.a) this.f87975a.get(0)).getStartProgress();
    }

    @Override // u7.c
    public boolean isCachedValueEnabled(float f10) {
        f8.a aVar = this.f87977c;
        f8.a aVar2 = this.f87976b;
        if (aVar == aVar2 && this.f87978d == f10) {
            return true;
        }
        this.f87977c = aVar2;
        this.f87978d = f10;
        return false;
    }

    @Override // u7.c
    public boolean isEmpty() {
        return false;
    }

    @Override // u7.c
    public boolean isValueChanged(float f10) {
        if (this.f87976b.containsProgress(f10)) {
            return !this.f87976b.isStatic();
        }
        this.f87976b = a(f10);
        return true;
    }
}
