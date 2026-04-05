package rj;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public x f84442a;

    /* renamed from: b, reason: collision with root package name */
    public x f84443b;

    /* renamed from: c, reason: collision with root package name */
    public l f84444c;

    /* renamed from: d, reason: collision with root package name */
    public b f84445d;

    /* renamed from: e, reason: collision with root package name */
    public String f84446e;

    public f build(i iVar, Map<String, String> map) {
        if (this.f84442a == null) {
            throw new IllegalArgumentException("Banner model must have a title");
        }
        if (TextUtils.isEmpty(this.f84446e)) {
            throw new IllegalArgumentException("Banner model must have a background color");
        }
        return new f(iVar, this.f84442a, this.f84443b, this.f84444c, this.f84445d, this.f84446e, map);
    }

    public e setAction(b bVar) {
        this.f84445d = bVar;
        return this;
    }

    public e setBackgroundHexColor(String str) {
        this.f84446e = str;
        return this;
    }

    public e setBody(x xVar) {
        this.f84443b = xVar;
        return this;
    }

    public e setImageData(l lVar) {
        this.f84444c = lVar;
        return this;
    }

    public e setTitle(x xVar) {
        this.f84442a = xVar;
        return this;
    }
}
