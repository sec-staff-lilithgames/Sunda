package qn;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f83340a;

    /* renamed from: b, reason: collision with root package name */
    public final long f83341b;

    /* renamed from: c, reason: collision with root package name */
    public final List f83342c;

    /* renamed from: d, reason: collision with root package name */
    public final List f83343d;

    public g(String str, long j10, List<a> list) {
        this(str, j10, list, Collections.EMPTY_LIST, null);
    }

    public int getAdaptationSetIndex(int i10) {
        List list = this.f83342c;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((a) list.get(i11)).f83296b == i10) {
                return i11;
            }
        }
        return -1;
    }

    public g(String str, long j10, List<a> list, List<f> list2) {
        this(str, j10, list, list2, null);
    }

    public g(String str, long j10, List<a> list, List<f> list2, e eVar) {
        this.f83340a = str;
        this.f83341b = j10;
        this.f83342c = Collections.unmodifiableList(list);
        this.f83343d = Collections.unmodifiableList(list2);
    }
}
