package qd;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final i f82770c = new h().build();

    /* renamed from: a, reason: collision with root package name */
    public final String f82771a;

    /* renamed from: b, reason: collision with root package name */
    public final List f82772b;

    public i(String str, List list) {
        this.f82771a = str;
        this.f82772b = list;
    }

    public static i getDefaultInstance() {
        return f82770c;
    }

    public static h newBuilder() {
        return new h();
    }

    public List<g> getLogEventDroppedList() {
        return this.f82772b;
    }

    public String getLogSource() {
        return this.f82771a;
    }
}
