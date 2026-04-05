package rj;

import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class k extends o {

    /* renamed from: j, reason: collision with root package name */
    public final x f84466j;

    /* renamed from: k, reason: collision with root package name */
    public final x f84467k;

    /* renamed from: l, reason: collision with root package name */
    public final String f84468l;

    /* renamed from: m, reason: collision with root package name */
    public final b f84469m;

    /* renamed from: n, reason: collision with root package name */
    public final b f84470n;

    /* renamed from: o, reason: collision with root package name */
    public final l f84471o;

    /* renamed from: p, reason: collision with root package name */
    public final l f84472p;

    public k(i iVar, x xVar, x xVar2, l lVar, l lVar2, String str, b bVar, b bVar2, Map map) {
        super(iVar, MessageType.CARD, map);
        this.f84466j = xVar;
        this.f84467k = xVar2;
        this.f84471o = lVar;
        this.f84472p = lVar2;
        this.f84468l = str;
        this.f84469m = bVar;
        this.f84470n = bVar2;
    }

    public static j builder() {
        return new j();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        l lVar = kVar.f84472p;
        l lVar2 = kVar.f84471o;
        b bVar = kVar.f84470n;
        x xVar = kVar.f84467k;
        if (hashCode() != kVar.hashCode()) {
            return false;
        }
        x xVar2 = this.f84467k;
        if ((xVar2 == null && xVar != null) || (xVar2 != null && !xVar2.equals(xVar))) {
            return false;
        }
        b bVar2 = this.f84470n;
        if ((bVar2 == null && bVar != null) || (bVar2 != null && !bVar2.equals(bVar))) {
            return false;
        }
        l lVar3 = this.f84471o;
        if ((lVar3 == null && lVar2 != null) || (lVar3 != null && !lVar3.equals(lVar2))) {
            return false;
        }
        l lVar4 = this.f84472p;
        return (lVar4 != null || lVar == null) && (lVar4 == null || lVar4.equals(lVar)) && this.f84466j.equals(kVar.f84466j) && this.f84469m.equals(kVar.f84469m) && this.f84468l.equals(kVar.f84468l);
    }

    @Override // rj.o
    @Deprecated
    public b getAction() {
        return this.f84469m;
    }

    @Override // rj.o
    public String getBackgroundHexColor() {
        return this.f84468l;
    }

    @Override // rj.o
    public x getBody() {
        return this.f84467k;
    }

    @Override // rj.o
    @Deprecated
    public l getImageData() {
        return this.f84471o;
    }

    public l getLandscapeImageData() {
        return this.f84472p;
    }

    public l getPortraitImageData() {
        return this.f84471o;
    }

    public b getPrimaryAction() {
        return this.f84469m;
    }

    public b getSecondaryAction() {
        return this.f84470n;
    }

    @Override // rj.o
    public x getTitle() {
        return this.f84466j;
    }

    public int hashCode() {
        x xVar = this.f84467k;
        int iHashCode = xVar != null ? xVar.hashCode() : 0;
        b bVar = this.f84470n;
        int iHashCode2 = bVar != null ? bVar.hashCode() : 0;
        l lVar = this.f84471o;
        int iHashCode3 = lVar != null ? lVar.hashCode() : 0;
        l lVar2 = this.f84472p;
        return this.f84469m.hashCode() + this.f84468l.hashCode() + this.f84466j.hashCode() + iHashCode + iHashCode2 + iHashCode3 + (lVar2 != null ? lVar2.hashCode() : 0);
    }
}
