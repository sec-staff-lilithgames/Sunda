package k6;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public List f70599a;

    /* renamed from: b, reason: collision with root package name */
    public String f70600b;

    /* renamed from: c, reason: collision with root package name */
    public String f70601c;

    /* renamed from: d, reason: collision with root package name */
    public String f70602d;

    /* renamed from: e, reason: collision with root package name */
    public String f70603e;

    /* renamed from: f, reason: collision with root package name */
    public String f70604f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f70605g;

    /* renamed from: h, reason: collision with root package name */
    public int f70606h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f70607i;

    public j() {
        this.f70599a = new ArrayList();
        this.f70605g = true;
        this.f70606h = 0;
        this.f70607i = false;
    }

    public k build() {
        return new k(this.f70599a, this.f70600b, this.f70601c, this.f70602d, this.f70603e, this.f70604f, this.f70605g, this.f70606h, this.f70607i);
    }

    public j setArchitecture(String str) {
        this.f70603e = str;
        return this;
    }

    public j setBitness(int i10) {
        this.f70606h = i10;
        return this;
    }

    public j setBrandVersionList(List<i> list) {
        this.f70599a = list;
        return this;
    }

    public j setFullVersion(String str) {
        if (str == null) {
            this.f70600b = null;
            return this;
        }
        if (str.trim().isEmpty()) {
            throw new IllegalArgumentException("Full version should not be blank.");
        }
        this.f70600b = str;
        return this;
    }

    public j setMobile(boolean z10) {
        this.f70605g = z10;
        return this;
    }

    public j setModel(String str) {
        this.f70604f = str;
        return this;
    }

    public j setPlatform(String str) {
        if (str == null) {
            this.f70601c = null;
            return this;
        }
        if (str.trim().isEmpty()) {
            throw new IllegalArgumentException("Platform should not be blank.");
        }
        this.f70601c = str;
        return this;
    }

    public j setPlatformVersion(String str) {
        this.f70602d = str;
        return this;
    }

    public j setWow64(boolean z10) {
        this.f70607i = z10;
        return this;
    }

    public j(k kVar) {
        this.f70599a = new ArrayList();
        this.f70605g = true;
        this.f70606h = 0;
        this.f70607i = false;
        this.f70599a = kVar.getBrandVersionList();
        this.f70600b = kVar.getFullVersion();
        this.f70601c = kVar.getPlatform();
        this.f70602d = kVar.getPlatformVersion();
        this.f70603e = kVar.getArchitecture();
        this.f70604f = kVar.getModel();
        this.f70605g = kVar.isMobile();
        this.f70606h = kVar.getBitness();
        this.f70607i = kVar.isWow64();
    }
}
