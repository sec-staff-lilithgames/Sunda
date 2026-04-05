package v6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f89110a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f89111b;

    public e(String key, Long l9) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        this.f89110a = key;
        this.f89111b = l9;
    }

    public static /* synthetic */ e copy$default(e eVar, String str, Long l9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eVar.f89110a;
        }
        if ((i10 & 2) != 0) {
            l9 = eVar.f89111b;
        }
        return eVar.copy(str, l9);
    }

    public final String component1() {
        return this.f89110a;
    }

    public final Long component2() {
        return this.f89111b;
    }

    public final e copy(String key, Long l9) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return new e(key, l9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f89110a, eVar.f89110a) && kotlin.jvm.internal.e0.areEqual(this.f89111b, eVar.f89111b);
    }

    public final String getKey() {
        return this.f89110a;
    }

    public final Long getValue() {
        return this.f89111b;
    }

    public int hashCode() {
        int iHashCode = this.f89110a.hashCode() * 31;
        Long l9 = this.f89111b;
        return iHashCode + (l9 == null ? 0 : l9.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.f89110a + ", value=" + this.f89111b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(String key, boolean z10) {
        this(key, Long.valueOf(z10 ? 1L : 0L));
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
    }
}
