package n3;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final List f75584a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75585b;

    /* renamed from: c, reason: collision with root package name */
    public final int f75586c;

    /* renamed from: d, reason: collision with root package name */
    public final String f75587d;

    public h(List<u3.g> list, int i10, int i11, String str) {
        this.f75584a = list;
        this.f75586c = i10;
        this.f75585b = i11;
        this.f75587d = str;
    }

    public u3.g getFallbackRequest() {
        List list = this.f75584a;
        if (list.size() < 2) {
            return null;
        }
        return (u3.g) list.get(1);
    }

    public int getFetchStrategy() {
        return this.f75586c;
    }

    public u3.g getRequest() {
        return (u3.g) this.f75584a.get(0);
    }

    public List<u3.g> getRequests() {
        return this.f75584a;
    }

    public String getSystemFontFamilyName() {
        return this.f75587d;
    }

    public int getTimeout() {
        return this.f75585b;
    }

    public h(u3.g gVar, int i10, int i11) {
        this(Collections.singletonList(gVar), i10, i11, null);
    }
}
