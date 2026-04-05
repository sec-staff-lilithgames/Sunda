package io.odeeo.internal.m1;

import io.odeeo.internal.v1.m;
import java.io.Serializable;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final C0620a f64689d = new C0620a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f64690a;

    /* renamed from: b, reason: collision with root package name */
    public final String f64691b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f64692c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.m1.a$a, reason: collision with other inner class name */
    public static final class C0620a {
        public C0620a() {
        }

        public final a generateFreshAdvertisingId() {
            return new a("00000000-0000-0000-0000-000000000000", generateIdString(), false);
        }

        public final String generateIdString() {
            return i.c("randomUUID().toString()");
        }

        public /* synthetic */ C0620a(u uVar) {
            this();
        }
    }

    public a(String ifaId, String odeeoId, boolean z10) {
        e0.checkNotNullParameter(ifaId, "ifaId");
        e0.checkNotNullParameter(odeeoId, "odeeoId");
        m mVar = m.f67284a;
        mVar.checkNotNull(ifaId);
        mVar.checkNotNull(odeeoId);
        this.f64690a = ifaId;
        this.f64691b = odeeoId;
        this.f64692c = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f64692c != aVar.f64692c) {
            return false;
        }
        return e0.areEqual(this.f64690a, aVar.f64690a);
    }

    public final String getAdvertiserIdentifier() {
        return this.f64690a;
    }

    public final String getOdeeoSDKIdentifier() {
        return this.f64691b;
    }

    public int hashCode() {
        return o2.e(this.f64690a.hashCode() * 31, 31, this.f64691b) + (this.f64692c ? 1 : 0);
    }

    public final boolean isDoNotTrack() {
        return this.f64692c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertisingId{, mAdvertisingId='");
        sb2.append(this.f64690a);
        sb2.append("', mOdeeoSDKId='");
        sb2.append(this.f64691b);
        sb2.append("', mDoNotTrack=");
        return a.b.p(sb2, this.f64692c, AbstractJsonLexerKt.END_OBJ);
    }
}
