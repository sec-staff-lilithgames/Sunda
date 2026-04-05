package n4;

import androidx.datastore.preferences.protobuf.e1;
import androidx.datastore.preferences.protobuf.x;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k extends e1 implements m {
    public k addAllStrings(Iterable<String> iterable) {
        c();
        l.u((l) this.f5861c, iterable);
        return this;
    }

    public k addStrings(String str) {
        c();
        l.t((l) this.f5861c, str);
        return this;
    }

    public k addStringsBytes(x xVar) {
        c();
        l.w((l) this.f5861c, xVar);
        return this;
    }

    public k clearStrings() {
        c();
        l.v((l) this.f5861c);
        return this;
    }

    @Override // n4.m
    public String getStrings(int i10) {
        return ((l) this.f5861c).getStrings(i10);
    }

    @Override // n4.m
    public x getStringsBytes(int i10) {
        return ((l) this.f5861c).getStringsBytes(i10);
    }

    @Override // n4.m
    public int getStringsCount() {
        return ((l) this.f5861c).getStringsCount();
    }

    @Override // n4.m
    public List<String> getStringsList() {
        return Collections.unmodifiableList(((l) this.f5861c).getStringsList());
    }

    public k setStrings(int i10, String str) {
        c();
        l.s((l) this.f5861c, i10, str);
        return this;
    }
}
