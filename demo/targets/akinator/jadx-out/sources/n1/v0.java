package n1;

import androidx.core.app.NotificationCompat;
import b0.e2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import j1.o2;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v0 extends x0 implements Iterable, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final String f75520b;

    /* renamed from: c, reason: collision with root package name */
    public final float f75521c;

    /* renamed from: e, reason: collision with root package name */
    public final float f75522e;

    /* renamed from: f, reason: collision with root package name */
    public final float f75523f;

    /* renamed from: g, reason: collision with root package name */
    public final float f75524g;

    /* renamed from: h, reason: collision with root package name */
    public final float f75525h;

    /* renamed from: i, reason: collision with root package name */
    public final float f75526i;

    /* renamed from: j, reason: collision with root package name */
    public final float f75527j;

    /* renamed from: k, reason: collision with root package name */
    public final List f75528k;

    /* renamed from: l, reason: collision with root package name */
    public final List f75529l;

    public v0() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof v0)) {
            v0 v0Var = (v0) obj;
            return kotlin.jvm.internal.e0.areEqual(this.f75520b, v0Var.f75520b) && this.f75521c == v0Var.f75521c && this.f75522e == v0Var.f75522e && this.f75523f == v0Var.f75523f && this.f75524g == v0Var.f75524g && this.f75525h == v0Var.f75525h && this.f75526i == v0Var.f75526i && this.f75527j == v0Var.f75527j && kotlin.jvm.internal.e0.areEqual(this.f75528k, v0Var.f75528k) && kotlin.jvm.internal.e0.areEqual(this.f75529l, v0Var.f75529l);
        }
        return false;
    }

    public final x0 get(int i10) {
        return (x0) this.f75529l.get(i10);
    }

    public final List<g> getClipPathData() {
        return this.f75528k;
    }

    public final String getName() {
        return this.f75520b;
    }

    public final float getPivotX() {
        return this.f75522e;
    }

    public final float getPivotY() {
        return this.f75523f;
    }

    public final float getRotation() {
        return this.f75521c;
    }

    public final float getScaleX() {
        return this.f75524g;
    }

    public final float getScaleY() {
        return this.f75525h;
    }

    public final int getSize() {
        return this.f75529l.size();
    }

    public final float getTranslationX() {
        return this.f75526i;
    }

    public final float getTranslationY() {
        return this.f75527j;
    }

    public int hashCode() {
        return this.f75529l.hashCode() + o2.c(e2.b(this.f75527j, e2.b(this.f75526i, e2.b(this.f75525h, e2.b(this.f75524g, e2.b(this.f75523f, e2.b(this.f75522e, e2.b(this.f75521c, this.f75520b.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.f75528k);
    }

    @Override // java.lang.Iterable
    public Iterator<x0> iterator() {
        return new u0(this);
    }

    public /* synthetic */ v0(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) != 0 ? 1.0f : f14, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) != 0 ? 0.0f : f16, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? w0.getEmptyPath() : list, (i10 & 512) != 0 ? uu.p0.emptyList() : list2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(String name, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends g> clipPathData, List<? extends x0> children) {
        super(null);
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(clipPathData, "clipPathData");
        kotlin.jvm.internal.e0.checkNotNullParameter(children, "children");
        this.f75520b = name;
        this.f75521c = f10;
        this.f75522e = f11;
        this.f75523f = f12;
        this.f75524g = f13;
        this.f75525h = f14;
        this.f75526i = f15;
        this.f75527j = f16;
        this.f75528k = clipPathData;
        this.f75529l = children;
    }
}
