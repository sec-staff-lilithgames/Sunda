package ta;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final int f86639b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f86640c;

    public d(int i10, ArrayList<e> listFake) {
        e0.checkNotNullParameter(listFake, "listFake");
        this.f86639b = i10;
        this.f86640c = listFake;
    }

    public final ArrayList<e> getListFake() {
        return this.f86640c;
    }

    public final int getLostPoints() {
        return this.f86639b;
    }
}
