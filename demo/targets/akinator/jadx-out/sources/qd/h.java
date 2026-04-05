package qd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public String f82768a = "";

    /* renamed from: b, reason: collision with root package name */
    public List f82769b = new ArrayList();

    public h addLogEventDropped(g gVar) {
        this.f82769b.add(gVar);
        return this;
    }

    public i build() {
        return new i(this.f82768a, Collections.unmodifiableList(this.f82769b));
    }

    public h setLogEventDroppedList(List<g> list) {
        this.f82769b = list;
        return this;
    }

    public h setLogSource(String str) {
        this.f82768a = str;
        return this;
    }
}
