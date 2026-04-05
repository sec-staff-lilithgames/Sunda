package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t;
import java.io.File;
import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final t f49934a;

    /* renamed from: b, reason: collision with root package name */
    public final File f49935b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f49936c;

    /* renamed from: d, reason: collision with root package name */
    public final String f49937d;

    /* renamed from: e, reason: collision with root package name */
    public final String f49938e;

    /* renamed from: f, reason: collision with root package name */
    public final i f49939f;

    /* renamed from: g, reason: collision with root package name */
    public final f f49940g;

    public g(t tVar, File localMediaResource, Integer num, String networkMediaResource, String str, i tracking, f fVar) {
        e0.checkNotNullParameter(localMediaResource, "localMediaResource");
        e0.checkNotNullParameter(networkMediaResource, "networkMediaResource");
        e0.checkNotNullParameter(tracking, "tracking");
        this.f49934a = tVar;
        this.f49935b = localMediaResource;
        this.f49936c = num;
        this.f49937d = networkMediaResource;
        this.f49938e = str;
        this.f49939f = tracking;
        this.f49940g = fVar;
    }

    public final t a() {
        return this.f49934a;
    }

    public final File b() {
        return this.f49935b;
    }

    public final Integer c() {
        return this.f49936c;
    }

    public final String d() {
        return this.f49937d;
    }

    public final String e() {
        return this.f49938e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return e0.areEqual(this.f49934a, gVar.f49934a) && e0.areEqual(this.f49935b, gVar.f49935b) && e0.areEqual(this.f49936c, gVar.f49936c) && e0.areEqual(this.f49937d, gVar.f49937d) && e0.areEqual(this.f49938e, gVar.f49938e) && e0.areEqual(this.f49939f, gVar.f49939f) && e0.areEqual(this.f49940g, gVar.f49940g);
    }

    public final i f() {
        return this.f49939f;
    }

    public final f g() {
        return this.f49940g;
    }

    public final String h() {
        return this.f49938e;
    }

    public int hashCode() {
        t tVar = this.f49934a;
        int iHashCode = (this.f49935b.hashCode() + ((tVar == null ? 0 : tVar.hashCode()) * 31)) * 31;
        Integer num = this.f49936c;
        int iE = o2.e((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f49937d);
        String str = this.f49938e;
        int iHashCode2 = (this.f49939f.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        f fVar = this.f49940g;
        return iHashCode2 + (fVar != null ? fVar.hashCode() : 0);
    }

    public final f i() {
        return this.f49940g;
    }

    public final File j() {
        return this.f49935b;
    }

    public final Integer k() {
        return this.f49936c;
    }

    public final String l() {
        return this.f49937d;
    }

    public final t m() {
        return this.f49934a;
    }

    public final i n() {
        return this.f49939f;
    }

    public String toString() {
        return "Linear(skipOffset=" + this.f49934a + ", localMediaResource=" + this.f49935b + ", localMediaResourceBitrate=" + this.f49936c + ", networkMediaResource=" + this.f49937d + ", clickThroughUrl=" + this.f49938e + ", tracking=" + this.f49939f + ", icon=" + this.f49940g + ')';
    }

    public final g a(t tVar, File localMediaResource, Integer num, String networkMediaResource, String str, i tracking, f fVar) {
        e0.checkNotNullParameter(localMediaResource, "localMediaResource");
        e0.checkNotNullParameter(networkMediaResource, "networkMediaResource");
        e0.checkNotNullParameter(tracking, "tracking");
        return new g(tVar, localMediaResource, num, networkMediaResource, str, tracking, fVar);
    }

    public static /* synthetic */ g a(g gVar, t tVar, File file, Integer num, String str, String str2, i iVar, f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            tVar = gVar.f49934a;
        }
        if ((i10 & 2) != 0) {
            file = gVar.f49935b;
        }
        if ((i10 & 4) != 0) {
            num = gVar.f49936c;
        }
        if ((i10 & 8) != 0) {
            str = gVar.f49937d;
        }
        if ((i10 & 16) != 0) {
            str2 = gVar.f49938e;
        }
        if ((i10 & 32) != 0) {
            iVar = gVar.f49939f;
        }
        if ((i10 & 64) != 0) {
            fVar = gVar.f49940g;
        }
        i iVar2 = iVar;
        f fVar2 = fVar;
        String str3 = str2;
        Integer num2 = num;
        return gVar.a(tVar, file, num2, str, str3, iVar2, fVar2);
    }
}
