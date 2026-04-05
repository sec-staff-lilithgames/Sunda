package rj;

import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class q extends o {

    /* renamed from: j, reason: collision with root package name */
    public final x f84495j;

    /* renamed from: k, reason: collision with root package name */
    public final x f84496k;

    /* renamed from: l, reason: collision with root package name */
    public final l f84497l;

    /* renamed from: m, reason: collision with root package name */
    public final b f84498m;

    /* renamed from: n, reason: collision with root package name */
    public final String f84499n;

    public q(i iVar, x xVar, x xVar2, l lVar, b bVar, String str, Map map) {
        super(iVar, MessageType.MODAL, map);
        this.f84495j = xVar;
        this.f84496k = xVar2;
        this.f84497l = lVar;
        this.f84498m = bVar;
        this.f84499n = str;
    }

    public static p builder() {
        return new p();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        l lVar = qVar.f84497l;
        b bVar = qVar.f84498m;
        x xVar = qVar.f84496k;
        if (hashCode() != qVar.hashCode()) {
            return false;
        }
        x xVar2 = this.f84496k;
        if ((xVar2 == null && xVar != null) || (xVar2 != null && !xVar2.equals(xVar))) {
            return false;
        }
        b bVar2 = this.f84498m;
        if ((bVar2 == null && bVar != null) || (bVar2 != null && !bVar2.equals(bVar))) {
            return false;
        }
        l lVar2 = this.f84497l;
        return (lVar2 != null || lVar == null) && (lVar2 == null || lVar2.equals(lVar)) && this.f84495j.equals(qVar.f84495j) && this.f84499n.equals(qVar.f84499n);
    }

    @Override // rj.o
    public b getAction() {
        return this.f84498m;
    }

    @Override // rj.o
    public String getBackgroundHexColor() {
        return this.f84499n;
    }

    @Override // rj.o
    public x getBody() {
        return this.f84496k;
    }

    @Override // rj.o
    public l getImageData() {
        return this.f84497l;
    }

    @Override // rj.o
    public x getTitle() {
        return this.f84495j;
    }

    public int hashCode() {
        x xVar = this.f84496k;
        int iHashCode = xVar != null ? xVar.hashCode() : 0;
        b bVar = this.f84498m;
        int iHashCode2 = bVar != null ? bVar.hashCode() : 0;
        l lVar = this.f84497l;
        return this.f84499n.hashCode() + this.f84495j.hashCode() + iHashCode + iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }
}
