package rc;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class l0 extends m0 {

    /* renamed from: g, reason: collision with root package name */
    public final Set f84222g;

    public l0(lc.z zVar, e eVar) {
        super(zVar, null, "get", "is", null);
        String[] recordFieldNames = sc.b.getRecordFieldNames(eVar.getRawType());
        this.f84222g = recordFieldNames == null ? Collections.EMPTY_SET : new HashSet(Arrays.asList(recordFieldNames));
    }

    @Override // rc.m0, rc.a
    public String findNameForRegularGetter(m mVar, String str) {
        return this.f84222g.contains(str) ? str : super.findNameForRegularGetter(mVar, str);
    }
}
