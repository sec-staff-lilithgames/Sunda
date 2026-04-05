package sc;

import dd.i;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lc.z;
import rc.e;
import rc.g;
import sc.b;
import tb.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final e f85584a;

    /* renamed from: b, reason: collision with root package name */
    public final z f85585b;

    /* renamed from: c, reason: collision with root package name */
    public final jc.c f85586c;

    /* renamed from: d, reason: collision with root package name */
    public final List f85587d;

    /* renamed from: e, reason: collision with root package name */
    public final g f85588e;

    /* renamed from: f, reason: collision with root package name */
    public final b.a[] f85589f;

    public a(z zVar, e eVar) throws IllegalArgumentException {
        this.f85584a = eVar;
        this.f85586c = zVar.getAnnotationIntrospector();
        this.f85585b = zVar;
        b.a[] recordFields = c.instance().getRecordFields(eVar.getRawType());
        this.f85589f = recordFields;
        g defaultConstructor = null;
        if (recordFields == null) {
            this.f85587d = eVar.getConstructors();
            this.f85588e = null;
            return;
        }
        int length = recordFields.length;
        if (length != 0) {
            List<g> constructors = eVar.getConstructors();
            this.f85587d = constructors;
            Iterator<g> it = constructors.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g next = it.next();
                if (next.getParameterCount() == length) {
                    for (int i10 = 0; i10 < length; i10++) {
                        if (!next.getRawParameterType(i10).equals(this.f85589f[i10].f85590a)) {
                            break;
                        }
                    }
                    defaultConstructor = next;
                    break loop0;
                }
            }
        } else {
            defaultConstructor = eVar.getDefaultConstructor();
            this.f85587d = Collections.singletonList(defaultConstructor);
        }
        if (defaultConstructor == null) {
            throw new IllegalArgumentException("Failed to find the canonical Record constructor of type " + i.getTypeDescription(this.f85584a.getType()));
        }
        this.f85588e = defaultConstructor;
    }

    public g locate(List<String> list) {
        Iterator it = this.f85587d.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            g gVar = this.f85588e;
            if (!zHasNext) {
                b.a[] aVarArr = this.f85589f;
                if (aVarArr == null) {
                    return null;
                }
                for (b.a aVar : aVarArr) {
                    list.add(aVar.f85591b);
                }
                return gVar;
            }
            g gVar2 = (g) it.next();
            m mVarFindCreatorAnnotation = this.f85586c.findCreatorAnnotation(this.f85585b, gVar2);
            if (mVarFindCreatorAnnotation != null && m.f86751f != mVarFindCreatorAnnotation && (m.f86749c == mVarFindCreatorAnnotation || gVar2 != gVar)) {
                return null;
            }
        }
    }
}
