package rj;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public x f84490a;

    /* renamed from: b, reason: collision with root package name */
    public x f84491b;

    /* renamed from: c, reason: collision with root package name */
    public l f84492c;

    /* renamed from: d, reason: collision with root package name */
    public b f84493d;

    /* renamed from: e, reason: collision with root package name */
    public String f84494e;

    public q build(i iVar, Map<String, String> map) {
        if (this.f84490a == null) {
            throw new IllegalArgumentException("Modal model must have a title");
        }
        b bVar = this.f84493d;
        if (bVar != null && bVar.getButton() == null) {
            throw new IllegalArgumentException("Modal model action must be null or have a button");
        }
        if (TextUtils.isEmpty(this.f84494e)) {
            throw new IllegalArgumentException("Modal model must have a background color");
        }
        return new q(iVar, this.f84490a, this.f84491b, this.f84492c, this.f84493d, this.f84494e, map);
    }

    public p setAction(b bVar) {
        this.f84493d = bVar;
        return this;
    }

    public p setBackgroundHexColor(String str) {
        this.f84494e = str;
        return this;
    }

    public p setBody(x xVar) {
        this.f84491b = xVar;
        return this;
    }

    public p setImageData(l lVar) {
        this.f84492c = lVar;
        return this;
    }

    public p setTitle(x xVar) {
        this.f84490a = xVar;
        return this;
    }
}
