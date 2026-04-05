package j7;

import android.graphics.Bitmap;
import j1.o2;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f69158a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f69159b;

    public e(Bitmap bitmap, Map<String, ? extends Object> map) {
        this.f69158a = bitmap;
        this.f69159b = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e copy$default(e eVar, Bitmap bitmap, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bitmap = eVar.f69158a;
        }
        if ((i10 & 2) != 0) {
            map = eVar.f69159b;
        }
        return eVar.copy(bitmap, map);
    }

    public final e copy(Bitmap bitmap, Map<String, ? extends Object> map) {
        return new e(bitmap, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return e0.areEqual(this.f69158a, eVar.f69158a) && e0.areEqual(this.f69159b, eVar.f69159b);
    }

    public final Bitmap getBitmap() {
        return this.f69158a;
    }

    public final Map<String, Object> getExtras() {
        return this.f69159b;
    }

    public int hashCode() {
        return this.f69159b.hashCode() + (this.f69158a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Value(bitmap=");
        sb2.append(this.f69158a);
        sb2.append(", extras=");
        return o2.q(sb2, this.f69159b, ')');
    }

    public /* synthetic */ e(Bitmap bitmap, Map map, int i10, u uVar) {
        this(bitmap, (i10 & 2) != 0 ? p1.emptyMap() : map);
    }
}
