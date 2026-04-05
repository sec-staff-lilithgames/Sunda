package r4;

import android.util.FloatProperty;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FloatProperty f83782a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(String str, FloatProperty floatProperty) {
        super(str);
        this.f83782a = floatProperty;
    }

    @Override // r4.a0
    public float getValue(Object obj) {
        return ((Float) this.f83782a.get(obj)).floatValue();
    }

    @Override // r4.a0
    public void setValue(Object obj, float f10) {
        this.f83782a.setValue(obj, f10);
    }
}
