package n8;

import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import z.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class v implements q {

    /* renamed from: b, reason: collision with root package name */
    public final j9.c f75856b = new j9.c();

    @Override // n8.q
    public boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.f75856b.equals(((v) obj).f75856b);
        }
        return false;
    }

    public <T> T get(u uVar) {
        j9.c cVar = this.f75856b;
        return cVar.containsKey(uVar) ? (T) cVar.get(uVar) : (T) uVar.getDefaultValue();
    }

    @Override // n8.q
    public int hashCode() {
        return this.f75856b.hashCode();
    }

    public void putAll(v vVar) {
        this.f75856b.putAll((t1) vVar.f75856b);
    }

    public v remove(u uVar) {
        this.f75856b.remove(uVar);
        return this;
    }

    public <T> v set(u uVar, T t10) {
        this.f75856b.put(uVar, t10);
        return this;
    }

    public String toString() {
        return "Options{values=" + this.f75856b + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // n8.q
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        int i10 = 0;
        while (true) {
            j9.c cVar = this.f75856b;
            if (i10 >= cVar.size()) {
                return;
            }
            ((u) cVar.keyAt(i10)).update(cVar.valueAt(i10), messageDigest);
            i10++;
        }
    }
}
