package rj;

import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class f extends o {

    /* renamed from: j, reason: collision with root package name */
    public final x f84447j;

    /* renamed from: k, reason: collision with root package name */
    public final x f84448k;

    /* renamed from: l, reason: collision with root package name */
    public final l f84449l;

    /* renamed from: m, reason: collision with root package name */
    public final b f84450m;

    /* renamed from: n, reason: collision with root package name */
    public final String f84451n;

    public f(i iVar, x xVar, x xVar2, l lVar, b bVar, String str, Map map) {
        super(iVar, MessageType.BANNER, map);
        this.f84447j = xVar;
        this.f84448k = xVar2;
        this.f84449l = lVar;
        this.f84450m = bVar;
        this.f84451n = str;
    }

    public static e builder() {
        return new e();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        b bVar = fVar.f84450m;
        l lVar = fVar.f84449l;
        x xVar = fVar.f84448k;
        if (hashCode() != fVar.hashCode()) {
            return false;
        }
        x xVar2 = this.f84448k;
        if ((xVar2 == null && xVar != null) || (xVar2 != null && !xVar2.equals(xVar))) {
            return false;
        }
        l lVar2 = this.f84449l;
        if ((lVar2 == null && lVar != null) || (lVar2 != null && !lVar2.equals(lVar))) {
            return false;
        }
        b bVar2 = this.f84450m;
        return (bVar2 != null || bVar == null) && (bVar2 == null || bVar2.equals(bVar)) && this.f84447j.equals(fVar.f84447j) && this.f84451n.equals(fVar.f84451n);
    }

    @Override // rj.o
    public b getAction() {
        return this.f84450m;
    }

    @Override // rj.o
    public String getBackgroundHexColor() {
        return this.f84451n;
    }

    @Override // rj.o
    public x getBody() {
        return this.f84448k;
    }

    @Override // rj.o
    public l getImageData() {
        return this.f84449l;
    }

    @Override // rj.o
    public x getTitle() {
        return this.f84447j;
    }

    public int hashCode() {
        x xVar = this.f84448k;
        int iHashCode = xVar != null ? xVar.hashCode() : 0;
        l lVar = this.f84449l;
        int iHashCode2 = lVar != null ? lVar.hashCode() : 0;
        b bVar = this.f84450m;
        return this.f84451n.hashCode() + this.f84447j.hashCode() + iHashCode + iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
