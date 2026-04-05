package rj;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public l f84459a;

    /* renamed from: b, reason: collision with root package name */
    public l f84460b;

    /* renamed from: c, reason: collision with root package name */
    public String f84461c;

    /* renamed from: d, reason: collision with root package name */
    public b f84462d;

    /* renamed from: e, reason: collision with root package name */
    public x f84463e;

    /* renamed from: f, reason: collision with root package name */
    public x f84464f;

    /* renamed from: g, reason: collision with root package name */
    public b f84465g;

    public k build(i iVar, Map<String, String> map) {
        b bVar = this.f84462d;
        if (bVar == null) {
            throw new IllegalArgumentException("Card model must have a primary action");
        }
        if (bVar.getButton() == null) {
            throw new IllegalArgumentException("Card model must have a primary action button");
        }
        b bVar2 = this.f84465g;
        if (bVar2 != null && bVar2.getButton() == null) {
            throw new IllegalArgumentException("Card model secondary action must be null or have a button");
        }
        if (this.f84463e == null) {
            throw new IllegalArgumentException("Card model must have a title");
        }
        if (this.f84459a == null && this.f84460b == null) {
            throw new IllegalArgumentException("Card model must have at least one image");
        }
        if (TextUtils.isEmpty(this.f84461c)) {
            throw new IllegalArgumentException("Card model must have a background color");
        }
        return new k(iVar, this.f84463e, this.f84464f, this.f84459a, this.f84460b, this.f84461c, this.f84462d, this.f84465g, map);
    }

    public j setBackgroundHexColor(String str) {
        this.f84461c = str;
        return this;
    }

    public j setBody(x xVar) {
        this.f84464f = xVar;
        return this;
    }

    public j setLandscapeImageData(l lVar) {
        this.f84460b = lVar;
        return this;
    }

    public j setPortraitImageData(l lVar) {
        this.f84459a = lVar;
        return this;
    }

    public j setPrimaryAction(b bVar) {
        this.f84462d = bVar;
        return this;
    }

    public j setSecondaryAction(b bVar) {
        this.f84465g = bVar;
        return this;
    }

    public j setTitle(x xVar) {
        this.f84463e = xVar;
        return this;
    }
}
